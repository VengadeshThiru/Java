import java.util.Scanner;
class OddOrEven{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		if(i>0){
		if(i%2==0){
			System.out.println("Even");
			}
		else{
			System.out.println("Odd");
		}
		}
		else{
			System.out.println("invalid");
		}
	}
}