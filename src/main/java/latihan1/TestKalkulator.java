package latihan1;

public class TestKalkulator {

    public static void main(String[] args) {
        //bikin object menggunakan constructor
        Kalkulator casio = new Kalkulator();
        //attribute
        casio.merk = "Casio";
        casio.harga = 50000;
        casio.tambah(10, 50);
        casio.printDataAtribut();

        //object
        Kalkulator alfalink = new Kalkulator();
        alfalink.merk = "Alfalink";
        alfalink.harga = 350000;
        alfalink.printDataAtribut();

    }


}
