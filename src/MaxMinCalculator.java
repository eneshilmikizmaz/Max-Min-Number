import java.util.Scanner;

public class MaxMinCalculator {
    public void calc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz?");
        int count = scanner.nextInt();
        int max = 0;
        int min = 0;
        for (int i = 0; i < count; i++) {
            System.out.print((i+1)+". sayıyı giriniz : ");
            int tmp = scanner.nextInt();
            if (tmp > max) {
                max = tmp;
            } else if (tmp < min) {
                min = tmp;
            }
        }
        System.out.println("Max : " + max + " || "+"Min : "+min);
    }
}
