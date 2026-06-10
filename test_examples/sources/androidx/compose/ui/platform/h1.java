package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public final class h1 implements g3.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractComposeView f3847a;

    public h1(AbstractComposeView abstractComposeView) {
        this.f3847a = abstractComposeView;
    }

    @Override // g3.a
    public final void a() {
        AbstractComposeView abstractComposeView = this.f3847a;
        g0.f fVar = abstractComposeView.f3553k;
        if (fVar != null) {
            ((WrappedComposition) fVar).a();
        }
        abstractComposeView.f3553k = null;
        abstractComposeView.requestLayout();
    }
}
