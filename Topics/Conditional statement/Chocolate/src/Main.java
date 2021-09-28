import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int w = scanner.nextInt();
        int s = scanner.nextInt();

        if ((l*w>s)&&((s%l==0)||(s%w==0))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}