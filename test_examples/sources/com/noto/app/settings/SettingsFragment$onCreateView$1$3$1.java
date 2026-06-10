package com.noto.app.settings;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.components.ScreenKt;
import g0.d;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "(Lg0/d;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SettingsFragment$onCreateView$1$3$1 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SettingsFragment f9521j;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.settings.SettingsFragment$onCreateView$1$3$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements q<v.d, d, Integer, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ SettingsFragment f9522j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SettingsFragment settingsFragment) {
            super(3);
            this.f9522j = settingsFragment;
        }

        @Override // u7.q
        public final n O(v.d dVar, d dVar2, Integer num) {
            int i10;
            v.d dVar3 = dVar;
            d dVar4 = dVar2;
            int intValue = num.intValue();
            g.f(dVar3, "$this$Screen");
            if ((intValue & 14) == 0) {
                if (dVar4.z(dVar3)) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                intValue |= i10;
            }
            if ((intValue & 91) == 18 && dVar4.s()) {
                dVar4.e();
                return n.f16010a;
            }
            q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
            SettingsFragment settingsFragment = this.f9522j;
            SettingsFragment.b0(settingsFragment, null, dVar4, 64, 1);
            SettingsFragment.a0(settingsFragment, null, dVar4, 64, 1);
            SettingsFragment.c0(settingsFragment, null, dVar4, 64, 1);
            SettingsFragment.Z(settingsFragment, null, dVar4, 64, 1);
            a1.c.w(dVar3.a(true), dVar4);
            SettingsFragment.d0(settingsFragment, null, dVar4, 64, 1);
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsFragment$onCreateView$1$3$1(SettingsFragment settingsFragment) {
        super(2);
        this.f9521j = settingsFragment;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        ScreenKt.a(this.f9521j, m0.b.m1(R.string.settings, dVar2), null, null, null, null, null, a1.c.i0(dVar2, -1210018851, new AnonymousClass1(this.f9521j)), dVar2, 12582920, 62);
        return n.f16010a;
    }
}
