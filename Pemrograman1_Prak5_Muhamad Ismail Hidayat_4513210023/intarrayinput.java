import java.util.Scanner;
public class intarrayinput{
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
	}
}