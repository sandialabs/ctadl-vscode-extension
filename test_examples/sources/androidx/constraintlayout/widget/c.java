package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c extends ViewGroup {

    /* renamed from: i  reason: collision with root package name */
    public b f4560i;

    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.a {
        public final float A0;
        public final float B0;
        public final float C0;
        public final float D0;

        /* renamed from: r0  reason: collision with root package name */
        public final float f4561r0;

        /* renamed from: s0  reason: collision with root package name */
        public final boolean f4562s0;

        /* renamed from: t0  reason: collision with root package name */
        public final float f4563t0;

        /* renamed from: u0  reason: collision with root package name */
        public final float f4564u0;

        /* renamed from: v0  reason: collision with root package name */
        public final float f4565v0;

        /* renamed from: w0  reason: collision with root package name */
        public final float f4566w0;

        /* renamed from: x0  reason: collision with root package name */
        public final float f4567x0;

        /* renamed from: y0  reason: collision with root package name */
        public final float f4568y0;

        /* renamed from: z0  reason: collision with root package name */
        public final float f4569z0;

        public a() {
            this.f4561r0 = 1.0f;
            this.f4562s0 = false;
            this.f4563t0 = 0.0f;
            this.f4564u0 = 0.0f;
            this.f4565v0 = 0.0f;
            this.f4566w0 = 0.0f;
            this.f4567x0 = 1.0f;
            this.f4568y0 = 1.0f;
            this.f4569z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4561r0 = 1.0f;
            this.f4562s0 = false;
            this.f4563t0 = 0.0f;
            this.f4564u0 = 0.0f;
            this.f4565v0 = 0.0f;
            this.f4566w0 = 0.0f;
            this.f4567x0 = 1.0f;
            this.f4568y0 = 1.0f;
            this.f4569z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.c.f79q);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 15) {
                    this.f4561r0 = obtainStyledAttributes.getFloat(index, this.f4561r0);
                } else if (index == 28) {
                    this.f4563t0 = obtainStyledAttributes.getFloat(index, this.f4563t0);
                    this.f4562s0 = true;
                } else if (index == 23) {
                    this.f4565v0 = obtainStyledAttributes.getFloat(index, this.f4565v0);
                } else if (index == 24) {
                    this.f4566w0 = obtainStyledAttributes.getFloat(index, this.f4566w0);
                } else if (index == 22) {
                    this.f4564u0 = obtainStyledAttributes.getFloat(index, this.f4564u0);
                } else if (index == 20) {
                    this.f4567x0 = obtainStyledAttributes.getFloat(index, this.f4567x0);
                } else if (index == 21) {
                    this.f4568y0 = obtainStyledAttributes.getFloat(index, this.f4568y0);
                } else if (index == 16) {
                    this.f4569z0 = obtainStyledAttributes.getFloat(index, this.f4569z0);
                } else if (index == 17) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == 18) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == 19) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == 27) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    public b getConstraintSet() {
        if (this.f4560i == null) {
            this.f4560i = new b();
        }
        b bVar = this.f4560i;
        bVar.getClass();
        int childCount = getChildCount();
        HashMap<Integer, b.a> hashMap = bVar.c;
        hashMap.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            a aVar = (a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (bVar.f4480b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new b.a());
            }
            b.a aVar2 = hashMap.get(Integer.valueOf(id));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar3 = (androidx.constraintlayout.widget.a) childAt;
                    aVar2.c(id, aVar);
                    if (aVar3 instanceof Barrier) {
                        b.C0032b c0032b = aVar2.f4483d;
                        c0032b.f4511h0 = 1;
                        Barrier barrier = (Barrier) aVar3;
                        c0032b.f4507f0 = barrier.getType();
                        c0032b.f4513i0 = barrier.getReferencedIds();
                        c0032b.f4509g0 = barrier.getMargin();
                    }
                }
                aVar2.c(id, aVar);
            }
        }
        return this.f4560i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
