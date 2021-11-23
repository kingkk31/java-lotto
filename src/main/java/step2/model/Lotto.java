package step2.model;

import java.util.List;

public class Lotto {

    private final LottoNumbers lottoNumbers;

    public Lotto() {
        lottoNumbers = new LottoNumbers();
    }

    public Lotto(List<Integer> lottoNumbers) {
        this.lottoNumbers = new LottoNumbers(lottoNumbers);
    }

    public LottoNumbers getLottoNumbers() {
        return lottoNumbers;
    }

    public int getMatchCount(Lotto winner) {
        return lottoNumbers.getMatchCount(winner.lottoNumbers);
    }
}
