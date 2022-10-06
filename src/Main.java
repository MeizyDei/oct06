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

        if(skaicius >=1 || skaicius <=7){
            if(skaicius == 1){
                System.out.println(dienosMasyvas[0]);
            }else if(skaicius == 2){
                System.out.println(dienosMasyvas[1]);
            }else if(skaicius == 3){
                System.out.println(dienosMasyvas[2]);
            }else if(skaicius == 4){
                System.out.println(dienosMasyvas[3]);
            }else if(skaicius == 5){
                System.out.println(dienosMasyvas[4]);
            }else if(skaicius == 6){
                System.out.println(dienosMasyvas[5]);
            }else if(skaicius == 7){
                System.out.println(dienosMasyvas[6]);
            }
        }else{
            System.out.println("??????");
        }

    }
}
