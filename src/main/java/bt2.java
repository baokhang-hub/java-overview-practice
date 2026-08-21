import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap 1 so nguyen: ");
        int soNguyen = sc.nextInt();

        if (soNguyen % 2 == 0) {
            System.out.println("Day la so chan!!!");
        } else {
            System.out.println("Day la so le!!!");
        }
    }
}
