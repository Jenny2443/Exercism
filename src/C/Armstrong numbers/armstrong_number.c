#include "armstrong_number.h"
#include <string.h>
#include <stdlib.h>
#include <stdio.h>
#include <math.h>

int numberdigits(int n);


int numberdigits(int n){
    int cont = 0;
    do {
    n /= 10;
    ++cont;
  } while (n != 0);
  return cont;
}

bool is_armstrong_number(int candidate){
    int numeroInicial = candidate;
    int digitos = numberdigits(candidate);
    int suma = 0;
    int numero = 0;
    while(candidate != 0){
        numero = candidate % 10;
        suma += pow(numero,digitos);
        candidate /= 10;
    }
    return numeroInicial == suma;
}

int main(void){
    printf("%d\n",is_armstrong_number(1));
    return 0;
}
