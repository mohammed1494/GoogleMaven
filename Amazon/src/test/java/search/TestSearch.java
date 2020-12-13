package search;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestSearch extends CommonAPI {
    @Test
    public void test() {
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("Paint", Keys.ENTER);
        driver.findElement(By.id("twotabsearchtextbox")).clear();
        driver.findElement(By.id("searchDropdownBox"))
                .sendKeys("ALL", Keys.ENTER);
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("Paint Brush", Keys.ENTER);

    }
}
