class Calc{
	int add(int x,int y,int z){
		int total=x+y+z;
		System.out.println("x+y+z="+total);
		return total;
	}
	void avg(int total){
		double avg=total/3;
		System.out.println("Avg is"+avg);
	}
	
	public static void main(String args[]){
		Calc c=new Calc();
		//int t=c.add(5,6,8);
		//c.avg(t);
		c.avg(c.add(5,6,8));



	}
}