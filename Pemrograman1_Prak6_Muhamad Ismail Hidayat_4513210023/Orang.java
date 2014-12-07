class Orang
{
String Nama;
		public String getNama()
		{
		return Nama;
		}
		
		public void setNama(String x)
		{
		this.Nama=x;
		}
		
		public static void main(String[]args)
		{
		Orang orangPertama = new Orang();
		orangPertama.setNama("Muhamad Ismail\n");
		System.out.print("\nNama Anda Adalah : ");
		System.out.print(orangPertama.getNama());
		}
}