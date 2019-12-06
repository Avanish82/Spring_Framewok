package pack;

import java.io.Serializable;

public class Student implements Serializable 
{
    private static final long serialVersionUID = -1280037900360314186L;

    private Integer id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String clss;
    private String section;
    private String gender;
    private String country;
     
    public Student()
    {
        super();
    }

    public Student(Integer id, String name, String address, String email, String phone, 
    		String clss, String section, String gender, String country) {
    	
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.clss = clss;
		this.section = section;
		this.gender = gender;
		this.country = country;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getClss() {
		return clss;
	}
	public void setClss(String clss) {
		this.clss = clss;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	   
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        result = prime * result + ((clss == null) ? 0 : clss.hashCode());
        result = prime * result + ((section == null) ? 0 : section.hashCode());
        result = prime * result + ((gender == null) ? 0 : gender.hashCode());
        result = prime * result + ((country == null) ? 0 : country.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (id == null)
        {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null)
        {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (address == null)
        {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (email == null)
        {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        
        if (phone == null)
        {
            if (other.phone != null)
                return false;
        } else if (!phone.equals(other.phone))
            return false;
        if (clss == null)
        {
            if (other.clss != null)
                return false;
        } else if (!clss.equals(other.clss))
            return false;
        if (section == null)
        {
            if (other.section != null)
                return false;
        } else if (!section.equals(other.section))
            return false;
        if (gender == null)
        {
            if (other.gender != null)
                return false;
        } else if (!gender.equals(other.gender))
            return false;
        if (gender == null)
        {
            if (other.country != null)
                return false;
        } else if (!country.equals(other.country))
            return false;
        
        return true;
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address
				+ ", email=" + email + ", phone=" + phone + ", clss=" + clss
				+ ", section=" + section + ", gender=" + gender + ", country="
				+ country + "]";
	}
     
    
}