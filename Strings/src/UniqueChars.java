public class UniqueChars {
    public static void main(String[] args) {
        String str = "this";
        boolean isUnique = true;
        char c = ' ';
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) != ' ') {
                c = str.charAt(i);
            }
            for(int j=i+1;j<str.length();j++) {
                char d = str.charAt(j);
                if ((d != ' ') && (d == c)) {
                    isUnique = false;
                }
            }
        }
        System.out.println(isUnique);
    }
}
