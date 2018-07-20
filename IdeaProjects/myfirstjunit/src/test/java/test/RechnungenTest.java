package test;

import org.junit.Test;
import junit.framework.*;
import klassen.Rechnungen;

public class RechnungenTest {

    public RechnungenTest(String name){
        super(name);
    }

    @Test
    public void testaddition(){
        assertEquals(22 == 12 + 10);
    }
}
