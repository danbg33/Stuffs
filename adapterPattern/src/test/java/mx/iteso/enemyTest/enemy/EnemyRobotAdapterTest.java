package mx.iteso.enemyTest.enemy;
import static org.mockito.Mockito.*;
import mx.iteso.adapter.enemy.EnemyRobot;
import mx.iteso.adapter.enemy.EnemyRobotAdapter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by DaNN on 04/11/2015.
 */
public class EnemyRobotAdapterTest {
    EnemyRobot robtina;
    EnemyRobotAdapter roboadapt;

    @Before
    public void setUp()
    {
        robtina = mock(EnemyRobot.class);
        roboadapt = new EnemyRobotAdapter(robtina);
    }


    @Test
    public void fireWeaponTest()
    {
    assertEquals(true,roboadapt.fireWeapon());

    }


    @Test
    public void driveForwardTest() {
       assertEquals(true, roboadapt.driveForward());
    }

    @Test
    public void assignDriverTest() {

        assertEquals(true, roboadapt.assignDriver("JOHN"));
    }
}
