package pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 

@Controller
 
public class StudentController
{
    @Autowired
    private StudentDAO studentDAO;

    @RequestMapping(value = "/student",method=RequestMethod.POST)
    public ModelAndView saveEmployee(@ModelAttribute("student") Student student)
    {
        try
        {
            if(studentDAO.getStudentById(student.getId()) != null);
            studentDAO.updateStudent(student);
        }
        catch(EmptyResultDataAccessException e)
        {
            System.out.println("inside catch");
            studentDAO.saveStudent(student);
        }
        return new ModelAndView("redirect:/students");
    }
    
    @RequestMapping(value = "/edit/{id}")
    public ModelAndView editEmployee(@ModelAttribute("student") Student student,@PathVariable("id") int id)
    {
        ModelAndView model = new ModelAndView("students");
        
        student = studentDAO.getStudentById(id);
        List<Student> studentList = studentDAO.getAllStudent();
        
        model.addObject("student",student);        
        model.addObject("studentList",studentList);
        
        return model;
        
    }
    
    @RequestMapping(value = "/delete/{id}")
    public ModelAndView deleteStudent(@ModelAttribute("student") Student student,@PathVariable("id") int id)
    {
        studentDAO.deleteStudent(id);
        
        return new ModelAndView("redirect:/students");
    }

    @RequestMapping(value = "/students")
    public ModelAndView listStudent(@ModelAttribute("student") Student student)
    {
        ModelAndView model = new ModelAndView("students");

        List<Student> studentList = studentDAO.getAllStudent();
        System.out.println(studentList);
        model.addObject("studentList", studentList);
        
        return model;
    }
}
