public class EvenAndOddCount {

    public static void main(String[] args) {
        int num = 146571111;
        int count = 0;
        int even = 0;
        int odd=0;
        while (num > 0) {
          int  rem = num % 10;

            if (rem % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num/=10;

            count++;
        }

        System.out.println("even count is= "+even);
        System.out.println("odd count is = " +odd);
        System.out.println(count);

        }

    }

