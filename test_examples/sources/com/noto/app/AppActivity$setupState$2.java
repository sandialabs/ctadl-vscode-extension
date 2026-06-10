package com.noto.app;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.n;
import com.noto.R;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import q7.c;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"", "lastVersion", "Landroidx/navigation/n;", "<anonymous parameter 1>", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.AppActivity$setupState$2", f = "AppActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AppActivity$setupState$2 extends SuspendLambda implements q<String, n, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ String f7534m;
    public final /* synthetic */ AppActivity n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppActivity$setupState$2(AppActivity appActivity, p7.c<? super AppActivity$setupState$2> cVar) {
        super(3, cVar);
        this.n = appActivity;
    }

    @Override // u7.q
    public final Object O(String str, n nVar, p7.c<? super m7.n> cVar) {
        n nVar2 = nVar;
        AppActivity$setupState$2 appActivity$setupState$2 = new AppActivity$setupState$2(this.n, cVar);
        appActivity$setupState$2.f7534m = str;
        return appActivity$setupState$2.k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        boolean z10;
        b.n1(obj);
        if (!g.a(this.f7534m, "2.2.3")) {
            int i10 = AppActivity.N;
            AppActivity appActivity = this.n;
            n e10 = appActivity.u().e();
            if (e10 != null && e10.f5511k == R.id.whatsNewDialogFragment) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                appActivity.u().h(R.id.whatsNewDialogFragment, null, null);
            }
        }
        return m7.n.f16010a;
    }
}
