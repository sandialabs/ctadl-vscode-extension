package androidx.compose.ui.focus;

import t0.a;
import t0.g;
import u7.l;

/* loaded from: classes.dex */
public final class FocusPropertiesImpl implements g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3037a = true;

    /* renamed from: b  reason: collision with root package name */
    public FocusRequester f3038b;
    public FocusRequester c;

    /* renamed from: d  reason: collision with root package name */
    public FocusRequester f3039d;

    /* renamed from: e  reason: collision with root package name */
    public FocusRequester f3040e;

    /* renamed from: f  reason: collision with root package name */
    public FocusRequester f3041f;

    /* renamed from: g  reason: collision with root package name */
    public FocusRequester f3042g;

    /* renamed from: h  reason: collision with root package name */
    public FocusRequester f3043h;

    /* renamed from: i  reason: collision with root package name */
    public FocusRequester f3044i;

    /* renamed from: j  reason: collision with root package name */
    public l<? super a, FocusRequester> f3045j;

    /* renamed from: k  reason: collision with root package name */
    public l<? super a, FocusRequester> f3046k;

    public FocusPropertiesImpl() {
        FocusRequester focusRequester = FocusRequester.f3054b;
        FocusRequester focusRequester2 = FocusRequester.f3054b;
        this.f3038b = focusRequester2;
        this.c = focusRequester2;
        this.f3039d = focusRequester2;
        this.f3040e = focusRequester2;
        this.f3041f = focusRequester2;
        this.f3042g = focusRequester2;
        this.f3043h = focusRequester2;
        this.f3044i = focusRequester2;
        this.f3045j = FocusPropertiesImpl$enter$1.f3047j;
        this.f3046k = FocusPropertiesImpl$exit$1.f3048j;
    }

    @Override // t0.g
    public final void a(boolean z10) {
        this.f3037a = z10;
    }

    public final void b(l<? super a, FocusRequester> lVar) {
        v7.g.f(lVar, "<set-?>");
        this.f3045j = lVar;
    }

    public final void c(l<? super a, FocusRequester> lVar) {
        v7.g.f(lVar, "<set-?>");
        this.f3046k = lVar;
    }

    public final void d(FocusRequester focusRequester) {
        v7.g.f(focusRequester, "<set-?>");
        this.f3038b = focusRequester;
    }
}
