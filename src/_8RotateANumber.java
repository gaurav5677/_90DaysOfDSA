import java.util.Scanner;

public class _8RotateANumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();// take the number forn the use
        int k = s.nextInt(); // rotate number by this

        int temp = n;
        int nod = 0;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }
        k =  k % nod ; // this will manage the huge number of rotation
        if( k < 0 ){// and this will take care of negative rotation
            k = k + nod ;
        }
        int div = 1;
        int mul = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div = div * 10; // multiply div  10 till i less than k
            }else{
                mul = mul *10;

            }
        }

        int  q   = n / div ;// here we will get the remaining number
        int r = n % div ;// here we will get the remainder

         r = (r * mul )+ q;  // the final rotating number
        System.out.println(r );
    }
}
