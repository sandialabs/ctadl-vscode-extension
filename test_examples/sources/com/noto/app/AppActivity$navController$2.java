package com.noto.app;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/navigation/NavController;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppActivity$navController$2 extends Lambda implements u7.a<NavController> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AppActivity f7528j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppActivity$navController$2(AppActivity appActivity) {
        super(0);
        this.f7528j = appActivity;
    }

    @Override // u7.a
    public final NavController k0() {
        int i10 = AppActivity.N;
        r rVar = ((NavHostFragment) this.f7528j.J.getValue()).f5464d0;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }
}
