public class NoOfDigits {

    public static void main(String[] args) {
        //count no of digits
       int x=12323255;
       int count=0;

       while(x>0){
           x=x/10;
           count++;

       }
        System.out.println(count);



    }
}
