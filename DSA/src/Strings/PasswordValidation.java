package Strings;

public class PasswordValidation {
    public static void main(String[] args) {
        //Testing different input strings
        String str1 = "Geeks@portal20";
        String str2 = "Geeksforgeeks";
        String str3 = "Geeks@ portal9";
        String str4 = "1234";
        String str5 = "geeks@portal20";
        System.out.println(isValidPassword(str1));
        System.out.println(isValidPassword(str2));
        System.out.println(isValidPassword(str3));
        System.out.println(isValidPassword(str4));
        System.out.println(isValidPassword(str5));
    }

    public static boolean isValidPassword(String password) {
    boolean result = false;
    String regex = "^(?=.*[0-9])"
                    + "(?=.*[a-z])(?=.*[A-Z)"
                    + "(?=.*[@#$%&+-()])"
                    + ".{8,20}$";

    return result;
    }
}
