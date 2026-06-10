package com.noto.app;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.noto.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/navigation/fragment/NavHostFragment;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppActivity$navHostFragment$2 extends Lambda implements u7.a<NavHostFragment> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AppActivity f7529j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppActivity$navHostFragment$2(AppActivity appActivity) {
        super(0);
        this.f7529j = appActivity;
    }

    @Override // u7.a
    public final NavHostFragment k0() {
        Fragment D = this.f7529j.f5251z.f5260a.f5265l.D(R.id.nav_host_fragment);
        g.d(D, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        return (NavHostFragment) D;
    }
}
