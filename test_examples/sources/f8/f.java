package f8;

import java.util.Comparator;
import u7.p;

/* loaded from: classes.dex */
public final class f implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final p f10967a;

    public f(p pVar) {
        this.f10967a = pVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        p pVar = this.f10967a;
        v7.g.f(pVar, "$tmp0");
        return ((Number) pVar.R(obj, obj2)).intValue();
    }
}
