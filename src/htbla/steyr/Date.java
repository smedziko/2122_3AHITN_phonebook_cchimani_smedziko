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
 * Date - Klasse, welche Tag, Monat und Jahr beinhaltet <br>
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
     * get: einzelne Eigenschaft eines Objekts wird abgefragt oder geändert (setter) <br>
     * Getter für den Tag, der Tag wird abgefragt
     */
    public int getDay() {
        return day;
    }
    /**
     * get: einzelne Eigenschaft eines Objekts wird abgefragt oder geändert (setter) <br>
     * Getter für den Monat, der Monat wird abgefragt
     */
    public int getMon() {
        return mon;
    }
    /**
     * get: einzelne Eigenschaft eines Objekts wird abgefragt oder geändert (setter) <br>
     * Getter für das Jahr, das Jahr wird abgefragt
     */
    public int getYear() {
        return year;
    }
}
