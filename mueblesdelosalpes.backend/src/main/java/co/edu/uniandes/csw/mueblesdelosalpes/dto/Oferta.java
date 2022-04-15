/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniandes.csw.mueblesdelosalpes.dto;

/**
 *
 * @author jupbc
 */
public class Oferta {
    
    private long idOferta;
    private String loginUsuarioOfertante;
    private long referenciaMueble;
    private double oferta;
    
    public Oferta(){
    
    }
    
    public Oferta(long idOferta, String loginUsuarioOfertante, long referenciaMueble, double oferta){
    
        this.idOferta = idOferta;
        this.loginUsuarioOfertante = loginUsuarioOfertante;
        this.referenciaMueble = referenciaMueble;
        this.oferta= oferta;
    }

    public long getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(long idOferta) {
        this.idOferta = idOferta;
    }

    public String getLoginUsuarioOfertante() {
        return loginUsuarioOfertante;
    }

    public void setLoginUsuarioOfertante(String loginUsuarioOfertante) {
        this.loginUsuarioOfertante = loginUsuarioOfertante;
    }

    public long getReferenciaMueble() {
        return referenciaMueble;
    }

    public void setReferenciaMueble(long referenciaMueble) {
        this.referenciaMueble = referenciaMueble;
    }

    public double getOferta() {
        return oferta;
    }

    public void setOferta(double oferta) {
        this.oferta = oferta;
    }
}