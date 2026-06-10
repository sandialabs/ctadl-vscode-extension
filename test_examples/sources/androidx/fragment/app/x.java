package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class x implements LayoutInflater.Factory2 {

    /* renamed from: i  reason: collision with root package name */
    public final z f5266i;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ f0 f5267i;

        public a(f0 f0Var) {
            this.f5267i = f0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            f0 f0Var = this.f5267i;
            Fragment fragment = f0Var.c;
            f0Var.k();
            SpecialEffectsController.f((ViewGroup) fragment.M.getParent(), x.this.f5266i.I()).e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public x(z zVar) {
        this.f5266i = zVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
        r0 = r1.D(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013f  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        f0 g10;
        StringBuilder sb;
        String str2;
        View view2;
        int i10;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        z zVar = this.f5266i;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, zVar);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m0.b.f15893f);
        int i11 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z10 = Fragment.class.isAssignableFrom(v.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z10 = false;
            }
            if (z10) {
                if (view != null) {
                    i11 = view.getId();
                }
                if (i11 == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                if (fragment == null && string != null) {
                    fragment = zVar.E(string);
                }
                if (fragment == null && i11 != -1) {
                    fragment = zVar.D(i11);
                }
                if (fragment == null) {
                    v H = zVar.H();
                    context.getClassLoader();
                    fragment = H.a(attributeValue);
                    fragment.f5047u = true;
                    if (resourceId != 0) {
                        i10 = resourceId;
                    } else {
                        i10 = i11;
                    }
                    fragment.D = i10;
                    fragment.E = i11;
                    fragment.F = string;
                    fragment.f5048v = true;
                    fragment.f5052z = zVar;
                    w<?> wVar = zVar.f5286p;
                    fragment.A = wVar;
                    fragment.B(wVar.f5263j, attributeSet, fragment.f5037j);
                    g10 = zVar.a(fragment);
                    if (z.K(2)) {
                        sb = new StringBuilder("Fragment ");
                        sb.append(fragment);
                        str2 = " has been inflated via the <fragment> tag: id=0x";
                        sb.append(str2);
                        sb.append(Integer.toHexString(resourceId));
                        Log.v("FragmentManager", sb.toString());
                    }
                    fragment.L = (ViewGroup) view;
                    g10.k();
                    g10.j();
                    view2 = fragment.M;
                    if (view2 == null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (fragment.M.getTag() == null) {
                            fragment.M.setTag(string);
                        }
                        fragment.M.addOnAttachStateChangeListener(new a(g10));
                        return fragment.M;
                    }
                    throw new IllegalStateException(a4.b.m("Fragment ", attributeValue, " did not create a view."));
                } else if (!fragment.f5048v) {
                    fragment.f5048v = true;
                    fragment.f5052z = zVar;
                    w<?> wVar2 = zVar.f5286p;
                    fragment.A = wVar2;
                    fragment.B(wVar2.f5263j, attributeSet, fragment.f5037j);
                    g10 = zVar.g(fragment);
                    if (z.K(2)) {
                        sb = new StringBuilder("Retained Fragment ");
                        sb.append(fragment);
                        str2 = " has been re-attached via the <fragment> tag: id=0x";
                        sb.append(str2);
                        sb.append(Integer.toHexString(resourceId));
                        Log.v("FragmentManager", sb.toString());
                    }
                    fragment.L = (ViewGroup) view;
                    g10.k();
                    g10.j();
                    view2 = fragment.M;
                    if (view2 == null) {
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i11) + " with another fragment for " + attributeValue);
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
