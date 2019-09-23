class A{
	int x=10;
	void m(){
		System.out.println("m method");
	}
}
class B{
	double y=23;;
	void d(){
		System.out.println("d method");
	}
}
class C{
	
	void e(){
		System.out.println("e method");
	}
}

class Test1{
	public static void main(String args[]){
		A a=new A();
		B b=new B();
		
		b.d();
		System.out.println(a.x);
		a.m();
		System.out.println(b.y);
	
	
	}


}