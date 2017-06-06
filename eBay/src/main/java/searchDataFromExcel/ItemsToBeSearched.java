package searchDataFromExcel;

import base.CommonAPI;
import reader.DataReader;
import reporting.TestLogger;
import java.io.IOException;

/**
 * Created by PIIT_NYA on 5/14/2017.
 */
public class ItemsToBeSearched extends CommonAPI{
    DataReader dr = new DataReader();
    public String [] getDataFromExcelFile()throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String path = System.getProperty("user.dir")+"/data/file1.xls";
        String [] st = dr.fileReader(path);
        return st;
    }
}