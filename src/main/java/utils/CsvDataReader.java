package utils;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CsvDataReader {
	
    static String fileNameDefined = "./src/test/resources/test-data/" + WrapperElements.properties.getProperty("STAFF_CUSTOMER");
    static File file = new File(fileNameDefined);

    
    public static Map<String, UserData> readFile() {
        Map<String, UserData> result = new HashMap<>();

        try{
            Scanner inputStream = new Scanner(file);

            if (inputStream.hasNext()) inputStream.next();

            while(inputStream.hasNext()){
                String[] line = inputStream.next().split(",");
                for (String string : line) {
					System.out.println(string);
				}
                UserData data = new UserData();
                data.Country_Registred = line[0];
                data.UEN = line[1];
                data.Username = line[2];
                data.Organization_type = line[3];
                data.Established_year = line[4];
                data.postal_code = line[5];
                data.First_Name = line[6];
                data.Last_Name = line[7];
                data.Attention_to = line[8];
                data.contact_Role = line[9];
                data.Contact_Number = line[10];
                data.Email = line[11];
                data.Password = line[12];
                result.put(line[2], data);
            }
            inputStream.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return result;
    }
    
  
}