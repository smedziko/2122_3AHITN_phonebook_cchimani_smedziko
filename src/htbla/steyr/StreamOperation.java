package htbla.steyr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
/*----------------------------------------------------------------------
 *            Hoehere Technische Bundeslehranstalt STEYR
 *---------------------------------------------------------------------*/
/**
 * Kurzbeschreibung
 *
 * @author  : Christian Chimani
 *            Schueler, 3AHITN
 * @date    : 3.März 2022
 * File:   StreamOperation.java
 * @detalis: StreamOperation-Klasse
 */
public class StreamOperation {
    public void ToStream(Person p, Writer w){

    }


    public Person fromStream(Reader r) throws IOException {
        BufferedReader br = new BufferedReader(r);
        String l = br.readLine();
       // String[] s = l.split(";");
        return null; //new Person(s[0],s[1],s[2],new Date(s[3]),new PhoneNumber(s[4]));

    }
}
