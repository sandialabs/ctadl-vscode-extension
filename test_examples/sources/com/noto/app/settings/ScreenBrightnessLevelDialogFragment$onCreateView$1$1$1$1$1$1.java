package com.noto.app.settings;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.ScreenBrightnessLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScreenBrightnessLevelDialogFragment$onCreateView$1$1$1$1$1$1 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ScreenBrightnessLevelDialogFragment f9472j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ScreenBrightnessLevel f9473k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenBrightnessLevelDialogFragment$onCreateView$1$1$1$1$1$1(ScreenBrightnessLevelDialogFragment screenBrightnessLevelDialogFragment, ScreenBrightnessLevel screenBrightnessLevel) {
        super(0);
        this.f9472j = screenBrightnessLevelDialogFragment;
        this.f9473k = screenBrightnessLevel;
    }

    @Override // u7.a
    public final n k0() {
        ScreenBrightnessLevelDialogFragment screenBrightnessLevelDialogFragment = this.f9472j;
        c cVar = (c) screenBrightnessLevelDialogFragment.f9465u0.getValue();
        cVar.getClass();
        ScreenBrightnessLevel screenBrightnessLevel = this.f9473k;
        g.f(screenBrightnessLevel, "level");
        m0.b.M0(a1.b.d0(cVar), null, null, new SettingsViewModel$updateScreenBrightnessLevel$1(cVar, screenBrightnessLevel, null), 3);
        screenBrightnessLevelDialogFragment.Z();
        return n.f16010a;
    }
}
