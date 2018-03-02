/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operations;

import java.io.Serializable;

/**
 *
 * @author User1
 */
public class Operation implements Serializable{
    /*
    Operacion
    
    0:
        Si el cliente recibe 0, añade un articulo a su lista
        Si el servidor recibe 0, manda los articulos que hay en la "base de datos"
    
    1: 
        Si el cliente recibe 1, su compra fue exitosa
        Si el servidor recibe 1, hace el proceso de compra (disminuye la cantidad en stock del articulo)
    
    2:
        Si el cliente recibe 2, su compra no pudo ser completada o al añadir un articulo algo sale mal.  
        Si el servidor ercibe 2, añade un articulo a la "base de datos"
    */
    private int Op;
    private Articulo art;

    public Operation() {
    }

    public int getOp() {
        return Op;
    }

    public void setOp(int Op) {
        this.Op = Op;
    }

    public Articulo getArt() {
        return art;
    }

    public void setArt(Articulo art) {
        this.art = art;
    }

    @Override
    public String toString() {
        return "Operation{" + "Op=" + Op + ", art=" + art.toString() + '}';
    }
    
    

}
