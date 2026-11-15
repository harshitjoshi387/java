import java.util.HashSet;
import java.util.Scanner;
public class Duplicate {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of an array");
        
        int n = sc.nextInt();

        int [] arr= new int[n];

        HashSet<Integer> seen = new HashSet<>();

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int num:arr){
            if(seen.contains(num)){
                System.out.println("duplicate: "+ num);
            }
            else{
                seen.add(num);
            }
        }


    }
}
