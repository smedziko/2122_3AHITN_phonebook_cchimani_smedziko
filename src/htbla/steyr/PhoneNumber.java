package htbla.steyr;
/*----------------------------------------------------------------------
 *            Hoehere Technische Bundeslehranstalt STEYR
 *---------------------------------------------------------------------*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Kurzbeschreibung
 *
 * @author  : Christian Chimani
 *            Schueler, 3AHITN
 * @date    : 3.März 2022
 * File:   PhoneNumber.java
 * @detalis: PhoneNumber-Klasse
 */
public class PhoneNumber {
    protected int country;
    protected int area;
    protected int number;

    PhoneNumber(int c, int a, int n){

    }
    PhoneNumber(String number){

    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "country=" + country +
                ", area=" + area +
                ", number=" + number +
                '}';
    }


    public int getNumber(){
        return number;
    }


    public int getCountryCode() {
        return country;
    }

    public int getAreaCode() {
        return area;
    }
    public boolean isValid(PhoneNumber d){
        boolean r = false;

        Pattern pattern = Pattern.compile("\\d{3}-\\d{7}");
        Matcher matcher = pattern.matcher((CharSequence) d);
        if (matcher.matches()) {
            System.out.println("Phone Number Valid");
            r=true;
        }
        return r;
    }
}
