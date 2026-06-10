package com.noto.app.settings.about;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.settings.SettingsItemKt;
import com.noto.app.settings.b;
import g0.c;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.b;
import m7.n;
import o6.e;
import u7.q;
import v.d;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv/d;", "Lm7/n;", "invoke", "(Lv/d;Lg0/d;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* renamed from: com.noto.app.settings.about.ComposableSingletons$TranslationsSettingsFragmentKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$TranslationsSettingsFragmentKt$lambda1$1 extends Lambda implements q<d, g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final ComposableSingletons$TranslationsSettingsFragmentKt$lambda1$1 f9617j = new ComposableSingletons$TranslationsSettingsFragmentKt$lambda1$1();

    public ComposableSingletons$TranslationsSettingsFragmentKt$lambda1$1() {
        super(3);
    }

    @Override // u7.q
    public final n O(d dVar, g0.d dVar2, Integer num) {
        g0.d dVar3 = dVar2;
        int intValue = num.intValue();
        g.f(dVar, "$this$SettingsSection");
        if ((intValue & 81) == 16 && dVar3.s()) {
            dVar3.e();
            return n.f16010a;
        }
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        SettingsItemKt.a(b.m1(R.string.german_translator, dVar3), b.a.f9656a, null, null, 0L, e.f16364f, 0L, null, dVar3, 197040, 216);
        return n.f16010a;
    }
}
