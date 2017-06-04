package testhomepage;

import base.CommonAPI;
import homepage.HomeMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;

/**
 * Created by Sharif on 6/2/2017.
 */
public class TestHomeMenu extends CommonAPI {
    @Test
    public void getClickSelectHomeMenu(){
        ApplicationLog.epicLogger("Epic: News EC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-1> GREEN-1 </a>");
        HomeMenu hm = PageFactory.initElements(driver,HomeMenu.class);
        hm.clickOnSelectHome();
    }
}
