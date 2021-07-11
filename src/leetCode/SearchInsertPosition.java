package leetCode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        // Assuming we have sorted array and we have a given value
        // must check were given value fit in the array
        // Ex [1,2,3,4] and value is 5 position should be 4 and so on

        int [] arr = {1,2,3,4};
        int value = 8; // position of this value should be 4

        for(int i =0; i < arr.length-1;i++){
            if(value < arr[i]){
                System.out.println("Position of the element is " + (i-1));
            }else if(value > arr[arr.length-1]){
                System.out.println("Position of the element is " + arr.length+1);
            }else if(value > arr[i] && value < arr[i+1]){
                System.out.println("position of the element is " + arr[i+1]);

            }else{
                System.out.println("Unknown Location");
            }
        }
    }
}
