package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;

public class AmazingSuperSongCHeckTest {
    @Test
    public void shouldAnswerWithTrue()
    {
        WebDriverManager.chromedriver().setup();
    }
}
