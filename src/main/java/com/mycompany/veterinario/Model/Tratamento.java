/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinario.Model;

/**
 *
 * @author gabri
 */
public class Tratamento {
    private int id;
    private String data_inicio;
    private String data_final;

    public Tratamento(int id, String data_inicio, String data_final) {
        this.id = id;
        this.data_inicio = data_inicio;
        this.data_final = data_final;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_final() {
        return data_final;
    }

    public void setData_final(String data_final) {
        this.data_final = data_final;
    }
    
    
}
