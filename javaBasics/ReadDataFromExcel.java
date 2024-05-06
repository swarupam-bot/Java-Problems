package com.practice.javaBasics;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReadDataFromExcel {
    public static FileInputStream fis;
    static Workbook workbook;




    public static String getDataFromExcel(String ID,String DetailType,String FileLocation) throws IOException {
        String finalOutput="";
        try {

            //creating instance of file and workbookFactory;
            fis =new FileInputStream(FileLocation);
            workbook= WorkbookFactory.create(fis);
            Sheet sheet=workbook.getSheetAt(0);

            //initialising empty hasmap and list to store data
            HashMap<String,String> hmap=new HashMap<>();
            List<String> DetailsRow=new ArrayList<>();


            //trying to get last non empty row and cell index
            int lastNotEmptyRow=0;
            int lastNotEmptyCell=0;
            for(int i=sheet.getLastRowNum();i>=0;i--)
            {
                String rowStr=sheet.getRow(i).getCell(1).toString().trim();
                if(!rowStr.isEmpty())
                {
                    lastNotEmptyRow=i;
                    break;
                }
            }
            for(int i=sheet.getRow(1).getLastCellNum()-1;i>=0;i--)
            {
                String cellStr=sheet.getRow(1).getCell(i).toString();
                if(!cellStr.isEmpty())
                {
                    lastNotEmptyCell=i;
                    break;
                }
            }

            //parsing first row value in list
            for(int i=0;i<=lastNotEmptyCell;i++)
            {
                String DetailsCells=sheet.getRow(1).getCell(i).toString();
                DetailsRow.add(DetailsCells);

            }
            // String ID="ID003";
            //parsing value in hashmap table
            for (int j=2;j<=lastNotEmptyRow;j++)
            {
                String DataCells=sheet.getRow(j).getCell(0).toString();
                if (ID.equals(DataCells))
                {
                    for(int i=0;i<=lastNotEmptyCell;i++)
                    {
                        String DataByID=sheet.getRow(j).getCell(i).toString();
                        String DataType=DetailsRow.get(i);
                        //System.out.println(DataType+"  "+DataByID);
                        hmap.put(DataType,DataByID);
                    }
                }
            }
            //getting the data from hasmap
            for (String key: hmap.keySet())
            {
                if(key.equals(DetailType))
                {
                    finalOutput=hmap.get(key);
                }
            }

        }

        //closing the workbook
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            workbook.close();
            fis.close();
        }
        return finalOutput;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getDataFromExcel("ID001","Name","javaBasics/DataProvider/Employee.xlsx"));
    }

}
