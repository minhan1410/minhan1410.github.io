import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ReadFile {
    public void getData(){
        //ArrayList<Customer> listCustomer = new ArrayList<>();
        JSONParser parser = new JSONParser();


        try(FileReader reader = new FileReader("customer.json")){

            //Read JSON file
            Object obj = parser.parse(reader);
 
            JSONArray customerList = (JSONArray) obj;
            //System.out.println(customerList);

            //Iterate over employee array
            customerList.forEach( cus -> parseCustomerObject( (JSONObject) cus ) );
             
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void parseCustomerObject(JSONObject jsonObject){

        long id = (long) jsonObject.get("id");

        String first_name = (String) jsonObject.get("first_name");

        String last_name = (String) jsonObject.get("last_name");

        String email = (String) jsonObject.get("email");

        String mobile = (String) jsonObject.get("mobile");

        String address = (String) jsonObject.get("address");
        
        System.out.println(id + " - " +first_name+" - " + last_name 
                        + " - " + email + " - " + mobile + " - " + address);
    }
    
}
