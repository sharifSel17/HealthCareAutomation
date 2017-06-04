package testSearchItem;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import searchDataFromExcel.SearchItem;
import java.io.IOException;

/**
 * Created by Sharif on 6/4/2017.
 */
public class TestSearchDataFromExcel extends CommonAPI {
   @Test
    public void search() throws IOException, InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro EC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        SearchItem sItem = PageFactory.initElements(driver,SearchItem.class);
        sItem.getDataFromExcelFileAndSearch();
    }
}
