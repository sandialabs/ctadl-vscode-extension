package com.google.android.material.timepicker;

import a3.j0;
import a3.v0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.j1;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import b6.g;
import b6.i;
import b6.k;
import com.noto.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class c extends ConstraintLayout {
    public g A;

    /* renamed from: y  reason: collision with root package name */
    public final j1 f7499y;

    /* renamed from: z  reason: collision with root package name */
    public int f7500z;

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        g gVar = new g();
        this.A = gVar;
        i iVar = new i(0.5f);
        k kVar = gVar.f6391i.f6409a;
        kVar.getClass();
        k.a aVar = new k.a(kVar);
        aVar.f6447e = iVar;
        aVar.f6448f = iVar;
        aVar.f6449g = iVar;
        aVar.f6450h = iVar;
        gVar.setShapeAppearanceModel(new k(aVar));
        this.A.n(ColorStateList.valueOf(-1));
        g gVar2 = this.A;
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        j0.d.q(this, gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.f45p0, i10, 0);
        this.f7500z = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f7499y = new j1(8, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            view.setId(j0.e.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            j1 j1Var = this.f7499y;
            handler.removeCallbacks(j1Var);
            handler.post(j1Var);
        }
    }

    public void k() {
        int i10;
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.c(this);
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i12 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i12 == null) {
                    i12 = 1;
                }
                if (!hashMap.containsKey(i12)) {
                    hashMap.put(i12, new ArrayList());
                }
                ((List) hashMap.get(i12)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i10 = Math.round(this.f7500z * 0.66f);
            } else {
                i10 = this.f7500z;
            }
            float f10 = 0.0f;
            for (View view : list) {
                int id = view.getId();
                HashMap<Integer, b.a> hashMap2 = bVar.c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new b.a());
                }
                b.C0032b c0032b = hashMap2.get(Integer.valueOf(id)).f4483d;
                c0032b.f4535z = R.id.circle_center;
                c0032b.A = i10;
                c0032b.B = f10;
                f10 += 360.0f / list.size();
            }
        }
        bVar.a(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        k();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            j1 j1Var = this.f7499y;
            handler.removeCallbacks(j1Var);
            handler.post(j1Var);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.A.n(ColorStateList.valueOf(i10));
    }
}
