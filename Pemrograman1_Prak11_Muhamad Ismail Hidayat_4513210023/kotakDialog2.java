import javax.swing.JOptionPane;
public class kotakDialog2
{
	public static void main(String args[])
	{
		String nama = JOptionPane.showInputDialog("Siapa Nama Anda?");
		String pesan = String.format("Welcome,%s!!",nama);
		JOptionPane.showMessageDialog(null,pesan);
	}
}