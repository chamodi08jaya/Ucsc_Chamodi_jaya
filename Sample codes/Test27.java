class A{
	void m(){
		System.out.println("Line A");
	}
}

class B extends A{
	int m(){
		System.out.println("Line B");
		return 10;
	}

}

class Test27{
	public static void main(String[] args){
		B b=new B();
		b.m();
		b.m(10  );
	}

}