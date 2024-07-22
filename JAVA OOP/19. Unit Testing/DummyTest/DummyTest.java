package rpg_lab;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DummyTest {

    private static final int INITIAL_HEALTH = 100;
    private static final int EXPERIENCE = 10;
    private static final int ATTACK_POINTS = 10;

    private Dummy aliveDummy;
    private Dummy deadDummy;

    @Before
    public void setUp() {
        aliveDummy = new Dummy(INITIAL_HEALTH, EXPERIENCE);
        deadDummy = new Dummy(0, EXPERIENCE); // Dummy with 0 health, thus dead
    }

    @Test
    public void testDummyLosesHealthIfAttacked() {
        aliveDummy.takeAttack(ATTACK_POINTS);
        assertEquals("Dummy health should decrease after attack", INITIAL_HEALTH - ATTACK_POINTS, aliveDummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void testDeadDummyThrowsExceptionIfAttacked() {
        deadDummy.takeAttack(ATTACK_POINTS);
    }

    @Test
    public void testDeadDummyCanGiveXP() {
        assertEquals("Dead dummy should give experience", EXPERIENCE, deadDummy.giveExperience());
    }

    @Test(expected = IllegalStateException.class)
    public void testAliveDummyCannotGiveXP() {
        aliveDummy.giveExperience();
    }
}
