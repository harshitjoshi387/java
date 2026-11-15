import java.util.Scanner;


public class main {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");
        
        int n= sc.nextInt();

        int[] arr =new int[n];

        System.out.println("enter the element of the array");

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("your array");

        for(int num :arr){
            System.out.print(num + " ");
        }
        sc.close();
    }
}
