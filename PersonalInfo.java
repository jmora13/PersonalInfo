
public class PersonalInfo {
	private String name, address;
	private int age;
	private long phoneNumber;
	
	public PersonalInfo(String Name, String Address, int Age, long PhoneNumber){
		name = Name;
		address = Address;
		age = Age;
		phoneNumber = PhoneNumber;
	}
	public void setName(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAddress(String a){
		address = a;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAge(int personalAge){
		age = personalAge;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setPhoneNumber(long pn){
		phoneNumber = pn;
	}
	
	public long getPhoneNumber(){
		return phoneNumber;
	}
	
	public static void main(String[] args){
		PersonalInfo me = new PersonalInfo("Jose", "Pomona", 20, 650201688);
		PersonalInfo father = new PersonalInfo("Louie", "San Mateo", 55, 650290109);
		PersonalInfo mother = new PersonalInfo("Angel", "San Mateo",50,650201969);
	}
}
