import java.util.Scanner;
class A{
	public static void main(String s[]){
		int i,j,n;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter any number: ");
		n=p.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=n;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Enetr any number: ");
		n=p.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=n;j++){
				if(i==1 || i==n || j==1 || j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("Enter any number: ");
		n=p.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=n;j++){
				if(i==1 || i==n || j==1 || j==n || i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	} 
}