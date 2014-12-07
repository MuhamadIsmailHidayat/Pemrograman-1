public class mahasiswa {	//Nama class
    String NIM;		//Mendeklarasikan variabel NIM dengan tipe data String
	String NAMA;	//Mendeklarasikan variabel NAMA dengan tipe data String
	String IPK;		//Mendeklarasikan variabel IPK dengan tipe data String
	String SEMESTER;	//Mendeklarasikan variabel SEMESTER dengan tipe data String

    public String getNIM()		//Inisialisasi variabel NIM dengan getter
	{
        return NIM;				//Mengembalikkan nilai NIM
    }
	public void setNIM(String NIM)	//Mendeklarasikan variabel NIM menggunakan setter dengan tipe data String
	{
        this.NIM = NIM;
    }

    public String getNAMA()		//Inisialisasi variabel NAMA dengan getter
	{
        return NAMA;			//Mengembalikkan nilai NAMA
    }
	public void setNAMA(String NAMA)	//Mendeklarasikan variabel NAMA menggunakan setter dengan tipe data String
	{
        this.NAMA = NAMA;
    }

    public String getIPK()		//Inisialisasi variabel IPK dengan getter
	{
        return IPK;				//Mengembalikkan nilai IPK
    }
	public void setIPK(String IPK)	//Mendeklarasikan variabel IPK menggunakan setter dengan tipe data String
	{
        this.IPK = IPK;
    }

    public String getSEMESTER()		//Inisialisasi variabel SEMESTER dengan getter
	{
        return SEMESTER;			//Mengembalikkan nilai SEMESTER
    }
    public void setSEMESTER(String SEMESTER)	//Mendeklarasikan variabel SEMESTER menggunakan setter dengan tipe data String
	{
        this.SEMESTER = SEMESTER;
    }
	
	public static void main(String [] args)
	{
	mahasiswa up = new mahasiswa();
	up.setNIM("4513210023"); //mengisi nilai dari setter NIM 
	System.out.print("\n NIM		: "); //output NIM
	System.out.print(up.getNIM()); //memanggil setter NIM dengan getter
		
	up.setNAMA("MUHAMAD ISMAIL HIDAYAT"); //mengisi nilai dari setter NAMA
	System.out.print("\n NAMA		: "); //output NAMA
	System.out.print(up.getNAMA()); //memanggil setter NAMA dengan getter
		
	up.setIPK("3,50"); //mengisi nilai dari setter IPK
	System.out.print("\n IPK		: "); //output IPK
	System.out.print(up.getIPK()); //memanggil setter IPK dengan getter
		
	up.setSEMESTER("3 \n"); //mengisi nilai dari setter SEMESTER
	System.out.print("\n SEMESTER	: "); //output SEMESTER
	System.out.print(up.getSEMESTER()); //memanggil setter SEMESTER dengan getter
	}
}