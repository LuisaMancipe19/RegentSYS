/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

/**
 *
 * @author Auxfacturacion
 */
public class Validaciones {
    public static boolean esNumero(String textoEvaluar){
        String expresion = "^[0-9]*$";
        return textoEvaluar.matches(expresion);
    }
    public static boolean esTexto(String textoEvaluar){
        String expresion = "^[a-zA-ZñÑ]*$";
        return textoEvaluar.matches(expresion);
    }
    public static boolean esCorreoElectronico(String textoEvaluar){
        String expresion = "^[A-ZÑ@.]*$";
        return textoEvaluar.matches(expresion);
    }
    public static boolean noEsNuloVacio(String cadena){
        if(cadena != null && cadena.trim().length()>0){
            return true;
        }else{
            return false;
        }
    }
}
