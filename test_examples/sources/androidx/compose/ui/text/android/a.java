package androidx.compose.ui.text.android;

import kotlin.LazyThreadSafetyMode;
import m7.e;
import v7.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final e f4066a;

    /* renamed from: b  reason: collision with root package name */
    public final e f4067b;
    public final e c;

    public a(int i10, x1.a aVar, CharSequence charSequence) {
        g.f(charSequence, "charSequence");
        g.f(aVar, "textPaint");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f4066a = kotlin.a.a(lazyThreadSafetyMode, new LayoutIntrinsics$boringMetrics$2(i10, aVar, charSequence));
        this.f4067b = kotlin.a.a(lazyThreadSafetyMode, new LayoutIntrinsics$minIntrinsicWidth$2(aVar, charSequence));
        this.c = kotlin.a.a(lazyThreadSafetyMode, new LayoutIntrinsics$maxIntrinsicWidth$2(this, charSequence, aVar));
    }
}
