package com.noto.app.components;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import o6.b;
import u7.p;
import u7.q;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetDialogKt$BottomSheetDialog$2 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b f7608j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f7609k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ q0.d f7610l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ q<v.d, d, Integer, n> f7611m;
    public final /* synthetic */ int n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f7612o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetDialogKt$BottomSheetDialog$2(b bVar, String str, q0.d dVar, q<? super v.d, ? super d, ? super Integer, n> qVar, int i10, int i11) {
        super(2);
        this.f7608j = bVar;
        this.f7609k = str;
        this.f7610l = dVar;
        this.f7611m = qVar;
        this.n = i10;
        this.f7612o = i11;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        num.intValue();
        BottomSheetDialogKt.a(this.f7608j, this.f7609k, this.f7610l, this.f7611m, dVar, this.n | 1, this.f7612o);
        return n.f16010a;
    }
}
