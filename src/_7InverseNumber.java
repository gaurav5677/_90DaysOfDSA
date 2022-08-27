import java.util.Scanner;

public class _7InverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
         int n = s.nextInt();


          int inv = 0 ;
          int  op = 1 ; //orignal place
        while( n !=0){
            int od = n%10; //original digit
            int id = op; // inverse digit
            int ip = od ;// inverse place


            // make change to inv using ip and id
            inv   = inv + id * (int)Math.pow( 10,ip-1);


            n = n/10;
            op++;

        }
        System.out.println(inv);
    }
}
