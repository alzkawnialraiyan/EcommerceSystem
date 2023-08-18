import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class client extends seller{
    String cemail;
    String cusername;
    String cpassword;
    int phonenumber;
    String cproduct;
    double cprice;
    List<client> addproduct = new ArrayList<>();
    static boolean isValid(String cemail)
    {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        if (cemail == null) {
            return false;
        }
        return pattern.matcher(cemail).matches();
    }
    static boolean isValidPassword(String cpassword)
    {
        String regex ="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%_]).{8,20}$";
        Pattern pas = Pattern.compile(regex);
        if(cpassword == null){
            return false;
        }
        return pas.matcher(cpassword).matches();
    }
    public void clientaddProduct(String product, double price) {
        client addproduct = new client();
        addproduct.clientaddProduct(product, price);
    }
}
