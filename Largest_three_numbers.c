#include <stdio.h>
#include <limits.h>

int main() {
	//code
	int a[5];
	int first=INT_MIN,second=INT_MIN,third=INT_MIN;//initialisibg the variables
	for(int i=0;i<5;i++){
	    scanf("%d",&a[i]);
	    int x=a[i];
	    if(x>first){
	        third=second;
	        second=first;
	        first=x;
	    }
	    else if(x>second && x!=first){
	        third=second;
	        second=x;
	    }
	    else if(x>third && x!=second){
	        third=x;
	    }
	}
	printf("%d\t%d\t%d",first,second,third);
	return 0;
}
