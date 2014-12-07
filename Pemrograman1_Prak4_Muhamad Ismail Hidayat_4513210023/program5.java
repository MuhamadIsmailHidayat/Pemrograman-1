public class program5{
	public static void main (String[]args){
	int i,jumlah;
	jumlah=0;
	for (i=0; i<=10; i++)
		{
		jumlah=jumlah + i;
		if(jumlah % 2 ==1)
			{
			System.out.println (jumlah);
			}
		}
	}
}