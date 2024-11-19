package org.example;

public class Gamer {

    private String nickName;
    private boolean isActive;

    public Gamer(String nickName, boolean isActive) {
        this.nickName = nickName;
        this.isActive = isActive;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;

    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "nickName='" + nickName + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
