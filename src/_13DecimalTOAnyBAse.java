import java.util.Scanner;

public class _13DecimalTOAnyBAse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b = s.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % b;
            n = n / b;

            rv += dig * p;
            p = p * 10;
        }

        return rv = 0;
    }

    //example   634 in decimal  == 1172 in octal 
}
