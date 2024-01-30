// This is a functional problem. Your task is to return the product of array elements under a given modulo.
// The modulo operation finds the remainder after the division of one number by another. For example, K(mod(m))=K%m= remainder obtained when K is divided by m

// Example:

// Input:
// 1
// 4
// 1 2 3 4

// Output:
// 24
// Input:
// The first line of input contains T denoting the number of test cases. Then each of the T lines contains a single positive integer N denotes the number of elements in the array. The next line contains 'N' integer elements of the array.


// Output:
// Return the product of array elements under a given modulo.
// That is, return (Array[0]*Array[1]*Array[2]...*Array[n])%modulo.


//  product of an array


public class qus11 {
    public static Long product(Long arr[], Long mod, int n) {
        long mul = 1;

        for (int i = 0; i < n; i++) {

            mul = (mul * arr[i]) % mod;

        }

        return mul;
    }
}
