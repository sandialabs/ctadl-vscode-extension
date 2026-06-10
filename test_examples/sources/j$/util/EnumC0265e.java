package j$.util;

import j$.util.function.Function;
import j$.util.function.L0;
import j$.util.function.N0;
import j$.util.function.O0;
import j$.util.function.Q0;
import j$.util.function.R0;
import j$.util.function.T0;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0265e implements Comparator, InterfaceC0264d {
    public static final EnumC0265e INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ EnumC0265e[] f12182a;

    static {
        EnumC0265e enumC0265e = new EnumC0265e();
        INSTANCE = enumC0265e;
        f12182a = new EnumC0265e[]{enumC0265e};
    }

    private EnumC0265e() {
    }

    public static EnumC0265e valueOf(String str) {
        return (EnumC0265e) Enum.valueOf(EnumC0265e.class, str);
    }

    public static EnumC0265e[] values() {
        return (EnumC0265e[]) f12182a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return Collections.reverseOrder();
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Comparator comparator) {
        comparator.getClass();
        return new C0260b(this, comparator, 0);
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function) {
        j$.util.function.Function convert = Function.VivifiedWrapper.convert(function);
        convert.getClass();
        return AbstractC0261c.u(this, new C0259a(3, convert));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(java.util.function.Function function, Comparator comparator) {
        j$.util.function.Function convert = Function.VivifiedWrapper.convert(function);
        convert.getClass();
        comparator.getClass();
        return AbstractC0261c.u(this, new C0260b(comparator, convert, 1));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        N0 a10 = L0.a(toDoubleFunction);
        a10.getClass();
        return AbstractC0261c.u(this, new C0259a(0, a10));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingInt(ToIntFunction toIntFunction) {
        Q0 a10 = O0.a(toIntFunction);
        a10.getClass();
        return AbstractC0261c.u(this, new C0259a(1, a10));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingLong(ToLongFunction toLongFunction) {
        T0 a10 = R0.a(toLongFunction);
        a10.getClass();
        return AbstractC0261c.u(this, new C0259a(2, a10));
    }
}
