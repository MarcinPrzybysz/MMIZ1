import Entity.ComplexNum;

import java.util.Scanner;

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
     * @return String w formacie l.rzeczywista + l.urojona i
     */
    public String printComplexNum(ComplexNum complex) {

        //TODO: dodać warunki na ujemne części urojone

        double real = complex.getReal();
        double img = complex.getImg();
        if (real == 0) {
            return img + " i";
        } else if (img == 0) {
            return String.valueOf(real);
        } else {
            return real + "+" + img + "i";
        }
    }


    /**
     * Dodawanie nowej liczby zespolonej
     *
     * @return
     */
    public ComplexNum addNewComplex() {
        //todo: data input veryfication

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj część rzczywistą");
        String real = scan.nextLine();

        System.out.println("Podaj część urojoną");
        String img = scan.nextLine();

        ComplexNum complex = new ComplexNum(Double.valueOf(real), Double.valueOf(img));
        return complex;
    }


}
