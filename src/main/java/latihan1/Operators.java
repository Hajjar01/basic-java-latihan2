package latihan1;

public class Operators {
    //psvm + tab
    public static void main(String[] args){
        //aritmetic operator
        int angka1 = 10 + 2;
        int angka2 = 10;
        int angka3 = 20;
        int total = angka2 + angka3;
        int hasilKali = angka2 * angka3;
        int hasilBagi = angka2 / angka3;
        int hasilKurang = angka2 - angka3;

        //unary
        int angka4 = 10;
        angka4++;
        angka4--;

        //logical operator
        boolean hasilCek1 = angka2 == angka3;
        boolean hasilCek2 = angka2 > angka3;
        boolean hasilCek3 = angka2 >= angka3;
        boolean hasilCek4 = angka2 < angka3;
        boolean hasilCek5 = angka2 <= angka3;

        boolean hasilCek6 = angka2 < angka3 && angka2 > angka1;
        boolean hasilCek7 = angka2 < angka3 || angka2 > angka1;

        System.out.println(hasilCek1);

        System.out.println(hasilCek6);
        System.out.println(hasilCek7);


    }

}
