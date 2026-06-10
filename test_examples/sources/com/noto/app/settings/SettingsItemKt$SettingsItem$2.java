package com.noto.app.settings;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SettingsItemKt$SettingsItem$2 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f9523j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ b f9524k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ u7.a<n> f9525l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ q0.d f9526m;
    public final /* synthetic */ long n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ y0.b f9527o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ long f9528p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ String f9529q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f9530r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f9531s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsItemKt$SettingsItem$2(String str, b bVar, u7.a<n> aVar, q0.d dVar, long j2, y0.b bVar2, long j10, String str2, int i10, int i11) {
        super(2);
        this.f9523j = str;
        this.f9524k = bVar;
        this.f9525l = aVar;
        this.f9526m = dVar;
        this.n = j2;
        this.f9527o = bVar2;
        this.f9528p = j10;
        this.f9529q = str2;
        this.f9530r = i10;
        this.f9531s = i11;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        num.intValue();
        SettingsItemKt.a(this.f9523j, this.f9524k, this.f9525l, this.f9526m, this.n, this.f9527o, this.f9528p, this.f9529q, dVar, this.f9530r | 1, this.f9531s);
        return n.f16010a;
    }
}
