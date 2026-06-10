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
public final class SettingsFragment$MainSection$2 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SettingsFragment f9496j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ q0.d f9497k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f9498l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f9499m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsFragment$MainSection$2(SettingsFragment settingsFragment, q0.d dVar, int i10, int i11) {
        super(2);
        this.f9496j = settingsFragment;
        this.f9497k = dVar;
        this.f9498l = i10;
        this.f9499m = i11;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        num.intValue();
        SettingsFragment.b0(this.f9496j, this.f9497k, dVar, this.f9498l | 1, this.f9499m);
        return n.f16010a;
    }
}
