#include <stdio.h>

int main() {
  int  nbr, i, tab[100], tmp[100];
 
  printf(" Entrez le nombre d'elements dans le tableau: ");
  scanf("%d", &nbr);
 
  printf(" Entrez %d entiers : ", nbr);
 
  for (i = 0; i < nbr; i++)
    scanf("%d", &tab[i]);
 
  triFusion(0, nbr-1, tab, tmp);
 
  printf("\n Tableau trie : ");
  for(i = 0; i < nbr; i++)  {
     printf(" %4d", tab[i]);
  }
  printf("\n");
  return 0;
}
