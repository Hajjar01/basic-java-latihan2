package latihan2;

public class SoalD {
    public static void main(String[] args) {

        int n = 100;
        String text = "SIRKA";

        for(int i=0 ; i<n ; i++){
            for(int j= 0 ; j<=i ; j++){
                char letter = text.charAt(j % text.length());
                System.out.print(letter); //tidak perlu pakai petik
            }System.out.println("");
        }
        for(int i=n-1; i>0; i--){
            for(int j=0; j<i; j++){
                char letter = text.charAt(j % text.length());
                System.out.print(letter); //tidak perlu pakai petik
            }
            System.out.println("");
        }
    }
}
