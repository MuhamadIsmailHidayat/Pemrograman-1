//perintah Inheritance
//kelas turunannya 
//package Latihan03. Praktikum04.bin;
import java.util.*;

public class TesKucing
{
	private static int Jumlah;
	public static void main(String[] Xx)
	{
	 Jumlah = 1;
		
		//Kucing Makan
		KucingMakan KM= new KucingMakan();
		System.out.println("Masukkan Nama Kucing Kesayangan Anda [" +Jumlah +"] : ");
		KM.setNama (KucingMakan.inputDataString());
		System.out.println("Masukkan Umur Kucing Kesayangan Anda [" +Jumlah +"] : ");
		KM.setUmur (KucingMakan.inputDataInteger());
		System.out.println("Masukkan Makanan Kucing Kesayangan Anda [" +Jumlah +"] : ");
		KM.setMakanan (KucingMakan.inputDataString());
		Jumlah++;
		
		//JmlAnakKucing
		JmlAnakKucing JAK = new JmlAnakKucing();
		System.out.println("Masukkan Nama Kucing Kesayangan Anda [" +Jumlah +"] : ");
		JAK.setNama (JmlAnakKucing.inputDataString());
		System.out.println("Masukkan Umur Kucing Kesayangan Anda [" +Jumlah +"] : ");
		JAK.setUmur (JmlAnakKucing.inputDataInteger());
		System.out.println("Masukkan Berat Kucing Kesayangan Anda [" +Jumlah +"] : ");
		JAK.setBerat (JmlAnakKucing.inputDataInteger());
		System.out.println("Masukkan Makanan Kucing Kesayangan Anda [" +Jumlah +"] : ");
		JAK.setMakanan (JmlAnakKucing.inputDataString());
		System.out.println("Masukkan Jumlah Anak Kucing Kesayangan Anda [" +Jumlah +"] : ");
		JAK.setJumlahAnak(JmlAnakKucing.inputDataInteger());
		
		//Output Data Kucing
		System.out.println("\n \n DATA KUCING");
		KM.Tulis();
		System.out.println("\nMakanan Kucing Anda 		: " +KM.getMakanan());
		JAK.Tulis();
		System.out.println("\nMakanan Kucing Anda 		: " +JAK.getMakanan());
		System.out.println("Jumlah Anak Kucing 		: " +JAK.getJumlahAnak());
	}	
}	