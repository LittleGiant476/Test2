/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package taskone;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ecmat
 */
public class TaskOneTest {
    
    public TaskOneTest() {
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
     * Test of main method, of class TaskOne.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TaskOne.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginstatus method, of class TaskOne.
     */
    @Test
    public void testReturnLoginstatus() {
        System.out.println("returnLoginstatus");
        String pass = "";
        String user = "";
        String firstName = "";
        String lastName = "";
        boolean expResult = false;
        boolean result = TaskOne.returnLoginstatus(pass, user, firstName, lastName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valPassword method, of class TaskOne.
     */
    @Test
    public void testValPassword() {
        System.out.println("valPassword");
        String pass = "";
        boolean expResult = false;
        boolean result = TaskOne.valPassword(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valUserName method, of class TaskOne.
     */
    @Test
    public void testValUserName() {
        System.out.println("valUserName");
        String user = "";
        boolean expResult = false;
        boolean result = TaskOne.valUserName(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckUser method, of class TaskOne.
     */
    @Test
    public void testCheckUser() {
        System.out.println("CheckUser");
        String user = "";
        boolean expResult = false;
        boolean result = TaskOne.CheckUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPass method, of class TaskOne.
     */
    @Test
    public void testCheckPass() {
        System.out.println("checkPass");
        String pass = "";
        boolean expResult = false;
        boolean result = TaskOne.checkPass(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasSpecialCharacter method, of class TaskOne.
     */
    @Test
    public void testHasSpecialCharacter() {
        System.out.println("hasSpecialCharacter");
        String pass = "";
        boolean expResult = false;
        boolean result = TaskOne.hasSpecialCharacter(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PasswordCallOut method, of class TaskOne.
     */
    @Test
    public void testPasswordCallOut() {
        System.out.println("PasswordCallOut");
        String pass = "";
        boolean expResult = false;
        boolean result = TaskOne.PasswordCallOut(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
