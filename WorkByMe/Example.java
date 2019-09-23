public class Example{
	public static void main(String args[]){
		String s1="This is String CharAt Method";
		
		System.out.println("Character at 0 position is:"+s1.charAt(0));
		
		System.out.println("Character at 5th position is:"+s1.charAt(5));
	
		System.out.println("Character at 22nd position is:"+s1.charAt(22));
		
		char result=s1.charAt(-1);
		System.out.println("Character at 23rd position is:"+result);
	}




}