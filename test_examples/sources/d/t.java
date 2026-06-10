package d;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.e0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class t {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f10318b = {Context.class, AttributeSet.class};
    public static final int[] c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f10319d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f10320e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f10321f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f10322g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    public static final p.h<String, Constructor<? extends View>> f10323h = new p.h<>();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f10324a = new Object[2];

    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: i  reason: collision with root package name */
        public final View f10325i;

        /* renamed from: j  reason: collision with root package name */
        public final String f10326j;

        /* renamed from: k  reason: collision with root package name */
        public Method f10327k;

        /* renamed from: l  reason: collision with root package name */
        public Context f10328l;

        public a(View view, String str) {
            this.f10325i = view;
            this.f10326j = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int id;
            String str;
            Method method;
            if (this.f10327k == null) {
                View view2 = this.f10325i;
                Context context = view2.getContext();
                while (true) {
                    String str2 = this.f10326j;
                    if (context != null) {
                        try {
                            if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                                this.f10327k = method;
                                this.f10328l = context;
                                break;
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                        if (context instanceof ContextWrapper) {
                            context = ((ContextWrapper) context).getBaseContext();
                        } else {
                            context = null;
                        }
                    } else {
                        if (view2.getId() == -1) {
                            str = "";
                        } else {
                            str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                        }
                        StringBuilder p10 = a4.b.p("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                        p10.append(view2.getClass());
                        p10.append(str);
                        throw new IllegalStateException(p10.toString());
                    }
                }
            }
            try {
                this.f10327k.invoke(this.f10328l, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    public androidx.appcompat.widget.d a(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d(context, attributeSet);
    }

    public androidx.appcompat.widget.f b(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f(context, attributeSet);
    }

    public androidx.appcompat.widget.g c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g(context, attributeSet);
    }

    public androidx.appcompat.widget.u d(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.u(context, attributeSet);
    }

    public e0 e(Context context, AttributeSet attributeSet) {
        return new e0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        p.h<String, Constructor<? extends View>> hVar = f10323h;
        Constructor<? extends View> orDefault = hVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            orDefault = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f10318b);
            hVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f10324a);
    }
}
