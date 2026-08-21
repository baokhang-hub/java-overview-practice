import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap 1 so nguyen tu 1 den 7: ");
        int day = sc.nextInt();

        if (day>7||day<=0){
            System.out.println("Vui long nhap so nguyen tu 1 den 7!!!");
        }

        switch (day){
            case 1:
                System.out.println("Thu Hai");
                break;
            case 2:
                System.out.println("Thu Ba");
                break;
            case 3:
                System.out.println("Thu Tư");
                break;
            case 4:
                System.out.println("Thu Năm");
                break;
            case 5:
                System.out.println("Thu Sáu");
                break;
            case 6:
                System.out.println("Thu Bảy");
                break;
            case 7:
                System.out.println("Chu Nhat");
                break;
        }
    }
}
