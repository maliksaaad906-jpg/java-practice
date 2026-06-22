import java.util.Scanner;

public class Conditionalopt {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

//pen = 10, book 40

    int cash = sc.nextInt();

    if (cash < 10){
        System.out.println("cannot buy anything");
        System.out.println("need more cash");
    }

    else if( cash > 10 && cash < 50){
        System.out.println("can buy one item");
    }

    else {
        System.out.println("can buy both item");
    }

    }
}
