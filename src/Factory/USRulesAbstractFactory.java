/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Model.Certificate;
import Model.Packing;
import Model.UScertificate;
import Model.USpacking;

/**
 *
 * @author RROBASSETO
 */
public class USRulesAbstractFactory implements CountryRulesAbstractFactory{

    @Override
    public Certificate getCertificate() {
        System.out.println("Certificando");
        return new UScertificate();
        }

    @Override
    public Packing getPacking() {
        System.out.println("Empacotando");
        return new USpacking();    
    }
    
}
