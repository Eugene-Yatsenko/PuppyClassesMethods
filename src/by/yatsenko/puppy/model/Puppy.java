package by.yatsenko.puppy.model;

public class Puppy extends Dog{
	
	String name;
	
	public Puppy() {
		this.name = "Rex";
	}
	
	public Puppy(String name, String furColor) {
		this.name = name;
		this.furColor = furColor;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void playWithPuppy(String userName) {
		System.out.println(userName + " plays with the puppy!");
	}

}
