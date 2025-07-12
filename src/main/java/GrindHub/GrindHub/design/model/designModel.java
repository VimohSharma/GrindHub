package GrindHub.GrindHub.design.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "design")
public class designModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int timeSpent;
    private String toolUsed;
    private String projectWorked;
    private LocalDate logDate;
    private String Notes;

    public designModel() {
    }

    public designModel(long id, int timeSpent, String toolUsed, String projectWorked, LocalDate logDate, String notes) {
        this.id = id;
        this.timeSpent = timeSpent;
        this.toolUsed = toolUsed;
        this.projectWorked = projectWorked;
        this.logDate = logDate;
        Notes = notes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(int timeSpent) {
        this.timeSpent = timeSpent;
    }

    public String getToolUsed() {
        return toolUsed;
    }

    public void setToolUsed(String toolUsed) {
        this.toolUsed = toolUsed;
    }

    public String getProjectWorked() {
        return projectWorked;
    }

    public void setProjectWorked(String projectWorked) {
        this.projectWorked = projectWorked;
    }

    public LocalDate getLogDate() {
        return logDate;
    }

    public void setLogDate(LocalDate logDate) {
        this.logDate = logDate;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
}
