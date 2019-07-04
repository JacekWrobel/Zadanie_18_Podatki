import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TaxTest {

    /*

income = 10000 => tax = 1800-556,02 = 1243,98;
income = 85258 => tax = 14839,02;
income = 185258 => tax = 14839,02+32000 = 46839,02;

     */
    @Test
    public void tax_10_000() {
        Tax tax= new Tax();
        //given
         double income = 10000;
        //when
        BigDecimal result = tax.tax(income);
        //then
        Assertions.assertThat(result).isEqualTo(BigDecimal.valueOf(1243.98));
    }
    @Test
    public void tax_85_528() {
        Tax tax= new Tax();
        //given
         double income = 85528;
        //when
        BigDecimal result = tax.tax(income);
        //then
        Assertions.assertThat(result).isEqualTo(BigDecimal.valueOf(14839.02));
    }
    @Test
    public void tax_185_528() {
        Tax tax= new Tax();
        //given
         double income = 185528;
        //when
        BigDecimal result = tax.tax(income);
        //then
        Assertions.assertThat(result).isEqualTo(BigDecimal.valueOf(46839.02));
    }
}