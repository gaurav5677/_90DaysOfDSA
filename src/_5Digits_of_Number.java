import java.util.Scanner;

public class _5Digits_of_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int x = s.nextInt();

        int nod = 0 ;
        int temp = x ;
        while( temp != 0){
            temp = temp /10;
            nod++;

        }

        int div = (int)Math.pow(10, nod -1);

        while( div !=0 ){
             int q = x /div;
            System.out.println(q);

            x =  x % div;
            div  = div / 10;
        }






    }
}
