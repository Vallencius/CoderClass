#include<stdio.h>
int main(){
    int a = 0, b = 0, k = 0;
    scanf("%d %d", &a, &b);
    int arr[a];
    while(b-->0){
        scanf("%d", &k);
        arr[k-1] = 1;
    }
    for(int i = 0; i<a; i++){
        if(arr[i]!=1){
            printf("%d ", i+1);
        }
    }
}