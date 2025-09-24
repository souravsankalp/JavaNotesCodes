package Object;

public class mainDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj = new Dog();// Creating an object of the class Dog
		
		
		// setting the attributes
		obj.setBreed("Golden Retriever");
	    obj.setAge(2);
	    obj.setColor("Golden");

	    // Printing values
	    obj.printDetails();
	}

}
