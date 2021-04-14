package model;

import org.bson.types.ObjectId;

import java.util.List;

public class User {
    private ObjectId id;
    private String fullName;
    private int age;
    private String title;
    private List<Job> jobs;

    public User() {
    }

    public User(String fullName, int age, String title) {
        this.fullName = fullName;
        this.age = age;
        this.title = title;
    }

    public User(String fullName, int age, String title, List<Job> jobs) {
        this.fullName = fullName;
        this.age = age;
        this.title = title;
        this.jobs = jobs;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", title='" + title + '\'' +
                ", jobs=" + jobs +
                '}';
    }
}