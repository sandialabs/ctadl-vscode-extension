package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements o {

    /* renamed from: j  reason: collision with root package name */
    public static int f433j;

    /* renamed from: k  reason: collision with root package name */
    public static Field f434k;

    /* renamed from: l  reason: collision with root package name */
    public static Field f435l;

    /* renamed from: m  reason: collision with root package name */
    public static Field f436m;

    /* renamed from: i  reason: collision with root package name */
    public final Activity f437i;

    public ImmLeaksCleaner(Activity activity) {
        this.f437i = activity;
    }

    @Override // androidx.lifecycle.o
    public final void f(q qVar, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (f433j == 0) {
            try {
                f433j = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f435l = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f436m = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f434k = declaredField3;
                declaredField3.setAccessible(true);
                f433j = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f433j == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f437i.getSystemService("input_method");
            try {
                Object obj = f434k.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f435l.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f436m.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } finally {
                        }
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
