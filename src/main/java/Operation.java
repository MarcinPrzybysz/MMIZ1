import Entity.ComplexNum;
<<<<<<< HEAD

public class Operation {
    //todo:dodawanie X
    //todo:odejmowanie X
    //todo:mnożenie
    //todo:dzielenie

    //todo:sprzeżenie
    //todo:odwrotnos

    /**
     * Sumowanie liczb zespolonych
     *
     * @param x
     * @param y
     * @return Obiekt liczby zespolonej stanowiący sumę
     */
    public ComplexNum add(ComplexNum x, ComplexNum y) {
        return new ComplexNum(x.getReal() + y.getReal(), x.getImg() + y.getImg());
    }

    /**
     * Odejmowanie liczb zespolonych
     *
     * @param x
     * @param y
     * @return Obiekt liczby zespolonej stanowiący różnicę
     */
    public ComplexNum subtract(ComplexNum x, ComplexNum y) {
        System.out.println("ReX:"+ x.getReal());
        System.out.println("ImX:"+ x.getImg());
        System.out.println("ReY:"+ y.getReal());
        System.out.println("ImY:"+ y.getImg());


        return new ComplexNum((x.getReal() - y.getReal()), (x.getImg() - y.getImg()));
    }

    /**
     * Mnożenie liczb zespolonych
     *
     * @param x
     * @param y
     * @return Zwraca obiekt liczby zespolonej
     */
    public ComplexNum multiplicate(ComplexNum x, ComplexNum y) {
        //TODO: sprawdzić wszystkie warunki
        double realX = x.getReal();
        double imgX = x.getImg();
        double realY = y.getReal();
        double imgY = y.getImg();

        return new ComplexNum((realX * realY - imgX * imgY), (realX * imgY + imgX * realY));
    }

    /**
     * Oblicza iloraz dwóch liczb zespolonych
     *
     * @param x
     * @param y
     * @return
     */
    public ComplexNum divide(ComplexNum x, ComplexNum y) {
        //todo:sprawdzenie inputu c^2+d^2 >0
        //TODO: sprawdzić wszystkie warunki
        //TODO: poprawić wydajnosc?
        double realX = x.getReal();
        double imgX = x.getImg();
        double realY = y.getReal();
        double imgY = y.getImg();



            double real = (realX * realY + imgX * imgY) / (realY * realY + imgY * imgY);
            double imaginary = (+imgX * realY - realX * imgY) / (realY * realY + imgY * imgY);




        return new ComplexNum(real,imaginary);
    }

    /**
     * Oblicza moduł liczby zespolonej
     *
     * @param num
     * @return
     */
    public Double modulus(ComplexNum num) {
        return Math.sqrt((num.getReal() * num.getReal()) + (num.getImg() * num.getImg()));
    }

    /**
     * Obliczenie sprzężenia liczby zespolonej
     *
     * @param num
     */
    public ComplexNum conjugate(ComplexNum num) {
        return new ComplexNum(num.getReal(), -num.getImg());
    }


}
=======
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
>>>>>>> Add basic exceptions and controls for user
