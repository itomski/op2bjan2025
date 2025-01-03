package de.lubowiecki.tag2;

import java.time.format.DateTimeFormatter;

// Utility Klasse
public final class DateFormats {

    public static final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public static final DateTimeFormatter TIME_FMT = DateTimeFormatter.ofPattern("HH:mm");

    private DateFormats() {
    }
}
