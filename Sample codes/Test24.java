class Parent{
	
	void sing(){
		System.out.println("Classical");
	}

}

class child extends Parent{
	void sing(){
		System.out.println("Rock");
	}
	void run(){
		System.out.println("Child run");
	}
}

class Test24{
	public static void main(String[] args){
	Parent p=new Parent();
	p.sing();
	
	
	child c=new child();
	c.sing();
	
	Parent d=new child();
	d.sing();
	//d.run();
	
	}
}