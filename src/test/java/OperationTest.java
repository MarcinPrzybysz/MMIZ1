import Entity.ComplexNum;
import org.junit.Assert;
import org.junit.Test;

import static jdk.nashorn.internal.objects.NativeMath.round;
import static org.junit.Assert.*;

public class OperationTest {
    Operation op = new Operation();

    @Test
    public void addIntegers() {
        ComplexNum x = new ComplexNum(1,3);
        ComplexNum y = new ComplexNum(-1,2);

        ComplexNum result = new ComplexNum(0,5);

        Assert.assertEquals(result, op.add(x,y));
    }

    @Test
    public void add() {
        ComplexNum x = new ComplexNum(-1.51,0);
        ComplexNum y = new ComplexNum(2.25,3.01);

        ComplexNum result = new ComplexNum(0.74,3.01);

        Assert.assertEquals(result, op.add(x,y));
    }

    @Test
    public void subtract() {
        ComplexNum x = new ComplexNum(-1.51,0);
        ComplexNum y = new ComplexNum(2.25,3.01);

        ComplexNum result = new ComplexNum(-3.76,-3.01);

        Assert.assertEquals(result, op.subtract(x,y));
    }

    @Test
    public void multiplicate() {
        ComplexNum x = new ComplexNum(1,-2);
        ComplexNum y = new ComplexNum(2.1,2);

        ComplexNum result = new ComplexNum(6.1,-2.2);

        Assert.assertEquals(result, op.multiplicate(x,y));
    }

    @Test
    public void divide() {
        ComplexNum x = new ComplexNum(3,-3);
        ComplexNum y = new ComplexNum(1,2);

        ComplexNum result = new ComplexNum(-0.6,-1.8);

        Assert.assertEquals(result, op.divide(x,y));
    }

    @Test
    public void inverse() {
        ComplexNum x = new ComplexNum(-1.2,3);

        Assert.assertEquals(1, op.multiplicate(x,op.inverse(x)) );
    }


    @Test
    public void divideZero(){
        ComplexNum x = new ComplexNum(3,-3);
        ComplexNum y = new ComplexNum(1,2);

        ComplexNum result = new ComplexNum(-0.6,-1.8);

        Assert.assertEquals(result, op.divide(x,y));
    }
}