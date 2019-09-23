import java.util.Scanner;
class Addition{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter start Number:");
	int x=s.nextInt();
	
	System.out.println("Enter end Number:");
	int y=s.nextInt();
	int total=0;
	for(int i=x;i<=y;i++){
		total=total+i;
	
	}
	System.out.println("Total="+total);
	
	
	
	}



}