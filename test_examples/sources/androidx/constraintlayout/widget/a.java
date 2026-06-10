package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a extends View {

    /* renamed from: i  reason: collision with root package name */
    public int[] f4469i;

    /* renamed from: j  reason: collision with root package name */
    public int f4470j;

    /* renamed from: k  reason: collision with root package name */
    public final Context f4471k;

    /* renamed from: l  reason: collision with root package name */
    public f2.b f4472l;

    /* renamed from: m  reason: collision with root package name */
    public String f4473m;
    public String n;

    /* renamed from: o  reason: collision with root package name */
    public View[] f4474o;

    /* renamed from: p  reason: collision with root package name */
    public final HashMap<Integer, String> f4475p;

    public a(Context context) {
        super(context);
        this.f4469i = new int[32];
        this.f4474o = null;
        this.f4475p = new HashMap<>();
        this.f4471k = context;
        i(null);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4469i = new int[32];
        this.f4474o = null;
        this.f4475p = new HashMap<>();
        this.f4471k = context;
        i(attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(String str) {
        Context context;
        ConstraintLayout constraintLayout;
        int i10;
        Integer num;
        HashMap<String, Integer> hashMap;
        if (str == null || str.length() == 0 || (context = this.f4471k) == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) getParent();
        }
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        if (isInEditMode() && constraintLayout != null) {
            if ((trim instanceof String) && (hashMap = constraintLayout.f4418u) != null && hashMap.containsKey(trim)) {
                num = constraintLayout.f4418u.get(trim);
            } else {
                num = null;
            }
            if (num instanceof Integer) {
                i10 = num.intValue();
                if (i10 == 0 && constraintLayout != null) {
                    i10 = h(constraintLayout, trim);
                }
                if (i10 == 0) {
                    try {
                        i10 = i2.c.class.getField(trim).getInt(null);
                    } catch (Exception unused) {
                    }
                }
                if (i10 == 0) {
                    i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
                }
                if (i10 == 0) {
                    this.f4475p.put(Integer.valueOf(i10), trim);
                    d(i10);
                    return;
                }
                Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
                return;
            }
        }
        i10 = 0;
        if (i10 == 0) {
            i10 = h(constraintLayout, trim);
        }
        if (i10 == 0) {
        }
        if (i10 == 0) {
        }
        if (i10 == 0) {
        }
    }

    public final void d(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f4470j + 1;
        int[] iArr = this.f4469i;
        if (i11 > iArr.length) {
            this.f4469i = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f4469i;
        int i12 = this.f4470j;
        iArr2[i12] = i10;
        this.f4470j = i12 + 1;
    }

    public final void e(String str) {
        if (str == null || str.length() == 0 || this.f4471k == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.a) && trim.equals(((ConstraintLayout.a) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    d(childAt.getId());
                }
            }
        }
    }

    public final void f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f4470j; i10++) {
            View view = constraintLayout.f4407i.get(this.f4469i[i10]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f4469i, this.f4470j);
    }

    public final int h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f4471k.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a1.c.f77o);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f4473m = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.n = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void j(ConstraintWidget constraintWidget, boolean z10) {
    }

    public final void k() {
        if (this.f4472l == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).f4451q0 = this.f4472l;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f4473m;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.n;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f4473m = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f4470j = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                c(str.substring(i10));
                return;
            } else {
                c(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.n = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f4470j = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                e(str.substring(i10));
                return;
            } else {
                e(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f4473m = null;
        this.f4470j = 0;
        for (int i10 : iArr) {
            d(i10);
        }
    }

    @Override // android.view.View
    public final void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f4473m == null) {
            d(i10);
        }
    }
}
