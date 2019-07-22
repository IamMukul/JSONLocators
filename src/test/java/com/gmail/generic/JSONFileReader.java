package com.gmail.generic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONFileReader {
    public static List<ElementInfo> readLocators(String filePath)
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        List<ElementInfo> elementInfoList = new ArrayList<ElementInfo>();
        try (FileReader reader = new FileReader(filePath))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            //
            JSONArray elementInfoArray = (JSONArray) obj;
            for (Object object : elementInfoArray) {  
            	JSONObject elementInfoObject = (JSONObject) object; 
            	elementInfoObject = (JSONObject) elementInfoObject.get("elementInfo");
            	ElementInfo elementInfo = new ElementInfo(); 
            	elementInfo.elementName = (String) elementInfoObject.get("elementName");
            	elementInfo.locatorType = (String) elementInfoObject.get("locatorType"); 
            	elementInfo.locator = (String) elementInfoObject.get("locator");
            	elementInfoList.add(elementInfo);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return elementInfoList;
    }
}
