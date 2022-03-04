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
 * File:   Person.java
 * @detalis: Person-Klasse
 */

/**
 * Person - Klasse, welche die Daten der Personen beinhaltet
 */
public class Person {
    protected String name;
    protected String givenname;
    protected String nickname;
    protected Date birthday;
    protected PhoneNumber phone;

    /**
     * public Person für name, givenname, birthday und phone
     */
    public Person(String n, String gn, String bd, String p){

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", givenname='" + givenname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", birthday=" + birthday +
                ", phone=" + phone +
                '}';
    }
}
