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
public class pilha <T>{
    private Cell first;
    private Cell last;
    private int elementos;
    
    public pilha(){
        this.first = null;
        this.last = null;
        this.elementos = 0;
    }

     public void Push(T elemento){
        Cell nova = new Cell(null,this.last,elemento); //proximo do ultimo = null
        
        if (this.elementos == 0){
            this.first = this.last = nova;
            System.out.println(nova.getElemento()+ " add");
            this.elementos++;
            }
        
        else{
            this.last.setProxima(nova);
            this.last.setAnterior(this.anterior(this.last));
            this.last = nova;
            System.out.println(nova.getElemento()+" add");
            this.elementos++;
        }
    }
     
       public boolean existeDado(){
        this.Vazia();
        if (this.last != null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void Pull(T elemento){ //muda apenas o elemento
        this.Vazia();
        this.Pop();
        this.Push(elemento);
    }
    public T Top() {
        return (T) this.last.getElemento();
    }
    
    public void Pop(){
          if(this.elementos == 0){
            System.out.println("Pilha vazia!");
        }
        else if(this.first == this.last){ 
            this.first = this.last = null;
            this.elementos--;
            }
        Iterador it = new Iterador(this.first);       
        while(it.hasNext()){
            if(it.getAtual().getProxima().getProxima() == null){
                //System.out.println(it.getAtual().getProxima().getElemento() + " Removido");
                it.getAtual().setProxima(null);
                this.last = null;
                this.last = it.getAtual();
                this.last.setAnterior(this.anterior(it.getAtual()));              
                this.elementos--;              
            }
            it.next();
        }
    }
    
        public void limpa(){
        this.Vazia();    
        Iterador it = new Iterador(this.first);
        int i = 0;
        while(it.hasNext()){
            if (i != this.elementos){
            it.getAtual().setElemento(null);
            i++;
            it.next();
        }
            else{
                break;
            }             
    }
        this.first = this.last = null;
        System.out.println("limpo");
    }

    public int tamanho() {
        return elementos;
    }
    
 public void print(){
        Iterador it = new Iterador(this.first);
        System.out.println("");
        while (it.hasNext()){
            System.out.print(it.getAtual().getElemento() + " ");
            it.next();  
        }
        System.out.println("\n");
    }    
    
    public void Vazia(){
        if (this.elementos == 0){
            System.out.println("A pilha está vazia");
        }
    }      
     
    public Cell anterior(Cell elemento){ //retorna o elemento anterior do citado POG
        Iterador it = new Iterador(this.first); 
        while(it.hasNext()){
            if(it.getAtual().getProxima() == null) break;
            if (it.getAtual().getProxima().equals(elemento) == true){
                break;
            }
            else{
                it.next();
            }       
        }
        return it.getAtual();
        
    }
   
}
    

    

