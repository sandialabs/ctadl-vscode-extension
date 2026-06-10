package u1;

import ja.l1;
import ja.w;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes.dex */
public final class h {
    public static final a c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final androidx.compose.ui.text.font.a f17746a;

    /* renamed from: b  reason: collision with root package name */
    public final kotlinx.coroutines.internal.e f17747b;

    /* loaded from: classes.dex */
    public static final class a extends p7.a implements ja.w {
        public a() {
            super(w.a.f12807i);
        }

        @Override // ja.w
        public final void M(CoroutineContext coroutineContext, Throwable th) {
        }
    }

    public h(androidx.compose.ui.text.font.a aVar) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f13021i;
        v7.g.f(aVar, "asyncTypefaceCache");
        v7.g.f(emptyCoroutineContext, "injectedContext");
        this.f17746a = aVar;
        a aVar2 = c;
        aVar2.getClass();
        this.f17747b = a1.b.g(CoroutineContext.DefaultImpls.a(aVar2, emptyCoroutineContext).m(new l1(null)));
    }
}
