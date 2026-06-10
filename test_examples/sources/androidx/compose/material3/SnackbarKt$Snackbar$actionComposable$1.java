package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import e0.m;
import g0.d;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import u7.q;
import v.r;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarKt$Snackbar$actionComposable$1 extends Lambda implements p<g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ long f2500j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ m f2501k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ String f2502l;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
    /* renamed from: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends Lambda implements q<r, g0.d, Integer, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ String f2504j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(3);
            this.f2504j = str;
        }

        @Override // u7.q
        public final n O(r rVar, g0.d dVar, Integer num) {
            g0.d dVar2 = dVar;
            int intValue = num.intValue();
            g.f(rVar, "$this$TextButton");
            if ((intValue & 81) == 16 && dVar2.s()) {
                dVar2.e();
                return n.f16010a;
            }
            q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
            TextKt.b(this.f2504j, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, dVar2, 0, 0, 65534);
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$actionComposable$1(long j2, int i10, m mVar, String str) {
        super(2);
        this.f2500j = j2;
        this.f2501k = mVar;
        this.f2502l = str;
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        g0.d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        v.p pVar = e0.b.f10510a;
        e0.a a10 = e0.b.a(this.f2500j, dVar2, 13);
        dVar2.f(1157296644);
        m mVar = this.f2501k;
        boolean z10 = dVar2.z(mVar);
        Object g10 = dVar2.g();
        if (z10 || g10 == d.a.f11039a) {
            g10 = new SnackbarKt$Snackbar$actionComposable$1$1$1(mVar);
            dVar2.q(g10);
        }
        dVar2.u();
        c.b((u7.a) g10, null, false, null, a10, null, null, null, a1.c.i0(dVar2, 521110564, new AnonymousClass2(this.f2502l)), dVar2, 805306368, 494);
        return n.f16010a;
    }
}
