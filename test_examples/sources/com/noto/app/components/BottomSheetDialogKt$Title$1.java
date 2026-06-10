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
public final class BottomSheetDialogKt$Title$1 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f7617j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ q0.d f7618k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f7619l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f7620m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetDialogKt$Title$1(String str, q0.d dVar, int i10, int i11) {
        super(2);
        this.f7617j = str;
        this.f7618k = dVar;
        this.f7619l = i10;
        this.f7620m = i11;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        num.intValue();
        BottomSheetDialogKt.c(this.f7617j, this.f7618k, dVar, this.f7619l | 1, this.f7620m);
        return n.f16010a;
    }
}
