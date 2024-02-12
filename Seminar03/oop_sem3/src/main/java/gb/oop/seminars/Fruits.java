package gb.oop.seminars;

public enum Fruits {
    APPLE, ORANGE, LEMON;
    private static String[] ruValue = {"яблоко","апельсин","лимон"};

    public static String getRuValue(Fruits fruit) {
        String result = null;
        result = switch (fruit){
            case APPLE -> ruValue[0];
            case ORANGE -> ruValue[1];
            case LEMON -> ruValue[2];
            };
        return result;
    }
}
