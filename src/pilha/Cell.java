/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author jao
 */
public class Cell <T>{
    private Cell proxima;
    private Cell anterior;
    private T elemento; //mudar pra T
    

    public Cell(Cell proxima,Cell anterior, T elemento) {
        this.proxima = proxima;
        this.anterior = anterior;
        this.elemento = elemento;
    }
    public Cell (T elemento){ //primeiroa
        this.elemento = elemento;
    }

    public Cell getProxima() {
        return proxima;
    }

    public void setProxima(Cell proxima) {
        this.proxima = proxima;
    }

    public Cell getAnterior() {
        return anterior;
    }

    public void setAnterior(Cell anterior) {
        this.anterior = anterior;
    }
    
    public T getElemento() { //mudar pra T
        return elemento;
    }

        public void setElemento(T elemento) { //mudar pra T
        this.elemento = elemento;
    } 
} 
