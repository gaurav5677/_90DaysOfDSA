import java.util.Scanner;

public class _1IsAPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
         int x = s.nextInt();

        int count = 0;
        for( int div = 2 ; div * div <=x ; div++){
            if( x % div == 0 ){
                count++;
                break;
            }
        }
        if( count ==0){
            System.out.println("prime");
        }else{
            System.out.println("non prime");
        }

    }
}
