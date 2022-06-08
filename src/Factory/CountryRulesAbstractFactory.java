/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Model.Packing;
import Model.Certificate;
import Model.Packing;

/**
 *
 * @author RROBASSETO
 */
public interface CountryRulesAbstractFactory{

    Certificate getCertificate();
    
    Packing getPacking();
    
}
