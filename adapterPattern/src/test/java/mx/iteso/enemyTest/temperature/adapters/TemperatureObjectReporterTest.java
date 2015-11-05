package mx.iteso.enemyTest.temperature.adapters;

import mx.iteso.adapter.temperature.adapters.TemperatureObjectReporter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by DaNN on 04/11/2015.
 */
public class TemperatureObjectReporterTest {
    TemperatureObjectReporter tempOb;

    @Before
    public void setUp() {
        tempOb = new TemperatureObjectReporter();
    }

    @Test
    public void getTemperatureInFahrenheitTest() {
        tempOb.setTemperatureInCelsius(30);
        assertEquals(30, tempOb.getTemperatureInFahrenheit(),0);
    }

    @Test
    public void getTemperatureInCelsius() {
        tempOb.setTemperatureInFahrenheit(40);
        assertEquals(40, tempOb.getTemperatureInCelsius(), 0);
    }
}
