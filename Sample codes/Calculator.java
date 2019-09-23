class Calculator{
	double x=2;
	int y=4;
	void add(){
		System.out.println("X+Y="+(x+y));
	}
	void sub(){
		System.out.println("X-Y="+(x-y));
	}
	void mul(){
		System.out.println("X*Y="+(x*y));
	}
	void div(){
		System.out.println("X/Y="+(x/y));
	}
	void mod(){
		System.out.println("X%Y="+(x%y));
		}

	public static void main(String args[]){
		Calculator c= new Calculator();
		c.add();
		c.sub();
		c.mul();
		c.div();
		c.mod();
		}

}