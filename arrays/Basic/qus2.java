import java.util.ArrayList;

// Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).

// Note: There can be more than one element in the array which have the same value as its index. You need to include every such element's index. Follows 1-based indexing of the array.

// Example 1:

// Input:
// N = 5
// Arr[] = {15, 2, 45, 12, 7}
// Output: 2
// Explanation: Only Arr[2] = 2 exists here.



public class qus2 {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
        if(arr[i] == i+1){
        result.add(i+1);
        } 
        }
        return result;
    }
}
