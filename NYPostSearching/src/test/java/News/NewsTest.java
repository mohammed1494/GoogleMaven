package News;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class NewsTest extends CommonAPI {

    @Test
    public void test1() {
        driver.findElement(By.cssSelector("svg.search-icon-svg")).click();
        driver.findElement(By.name("s"))
                .sendKeys("COVID", Keys.ENTER);
    }
}
