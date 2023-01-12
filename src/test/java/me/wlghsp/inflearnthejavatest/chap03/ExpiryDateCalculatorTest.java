package me.wlghsp.inflearnthejavatest.chap03;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ExpiryDateCalculatorTest {

    @Test
    void 만원_납부하면_한달_뒤가_만료일이_됨() {
        assertExpriryDate(LocalDate.of(2019, 3, 1), 10_000, LocalDate.of(2019, 4, 1));
        assertExpriryDate(LocalDate.of(2019, 5, 5), 10_000, LocalDate.of(2019, 6, 5));
    }

    private void assertExpriryDate(LocalDate billingDate, int payAmount, LocalDate expectedExpiryDate) {
        ExpiryDateCalculator cal = new ExpiryDateCalculator();
        LocalDate realExpiryDate = cal.calculateExpiryDate(billingDate, payAmount);
        assertEquals(expectedExpiryDate, realExpiryDate);
    }
}
