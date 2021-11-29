
package com.ordepsolutions.datastruture.vector;

public class Vector {
    
    private String[] elementos;
    
    public  Vector(int capacidade){
        this.elementos =new String[capacidade];
    }
    
    /*
      Antes de adicionar qualquer elemento no vector
      Vamos itera -lo e verificar se existe alguma posição nula
      para podermos adicionar o nosso novo elemento e podemos 
      fazer isso com um for , para passar em cada posição do arays e
      fazer a verificação desejada.
    */
    public void add(String elemento){
        for (int i = 0; i <this.elementos.length; i++) {
            if (this.elementos[i]==null) {
                /*Se a verificação for verdadeira o elemento será adicionado na primeira
                  posição nula encontrada e o for termina
                */
                this.elementos[i]=elemento;
                break;
                
            }
        }
        
    }
}
