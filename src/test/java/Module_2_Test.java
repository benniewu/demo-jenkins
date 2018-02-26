import static org.junit.Assert.*;

import org.junit.Test;


public class Module_2_Test {

    @Test
    public void testStrAdd() {
        assertEquals("String Add Result : ", "AB", new Module_2().strAdd("A", "B"));
    }    
}
