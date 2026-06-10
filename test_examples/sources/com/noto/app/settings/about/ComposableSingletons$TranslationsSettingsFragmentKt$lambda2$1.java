package com.noto.app.settings.about;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.settings.SettingsSectionKt;
import g0.c;
import g0.d;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.b;
import m7.n;
import u7.p;
import u7.q;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "(Lg0/d;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* renamed from: com.noto.app.settings.about.ComposableSingletons$TranslationsSettingsFragmentKt$lambda-2$1  reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$TranslationsSettingsFragmentKt$lambda2$1 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final ComposableSingletons$TranslationsSettingsFragmentKt$lambda2$1 f9618j = new ComposableSingletons$TranslationsSettingsFragmentKt$lambda2$1();

    public ComposableSingletons$TranslationsSettingsFragmentKt$lambda2$1() {
        super(2);
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        SettingsSectionKt.a(null, b.m1(R.string.german, dVar2), b.V0(R.drawable.ic_germany, dVar2), ComposableSingletons$TranslationsSettingsFragmentKt.f9615a, dVar2, 3584, 1);
        return n.f16010a;
    }
}
