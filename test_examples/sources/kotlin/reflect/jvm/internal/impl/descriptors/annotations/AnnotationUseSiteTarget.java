package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import m0.b;

/* loaded from: classes.dex */
public enum AnnotationUseSiteTarget {
    f13466j(null),
    f13467k(null),
    f13468l(null),
    f13469m("get"),
    n("set"),
    f13470o(null),
    f13471p("param"),
    f13472q("setparam"),
    f13473r("delegate");
    

    /* renamed from: i  reason: collision with root package name */
    public final String f13475i;

    AnnotationUseSiteTarget(String str) {
        this.f13475i = str == null ? b.z1(name()) : str;
    }
}
