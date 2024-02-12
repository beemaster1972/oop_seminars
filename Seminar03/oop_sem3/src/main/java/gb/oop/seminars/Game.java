package gb.oop.seminars;

public interface Game {
    void start(Integer sizeWord, Integer maxTry, Conditions conditions);
    Answer inputValue(String value);
    GameStatus getGameStatus();


}
