package com.noto.app.settings;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SettingsFragment$AboutSection$2 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SettingsFragment f9482j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ q0.d f9483k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f9484l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f9485m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsFragment$AboutSection$2(SettingsFragment settingsFragment, q0.d dVar, int i10, int i11) {
        super(2);
        this.f9482j = settingsFragment;
        this.f9483k = dVar;
        this.f9484l = i10;
        this.f9485m = i11;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        num.intValue();
        SettingsFragment.Z(this.f9482j, this.f9483k, dVar, this.f9484l | 1, this.f9485m);
        return n.f16010a;
    }
}
