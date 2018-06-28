package i18n;

import java.util.Locale;
import java.util.ResourceBundle;


public class I18n {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       
        String lang = "en";
        String country = "EN";
        
        Locale loc = new Locale(lang, country);
        ResourceBundle rb = ResourceBundle.getBundle("I18n/Bundle",loc);
        
        
        String str = rb.getString("wish");
        System.out.println(str);
    }
    
}
