package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import g0.c0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import q0.e;

/* loaded from: classes.dex */
public interface p1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f3873a = a.f3874a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f3874a = new a();

        /* renamed from: androidx.compose.ui.platform.p1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0026a implements p1 {

            /* renamed from: b  reason: collision with root package name */
            public static final C0026a f3875b = new C0026a();

            /* JADX WARN: Type inference failed for: r1v10, types: [T, androidx.compose.ui.platform.q0] */
            @Override // androidx.compose.ui.platform.p1
            public final Recomposer a(final View view) {
                boolean z10;
                CoroutineContext coroutineContext;
                final androidx.compose.runtime.c cVar;
                LinkedHashMap linkedHashMap = u1.f3909a;
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f13021i;
                v7.g.f(emptyCoroutineContext, "coroutineContext");
                c0.a aVar = c0.a.f11038i;
                m7.e<CoroutineContext> eVar = AndroidUiDispatcher.f3677u;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    coroutineContext = AndroidUiDispatcher.f3677u.getValue();
                } else {
                    coroutineContext = AndroidUiDispatcher.f3678v.get();
                    if (coroutineContext == null) {
                        throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
                    }
                }
                CoroutineContext m10 = coroutineContext.m(emptyCoroutineContext);
                g0.c0 c0Var = (g0.c0) m10.a(aVar);
                androidx.lifecycle.r rVar = null;
                if (c0Var != null) {
                    androidx.compose.runtime.c cVar2 = new androidx.compose.runtime.c(c0Var);
                    cVar2.d();
                    cVar = cVar2;
                } else {
                    cVar = null;
                }
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                q0.e eVar2 = (q0.e) m10.a(e.a.f16831i);
                q0.e eVar3 = eVar2;
                if (eVar2 == null) {
                    ?? q0Var = new q0();
                    ref$ObjectRef.f13060i = q0Var;
                    eVar3 = q0Var;
                }
                if (cVar != null) {
                    emptyCoroutineContext = cVar;
                }
                CoroutineContext m11 = m10.m(emptyCoroutineContext).m(eVar3);
                final Recomposer recomposer = new Recomposer(m11);
                final kotlinx.coroutines.internal.e g10 = a1.b.g(m11);
                androidx.lifecycle.q a10 = ViewTreeLifecycleOwner.a(view);
                if (a10 != null) {
                    rVar = a10.i0();
                }
                if (rVar != null) {
                    view.addOnAttachStateChangeListener(new s1(view, recomposer));
                    rVar.a(new androidx.lifecycle.o() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                        /* loaded from: classes.dex */
                        public /* synthetic */ class a {

                            /* renamed from: a  reason: collision with root package name */
                            public static final /* synthetic */ int[] f3788a;

                            static {
                                int[] iArr = new int[Lifecycle.Event.values().length];
                                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
                                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
                                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
                                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
                                f3788a = iArr;
                            }
                        }

                        @Override // androidx.lifecycle.o
                        public final void f(androidx.lifecycle.q qVar, Lifecycle.Event event) {
                            int i10 = a.f3788a[event.ordinal()];
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 != 3) {
                                        if (i10 == 4) {
                                            recomposer.w();
                                            return;
                                        }
                                        return;
                                    }
                                    androidx.compose.runtime.c cVar3 = cVar;
                                    if (cVar3 != null) {
                                        cVar3.d();
                                        return;
                                    }
                                    return;
                                }
                                androidx.compose.runtime.c cVar4 = cVar;
                                if (cVar4 != null) {
                                    g0.z zVar = cVar4.f2870j;
                                    synchronized (zVar.f11116a) {
                                        if (!zVar.a()) {
                                            List<p7.c<m7.n>> list = zVar.f11117b;
                                            zVar.f11117b = zVar.c;
                                            zVar.c = list;
                                            zVar.f11118d = true;
                                            int size = list.size();
                                            for (int i11 = 0; i11 < size; i11++) {
                                                list.get(i11).t(m7.n.f16010a);
                                            }
                                            list.clear();
                                            m7.n nVar = m7.n.f16010a;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            m0.b.M0(g10, null, CoroutineStart.UNDISPATCHED, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(ref$ObjectRef, recomposer, qVar, this, view, null), 1);
                        }
                    });
                    return recomposer;
                }
                throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
            }
        }
    }

    Recomposer a(View view);
}
