package searchDataFromExcel;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

import java.io.IOException;

/**
 * Created by PIIT_NYA on 5/14/2017.
 */
public class SearchPage extends CommonAPI {
    @FindBy(how = How.CSS, using = "#gh-ac")
    public static WebElement searchInput;


    public void searchFor(String item) {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName() + ": " + item));
        searchInput.sendKeys(item, Keys.ENTER);
    }

    public void clearSearchInput() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        searchInput.clear();
    }

    public void getDataFromExcelFileAndSearch() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        //Create instance of Excel file reader class
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        //Page Factory class init
        SearchPage search = PageFactory.initElements(driver, SearchPage.class);
        //Read data from Excel File.
        String[] value = itemsToBeSearched.getDataFromExcelFile();
        //Running for each loop
        for (int i = 1; i < value.length; i++) {
            search.searchFor(value[i]);
            sleepFor(2);
            search.clearSearchInput();
        }
    }
}