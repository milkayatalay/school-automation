public class Ders {

    //Mehmet İlkay Atalay 1306140083

    private String ad;
    private int kredi;
    private int vizeNot=0;
    private int finalNot=0;
    private int not=0;
    private boolean basari=false;

    public String getAd() {
        return ad;
    }

    public int getKredi() {
        return kredi;
    }

    public int getNot() {
        return not;
    }

    public boolean isBasari() {
        if(this.basari==true){
            System.out.println("Gecti");
        }
        System.out.println("Kaldi\n");
        return basari;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setKredi(int kredi) {
        this.kredi = kredi;
    }

    public void setVizeNot(int vizeNot) {
        this.vizeNot = vizeNot;
    }

    public void setFinalNot(int finalNot) {
        int calculate;
        this.finalNot = finalNot;

        calculate=(this.vizeNot+finalNot)/2;
        setNot(calculate);

    }

    private void setNot(int not) {

        if(not>50){
            this.basari=true;
        }

        this.not = not;
    }

    public Ders(String ad, int kredi){

        setAd(ad);
        setKredi(kredi);
    }

    public Ders(boolean free){
        //bos class ekleme amacli
        return;
    }


}
