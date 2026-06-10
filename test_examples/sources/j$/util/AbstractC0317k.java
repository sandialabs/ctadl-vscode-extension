package j$.util;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/* renamed from: j$.util.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0317k {
    public static C0316j a(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? C0316j.d(optional.get()) : C0316j.a();
    }

    public static C0318l b(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? C0318l.d(optionalDouble.getAsDouble()) : C0318l.a();
    }

    public static C0319m c(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? C0319m.d(optionalInt.getAsInt()) : C0319m.a();
    }

    public static C0320n d(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? C0320n.d(optionalLong.getAsLong()) : C0320n.a();
    }

    public static Optional e(C0316j c0316j) {
        if (c0316j == null) {
            return null;
        }
        return c0316j.c() ? Optional.of(c0316j.b()) : Optional.empty();
    }

    public static OptionalDouble f(C0318l c0318l) {
        if (c0318l == null) {
            return null;
        }
        return c0318l.c() ? OptionalDouble.of(c0318l.b()) : OptionalDouble.empty();
    }

    public static OptionalInt g(C0319m c0319m) {
        if (c0319m == null) {
            return null;
        }
        return c0319m.c() ? OptionalInt.of(c0319m.b()) : OptionalInt.empty();
    }

    public static OptionalLong h(C0320n c0320n) {
        if (c0320n == null) {
            return null;
        }
        return c0320n.c() ? OptionalLong.of(c0320n.b()) : OptionalLong.empty();
    }
}
