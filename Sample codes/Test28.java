abstract class Animal{
	abstract void run();
}

class Dog extends Animal{
	void run(){
		System.out.println("Dog run");
	}
}

public class Test28 {
	public static void main(String args[]){
		Dog d=new Dog();
		d.run();
	}

}