/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.restful.testjsontoobject;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author mmendez
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String textoEnJson = "{ \"id\":1, \"nombre\": \"manuel\", \"edad\":31}";
        try {
            
            ObjectMapper mapper = new ObjectMapper();
            Persona objetoPersona = mapper.readValue(textoEnJson, Persona.class);
            
            System.out.println("Nombre:"+objetoPersona.getNombre());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
