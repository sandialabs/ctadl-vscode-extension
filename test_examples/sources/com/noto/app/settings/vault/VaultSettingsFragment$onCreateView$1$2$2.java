package com.noto.app.settings.vault;

import a4.b;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.NotoThemeKt;
import com.noto.app.components.ScreenKt;
import com.noto.app.domain.model.VaultTimeout;
import com.noto.app.settings.SettingsItemKt;
import com.noto.app.settings.SettingsSectionKt;
import com.noto.app.settings.b;
import com.noto.app.settings.c;
import com.noto.app.util.ViewUtilsKt;
import g0.d;
import g0.g0;
import g0.g1;
import g0.h1;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.a;
import u7.p;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "(Lg0/d;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class VaultSettingsFragment$onCreateView$1$2$2 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ VaultSettingsFragment f9777j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f9778k;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.settings.vault.VaultSettingsFragment$onCreateView$1$2$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements q<v.d, d, Integer, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ String f9779j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ boolean f9780k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ VaultSettingsFragment f9781l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ g1<Boolean> f9782m;

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.settings.vault.VaultSettingsFragment$onCreateView$1$2$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        final class C00981 extends Lambda implements q<v.d, d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ String f9783j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ boolean f9784k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ VaultSettingsFragment f9785l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ g1<Boolean> f9786m;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.vault.VaultSettingsFragment$onCreateView$1$2$2$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00991 extends Lambda implements a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ VaultSettingsFragment f9787j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00991(VaultSettingsFragment vaultSettingsFragment) {
                    super(0);
                    this.f9787j = vaultSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    NavController g10 = ViewUtilsKt.g(this.f9787j);
                    if (g10 != null) {
                        b.r(R.id.action_vaultSettingsFragment_to_vaultPasscodeDialogFragment, g10, null);
                    }
                    return n.f16010a;
                }
            }

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.vault.VaultSettingsFragment$onCreateView$1$2$2$1$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            final class AnonymousClass2 extends Lambda implements a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ VaultSettingsFragment f9788j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(VaultSettingsFragment vaultSettingsFragment) {
                    super(0);
                    this.f9788j = vaultSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    NavController g10 = ViewUtilsKt.g(this.f9788j);
                    if (g10 != null) {
                        b.r(R.id.action_vaultSettingsFragment_to_vaultTimeoutDialogFragment, g10, null);
                    }
                    return n.f16010a;
                }
            }

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.vault.VaultSettingsFragment$onCreateView$1$2$2$1$1$3  reason: invalid class name */
            /* loaded from: classes.dex */
            final class AnonymousClass3 extends Lambda implements a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ VaultSettingsFragment f9789j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(VaultSettingsFragment vaultSettingsFragment) {
                    super(0);
                    this.f9789j = vaultSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    ((c) this.f9789j.f9767d0.getValue()).j();
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00981(String str, boolean z10, VaultSettingsFragment vaultSettingsFragment, g1<Boolean> g1Var) {
                super(3);
                this.f9783j = str;
                this.f9784k = z10;
                this.f9785l = vaultSettingsFragment;
                this.f9786m = g1Var;
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
                q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                String m12 = m0.b.m1(R.string.change_passcode, dVar3);
                b.a aVar = b.a.f9656a;
                VaultSettingsFragment vaultSettingsFragment = this.f9785l;
                SettingsItemKt.a(m12, aVar, new C00991(vaultSettingsFragment), null, 0L, m0.b.V0(R.drawable.ic_round_key_24, dVar3), 0L, null, dVar3, 262192, 216);
                String m13 = m0.b.m1(R.string.timeout, dVar3);
                String str = this.f9783j;
                g.f(str, "value");
                String m14 = m0.b.m1(R.string.timeout_description, dVar3);
                SettingsItemKt.a(m13, new b.c(str), new AnonymousClass2(vaultSettingsFragment), null, 0L, m0.b.V0(R.drawable.ic_round_timer_24, dVar3), 0L, m14, dVar3, 262144, 88);
                if (this.f9784k) {
                    String m15 = m0.b.m1(R.string.bio_auth, dVar3);
                    boolean booleanValue = this.f9786m.getValue().booleanValue();
                    String m16 = m0.b.m1(R.string.bio_auth_description, dVar3);
                    SettingsItemKt.a(m15, new b.C0091b(booleanValue), new AnonymousClass3(vaultSettingsFragment), null, 0L, m0.b.V0(R.drawable.ic_round_fingerprint_24, dVar3), 0L, m16, dVar3, 262144, 88);
                }
                return n.f16010a;
            }
        }

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.settings.vault.VaultSettingsFragment$onCreateView$1$2$2$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass2 extends Lambda implements q<v.d, d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ VaultSettingsFragment f9790j;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.vault.VaultSettingsFragment$onCreateView$1$2$2$1$2$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C01001 extends Lambda implements a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ VaultSettingsFragment f9791j;

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ String f9792k;

                /* renamed from: l  reason: collision with root package name */
                public final /* synthetic */ String f9793l;

                /* renamed from: m  reason: collision with root package name */
                public final /* synthetic */ String f9794m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C01001(VaultSettingsFragment vaultSettingsFragment, String str, String str2, String str3) {
                    super(0);
                    this.f9791j = vaultSettingsFragment;
                    this.f9792k = str;
                    this.f9793l = str2;
                    this.f9794m = str3;
                }

                @Override // u7.a
                public final n k0() {
                    NavController g10 = ViewUtilsKt.g(this.f9791j);
                    if (g10 != null) {
                        String str = this.f9792k;
                        g.f(str, "confirmation");
                        String str2 = this.f9793l;
                        g.f(str2, "description");
                        String str3 = this.f9794m;
                        g.f(str3, "btnText");
                        ViewUtilsKt.o(g10, new d7.a(str, str2, str3), null);
                    }
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(VaultSettingsFragment vaultSettingsFragment) {
                super(3);
                this.f9790j = vaultSettingsFragment;
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
                q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                String m12 = m0.b.m1(R.string.disable_vault_confirmation, dVar3);
                String m13 = m0.b.m1(R.string.disable_vault_description, dVar3);
                String m14 = m0.b.m1(R.string.disable_vault, dVar3);
                String m15 = m0.b.m1(R.string.disable, dVar3);
                b.a aVar = b.a.f9656a;
                C01001 c01001 = new C01001(this.f9790j, m12, m13, m14);
                h1 h1Var = ColorSchemeKt.f2278a;
                n6.b bVar = NotoThemeKt.f7579a;
                g.f((e0.c) dVar3.w(h1Var), "<this>");
                long k3 = a1.c.k(4294944550L);
                y0.b V0 = m0.b.V0(R.drawable.ic_round_key_off_24, dVar3);
                g.f((e0.c) dVar3.w(h1Var), "<this>");
                SettingsItemKt.a(m15, aVar, c01001, null, k3, V0, a1.c.k(4294944550L), null, dVar3, 262192, 136);
                return n.f16010a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, boolean z10, VaultSettingsFragment vaultSettingsFragment, g0 g0Var) {
            super(3);
            this.f9779j = str;
            this.f9780k = z10;
            this.f9781l = vaultSettingsFragment;
            this.f9782m = g0Var;
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
            q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
            g1<Boolean> g1Var = this.f9782m;
            String str = this.f9779j;
            boolean z10 = this.f9780k;
            VaultSettingsFragment vaultSettingsFragment = this.f9781l;
            SettingsSectionKt.a(null, null, null, a1.c.i0(dVar3, 2056905401, new C00981(str, z10, vaultSettingsFragment, g1Var)), dVar3, 3072, 7);
            SettingsSectionKt.a(null, null, null, a1.c.i0(dVar3, -60857040, new AnonymousClass2(vaultSettingsFragment)), dVar3, 3072, 7);
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultSettingsFragment$onCreateView$1$2$2(VaultSettingsFragment vaultSettingsFragment, boolean z10) {
        super(2);
        this.f9777j = vaultSettingsFragment;
        this.f9778k = z10;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        int i10;
        d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        VaultSettingsFragment vaultSettingsFragment = this.f9777j;
        int ordinal = ((VaultTimeout) a1.c.f0(((c) vaultSettingsFragment.f9767d0.getValue()).f9673s, dVar2).getValue()).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            dVar2.f(-1311952811);
                            i10 = R.string.after_12_hours;
                        } else {
                            dVar2.f(-1311955484);
                            dVar2.u();
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        dVar2.f(-1311952904);
                        i10 = R.string.after_4_hours;
                    }
                } else {
                    dVar2.f(-1311952995);
                    i10 = R.string.after_1_hour;
                }
            } else {
                dVar2.f(-1311953085);
                i10 = R.string.on_app_close;
            }
        } else {
            dVar2.f(-1311953174);
            i10 = R.string.immediately;
        }
        String m12 = m0.b.m1(i10, dVar2);
        dVar2.u();
        ScreenKt.a(this.f9777j, m0.b.m1(R.string.vault, dVar2), null, null, null, null, null, a1.c.i0(dVar2, 45986389, new AnonymousClass1(m12, this.f9778k, vaultSettingsFragment, a1.c.f0(((c) vaultSettingsFragment.f9767d0.getValue()).f9674t, dVar2))), dVar2, 12582920, 62);
        return n.f16010a;
    }
}
