import static org.junit.Assert.*;

import org.junit.Test;


public class Module_1_Test {

    @Test
    public void testAdd() {
        assertEquals("Add Result : ", 8, new Module_1().add(3, 5));
    }

    @Test
    public void testMinus() {
        assertEquals("Minus Result : ", -2, new Module_1().minus(3, 5));
    }
}
