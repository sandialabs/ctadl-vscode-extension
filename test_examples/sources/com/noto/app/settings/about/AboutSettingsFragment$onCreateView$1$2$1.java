package com.noto.app.settings.about;

import android.content.Intent;
import android.net.Uri;
import androidx.compose.material3.SnackbarDuration;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.d;
import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.components.ScreenKt;
import com.noto.app.settings.SettingsItemKt;
import com.noto.app.settings.SettingsSectionKt;
import com.noto.app.settings.b;
import com.noto.app.util.ViewUtilsKt;
import g0.c;
import g0.d;
import g0.k;
import g0.s;
import g0.t0;
import g0.z0;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.b;
import m7.n;
import u7.a;
import u7.p;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "(Lg0/d;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AboutSettingsFragment$onCreateView$1$2$1 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AboutSettingsFragment f9586j;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.settings.about.AboutSettingsFragment$onCreateView$1$2$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements p<d, Integer, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ androidx.compose.material3.d f9587j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(androidx.compose.material3.d dVar) {
            super(2);
            this.f9587j = dVar;
        }

        @Override // u7.p
        public final n R(d dVar, Integer num) {
            d dVar2 = dVar;
            if ((num.intValue() & 11) == 2 && dVar2.s()) {
                dVar2.e();
                return n.f16010a;
            }
            q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
            SnackbarHostKt.b(this.f9587j, null, null, dVar2, 6, 6);
            return n.f16010a;
        }
    }

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.settings.about.AboutSettingsFragment$onCreateView$1$2$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends Lambda implements q<v.d, d, Integer, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ AboutSettingsFragment f9588j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ x f9589k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ androidx.compose.material3.d f9590l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ String f9591m;

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.settings.about.AboutSettingsFragment$onCreateView$1$2$1$2$1  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass1 extends Lambda implements q<v.d, d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ AboutSettingsFragment f9592j;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.about.AboutSettingsFragment$onCreateView$1$2$1$2$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00751 extends Lambda implements a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ AboutSettingsFragment f9593j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00751(AboutSettingsFragment aboutSettingsFragment) {
                    super(0);
                    this.f9593j = aboutSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    this.f9593j.Y(new Intent("android.intent.action.VIEW", Uri.parse("https://www.alialbaali.com")));
                    return n.f16010a;
                }
            }

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.about.AboutSettingsFragment$onCreateView$1$2$1$2$1$2  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00762 extends Lambda implements a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ AboutSettingsFragment f9594j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00762(AboutSettingsFragment aboutSettingsFragment) {
                    super(0);
                    this.f9594j = aboutSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    this.f9594j.Y(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/alialbaali/Noto#support")));
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AboutSettingsFragment aboutSettingsFragment) {
                super(3);
                this.f9592j = aboutSettingsFragment;
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
                String m12 = b.m1(R.string.developer, dVar3);
                b.c cVar = new b.c(m0.b.m1(R.string.developer_name, dVar3));
                AboutSettingsFragment aboutSettingsFragment = this.f9592j;
                SettingsItemKt.a(m12, cVar, new C00751(aboutSettingsFragment), null, 0L, m0.b.V0(R.drawable.ic_round_person_24, dVar3), 0L, null, dVar3, 262144, 216);
                String m13 = m0.b.m1(R.string.support_noto, dVar3);
                b.a aVar = b.a.f9656a;
                String m14 = m0.b.m1(R.string.support_noto_description, dVar3);
                y0.b V0 = m0.b.V0(R.drawable.ic_round_favorite_24, dVar3);
                long j2 = com.noto.app.settings.a.f9582a;
                SettingsItemKt.a(m13, aVar, new C00762(aboutSettingsFragment), null, j2, V0, j2, m14, dVar3, 1859632, 8);
                return n.f16010a;
            }
        }

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.settings.about.AboutSettingsFragment$onCreateView$1$2$1$2$2  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        final class C00772 extends Lambda implements q<v.d, d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ AboutSettingsFragment f9595j;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.about.AboutSettingsFragment$onCreateView$1$2$1$2$2$1  reason: invalid class name */
            /* loaded from: classes.dex */
            final class AnonymousClass1 extends Lambda implements a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ AboutSettingsFragment f9596j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(AboutSettingsFragment aboutSettingsFragment) {
                    super(0);
                    this.f9596j = aboutSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:"));
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{"noto@albaali.com"});
                    intent.putExtra("android.intent.extra.SUBJECT", "Noto Translation");
                    intent.putExtra("android.intent.extra.TEXT", "Hi there,\n\nI would like to translate Noto to [LANGUAGE].\n\nI want to be credited as (optional):\nName: [NAME]\nLink (optional): [LINK]\n\nRegards,");
                    this.f9596j.Y(intent);
                    return n.f16010a;
                }
            }

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.about.AboutSettingsFragment$onCreateView$1$2$1$2$2$2  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00782 extends Lambda implements a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ AboutSettingsFragment f9597j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00782(AboutSettingsFragment aboutSettingsFragment) {
                    super(0);
                    this.f9597j = aboutSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    NavController g10 = ViewUtilsKt.g(this.f9597j);
                    if (g10 != null) {
                        a4.b.r(R.id.action_aboutSettingsFragment_to_translationsSettingsFragment, g10, null);
                    }
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00772(AboutSettingsFragment aboutSettingsFragment) {
                super(3);
                this.f9595j = aboutSettingsFragment;
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
                String m12 = m0.b.m1(R.string.translate_noto, dVar3);
                b.a aVar = b.a.f9656a;
                String m13 = m0.b.m1(R.string.translate_noto_description, dVar3);
                y0.b V0 = m0.b.V0(R.drawable.ic_round_translate_24, dVar3);
                AboutSettingsFragment aboutSettingsFragment = this.f9595j;
                SettingsItemKt.a(m12, aVar, new AnonymousClass1(aboutSettingsFragment), null, 0L, V0, 0L, m13, dVar3, 262192, 88);
                String m14 = m0.b.m1(R.string.translations, dVar3);
                String m15 = m0.b.m1(R.string.translations_description, dVar3);
                SettingsItemKt.a(m14, aVar, new C00782(aboutSettingsFragment), null, 0L, m0.b.V0(R.drawable.ic_round_language_24, dVar3), 0L, m15, dVar3, 262192, 88);
                return n.f16010a;
            }
        }

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.settings.about.AboutSettingsFragment$onCreateView$1$2$1$2$3  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass3 extends Lambda implements q<v.d, d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ AboutSettingsFragment f9598j;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.about.AboutSettingsFragment$onCreateView$1$2$1$2$3$1  reason: invalid class name */
            /* loaded from: classes.dex */
            final class AnonymousClass1 extends Lambda implements a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ AboutSettingsFragment f9599j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(AboutSettingsFragment aboutSettingsFragment) {
                    super(0);
                    this.f9599j = aboutSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    NavController g10 = ViewUtilsKt.g(this.f9599j);
                    if (g10 != null) {
                        a4.b.r(R.id.action_aboutSettingsFragment_to_creditsSettingsFragment, g10, null);
                    }
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(AboutSettingsFragment aboutSettingsFragment) {
                super(3);
                this.f9598j = aboutSettingsFragment;
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
                SettingsItemKt.a(m0.b.m1(R.string.credits, dVar3), b.a.f9656a, new AnonymousClass1(this.f9598j), null, 0L, m0.b.V0(R.drawable.ic_round_attribution_24, dVar3), 0L, null, dVar3, 262192, 216);
                return n.f16010a;
            }
        }

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.settings.about.AboutSettingsFragment$onCreateView$1$2$1$2$4  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass4 extends Lambda implements q<v.d, d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ AboutSettingsFragment f9600j;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.about.AboutSettingsFragment$onCreateView$1$2$1$2$4$1  reason: invalid class name */
            /* loaded from: classes.dex */
            final class AnonymousClass1 extends Lambda implements a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ AboutSettingsFragment f9601j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(AboutSettingsFragment aboutSettingsFragment) {
                    super(0);
                    this.f9601j = aboutSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    this.f9601j.Y(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/alialbaali/Noto")));
                    return n.f16010a;
                }
            }

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.about.AboutSettingsFragment$onCreateView$1$2$1$2$4$2  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00792 extends Lambda implements a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ AboutSettingsFragment f9602j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00792(AboutSettingsFragment aboutSettingsFragment) {
                    super(0);
                    this.f9602j = aboutSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    this.f9602j.Y(new Intent("android.intent.action.VIEW", Uri.parse("https://reddit.com/r/notoapp")));
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(AboutSettingsFragment aboutSettingsFragment) {
                super(3);
                this.f9600j = aboutSettingsFragment;
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
                String m12 = m0.b.m1(R.string.source_code, dVar3);
                b.a aVar = b.a.f9656a;
                String m13 = m0.b.m1(R.string.source_code_description, dVar3);
                y0.b V0 = m0.b.V0(R.drawable.ic_github_logo, dVar3);
                AboutSettingsFragment aboutSettingsFragment = this.f9600j;
                SettingsItemKt.a(m12, aVar, new AnonymousClass1(aboutSettingsFragment), null, 0L, V0, 0L, m13, dVar3, 262192, 88);
                String m14 = m0.b.m1(R.string.reddit_community, dVar3);
                String m15 = m0.b.m1(R.string.reddit_community_description, dVar3);
                SettingsItemKt.a(m14, aVar, new C00792(aboutSettingsFragment), null, 0L, m0.b.V0(R.drawable.ic_reddit_logo, dVar3), 0L, m15, dVar3, 262192, 88);
                return n.f16010a;
            }
        }

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.settings.about.AboutSettingsFragment$onCreateView$1$2$1$2$5  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass5 extends Lambda implements q<v.d, d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ AboutSettingsFragment f9603j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ x f9604k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ androidx.compose.material3.d f9605l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ String f9606m;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.about.AboutSettingsFragment$onCreateView$1$2$1$2$5$1  reason: invalid class name */
            /* loaded from: classes.dex */
            final class AnonymousClass1 extends Lambda implements a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ AboutSettingsFragment f9607j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(AboutSettingsFragment aboutSettingsFragment) {
                    super(0);
                    this.f9607j = aboutSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    this.f9607j.Y(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/alialbaali/Noto/blob/master/PrivacyPolicy.md")));
                    return n.f16010a;
                }
            }

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.about.AboutSettingsFragment$onCreateView$1$2$1$2$5$2  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00802 extends Lambda implements a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ AboutSettingsFragment f9608j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00802(AboutSettingsFragment aboutSettingsFragment) {
                    super(0);
                    this.f9608j = aboutSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    this.f9608j.Y(new Intent("android.intent.action.VIEW", Uri.parse("https://www.apache.org/licenses/LICENSE-2.0")));
                    return n.f16010a;
                }
            }

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.about.AboutSettingsFragment$onCreateView$1$2$1$2$5$4  reason: invalid class name */
            /* loaded from: classes.dex */
            final class AnonymousClass4 extends Lambda implements a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ x f9609j;

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ androidx.compose.material3.d f9610k;

                /* renamed from: l  reason: collision with root package name */
                public final /* synthetic */ String f9611l;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.settings.about.AboutSettingsFragment$onCreateView$1$2$1$2$5$4$1", f = "AboutSettingsFragment.kt", l = {194}, m = "invokeSuspend")
                /* renamed from: com.noto.app.settings.about.AboutSettingsFragment$onCreateView$1$2$1$2$5$4$1  reason: invalid class name */
                /* loaded from: classes.dex */
                final class AnonymousClass1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

                    /* renamed from: m  reason: collision with root package name */
                    public int f9612m;
                    public final /* synthetic */ androidx.compose.material3.d n;

                    /* renamed from: o  reason: collision with root package name */
                    public final /* synthetic */ String f9613o;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(androidx.compose.material3.d dVar, String str, p7.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.n = dVar;
                        this.f9613o = str;
                    }

                    @Override // u7.p
                    public final Object R(x xVar, p7.c<? super n> cVar) {
                        return ((AnonymousClass1) a(xVar, cVar)).k(n.f16010a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
                        return new AnonymousClass1(this.n, this.f9613o, cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i10 = this.f9612m;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                m0.b.n1(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            m0.b.n1(obj);
                            this.f9612m = 1;
                            SnackbarDuration snackbarDuration = SnackbarDuration.Short;
                            androidx.compose.material3.d dVar = this.n;
                            dVar.getClass();
                            if (dVar.a(new d.b(this.f9613o, null, false, snackbarDuration), this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return n.f16010a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(x xVar, androidx.compose.material3.d dVar, String str) {
                    super(0);
                    this.f9609j = xVar;
                    this.f9610k = dVar;
                    this.f9611l = str;
                }

                @Override // u7.a
                public final n k0() {
                    m0.b.M0(this.f9609j, null, null, new AnonymousClass1(this.f9610k, this.f9611l, null), 3);
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(AboutSettingsFragment aboutSettingsFragment, x xVar, androidx.compose.material3.d dVar, String str) {
                super(3);
                this.f9603j = aboutSettingsFragment;
                this.f9604k = xVar;
                this.f9605l = dVar;
                this.f9606m = str;
            }

            @Override // u7.q
            public final n O(v.d dVar, g0.d dVar2, Integer num) {
                com.noto.app.settings.b bVar;
                g0.d dVar3 = dVar2;
                int intValue = num.intValue();
                g.f(dVar, "$this$SettingsSection");
                if ((intValue & 81) == 16 && dVar3.s()) {
                    dVar3.e();
                    return n.f16010a;
                }
                q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                String m12 = m0.b.m1(R.string.privacy_policy, dVar3);
                b.a aVar = b.a.f9656a;
                String m13 = m0.b.m1(R.string.privacy_policy_description, dVar3);
                y0.b V0 = m0.b.V0(R.drawable.ic_round_policy_24, dVar3);
                AboutSettingsFragment aboutSettingsFragment = this.f9603j;
                SettingsItemKt.a(m12, aVar, new AnonymousClass1(aboutSettingsFragment), null, 0L, V0, 0L, m13, dVar3, 262192, 88);
                SettingsItemKt.a(m0.b.m1(R.string.license, dVar3), new b.c(m0.b.m1(R.string.license_value, dVar3)), new C00802(aboutSettingsFragment), null, 0L, m0.b.V0(R.drawable.ic_round_assignment_24, dVar3), 0L, null, dVar3, 262144, 216);
                String m14 = m0.b.m1(R.string.version, dVar3);
                String str = (String) aboutSettingsFragment.f9584d0.getValue();
                if (str != null) {
                    bVar = new b.c(str);
                } else {
                    bVar = aVar;
                }
                SettingsItemKt.a(m14, bVar, new AnonymousClass4(this.f9604k, this.f9605l, this.f9606m), null, 0L, m0.b.V0(R.drawable.ic_round_tag_24, dVar3), 0L, null, dVar3, 262144, 216);
                return n.f16010a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AboutSettingsFragment aboutSettingsFragment, x xVar, androidx.compose.material3.d dVar, String str) {
            super(3);
            this.f9588j = aboutSettingsFragment;
            this.f9589k = xVar;
            this.f9590l = dVar;
            this.f9591m = str;
        }

        @Override // u7.q
        public final n O(v.d dVar, g0.d dVar2, Integer num) {
            g0.d dVar3 = dVar2;
            int intValue = num.intValue();
            g.f(dVar, "$this$Screen");
            if ((intValue & 81) == 16 && dVar3.s()) {
                dVar3.e();
                return n.f16010a;
            }
            q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
            AboutSettingsFragment aboutSettingsFragment = this.f9588j;
            SettingsSectionKt.a(null, null, null, a1.c.i0(dVar3, 52691892, new AnonymousClass1(aboutSettingsFragment)), dVar3, 3072, 7);
            SettingsSectionKt.a(null, null, null, a1.c.i0(dVar3, -2065070549, new C00772(aboutSettingsFragment)), dVar3, 3072, 7);
            SettingsSectionKt.a(null, null, null, a1.c.i0(dVar3, 1319017004, new AnonymousClass3(aboutSettingsFragment)), dVar3, 3072, 7);
            SettingsSectionKt.a(null, null, null, a1.c.i0(dVar3, 408137261, new AnonymousClass4(aboutSettingsFragment)), dVar3, 3072, 7);
            SettingsSectionKt.a(null, null, null, a1.c.i0(dVar3, -502742482, new AnonymousClass5(aboutSettingsFragment, this.f9589k, this.f9590l, this.f9591m)), dVar3, 3072, 7);
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AboutSettingsFragment$onCreateView$1$2$1(AboutSettingsFragment aboutSettingsFragment) {
        super(2);
        this.f9586j = aboutSettingsFragment;
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        g0.d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        dVar2.f(-492369756);
        Object g10 = dVar2.g();
        d.a.C0120a c0120a = d.a.f11039a;
        if (g10 == c0120a) {
            g10 = new androidx.compose.material3.d();
            dVar2.q(g10);
        }
        dVar2.u();
        androidx.compose.material3.d dVar3 = (androidx.compose.material3.d) g10;
        dVar2.f(773894976);
        dVar2.f(-492369756);
        Object g11 = dVar2.g();
        if (g11 == c0120a) {
            k kVar = new k(s.e(EmptyCoroutineContext.f13021i, dVar2));
            dVar2.q(kVar);
            g11 = kVar;
        }
        dVar2.u();
        x xVar = ((k) g11).f11060a;
        dVar2.u();
        ScreenKt.a(this.f9586j, m0.b.m1(R.string.about, dVar2), null, null, a1.c.i0(dVar2, -301750083, new AnonymousClass1(dVar3)), null, null, a1.c.i0(dVar2, -1958227120, new AnonymousClass2(this.f9586j, xVar, dVar3, m0.b.m1(R.string.version_is_copied, dVar2))), dVar2, 12607496, 54);
        return n.f16010a;
    }
}
