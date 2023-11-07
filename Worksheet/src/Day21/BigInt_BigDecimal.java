package Day21;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
public class BigInt_BigDecimal {
		public static void main(String[] args) {

			BigDecimal bd1 = BigDecimal.TEN;
			BigDecimal bd2 = BigDecimal.valueOf(3.0);
			//System.out.println(bd1.divide(bd2)); Non-terminating decimal expansion; no exact representable decimal result.
			System.out.println(bd1.divide(bd2, 50, RoundingMode.CEILING));
			bd1=bd1.add(bd2);
			System.out.println(bd1.toBigInteger());
		}
}
//Note1: when integer, float etc. values doesn't enough to resolve with value BigDecimal or BigInteger libraries can be useful
//Note2: ***Java API documentations*** explains those libraries