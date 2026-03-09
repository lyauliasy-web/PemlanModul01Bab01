public class Mobil {

    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan; // km/h
    private double waktu; // jam
    private double waktuDetik;

    public void setNoPlat(String s){
        noPlat = s;
    }

    public void setWarna(String s){
        warna = s;
    }

    public void setManufaktur(String s){
        manufaktur = s;
    }

    public void setKecepatan(int i){
        kecepatan = i;
        rubahKecepatan(); // 
    }

    // 
    public void setWaktu(double w){
        waktu = w;
        rubahSekon(w); // no 5
    }

    // 
    private void rubahSekon(double jam){
        waktuDetik = jam * 3600;
    }

    // 
    private void rubahKecepatan(){
        kecepatan = (int)(kecepatan * 1000 / 3600); // km/h -> m/s
    }

    // 
    public double hitungJarak(){
        double jarak = kecepatan * waktuDetik; // meter
        return jarak;
    }

    public void displayMessage(){

        System.out.println("Mobil anda adalah bermerek "+manufaktur);
        System.out.println("mempunyai nomor plat "+noPlat);
        System.out.println("serta memiliki warna "+warna);
        System.out.println("dan mampu menempuh kecepatan "+kecepatan+" m/s");

        double jarakKM = hitungJarak() / 1000; // no 8
        System.out.println("Jarak yang ditempuh: "+jarakKM+" km");
    }
}