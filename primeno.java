import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number that you want to check if it is prime: ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i<=n; i++ ){
            if (n%i==0){
                count = count + 1;
            }
        }
        if (count == 2){
            System.out.println("it is a prime number");
        }else{
            System.out.println("it is not a prime number");
        }
    }
            
    }
            


    

