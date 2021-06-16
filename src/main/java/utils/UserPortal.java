package utils;

import java.util.Map;

public class UserPortal {
    private static Map<String, UserData> credentials;
  
    public static void loadCredentials(Map<String, UserData> mapOfCredentials) {
        credentials = mapOfCredentials;
    }
    public static UserData getData(String id) { return credentials.get(id); }
    
  
}
