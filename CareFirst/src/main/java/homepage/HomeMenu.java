package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

/**
 * Created by Sharif on 5/28/2017.
 */
public class HomeMenu extends CommonAPI {
    @FindBy(how= How.CSS,using="#menu-item-424 > a")
    public static WebElement selectHome;

    public void getSelectHome(){
        selectHome.click();
    }
    public void clickOnSelectHome(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSelectHome();
    }
}
