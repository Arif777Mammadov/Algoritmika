package Elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralElements {
    JavascriptExecutor js;
    public GeneralElements(WebDriver chrome){
        PageFactory.initElements(chrome, this);
        js = (JavascriptExecutor) chrome;
    }

    @FindBy(className = "login-button")
    WebElement loginButton;

    @FindBy(xpath = "//input[@value='']")
    WebElement loginInput;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;

    @FindBy(xpath = "//input[@type='password']")
    WebElement passInput;

    @FindBy(xpath = "//span[contains(text(),'Modul 3. Mobil və desktop tətbiqlərinin test edilməsi')]")
    WebElement des_section;

    @FindBy(xpath = "//a[@data-qa-task-id='53759']")
    WebElement des_task;

    public void sleep() throws InterruptedException {
        Thread.sleep(8000);
    }

    public void go_to_login() throws InterruptedException {
        loginButton.click();
        sleep();
    }

    public void insert_login(){
        loginInput.click();
        loginInput.sendKeys("amammadov1058");
    }

    public void submit() throws InterruptedException {
        submit.click();
        sleep();
    }

    public void insert_password(){
        passInput.click();
        passInput.sendKeys("6244");
    }

    public void select_section() throws InterruptedException {
        sleep();
        des_section.click();
    }

    public void select_tsk() throws InterruptedException {
        sleep();
        js.executeScript("arguments[0].scrollIntoView(true);", des_task);
        sleep();
        js.executeScript("window.scrollTo(0, 500)");
        des_task.click();
        sleep();
    }

    public void quit(WebDriver chrome){
        chrome.quit();
    }
}
