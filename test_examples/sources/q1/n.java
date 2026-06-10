package q1;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f16846a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16847b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final TextPaint f16848d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16849e;

    /* renamed from: f  reason: collision with root package name */
    public final TextDirectionHeuristic f16850f;

    /* renamed from: g  reason: collision with root package name */
    public final Layout.Alignment f16851g;

    /* renamed from: h  reason: collision with root package name */
    public final int f16852h;

    /* renamed from: i  reason: collision with root package name */
    public final TextUtils.TruncateAt f16853i;

    /* renamed from: j  reason: collision with root package name */
    public final int f16854j;

    /* renamed from: k  reason: collision with root package name */
    public final float f16855k;

    /* renamed from: l  reason: collision with root package name */
    public final float f16856l;

    /* renamed from: m  reason: collision with root package name */
    public final int f16857m;
    public final boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f16858o;

    /* renamed from: p  reason: collision with root package name */
    public final int f16859p;

    /* renamed from: q  reason: collision with root package name */
    public final int f16860q;

    /* renamed from: r  reason: collision with root package name */
    public final int f16861r;

    /* renamed from: s  reason: collision with root package name */
    public final int f16862s;

    /* renamed from: t  reason: collision with root package name */
    public final int[] f16863t;

    /* renamed from: u  reason: collision with root package name */
    public final int[] f16864u;

    public n(CharSequence charSequence, int i10, int i11, x1.a aVar, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2) {
        v7.g.f(charSequence, "text");
        v7.g.f(aVar, "paint");
        v7.g.f(textDirectionHeuristic, "textDir");
        v7.g.f(alignment, "alignment");
        this.f16846a = charSequence;
        this.f16847b = i10;
        this.c = i11;
        this.f16848d = aVar;
        this.f16849e = i12;
        this.f16850f = textDirectionHeuristic;
        this.f16851g = alignment;
        this.f16852h = i13;
        this.f16853i = truncateAt;
        this.f16854j = i14;
        this.f16855k = f10;
        this.f16856l = f11;
        this.f16857m = i15;
        this.n = z10;
        this.f16858o = z11;
        this.f16859p = i16;
        this.f16860q = i17;
        this.f16861r = i18;
        this.f16862s = i19;
        this.f16863t = iArr;
        this.f16864u = iArr2;
        if (!(i10 >= 0 && i10 <= i11)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i11 >= 0 && i11 <= charSequence.length())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i13 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i12 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i14 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(f10 >= 0.0f)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
