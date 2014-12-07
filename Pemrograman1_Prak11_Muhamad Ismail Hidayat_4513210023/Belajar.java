class Belajar
{
	double a,b;
	public Belajar ()
	{//constructor
		a=10;
		b=5;
	}

	String matkul()
	{//method menampilkan nama matkul
		String namaMatkul;
		namaMatkul = "Kalkulus";
		return namaMatkul;
	}

	double tambah()
	{//method tambah
		double total;
		total=a+b;
		return total;
	}

	double tambah(double c,double d)
	{//method tambah overloading
		double total;
		total=c+d;
		return total;
	}
}