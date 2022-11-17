package sesi6.bangun_ruang;

public class Kerucut extends implemen{
    
    private double jari2 ;
    private double Tinggi ;

    public Kerucut(){
        setJari2(1);
        setTinggi(1);
    }

    public Kerucut(double jari2, double Tinggi) {
        setJari2(jari2);
        setTinggi(Tinggi);
    }

    @Override
    public void setJari2(double jari2){
        this.jari2 = jari2 < 0 ? 1 : jari2 ;
        // if (jari2 < 0){
        //     jari2 = 1 ;
        // }else {
        //     jari2 = 0 ;
        // }
    }

    @Override
    public void setTinggi(double Tinggi){
        this.Tinggi = Tinggi < 0 ? 1 : jari2 ;
    }

    @Override
    public double getVolume(){
        return (1.0 / 3.0) * (3.14 * jari2 * jari2) * Tinggi ;
    }

    @Override
    public void setPanjang(int Panjang) {        
    }

    @Override
    public void setLebar(int Lebar) {
    }

}
