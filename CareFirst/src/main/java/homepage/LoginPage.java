package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Sharif on 6/11/2017.
 */
public class LoginPage extends CommonAPI{

    String user_login_id = "admin";
    String user_password = "admin";

    @FindBy(how = How.CSS, using = "")
    public static WebElement matchUserName;

    @FindBy(how = How.CSS, using = "")
    public static WebElement matchPassword;

    @FindBy(how = How.CSS, using = "")
    public static WebElement clickOnLoginButton;

    public void getResult(){
        matchUserName.sendKeys(user_login_id);
        matchPassword.sendKeys(user_password);
        clickOnLoginButton.click();
    }
}
