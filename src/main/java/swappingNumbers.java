public class swappingNumbers {
    public  static  void main (String [] args){
        swappingNumbers sp = new swappingNumbers();
        sp.swapNum();

    }
    public void swapNum(){
        int a=10;
        int b=20;
        System.out.println("before a and b values are "+a+" and  "+b);
        System.out.println("temp a is = " +(a=a+b));
        System.out.println( "new b value is  "+(b=a-b));
        System.out.println("new a value is = " +(a=b+b));

    }
}
