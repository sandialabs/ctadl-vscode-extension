package e5;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final p.h<String, h> f10657a = new p.h<>();

    /* renamed from: b  reason: collision with root package name */
    public final p.h<String, PropertyValuesHolder[]> f10658b = new p.h<>();

    public static g a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static g b(Context context, int i10) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return c(arrayList);
            }
            return null;
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    public static g c(ArrayList arrayList) {
        g gVar = new g();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                gVar.f10658b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = a.c;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = a.f10649d;
                    }
                    h hVar = new h(startDelay, duration, interpolator);
                    hVar.f10661d = objectAnimator.getRepeatCount();
                    hVar.f10662e = objectAnimator.getRepeatMode();
                    gVar.f10657a.put(propertyName, hVar);
                }
                interpolator = a.f10648b;
                h hVar2 = new h(startDelay, duration, interpolator);
                hVar2.f10661d = objectAnimator.getRepeatCount();
                hVar2.f10662e = objectAnimator.getRepeatMode();
                gVar.f10657a.put(propertyName, hVar2);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return gVar;
    }

    public final h d(String str) {
        boolean z10;
        p.h<String, h> hVar = this.f10657a;
        if (hVar.getOrDefault(str, null) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return hVar.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f10657a.equals(((g) obj).f10657a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10657a.hashCode();
    }

    public final String toString() {
        return "\n" + g.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f10657a + "}\n";
    }
}
