package de.lubowiecki.tag3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class BuildInLambdaTest {

    public static void main(String[] args) {

        // var ist gut geeignet für Variablen bei denen der Referenztyp = dem Objekttyp ist
        // oder für primitive Datentypen
        var v = "Moin"; // var = Kompiler ermittelt den Typ
        // v = 100; // v ist vom Typ String

        // void accept(T t)
        Consumer<String> c1 = (s) -> System.out.print(s.toUpperCase()); // s ist ein String
        Consumer<Integer> c2 = (s) -> System.out.println(s.doubleValue()); // s ist ein Integer
        Consumer<String> c3 = s -> System.out.println("#####");

        Consumer<String> fileLog = s -> {
            // Heute
            try(BufferedWriter out = Files.newBufferedWriter(Paths.get("log.txt"), StandardOpenOption.APPEND)) {
                out.append(s);
                out.newLine();
            }
            catch(Exception e) {
                System.out.println("Fehler!");
            }

            /* Früher
            BufferedWriter out = null;
            try {
                out = Files.newBufferedWriter(Paths.get("log.txt"), StandardOpenOption.APPEND);
                out.append(s);
                out.newLine();
                out.close();
            }
            catch(Exception e) {
                System.out.println("Fehler!");
            }
            finally {
                try {
                    if(out != null)
                        out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            */
        };

        c1.accept("Das ist das Haus von Nikigraus!");
        c2.accept(123);

        // Ist nicht so gut geeignet, da der generische Typ nicht ermittelt werden kann und daher Objekt verwendet wird
        // Und die Referenz list ist vom Typ ArrayList statt vom Interfacetyp List
        var list = new ArrayList<String>();
        list.add("Peter");
        list.add("Carol");
        list.add("Bruce");
        list.add("Natasha");
        list.add("Steve");
        list.add("Scott");

        System.out.println();

        // list.forEach(c1.andThen(c3)); // andThen verbindet 2 Consumer zu einem
        list.forEach(fileLog);

    }
}
