#include <stdio.h>

int main() {
  int a, i;
  scanf("%d", &a);
  int all[a];
  scanf("%d", &i);

  int inputUser;
  while(i-- > 0) {
    scanf("%d", &inputUser);
    all[inputUser-1] = 1;
  }

  for(int i = 0; i < a; i++) {
    if(all[i] != 1){
        printf("%d ", (i+1));
    }
  }
  
  return 0;
}