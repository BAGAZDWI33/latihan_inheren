public class pegawai {
    private String Nama;
    private double GajiPokok;

    //setter
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void  setGajiPokok(double GajiPokok){
        this.GajiPokok = GajiPokok;
    }
    public String getNama(){
        return this.Nama;
    }
    public double getGajiPokok(){
        return this.GajiPokok;
    }


    public static void main(String[] args) {
        //person sebagai object
        pegawai pegawai = new pegawai();
        /*memanggil atribut dan memberikan nilai */
        pegawai.setNama("Anton");
        pegawai.setGajiPokok(23);
        System.out.println("Nama          : " + pegawai.getNama());
        System.out.println("Umur          : " + pegawai.getGajiPokok());

    }
}
