package vn.techmaster;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.sound.midi.Soundbank;

import com.fasterxml.jackson.core.JsonParser;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {
    public static void main(String[] args) {
        Object obj;

        try {
            obj = new JSONParser().parse(new FileReader("MOCK_DATA.json"));
            JSONObject jsonObject = (JSONObject) obj;

            String firstName = (String) jsonObject.get("first_name");
            String lastName = (String) jsonObject.get("last_name");
            System.out.println("firstName: " + firstName);
            System.out.println("lastName: " + lastName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        

    }
}
