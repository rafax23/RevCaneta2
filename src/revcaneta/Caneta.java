/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revcaneta;

/**
 *
 * @author ti
 */
public class Caneta {
      
    //atributos 
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    //metodos
    public void status(){
        //this é autoreferencia (quem chamou vira this)
        //this é o nome do objeto que chamou, ou seja, a instancia
        System.out.println("Modelo:: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor); 
        System.out.println("Ponta: " + this.ponta); 
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
       
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro! Não posso rabisar (tampada)");
        }else{
            System.out.println("Estou rabiscando (destampada)");
        }
    }
        
    public void tampar(){
        this.tampada = true;
    }
        
    public void destampar(){
        this.tampada = false;
    }
    
}
