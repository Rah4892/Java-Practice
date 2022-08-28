public class StringRotations {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("moonisblack");
        StringBuffer str2 = new StringBuffer("isblackmoon");
        checkRotation(str1, str2);
    }
    public static void checkRotation(StringBuffer str1, StringBuffer str2) {
        //Approach
        //create one string by appending the string twice
        //now if the appended string has a substring equal to the test string then the rotation is perfect, return true
        //else return false
        str1.append(str1);
        int len = str1.length();
        int len2 = str2.length();
        boolean isRotated = false;
        for(int i=0;(i+len2)<len;i++) {
            String str = str1.substring(i, (i+len2)%len);
            if (str.equalsIgnoreCase(String.valueOf(str2))) {
                isRotated = true;
                break;
            }
        }
        System.out.println(isRotated);
    }
}
