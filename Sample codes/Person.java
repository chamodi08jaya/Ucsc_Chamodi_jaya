class Person{
	int age=23;
	String name="Kamal";
	double weight=70;
	
	void run(){
		System.out.println("Run method");
		
	}

	void jump(){
		System.out.println("Jump method");
		
	}
	
	public static void main(String args[]){
		Person a=new Person();
		a.run();
		a.jump();
		
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.weight);
		
		a.run();
		
		Person b=new Person();
		b.run();
	}











}



