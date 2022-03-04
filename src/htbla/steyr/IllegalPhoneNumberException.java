package htbla.steyr;
/*----------------------------------------------------------------------
 *            Hoehere Technische Bundeslehranstalt STEYR
 *---------------------------------------------------------------------*/
/**
 * Kurzbeschreibung
 *
 * @author  : Christian Chimani
 *            Schueler, 3AHITN
 * @date    : 3.März 2022
 * File:   IllegalPhoneNumberException.java
 * @detalis: IllegalPhoneNumberException-Klasse
 */

/**
 * IllegalPhoneNumberException - Klasse, welche die falschen Werte aussortiert <br>
 * beinhaltet: type, COUNTRY_ILLEGAL, AREA_ILLEGAL, NUMBER_ILLEGAL und STRING_FORMAT_ILLEGAL <br>
 */
public class IllegalPhoneNumberException {
    public int type;
    public static final int COUNTRY_ILLEGAL = 0;
    public static final int AREA_ILLEGAL = 1;
    public static final int NUMBER_ILLEGAL = 2;
    public static final int STRING_FORMAT_ILLEGAL = 3;
    
    public IllegalPhoneNumberException(int t){
        type = t;
    }
}
