package main;

public class Person {
	String name;
	int age;
	String jobTitle;
	
	public String returninfo()
	{
		return new String (name + " " + age + " " + jobTitle + " ");
	}
	
	/**needs a name, a age and a job **/
	public Person(String setName, int setAge, String setJob)
	{
		name = setName;
		age = setAge;
		jobTitle = setJob;
		//over load
		
	}
}
