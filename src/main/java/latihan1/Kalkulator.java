package latihan1;

public class Kalkulator {

    //attribut
    String merk;
    int harga;

    //constructor
    //accsess_modifier nama_class(parameter)
    public Kalkulator(){
        //memang kosong hanya untuk membuat object
    }

    public Kalkulator(String merk, int harga) {
        this.merk = merk;
        this.harga = harga;
    }

    //methods
    //access_midifier return_value nama(parameter)
    public void tambah(int bila, int bilb) {

        int hasil= bila + bilb;
        System.out.println(hasil);
    }

    public void kurang(int bila, int bilb) {

    }

    public void printDataAtribut() {
        System.out.println(merk);
        System.out.println(harga);
    }


}
