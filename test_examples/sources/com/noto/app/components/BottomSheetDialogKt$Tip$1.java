package com.noto.app.components;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetDialogKt$Tip$1 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ v.d f7613j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ q0.d f7614k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f7615l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f7616m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetDialogKt$Tip$1(v.d dVar, q0.d dVar2, int i10, int i11) {
        super(2);
        this.f7613j = dVar;
        this.f7614k = dVar2;
        this.f7615l = i10;
        this.f7616m = i11;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        num.intValue();
        BottomSheetDialogKt.b(this.f7613j, this.f7614k, dVar, this.f7615l | 1, this.f7616m);
        return n.f16010a;
    }
}
