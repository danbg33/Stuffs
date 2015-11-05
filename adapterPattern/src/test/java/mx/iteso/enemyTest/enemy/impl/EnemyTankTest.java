package mx.iteso.enemyTest.enemy.impl;

import mx.iteso.adapter.enemy.EnemyAttacker;
import mx.iteso.adapter.enemy.impl.EnemyTank;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by DaNN on 04/11/2015.
 */
public class EnemyTankTest {

    public EnemyAttacker roboto;

    @Before
    public void setUp()
    {
        roboto = new EnemyTank();

    }

    @Test
    public void fireWeaponTest()
    {

       assertEquals(true,roboto.fireWeapon());
    }

    @Test
    public void driveForwardTest() {
        assertEquals(true, roboto.driveForward());
    }

    @Test
    public void assignDriverTest() {
        assertEquals(true,roboto.assignDriver("El Robonator"));
    }
}
