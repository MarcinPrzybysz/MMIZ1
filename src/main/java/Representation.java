import Entity.ComplexNum;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Klasa zawierająca metody reprezentacji (zapisu i wyświetlenia)
 */
public class Representation {
    final static String DOUBLE_PATTERN = "[-]?[0-9]+(\\.)?[0-9]*";

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
        String real="";
        String img="";
        Scanner scan = new Scanner(System.in);

        boolean invalidInput=true;

        while(invalidInput) {
            System.out.print("Podaj część rzeczywistą: ");
            real = scan.nextLine();
            if(Pattern.matches(DOUBLE_PATTERN, real)) {
                invalidInput = false;
            }else{
                System.out.println("Błędna wartość, to nie jest liczba");
            }
        }

        invalidInput=true;

        while(invalidInput) {
            System.out.print("Podaj część urojoną: ");
            img = scan.nextLine();
            if(Pattern.matches(DOUBLE_PATTERN, img)) {
                invalidInput = false;
            }else{
                System.out.println("Błędna wartość, to nie jest liczba");
            }
        }


        ComplexNum complex = new ComplexNum(Double.valueOf(real), Double.valueOf(img));
        return complex;
    }


}
