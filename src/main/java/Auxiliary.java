import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Auxiliary {

	ChromeDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, 10);

	public void iterateOnAtivos() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[@role='row']")));
		List<WebElement> elementRow = driver.findElements(By.xpath("//tbody/tr[@role='row']"));
		for (int i=1; i<elementRow.size();i++) {
			List<WebElement> elementItems = driver.findElements(By.xpath("//tbody/tr[@role='row']["+i+"]/td"));
			System.out.println();
			for (int j=0; j<elementItems.size();j++) {
				System.out.print("|"+elementItems.get(j).getText()+"|");
			}
		}
	}

	public void readHeaderValues() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//thead/tr[@role='row'][1]/th")));
		List<WebElement> element = driver.findElements(By.xpath("//thead/tr[@role='row'][1]/th"));
		for (int i=0; i<element.size(); i++) {
			System.out.print("|"+ element.get(i).getText()+"|");
		}
	}

	public void navigateTo(String url, String ativo) {
		driver.navigate().to(url+ativo);
	}
}
