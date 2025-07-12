package GrindHub.GrindHub.gaming.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "gameStats")
public class gamingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String gameName;
    private String gamerTag;
    private int hoursPlayed;
    private LocalDate logDate;
    private int kills;
    private int deaths;
    private long winLoss;

    public gamingModel() {
    }

    public gamingModel(long id, String gameName, String gamerTag, int hoursPlayed, LocalDate logDate, int kills, int deaths, long winLoss) {
        this.id = id;
        this.gameName = gameName;
        this.gamerTag = gamerTag;
        this.hoursPlayed = hoursPlayed;
        this.logDate = logDate;
        this.kills = kills;
        this.deaths = deaths;
        this.winLoss = winLoss;
    }

    public String getGamerTag() {
        return gamerTag;
    }

    public void setGamerTag(String gamerTag) {
        this.gamerTag = gamerTag;
    }

    public Long getWinLoss() {
        return winLoss;
    }

    public void setWinLoss(Long winLoss) {
        this.winLoss = winLoss;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getHoursPlayed() {
        return hoursPlayed;
    }

    public void setHoursPlayed(int hoursPlayed) {
        this.hoursPlayed = hoursPlayed;
    }

    public LocalDate getLogDate() {
        return logDate;
    }

    public void setLog_Date(LocalDate logDate) {
        this.logDate = logDate;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setWinLoss(long winLoss) {
        this.winLoss = winLoss;
    }

    public void setLogDate(LocalDate logDate) {
        this.logDate = logDate;
    }
}
