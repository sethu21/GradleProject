package coderocket.test01.Student;

import lombok.Value;

@Value
public class Students {
	private String Id;
	private String Name;
	private String Lastname;


	public  String getName() {
		return Name;
	}


	public String setId(String Id) {
		return Id ;
	}





	public String getLastname() {
		return Lastname;
	}

	public Students(String id, String name, String lastname) {
		Id = id;
		Name = name;
		Lastname = lastname;
	}
}
