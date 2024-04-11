#include<bits/stdc++.h>
using namespace std;

void myarr(vector<int>&arr){
    int left=0;
    int len = arr.size();
    int right= len -1;

    // 123456
    while (left < right)
    {
        // swap(arr[left],arr[right]);
        // left++;
        // right--;

        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
    }
    
}

int main(){
    vector<int>arr={1,2,3,4,5,6};
    myarr(arr);
    for (int i = 0; i < arr.size(); i++)
    {
        cout<<arr[i]<<endl;
    }
    
    return 0;
}

