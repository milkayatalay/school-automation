public class Egitimci {

    //Mehmet İlkay Atalay 1306140083

    private String ad;
    private String soyad;
    private int personelNo;
    private int dersSayac2=0;
    private String unvan;
    private Ders dersler[]=new Ders[60];

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }


    public String getUnvan() {
        return unvan;
    }

    public Ders[] getDersler() {
        return dersler;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setPersonelNo(int personelNo) {
        this.personelNo = personelNo;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }


    public Egitimci(String ad,String soyad,int personelNo, String unvan){

        setAd(ad);
        setSoyad(soyad);
        setUnvan(unvan);
        setPersonelNo(personelNo);

    }




    public void addDers(Ders dersEk){
        this.dersler[dersSayac2]=dersEk;
        dersSayac2++;
    }


    public Egitimci(boolean delete){
        //boş karaktere eşitleyip silme işlemi yapar
        return;
    }
}
