import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihanKasus {
    public static void main(String[] args) throws IOException {
        
        String namaPetugas;
        String tglInput;
        int d, i;
        String [] Kb; 
        Double [] Jb;
        //deklarasi proses input
        InputStreamReader key = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(key);

        //Header
        System.out.println("PT. PERMATA PRATAMA");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Masukkan Nama Petugas : "); namaPetugas = input.readLine();
        System.out.print("Tanggal Input : "); tglInput = input.readLine();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        System.out.print("Jumlah Data Yang Akan Dimasukkan : "); d=Integer.parseInt(input.readLine());
        System.out.println("========================================================================");

        //Instansiasi
        Kb = new String [d];
        Jb = new Double [d];

        //Proses Input
        for (i=0; i<d; i++){
            System.out.print("Masukkan Kode Barang : "); Kb[i]=input.readLine();
            System.out.print("Masukkan Jumlah Barang : "); Jb[i]=Double.parseDouble(input.readLine());
            System.out.println("========================================================================");
        }

            System.out.println("PT. PERMATA PRATAMA");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Petugas : "+namaPetugas);
            System.out.println("Tanggal Input : "+tglInput);
            System.out.println("jumlah yang diinput : " + d);
            System.out.println("--------------------------------------------------------------------------");
            System.out.print(" No ");
            System.out.print(" Kode Barang ");
            System.out.print(" Nama Barang ");
            System.out.print(" Harga Barang ");
            System.out.print(" Jumlah Barang ");
            System.out.println(" Total Harga ");

        //Proses Output
        Double totalHargaKeseluruhan = 0.0;
        int j = 1;
        for (i=0; i<d; i++){
            InputPetugas ObjLoopArray = new InputPetugas(Kb[i], Jb[i]);
            Double totalHarga = ObjLoopArray.getJumlahHarga();
            totalHargaKeseluruhan += totalHarga;
            System.out.print("   "+ j +" ");
            System.out.print("   "+ObjLoopArray.getKodeBarang()+" ");
            System.out.print("   "+ObjLoopArray.getNamaBarang()+" ");
            System.out.print("   "+ObjLoopArray.getHargaBarang()+" ");
            System.out.print("   "+ObjLoopArray.getJumlahBarang()+" ");
            System.out.print("   "+ObjLoopArray.getJumlahHarga()+" ");
            System.out.println("   "+totalHarga+" ");
            j++;
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Total pendapatan pada tanggal : " + tglInput.toString());
        System.out.println(" adalah Rp. " + totalHargaKeseluruhan);
        System.out.println("Terima Kasih Telah Menggunakan Program Kami");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

}
