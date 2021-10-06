import java.util.Random;
import java.util.Scanner;

//num greater than 0
//num only 2 factors 1 and itself .. so take this as condition not more than two proper divisions
public class primeNo {
    public static void main(String[] args) {
        Random rand=new Random();
      int rnd=  rand.nextInt(102);
      String rn=rand.toString();
        System.out.println(rnd);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int count = 0;

        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("prime");
            }else {
                System.out.println("not prime");

            }


        } else {
            System.out.println("not palindrome no.");
        }
    }
}
