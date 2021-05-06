
package pilha;

import java.util.Iterator;

/**
 *
 * @author jao
 */
public class Iterador<T> implements Iterator{

    private Cell atual;

    public Iterador(Cell atual) {
        this.atual = atual;
    }
    
    @Override
    public boolean hasNext() {
        if(atual != null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        T elemento = (T) atual.getElemento();
        atual = atual.getProxima();
        return elemento;
    }

    public Cell getAtual() {
        return atual;
    }
}
