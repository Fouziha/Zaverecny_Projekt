
package cz.itnetwork.evidencepojisteni;

public class Pojisteny {
    private String Jmeno;
    private String Prijmeni;
    private int Vek;
    private String Tel;
    
    public Pojisteny(String Jmeno, String Prijmeni, int Vek, String Tel){
        this.Jmeno = Jmeno;
        this.Prijmeni = Prijmeni;
        this.Vek = Vek;
        this.Tel = Tel;
       }
    public String getJmeno(){
        return Jmeno;
    }
    public String getPrijmeni(){
        return Prijmeni;
    }
    public int getVek(){
        return Vek;
    }
    public String getTel(){
        return Tel;
    }
    @Override
    public String toString(){
        return "Jmeno: "+ Jmeno +"  "+"Prijmeni: "+ Prijmeni +" "+"Vek:"+ Vek +" "+"Telefonni cislo: "+ Tel ;
        
    }

    void add(Pojisteny pojisteny) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
