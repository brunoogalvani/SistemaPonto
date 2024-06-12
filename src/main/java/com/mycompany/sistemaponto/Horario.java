/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaponto;

/**
 *
 * @author bthez
 */
public class Horario {
    private String entradaManha, saidaManha, entradaTarde, saidaTarde, entradaNoite, saidaNoite;

    public Horario(String entradaManha, String saidaManha, String entradaTarde, String saidaTarde, String entradaNoite, String saidaNoite) {
        this.entradaManha = entradaManha;
        this.saidaManha = saidaManha;
        this.entradaTarde = entradaTarde;
        this.saidaTarde = saidaTarde;
        this.entradaNoite = entradaNoite;
        this.saidaNoite = saidaNoite;
    }

    public String getEntradaManha() {
        return entradaManha;
    }

    public void setEntradaManha(String entradaManha) {
        this.entradaManha = entradaManha;
    }

    public String getSaidaManha() {
        return saidaManha;
    }

    public void setSaidaManha(String saidaManha) {
        this.saidaManha = saidaManha;
    }

    public String getEntradaTarde() {
        return entradaTarde;
    }

    public void setEntradaTarde(String entradaTarde) {
        this.entradaTarde = entradaTarde;
    }

    public String getSaidaTarde() {
        return saidaTarde;
    }

    public void setSaidaTarde(String saidaTarde) {
        this.saidaTarde = saidaTarde;
    }

    public String getEntradaNoite() {
        return entradaNoite;
    }

    public void setEntradaNoite(String entradaNoite) {
        this.entradaNoite = entradaNoite;
    }

    public String getSaidaNoite() {
        return saidaNoite;
    }

    public void setSaidaNoite(String saidaNoite) {
        this.saidaNoite = saidaNoite;
    }

    @Override
    public String toString() {
        return "{entradaManha = " + entradaManha + ", saidaManha = " + saidaManha + ", entradaTarde = " + entradaTarde + ", saidaTarde = " + saidaTarde + ", entradaNoite = " + entradaNoite + ", saidaNoite = " + saidaNoite + "}";
    }
    
    
}
