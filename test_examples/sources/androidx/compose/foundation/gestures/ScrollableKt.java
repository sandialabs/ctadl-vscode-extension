package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import k1.h;
import q0.d;
import s.r;
import t.i;
import u.k;
import v7.g;

/* loaded from: classes.dex */
public final class ScrollableKt {

    /* renamed from: a  reason: collision with root package name */
    public static final a f1782a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final h<Boolean> f1783b = m0.b.R0(ScrollableKt$ModifierLocalScrollableContainer$1.f1784j);

    /* loaded from: classes.dex */
    public static final class a implements i {
        @Override // t.i
        public final float a(float f10) {
            return f10;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(g1.c r5, p7.c r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1786m
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.n
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            g1.c r5 = r0.f1785l
            m0.b.n1(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            m0.b.n1(r6)
        L34:
            r0.f1785l = r5
            r0.n = r3
            java.lang.Object r6 = a4.b.c(r5, r0)
            if (r6 != r1) goto L3f
            goto L4c
        L3f:
            g1.k r6 = (g1.k) r6
            int r2 = r6.f11160b
            r4 = 6
            if (r2 != r4) goto L48
            r2 = 1
            goto L49
        L48:
            r2 = 0
        L49:
            if (r2 == 0) goto L34
            r1 = r6
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.a(g1.c, p7.c):java.lang.Object");
    }

    public static final d b(ScrollState scrollState, Orientation orientation, r rVar, boolean z10, boolean z11, t.c cVar, k kVar) {
        d.a aVar = d.a.f16824i;
        g.f(scrollState, "state");
        return ComposedModifierKt.a(aVar, InspectableValueKt.f3744a, new ScrollableKt$scrollable$2(rVar, cVar, orientation, scrollState, kVar, z11, z10));
    }
}
