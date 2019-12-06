package beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import beans.Student;

public class StudentController 
{
	@Autowired
	private StudentDao studentDao;
	
	@RequestMapping(value="/student",method=RequestMethod.POST)
    public ModelAndView saveStudent(@ModelAttribute("student")Student student)
    {
        try
        {
            if(studentDao.getStudentById(student.getSid()) != null);
            studentDao.updateStudent(student);
        }
        catch(EmptyResultDataAccessException e)
        {
            System.out.println("inside catch");
            studentDao.saveStudent(student);
        }
        return new ModelAndView("redirect:/insert");
    }
}
