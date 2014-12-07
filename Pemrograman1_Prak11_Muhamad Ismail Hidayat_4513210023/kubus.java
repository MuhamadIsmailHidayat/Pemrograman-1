class kubus extends bangun
{//membuat kelas turunan (subclass) dari kelas bangun dengan nama kubus
	double hitungLuasKubus()
	{//membuat method untuk menghitung luas kubus
		double luas;				//deklarasi variabel luas dengan tipe double
		luas=6*rusuk*rusuk;			//rumus luas kubus
		return luas;				//mengembalikan nilai
	}
	
	double hitungKelilingKubus()
	{//membaut method untuk menghitung keliling kubus
		double keliling;			//deklarasi variabel keliling dengan tipe double
		keliling=12*rusuk;			//rumus keliling kubus
		return keliling;			//mengembalikan nilai
	}
	
	double hitungVolumeKubus()
	{//membaut method untuk menghitung Volume kubus
		double volume;				//deklarasi variabel Volume dengan tipe double
		volume=rusuk*rusuk*rusuk;	//rumus Volume kubus
		return volume;			//mengembalikan nilai
	}
}