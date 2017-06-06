package testSearchItem;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import searchDataFromExcel.SearchPage;

import java.io.IOException;

/**
 * Created by PIIT_NYA on 5/14/2017.
 */
public class SearchItems extends CommonAPI {
    @Test
    public void search() throws IOException, InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro EC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.getDataFromExcelFileAndSearch();
    }
}
