package androidx.compose.ui.platform;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.Lifecycle;
import com.noto.R;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Lg0/f;", "Landroidx/lifecycle/o;", "ui_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class WrappedComposition implements g0.f, androidx.lifecycle.o {

    /* renamed from: i  reason: collision with root package name */
    public final AndroidComposeView f3805i;

    /* renamed from: j  reason: collision with root package name */
    public final g0.f f3806j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3807k;

    /* renamed from: l  reason: collision with root package name */
    public Lifecycle f3808l;

    /* renamed from: m  reason: collision with root package name */
    public u7.p<? super g0.d, ? super Integer, m7.n> f3809m = ComposableSingletons$Wrapper_androidKt.f3694a;

    public WrappedComposition(AndroidComposeView androidComposeView, androidx.compose.runtime.b bVar) {
        this.f3805i = androidComposeView;
        this.f3806j = bVar;
    }

    @Override // g0.f
    public final void a() {
        if (!this.f3807k) {
            this.f3807k = true;
            this.f3805i.getView().setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.f3808l;
            if (lifecycle != null) {
                lifecycle.c(this);
            }
        }
        this.f3806j.a();
    }

    @Override // androidx.lifecycle.o
    public final void f(androidx.lifecycle.q qVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            a();
        } else if (event != Lifecycle.Event.ON_CREATE || this.f3807k) {
        } else {
            j(this.f3809m);
        }
    }

    @Override // g0.f
    public final void j(u7.p<? super g0.d, ? super Integer, m7.n> pVar) {
        v7.g.f(pVar, "content");
        this.f3805i.setOnViewTreeOwnersAvailable(new WrappedComposition$setContent$1(this, pVar));
    }

    @Override // g0.f
    public final boolean n() {
        return this.f3806j.n();
    }

    @Override // g0.f
    public final boolean s() {
        return this.f3806j.s();
    }
}
