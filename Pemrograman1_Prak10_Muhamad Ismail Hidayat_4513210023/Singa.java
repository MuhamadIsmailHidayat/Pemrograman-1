//Perintah Inheritance
//Kelas turunannya
//package Latihan03.Praktikum04.bin;
class Singa extends KucingBesar
{
	//Konstruktor untuk class Singa
	public Singa(String namaSinga)
	{
	 //mengisi pengubah yang diwarisi oleh kelas abstract
	 Singa.nama = namaSinga;
	}
	
	//implemetasi metode yang diwarisi dari kelas abstract
	public void Makan()
	{
	 System.out.println("Singa makan daging");
	 System.out.println();
	}
}	