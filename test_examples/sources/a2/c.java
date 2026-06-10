package a2;

import androidx.compose.ui.text.style.TextForegroundStyle$CC;
import v0.m;
import v0.r;

/* loaded from: classes.dex */
public final class c implements androidx.compose.ui.text.style.a {

    /* renamed from: a  reason: collision with root package name */
    public final long f92a;

    public c(long j2) {
        boolean z10;
        this.f92a = j2;
        if (j2 != r.f18133g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
    }

    @Override // androidx.compose.ui.text.style.a
    public final long a() {
        return this.f92a;
    }

    @Override // androidx.compose.ui.text.style.a
    public final /* synthetic */ androidx.compose.ui.text.style.a b(u7.a aVar) {
        return TextForegroundStyle$CC.b(this, aVar);
    }

    @Override // androidx.compose.ui.text.style.a
    public final /* synthetic */ androidx.compose.ui.text.style.a c(androidx.compose.ui.text.style.a aVar) {
        return TextForegroundStyle$CC.a(this, aVar);
    }

    @Override // androidx.compose.ui.text.style.a
    public final m d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && r.c(this.f92a, ((c) obj).f92a);
    }

    public final int hashCode() {
        int i10 = r.f18134h;
        return m7.j.a(this.f92a);
    }

    @Override // androidx.compose.ui.text.style.a
    public final float n() {
        return r.d(this.f92a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) r.i(this.f92a)) + ')';
    }
}
