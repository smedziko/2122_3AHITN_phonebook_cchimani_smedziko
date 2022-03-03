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
public class Date {
    protected int day;
    protected int mon;
    protected int year;

    public boolean isLeapYear(){
        return false;
    }
    public boolean isValid(Date d){
        return false;
    }

    public Date (int mon, int day, int year){

    }

    public int getDay() {
        return day;
    }

    public int getMon() {
        return mon;
    }

    public int getYear() {
        return year;
    }
}
