import java.util.Scanner;
public class NumberReverse {

     static int num;

    public static void main(String[] args) {
        NumberReverse nb=new NumberReverse();

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        num= sc.nextInt();

        nb.sbMethod();
        nb.sblMethod();

    }
    //either we can pass int when obj is created or append to the obj after it is created.

    public void sbMethod(){
        int x=234;
        StringBuffer sb=new StringBuffer(String.valueOf(num));
      // StringBuffer newSB=sb.append(x);
     // StringBuffer rev= newSB.reverse();
        StringBuffer rev1= sb.reverse();
        System.out.println(rev1);
    }
    public void sblMethod(){
        int x=12340;
        StringBuilder sb=new StringBuilder(String.valueOf(x));
       // StringBuilder newSB=sb.append(x);
        //StringBuilder rev= newSB.reverse();
        StringBuilder rev= sb.reverse();

        System.out.println(rev);

}}
