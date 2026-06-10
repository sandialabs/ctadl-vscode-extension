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
public final class TopAppBarKt$NotoTopAppbar$3 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f7676j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ a<n> f7677k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f7678l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ q0.d f7679m;
    public final /* synthetic */ a<n> n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f7680o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f7681p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopAppBarKt$NotoTopAppbar$3(String str, a<n> aVar, int i10, q0.d dVar, a<n> aVar2, int i11, int i12) {
        super(2);
        this.f7676j = str;
        this.f7677k = aVar;
        this.f7678l = i10;
        this.f7679m = dVar;
        this.n = aVar2;
        this.f7680o = i11;
        this.f7681p = i12;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        num.intValue();
        TopAppBarKt.a(this.f7676j, this.f7677k, this.f7678l, this.f7679m, this.n, dVar, this.f7680o | 1, this.f7681p);
        return n.f16010a;
    }
}
