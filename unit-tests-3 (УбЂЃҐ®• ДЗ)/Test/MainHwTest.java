import org.junit.jupiter.api.Test;
import seminars.third.hw.MainHW;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainHwTest {
    MainHW mainHW = new MainHW();

    @Test
    void oddNumberTest(){
        assertTrue(mainHW.evenOddNumber(2));
        assertFalse(mainHW.evenOddNumber(1));
    }

    @Test
    void numberInIntervalTest(){
        assertTrue(mainHW.numberInInterval(26));
        assertFalse(mainHW.numberInInterval(1));
    }

}
