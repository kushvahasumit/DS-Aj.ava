// Given an array arr[] containing positive elements. A and B are two numbers defining a range. The task is to check if the array contains all elements in the given range.

// Example 1:

// Input: N = 7, A = 2, B = 5
// arr[] =  {1, 4, 5, 2, 7, 8, 3}
// Output: Yes
// Explanation: It has elements between 
// range 2-5 i.e 2,3,4,5

public class qus3 {
    boolean check_elements(int arr[], int n, int A, int B)
    {
    // Initialize an array to store counts for numbers within the range [A, B].
int[] count = new int[B - A + 1];

// Loop through each number in the array 'arr'.
for (int num : arr) {
    // Check if the number falls within the range [A, B].
    if (num >= A && num <= B) {
        // Update the count array to mark the presence of the number within the range.
        count[num - A] = 1;
    }
}

// Check if any number within the range [A, B] is missing in the 'arr' array.
for (int num : count) {
    // If any number is missing, return false.
    if (num == 0) {
        return false;
    }
}

// If all numbers within the range [A, B] are present in the 'arr' array, return true.
return true;


    }
}
