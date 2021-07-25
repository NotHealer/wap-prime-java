import java.util.Scanner;

public class primeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt(), i;
        for (i = 2; i < a - 1; i++) {
            if (a % i == 0) {
                System.out.println("Is Not A prime Number");
                break;
            }
        }
        if (i == a - 1) {
            System.out.println("is A Prime Number");
        }
    }
}
