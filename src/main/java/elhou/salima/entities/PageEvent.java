package elhou.salima.entities;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class PageEvent {
        private String name;
        private String user;
        private Date date;
        private long duration;
    }

