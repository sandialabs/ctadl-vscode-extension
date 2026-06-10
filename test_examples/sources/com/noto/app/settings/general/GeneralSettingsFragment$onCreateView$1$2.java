package com.noto.app.settings.general;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.settings.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.e;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "id", "Lm7/n;", "invoke", "(Ljava/lang/Long;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class GeneralSettingsFragment$onCreateView$1$2 extends Lambda implements l<Long, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ GeneralSettingsFragment f9689j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralSettingsFragment$onCreateView$1$2(GeneralSettingsFragment generalSettingsFragment) {
        super(1);
        this.f9689j = generalSettingsFragment;
    }

    @Override // u7.l
    public final n U(Long l2) {
        Long l4 = l2;
        GeneralSettingsFragment generalSettingsFragment = this.f9689j;
        int ordinal = GeneralSettingsFragment.Z(generalSettingsFragment).f9680z.ordinal();
        e eVar = generalSettingsFragment.f9685d0;
        if (ordinal != 0) {
            if (ordinal == 1) {
                g.e(l4, "id");
                ((c) eVar.getValue()).f(l4.longValue());
            }
        } else {
            g.e(l4, "id");
            ((c) eVar.getValue()).e(l4.longValue());
        }
        return n.f16010a;
    }
}
