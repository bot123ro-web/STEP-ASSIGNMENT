import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double perimeter = sc.nextDouble();
        double side = perimeter / 4;

        System.out.println("the length off side" + side + " whose perimeter is " + perimeter);
    }
}

