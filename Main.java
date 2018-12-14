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
        
        Vendedor v1 = new Vendedor("mati","rea",43282,"laferrere 2323",1122334455,30000,"a22s","peugeot","208","humo",10);
        Vendedor v2 = new Vendedor("nacho","lopez",53478,"las cañitas 1000",112312341,10000,"b23a","peugeot","205","protesis",10);
        Vendedor v3 = new Vendedor("marto","stefanelli",18457,"av santa fe 2020",1133452455,20000,"c25c","peugeot","308","yogur",10);
        
        System.out.println("\n------------------\n");
        System.out.println(v1+"\n");
        System.out.println("incremento el salario------- \n");
        v1.incremetarSalario();
        System.out.println(v1+"\n");
        
        System.out.println("\n------------------\n");
        System.out.println(v2+"\n");
        System.out.println("incremento el salario------- \n");
        v2.incremetarSalario();
        System.out.println(v2+"\n");
        
        System.out.println("\n------------------\n");
        System.out.println(v3+"\n");
        System.out.println("incremento el salario------- \n");
        v3.incremetarSalario();
        System.out.println(v3+"\n");
        
        Secretario s1 = new Secretario("carlos","menem",33331,"av boedo 1100",11123141,50000,"lb");
        
        System.out.println("\n------------------\n");
        System.out.println(s1+"\n");
        System.out.println("incremento el salario------- \n");
        s1.incremetarSalario();
        System.out.println(s1+"\n");
        
        JefeDeZona jefe = new JefeDeZona("Papa de mati","rea",33331,"av libertador 10",1122334411,100000,"a12",s1,"aa21a","audi","a4");
        System.out.println("\n------------------\n");
        System.out.println(jefe+"\n");
        System.out.println("incremento el salario------- \n");
        jefe.incremetarSalario();
        System.out.println(jefe+"\n");
        
        v1.setSupervisor(jefe);
        v2.setSupervisor(jefe);
        v3.setSupervisor(jefe);
        
        System.out.println("vendedor "+v1.getNombre()+" -->supervisor "+v1.getSupervisor().getNombre());
        System.out.println("vendedor "+v2.getNombre()+" -->supervisor "+v2.getSupervisor().getNombre());
        System.out.println("vendedor "+v3.getNombre()+" -->supervisor "+v3.getSupervisor().getNombre());
        
        
        System.out.println("\nv1, v2, v3 dados de alta");
        jefe.darAlta(v1);
        jefe.darAlta(v2);
        jefe.darAlta(v3);
        
        System.out.println("\nLista de vendedores\n");
        
        for ( Vendedor v : jefe.getListaVendedores()){
            System.out.println("\t"+v.getNombre());
        }
        
        System.out.println("\ndar de baja v2");
        jefe.darBaja(v2);
        
        System.out.println("\nLista de vendedores\n");
        
        for ( Vendedor v : jefe.getListaVendedores()){
            System.out.println("\t"+v.getNombre());
        }
        
        System.out.println("\nSecretario actual del jefe -> "+jefe.getSecretario().getNombre());
        
        Secretario s2 = new Secretario("marcelo","tinelli",1111,"av cuevo 2200",11146521,40000,"lc");
        jefe.cambiarSecretario(s2);
        
        System.out.println("cambiar secretario");
        System.out.println("Secretario actual del jefe -> "+jefe.getSecretario().getNombre());
        
    }
    
}
