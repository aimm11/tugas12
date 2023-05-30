kelas  publik LinearSearchStudent {
    public  static  void  linearSearch ( String [] nama , int [] nim , String [] alamat , kunci String  ) {
        boolean  ditemukan = salah ;
        for ( int  i = 0 ; i < nama .panjang ; i ++) {
            if ( nama [ i ]. equalsIgnoreCase ( kunci )) {
                Sistem . keluar . println ( nim [ i ] + " - " + nama [ i ] + " - " + alamat [ i ] + " - Data nomor " + ( i + 1 ));
                ditemukan = benar ;
            }
        }
        jika (! ditemukan ) {
            Sistem . keluar . println ( "Data yang Anda cari tidak ditemukan" );
        }
    }

    public  static  void  main ( String [] args ) {
        String [] nama = { "Andri Hariadi" , "Dewi Lestari" , "Dewi Agustin" , "Reni Indrayanti" , "Toni Sukmawan" , "Toni Gunawan" };
        int [] nim = { 1102021 , 1102021 , 1102023 , 1102024 , 1102025 , 1102026 };
        String [] alamat = { "BANDUNG" , "SURABAYA" , "MALANG" , "MALANG" , "SURABAYA" , "BANDUNG" };

        String  searchKey = "Toni" ;
        linearSearch ( nama , nim , alamat , searchKey );
    }