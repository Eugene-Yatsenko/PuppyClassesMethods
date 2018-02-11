package by.yatsenko.puppy.model;

public class Animal {
	
	int age;
	int pawsCount;
    int paws[];
    
    public Animal() {
		this.age = 1;
		this.pawsCount = 4;
		paws = new int[this.pawsCount];
		for (int i = 0; i < this.pawsCount; i++) {
			paws[i] = 1;
		}
    }
	
	public Animal(int pawsCount, int age) {
		this.age = age;
		this.pawsCount = pawsCount;
		paws = new int[this.pawsCount];
		for (int i = 0; i < this.pawsCount; i++) {
			paws[i] = 1;
		}
	}
	
	public int getPawsCount() {
		return pawsCount;
	}
	
	public void setNewPawsCount(int pawsCount) {
		this.pawsCount = pawsCount; 
		paws = new int[this.pawsCount];
		for (int i = 0; i < this.pawsCount; i++) {
			paws[i] = 1;
		}		
	}
	
	public void addAge(int age) {
		if (age > 1) {
			this.age += age; 
		}		
	}
	
	public void loosePaw() {
		paws[pawsCount-1] = 0;
		pawsCount --;
		System.out.println("I've lost one of my paws! Agrrrrrrr!!!");
	}
	
	public void run () {
		if (pawsCount > 1) {
			System.out.println("I'am running! Wheeeeeeee!"); 
		} else {
			System.out.println("I can't run, I have only one paw!");
		}
	}
	
	public void jump () {
		if (pawsCount > 0) {
			System.out.println("I'am jumping! Yahooooooo!");
		} else {
			System.out.println("I can't jump, I have no paws!");
		}
	
	}

}
