//need to import the scanner class first
import java.util.Scanner;

public class Tryscanner {

    public static void main(String[] args) {
    
    // create a object of the class sc
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your age: ");
        
    // take the input as a int
        int age = sc.nextInt();


        if (age > 18)
        System.out.println("you can vote");

        else
        System.out.println("you cant vote");



    }
}
