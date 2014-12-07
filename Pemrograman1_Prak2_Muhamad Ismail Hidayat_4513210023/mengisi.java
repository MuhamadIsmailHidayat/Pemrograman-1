import java.util.Scanner;
public class mengisi{
	public static void main(String[]args){
		String nama;
		String npm;
		int nilaitugas1;
		int nilaitugas2;
		float rata;
		Scanner masuk = new Scanner(System.in);
		System.out.println("\nMasukkan Nama :");
		nama = masuk.nextLine();
		System.out.println("\nMasukkan NPM :");
		npm = masuk.nextLine();
		System.out.println("\nMasukkan Nilai Tugas 1 :");
		nilaitugas1 = masuk.nextInt();
		System.out.println("\nMasukkan Nilai Tugas 2 :");
		nilaitugas2 = masuk.nextInt();
		System.out.println("\nNilai Rata-rata :");
		rata = (nilaitugas1+nilaitugas2)/2;
		rata = rata;
		System.out.println(nama);
		System.out.println(npm);
		System.out.println(rata);
	}
}