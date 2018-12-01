/*package Selenium1;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class ReadJSONExamples
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("employees.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);
             
            //Iterate over employee array
            employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
 
    private static void parseEmployeeObject(JSONObject employee)
    {
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) employee.get("employee");
         
        //Get employee first name
        String firstName = (String) employeeObject.get("firstName");   
        System.out.println(firstName);
         
        //Get employee last name
        String lastName = (String) employeeObject.get("lastName"); 
        System.out.println(lastName);
         
        //Get employee website name
        String website = (String) employeeObject.get("website");   
        System.out.println(website);
    }
public class ReadJosn {
using gson
 public static void main(String[] args)
    {
        Gson gson=new Gson();
        try {
            System.out.println("Reading JSON from a file");
            System.out.println("----------------------------");

            BufferedReader br = new BufferedReader(new FileReader("testGson.json"));
            //convert the json string back to object
            TestCases testCasesObj = gson.fromJson(br, TestCases.class);

            System.out.println("Name Of Test Name: "+testCasesObj.getTestName());
            System.out.println("Name of Test Module: "+testCasesObj.getTestModule());
            System.out.println("Name of Test Verification: "+testCasesObj.getVerification());
            System.out.println("Test Steps are :");

            List listOfTestSteps = testCasesObj.getTestSteps();
            for (int i = 0; i < listOfTestSteps.size(); i++) {
                System.out.println("Id: " +listOfTestSteps.get(i).getId() + "   Step:  " + listOfTestSteps.get(i).getStep());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

}
*/