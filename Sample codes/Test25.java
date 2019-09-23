class Animal{
	void run(){
		System.out.println("Animal run");
	}

}
class Dog extends Animal{
	void run(){
		System.out.println("Dog run");
	}
}
class Lion extends Animal{
	void run(){
		System.out.println("Lion run");
	}
}
class Cat extends Animal{
	void run(){
		System.out.println("Cat run");
	}
}
public class Test25{
	public static void main(String[] args){
		Animal a=new Dog();
		Animal b=new Lion();
		Animal c=new Cat();
		a.run();
		b.run();
		c.run();
	}

}