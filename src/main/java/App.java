import Entity.ComplexNum;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Operation operation = new Operation();
        Representation representation = new Representation();

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Program wykonuje podstawowe operacje na liczbach zespolonych.\n");
        help();

        System.out.println("Liczba Z1: ");
        ComplexNum firstComplex = representation.addNewComplex();
        System.out.println("Liczba Z2: ");
        ComplexNum secondComplex = representation.addNewComplex();

        String doMore = "T";
        String takeNewNum = "N";
        while (doMore.equals("T") || doMore.equals("t")) {
            
            if (takeNewNum.equals("T") || takeNewNum.equals("t")) {
                System.out.println("Liczba Z1: ");
                firstComplex = representation.addNewComplex();
                System.out.println("Liczba Z2: ");
                secondComplex = representation.addNewComplex(); 
            }

            System.out.print("Podaj nr. operacji: ");
            String operationChose = scan.nextLine();

            switch (operationChose) {
            case "0":
                System.out.println("(" + firstComplex + ") + (" + secondComplex + ") = "
                        + operation.add(firstComplex, secondComplex));
                System.out.println("(" + firstComplex + ") - (" + secondComplex + ") = "
                        + operation.subtract(firstComplex, secondComplex));
                System.out.println("(" + firstComplex + ") * (" + secondComplex + ") = "
                        + operation.multiplicate(firstComplex, secondComplex));
                System.out.println("(" + firstComplex + ") / (" + secondComplex + ") = "
                        + operation.divide(firstComplex, secondComplex)); 
                System.out.println("|" + firstComplex + "| = " + operation.modulus(firstComplex));               
                System.out.println("|" + secondComplex + "| = " + operation.modulus(secondComplex));
                System.out.println("Sprzężenie liczby zespolonej " + firstComplex + " wynosi: "
                        + operation.conjugate(firstComplex));
                System.out.println("Sprzężenie liczby zespolonej " + secondComplex + " wynosi: "
                        + operation.conjugate(secondComplex));
                break;
            case "1":
                System.out.println("(" + firstComplex + ") + (" + secondComplex + ") = "
                        + operation.add(firstComplex, secondComplex));
                break;
            case "2":
                System.out.println("(" + firstComplex + ") - (" + secondComplex + ") = "
                        + operation.subtract(firstComplex, secondComplex));
                break;
            case "3":
                System.out.println("(" + firstComplex + ") * (" + secondComplex + ") = "
                        + operation.multiplicate(firstComplex, secondComplex));
                break;
            case "4":
                System.out.println("(" + firstComplex + ") / (" + secondComplex + ") = "
                        + operation.divide(firstComplex, secondComplex));
                break;
            case "5":
                System.out.println("|" + firstComplex + "| = " + operation.modulus(firstComplex));
                System.out.println("|" + secondComplex + "| = " + operation.modulus(secondComplex));
                break;
            case "6":
                System.out.println("Sprzężenie liczby zespolonej " + firstComplex + " wynosi: "
                        + operation.conjugate(firstComplex));
                System.out.println("Sprzężenie liczby zespolonej " + secondComplex + " wynosi: "
                        + operation.conjugate(secondComplex));
                break;
            case "H":
            case "h":
                help();
                break;
            default:
                System.out.println("Nie ma takiej funkcionalności.");
            }

            System.out.print("Czy chcesz wykonać więcej operacji?[T/N]: ");
            doMore = scan.nextLine();

            if (doMore.equals("n") || doMore.equals("n")) 
                break;
            
            System.out.print("Czy chcesz wczytać inne liczby?[T/N]: ");
            takeNewNum = scan.nextLine();
            
        }
 
    }
    
    public static void help() {
        System.out.println(
                "Lista funkcji:\n1.Dodawanie liczb zespolonych,\n2.Odejmowanie liczb zespolonych,\n3.Mnożenie liczb zespolonych\n4.Dzielenie liczb zespolonych,\5.Moduł liczb zespolonych,\n6.Sprzężenie liczb zespolonych.");
        System.out.println("Wybierz operację która ma zostać wykonana\n(wpisanie \"0\" wyświetli wyniki każdej operacji, \"H\" wyświetli spis funkcji).\n");
    }

}
