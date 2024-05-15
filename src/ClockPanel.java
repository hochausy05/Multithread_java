import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ClockPanel extends JPanel {
    private JLabel timeLabel;
    private String timeZone;

    public ClockPanel(String timeZone) {
        this.timeZone = timeZone;
        this.setLayout(new BorderLayout());
        this.add(new JLabel("Time Zone: " + timeZone), BorderLayout.NORTH);
        timeLabel = new JLabel();
        this.add(timeLabel, BorderLayout.CENTER);
        updateTime();
    }

    public void updateTime() {
        LocalDateTime currentTime = LocalDateTime.now(ZoneId.of(timeZone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        timeLabel.setText(currentTime.format(formatter));
    }
}

