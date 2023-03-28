// convert days into sec
import java.util.Scanner;
public class timeconverter {
    public static void main(String args[]){
        Scanner x= new Scanner(System.in);
        int day = x.nextInt();
        int sec = 60*60*24*day;
        System.out.println(sec);
    }
    
}
