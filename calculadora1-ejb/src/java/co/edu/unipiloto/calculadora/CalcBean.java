/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.calculadora;

import javax.ejb.Stateless;

/**
 *
 * @author Manuel Castro
 */
@Stateless
public class CalcBean implements CalcBeanLocal {

    @Override
    public Integer suma(int valor1, int valor2) {
        return valor1 + valor2;
    }
    public Integer resta(int valor1, int valor2) {
        return valor1 - valor2;
    }
    public Integer multiplicar(int valor1, int valor2) {
        return valor1 * valor2;
    }
    public Integer dividir(int valor1, int valor2) {
        return valor1 / valor2;
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
}
