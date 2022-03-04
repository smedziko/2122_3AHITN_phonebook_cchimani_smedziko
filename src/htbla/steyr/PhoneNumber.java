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
 * File:   PhoneNumber.java
 * @detalis: PhoneNumber-Klasse
 */

/**
 * PhoneNumber - Klasse, welche das Land, das Gebiet und die Nummer beinhaltet <br>
 */
public class PhoneNumber {
    protected int country;
    protected int area;
    protected int number;

    /**
     * Konstruktor für country, area und number
     */
    PhoneNumber(int c, int a, int n){

    }

    /**
     * Konstruktor für number
     */
    PhoneNumber(String number){

    }

    /**
     * wandelt alles in einen String um
     */
    public String toString() {
        return "PhoneNumber{" +
                "country=" + country +
                ", area=" + area +
                ", number=" + number +
                '}';
    }
    /**
     * get: einzelne Eigenschaft eines Objekts wird abgefragt oder geändert (setter) <br>
     * Getter für Number, die Number wird abgefragt
     */
    public int getNumber(){
        return 0;
    }
    /**
     * get: einzelne Eigenschaft eines Objekts wird abgefragt oder geändert (setter) <br>
     * Getter für CountryCode, der Countrycode wird abgefragt
     */
    public int getCountryCode() {
        return country;
    }
    /**
     * get: einzelne Eigenschaft eines Objekts wird abgefragt oder geändert (setter) <br>
     * Getter für AreaCode, der AreaCode wird abgefragt
     */
    public int getAreaCode() {
        return area;
    }

    /**
     * prüft, ob PhoneNumber gültig ist
     */
    public boolean isValid(PhoneNumber d){
        return true;
    }
}
