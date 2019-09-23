class Parent{
	int height=120;
	void sing(){
		System.out.println("Classical");
	}

}

class child extends Parent{
}

class Test23{
	public static void main(String[] args){
	Parent p=new Parent();
	p.sing();
	System.out.println(p.height);
	
	child c=new child();
	c.sing();
	System.out.println(c.height);
	}
}