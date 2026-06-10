package com.noto.app.components;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.c;
import g0.d;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import u7.q;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TopAppBarKt$NotoTopAppbar$1 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f7672j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f7673k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopAppBarKt$NotoTopAppbar$1(String str, int i10) {
        super(2);
        this.f7672j = str;
        this.f7673k = i10;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        TextKt.b(this.f7672j, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, dVar2, this.f7673k & 14, 0, 65534);
        return n.f16010a;
    }
}
