package Component;

import Hooks.Hooks;
import Object.PageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Icon extends PageObject {

    public Icon(AppiumDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(Hooks.driver, 50);

    public void threeRow() {
        MobileElement three = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc='Menu']")));
        three.click();
    }
    public void addProject() {
        MobileElement add = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.compose.ui.platform.ComposeView[5]/android.view.View/android.view.View/android.view.View[1]")));
        add.click();
    }
    public void moreOption() {
        MobileElement more = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='More options']")));
        more.click();
    }

    public void dateIcon() {
        MobileElement date = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='21 July 2023']")));
        date.click();
    }


}
