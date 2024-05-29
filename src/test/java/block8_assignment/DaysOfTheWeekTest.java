package block8_assignment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class DaysOfTheWeekTest {

    @BeforeAll
    public static void classSetup() {
        System.out.println("Before All Method");
    }

    @BeforeEach
    public void classBeforeEach() {
        System.out.println("Before Each Method");
    }

    @AfterAll
    public static void classTearDown() {
        System.out.println("After All Method");
    }

    @AfterEach
    public void classAfterEach() {
        System.out.println("After Each Method");
    }

    @Test
    public void returnsMonday() {
        DaysOfTheWeek object = new DaysOfTheWeek();
        String result = object.getDay(2);
        String expectedResult2 = "Monday";
        String actualResult2 = result;

        assertEquals(expectedResult2, actualResult2, "Tset Mon FAILED");
        assertNotNull(actualResult2, "Null was returned");
        assertTrue(expectedResult2 == actualResult2);
        assertTrue(actualResult2 != null);
        assertFalse(actualResult2 == null);

    }

    @Test
    public void returnsTuesday() {
        DaysOfTheWeek object = new DaysOfTheWeek();
        String result = object.getDay(3);
        String expectedResult3 = "Tuesday";
        String actualResult3 = result;

        assertEquals(expectedResult3, actualResult3, "Test Tue FAILED");
        assertNotNull(actualResult3, "Null was returned");
        assertTrue(expectedResult3 == actualResult3);
        assertTrue(expectedResult3 != null);
        assertFalse(expectedResult3 == null);
    }

    @Test
    @DisplayName("Null pointer Exception test")
    public void returnsWednesday() {
        DaysOfTheWeek object = new DaysOfTheWeek();
        String result = object.getDay(4);
        String expectedResult4 = "Wednesday";
        String expectedResult5 = "Thursday";
        String expectedResult6 = "Friday";
        String expectedResult7 = "Saturday";
        String actualResult4 = result;
        String actualResult5 = result;
        String actualResult6 = result;
        String actualResult7 = result;


        assertEquals(expectedResult4, actualResult4, "Test Wed FAILED");
        assertNotNull(actualResult4, "Null was returned");
        assertTrue(expectedResult4 == actualResult4);
        assertTrue(expectedResult4 != null);
        assertFalse(expectedResult4 == null);

    }

}