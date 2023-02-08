package baseball;

public class BaseBallTeam {

    private String name;
    private int win, lose, draw;

    BaseBallTeam(String name, int win, int lose, int draw) {
        setName(name);
        setWin(win);
        setLose(lose);
        setDraw(draw);
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getWin() {
        return win;
    }

    void setWin(int win) {
        this.win = win;
    }

    int getLose() {
        return lose;
    }

    void setLose(int lose) {
        this.lose = lose;
    }

    int getDraw() {
        return draw;
    }

    void setDraw(int draw) {
        this.draw = draw;
    }

    double getRate() {
        return (double) getWin() / (getWin() + getLose());
    }

    void report() {
        System.out.printf("%s の202年の成績は %d勝 %d敗 %d分、勝率は %fです。%n", getName(), getWin(), getLose(), getDraw(), getRate());
    }
}
