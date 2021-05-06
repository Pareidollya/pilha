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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z = 2;
        int j = 3;
        int k = 4;
        pilha p = new pilha();
        
        p.Push(x);
        p.Push(y);
        p.Push(z);
        
        p.print();
        p.Pop();
        p.print();
        
        p.Pull(k);
        p.print();
    }
    
}
