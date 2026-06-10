package com.noto.app.settings.about;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.components.ScreenKt;
import com.noto.app.settings.SettingsItemKt;
import com.noto.app.settings.SettingsSectionKt;
import com.noto.app.settings.b;
import g0.c;
import g0.d;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.b;
import m7.n;
import u7.a;
import u7.p;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "(Lg0/d;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CreditsSettingsFragment$onCreateView$1$2$1 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ CreditsSettingsFragment f9620j;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.settings.about.CreditsSettingsFragment$onCreateView$1$2$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements q<v.d, d, Integer, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ CreditsSettingsFragment f9621j;

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.settings.about.CreditsSettingsFragment$onCreateView$1$2$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        final class C00811 extends Lambda implements q<v.d, d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ CreditsSettingsFragment f9622j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00811(CreditsSettingsFragment creditsSettingsFragment) {
                super(3);
                this.f9622j = creditsSettingsFragment;
            }

            @Override // u7.q
            public final n O(v.d dVar, d dVar2, Integer num) {
                d dVar3 = dVar2;
                int intValue = num.intValue();
                g.f(dVar, "$this$SettingsSection");
                if ((intValue & 81) == 16 && dVar3.s()) {
                    dVar3.e();
                    return n.f16010a;
                }
                q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                String m12 = b.m1(R.string.app_icons, dVar3);
                b.c cVar = new b.c(m0.b.m1(R.string.app_icons_value, dVar3));
                dVar3.f(1157296644);
                CreditsSettingsFragment creditsSettingsFragment = this.f9622j;
                boolean z10 = dVar3.z(creditsSettingsFragment);
                Object g10 = dVar3.g();
                Object obj = d.a.f11039a;
                if (z10 || g10 == obj) {
                    g10 = new CreditsSettingsFragment$onCreateView$1$2$1$1$1$1$1(creditsSettingsFragment);
                    dVar3.q(g10);
                }
                dVar3.u();
                SettingsItemKt.a(m12, cVar, (a) g10, null, 0L, null, 0L, null, dVar3, 0, 248);
                String m13 = m0.b.m1(R.string.creator, dVar3);
                b.c cVar2 = new b.c(m0.b.m1(R.string.creator_name, dVar3));
                dVar3.f(1157296644);
                boolean z11 = dVar3.z(creditsSettingsFragment);
                Object g11 = dVar3.g();
                if (z11 || g11 == obj) {
                    g11 = new CreditsSettingsFragment$onCreateView$1$2$1$1$1$2$1(creditsSettingsFragment);
                    dVar3.q(g11);
                }
                dVar3.u();
                SettingsItemKt.a(m13, cVar2, (a) g11, null, 0L, null, 0L, null, dVar3, 0, 248);
                String m14 = m0.b.m1(R.string.license, dVar3);
                b.c cVar3 = new b.c(m0.b.m1(R.string.app_icons_license_value, dVar3));
                dVar3.f(1157296644);
                boolean z12 = dVar3.z(creditsSettingsFragment);
                Object g12 = dVar3.g();
                if (z12 || g12 == obj) {
                    g12 = new CreditsSettingsFragment$onCreateView$1$2$1$1$1$3$1(creditsSettingsFragment);
                    dVar3.q(g12);
                }
                dVar3.u();
                SettingsItemKt.a(m14, cVar3, (a) g12, null, 0L, null, 0L, null, dVar3, 0, 248);
                return n.f16010a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CreditsSettingsFragment creditsSettingsFragment) {
            super(3);
            this.f9621j = creditsSettingsFragment;
        }

        @Override // u7.q
        public final n O(v.d dVar, d dVar2, Integer num) {
            d dVar3 = dVar2;
            int intValue = num.intValue();
            g.f(dVar, "$this$Screen");
            if ((intValue & 81) == 16 && dVar3.s()) {
                dVar3.e();
                return n.f16010a;
            }
            q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
            SettingsSectionKt.a(null, null, null, a1.c.i0(dVar3, -474017900, new C00811(this.f9621j)), dVar3, 3072, 7);
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditsSettingsFragment$onCreateView$1$2$1(CreditsSettingsFragment creditsSettingsFragment) {
        super(2);
        this.f9620j = creditsSettingsFragment;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        ScreenKt.a(this.f9620j, m0.b.m1(R.string.credits, dVar2), null, null, null, null, null, a1.c.i0(dVar2, 268022064, new AnonymousClass1(this.f9620j)), dVar2, 12582912, 62);
        return n.f16010a;
    }
}
