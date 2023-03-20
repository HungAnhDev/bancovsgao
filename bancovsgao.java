import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int q = input.nextInt();
        long tongsogao = 0;
        long gao = 1;

        for (int i = 0; i < n; i++) {
            tongsogao += gao;
            gao *= q;
        }
System.out.println(tongsogao);
}
}
