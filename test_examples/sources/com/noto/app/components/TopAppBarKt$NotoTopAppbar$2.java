package com.noto.app.components;

import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.c;
import g0.d;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.a;
import u7.p;
import u7.q;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TopAppBarKt$NotoTopAppbar$2 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ a<n> f7674j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f7675k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopAppBarKt$NotoTopAppbar$2(int i10, a aVar) {
        super(2);
        this.f7674j = aVar;
        this.f7675k = i10;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        a<n> aVar = this.f7674j;
        if (aVar != null) {
            IconButtonKt.a(aVar, null, false, null, null, ComposableSingletons$TopAppBarKt.f7623a, dVar2, ((this.f7675k >> 12) & 14) | 196608, 30);
        }
        return n.f16010a;
    }
}
