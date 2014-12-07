class segiEmpat extends bangun
{//membuat kelas turunan (subclass) dari kelas bangun dengan nama segiEmpat
	double hitungLuasSegi4()
	{//membuat method untuk menghitung luas segiempat
		double luas;				//deklarasi variabel luas dengan tipe double
		luas=p*l;					//rumus luas segiempat
		return luas;				//mengembalikan nilai 
	}
	
	double hitungKelilingSegi4()
	{
		double keliling;			//membuat method untuk menghitung keliling segiempat
		keliling=2*(p+l);			//rumus keliling segiempat
		return keliling;			//mengembalikan nilai
	}
}