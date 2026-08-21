import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap diem trung binh: ");
        double diemTrungBinh = sc.nextDouble();

        if (diemTrungBinh < 0) {
            System.out.println("Vui long nhap lai diem trung binh!!!");
        } else if (diemTrungBinh >= 8.5) {
            System.out.println("Ban dat loai gioi!!!");
        } else if (diemTrungBinh >= 7) {
            System.out.println("Ban dat loai kha!!!");
        } else if (diemTrungBinh >= 5) {
            System.out.println("Ban dat loai trung binh!!!");
        } else {
            System.out.println("Ban dat loai yeu!!!");
        }
    }
}
