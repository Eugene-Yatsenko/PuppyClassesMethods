package by.yatsenko.puppy.model;

public class Dog extends Animal{
     int teeth;
     String furColor = "White";
     
     public Dog () {
    	 this.teeth = 28;
     }
     
     public Dog (int teeth, String furColor) {
    	 this.teeth = teeth;
    	 this.furColor = furColor;
     }
     
     public void bite() {
 		if (teeth > 0) {
			System.out.println("I'am biting you! Agrrrrrr!");
		} else {
			System.out.println("I have no teeth, I cant bite!");
		}
     }
     
     public void removeTooth() {
    	 if (teeth > 0) {
    		 this.teeth --;
    	 }
     }
     
     public void removeAllTeeth() {
    	 this.teeth = 0;
    	 System.out.println("Ouch! I've got no teeth!");
     }
     
     public void Bark() {
    	System.out.println("Woof! Woof! I am barking like a big Dawg!");
     }
     
     public String getFurColor() {
    	 return this.furColor;
     }
}
