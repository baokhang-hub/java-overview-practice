import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so nguyen A: ");
        int soNguyenA = sc.nextInt();
        System.out.println("Nhap so nguyen B: ");
        int soNguyenB = sc.nextInt();
        System.out.println("Nhap ky tu phep toan (+, -, *, /): ");
        char kyTuPhepToan= sc.next().charAt(0);

        switch (kyTuPhepToan) {
            case '+':
                System.out.println("Ket qua: " + (soNguyenA + soNguyenB));
                break;
            case '-':
                System.out.println("Ket qua: " + (soNguyenA - soNguyenB));
                break;
            case '*':
                System.out.println("Ket qua: " + (soNguyenA * soNguyenB));
                break;
            case '/':
                if (soNguyenB == 0) {
                    System.out.println("Khong the chia cho 0");
                } else {
                    System.out.println("Ket qua: " + ((double) soNguyenA / soNguyenB));
                }
                break;
            default:
                System.out.println("Phep toan khong hop le");
        }
    }
}
