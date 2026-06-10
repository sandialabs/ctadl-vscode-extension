package com.noto.app.components;

import androidx.compose.foundation.layout.b;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import g0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import q0.a;
import u7.a;
import u7.p;
import u7.q;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScreenKt$Screen$3 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Fragment f7653j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f7654k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ q0.d f7655l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ a<n> f7656m;
    public final /* synthetic */ p<d, Integer, n> n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b.k f7657o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ a.b f7658p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ q<v.d, d, Integer, n> f7659q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f7660r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f7661s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScreenKt$Screen$3(Fragment fragment, String str, q0.d dVar, u7.a<n> aVar, p<? super d, ? super Integer, n> pVar, b.k kVar, a.b bVar, q<? super v.d, ? super d, ? super Integer, n> qVar, int i10, int i11) {
        super(2);
        this.f7653j = fragment;
        this.f7654k = str;
        this.f7655l = dVar;
        this.f7656m = aVar;
        this.n = pVar;
        this.f7657o = kVar;
        this.f7658p = bVar;
        this.f7659q = qVar;
        this.f7660r = i10;
        this.f7661s = i11;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        num.intValue();
        ScreenKt.a(this.f7653j, this.f7654k, this.f7655l, this.f7656m, this.n, this.f7657o, this.f7658p, this.f7659q, dVar, this.f7660r | 1, this.f7661s);
        return n.f16010a;
    }
}
