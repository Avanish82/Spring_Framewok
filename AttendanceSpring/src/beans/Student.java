package beans;

public class Student 
{
	private int sid;
	private String sname;
	private String saddress;
	private String semail;
	private int sphone;
	private int sclass;
	private String ssection;
	private String sgender;
	private String scountry;
		
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, String saddress, String semail, int sphone,
			int sclass, String ssection, String sgender, String scountry) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddress = saddress;
		this.semail = semail;
		this.sphone = sphone;
		this.sclass = sclass;
		this.ssection = ssection;
		this.sgender = sgender;
		this.scountry = scountry;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddress() {
		return saddress;
	}
	
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}
	
	 public int getSphone() {
		   return sphone;
	   }
	 
	 public void setSphone(int sphone) {
		this.sphone = sphone;
	}

	public int getSclass() {
		return sclass;
	}

	public void setSclass(int sclass) {
		this.sclass = sclass;
	}

	public String getSsection() {
		return ssection;
	}

	public void setSsection(String ssection) {
		this.ssection = ssection;
	}

	public String getSgender() {
		return sgender;
	}

	public void setSgender(String sgender) {
		this.sgender = sgender;
	}

	public String getScountry() {
		return scountry;
	}

	public void setScountry(String scountry) {
		this.scountry = scountry;
	}
	

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress="
				+ saddress + ", semail=" + semail + ",sphone="+sphone+", sclass=" + sclass
				+ ", ssection=" + ssection + ", sgender=" + sgender
				+ ", scountry=" + scountry + "]";
	}
	
}
