import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] agrs) {
        System.out.println(ZonedDateTime.now(ZoneId.of("UTC"))
                .format(DateTimeFormatter.ofPattern("yyyy\nMM\ndd")));
    }
}