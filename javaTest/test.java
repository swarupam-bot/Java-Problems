package com.practice.javaTest;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class test {
   public static FileInputStream fis;
    static Workbook workbook;

    public static void main(String[] args) throws IOException {
        try {
           fis =new FileInputStream("javaBasics/DataProvider/Employee.xlsx");

            workbook= WorkbookFactory.create(fis);

            Sheet sheet=workbook.getSheetAt(0);
            HashMap<String,String> hmap=new HashMap<>();

            for(Row row:sheet)
            {

                for(Cell value: row)
                {
                    System.out.print(value+" ");
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
