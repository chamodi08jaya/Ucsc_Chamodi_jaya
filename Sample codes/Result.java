import java.util.Scanner;
 class Result{
	void getAvg(int[] a){
		double total=0;
		
		for(int i=0;i<a.length;i++){
			total=total+a[i];
		}
		System.out.println("avg:"+(total/a.length));
	
	}
	int[] readMarks(){
		Scanner s=new Scanner(System.in);
		int[] a=new int[3];
		for(int i=0;i<a.length;i++){
			System.out.println("Enter Marks:");
			a[i]=s.nextInt();
		}
		return a;
	}
	public static void main(String args[]){
		Result g=new Result();
		g.getAvg(g.readMarks());
	}
}