public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("This is a test");
        System.out.println(stringBuffer);
        for (int i=0;i<stringBuffer.length();i++) {
            if(stringBuffer.charAt(i) == ' ') {
                stringBuffer.deleteCharAt(i);
            }
        }
        System.out.println(stringBuffer);
    }
}
