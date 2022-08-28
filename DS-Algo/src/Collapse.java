public class Collapse {
    public static void main(String args[]){
        int arr[] = {1,0,4,5,0,0,0,7,9,0};
        int j= arr.length-1;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        int i = arr.length-1;
        while(i>=0){
            if(arr[i]!=0){
                i--;
            }
            else{
                
            }
        }
        System.out.println();
        for(int k=0;j<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
