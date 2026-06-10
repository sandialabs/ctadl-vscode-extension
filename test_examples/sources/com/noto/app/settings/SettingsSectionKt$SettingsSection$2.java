package com.noto.app.settings;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import u7.q;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SettingsSectionKt$SettingsSection$2 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ q0.d f9532j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f9533k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ y0.b f9534l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ q<v.d, d, Integer, n> f9535m;
    public final /* synthetic */ int n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f9536o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SettingsSectionKt$SettingsSection$2(q0.d dVar, String str, y0.b bVar, q<? super v.d, ? super d, ? super Integer, n> qVar, int i10, int i11) {
        super(2);
        this.f9532j = dVar;
        this.f9533k = str;
        this.f9534l = bVar;
        this.f9535m = qVar;
        this.n = i10;
        this.f9536o = i11;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        num.intValue();
        SettingsSectionKt.a(this.f9532j, this.f9533k, this.f9534l, this.f9535m, dVar, this.n | 1, this.f9536o);
        return n.f16010a;
    }
}
