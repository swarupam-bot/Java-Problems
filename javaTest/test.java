package com.practice.javaTest;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test {
   public static FileInputStream fis;
    static Workbook workbook;

    public static void main(String[] args) throws IOException {
        try {
           fis =new FileInputStream("javaBasics/DataProvider/Employee.xlsx");

            workbook= WorkbookFactory.create(fis);

            Sheet sheet=workbook.getSheetAt(0);


            for(Row row:sheet)
            {
                for (Cell cell:row)
                {
                    System.out.print(cell.toString()+"  ");
                }
                System.out.println();
            }


        }

        catch (Exception e)
        {
            e.printStackTrace();

        }
        finally {

            workbook.close();
            fis.close();

        }


    }

}
