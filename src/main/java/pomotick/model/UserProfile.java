package pomotick.model;

import pomotick.model.routine.Routine;
import pomotick.model.tasksmanagement.TasksStorage;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "userProfile")
    private List<Routine> routines = new LinkedList<>();

    @OneToMany(mappedBy = "userProfile")
    private List<TasksStorage> tasksStorages = new LinkedList<>();

    //region setters & getters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Routine> getRoutines() {
        return routines;
    }

    public void setRoutines(List<Routine> routines) {
        this.routines = routines;
    }

    public List<TasksStorage> getTasksStorages() {
        return tasksStorages;
    }

    public void setTasksStorages(List<TasksStorage> tasksStorages) {
        this.tasksStorages = tasksStorages;
    }

    //endregion
}
