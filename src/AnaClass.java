import java.util.Scanner;


//Mehmet İlkay Atalay 1306140083



public class AnaClass {

    public int dersNoCek;


    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        Ogrenci dizi[]=new Ogrenci[60];
        Egitimci array[]=new Egitimci[60];
        Ogrenci free=new Ogrenci(true);
        Egitimci frer=new Egitimci(true);
        Ders tumDersler[]=new Ders[60];
        int ogrenciSayac=0;
        int egitmenSayac=0;
        int dersSayac=0;
        int i =0;
        int a=0;
        int b=0;
        int c=0;
        int d=0;


        while(true) {

            System.out.println("Ogrenci isleri otomasyonuna hosgeldiniz");
            System.out.println("Secim yapiniz\n");
            System.out.println("Ogrenci menusu icin 1");
            System.out.println("Egitimci menusu icin 2");
            System.out.println("Ogrenci isleri menusu icin 3\n");



            switch (input.nextInt()) {
                case 1:
                    System.out.println("Ogrenci menusundesiniz");
                    System.out.println("Secim yapiniz\n");
                    System.out.println("Ders secimi icin 1");
                    System.out.println("Notlarinizi goruntulemek icin 2");
                    System.out.println("Ozluk bilgilerinizi duzenlemek icin 3\n");

                    switch (input.nextInt()) {
                        case 1:
                            //burada ogrenci numarası istenecek sonrasında secim yaptırılacak
                            System.out.println("Ogrenci numaranizi giriniz");
                            int oNu=input.nextInt();

                            while(b<=tumDersler.length){
                                System.out.printf("%d  %s ",b,tumDersler[b].getAd());
                                b++;
                            }

                            System.out.println("Eklenecek dersin numarasını giriniz");
                            int deNu=input.nextInt();
                            dizi[oNu].addDers(tumDersler[deNu]);
                            System.out.printf("Ders %d eklendi",deNu);

                            break;
                        case 2:
                            //ogrenci numarasi istenecek ve dersler listelenecek. secilen dersin adı girilecek notu ve geçme durumu gösterilecek
                            System.out.println("Ogrenci numaranizi giriniz");
                            int oNu1=input.nextInt();

                            Ders[] show=dizi[oNu1].getArrDers();
                            while (i<=show.length){
                                String gosterDers=show[i].getAd();
                                System.out.printf("%s",gosterDers);
                                System.out.printf("not    %d",show[i].getNot());
                                System.out.printf("kredi  %d",show[i].getKredi());
                                System.out.printf("basari %b",show[i].isBasari());
                                i++;
                            }

                            break;
                        case 3:
                            //numara istenecek duzenlenecek
                            System.out.println("Ogrenci numaranizi giriniz");
                            int oNu2=input.nextInt();

                            System.out.printf("Adiniz %s \n",dizi[oNu2].getAd());
                            System.out.printf("Soyadiniz %s\n",dizi[oNu2].getSoyad());
                            System.out.println("Düzenlemek icin secim yapiniz");
                            System.out.println("ad duzenlemek icin 1");
                            System.out.println("soyad duzenlemek icin 2");

                            switch (input.nextInt()){
                                case 1:
                                    System.out.println("ad giriniz");
                                    dizi[oNu2].setAd(input.next());
                                    System.out.println("düzenlendi");
                                    break;
                                case 2:
                                    System.out.println("soyad giriniz");
                                    dizi[oNu2].setSoyad(input.next());
                                    System.out.println("düzenlendi");
                                    break;
                            }

                            break;
                        default:
                            System.out.println("Geçersiz secim!\n");
                    }

                    break;
                case 2:
                    System.out.println("Egitimci menusundesiniz");
                    System.out.println("Secim yapiniz\n");
                    System.out.println("Not girmek icin 1");
                    System.out.println("Ders belirlemek icin 2");
                    System.out.println("Ozluk bilgilerini düzenlemek icin 3\n");

                    switch (input.nextInt()) {
                        case 1:
                            while (a<=dizi.length){
                                System.out.printf("%d %s %s\n",dizi[a].getNumara(),dizi[a].getAd(),dizi[a].getSoyad());
                                a++;
                            }
                            System.out.println("Notu girilecek ogrencinin numarasını giriniz");
                            int numaramsı=input.nextInt();

                            Ders[] show3=dizi[numaramsı].getArrDers();

                            while(c<=show3.length){
                                System.out.printf("%d  %s ",c,show3[c].getAd());
                                c++;
                            }

                            System.out.println("Notu girilecek dersin numarasını giriniz");

                            int dersGirNot=input.nextInt();

                            System.out.println("Vize Not giriniz");

                            dizi[numaramsı].getArrDers()[dersGirNot].setVizeNot(input.nextInt());

                            System.out.println("Final Not giriniz(girilmediyse 0 giriniz)");

                            dizi[numaramsı].getArrDers()[dersGirNot].setFinalNot(input.nextInt());

                            break;
                        case 2:
                            //ad istenecek ve ders kaydettirilecek

                            System.out.println("Egitmen numaranızı giriniz.");
                            int egtNum=input.nextInt();

                            while (d<=tumDersler.length){
                                System.out.printf("%d %s ",d,tumDersler[d].getAd());
                                d++;
                            }
                            System.out.println("Verilecek dersin numarasını giriniz");
                            int alinanDers=input.nextInt();

                            array[egtNum].addDers(tumDersler[alinanDers]);
                            System.out.printf("Ders %d basariyla alindi.",alinanDers);

                            break;
                        case 3:
                            //ad istenecek duzenlenecek
                            System.out.println("Egitmen numaranizi giriniz");
                            int enu2=input.nextInt();

                            System.out.printf("Adiniz %s \n",array[enu2].getAd());
                            System.out.printf("Soyadiniz %s\n",array[enu2].getSoyad());
                            System.out.println("Düzenlemek icin secim yapiniz");
                            System.out.println("ad duzenlemek icin 1");
                            System.out.println("soyad duzenlemek icin 2");

                            switch (input.nextInt()){
                                case 1:
                                    System.out.println("ad giriniz");
                                    array[enu2].setAd(input.next());
                                    System.out.println("düzenlendi");
                                    break;
                                case 2:
                                    System.out.println("soyad giriniz");
                                    array[enu2].setSoyad(input.next());
                                    System.out.println("düzenlendi");
                                    break;
                            }

                            break;
                        default:
                            System.out.println("Geçersiz secim!\n");
                    }

                    break;
                case 3:
                    System.out.println("Ogrenci isleri menusundesiniz");
                    System.out.println("Secim yapiniz\n");
                    System.out.println("Ogrenci eklemek icin 1");
                    System.out.println("Egitimci eklemek icin 2");
                    System.out.println("Ogrenci silmek icin 3");
                    System.out.println("Egitimci silmek icin 4");
                    System.out.println("Ders oluşturmak icin 5\n");

                    switch (input.nextInt()) {
                        case 1:
                            //bilgiler alınacak oğrenci oluşturulacak
                            System.out.println("Eklenecek ogrenci icin ad giriniz\n");
                            String ad=input.next();

                            System.out.println("Soyad giriniz\n");
                            String soyad=input.next();

                            dizi[ogrenciSayac]=new Ogrenci(ad,soyad,ogrenciSayac);
                            System.out.printf("Ogrenci %d eklendi.\n",ogrenciSayac);
                            ogrenciSayac++;


                            break;
                        case 2:
                            //bilgiler alınacak egitmen olusturulacak
                            System.out.println("Eklenecek egitmen icin ad giriniz\n");
                            String ad1=input.next();

                            System.out.println("Soyad giriniz");
                            String soyad1=input.next();

                            System.out.println("Unvan giriniz");
                            String unvan1=input.next();

                            array[egitmenSayac]=new Egitimci(ad1,soyad1,egitmenSayac,unvan1);
                            System.out.printf("Egitmen %d eklendi.\n",egitmenSayac);
                            egitmenSayac++;


                            break;
                        case 3:
                            //ad alınacak silinecek
                            System.out.println("Silmek istediğiniz ogrencinin numarasını giriniz");
                            int silNum=input.nextInt();
                            dizi[silNum]=free;
                            System.out.printf("Ogrenci %d silindi.",silNum);
                            break;
                        case 4:
                            //ad alınacak free yapılacak
                            System.out.println("Silmek istediğiniz egitmenin numarasını giriniz");
                            int silEgt=input.nextInt();
                            array[silEgt]=frer;
                            System.out.printf("Egitmen %d silindi.",silEgt);
                            break;
                        case 5:
                            System.out.println("Eklenecek(oluşturulacak) dersin adını giriniz");
                            String dersad=input.next();
                            System.out.println("Eklenecek(oluşturulacak) dersin kredisini giriniz");
                            int derskir=input.nextInt();

                            Ders yeniDers=new Ders(dersad,derskir);
                            tumDersler[dersSayac]=yeniDers;
                            System.out.printf("Ders %d eklendi",dersSayac);
                            dersSayac++;

                            break;
                        default:
                            System.out.println("Geçersiz secim!\n");
                    }
                    break;

                default:
                    System.out.println("Geçersiz secim!\n");

            }

        }


//Mehmet İlkay Atalay 1306140083


    }

}
