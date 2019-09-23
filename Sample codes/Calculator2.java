import java.util.Scanner;
class Calculator2{
	void add(double x,double y){
		System.out.println("x+y="+(x+y));
	}
	void sub(double x,double y){
		System.out.println("x-y="+(x-y));
	}
	void mul(double x,double y){
		System.out.println("x*y="+(x*y));
	}
	void div(double x,double y){
		System.out.println("x/y="+(x/y));
	}


public static void main(String[] args){
	Calculator2 c=new Calculator2();
	Scanner s=new Scanner(System.in);
	
	
	System.out.print("Enter the first input:");
	double x=s.nextDouble();
	
	System.out.print("Enter the second input:");
	double y=s.nextDouble();
	
	c.add(x,y);
	c.sub(x,y);
	c.mul(x,y);
	c.div(x,y);


}
}