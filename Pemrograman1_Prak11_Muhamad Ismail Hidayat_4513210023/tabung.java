class tabung extends bangun
{//membuat kelas turunan (subclass) dari kelas bangun dengan nama tabung
	double hitungLuasAlasTabung()
	{//membuat method untuk menghitung luas tabung
		double luasAlas;					//deklarasi variabel luas alas dengan tipe double
		luasAlas=phi*r*r;					//rumus luas tabung
		return luasAlas;					//mengembalikan nilai
	}
	
	double hitungLuasSelimutTabung()
	{//membaut method untuk menghitung Selimut tabung
		double luasSelimut;					//deklarasi variabel Selimut dengan tipe double
		luasSelimut=2*phi*r*t;				//rumus selimut tabung
		return luasSelimut;					//mengembalikan nilai
	}
	
	double hitungVolumeTabung()
	{//membaut method untuk menghitung Volume tabung
		double volume;					//deklarasi variabel Volume dengan tipe double
		volume=phi*r*r*t;				//rumus volume tabung
		return volume;					//mengembalikan nilai
	}
}