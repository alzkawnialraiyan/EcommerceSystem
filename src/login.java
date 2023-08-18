import java.util.regex.Pattern;
public class login {
    static boolean isValidmail(String logemail)
    {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        if (logemail == null) {
            return false;
        }
        return pattern.matcher(logemail).matches();
    }
    static boolean isValidPassLog(String loginpass)
    {
        String regex ="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%_]).{8,20}$";
        Pattern pas = Pattern.compile(regex);
        if(loginpass == null){
            return false;
        }
        return pas.matcher(loginpass).matches();
    }
}
