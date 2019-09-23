class Calculator1{
	
	void add(int x,int y){
		System.out.println("X+Y="+(x+y));
	}
	
	public static void main(String args[]){
		Calculator1 c= new Calculator1();
		c.add(5,6);
		c.add(2,3);
		c.add(4,3);
		c.add(-3,6);
		}

}