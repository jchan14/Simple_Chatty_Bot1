import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cupCount = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        System.out.println((!isWeekend && (cupCount>=10&&cupCount<=20))||(isWeekend&&(cupCount>=15&&cupCount<=25)));

    }
}