import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a = 0;
//        int b = 0;
//        float rez = 0;
//        a++;
//        b--;
//        rez = a * b +5;
//        System.out.println(rez);
        Scanner sc = new Scanner(System.in);
        String[]  dienosMasyvas = {"Pirmadienis", "Antradienis", "Treciadienis", "Ketvirtadienis", "Penktadienis", "Sestadienis", "Sekmadienis"};
        System.out.println("Masyvo dienos dydis: " + dienosMasyvas.length);
        System.out.println("Paskutinis masyvo elementas: " + dienosMasyvas[6]);
        System.out.println("Iveskite skaiciu nuo 1-7");

        int skaicius = sc.nextInt();
//        String elementas = dienosMasyvas[skaicius];
//        System.out.println("Pasirinkta diena: " + elementas);


        switch(skaicius){
            case 1:
                System.out.println(dienosMasyvas[0]);
                break;
            case 2:
                System.out.println(dienosMasyvas[1]);
                break;
            case 3:
                System.out.println(dienosMasyvas[2]);
                break;
            case 4:
                System.out.println(dienosMasyvas[3]);
                break;
            case 5:
                System.out.println(dienosMasyvas[4]);
                break;
            case 6:
                System.out.println(dienosMasyvas[5]);
                break;
            case 7:
                System.out.println(dienosMasyvas[6]);
                break;
            default:
                System.out.println("??????????");
        }


    }
}
