import java.util.Scanner;

public class GirilenSayinin3Ve4eTamBolunmesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i,k;
        System.out.print("Sayı Giriniz:");
        k = input.nextInt();
        System.out.println("3 ve 4'e Tam Bölünen Sayılar:");
        for (i=1; i<=k; i++){
            if(i % 3 == 0 && i % 4 == 0 ){
                System.out.println(i);
            }

        }
    }
}
