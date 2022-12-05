class Animal{
	public void eat(){

	System.out.println("I am eating");
     }

     void run(){

     	System.out.println("He is running");
     }

     void sleep(){

     	System.out.println("I am sleeping");
     }
	public static void main(String[]args){

	Animal buzo = new Animal();
	buzo.eat();
	buzo.run();
	buzo.sleep();
	}
	}