package praktek03;
public class bungaAksi {
    public static void main(String[] args) {
        bunga s = new bunga();

        s.setJenis("Butterfly");
        s.setWarna("putih");
        s.setHarga("15000");
        
        s.cetakInfo();
        System.out.print("Jenisnya \t: ");
        System.out.println(s.getJenis());
        System.out.print("Warnanya \t: ");
        System.out.println(s.getWarna());
        System.out.print("harganya \t: ");
        System.out.println(s.getHarga());
        
        BungaMawar sm = new BungaMawar();
        sm.setJenis("mawarkunig");
        sm.setWarna("merah");
        sm.setHarga ("9000");
        sm.setJenisBunga("manis");
        sm.cetakInfo();
        System.out.println("Jenis Bunga \t :"+sm.getJenisBunga());
        sm.throttle();
        
        
    }
}
