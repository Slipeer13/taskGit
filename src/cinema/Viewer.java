package cinema;

import java.util.ArrayList;
import java.util.List;

public class Viewer {
    private String nikName;
    private int age;
    private int countFilms;
    private List<Cinema> cinemaList = new ArrayList<>();

    public List<Cinema> getCinemaList() {
        return cinemaList;
    }

    public void setCinemaList(List<Cinema> cinemaList) {
        if (cinemaList != null) {
            this.cinemaList = cinemaList;
        }

    }

    public String getNikName() {
        return nikName;
    }

    public void setNikName(String nikName) {
        if (nikName == null) {
            this.nikName = nikName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }

    }

    public int getCountFilms() {
        countFilms = cinemaList.size();
        return countFilms;
    }

    public void setCountFilms(int countFilms) {
        if (countFilms > 0) {
            this.countFilms = countFilms;
        }

    }
}
