package hooks;

import org.junit.After;
import org.junit.Before;

public class Hooks {
    @Before
    public void beforeTest() {
        System.out.println("Test starts");
    }

    @After
    public void afterTest() {
        System.out.println("Test ends");
    }
}
