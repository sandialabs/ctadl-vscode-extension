package androidx.compose.ui.platform;

import android.content.Context;

/* loaded from: classes.dex */
public final class u implements g0.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f3907a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f3908b;

    public u(Context context, v vVar) {
        this.f3907a = context;
        this.f3908b = vVar;
    }

    @Override // g0.p
    public final void a() {
        this.f3907a.getApplicationContext().unregisterComponentCallbacks(this.f3908b);
    }
}
