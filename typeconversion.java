public class typeconversion {
    public static void main(String[] args) {
        byte num1 = 20;
        int a = num1; 
        float b = num1;
        
        // int c = b; cannot be conveted again to int rather we have to use casting 
        int c = (int) b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
