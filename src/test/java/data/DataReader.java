package data;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

    public String eemail;

    public void Reader() throws FileNotFoundException, IOException, ParseException {

        String path =System.getProperty("user.dir")+"\\src\\test\\java\\data\\UserData.json";
        File srcfile = new File(path);
        org.json.simple.parser.JSONParser parser = new JSONParser();
        JSONArray jarray = (JSONArray) parser.parse(new FileReader(srcfile));

        for(Object yobject : jarray) {

            JSONObject person = (JSONObject) yobject;
            eemail=(String) person.get("email");

        }


    }





}
