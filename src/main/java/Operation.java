import Entity.ComplexNum;

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
