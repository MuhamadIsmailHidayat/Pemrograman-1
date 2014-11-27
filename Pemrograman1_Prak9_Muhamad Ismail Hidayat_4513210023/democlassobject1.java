import java.util.*;
public class democlassobject1
{
	public static void main(String[] args)
	{
	 mahasiswa.jumlah = 0;
	 System.out.println("Jumlah Mahasiswa : "+mahasiswa.jumlah);
	 
	 mahasiswa m1 = new mahasiswa();
	 m1.nim = "123";
	 m1.nama = "Ismail";
	 m1.jumlah = 1;
	 
	 mahasiswa m2 = new mahasiswa();
	 m2.nim = "321";
	 m2.nama = "Hidayat";
	 m2.jumlah = 2;
	 
	 tampilkanmahasiswa(m1);
	 tampilkanmahasiswa(m2);
	 System.out.println("Jumlah Mahasiswa : "+mahasiswa.jumlah);
	}
	
	public static void tampilkanmahasiswa(mahasiswa m)
	{
	 System.out.println("Nim	: "+m.nim);
	 System.out.println("Nama	: "+m.nama);
	 System.out.println("Jumlah	: "+m.jumlah);
	 System.out.println("");
	 System.out.println("");
	}
}