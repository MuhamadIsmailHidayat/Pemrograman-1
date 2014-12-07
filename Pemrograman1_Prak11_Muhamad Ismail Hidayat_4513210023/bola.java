class bola extends bangun
{//membuat kelas turunan (subclass) dari kelas bangun dengan nama bola
	double hitungLuasBola()
	{//membuat method untuk menghitung luas bola
		double luas;				//deklarasi variabel luas dengan tipe double
		luas=4*phi*r*r;				//rumus luas bola
		return luas;				//mengembalikan nilai
	}
	
	double hitungVolumeBola()
	{//membuat method untuk menghitung Volume bola
		double volume;				//deklarasi variabel volume dengan tipe double
		volume=(4*phi*r*t*t*t)/3;	//rumus volume bola
		return volume;				//mengembalikan nilai
	}
}