package beans; 

 
public class Car 
{
	private String carname[];
	private Engine engine[];
	
	public void setCarname(String[] carname) {
		this.carname = carname;
	}
	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}
	
	public void printCarData()
	{
		for(String car:carname)
		{
			System.out.println(car);
		}
		for(Engine e:engine)
		{
			System.out.println(e.getModelyear());
		}
	}
	

}
