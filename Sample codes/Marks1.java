import java.util.Scanner;
class Marks1{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter marks:");
		
		int marks=s.nextInt();
		
		if(marks>=75){
			System.out.println("A");
		}else if(marks>=65){
			System.out.println("B");
		}else if(marks>=55){
			System.out.println("C");
		}else if(marks>=45){
			System.out.println("S");
		}else{
			System.out.println("F");
	
	}
	}


}