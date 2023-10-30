import java.util.ArrayList;
import java.util.List;

public class allusers {
    private static List<Users> allUsersList = new ArrayList<>();

    public static void registerUser(String str, Users user) {
        allUsersList.add(user);
    }

    public static void addUser(Users u) {
        allUsersList.add(u);
    }

    public static boolean searchUser(String email) {
        for (Users user : allUsersList) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public static Users getUser(String email) {
        for (Users user : allUsersList) {
            if (user.getEmail().equals(email)) {
                return user;
            }
            
        }
        return null;
    }
    
    
}
