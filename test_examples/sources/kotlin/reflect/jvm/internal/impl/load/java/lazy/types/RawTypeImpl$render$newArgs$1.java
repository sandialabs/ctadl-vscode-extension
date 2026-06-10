package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class RawTypeImpl$render$newArgs$1 extends Lambda implements l<String, CharSequence> {

    /* renamed from: j  reason: collision with root package name */
    public static final RawTypeImpl$render$newArgs$1 f13838j = new RawTypeImpl$render$newArgs$1();

    public RawTypeImpl$render$newArgs$1() {
        super(1);
    }

    @Override // u7.l
    public final CharSequence U(String str) {
        String str2 = str;
        g.f(str2, "it");
        return "(raw) ".concat(str2);
    }
}
