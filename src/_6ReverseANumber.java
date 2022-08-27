import java.util.Scanner;

public class _6ReverseANumber {
    public static void main(String[] args) {


        Scanner s   = new Scanner( System.in);
        int  x=  s.nextInt();

        while( x>0){
            int lastdig = x %10;
             x = x/10;
            System.out.println(lastdig);
        }

    }
}
