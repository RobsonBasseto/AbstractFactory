
package AbstractFactory;

import Factory.BrazilianRulesAbstractFactory;
import Factory.CountryRulesAbstractFactory;
import Factory.USRulesAbstractFactory;

public class Main {
    public static void main(String[] args){
    
        CountryRulesAbstractFactory rules = new USRulesAbstractFactory();
        System.out.println(rules.getCertificate().applyCertification());
        System.out.println(rules.getPacking().pack());
        
        CountryRulesAbstractFactory rules1 = new BrazilianRulesAbstractFactory();
        System.out.println(rules1.getCertificate().applyCertification());
        System.out.println(rules.getPacking().pack());
        
    }
}
