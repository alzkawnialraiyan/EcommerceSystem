
import java.util.regex.Pattern;
public class register {
    static boolean isValid(String email)
    {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        if (email == null) {
            return false;
        }
        return pattern.matcher(email).matches();
    }
    static boolean isValidPhoneNumber(String phonenumber)
    {
        String regex = "^(\\+\\d{3}( )?)?\\d{4}[- .]?\\d{4}$";
        Pattern p = Pattern.compile(regex);
        if (phonenumber == null) {
            return false;
        }
        return p.matcher(phonenumber).matches();
    }
    static boolean isValidPassword(String password)
    {
        String regex ="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%_]).{8,20}$";
        Pattern pas = Pattern.compile(regex);
        if(password == null){
            return false;
        }
        return pas.matcher(password).matches();
    }
}
