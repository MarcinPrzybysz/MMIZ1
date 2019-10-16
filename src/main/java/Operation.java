import Entity.ComplexNum;
//TODO: Dodać warunek gdy część rzeczywista oraz urojona są równe 0 w celu nierozpoczynania obliczeń

/**
 * Klasa zawierająca metody działań na liczbach zespolonych
 */
public class Operation {

    /**
     * Sumowanie liczb zespolonych (a,b)+(c,d)
     *
     * @param firstComplex  Obiekt pierwszej liczby zespolonej (a,b)
     * @param secondComplex Obiekt drugiej liczby zespolonej (c,d)
     * @return Obiekt liczby zespolonej stanowiący sumę (a,b)+(c,d)
     */
    public ComplexNum add(ComplexNum firstComplex, ComplexNum secondComplex) {
        try {
            return new ComplexNum(firstComplex.getReal() + secondComplex.getReal(),
                    firstComplex.getImg() + secondComplex.getImg());
        } catch (Exception addException) {
            System.out.println("Error: " + addException.getMessage());
            return null;
        }
    }

    /**
     * Odejmowanie liczb zespolonych (a,b)-(c,d)
     *
     * @param firstComplex  Obiekt pierwszej liczby zespolonej (a,b)
     * @param secondComplex Obiekt drugiej liczby zespolonej (c,d)
     * @return Obiekt liczby zespolonej stanowiący różnicę (a,b)-(c,d)
     */
    public ComplexNum subtract(ComplexNum firstComplex, ComplexNum secondComplex) {
        try {
            return new ComplexNum((firstComplex.getReal() - secondComplex.getReal()),
                    (firstComplex.getImg() - secondComplex.getImg()));
        } catch (Exception substractException) {
            System.out.println("Error: " + substractException.getMessage());
            return null;
        }
    }

    /**
     * Mnożenie liczb zespolonych (a,b)(c,d)
     *
     * @param firstComplex  Obiekt pierwszej liczby zespolonej (a,b)
     * @param secondComplex Obiekt drugiej liczby zespolonej (c,d)
     * @return Zwraca obiekt liczby zespolonej stanowiącej iloczyn (a,b)(c,d)
     */
    public ComplexNum multiplicate(ComplexNum firstComplex, ComplexNum secondComplex) {
        // TODO: sprawdzić wszystkie warunki

        try {
            double realFirst = firstComplex.getReal();
            double imgFirst = firstComplex.getImg();
            double realSecond = secondComplex.getReal();
            double imgSecond = secondComplex.getImg();

            return new ComplexNum((realFirst * realSecond - imgFirst * imgSecond),
                    (realFirst * imgSecond + imgFirst * realSecond));
        } catch (Exception multiplicateException) {
            System.out.println("Error: " + multiplicateException.getMessage());
            return null;
        }
    }

    /**
     * Oblicza iloraz dwóch liczb zespolonych (a,b)/(c,d)
     *
     * @param firstComplex  Obiekt pierwszej liczby zespolonej (a,b)
     * @param secondComplex Obiekt drugiej liczby zespolonej (c,d)
     * @return Zwraca obiekt liczby zespolonej stanowiącej iloraz (a,b)/(c,d)
     */
    public ComplexNum divide(ComplexNum firstComplex, ComplexNum secondComplex) {
        // TODO: sprawdzić wszystkie warunki
        // TODO: poprawić wydajnosc?
        try {
            double realFirst = firstComplex.getReal();
            double imgFirst = firstComplex.getImg();
            double realSecond = secondComplex.getReal();
            double imgSecond = secondComplex.getImg();

            double real = (realFirst * realSecond + imgFirst * imgSecond)
                    / (realSecond * realSecond + imgSecond * imgSecond);
            double imaginary = (imgFirst * realSecond - realFirst * imgSecond)
                    / (realSecond * realSecond + imgSecond * imgSecond);

            return new ComplexNum(real, imaginary);
        } catch (Exception divideException) {
            System.out.println("Error: " + divideException.getMessage());
            return null;
        }
    }

    /**
     * Oblicza moduł liczby zespolonej |(a,b)|
     *
     * @param complexNumber Obiekt przechowujący liczbę zespoloną
     * @return Zwraca moduł liczby zespolonej |(a,b)| (typ double)
     */
    public Double modulus(ComplexNum complexNumber) {
        try {
            return Math.sqrt((complexNumber.getReal() * complexNumber.getReal())
                    + (complexNumber.getImg() * complexNumber.getImg()));
        } catch (Exception modulusException) {
            System.out.println("Error: " + modulusException.getMessage());
            return null;
        }
    }

    /**
     * Obliczenie sprzężenia liczby zespolonej Z
     *
     * @param complexNumber Obiekt liczby zespolonej Z
     * @return Zwraca obiekt zawierający sprzężenie liczy zespolonej Z
     */
    public ComplexNum conjugate(ComplexNum complexNumber) {
        try {
            return new ComplexNum(complexNumber.getReal(), -complexNumber.getImg());
        } catch (Exception conjugateException) {
            System.out.println("Error: " + conjugateException.getMessage());
            return null;
        }
    }

    /**
     * oblicza argument liczby zespolonej (kąt skierowany między wektorem reprezentującym liczbę zespoloną, a osią rzeczywistą
     *
     * @param complexNumber
     * @return zwraca wartość kąta wyrazoną w radianach
     */
    public Double angle(ComplexNum complexNumber) {

        Double result;
        double real = complexNumber.getReal();
        double img = complexNumber.getImg();
        try {
            if (real > 0) {
                result = Math.atan2(img, real);
            } else if (real < 0) {
                result = Math.atan2(img, real) + Math.PI;
            } else {
                if (img > 0) {
                    result = Math.PI / 2;
                } else if (img < 0) {
                    result = -Math.PI / 2;
                } else {
                    result = null;
                }
            }
        } catch (Exception e) {
            //TODO:źle przechwytuje chyba wyjątek, nie drukuje exception, jako wynik daje nieskończoność
            System.out.println("Error: " + e.getMessage());
            return null;
        }

        if (result > 0) {
            if (result > (2 * Math.PI)) {
                return (result - 2 * Math.PI);
            }
            return result;
        } else {
            return 2 * Math.PI + result;
        }

    }

    /**
     * Oblicza logarytm liczby zespolonej
     *
     * @param complexNumber
     * @return obliekt liczby zespoloną
     */
    public ComplexNum logarithm(ComplexNum complexNumber) {
        //TODO: jak możesz to sprawdź, czy część urojoną dobrze liczy, tu jest chyba kwestia odpowiedniej ćwiartki przy liczeniu kąta

        double real = Math.log(modulus(complexNumber));
        double img = angle(complexNumber);
        ComplexNum complexNum = new ComplexNum(real, img);
        return complexNum;
    }

    public ComplexNum inverse(ComplexNum complexNumber) {
        //UWAGA: suma kwadratów Re i Im !=0
        //TODO:exception

        double real = complexNumber.getReal();
        double img = complexNumber.getImg();

        complexNumber = conjugate(complexNumber);

        double denominator = complexNumber.getImg() * complexNumber.getImg() + complexNumber.getReal() * complexNumber.getReal();

        return new ComplexNum(complexNumber.getReal() / denominator, complexNumber.getImg() / denominator);
    }


    public ComplexNum expotential(ComplexNum complexNumber) {
        //e^z
        //TODO:
        return null;
    }


    public String trigonometric(ComplexNum complexNumber) {
        double modulus = modulus(complexNumber);
        double ang = Math.toDegrees(angle(complexNumber));

        return modulus + "(cos(" + ang + ") + ( i*sin(" + ang + ")";
    }

}
