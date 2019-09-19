package demo.service.framework.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@SuppressWarnings({"unused", "WeakerAccess"})
public final class Dates {

    public static final String ISO_ZONED_DATETIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZZ";

    private Dates() {
    }

    public static Date now() {
        return new Date();
    }

    public static Date parseExact(final String source, final String format) {
        return parseExact(source, format, null);
    }

    public static Date parseExact(final String source, final String format, final TimeZone timeZone) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        if (timeZone != null) {
            formatter.setTimeZone(timeZone);
        }
        formatter.setLenient(false);
        try {
            return formatter.parse(source);
        } catch (ParseException ex) {
            throw new IllegalArgumentException(ex);
        }
    }

    public static Date parseISO(final String source) {
        SimpleDateFormat formatter = new SimpleDateFormat( Dates.ISO_ZONED_DATETIME_FORMAT);
        formatter.setLenient(false);
        try {
            return formatter.parse(source);
        } catch (ParseException ex) {
            return null;
        }
    }

    public static String format(final Date source, final String format) {
        return format(source, format, null);
    }

    public static String format(final Date source, final String format, final TimeZone timeZone) {
        if (source == null) {
            return null;
        }
        if (format == null || format.length() == 0) {
            return null;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        if (timeZone != null) {
            sdf.setTimeZone(timeZone);
        }
        return sdf.format(source);
    }

    public static String formatUTC(final Date source) {
        return formatUTC(source, Dates.ISO_ZONED_DATETIME_FORMAT);
    }

    public static String formatUTC(final Date source, final String format) {
        return format(source, format, TimeZone.getTimeZone("UTC"));
    }

}
