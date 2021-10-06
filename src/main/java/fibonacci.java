public class fibonacci {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<4;i++){
            int n1=i;
            int n2=(i+1);
            sum=sum+n2;

            System.out.println(sum);
            n1=n2;
            n2=sum;
        }
    }
}
