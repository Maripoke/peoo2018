/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.prova1;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Resposta1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de linhas: ");
        int numeroLinhas = scanner.nextInt();
        int numero = 1;        
        for (int i=0;i<numeroLinhas;i++){            
            int numeroLocal = numero;
            for (int j=0;j<i+1;j++){
                System.out.print(numeroLocal);
                if (numeroLocal == 1){
                    numeroLocal = 0;
                }else{
                    numeroLocal = 1;
                }                    
            }
            if (numero== 1){
                    numero = 0;
                }else{
                    numero = 1;
                }    
            System.out.println();
        }
    }
}
