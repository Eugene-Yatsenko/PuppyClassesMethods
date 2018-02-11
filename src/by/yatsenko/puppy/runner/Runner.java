package by.yatsenko.puppy.runner;
import by.yatsenko.puppy.model.*;
public class Runner {

	public static void main(String[] args) {
		//Creating & testing a new puppy
		Puppy p = new Puppy("Zhuchka", "Grey");
		System.out.println("Name is: " + p.getName());
		System.out.println("Color is: " + p.getFurColor());
		p.run();
		p.jump();
		
		//Paris Hilton plays with the puppy
		System.out.println();
		p.playWithPuppy("Paris Hilton");
		p.loosePaw();
		p.removeAllTeeth();
		for(int i = 0; i < p.getPawsCount(); ) {
			p.loosePaw();
		}
		p.run();
		p.jump();
	}

}
