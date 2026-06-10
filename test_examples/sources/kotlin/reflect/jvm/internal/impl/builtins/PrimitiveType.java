package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes.dex */
public enum PrimitiveType {
    n("Boolean"),
    f13297o("Char"),
    f13298p("Byte"),
    f13299q("Short"),
    f13300r("Int"),
    f13301s("Float"),
    f13302t("Long"),
    f13303u("Double");
    

    /* renamed from: i  reason: collision with root package name */
    public final h9.e f13305i;

    /* renamed from: j  reason: collision with root package name */
    public final h9.e f13306j;

    /* renamed from: k  reason: collision with root package name */
    public final m7.e f13307k;

    /* renamed from: l  reason: collision with root package name */
    public final m7.e f13308l;

    /* renamed from: m  reason: collision with root package name */
    public static final Set<PrimitiveType> f13296m = a1.c.w1(f13297o, f13298p, f13299q, f13300r, f13301s, f13302t, f13303u);

    PrimitiveType(String str) {
        this.f13305i = h9.e.k(str);
        this.f13306j = h9.e.k(str.concat("Array"));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f13307k = kotlin.a.a(lazyThreadSafetyMode, new PrimitiveType$typeFqName$2(this));
        this.f13308l = kotlin.a.a(lazyThreadSafetyMode, new PrimitiveType$arrayTypeFqName$2(this));
    }
}
