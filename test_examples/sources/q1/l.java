package q1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class l implements m {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f16844a;

    /* renamed from: b  reason: collision with root package name */
    public static Constructor<StaticLayout> f16845b;

    @Override // q1.m
    public StaticLayout a(n nVar) {
        v7.g.f(nVar, "params");
        StaticLayout staticLayout = null;
        if (!f16844a) {
            f16844a = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                f16845b = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            } catch (NoSuchMethodException unused) {
                f16845b = null;
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
        }
        Constructor<StaticLayout> constructor = f16845b;
        if (constructor != null) {
            try {
                staticLayout = constructor.newInstance(nVar.f16846a, Integer.valueOf(nVar.f16847b), Integer.valueOf(nVar.c), nVar.f16848d, Integer.valueOf(nVar.f16849e), nVar.f16851g, nVar.f16850f, Float.valueOf(nVar.f16855k), Float.valueOf(nVar.f16856l), Boolean.valueOf(nVar.n), nVar.f16853i, Integer.valueOf(nVar.f16854j), Integer.valueOf(nVar.f16852h));
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
                f16845b = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            }
        }
        if (staticLayout != null) {
            return staticLayout;
        }
        return new StaticLayout(nVar.f16846a, nVar.f16847b, nVar.c, nVar.f16848d, nVar.f16849e, nVar.f16851g, nVar.f16855k, nVar.f16856l, nVar.n, nVar.f16853i, nVar.f16854j);
    }
}
