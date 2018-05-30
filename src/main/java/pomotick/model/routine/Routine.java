package pomotick.model.routine;

import com.fasterxml.jackson.annotation.JsonProperty;
import pomotick.model.UserProfile;
import pomotick.model.tasksmanagement.PomoTick;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Routine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @OneToMany(mappedBy = "routine")
    private List<Cycle> cycles = new LinkedList<>();

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    private UserProfile userProfile;

    @OneToMany(mappedBy = "routine")
    private List<PomoTick> pomoTick = new ArrayList<>();

    //region setters & getters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Cycle> getCycles() {
        return cycles;
    }

    public void setCycles(List<Cycle> cycles) {
        this.cycles = cycles;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public List<PomoTick> getPomoTick() {
        return pomoTick;
    }

    public void setPomoTick(List<PomoTick> pomoTick) {
        this.pomoTick = pomoTick;
    }

    //endregion
}
