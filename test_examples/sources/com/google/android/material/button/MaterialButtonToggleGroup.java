package com.google.android.material.button;

import a3.j0;
import a3.m;
import a3.v0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import b3.g;
import b6.k;
import com.google.android.material.button.MaterialButton;
import com.noto.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import u5.j;
import u5.n;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f6949s = 0;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f6950i;

    /* renamed from: j  reason: collision with root package name */
    public final e f6951j;

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashSet<d> f6952k;

    /* renamed from: l  reason: collision with root package name */
    public final a f6953l;

    /* renamed from: m  reason: collision with root package name */
    public Integer[] f6954m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f6955o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6956p;

    /* renamed from: q  reason: collision with root package name */
    public final int f6957q;

    /* renamed from: r  reason: collision with root package name */
    public HashSet f6958r;

    /* loaded from: classes.dex */
    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (compareTo == 0) {
                int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
                if (compareTo2 == 0) {
                    MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
                    return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
                }
                return compareTo2;
            }
            return compareTo;
        }
    }

    /* loaded from: classes.dex */
    public class b extends a3.a {
        public b() {
        }

        @Override // a3.a
        public final void d(View view, g gVar) {
            int i10;
            this.f108a.onInitializeAccessibilityNodeInfo(view, gVar.f6357a);
            int i11 = MaterialButtonToggleGroup.f6949s;
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            materialButtonToggleGroup.getClass();
            if (view instanceof MaterialButton) {
                i10 = 0;
                for (int i12 = 0; i12 < materialButtonToggleGroup.getChildCount(); i12++) {
                    if (materialButtonToggleGroup.getChildAt(i12) == view) {
                        break;
                    }
                    if ((materialButtonToggleGroup.getChildAt(i12) instanceof MaterialButton) && materialButtonToggleGroup.d(i12)) {
                        i10++;
                    }
                }
            }
            i10 = -1;
            gVar.k(g.c.a(0, 1, i10, 1, ((MaterialButton) view).isChecked()));
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: e  reason: collision with root package name */
        public static final b6.a f6961e = new b6.a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        public final b6.c f6962a;

        /* renamed from: b  reason: collision with root package name */
        public final b6.c f6963b;
        public final b6.c c;

        /* renamed from: d  reason: collision with root package name */
        public final b6.c f6964d;

        public c(b6.c cVar, b6.c cVar2, b6.c cVar3, b6.c cVar4) {
            this.f6962a = cVar;
            this.f6963b = cVar3;
            this.c = cVar4;
            this.f6964d = cVar2;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    /* loaded from: classes.dex */
    public class e implements MaterialButton.b {
        public e() {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(i6.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2132083767), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f6950i = new ArrayList();
        this.f6951j = new e();
        this.f6952k = new LinkedHashSet<>();
        this.f6953l = new a();
        this.n = false;
        this.f6958r = new HashSet();
        TypedArray d5 = j.d(getContext(), attributeSet, a1.b.f24e0, R.attr.materialButtonToggleGroupStyle, 2132083767, new int[0]);
        setSingleSelection(d5.getBoolean(3, false));
        this.f6957q = d5.getResourceId(1, -1);
        this.f6956p = d5.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(d5.getBoolean(0, true));
        d5.recycle();
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        j0.d.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (d(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && d(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            materialButton.setId(j0.e.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f6951j);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton c10 = c(i10);
            int min = Math.min(c10.getStrokeWidth(), c(i10 - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams2 = c10.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                m.g(layoutParams, 0);
                m.h(layoutParams, -min);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = -min;
                m.h(layoutParams, 0);
            }
            c10.setLayoutParams(layoutParams);
        }
        if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
                return;
            }
            m.g(layoutParams3, 0);
            m.h(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f6950i.add(new c(shapeAppearanceModel.f6436e, shapeAppearanceModel.f6439h, shapeAppearanceModel.f6437f, shapeAppearanceModel.f6438g));
        materialButton.setEnabled(isEnabled());
        j0.p(materialButton, new b());
    }

    public final void b(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f6958r);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f6955o && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
            return;
        } else {
            if (!this.f6956p || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        e(hashSet);
    }

    public final MaterialButton c(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    public final boolean d(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f6953l);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(c(i10), Integer.valueOf(i10));
        }
        this.f6954m = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(Set<Integer> set) {
        HashSet hashSet = this.f6958r;
        this.f6958r = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = c(i10).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.n = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.n = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator<d> it = this.f6952k.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
        invalidate();
    }

    public final void f() {
        boolean z10;
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton c10 = c(i10);
            if (c10.getVisibility() != 8) {
                k shapeAppearanceModel = c10.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                k.a aVar = new k.a(shapeAppearanceModel);
                c cVar2 = (c) this.f6950i.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b6.a aVar2 = c.f6961e;
                    if (i10 == firstVisibleChildIndex) {
                        if (z10) {
                            if (n.e(this)) {
                                cVar = new c(aVar2, aVar2, cVar2.f6963b, cVar2.c);
                            } else {
                                cVar = new c(cVar2.f6962a, cVar2.f6964d, aVar2, aVar2);
                            }
                        } else {
                            cVar = new c(cVar2.f6962a, aVar2, cVar2.f6963b, aVar2);
                        }
                    } else if (i10 == lastVisibleChildIndex) {
                        if (z10) {
                            if (n.e(this)) {
                                cVar = new c(cVar2.f6962a, cVar2.f6964d, aVar2, aVar2);
                            } else {
                                cVar = new c(aVar2, aVar2, cVar2.f6963b, cVar2.c);
                            }
                        } else {
                            cVar = new c(aVar2, cVar2.f6964d, aVar2, cVar2.c);
                        }
                    } else {
                        cVar2 = null;
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    aVar.c(0.0f);
                } else {
                    aVar.f6447e = cVar2.f6962a;
                    aVar.f6450h = cVar2.f6964d;
                    aVar.f6448f = cVar2.f6963b;
                    aVar.f6449g = cVar2.c;
                }
                c10.setShapeAppearanceModel(new k(aVar));
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f6955o || this.f6958r.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f6958r.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = c(i10).getId();
            if (this.f6958r.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f6954m;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i11;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f6957q;
        if (i10 != -1) {
            e(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f6955o) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) g.b.a(1, visibleButtonCount, i10).f6374a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        f();
        a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f6950i.remove(indexOfChild);
        }
        f();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            c(i10).setEnabled(z10);
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.f6956p = z10;
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    public void setSingleSelection(boolean z10) {
        if (this.f6955o != z10) {
            this.f6955o = z10;
            e(new HashSet());
        }
    }
}
