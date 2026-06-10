package androidx.compose.foundation.relocation;

import a1.c;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import g0.p;
import g0.s;
import h0.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import q0.d;
import u7.l;
import u7.q;
import v7.g;
import x.a;
import x.f;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class BringIntoViewRequesterKt$bringIntoViewRequester$2 extends Lambda implements q<d, g0.d, Integer, d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ x.d f2038j;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements l<g0.q, p> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ x.d f2039j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ f f2040k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(x.d dVar, f fVar) {
            super(1);
            this.f2039j = dVar;
            this.f2040k = fVar;
        }

        @Override // u7.l
        public final p U(g0.q qVar) {
            g.f(qVar, "$this$DisposableEffect");
            x.d dVar = this.f2039j;
            e<f> eVar = ((BringIntoViewRequesterImpl) dVar).f2031a;
            f fVar = this.f2040k;
            eVar.b(fVar);
            return new x.e(dVar, fVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterKt$bringIntoViewRequester$2(x.d dVar) {
        super(3);
        this.f2038j = dVar;
    }

    @Override // u7.q
    public final d O(d dVar, g0.d dVar2, Integer num) {
        g0.d dVar3 = dVar2;
        num.intValue();
        g.f(dVar, "$this$composed");
        dVar3.f(-992853993);
        a k12 = c.k1(dVar3);
        dVar3.f(1157296644);
        boolean z10 = dVar3.z(k12);
        Object g10 = dVar3.g();
        if (z10 || g10 == d.a.f11039a) {
            g10 = new f(k12);
            dVar3.q(g10);
        }
        dVar3.u();
        f fVar = (f) g10;
        x.d dVar4 = this.f2038j;
        if (dVar4 instanceof BringIntoViewRequesterImpl) {
            s.a(dVar4, new AnonymousClass1(dVar4, fVar), dVar3);
        }
        dVar3.u();
        return fVar;
    }
}
