package GrindHub.GrindHub.fitness.model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "workouts")
public class fitnessModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String exerciseName;
    private int sets;
    private int reps;
    private double weight;
    private LocalDate date;

    public fitnessModel(long id, String exerciseName, int sets, int reps, double weight, LocalDate date) {
        this.id = id;
        this.exerciseName = exerciseName;
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
        this.date = date;
    }

    public fitnessModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
