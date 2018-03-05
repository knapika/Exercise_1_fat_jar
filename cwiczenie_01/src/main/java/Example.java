import org.apache.commons.lang3.time.FastDateFormat;

import java.util.Locale;
import java.util.TimeZone;

public class Example {
    public static void main(String[] args) {
        FastDateFormat dateFormatter = FastDateFormat.getInstance("dd-mm-yyyy",
                TimeZone.getTimeZone("Europe/Copenhagen"),
                Locale.KOREA);
        System.out.println(dateFormatter.getLocale().getCountry());
    }
}
