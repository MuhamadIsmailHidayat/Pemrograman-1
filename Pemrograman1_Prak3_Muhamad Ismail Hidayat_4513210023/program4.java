import java.util.Scanner;
public class program4{
	public static void main(String[]args){
		int pilih;
		Scanner input = new Scanner(System.in);
		System.out.println("Pilihan :");
		System.out.println("1. Makan");
		System.out.println("2. Mandi");
		System.out.println("3. Tidur");
		System.out.println("4. Jalan-jalan");
		System.out.println("Masukkan Pilihan Anda :");
		 
		 pilih = input.nextInt();
		 
		switch(pilih){
		case 1:
				System.out.println("Makan");
			break;
		case 2:
				System.out.println("Mandi");
			break;
		case 3:
				System.out.println("Tidur");
			break;
		case 4:
				System.out.println("Jalan-jalan");
			break;
		default : System.out.println("Maaf Pilihan yang Anda Masukkan Salah");
		}
	}
}