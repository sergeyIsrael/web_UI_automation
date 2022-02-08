package org.example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class AuthorizationTest {
    @Test
    public void shouldAnswerWithTrue()
    {

        WebDriverManager.chromedriver().setup();
    }
}
