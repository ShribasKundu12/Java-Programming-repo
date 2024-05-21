//Reverse of the array
import java.util.Scanner;
class RevArr{
    public static void main(String s[]){
        int i,j,n;
        boolean flag;
        Scanner p=new Scanner(System.in);
        n=p.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=p.nextInt();
        int front=0,end=n-1;
        while(front!=end){
            int temp=a[front];
            a[front]=a[end];
            a[end]=temp;
            front++;
            end--;
        }
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
class DemoRev{
    public static void main(String s[]){
        int i,j,n;
        boolean flag;
        Scanner p=new Scanner(System.in);
        n=p.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=p.nextInt();
        int max=a[0];
        for(i=0;i<n;i++){
            if(a[i]>max)
                max=a[i];
        }
        System.out.print(max+" ");
    }
}