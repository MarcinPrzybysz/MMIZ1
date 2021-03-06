import Entity.ComplexNum;

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
        } catch (Exception subtractException) {
            System.out.println("Error: " + subtractException.getMessage());
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
        try {
            return new ComplexNum(
                    (firstComplex.getReal() * secondComplex.getReal() - firstComplex.getImg() * secondComplex.getImg()),
                    (firstComplex.getReal() * secondComplex.getImg()
                            + firstComplex.getImg() * secondComplex.getReal()));
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
        try {
            double real = (firstComplex.getReal() * secondComplex.getReal()
                    + firstComplex.getImg() * secondComplex.getImg())
                    / (secondComplex.getReal() * secondComplex.getReal()
                    + secondComplex.getImg() * secondComplex.getImg());

            double imgCounter = (firstComplex.getImg() * secondComplex.getReal()
                    - firstComplex.getReal() * secondComplex.getImg());
            double imgDenominator = (secondComplex.getReal() * secondComplex.getReal()
                    + secondComplex.getImg() * secondComplex.getImg());

            if (imgDenominator == 0) {
                System.out.println("Błąd dzielenia przez zero");
                return null;
            } else {
                double imaginary = imgCounter / imgDenominator;
                return new ComplexNum(real,imaginary);
            }

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
     * Oblicza argument liczby zespolonej (kąt skierowany między wektorem reprezentującym liczbę zespoloną, a osią rzeczywistą
     *
     * @param complexNumber
     * @return zwraca wartość kąta wyrazoną w radianach
     */
    public Double angle(ComplexNum complexNumber) {
        try {
            return Math.atan2(complexNumber.getImg(), complexNumber.getReal());
        } catch (Exception angleException) {

            System.out.println("Error: " + angleException.getMessage());
            return null;
        }
    }

    /**
     * Oblicza logarytm liczby zespolonej
     *
     * @param complexNumber
     * @return obliekt liczby zespoloną
     */
    public ComplexNum logarithm(ComplexNum complexNumber) {
        try {
            double real = Math.log(modulus(complexNumber));
            double img = angle(complexNumber);

            return new ComplexNum(real, img);


        } catch (Exception logaritmException) {
            System.out.println("Error: " + logaritmException.getMessage());
            return null;
        }
    }

    /**
     * Metoda zwraca odwrotność liczby zespolonej
     *
     * @param complexNumber Obiekt liczby zespolonej
     * @return Obiekt zawierający odwrotność podanej liczby zespolonej
     */
    public ComplexNum inverse(ComplexNum complexNumber) {
        try {
            if (complexNumber.getReal() == 0 && complexNumber.getImg() == 0) {
                System.out.println("Działanie 1/0 jest niezdefiniowane (niemożliwe do wykonania)");
                return null;
            } else {
                complexNumber = conjugate(complexNumber);

                double denominator = complexNumber.getImg() * complexNumber.getImg() + complexNumber.getReal() * complexNumber.getReal();

                return new ComplexNum(complexNumber.getReal() / denominator, complexNumber.getImg() / denominator);
            }
        } catch (Exception inverseException) {
            System.out.println("Error: " + inverseException.getMessage());
            return null;
        }
    }

    /**
     * Metoda zwraca wartość e^Z
     *
     * @param complexNumber Obiekt liczby zespolonej (Z)
     * @return Obiekt będący wynikiem działania e^Z
     */
    public ComplexNum expotential(ComplexNum complexNumber) {
        return new ComplexNum(Math.exp(complexNumber.getReal()) * Math.cos(complexNumber.getImg()),
                Math.exp(complexNumber.getReal()) * Math.sin(complexNumber.getImg()));
    }

    /**
     * Metoda zwraca zapis trygonometryczny liczby zespolonej
     *
     * @param complexNumber Obiekt liczby zespolonej
     * @return Strumień zawierający zapis trygonometryczny liczby zespolonej
     */
    public String trigonometric(ComplexNum complexNumber) {
        double modulus = modulus(complexNumber);
        double ang = Math.toDegrees(angle(complexNumber));

        return modulus + "(cos(" + ang + ") + ( i*sin(" + ang + "))";
    }

}
