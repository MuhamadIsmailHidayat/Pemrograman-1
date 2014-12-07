class segiTiga extends bangun
{//membuat kelas turunan (subclass) dari kelas bangun dengan nama segitiga
	double hitungLuasSegi3()
	{//membuat method untuk menghitung luas segitiga
		double luas;				//deklarasi variabel luas dengan tipe double
		luas=0.5*a*t;				//rumus luas segitiga
		return luas;				//mengembalikan nilai
	}
	
	double hitungKelilingSegi3()
	{	
		double keliling;			//deklarasi variabel keliling dengan tipe double
		keliling=s1+s2+s3;			//rumus keliling segitiga
		return keliling;			//mengembalikan nilai
	}
}