package com.noto.app.components;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.a;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScreenKt$Screen$1 extends Lambda implements a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Fragment f7631j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenKt$Screen$1(Fragment fragment) {
        super(0);
        this.f7631j = fragment;
    }

    @Override // u7.a
    public final n k0() {
        NavController g10 = ViewUtilsKt.g(this.f7631j);
        if (g10 != null) {
            g10.j();
        }
        return n.f16010a;
    }
}
