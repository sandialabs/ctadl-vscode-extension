package androidx.fragment.app;

/* loaded from: classes.dex */
public final class n implements m.a<Void, androidx.activity.result.f> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Fragment f5236a;

    public n(Fragment fragment) {
        this.f5236a = fragment;
    }

    @Override // m.a
    public final Object apply() {
        Fragment fragment = this.f5236a;
        w<?> wVar = fragment.A;
        return wVar instanceof androidx.activity.result.g ? ((androidx.activity.result.g) wVar).P() : fragment.R().f419r;
    }
}
