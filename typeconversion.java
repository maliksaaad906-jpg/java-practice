public class typeconversion {
    public static void main(String[] args) {
        byte num1 = 20;
        int a = num1; 
        float b = num1;
      
        
        // int c = b; 
        // cannot be conveted again to int rather we have to use casting 
        //(int)b convert the b to int first and then assign it to c 
        // which is the right way to assigning float to int , byte to int 
        int c = (int) b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        byte g =10;
        byte h = 9;
        int i = ++g;
        System.out.println(i);

    }
}
