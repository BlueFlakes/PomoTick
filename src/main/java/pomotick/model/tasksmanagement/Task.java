package pomotick.model.tasksmanagement;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "task")
    private List<PomoTick> pomoTicks = new ArrayList<>();

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    private TasksStorage tasksStorage;

    @Column(updatable = false, nullable = false)
    @CreationTimestamp
    private LocalDateTime createDateTime;

    public Task() {}

    private Task(LocalDateTime localDateTime) {
        this.createDateTime = localDateTime;
    }

    public static Task create() {
        LocalDateTime currentDate = LocalDateTime.now();
        return new Task(currentDate);
    }

    //region setters & getters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<PomoTick> getPomoTicks() {
        return pomoTicks;
    }

    public void setPomoTicks(List<PomoTick> pomoTicks) {
        this.pomoTicks = pomoTicks;
    }

    public TasksStorage getTasksStorage() {
        return tasksStorage;
    }

    public void setTasksStorage(TasksStorage tasksStorage) {
        this.tasksStorage = tasksStorage;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//endregion
}
