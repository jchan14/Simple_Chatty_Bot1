import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int output = 0;
        for (; a <= b; a++) {
            output += a;
        }
        System.out.println(output);
    }
}