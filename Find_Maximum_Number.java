

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
