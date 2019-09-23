class A{
	void m(){
		System.out.println("Line A");
	}
}

class B extends A{
	void m(String x){
		System.out.println("Line B");
	}

}
class Test26{
	public static void main(String[] args){
		B b=new B();
		b.m();
		b.m("abc");
	}

}