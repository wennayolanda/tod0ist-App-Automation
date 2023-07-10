package Component;

import Hooks.Hooks;
import Object.PageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Label extends PageObject {
    public Label(AppiumDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(Hooks.driver, 20);

    public void labelPlanIsDisplayed() throws Exception {
        try {
            WebElement findElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.widget.TextView[1]")));
            findElement.isDisplayed();
        } catch (NoSuchElementException e) {
            throw new Exception("The label is not displayed");
        }
    }
    public void labelProjectIsDisplayed() throws Exception {
        try {
            WebElement findElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")));
            findElement.isDisplayed();
        } catch (NoSuchElementException e) {
            throw new Exception("The project name is not displayed");
        }
    }
    public void labelTaskIsDisplayed() throws Exception {
        try {
            WebElement findElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout")));
            findElement.isDisplayed();
        } catch (NoSuchElementException e) {
            throw new Exception("The task is not displayed");
        }
    }

    public void completeTaskIsDisplayed() throws Exception {
        try {
            WebElement findElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.TextView")));
            findElement.isDisplayed();
        } catch (NoSuchElementException e) {
            throw new Exception("The task is not displayed");
        }
    }

    public void errorMessageIsDisplayed() throws Exception {
        try {
//            WebElement findElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.Toast[1]")));
            WebElement toastView = androidDriver.findElement(By.xpath("//android.widget.Toast[1]"));
            toastView.isDisplayed();
        } catch (NoSuchElementException e) {
            throw new Exception("The error message is not displayed");
        }
    }
}
