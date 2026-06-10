package com.noto.app.settings.general;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.components.BottomSheetDialogKt;
import com.noto.app.components.SelectableDialogItemKt;
import com.noto.app.domain.model.Language;
import g0.c;
import g0.d;
import g0.g0;
import g0.t0;
import g0.z0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.Lambda;
import m7.n;
import q0.d;
import u7.p;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "(Lg0/d;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LanguageDialogFragment$onCreateView$1$1$1 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LanguageDialogFragment f9754j;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.settings.general.LanguageDialogFragment$onCreateView$1$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements q<v.d, d, Integer, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ LanguageDialogFragment f9755j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LanguageDialogFragment languageDialogFragment) {
            super(3);
            this.f9755j = languageDialogFragment;
        }

        @Override // u7.q
        public final n O(v.d dVar, d dVar2, Integer num) {
            boolean z10;
            d dVar3 = dVar2;
            int intValue = num.intValue();
            g.f(dVar, "$this$BottomSheetDialog");
            if ((intValue & 81) == 16 && dVar3.s()) {
                dVar3.e();
                return n.f16010a;
            }
            q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
            LanguageDialogFragment languageDialogFragment = this.f9755j;
            g0 f02 = a1.c.f0(((com.noto.app.settings.c) languageDialogFragment.f9752u0.getValue()).f9666k, dVar3);
            dVar3.f(-492369756);
            Object g10 = dVar3.g();
            if (g10 == d.a.f11039a) {
                g10 = b.t2(Language.values(), new c7.d());
                dVar3.q(g10);
            }
            dVar3.u();
            for (Language language : (List) g10) {
                if (((Language) f02.getValue()) == language) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                SelectableDialogItemKt.a(z10, new LanguageDialogFragment$onCreateView$1$1$1$1$1$1(languageDialogFragment, language), SizeKt.c(d.a.f16824i), !Language.f8182i.contains(language), a1.c.i0(dVar3, 1394263812, new LanguageDialogFragment$onCreateView$1$1$1$1$1$2(language)), dVar3, 24960, 0);
            }
            q<c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageDialogFragment$onCreateView$1$1$1(LanguageDialogFragment languageDialogFragment) {
        super(2);
        this.f9754j = languageDialogFragment;
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        g0.d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        BottomSheetDialogKt.a(this.f9754j, m0.b.m1(R.string.language, dVar2), null, a1.c.i0(dVar2, -1311977031, new AnonymousClass1(this.f9754j)), dVar2, 3080, 2);
        return n.f16010a;
    }
}
