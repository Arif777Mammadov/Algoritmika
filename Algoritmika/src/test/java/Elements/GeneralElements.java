package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralElements {
    public GeneralElements(WebDriver chrome){
        PageFactory.initElements(chrome, this);
    }

    @FindBy(className = "login-button")
    WebElement loginButton;//ok

    @FindBy(xpath = "//input[@value='']")
    WebElement loginInput;//ok

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;//ok

    @FindBy(xpath = "//input[@type='password']")
    WebElement passInput;//ok

    //Here starts Profile Management stuff
    @FindBy(xpath = "//span[contains(text(),'Modul 3. Mobil və desktop tətbiqlərinin test edilməsi')]")
    WebElement des_section;//now ok

                    //Bu 3cu modulda 1ci dersin nezeriyye duymesini tapir, sonra ona kliklemek olur
    //@FindBy(xpath = "//a[@data-qa-task-id='52093']")
                    //Bu 3cu modulda 2ci dersin nezeriyye duymesini tapir, amma ona kliklemek mumkun olmur
    @FindBy(xpath = "//a[@data-qa-task-id='52369']")
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
        des_section.click();
        sleep();
    }

    public void select_tsk() throws InterruptedException {
        Thread.sleep(3000);
        des_task.click();
        sleep();
    }

    public void quit(WebDriver chrome){
        chrome.quit();
    }
}
