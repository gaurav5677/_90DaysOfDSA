import java.util.Scanner;

public class _3printAllFibonacciNumberTillN {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt() ;


        int a = 0 ,b=1;
        for( int i =0 ; i<=x;i++){
            System.out.println(i);
            int c = a+b;

           a=b;
           b=c;

        }


    }
}
