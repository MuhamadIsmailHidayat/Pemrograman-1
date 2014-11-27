//perintah Inheritance
//Kelas turunannya
//package Latihan03.Praktikum04.bin;
class Harimau extends KucingBesar
{
	//Konstruktor untuk class Harimau
	public Harimau(String namaHarimau)
	{
	 //Mengisi Pengubah yang mewarisi oleh kelas abstract
	 Harimau.nama = namaHarimau;
	}
	
	//implementasi metode yang diwarisi dari kelas abstract
	public void Makan()
	{
	 System.out.println("Harimau makan daging dan minum susu");
	 System.out.println();
	}
}	