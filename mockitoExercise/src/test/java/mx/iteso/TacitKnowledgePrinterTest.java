package mx.iteso;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TacitKnowledgePrinterTest {

    private Printer printer1;
    private TacitKnowledgePrinter tacit;
    //Test printNumbers with a limit of 10
        //Verify calculate being called 10 times
        //Verify expected result

    //Test printNumbers with a limit of 0
        //Verify Exception

    //What else can we test?
        //What should we verify?

    @Before
    public void setUp() {
         printer1 = mock(Printer.class);
        tacit = new TacitKnowledgePrinter(printer1);
    }
    @Test
    public void testDivision3()
    {
        assertEquals(tacit.calculate(3),"Tacit");
    }
    @Test public void testDivision5()
    {
        assertEquals(tacit.calculate(5),"Knowledge");
    }
    @Test public void testDivision3and5()
    {
        assertEquals(tacit.calculate(15),"TacitKnowledge");
    }


    void printNumberTimes10()
    {
        tacit = new TacitKnowledgePrinter(printer1);
        tacit.printNumbers(10);
        verify(printer1, times(10)).print(anyString());

    }

    @Test(expected = Exception.class)
    public void testPrintNumbersLimitZero()
    {
    tacit.printNumbers(0);
    }
    @Test
    public void forbiddenTest() {
        assertTrue(true);
    }


}
