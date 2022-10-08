package lotto.domain.winner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import lotto.domain.exception.UnknownWinningConditionException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WinningConditionTest {

    @Test
    @DisplayName("주어진 일치 횟수로 해당 당첨 조건 구하기")
    void get_winning_condition_by_match_count() {
        assertThat(WinningCondition.getConditionByMatchCount(3)).isEqualTo(
                WinningCondition.MATCH_THREE);
    }

    @Test
    @DisplayName("주어진 일치 횟수에 해당하는 당첨 조건이 없다면 예외 발생")
    void fail_to_get_winning_condition_by_unknown_match_count() {
        assertThatExceptionOfType(UnknownWinningConditionException.class)
                .isThrownBy(() -> WinningCondition.getConditionByMatchCount(100));
    }
}