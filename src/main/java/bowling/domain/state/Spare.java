package bowling.domain.state;

import bowling.domain.Score;

public class Spare extends Finished{
    private static final int SPARE_TOTAL = 10;
    private final int firstCountOfPins;
    private final int secondCountOfPins;

    public Spare(int firstCountOfPins, int secondCountOfPins) {
        if(firstCountOfPins + secondCountOfPins != SPARE_TOTAL) {
            throw new IllegalArgumentException("Spare 핀 수 합은 10이여야 합니다.");
        }
        this.firstCountOfPins = firstCountOfPins;
        this.secondCountOfPins = secondCountOfPins;
    }

    @Override
    public Score getScore() {
        return Score.ofSpare();
    }

    @Override
    public String expression() {
        return firstCountOfPins + "|/";
    }

    @Override
    public Score calculateAddScore(Score beforeScore) {
        beforeScore = beforeScore.bowl(firstCountOfPins);
        if(beforeScore.isCalculateScore()) {
            return beforeScore;
        }
        beforeScore = beforeScore.bowl(secondCountOfPins);
        return beforeScore;
    }
}
