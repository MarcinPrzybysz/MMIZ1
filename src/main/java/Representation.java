import Entity.ComplexNum;

import java.util.Scanner;

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
     * @param complex Część rzeczywista liczby zespolone
     * @return String w formacie l.rzeczywista + l.urojona i
     */
 //  public String printComplexNum(ComplexNum complex) {

 //      double real = complex.getReal();
 //      double img = complex.getImg();
 //      if (real == 0) {
 //          return img + "*i";
 //      }
 //      else if (img == 0 && real == 0) {
 //          return "0";
 //      }
 //      else if (img == 0) {
 //          return String.valueOf(real);
 //      }
 //      else if (img < 0 && real != 0) {
 //          return real + "-" + (-1*img) + "*i";
 //      }
 //      else {
 //          return real + "+" + img + "*i";
 //      }
 //  }




    /**
     * Dodawanie nowej liczby zespolonej
     *
     * @return Zwraca nowy obiekt liczby zespolonej
     */
    public ComplexNum addNewComplex() {
        //todo: data input verification

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj część rzeczywistą: ");
        String real = scan.nextLine();

        System.out.print("Podaj część urojoną: ");
        String img = scan.nextLine();

        ComplexNum complex = new ComplexNum(Double.valueOf(real), Double.valueOf(img));
        return complex;
    }


}
