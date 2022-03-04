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
 * File:   Date.java
 * @detalis: Date-Klasse
 */

/**
 * Date - Klasse, welche Tag, Monat und Jahr definiert <br>
 */
public class Date {
    protected int day;
    protected int mon;
    protected int year;

    /**
     * isLeapYear: prüft, ob es ein Schaltjahr ist <br>
     */
    public boolean isLeapYear(){
        return false;
    }

    /**
     * isValid: prüft, ob das Datum gültig ist <br>
     */
    public boolean isValid(Date d){
        return false;
    }
    /**
     * public Date: Konstruktor für Tag, Monat, Jahr <br>
     */
    public Date (int m, int d, int y){

    }

    /**
     * Getter für den Tag
     */
    public int getDay() {
        return day;
    }
    /**
     * Getter für den Monat
     */
    public int getMon() {
        return mon;
    }
    /**
     * Getter für das Jahr
     */
    public int getYear() {
        return year;
    }
}
