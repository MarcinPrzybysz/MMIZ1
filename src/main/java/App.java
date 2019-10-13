import Entity.ComplexNum;

public class App {

    public static void main(String[] args) {
        Operation op = new Operation();
        Representation rep = new Representation();

        ComplexNum x = rep.addNewComplex();
        ComplexNum y = rep.addNewComplex();

        System.out.println("pierwsza liczba:");
        System.out.println(rep.printComplexNum(x));

        System.out.println("druga liczba:");
        System.out.println(rep.printComplexNum(y));

        System.out.println("DZIELENIE:");
        System.out.println(rep.printComplexNum(op.divide(x, y)));

        // System.out.println("druga liczba:");
        //rep.printComplexNum(y);


    }


}
