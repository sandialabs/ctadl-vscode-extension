package r2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f17055a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable.ConstantState f17056b;
    public ColorStateList c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f17057d;

    public f(f fVar) {
        this.c = null;
        this.f17057d = d.f17048o;
        if (fVar != null) {
            this.f17055a = fVar.f17055a;
            this.f17056b = fVar.f17056b;
            this.c = fVar.c;
            this.f17057d = fVar.f17057d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i10 = this.f17055a;
        Drawable.ConstantState constantState = this.f17056b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
