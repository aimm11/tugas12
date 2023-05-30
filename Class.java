kelas  publik LinearSearchNumber {
    public  static  int  linearSearch ( int [] arr , int  key ) {
        for ( int  i = 0 ; i < arr . length ; i ++) {
            jika ( arr [ i ] == kunci ) {
                kembali  saya ; // Mengembalikan indeks jika data ditemukan
            }
        }
        kembali - 1 ; // Mengembalikan -1 jika data tidak ditemukan
    }

    public  static  void  main ( String [] args ) {
        int [] bilangan = { 2 , 5 , 8 , 10 , 13 , 18 , 20 };
        int  kuncipencarian = 13 ;
        int  result = linearSearch ( angka , searchKey );
        
        jika ( hasil == - 1 ) {
            Sistem . keluar . println ( "Data tidak ditemukan" );
        } lain {
            Sistem . keluar . println ( "Data ditemukan pada indeks ke-" + result );
        }
    }
}