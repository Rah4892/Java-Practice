import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class DateTimeApi {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        //gets next day date
        LocalDate localDateTom = LocalDate.now().plusDays(1);
        System.out.println(localDateTom);

        //zonal time date
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        System.out.println(zoneIds);
        System.out.println(zoneId);

        List<Integer> arr = new ArrayList<>();
        arr.add(7);
        arr.add(269);
        arr.add(2);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
