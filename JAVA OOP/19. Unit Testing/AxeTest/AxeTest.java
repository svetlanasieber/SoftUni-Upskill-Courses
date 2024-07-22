package rpg_lab;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AxeTest {

    private static final int ATTACK = 10;
    private static final int DURABILITY = 5;

    private Axe axe;
    private Dummy dummy;

    @Before
    public void setUp() {
        axe = new Axe(ATTACK, DURABILITY);
        dummy = new Dummy(100, 100); 
    }

    @Test
    public void testWeaponLosesDurabilityAfterAttack() {
        axe.attack(dummy);
        assertEquals("Axe durability should decrease by 1 after attack", DURABILITY - 1, axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void testAttackingWithBrokenWeapon() {
        Axe brokenAxe = new Axe(ATTACK, 0);
        brokenAxe.attack(dummy);
    }
}
