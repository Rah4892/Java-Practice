public class StringDemo {
   
    public static void main(String[] args) {
        String str1 = "Test";
        String str2 = "Test1";  //references will be different
        String str3 = "Test";   //references are same
        if (str1 == str2) {
            System.out.println("true");
        }
        else if (str1.equals(str2)) {
            System.out.println("true content");
        }

        char[] testarr = str1.toCharArray();
        System.out.println(testarr[0]);
        
    }
}
