import java.util.Scanner;
import java.util.Random;
public class guess_the_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int no = rn.nextInt(100);
        System.out.println("enter number in range of 100");
        System.out.println("Lets play\n>> GUESS THE NUMBER <<");
        while (5 > 0) {
            System.out.println("enter the number");
            int a=sc.nextInt();
            if (a==no){
                System.out.println("YOU WON \n Entered Number is correct:"+a);
                break;
            }
            else if (a>no)
                System.out.println("Try Again \nentered number GREATER:"+a);
            else
                System.out.println("Try Again \nentered number SMALLER:"+a);

        }
    }
}
