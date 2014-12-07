public class terusBelajar
{
	public static void main(String[]args)
	{
		Belajar m,t;
		pelajaran p;
		
		m=new Belajar(); 	//membuat objek "instansiasi"
		t=new Belajar(); 	//membuat objek "instansiasi"
		p=new pelajaran(); 	//membuat objek "instansiasi"
		
		//menanpilkan dan memanggil data dari method
		System.out.println("\nHasil penambahan 'method'="+t.tambah());
		System.out.println("Hasil penambahan 'method overloading'="+t.tambah(20,8));
		System.out.println("Nama matkul 'method'="+m.matkul());
		System.out.println("Nama matkul 'method overlaoding'="+p.matkul());
	}
}