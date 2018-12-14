/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author masacr3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vendedor a = new Vendedor("mati","rea",43282,"laferrere 2323",1122334455,30000,"a22s","peugeot","208","humo",10);
        Vendedor b = new Vendedor("nacho","lopez",53478,"las cañitas 1000",112312341,10000,"b23a","peugeot","205","protesis",10);
        Vendedor c = new Vendedor("marto","stefanelli",18457,"av santa fe 2020",1133452455,20000,"c25c","peugeot","308","yogur",10);
        
        System.out.println("\n------------------\n");
        System.out.println(a+"\n");
        System.out.println("incremento el salario------- \n");
        a.incremetarSalario();
        System.out.println(a+"\n");
        
        System.out.println("\n------------------\n");
        System.out.println(b+"\n");
        System.out.println("incremento el salario------- \n");
        b.incremetarSalario();
        System.out.println(b+"\n");
        
        System.out.println("\n------------------\n");
        System.out.println(c+"\n");
        System.out.println("incremento el salario------- \n");
        c.incremetarSalario();
        System.out.println(c+"\n");
        
        
        
    }
    
}
