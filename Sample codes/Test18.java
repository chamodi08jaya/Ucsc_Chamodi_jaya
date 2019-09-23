class Animal{}
class Test18{
	public static void main(String[] args){
		double[] a=new double[3];
		a[0]=10;
		a[1]=-4.2;
		a[2]=5;
		
		System.out.println(a [2]);
		
		String[] b=new String[3];
		b[0]="abc";
		b[1]="123";
		System.out.println(b[2]);
		System.out.println(b[1]);
		Animal[] c= new Animal[3];
		c[0]=new Animal();
		c[1]=new Animal();
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
	
	}
}