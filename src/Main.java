import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        seller sellerAddproducts = new seller();

        while(true){
        System.out.println("Login / Register as 1. Admin 2. Client 3. Seller 4. Exit");
        Scanner read = new Scanner(System.in);
        int choice = read.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Please enter your email to login: ");
                String logemail = read.next();
                boolean emaillog = login.isValidmail(logemail);
                if (emaillog == true)
                    System.out.println("Provided email address " + logemail + " is valid");
                else
                    System.out.println("Provided email address " + logemail + " is invalid");

                System.out.println("Please enter your password: ");
                String loginpass = read.next();
                boolean passlogin = login.isValidPassLog(loginpass);
                if (passlogin == true) {
                    System.out.println("Correct Password");
                }else {
                    System.out.println("Woring password");
                    break;
                }
            case 2:
                System.out.println("Login or Register");
                String client = read.next();
                if (client.equals("Login")){
                    System.out.println("Please enter your email to login: ");
                    String cemail = read.next();
                    boolean clientlog = login.isValidmail(cemail);
                    if (clientlog == true)
                        System.out.println("Provided email address " + cemail + " is valid");
                    else
                        System.out.println("Provided email address " + cemail + " is invalid");

                    System.out.println("Please enter your password: ");
                    String cpass = read.next();
                    boolean cpasslogin = login.isValidPassLog(cpass);
                    if (cpasslogin == true) {
                        System.out.println("Correct Password");
                    }else {
                        System.out.println("Woring password");
                    }
                } else if (client.equals("Register")) {
                    System.out.println("PLease enter your data for registration");
                    //user name
                    System.out.println("Name: ");
                    String name = read.next();
                    //user phone number
                    System.out.println("Please enter you phone number : ");
                    String phonenumber = read.next();
                    boolean num = register.isValidPhoneNumber(phonenumber);
                    if (num == true)
                        System.out.println("Provided number is valid");
                    else
                        System.out.println("Provided number is invalid");
                    //user email
                    System.out.println("Please enter your email : ");
                    String email = read.next();
                    boolean result = register.isValid(email);
                    if (result == true)
                        System.out.println("Provided email address " + email + " is valid");
                    else
                        System.out.println("Provided email address " + email + " is invalid");
                    //user password
                    System.out.println("Enter your password : ");
                    String password = read.next();
                    boolean validpass = register.isValidPassword(password);
                    if (validpass == true)
                        System.out.println("Password is valid");
                    else
                        System.out.println("Password is not valid");
                } break;
            case 3 :
                    System.out.println("Please enter your email to login: ");
                    String sellerlog = read.next();
                    boolean Semaillog = login.isValidmail(sellerlog);
                    if (Semaillog == true)
                        System.out.println("Provided email address " + Semaillog + " is valid");
                    else
                        System.out.println("Provided email address " + Semaillog + " is invalid");

                    System.out.println("Please enter your password: ");
                    String sloginpass = read.next();
                    boolean spasslogin = login.isValidPassLog(sloginpass);
                    if (spasslogin == true) {
                        System.out.println("Correct Password");
                    } else {
                        System.out.println("Wrong password");
                    }
                        System.out.println("Enter the product's name:");
                        String product = read.next();
                        System.out.println("Enter the product's price:");
                        double price = read.nextDouble();
                        sellerAddproducts.addProduct(product, price);
                        System.out.println("Product added successfully.");
                        System.out.println("To show all items choose 1.");
                        int sellerchoice = read.nextInt();
                        if (sellerchoice == 1) {
                            sellerAddproducts.showAllProducts();
                        }
                        break;
            case 4:
                System.exit(0);
            default:
                System.out.println("invalid input");
            }
        }
    }
}


