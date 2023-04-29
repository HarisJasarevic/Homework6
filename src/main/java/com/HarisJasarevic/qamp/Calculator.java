package com.HarisJasarevic.qamp;

import com.google.common.math.IntMath;

public class Calculator {

    public static int addNumbers (final int a, final int b) {
        return IntMath.checkedAdd(a, b);
    }

    public static int subtractNumbers (final int a, final int b) {
        return IntMath.checkedSubtract(a, b);
    }
    public static int multiplyNumbers (final int a, final int b) {
        return IntMath.checkedMultiply(a, b);

    }
}
