package de.lubowiecki.tag2;

import java.time.format.DateTimeFormatter;

// Keine gute Wahl, da ein Interface von einer anderen Klasse implementiert werden kann
public interface DateFormatUtil {

    DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    DateTimeFormatter TIME_FMT = DateTimeFormatter.ofPattern("HH:mm");

}
