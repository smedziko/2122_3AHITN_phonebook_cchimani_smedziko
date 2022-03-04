package htbla.steyr;
/*----------------------------------------------------------------------
 *            Hoehere Technische Bundeslehranstalt STEYR
 *---------------------------------------------------------------------*/
/**
 * Kurzbeschreibung
 *
 * @author  : Semir Medzikovic
 *            Schueler, 3AHITN
 * @date    : 3.März 2022
 * File:   IllegalDateException.java
 * @detalis: IllegalDateException-Klasse
 */

/**
 * IllegalDateException - Klasse, welche ein falsches Datum aussortiert <br>
 * beinhaltet: type, DAY_ILLEGAL, MON_ILLEGAL
 */
public class IllegalDateException {
    protected int type;
    public static final int DAY_ILLEGAL = 0;
    public static final int MON_ILLEGAL = 1;

    public IllegalDateException(int i){
        type = i;
    }
}
