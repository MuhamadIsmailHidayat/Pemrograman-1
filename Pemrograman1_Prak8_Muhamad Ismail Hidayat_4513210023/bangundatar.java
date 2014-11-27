import java.io.*;
public class bangundatar
{
  public static void main(String[]args) throws IOException
  {
	BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
	String input=null;
	int panjang,lebar,jari,alas,tinggi;
	double luaslingkaran,keliling;
	int pil;
	 
	try
	{
		System.out.println("-------------------------------------");
		System.out.println("Menu Pilihan Anda :");
		System.out.println("1.Menghitung Luas Lingkaran");
		System.out.println("2.Menghitung Keliling Lingkaran");
		System.out.println("-------------------------------------");
		System.out.print("Masukkan Pilihan Anda : ");
		input=dataIn.readLine();
		pil = Integer.parseInt(input);
		System.out.println("-------------------------------------");
	 
		if(pil==1)
		{
		 System.out.println ("MENGHITUNG LUAS LINGKARAN");
		 System.out.print (">> Masukkan jari-jari : ");
		 jari = Integer.parseInt(dataIn.readLine());
		 luaslingkaran = 3.14*jari*jari;
		 System.out.println(">> Luas Lingkaran = "+ luaslingkaran);
		}
		else if(pil==2)
		{
		 System.out.println ("MENGHITUNG KELILING LINGKARAN");
		 System.out.print (">> Masukkan jari-jari : ");
		 jari = Integer.parseInt(dataIn.readLine());
		 keliling = 2*3.14*jari;
		 System.out.println(">> Keliling Lingkaran = "+ keliling);
		}
		else
		{
		 System.out.println("Maaf, Menu yang Anda Pilih Tidak Tersedia .. !!");
		}
	}
		catch( NumberFormatException e )
		{
		 System.out.println("Error!");
		 System.exit(1);
		}
  }
}