package com.practise1.intl.QA.selenium.utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class JsonReader {

    public static String getTestData(String key) {
        try {
            JSONParser parser = new JSONParser();
            FileReader reader = new FileReader("src/test/resources/testdata/loginData.json");
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            return (String) jsonObject.get(key);
        } catch (Exception e) {
            throw new RuntimeException("Failed to read test data for key: " + key, e);
        }
    }
}
