import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        //ESERCIZIO 1 *
        System.out.println(stringaPariDispari("Mi chiamo Laura"));
        System.out.println(annoBisestile(2023));


        //ESERCIZIO 2 °
        System.out.print("Scegli un numero da 0 a 3: ");
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        intToString(number);



        //ESERCIZIO 3 #
        while(true) {
            System.out.println("Scrivi una parola: ");
            String str = scanner.nextLine();
            if(str.equals(":q")) {
                System.out.print("Fine");
                break;
            } else {
                stampaStringa(str);
            }
        }


        //ESERCIZIO 4 $
        System.out.println("Scegli un numero: ");
        int number1 = scanner.nextInt();
        contoAllaRovescia(number1);
    }


    //ESERCIZIO 1 *
    public static boolean stringaPariDispari(String str){
        return str.length() % 2 == 0;
    }
    public static boolean annoBisestile(int anno){
        return anno % 4 == 0 || anno % 400 == 0 && anno % 100 != 0;
    }


     //ESERCIZIO 2 °
    public static void intToString(int number) {
        switch (number) {
            case 0: {
                System.out.println("Zero");
                break;
            }
            case 1: {
                System.out.println("Uno");
                break;
            }
            case 2: {
                System.out.println("Due");
                break;
            }
            case 3: {
                System.out.println("Tre");
                break;
            }
            default: {
                System.out.println("Il numero scelto non è compreso tra 0 e 3");
            }
        }
    }


    //ESERCIZIO 3 #
    public static void stampaStringa(String str) {
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));

            if(i < str.length() -1) {
                System.out.println(",");
            } else {
                System.out.println();
            }
        }
    }


    //ESERCIZIO 4 $
    public static void contoAllaRovescia(int number) {
        for (int i = number; i >= 0; i--){
            System.out.println(i);
        }
    }

}