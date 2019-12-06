package beans;

import java.sql.Connection;
import java.util.Date;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class Test 
{
	public static void main(String ak[])
	{
		BasicDataSource bds=new BasicDataSource();
		bds.setDriverClassName("oracle.jdbc.OracleDriver");
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("avanish");
		bds.setPassword("avanish");
		bds.setMaxConnLifetimeMillis(15);
		bds.setMaxIdle(5);
		bds.setMaxWaitMillis(1000*5);
		
		System.out.println("Connection pool");
		Date d1=new Date();
		for(int i=0;i<30;i++)
		{
			try{
				Connection con=bds.getConnection();
				System.out.println(con+","+i);
			     con.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		Date d2=new Date();
		 System.out.println("Starting time date="+d1);
		 System.out.println("End time date="+d2);
			
	}
}