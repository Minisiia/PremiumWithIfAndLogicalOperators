import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть зарплату");
        double salary = scanner.nextDouble();
        System.out.println("Введіть вислугу років");
        double lengthOfService = scanner.nextDouble();
        double premium = 0;
        if (lengthOfService > 0 && lengthOfService < 5) premium = 0.1 * salary;
        else if (lengthOfService >= 5 && lengthOfService < 10) premium = 0.15 * salary;
        else if (lengthOfService >= 10 && lengthOfService < 15) premium = 0.25 * salary;
        else if (lengthOfService >= 15 && lengthOfService < 20) premium = 0.35 * salary;
        else if (lengthOfService >= 20 && lengthOfService < 25) premium = 0.45 * salary;
        else premium = 0.50 * salary;
        System.out.println("Премія становить " + premium);
    }
}
