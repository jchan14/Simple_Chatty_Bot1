import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        long output = 1;
        for (; a < b; a++) {
            output *= a;
//          if (a!=1){
//              System.out.println("a: "+a+" output: "+output);
//          }
        }
        System.out.println(output);
    }
}