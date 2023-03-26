package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

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
