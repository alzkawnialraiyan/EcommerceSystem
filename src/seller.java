import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class seller {
    String semail;
    String susername;
    String spassword;
    String Sproduct;
    double Sprice;
    private List<seller>items = new ArrayList<>();
    public void addProduct(String product, double price) {
        Sproduct = product;
        Sprice = price;
        seller item = new seller();
       items.add(item);
    }
    public void showAllProducts() {
        System.out.println("Products and price:");
        for (seller item : items) {
            System.out.println(Sproduct + ": " + Sprice);
        }
    }
    static boolean isValid(String email)
    {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        if (email == null) {
            return false;
        }
        return pattern.matcher(email).matches();
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
