package androidx.compose.ui.semantics;

import c8.j;
import o1.o;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f3979a;

    /* renamed from: b  reason: collision with root package name */
    public final p<T, T, T> f3980b;

    public /* synthetic */ a(String str) {
        this(str, SemanticsPropertyKey$1.f3978j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(String str, p<? super T, ? super T, ? extends T> pVar) {
        g.f(pVar, "mergePolicy");
        this.f3979a = str;
        this.f3980b = pVar;
    }

    public final void a(o oVar, j<?> jVar, T t10) {
        g.f(oVar, "thisRef");
        g.f(jVar, "property");
        oVar.c(this, t10);
    }

    public final String toString() {
        return "SemanticsPropertyKey: " + this.f3979a;
    }
}
