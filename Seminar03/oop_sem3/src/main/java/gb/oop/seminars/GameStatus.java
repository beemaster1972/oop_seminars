package gb.oop.seminars;

public enum GameStatus {
    INIT, START, LOSE("Вы проиграли"), WIN("Вы выиграли");
    private String description;

    GameStatus(String description) {
        this.description = description;
    }

    GameStatus() {
    }

    public String getDescription(){ return description;}
}
