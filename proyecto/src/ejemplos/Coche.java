/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author MD
 */
public class Coche {

    private int velocidad;

    Coche() {
        velocidad = 0;
    }
public int getVelocidad(){
   return velocidad; 
}
public void acelera (int mas){
    this.velocidad+=mas;
}
public void frena (int menos){
    if(this.velocidad-menos<0){
        System.out.println("no puedes frenar más de "+this.velocidad);
    }
    this.velocidad-=menos;
}
}
