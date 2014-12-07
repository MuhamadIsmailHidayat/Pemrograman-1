public class mahasiswa
	{
	int nilai;
	public static void main(String[]args)
	{
	mahasiswa orang = new mahasiswa();
	orang.setNilai(98);
	System.out.println("Nilaiku adalah = "+orang.getNilai());
	}
	
	public void setNilai(int nilaiku)
	{
	this.nilai=nilaiku;
	}
	
	public int getNilai()
	{
	return this.nilai;
	}
}