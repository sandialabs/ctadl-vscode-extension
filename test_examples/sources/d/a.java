package d;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0102a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f10201a;

        public C0102a() {
            super(-2, -2);
            this.f10201a = 8388627;
        }

        public C0102a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10201a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.f37l);
            this.f10201a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0102a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10201a = 0;
        }

        public C0102a(C0102a c0102a) {
            super((ViewGroup.MarginLayoutParams) c0102a);
            this.f10201a = 0;
            this.f10201a = c0102a.f10201a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }
}
