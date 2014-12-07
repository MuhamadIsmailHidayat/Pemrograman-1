import java.util.Scanner;
public class intarray{
	public static void main(String [] args){
		String [] angka;
		int i;
		int banyak;
			Scanner input = new Scanner(System.in);
			System.out.print("MasukkanBanyakangka = ");
			banyak = input.nextInt();
			
			for(i=0;i<banyak;i++){
				System.out.print("MasukkanAngka = ");
				banyak = input.nextInt();
			}
	}
}

