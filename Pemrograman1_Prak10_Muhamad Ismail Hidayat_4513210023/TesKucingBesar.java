//Perintah Inheritance
//Kelas turunannya
public class TesKucingBesar
{
	public static void main (String[] args)
	{
	 Singa mySinga = new Singa("SIMBARA SURAI");
	 System.out.println("Singa merupakan " +Singa.nama);
	 mySinga.Makan();
	
	 Harimau myHarimau = new Harimau("HARIMAU SUMATERA");
	 System.out.println("Harimau merupakan " +Harimau.nama);
	 myHarimau.Makan();
	}	
}