import java.util.Scanner;
public class keluaranarray{
	public static void main(String [] args){
		int angka[] = new int[10];
		int i,banyak;
		int jumlah;
		jumlah=0;
			Scanner input = new Scanner(System.in);
			System.out.print("Masukkan Banyak angka = ");
			banyak = input.nextInt();
			
			for(i=0;i<banyak;i++){
				System.out.print("Masukkan Angka = ");
				angka[i] = input.nextInt();
				jumlah = jumlah + angka[i];
			}
			System.out.println("Jumlahnya adalah " + jumlah);
				if(jumlah%2==0){
					System.out.println("\nJumlah termasuk bilangan genap");
				}
				else System.out.println("\nJumlah termasuk bilangan ganjil");
	}
}