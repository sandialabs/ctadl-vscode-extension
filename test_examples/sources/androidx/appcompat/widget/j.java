package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import e3.b;
import r2.a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final CompoundButton f966a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f967b = null;
    public PorterDuff.Mode c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f968d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f969e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f970f;

    public j(CompoundButton compoundButton) {
        this.f966a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.f966a;
        Drawable a10 = e3.b.a(compoundButton);
        if (a10 != null) {
            if (this.f968d || this.f969e) {
                Drawable mutate = r2.a.g(a10).mutate();
                if (this.f968d) {
                    a.b.h(mutate, this.f967b);
                }
                if (this.f969e) {
                    a.b.i(mutate, this.c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x001a, B:5:0x0021, B:7:0x0027, B:12:0x0037, B:14:0x003d, B:16:0x0043, B:17:0x004e, B:19:0x0055, B:20:0x005c, B:22:0x0063), top: B:28:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x001a, B:5:0x0021, B:7:0x0027, B:12:0x0037, B:14:0x003d, B:16:0x0043, B:17:0x004e, B:19:0x0055, B:20:0x005c, B:22:0x0063), top: B:28:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(AttributeSet attributeSet, int i10) {
        int i11;
        int i12;
        CompoundButton compoundButton = this.f966a;
        Context context = compoundButton.getContext();
        int[] iArr = a1.b.f58w;
        d1 m10 = d1.m(context, attributeSet, iArr, i10);
        a3.j0.o(compoundButton, compoundButton.getContext(), iArr, attributeSet, m10.f903b, i10, 0);
        boolean z10 = true;
        try {
            if (m10.l(1) && (i12 = m10.i(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(e.a.a(compoundButton.getContext(), i12));
                } catch (Resources.NotFoundException unused) {
                }
                if (!z10 && m10.l(0) && (i11 = m10.i(0, 0)) != 0) {
                    compoundButton.setButtonDrawable(e.a.a(compoundButton.getContext(), i11));
                }
                if (m10.l(2)) {
                    b.a.c(compoundButton, m10.b(2));
                }
                if (m10.l(3)) {
                    b.a.d(compoundButton, j0.d(m10.h(3, -1), null));
                }
            }
            z10 = false;
            if (!z10) {
                compoundButton.setButtonDrawable(e.a.a(compoundButton.getContext(), i11));
            }
            if (m10.l(2)) {
            }
            if (m10.l(3)) {
            }
        } finally {
            m10.n();
        }
    }
}
