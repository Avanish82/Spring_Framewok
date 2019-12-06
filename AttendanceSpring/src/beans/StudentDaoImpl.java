package beans;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import beans.Student;

@Repository
public class StudentDaoImpl implements StudentDao
{
	private static final JdbcTemplate jdbcTemplate = null;
	private JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
}

	@Override
	public void saveStudent(Student student) {
		{
	        String sql = "insert into Student values(?,?,?,?,?,?,?,?,?)";
	        System.out.println("dao called");
	        jdbcTemplate.update(sql, new Object[]
	        { student.getSid(), student.getSname(), student.getSaddress(), student.getSemail(), student.getSphone(), 
	        		student.getSclass(), student.getSsection(), student.getSgender(), student.getScountry()});
	        }
		
	}

	@Override
	public Student getStudentById(int sid) 
	{
		 String sql = "select * from Student where id=?";
	        Student student = (Student) jdbcTemplate.queryForObject(sql, new Object[]
	        {sid }, new RowMapper<Student>()
	        {
	            @Override
	            public Student mapRow(ResultSet rs, int rowNum) throws SQLException 
	            {
	                Student student = new Student();
	                student.setSid(rs.getInt(1));
	                student.setSname(rs.getString(2));
	                student.setSaddress(rs.getString(3));
	                student.setSemail(rs.getString(4));
	                student.setSphone(rs.getInt(5));
	                student.setSclass(rs.getInt(6));
	                student.setSsection(rs.getString(7));
	                student.setSgender(rs.getString(8));
	                student.setScountry(rs.getString(9));

	                return student;
	            }
	        });
	        return student;
	    }
	
	
	
	
 	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> getAllAlldatafetch() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
