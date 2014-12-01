
import utfpr.ct.dainf.if62c.pratica.Equacao2Grau;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author davip_000
 */
public class Pratica52 {
    public static void main(String[] args){
        try{
            Equacao2Grau<Integer> eq1 = new Equacao2Grau<>(1,-5,6);
            System.out.println("Raízes da eq1: " + eq1.getRaiz1() + " e " + eq1.getRaiz2());
        }
        catch (RuntimeException e){
            System.out.println(e.getLocalizedMessage());
        }
        
        try{
            Equacao2Grau<Integer> eq2 = new Equacao2Grau<>(1,-4,4);
            System.out.println("Raízes da eq2: " + eq2.getRaiz1() + " e " + eq2.getRaiz2());
        }
        catch (RuntimeException e){
            System.out.println(e.getLocalizedMessage());
        }
        
        try{
        Equacao2Grau<Integer> eq3 = new Equacao2Grau<>(1,2,3);
        System.out.println("Raízes da eq3: " + eq3.getRaiz1() + " e " + eq3.getRaiz2());
        }
        catch (RuntimeException e){
            System.out.println(e.getLocalizedMessage());
        }
        
        System.out.println("Fim!");
    }
}
