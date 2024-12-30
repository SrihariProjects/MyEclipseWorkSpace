package day2;

public class POJO_PostRequest {

	String name;
	int age;
	String gender;
	String cources[];
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getCources() {
		return cources;
	}
	public void setCources(String[] cources) {
		this.cources = cources;
	}
	
}
