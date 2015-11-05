package mx.iteso.enemyTest.temperature.adapters;

import mx.iteso.adapter.temperature.TemperatureInfo;
import mx.iteso.adapter.temperature.adapters.TemperatureClassReporter;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by DaNN on 04/11/2015.
 */
public class TemperatureClassReporterTest {
        TemperatureClassReporter temp;

    @Before
    public void setUp()
    {
        temp = new TemperatureClassReporter();
    }

    @Test
    public void getTemperatureInFahrenheitTest()
    {
     temp.setTemperatureInCelsius(20);
        assertEquals(20,temp.getTemperatureInFahrenheit(),0);
    }

    @Test
    public void setTemperatureInCelsiusTest() {
      temp.setTemperatureInCelsius(30);
        assertEquals(30,temp.getTemperatureInCelsius(),0);
    }

}
