import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.math.BigDecimal.*;

public class Tax {

    public BigDecimal tax(double income) {
        BigDecimal tax;

        if (valueOf(income).compareTo(valueOf(85528)) == 1) {
            tax = (valueOf(14839.02).add(valueOf(0.32).multiply(valueOf(income - 85528))));
        } else tax = (valueOf(0.18).multiply(valueOf(income)).subtract(valueOf(556.02)));
        return tax;
    }
}
