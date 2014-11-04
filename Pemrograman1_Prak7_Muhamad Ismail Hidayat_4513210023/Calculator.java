import java.util.Scanner;
public class Calculator{
	public static void main(String [] args){
		int pilih;
		Scanner input = new Scanner(System.in);

		System.out.println("\n1.Penjumlahan");
		System.out.println("2.Pengurangan");
		System.out.println("3.Perkalian");
		System.out.println("4.Pembagian");
		System.out.println("5.Mod");
		System.out.print("Masukkan Pilihan Anda : ");
		pilih = input.nextInt();

		System.out.print("\nMasukkan angka pertama : ");
		int a = input.nextInt();
		System.out.print("Masukkan angka kedua : ");
		int b = input.nextInt();
		
		switch(pilih){
			case 1:
					int tambah = a + b ;
					System.out.println("\nHasil Penjumlahan =" +tambah);
				break;
			case 2:
					int kurang = a - b ;
					System.out.println("\nHasil Pengurangan =" +kurang);
				break;
			case 3:
					int kali = a * b ;
					System.out.println("\nHasil Perkalian =" +kali);
				break;
			case 4:
					float bagi = (float) a / b ;
					System.out.println("\nHasil Pembagian =" +bagi);
				break;
			case 5:
					int n = a%b ;
					System.out.println("\nHasil Mod =" +n);
				break;
			default : System.out.println("Maaf Pilihan yang Anda Masukkan Salah");
			}
	}
}