class Test20{
	void add(int ... x){
	int total=0;
	for(int i=0;i<x.length;i++){
		total=total + x[i];
	}
	System.out.println("Sum="+total);
	}
	
	public static void main(String args[]){
		Test20 t=new Test20();
		t.add(2,3);
		t.add(2,3,4,6);
		t.add();
	
	}


} 