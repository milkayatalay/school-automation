

public class Ogrenci {

    //Mehmet İlkay Atalay 1306140083

    private String ad;
    private String soyad;
    private int numara;

    private int dersSayac1=0;
    Ders arrDers[]=new Ders[60];

    public int getNumara() {
        return numara;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }


    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Ders[] getArrDers() {
        return arrDers;
    }


    public Ogrenci(String ad, String soyad, int numara){

        setNumara(numara);
        setAd(ad);
        setSoyad(soyad);
    }

    public Ogrenci(String ad, String soyad, int numara, int ders){

        setNumara(numara);
        setAd(ad);
        setSoyad(ad);

    }

    public Ogrenci(boolean delete){
        //boş karaktere eşitleyip silme işlemi yapar
        return;
    }

    public void addDers(Ders dersEk){
        this.arrDers[dersSayac1]=dersEk;
        dersSayac1++;
    }


    public int getDersArrLength(){
        return this.arrDers.length;
    }
}
