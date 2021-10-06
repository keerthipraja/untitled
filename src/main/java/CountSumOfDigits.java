public class CountSumOfDigits {

    public static void main(String[] args) {
        int nums = 12345678;
        int total = 0;
        int count = 0;

        while (nums > 0) {

            int rem = nums % 10;
            System.out.println(rem);
            total += rem;
            nums = nums / 10;
//optimised code
//            total+= nums%10;
//            nums=nums/10;

        }
        System.out.println(("total is = " + total));


    }
}
