package kongmu373.entity;

import java.io.Serializable;

public class Rank implements Serializable {
    private int score;
    private User user;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
