/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resolucaodosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author claud
 */
public class ResolucaoDoSistema {

    public static void main(String[] args) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) tela.getWidth();
        int altura = (int) tela.getHeight();
        System.out.println("A resolução da dela é " + largura + "x" + altura);
        
    }
}
