package pack;

import java.util.List;
public interface StudentDAO
{
    public void saveStudent(Student student);
    public Student getStudentById(int id);
    public void updateStudent(Student student);
    public void deleteStudent(int id);
    public List<Student> getAllStudent();
}
