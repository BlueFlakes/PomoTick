package pomotick.model.tasksmanagement;

import pomotick.model.routine.Routine;

import javax.persistence.*;

@Entity
@Table(name = "pomo_tick")
public class PomoTick {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @ManyToOne
    private Task task;

    @ManyToOne
    private Routine routine;

    //region setters & getters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Routine getRoutine() {
        return routine;
    }

    public void setRoutine(Routine routine) {
        this.routine = routine;
    }

    //endregion
}
