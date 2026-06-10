package com.noto.app.settings.general;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.Language;
import com.noto.app.util.ModelUtilsKt;
import g0.c;
import g0.d;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import u7.q;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LanguageDialogFragment$onCreateView$1$1$1$1$1$2$1$1$1 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Language f9759j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageDialogFragment$onCreateView$1$1$1$1$1$2$1$1$1(Language language) {
        super(2);
        this.f9759j = language;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        TextKt.b(ModelUtilsKt.a(this.f9759j, dVar2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, dVar2, 0, 0, 65534);
        return n.f16010a;
    }
}
