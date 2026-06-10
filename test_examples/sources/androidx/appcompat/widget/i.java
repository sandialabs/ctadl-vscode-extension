package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import r2.a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final CheckedTextView f961a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f962b = null;
    public PorterDuff.Mode c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f963d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f964e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f965f;

    public i(CheckedTextView checkedTextView) {
        this.f961a = checkedTextView;
    }

    public final void a() {
        CheckedTextView checkedTextView = this.f961a;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f963d || this.f964e) {
                Drawable mutate = r2.a.g(checkMarkDrawable).mutate();
                if (this.f963d) {
                    a.b.h(mutate, this.f962b);
                }
                if (this.f964e) {
                    a.b.i(mutate, this.c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(mutate);
            }
        }
    }
}
