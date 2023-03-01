import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String stn1,stn2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so thu nhat : ");
        stn1 = sc.nextLine();
        while (!stn1.matches("-?\\d+(\\.\\d+)?")) {
        	System.out.println("Khong phai la so! Nhap lai! ");
        	System.out.print("Nhap so thu nhat : ");
            stn1 = sc.nextLine();
		}
        
        System.out.print("Nhap so thu hai : ");
        stn2 = sc.nextLine();
        while (!stn2.matches("-?\\d+(\\.\\d+)?")) {
        	System.out.println("Khong phai la so! Nhap lai! ");
        	System.out.print("Nhap so thu nhat : ");
            stn2 = sc.nextLine();
		}
		MyBigNumber m = new MyBigNumber();
		System.out.println(m.sum(stn1, stn2));
	}
}
