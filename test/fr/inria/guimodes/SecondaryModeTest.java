/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.inria.guimodes;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeremy Laviole <jeremy.laviole@inria.fr>
 */
public class SecondaryModeTest {

    public SecondaryModeTest() {
    }

    /**
     * Test of clear method, of class Mode.
     */
    @Test
    public void testCreation() {

        SecondaryMode secMode = new SecondaryMode();
        
        
        assertTrue(secMode.size() == 0);
        secMode.add("test1");

        assertTrue(secMode.size() == 1);
        secMode.add("test2");

        assertTrue(secMode.size() == 2);
        secMode.set("test1");

        secMode.set("test1");
        assertTrue(secMode.is("test1"));
        assertFalse(secMode.is("test2"));

        secMode.set("test2");
        assertTrue(secMode.is("test2"));
        assertFalse(secMode.is("test1"));

        secMode.clear();
        assertTrue(secMode.size() == 0);
    }

  
}
