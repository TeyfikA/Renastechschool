package Day19;

public class C11AnonymousArray {
    public static void main(String[] args) {
        printArray(
                new int[]{10,20,30}
        );
    }
    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
