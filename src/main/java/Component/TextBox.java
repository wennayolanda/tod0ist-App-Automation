package Component;

import Hooks.Hooks;
import Object.PageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class TextBox extends PageObject {
    public TextBox(AppiumDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(Hooks.driver, 50);

//    public void enterSignUpTextbox(String idName, String value) {
//        MobileElement signUpTextbox = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idName)));
//        signUpTextbox.sendKeys(value);
//    }

    public void enterEmailSignup(String value) {
        MobileElement emailSignup = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]")));
        emailSignup.sendKeys(value);
    }

    public void enterPassSignup(String value) {
        MobileElement passSignup = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]")));
        passSignup.sendKeys(value);
    }

    public void enterProfilName(String value) {
        MobileElement name = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText")));
        name.sendKeys(value);
    }

    public void projectName(String value) {
        MobileElement name = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")));
        name.sendKeys(value);
    }

    public void taskName(String value) {
        MobileElement name = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText[1]")));
        name.sendKeys(value);
    }

    public void editTaskTextbox(String value) {
        MobileElement name = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText[1]")));
        name.sendKeys(value);
    }
}
