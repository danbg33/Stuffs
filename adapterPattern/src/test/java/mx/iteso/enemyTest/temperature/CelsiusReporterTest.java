package mx.iteso.enemyTest.temperature;

import mx.iteso.adapter.temperature.CelsiusReporter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by DaNN on 04/11/2015.
 */
public class CelsiusReporterTest {

    CelsiusReporter crep;

    @Before
    public void setUp(){
        crep = new CelsiusReporter();
    }

    @Test
    public void setAndGetTemperatureInCelsiusTest() {
        crep.setTemperatureInCelsius(20);
        assertEquals(10, crep.getTemperatureInCelsius(),0);
    }
}
