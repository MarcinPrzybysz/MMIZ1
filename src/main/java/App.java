import java.util.Scanner;

import Entity.ComplexNum;

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
                    System.out.println();
                    System.out.println("(" + firstComplex + ") - (" + secondComplex + ") = "
                            + operation.subtract(firstComplex, secondComplex));
                    System.out.println();
                    System.out.println("(" + firstComplex + ") * (" + secondComplex + ") = "
                            + operation.multiplicate(firstComplex, secondComplex));
                    System.out.println();
                    System.out.println("(" + firstComplex + ") / (" + secondComplex + ") = "
                            + operation.divide(firstComplex, secondComplex));
                    System.out.println();
                    System.out.println("|" + firstComplex + "| = " + operation.modulus(firstComplex));
                    System.out.println("|" + secondComplex + "| = " + operation.modulus(secondComplex));
                    System.out.println();
                    System.out.println("Sprzężenie liczby zespolonej " + firstComplex + " wynosi: "
                            + operation.conjugate(firstComplex));
                    System.out.println("Sprzężenie liczby zespolonej " + secondComplex + " wynosi: "
                            + operation.conjugate(secondComplex));
                    System.out.println();
                    System.out.println("Argument liczby zespolonej " + firstComplex + " wynosi: "
                            + Math.toDegrees(operation.angle(firstComplex)));
                    System.out.println("Argument liczby zespolonej " + secondComplex + " wynosi: "
                            + Math.toDegrees(operation.angle(secondComplex)));
                    System.out.println();
                    System.out.println("Odwrotność liczby zespolonej " + firstComplex + " wynosi: "
                            + operation.inverse(firstComplex));
                    System.out.println("Odwrotność liczby zespolonej " + secondComplex + " wynosi: "
                            + operation.inverse(secondComplex));
                    System.out.println();
                    System.out.println("Logarytm naturalny liczby zespolonej " + firstComplex + " wynosi: "
                            + operation.logarithm(firstComplex));
                    System.out.println("Logarytm naturalny liczby zespolonej " + secondComplex + " wynosi: "
                            + operation.logarithm(secondComplex));
                    System.out.println();
                    System.out.println("e^" + firstComplex + " wynosi: "
                            + operation.expotential(firstComplex));
                    System.out.println("e^" + secondComplex + " wynosi: "
                            + operation.expotential(secondComplex));
                    System.out.println();
                    System.out.println("Postać trygonometryczna liczby zespolonej " + firstComplex + " wynosi: "
                            + operation.trigonometric(firstComplex));
                    System.out.println("Postać trygonometryczna liczby zespolonej " + secondComplex + " wynosi: "
                            + operation.trigonometric(secondComplex));
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
                case "7":
                    System.out.println("Argument liczby zespolonej " + firstComplex + " wynosi: "
                            + Math.toDegrees(operation.angle(firstComplex)));
                    System.out.println("Argument liczby zespolonej " + secondComplex + " wynosi: "
                            + Math.toDegrees(operation.angle(secondComplex)));
                    break;
                case "8":
                    System.out.println("Odwrotność liczby zespolonej " + firstComplex + " wynosi: "
                            + operation.inverse(firstComplex));
                    System.out.println("Odwrotność liczby zespolonej " + secondComplex + " wynosi: "
                            + operation.inverse(secondComplex));
                    break;
                case "9":
                    System.out.println("Logarytm naturalny liczby zespolonej " + firstComplex + " wynosi: "
                            + operation.logarithm(firstComplex));
                    System.out.println("Logarytm naturalny liczby zespolonej " + secondComplex + " wynosi: "
                            + operation.logarithm(secondComplex));
                    break;
                case "10":
                    System.out.println("e^" + firstComplex + " wynosi: "
                            + operation.expotential(firstComplex));
                    System.out.println("e^" + secondComplex + " wynosi: "
                            + operation.expotential(secondComplex));
                    break;
                case "11":
                    System.out.println("Postać trygonometryczna liczby zespolonej " + firstComplex + " wynosi: "
                            + operation.trigonometric(firstComplex));
                    System.out.println("Postać trygonometryczna liczby zespolonej " + secondComplex + " wynosi: "
                            + operation.trigonometric(secondComplex));
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
                "Lista funkcji:\n" +
                        "0.Wypisz wszystkie operacje,\n" +
                        "1.Dodawanie liczb zespolonych,\n" +
                        "2.Odejmowanie liczb zespolonych,\n" +
                        "3.Mnożenie liczb zespolonych,\n" +
                        "4.Dzielenie liczb zespolonych,\n" +
                        "5.Moduł liczb zespolonych,\n" +
                        "6.Sprzężenie liczb zespolonych,\n"+
                        "7.Argument liczb zespolonych,\n"+
                        "8.Odwrotność liczb zespolonych,\n"+
                        "9.Logarytm liczb zespolonych,\n"+
                        "10.e^Z,\n"+
                        "11.Postać trygonometryczna.\n");
        System.out.println("Wybierz operację która ma zostać wykonana\n(wpisanie \"0\" wyświetli wyniki każdej operacji, \"H\" wyświetli spis funkcji).\n");
    }

}
