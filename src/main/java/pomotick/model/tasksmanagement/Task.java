package pomotick.model.tasksmanagement;

import org.hibernate.annotations.CreationTimestamp;
import pomotick.utils.LocalDateTimeAttributeConverter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @OneToMany(mappedBy = "task")
    private List<PomoTick> pomoTicks = new ArrayList<>();

    @ManyToOne
    private TasksStorage tasksStorage;

//    @Column(updatable = false, nullable = false)
//    @Convert(converter = LocalDateTimeAttributeConverter.class)
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

    //endregion
}
