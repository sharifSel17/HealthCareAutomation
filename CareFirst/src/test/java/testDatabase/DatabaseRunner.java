package testDatabase;


import base.CommonAPI;
import database.DatabaseCon;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


/**
 * Created by Sharif on 6/7/2017.
 */
public class DatabaseRunner extends CommonAPI{
    public static void main(String[] args) {
        DatabaseCon con = PageFactory.initElements(driver,DatabaseCon.class);
        con.getConnection();
    }
}
