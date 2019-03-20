/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalife;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vladislav
 */
public class ModelTest {
    
    public ModelTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of gameProcess method, of class Model.
     */
    @Test
    public void testGameProcess() {
        System.out.println("gameProcess");
        int[][] field = null;
        Model instance = new Model();
        instance.gameProcess(field);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showRules method, of class Model.
     */
    @Test
    public void testShowRules() {
        System.out.println("showRules");
        Model instance = new Model();
        instance.showRules();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subscribe method, of class Model.
     */
    @Test
    public void testSubscribe() {
        System.out.println("subscribe");
        Controller c = null;
        Model instance = new Model();
        instance.subscribe(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notifySub method, of class Model.
     */
    @Test
    public void testNotifySub() {
        System.out.println("notifySub");
        Model instance = new Model();
        instance.notifySub();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of test method, of class Model.
     */
    @Test
    public void testTest() {
        System.out.println("test");
        Model instance = new Model();
        instance.test();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endMassive method, of class Model.
     */
    @Test
    public void testEndMassive() {
        System.out.println("endMassive");
        int i0 = 0;
        int j0 = 0;
        int n = 0;
        int m = 0;
        int[][] field = null;
        Model instance = new Model();
        int expResult = 0;
        int result = instance.endMassive(i0, j0, n, m, field);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countSosed method, of class Model.
     */
    @Test
    public void testCountSosed() {
        System.out.println("countSosed");
        int i0 = 0;
        int j0 = 0;
        int n = 0;
        int m = 0;
        int[][] field = null;
        Model instance = new Model();
        int expResult = 0;
        int result = instance.countSosed(i0, j0, n, m, field);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
