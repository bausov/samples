package eu.bausov.samples.springintegration.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created by s.bausov on 11.10.2020.
 */
@Data
public class ToDo {
    private String id;
    private String description;
    private LocalDateTime created;
    private LocalDateTime modified;
    private boolean completed;

    public ToDo() {
        this.id = UUID.randomUUID().toString();
        this.created = LocalDateTime.now();
        this.modified = LocalDateTime.now();
    }

    public ToDo(final String description) {
        this();
        this.description = description;
    }

    public ToDo(final String description, final boolean completed) {
        this(description);
        this.completed = completed;
    }
}
