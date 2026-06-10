package f;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import f.b;

/* loaded from: classes.dex */
public class d extends b {

    /* renamed from: v  reason: collision with root package name */
    public a f10732v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f10733w;

    /* loaded from: classes.dex */
    public static class a extends b.c {
        public int[][] H;

        public a(a aVar, d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.H = aVar.H;
            } else {
                this.H = new int[this.f10712g.length];
            }
        }

        @Override // f.b.c
        public void e() {
            int[][] iArr = this.H;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.H[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.H = iArr2;
        }

        public final int f(int[] iArr) {
            int[][] iArr2 = this.H;
            int i10 = this.f10713h;
            for (int i11 = 0; i11 < i10; i11++) {
                if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new d(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new d(this, resources);
        }
    }

    public d() {
    }

    public d(a aVar, Resources resources) {
        e(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // f.b, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // f.b
    public void e(b.c cVar) {
        this.f10694i = cVar;
        int i10 = this.f10699o;
        if (i10 >= 0) {
            Drawable d5 = cVar.d(i10);
            this.f10696k = d5;
            if (d5 != null) {
                c(d5);
            }
        }
        this.f10697l = null;
        if (cVar instanceof a) {
            this.f10732v = (a) cVar;
        }
    }

    @Override // f.b
    /* renamed from: f */
    public a b() {
        return new a(this.f10732v, this, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // f.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f10733w) {
            super.mutate();
            this.f10732v.e();
            this.f10733w = true;
        }
        return this;
    }

    @Override // f.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int f10 = this.f10732v.f(iArr);
        if (f10 < 0) {
            f10 = this.f10732v.f(StateSet.WILD_CARD);
        }
        if (!d(f10) && !onStateChange) {
            return false;
        }
        return true;
    }
}
