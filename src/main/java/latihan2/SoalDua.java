package latihan2;

public class SoalDua {
    public static void main(String[] args) {
        int n = -100;

        if(n<0)
            System.out.println("Tidak Valid");
        else if(n<10)
            System.out.println("Satuan");
        else if(n<100)
            System.out.println("Puluhan");
        else if(n<1000)
            System.out.println("Ratusan");
        else if(n<10000)
            System.out.println("Ribuan");
        else if(n<100000)
            System.out.println("Puluh Ribuan");
        else
            System.out.println("Tidak Valid");
    }
}
