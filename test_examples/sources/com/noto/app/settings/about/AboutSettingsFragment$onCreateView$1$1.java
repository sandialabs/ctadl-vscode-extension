package com.noto.app.settings.about;

import androidx.activity.i;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/i;", "Lm7/n;", "invoke", "(Landroidx/activity/i;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AboutSettingsFragment$onCreateView$1$1 extends Lambda implements l<i, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AboutSettingsFragment f9585j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AboutSettingsFragment$onCreateView$1$1(AboutSettingsFragment aboutSettingsFragment) {
        super(1);
        this.f9585j = aboutSettingsFragment;
    }

    @Override // u7.l
    public final n U(i iVar) {
        g.f(iVar, "$this$addCallback");
        NavController g10 = ViewUtilsKt.g(this.f9585j);
        if (g10 != null) {
            g10.j();
        }
        return n.f16010a;
    }
}
