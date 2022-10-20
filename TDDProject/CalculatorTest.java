package Lesson09.TDDProject;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest{        // bỏ đi  extends TestCase

    @Test
    public void add() {
        int num1 = 10;
        int num2 = 2;
        int actualResult = new Calculator().add(num1, num2);
        assertEquals(actualResult,12);
    }

    @Test
    public void divide() {
        int num1 = 10;
        int num2 = 2;
        int actualResult = new Calculator().divide(num1, num2);
        assertEquals(actualResult,5);
    }
    @Test
    public void divide1() {
        int num1 = -10;
        int num2 = -1;
        int actualResult = new Calculator().divide(num1, num2);
        assertEquals(actualResult,10);
    }
    //    @Test
    //    public void divide2() {
    //        try{
    //            int actualResult = new Calculator().divide(10,0);
    //            assertFalse(true);
    //        }catch(Exception ex){
    //            assertTrue(true);
    //        }
    //    }

}
