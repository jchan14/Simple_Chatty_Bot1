import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int output = 0;
        int temp;
        for (int i = 0; i < count; i++) {
            temp = s.nextInt();
            output = (((temp % 4) == 0) && (temp > output)) ? temp : output;
        }
        System.out.println(output);
    }
}