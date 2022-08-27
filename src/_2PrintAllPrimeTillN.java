import java.util.Scanner;

public class _2PrintAllPrimeTillN {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int low = s.nextInt(); //  starting

        int high = s.nextInt(); // end

        for (int i = low; i <= high; i++) {

            int count = 0;
            // try to divide n and increase count
            for (int div = 2; div * div <= i; div++) {
                if (i % div == 0) {
                    count++;
                    break;
                }
            }

            if( count ==0 ){
                System.out.println(i);
            }


        }
    }
}
