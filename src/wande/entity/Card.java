package wande.entity;

public class Card {
    private Integer number;
    private Integer color;
    private Boolean isBigKing;
    private Boolean isSmallKing;
    private Integer score;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public Boolean getBigKing() {
        return isBigKing;
    }

    public void setBigKing(Boolean bigKing) {
        isBigKing = bigKing;
    }

    public Boolean getSmallKing() {
        return isSmallKing;
    }

    public void setSmallKing(Boolean smallKing) {
        isSmallKing = smallKing;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", color=" + color +
                ", isBigKing=" + isBigKing +
                ", isSmallKing=" + isSmallKing +
                ", score=" + score +
                '}';
    }
}
