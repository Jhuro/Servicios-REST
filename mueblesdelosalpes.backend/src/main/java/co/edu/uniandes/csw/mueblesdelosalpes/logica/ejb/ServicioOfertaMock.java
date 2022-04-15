/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniandes.csw.mueblesdelosalpes.logica.ejb;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Oferta;
import co.edu.uniandes.csw.mueblesdelosalpes.excepciones.OperacionInvalidaException;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioOfertaMockLocal;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioPersistenciaMockLocal;
import co.edu.uniandes.csw.mueblesdelosalpes.persistencia.mock.ServicioPersistenciaMock;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 * @author jupbc
 */
@Stateless
public class ServicioOfertaMock implements IServicioOfertaMockLocal{

    private IServicioPersistenciaMockLocal persistencia;
    
    public ServicioOfertaMock ()
    {
        persistencia=new ServicioPersistenciaMock();
  
    }
    
    @Override
    public void agregarOferta(Oferta oferta) throws OperacionInvalidaException{
        
        try
        {
            persistencia.create(oferta);
        }
        catch (OperacionInvalidaException ex)
        {
            throw new OperacionInvalidaException(ex.getMessage());
        }
    }

    @Override
    public List<Oferta> getOfertas() {
        
        return persistencia.findAll(Oferta.class);
    }
    
}