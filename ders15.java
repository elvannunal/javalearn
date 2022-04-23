import java.util.Scanner;

public class ders15 {
    public static void main(String[] args) {
        int gün,ay;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen doğduğunuz ayı sayı olarak giriniz: ");
        ay= input.nextInt();
        System.out.println("Lütfen doğduğunuz günü giriniz: ");
        gün= input.nextInt();

        if(ay==1){
            if(gün<=21){
                System.out.println("Oglak");
            }else{
                System.out.println("Kova");
            }
        }
        if(ay==2){
            if(gün<=19){
                System.out.println("Kova");
            }else{
                System.out.println("Balık");
            }
        }
        if(ay==3){
            if(gün<=20){
                System.out.println("Balık");
            }else{
                System.out.println("Koc");
            }
        }
        if(ay==4){
            if(gün<=20){
                System.out.println("Koc");
            }else{
                System.out.println("Boğa");
            }
        }
        if(ay==5){
            if(gün<=21){
                System.out.println("Boğa");
            }else{
                System.out.println("İkizler");
            }
        }
        if(ay==6){
            if(gün<=22){
                System.out.println("İkizler");
            }else{
                System.out.println("Yengec");
            }
        }
        if(ay==7){
            if(gün<=21){
                System.out.println("Yengec");
            }else{
                System.out.println("Aslan");
            }
        }
        if(ay==8){
            if(gün<=22){
                System.out.println("Aslan");
            }else{
                System.out.println("Basak");
            }
        }
        if(ay==9){
            if(gün<=22){
                System.out.println("Basak");
            }else{
                System.out.println("Terazi");
            }
        }
        if(ay==10){
            if(gün<=22){
                System.out.println("Terazi");
            }else{
                System.out.println("Akrep");
            }
        }
        if(ay==11){
            if(gün<=21){
                System.out.println("Akrep");
            }else{
                System.out.println("Yay");
            }
        }
        if(ay==12){
            if(gün<=21){
                System.out.println("Yay");
            }else{
                System.out.println("Oğlak");
            }
        }

    }
}
