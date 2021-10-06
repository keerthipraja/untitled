import java.util.ArrayList;
import java.util.Scanner;

public class NumberReverse {

    static int num;

    public static void main(String[] args) {
        NumberReverse nb = new NumberReverse();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        num = sc.nextInt();

        // nb.sbMethod();
        nb.sblMethod();
        StringBuilder sb = new StringBuilder();
        StringBuilder newSb = sb.append(num);
        StringBuilder rev = newSb.reverse();
        System.out.println(rev);

        //without using append method and storing th value in a string and as string builder both ways.
        int count = 0;
        while (num > 0) {

            int rem = num % 10; //gives the remainder stored
            String newStr=String.valueOf(rem); //int changed to string and stored in newstr
            StringBuilder sbr=new StringBuilder(rem);// rem passed in to string builder
            num = num / 10;   //   to remove the last int as we have to use this for shortening the int one by one
            count++;
            System.out.print(newStr);
            System.out.print(sbr);

        }

    }
    //either we can pass int when obj is created or append to the obj after it is created.

    public void sbMethod() {
        int x = 234;
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        // StringBuffer newSB=sb.append(x);
        // StringBuffer rev= newSB.reverse();
        StringBuffer rev1 = sb.reverse();
        System.out.println(rev1);
    }

    public void sblMethod() {
        int x = 12340;
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        // StringBuilder newSB=sb.append(x);
        //StringBuilder rev= newSB.reverse();
        StringBuilder rev = sb.reverse();

        System.out.println(rev);

    }


}
