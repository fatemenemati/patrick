//import static java.lang.System.in;
import  java.util.Scanner;
public class main {

    public static void main(String[] args) {
        // TODO code application logic here
        int i=2;
        System.out.println("enter n:");
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int a[]= new int[n];
        int b[]= new int[n-1];
         a[0]=1;
         a[1]=1;
          int a1=1, a2=1;
         System.out.println("multiple 10:");
         while(i< n){
         int c=a1+a2;
         a[i]=c;
         a1=a2;
         a2=c;
         if(i%10==0)
             System.out.println(a[i]);
         i++;
        }
         System.out.println("array numb is smaller than n");
         i=0;
         while(i<n-1)
         {
         b[i]=a[i];
         i++;
         }
         a=b;
         for(int j=0;j<a.length;j++){
         System.out.println(a[j]);
         }
               
    }
    
}
   