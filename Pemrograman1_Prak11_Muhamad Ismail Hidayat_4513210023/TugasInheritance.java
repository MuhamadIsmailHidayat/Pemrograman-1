public class TugasInheritance
{//main class
	public static void main(String[] args)
	{
		lingkaran ling1,ling2;
		segiEmpat segi4a,segi4b;
		segiTiga segi3a,segi3b;
		bola bola1,bola2;
		kubus kub1,kub2,kub3;
		tabung tab1,tab2,tab3;
		
		ling1=new lingkaran();		//membuat objek
		ling2=new lingkaran();		//membuat objek
		segi4a=new segiEmpat();		//membuat objek
		segi4b=new segiEmpat();		//membuat objek
		segi3a=new segiTiga();		//membuat objek
		segi3b=new segiTiga();		//membuat objek
		bola1=new bola();			//membuat objek
		bola2=new bola();			//membuat objek
		kub1=new kubus();			//membuat objek
		kub2=new kubus();			//membuat objek
		kub3=new kubus();			//membuat objek
		tab1=new tabung();			//membuat objek
		tab2=new tabung();			//membuat objek
		tab3=new tabung();			//membuat objek
		
		//menampilkan data dengan memanggil nilai dari method-method diatas
		System.out.println("\nTUGAS INHERITANCE - PEMROGRAMAN 1");
		System.out.println(" Nama : Muhamad Ismail Hidayat ");
		System.out.println(" Npm  :	4513210023");
		System.out.println(" \nLingkaran ");
		System.out.println(" Luas Lingkaran = "+ling1.hitungLuasLing());
		System.out.println(" Keliling Lingkaran = "+ling2.hitungKelilingLing());
		System.out.println(" \nSEGI EMPAT ");
		System.out.println(" Luas SegiEmpat = "+segi4a.hitungLuasSegi4());
		System.out.println(" Keliling SegiEmpat = "+segi4b.hitungKelilingSegi4());
		System.out.println(" \nSEGITIGA ");
		System.out.println(" Luas Segitiga = "+segi3a.hitungLuasSegi3());
		System.out.println(" Keliling Segitiga = "+segi3b.hitungKelilingSegi3());
		System.out.println(" \nBoLA ");
		System.out.println(" Luas permukaan bola = "+bola1.hitungLuasBola());
		System.out.println(" Volume bola = "+bola2.hitungVolumeBola());
		System.out.println(" \nKUBUS ");
		System.out.println(" Luas kubus "+kub1.hitungLuasKubus());
		System.out.println(" Keliling kubus = "+kub2.hitungKelilingKubus());
		System.out.println(" Volume kubus = "+kub3.hitungVolumeKubus());
		System.out.println(" \nTABUNG ");
		System.out.println(" Luas alas tabung = "+tab1.hitungLuasAlasTabung());
		System.out.println(" Luas selimut tabung = "+tab2.hitungLuasSelimutTabung());
		System.out.println(" Volume tabung = "+tab3.hitungVolumeTabung());
	}
}