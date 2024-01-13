import java.util.Scanner;

public class AtcoderNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if ((A == 1 && B == 2) || (A == 2 && B == 3) || (A == 4 && B == 5) || (A == 5 && B == 6) || (A == 7 && B == 8)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
