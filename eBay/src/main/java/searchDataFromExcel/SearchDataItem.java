package searchDataFromExcel;

import base.CommonAPI;
import reader.DataReader;
import reporting.TestLogger;

import java.io.IOException;

/**
 * Created by Sharif on 6/4/2017.
 */
public class SearchDataItem extends CommonAPI {
   DataReader dr = new DataReader();
    public String [] getDataFromExcelFile()throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String path = System.getProperty("users.dir")+"/data/file1.xls";
        String [] st = dr.fileReader(path);
        return st;
    }
}
