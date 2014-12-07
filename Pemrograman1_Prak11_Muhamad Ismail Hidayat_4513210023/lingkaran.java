class lingkaran extends bangun
{//membuat kelas turunan(subclass) dari kelas bangun dengan nama lingkaran
	double hitungLuasLing()
	{//membuat method untuk menghitung luas lingkaran
		double luas;				//deklarasi variabel luas dengan tipe double 
		luas=phi*r*r;				//rumus luas lingkaran
		return luas;				//mengembalikan nilai
	}
	
	double hitungKelilingLing()
	{//membuat method untuk menghitung keliling
		double keliling;			//deklarasi variabel keliling dengan tipe double
		keliling=2*phi*r;			//rumus keliling lingkaran
		return keliling;
	}
}