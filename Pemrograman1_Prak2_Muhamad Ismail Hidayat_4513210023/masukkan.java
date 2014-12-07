import java.util.Scanner;
public class masukkan{
	public static void main(String[]args){
		String katapertama;
		String katakedua;
		Scanner masuk = new Scanner(System.in);
		System.out.println("\nMasukkan kata pertama =");
		katapertama = masuk.nextLine();
		System.out.println("\nMasukkan kata kedua =");
		katakedua = masuk.nextLine();
		System.out.println(katapertama);
		System.out.println(katakedua);
	}
}