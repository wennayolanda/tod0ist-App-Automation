package Component;
import Hooks.Hooks;
import Object.PageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Button extends PageObject {
    public Button(AppiumDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(Hooks.driver, 20);

    public void notAllowBtn() {
        MobileElement notAllowBtn = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.permissioncontroller:id/permission_deny_button")));
        notAllowBtn.click();
    }
    public void signUpEmail() {
        MobileElement signUpEmail = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.todoist:id/email_signup")));
        signUpEmail.click();
    }

    public void signUpBtn() {
        MobileElement emailBtn = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.view.View")));
        emailBtn.click();
    }

    public void loginEmail() {
        MobileElement loginEmail = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.todoist:id/email_login")));
        loginEmail.click();
    }

    public void noneAbove() {
        MobileElement none = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.gms:id/cancel")));
        none.click();
    }

    public void loginBtn() {
        MobileElement log = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]")));
        log.click();
    }

    public void continueBtn() {
        MobileElement cont = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[5]")));
        cont.click();
    }

    public void launchBtn() {
        MobileElement launch = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]")));
        launch.click();
    }

    public void planBackBtn() {
        MobileElement back = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Back']")));
        back.click();
    }

    public void doneProjectBtn() {
        MobileElement done = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Done']")));
        done.click();
        }

    public void favoriteBtn() {
        MobileElement fav = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.Switch")));
        fav.click();
    }

    public void editProjectBtn() {
        MobileElement edit = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]'")));
        edit.click();
    }
    public void addTaskBtn() {
        MobileElement add = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc='Quick add']")));
        add.click();
    }
    public void saveTaskBtn() {
        MobileElement save = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Add']")));
        save.click();
    }

    public void dueDateBtn() {
        MobileElement dueDate = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc='Date']")));
        dueDate.click();
    }

    public void okBtn() {
        MobileElement ok = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")));
        ok.click();
    }

    public void overflowMenuBtn() {
        MobileElement overflow = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Overflow menu']")));
        overflow.click();
    }
    public void editTaskBtn() {
        MobileElement edit = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]")));
        edit.click();
    }
    public void saveEditBtn() {
        MobileElement edit = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.Button")));
        edit.click();
    }

    public void deleteTask() {
        MobileElement del = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[6]")));
        del.click();
    }
    public void yesDeleteConfirmation() {
        MobileElement yes = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")));
        yes.click();
    }
    public void completeTask() {
        MobileElement complete = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.widget.CheckBox[@content-desc='Complete'])[1]")));
        complete.click();
    }

    public void undoTaskBtn() {
        MobileElement undo = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View")));
        undo.click();
    }
}
