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
        }
        catch(Exception addException){
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
        try{
            return new ComplexNum((firstComplex.getReal() - secondComplex.getReal()),
                    (firstComplex.getImg() - secondComplex.getImg()));
        }
        catch (Exception substractException) {
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

        try{
            double realFirst = firstComplex.getReal();
            double imgFirst = firstComplex.getImg();
            double realSecond = secondComplex.getReal();
            double imgSecond = secondComplex.getImg();

        return new ComplexNum((realFirst * realSecond - imgFirst * imgSecond),
                (realFirst * imgSecond + imgFirst * realSecond));
        }
        catch (Exception multiplicateException) {
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
        try{
            double realFirst = firstComplex.getReal();
            double imgFirst = firstComplex.getImg();
            double realSecond = secondComplex.getReal();
            double imgSecond = secondComplex.getImg();

            double real = (realFirst * realSecond + imgFirst * imgSecond)
                    / (realSecond * realSecond + imgSecond * imgSecond);
            double imaginary = (imgFirst * realSecond - realFirst * imgSecond)
                    / (realSecond * realSecond + imgSecond * imgSecond);

            return new ComplexNum(real, imaginary);
        }
        catch (Exception divideException) {
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
        try{
            return Math.sqrt((complexNumber.getReal() * complexNumber.getReal())
                    + (complexNumber.getImg() * complexNumber.getImg()));
        }
        catch (Exception modulusException) {
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
        try{
            return new ComplexNum(complexNumber.getReal(), -complexNumber.getImg());
        }
        catch (Exception conjugateException) {
            System.out.println("Error: " + conjugateException.getMessage());
            return null;
        }
    }

}
