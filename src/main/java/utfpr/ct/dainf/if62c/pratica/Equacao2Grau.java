/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author davip_000
 */
public class Equacao2Grau<T extends Number> {
    
    private T a;
    private T b;
    private T c;
    
    public Equacao2Grau(T a,T b,T c){
        if(a.doubleValue()==0){
            throw new RuntimeException("Coeficiente a não pode ser zero");
        }
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public T getA(){
        return a;
    }
    
    public void setA(T a){
        if(a.doubleValue()==0){
            throw new RuntimeException("Coeficiente a não pode ser zero");
        }
        this.a = a;
    }
    
    public T getB(){
        return b;
    }
    
    public void setB(T b){
        this.b=b;
    }
    
    public T getC(){
        return c;
    }
    
    public void setC(T c){
        this.c=c;
    }
    
    public double getRaiz1(){
        double A = a.doubleValue(),B = b.doubleValue(),C = c.doubleValue(),x,delta = Math.pow(B, 2) - 4*A*C;
        if (delta<0){
            throw new RuntimeException("Equação não tem solução real");
        }
        x = (-B + Math.sqrt(delta))/(2*A);
        return x;
    }
    
    public double getRaiz2(){
        double A = a.doubleValue(),B = b.doubleValue(),C = c.doubleValue(),x,delta = Math.pow(B, 2) - 4*A*C;
        if (delta<0){
            throw new RuntimeException("Equação não tem solução real");
        }
        x = (-B - Math.sqrt(delta))/(2*A);
        return x;
    }
}
