package gb.oop.seminars;

import java.util.List;
import java.util.Random;

public abstract class  AbstractGame implements Game{
    private String word;
    private Integer attemptCounter;
    private GameStatus status = GameStatus.INIT;

    public String generateWord(Integer sizeWord, Conditions conditions){
        StringBuilder result = new StringBuilder();
        List<String> charList = generateCharList();
        Random rand = new Random();
        String randomSymbol = charList.get(rand.nextInt(charList.size()));
        for (int i=0; i < sizeWord;i++){
            switch (conditions) {
                case UNIQUE_SYMBOLS:
                    while(word.contains(randomSymbol)) {
                        randomSymbol = charList.get(rand.nextInt(charList.size()));
                    }
                    break;
            }
            result.append(randomSymbol);
        }
        return result.toString();
    };
    public abstract List<String> generateCharList();

    @Override
    public void start(Integer sizeWord, Integer attemptCounter, Conditions conditions) {
        generateWord(sizeWord, conditions);
        status = GameStatus.START;
        this.attemptCounter = attemptCounter;
    }

    @Override
    public Answer inputValue(String value) {
        if(!getGameStatus().equals(GameStatus.START)) throw new RuntimeException("Игра не в активном состоянии");
        Integer cowCount = 0;
        Integer bullCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)==value.charAt(i)) {
                bullCount++;
                cowCount++;
                continue;
            }
            else if (word.contains(String.valueOf(value.charAt(i)))) cowCount++;
        }
        --attemptCounter;
        if (bullCount==word.length()){
            status = GameStatus.WIN;
        }
        else if (attemptCounter==0){
            status = GameStatus.LOSE;
        }
        return new Answer(attemptCounter,cowCount,bullCount);
    }

    @Override
    public GameStatus getGameStatus() {
        return status;
    }
}
