package praktek03;


public class bunga {
    private String jenis;
    private String warna;
    private String harga;
    
    void cetakInfo(){
        System.out.println("Merk \t: "+jenis+"\n"+
                "warna \t: "+warna+"\n"+
                "harga \t: "+harga);
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
    
  
    
}
