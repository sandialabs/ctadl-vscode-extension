package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;

/* renamed from: j$.util.stream.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0385n {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f12501a = 0;

    static {
        EnumC0369j enumC0369j = EnumC0369j.CONCURRENT;
        EnumC0369j enumC0369j2 = EnumC0369j.UNORDERED;
        EnumC0369j enumC0369j3 = EnumC0369j.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC0369j, enumC0369j2, enumC0369j3));
        Collections.unmodifiableSet(EnumSet.of(enumC0369j, enumC0369j2));
        Collections.unmodifiableSet(EnumSet.of(enumC0369j3));
        Collections.unmodifiableSet(EnumSet.of(enumC0369j2, enumC0369j3));
        Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(double[] dArr, double d5) {
        double d10 = d5 - dArr[1];
        double d11 = dArr[0];
        double d12 = d11 + d10;
        dArr[1] = (d12 - d11) - d10;
        dArr[0] = d12;
    }
}
