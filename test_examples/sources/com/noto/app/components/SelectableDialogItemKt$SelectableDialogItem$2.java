package com.noto.app.components;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.a;
import u7.p;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectableDialogItemKt$SelectableDialogItem$2 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f7666j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ a<n> f7667k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ q0.d f7668l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ boolean f7669m;
    public final /* synthetic */ p<d, Integer, n> n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f7670o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f7671p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectableDialogItemKt$SelectableDialogItem$2(boolean z10, a<n> aVar, q0.d dVar, boolean z11, p<? super d, ? super Integer, n> pVar, int i10, int i11) {
        super(2);
        this.f7666j = z10;
        this.f7667k = aVar;
        this.f7668l = dVar;
        this.f7669m = z11;
        this.n = pVar;
        this.f7670o = i10;
        this.f7671p = i11;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        num.intValue();
        SelectableDialogItemKt.a(this.f7666j, this.f7667k, this.f7668l, this.f7669m, this.n, dVar, this.f7670o | 1, this.f7671p);
        return n.f16010a;
    }
}
