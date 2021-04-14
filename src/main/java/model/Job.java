package model;

import java.time.LocalDate;
import java.util.Date;

public class Job {
    private String organization;
    private String title;
    private LocalDate from;
    private LocalDate to;

    public Job(String organization, String title) {
        this.organization = organization;
        this.title = title;
        this.from = null;
        this.to = null;
    }

    public Job() {
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "Job{" +
                "organization='" + organization + '\'' +
                ", title='" + title + '\'' +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
