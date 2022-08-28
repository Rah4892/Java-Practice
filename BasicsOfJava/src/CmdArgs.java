public class CmdArgs {
    public static void main(String[] args) {
        System.out.println("The command line arguments are:");
        if (args.length >0){
            for(String val: args) {
                System.out.println(val);
            }
        }
    }
}
