import java.util.Scanner;

public class _12_Benjimin_Bulbs {
    // given n number of bulbs
    // in 1st fluctuacation all bulbs are toggled  , in the
    // 2nd every 2nd bulb is toggled , in 3rd every 3bulb is toggled

//    to find : whick bulb will be turn on after n fluctuation

    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        int n = s.nextInt();

        for( int i = 1 ; i * i <= n ; i++){
            System.out.println(i* i );
        }
    }
}
