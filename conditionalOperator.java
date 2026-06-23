public class conditionalOperator {
    public static void main(String[] args) {
         int a = 7;
         int b = 9;
         int c = 8;

        if (a>b && a>c) {
            System.out.println(a);
            System.out.println("a is greater");
        }
        else if (b>a&&b>c) {
            System.out.println(b);
            System.out.println("b is greater");
        }
        else{
            System.out.println(c);
            System.out.println("c is greater");}
}
}
