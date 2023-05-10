// Given a number N, write a program to find a maximum number that can be formed using all of the digits of this number.
// Example 1:
// Input:
// N = "38293367"
// Output:
// 98763332 
// Explanation: 98763332 is the largest number that can be formed by rearranging the digits of N.

class Solution {
    static String findMax(String N) {
        // code here
        char[] a=N.toCharArray();
        Arrays.sort(a);
        for(int i=0,j=N.length()-1;i<j;i++,j--){
            char temp=a[j];
            a[j]=a[i];
            a[i]=temp;
        }
        return new String(a);
    }
};
