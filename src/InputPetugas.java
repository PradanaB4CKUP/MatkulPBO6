public class InputPetugas {
    String KodeBarang, NamaBarang;
    Double JumlahBarang;
    Double HargaBarang;

    public InputPetugas(String x, Double y){
        KodeBarang = x;
        JumlahBarang = y;
        getKodeBarang();
    }

    public String getKodeBarang(){
        switch (KodeBarang) {
            case "P001":
                    NamaBarang = "Printer";
                    HargaBarang = 700000.00;
                break;
            
            case "V001":
                    NamaBarang = "VGA Card";
                    HargaBarang = 75000.00;
                break;
            
            case "M001":
                    NamaBarang = "Mother Board";
                    HargaBarang = 950000.00;
                break;

            default:
                    NamaBarang = "Barang Tidak Tersedia";
                    HargaBarang = 0.00;
                break;
        }
        return KodeBarang;
    }

    public String getNamaBarang(){
        return NamaBarang;
    }

    public Double getHargaBarang(){
        return HargaBarang;
    }

    public Double getJumlahBarang(){
        return JumlahBarang;
    }

    public Double getJumlahHarga(){
        return JumlahBarang * HargaBarang;
    }


    public void hasil(){
        System.out.println("Kode Barang : " + KodeBarang);
        System.out.println("Nama Barang : " + NamaBarang);
        System.out.println("Harga Barang : " + HargaBarang);
        System.out.println("Jumlah Barang : " + JumlahBarang);
        System.out.println("Jumlah Harga : " + getJumlahHarga());
    }
}
