/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Model.BrazilianCertificate;
import Model.BrazilianPacking;
import Model.Certificate;
import Model.Packing;

/**
 *
 * @author RROBASSETO
 */
public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

    @Override
    public Certificate getCertificate() {
        System.out.println("Certificando");
        return new BrazilianCertificate();
    }

    @Override
    public Packing getPacking(){
        System.out.println("Empacotando");
        return new BrazilianPacking();
    }
    
}
