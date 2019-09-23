class Test21{
	void m(int a,int ... x){
	
		System.out.println("m method");
	}
	
	public static void main(String args[]){
		Test21 t=new Test21();
		t.m(2);
		t.m(0,1,3);
		
	
	}


} 