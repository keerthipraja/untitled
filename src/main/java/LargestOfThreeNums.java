public class LargestOfThreeNums {

    public static void main(String[] args) {

        int x=71,y=71,z=71;
        if(x>=y&&x>=z){
            if(x==y) {
                System.out.println("x n y r largest");
            } else if (x == z) {
                System.out.println("x n z r largest");

            }else {
                System.out.println("x is largest");
            }
        } else if (y>=z) {
            if(y==z){
                System.out.println("y n z r largest");

            }else {
                System.out.println("y is largest");
            }
        } else {
            System.out.println("z is largest");

        }


    }
}
