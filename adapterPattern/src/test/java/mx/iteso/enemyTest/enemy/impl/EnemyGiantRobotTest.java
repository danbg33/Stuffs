package mx.iteso.enemyTest.enemy.impl;

import mx.iteso.adapter.enemy.EnemyRobot;
import mx.iteso.adapter.enemy.impl.EnemyGiantRobot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DaNN on 04/11/2015.
 */
public class EnemyGiantRobotTest {
        public EnemyGiantRobot robot;

    @Before
    public void setUp()
    {
        robot = new EnemyGiantRobot();


    }

    @Test
    public void smashWithHandsTest(){

        assertEquals(true,robot.smashWithHands());
    }

    @Test
    public void walkForward() {
        assertEquals(true,robot.walkForward());
    }
    @Test
    public void reactToHuman()
    {
    assertEquals(true,robot.reactToHuman("ANDROID"));
    }


}
