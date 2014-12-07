import java.util.Scanner;
public class program1{
	public static void main(String[]args){
		int nilai;
		Scanner masuk = new Scanner(System.in);
		System.out.println("Masukkan Nilai :");
		nilai = masuk.nextInt();
		if(nilai<50){
			System.out.println("Nilai Anda Jelek");
			}
		else if(nilai>100){
			System.out.println("Salah Nilai tuhhhh!!!");
			}
		else if(nilai==50){
			System.out.println("Nilai Anda Hampir");
			}
		else if(nilai >50){
			System.out.println("Anda Lulus");
			}
		else if(nilai==100){
			System.out.println("Nilai Anda Luar Biasa");
			}
		else
			System.out.println("Anda memasukkan angka yang salah");
	}
}