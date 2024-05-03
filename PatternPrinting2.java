import java.util.Scanner;
class B{
	public static void main(String s[]){
		int i,j,n;
		Scanner p=new Scanner(System.in);
		System.out.println("Enetr any number: ");
		n=p.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Enetr any number: ");
		n=p.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				if(j==1 || i==n || i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("Enetr any number: ");
		n=p.nextInt();
		for(i=n;i>=1;i--){
			for(j=1;j<=i;j++){
					System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Enetr any number: ");
		n=p.nextInt();
		for(i=n;i>=1;i--){
			for(j=1;j<=i;j++){
				if(j==1 || i==n || i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}