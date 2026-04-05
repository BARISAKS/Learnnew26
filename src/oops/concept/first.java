package oops.concept;
//Private variable (instance variable)
//private variable (name) can only be accessed within this class.
public class first {
	private String name;
 
// Constructor to initialize the name when a Student object is created

	public first(String firststdname) {
		name = firststdname;
		
	}
// Public getter method
	public String getName() {
		return name;
	}

}
