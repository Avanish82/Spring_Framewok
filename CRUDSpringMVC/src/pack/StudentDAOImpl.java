package pack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO
{

    private JdbcTemplate jdbcTemplate;
    // JdbcTemplate setter
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Saving a new Student
    public void saveStudent(Student student)
    {
        String sql = "insert into Student values(?,?,?,?,?,?,?,?,?)";
        System.out.println("dao called");
        jdbcTemplate.update(sql, new Object[]
        { student.getId(), student.getName(), student.getAddress(), student.getEmail(), 
        		student.getPhone(), student.getClss(), student.getSection(), 
        		student.getGender(), student.getCountry() });
    }

    // Getting a particular Student
    public Student getStudentById(int id)
    {
        String sql = "select * from Student where id=?";
        Student student = (Student) jdbcTemplate.queryForObject(sql, new Object[]
        { id }, new RowMapper<Student>()
        {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException 
            {
                Student student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setAddress(rs.getString(3));
                student.setEmail(rs.getString(4));
                student.setPhone(rs.getString(5));
                student.setClss(rs.getString(6));
                student.setSection(rs.getString(7));
                student.setGender(rs.getString(8));
                student.setCountry(rs.getString(9));
                return student;
            }
        });
        return student;
    }

    // Getting all the Students
    public List<Student> getAllStudents()
    {
        String sql = "select * from Student";

        List<Student> studentList = jdbcTemplate.query(sql, new ResultSetExtractor<List<Student>>()
        {
            @Override
            public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException
            {
                List<Student> list = new ArrayList<Student>();
                while (rs.next())
                {
                    Student student = new Student();
                    student.setId(rs.getInt(1));
                    student.setName(rs.getString(2));
                    student.setAddress(rs.getString(3));
                    student.setEmail(rs.getString(4));
                    student.setPhone(rs.getString(5));
                    student.setClss(rs.getString(6));
                    student.setSection(rs.getString(7));
                    student.setGender(rs.getString(8));
                    student.setCountry(rs.getString(9));
                    
                    list.add(student);
                }
                return list;
            }

        });
        return studentList;
    }

    // Updating a particular Student
    public void updateStudent(Student student)
    {
        String sql = "update Student set name=?, address=?, email=?, phone=?, clss=?, section=?, gender=?, country=?, where id=?";
        jdbcTemplate.update(sql, new Object[]
        { student.getId(), student.getName(), student.getAddress(), student.getEmail(), student.getPhone(), student.getClss(), student.getSection(), student.getGender(), student.getCountry() });
    }

    // Deletion of a particular Student
    public void deleteStudent(int id)
    {
        String sql = "delete student where id=?";
        jdbcTemplate.update(sql, new Object[]
        { id });
    }

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}
}
