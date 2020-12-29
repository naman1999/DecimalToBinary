import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        DecimalToBinary p = new DecimalToBinary();
        p.convert(num);
    }
}
