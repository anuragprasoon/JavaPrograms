import java.util.Scanner;

public class sumingarray {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int length = scanner.nextInt();
       int[] array =  new int[length];
       int sum=0;
       for (int i = 0; i < length; i++) {
           array[i] = scanner.nextInt();
           if(array[i]%4==0){
               sum+=array[i];
           }
       }

       //your code goes here
       System.out.println(sum);
       
   }
}