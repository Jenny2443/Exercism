import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private LocalDateTime dateTime;
    public Gigasecond(LocalDate moment) {
        dateTime = moment.atTime(0,0);
    }

    public Gigasecond(LocalDateTime moment) {
        dateTime = moment;
    }

    public LocalDateTime getDateTime() {
        return dateTime.plusSeconds((long)Math.pow(10, 9));
    }
}