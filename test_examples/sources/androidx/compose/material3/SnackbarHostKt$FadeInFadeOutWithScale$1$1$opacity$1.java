package androidx.compose.material3;

import androidx.datastore.preferences.PreferencesProto$Value;
import b8.i;
import e0.g;
import e0.h;
import e0.m;
import g0.q0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
final class SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ m f2410j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ h<m> f2411k;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
    /* renamed from: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements l<g<m>, Boolean> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ m f2412j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(m mVar) {
            super(1);
            this.f2412j = mVar;
        }

        @Override // u7.l
        public final Boolean U(g<m> gVar) {
            g<m> gVar2 = gVar;
            v7.g.f(gVar2, "it");
            return Boolean.valueOf(v7.g.a(gVar2.f10542a, this.f2412j));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1(m mVar, h<m> hVar) {
        super(0);
        this.f2410j = mVar;
        this.f2411k = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u7.a
    public final n k0() {
        int B0;
        h<m> hVar = this.f2411k;
        Object obj = hVar.f10544a;
        m mVar = this.f2410j;
        if (!v7.g.a(mVar, obj)) {
            ArrayList arrayList = hVar.f10545b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(mVar);
            v7.g.f(arrayList, "<this>");
            int i10 = 0;
            b8.h it = new i(0, a1.c.B0(arrayList)).iterator();
            while (it.f6502k) {
                int nextInt = it.nextInt();
                Object obj2 = arrayList.get(nextInt);
                if (!((Boolean) anonymousClass1.U(obj2)).booleanValue()) {
                    if (i10 != nextInt) {
                        arrayList.set(i10, obj2);
                    }
                    i10++;
                }
            }
            if (i10 < arrayList.size() && i10 <= (B0 = a1.c.B0(arrayList))) {
                while (true) {
                    arrayList.remove(B0);
                    if (B0 == i10) {
                        break;
                    }
                    B0--;
                }
            }
            q0 q0Var = hVar.c;
            if (q0Var != null) {
                q0Var.invalidate();
            }
        }
        return n.f16010a;
    }
}
