import Entity.ComplexNum;

import java.util.Scanner;

<<<<<<< HEAD
public class Representation {

    /**
     * @param real
     * @param img
     * @return String w formacie l.rzeczywista + l.urojona i
     */
    public String printComplexNum(double real, double img) {
        return real + "+" + img + "i";
    }

    /**
     * @param complex
=======
/**
 * Klasa zawierająca metody reprezentacji (zapisu i wyświetlenia)
 */
public class Representation {

    /**
     * Metoda wyświetlająca liczbę zespoloną a+bi
     * @param real Część rzeczywista liczby zespolonej
     * @param img Część urojona liczby zespolonej
     * @return String w formacie l.rzeczywista + l.urojona i
     */
    public String printComplexNum(double real, double img) {
        return real + "+" + img + "*i";
    }

    /**
     * Metoda zwracająca liczbę zespoloną a+bi (jako strumień)
     * 
     * @param real Część rzeczywista liczby zespolonej
     * @param img  Część urojona liczby zespolonej
>>>>>>> Add basic exceptions and controls for user
     * @return String w formacie l.rzeczywista + l.urojona i
     */
    public String printComplexNum(ComplexNum complex) {

<<<<<<< HEAD
        //TODO: dodać warunki na ujemne części urojone

        double real = complex.getReal();
        double img = complex.getImg();
        if (real == 0) {
            return img + " i";
        } else if (img == 0) {
            return String.valueOf(real);
        } else {
            return real + "+" + img + "i";
=======
        double real = complex.getReal();
        double img = complex.getImg();
        if (real == 0) {
            return img + "*i";
        }
        else if (img == 0 && real == 0) {
            return "0";
        }
        else if (img == 0) {
            return String.valueOf(real);
        }
        else if (img < 0 && real != 0) {
            return real + "-" + (-1*img) + "*i";
        }
        else {
            return real + "+" + img + "*i";
>>>>>>> Add basic exceptions and controls for user
        }
    }


    /**
     * Dodawanie nowej liczby zespolonej
     *
<<<<<<< HEAD
     * @return
=======
     * @return Zwraca nowy obiekt liczby zespolonej
>>>>>>> Add basic exceptions and controls for user
     */
    public ComplexNum addNewComplex() {
        //todo: data input veryfication

        Scanner scan = new Scanner(System.in);

<<<<<<< HEAD
        System.out.println("Podaj część rzczywistą");
        String real = scan.nextLine();

        System.out.println("Podaj część urojoną");
=======
        System.out.print("Podaj część rzczywistą: ");
        String real = scan.nextLine();

        System.out.print("Podaj część urojoną: ");
>>>>>>> Add basic exceptions and controls for user
        String img = scan.nextLine();

        ComplexNum complex = new ComplexNum(Double.valueOf(real), Double.valueOf(img));
        return complex;
    }


}
