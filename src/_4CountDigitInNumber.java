import java.util.Scanner;

public class _4CountDigitInNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n  = s.nextInt();


        int  d = 0 ;
        while( n!=0){
            n = n/10;
            d++;
        }
        System.out.println(d);


    }
}
