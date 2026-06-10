package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* loaded from: classes.dex */
public final class c implements s {

    /* renamed from: a  reason: collision with root package name */
    public final s f5806a;

    /* renamed from: b  reason: collision with root package name */
    public int f5807b = 0;
    public int c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f5808d = -1;

    /* renamed from: e  reason: collision with root package name */
    public Object f5809e = null;

    public c(s sVar) {
        this.f5806a = sVar;
    }

    @Override // androidx.recyclerview.widget.s
    public final void a(int i10, int i11) {
        int i12;
        if (this.f5807b == 2 && (i12 = this.c) >= i10 && i12 <= i10 + i11) {
            this.f5808d += i11;
            this.c = i10;
            return;
        }
        e();
        this.c = i10;
        this.f5808d = i11;
        this.f5807b = 2;
    }

    @Override // androidx.recyclerview.widget.s
    public final void b(int i10, int i11) {
        e();
        this.f5806a.b(i10, i11);
    }

    @Override // androidx.recyclerview.widget.s
    public final void c(int i10, int i11) {
        int i12;
        if (this.f5807b == 1 && i10 >= (i12 = this.c)) {
            int i13 = this.f5808d;
            if (i10 <= i12 + i13) {
                this.f5808d = i13 + i11;
                this.c = Math.min(i10, i12);
                return;
            }
        }
        e();
        this.c = i10;
        this.f5808d = i11;
        this.f5807b = 1;
    }

    @Override // androidx.recyclerview.widget.s
    @SuppressLint({"UnknownNullness"})
    public final void d(int i10, int i11, Object obj) {
        int i12;
        if (this.f5807b == 3) {
            int i13 = this.c;
            int i14 = this.f5808d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f5809e == obj) {
                this.c = Math.min(i10, i13);
                this.f5808d = Math.max(i14 + i13, i12) - this.c;
                return;
            }
        }
        e();
        this.c = i10;
        this.f5808d = i11;
        this.f5809e = obj;
        this.f5807b = 3;
    }

    public final void e() {
        int i10 = this.f5807b;
        if (i10 == 0) {
            return;
        }
        s sVar = this.f5806a;
        if (i10 == 1) {
            sVar.c(this.c, this.f5808d);
        } else if (i10 == 2) {
            sVar.a(this.c, this.f5808d);
        } else if (i10 == 3) {
            sVar.d(this.c, this.f5808d, this.f5809e);
        }
        this.f5809e = null;
        this.f5807b = 0;
    }
}
