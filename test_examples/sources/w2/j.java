package w2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final p.f<String, Typeface> f18279a = new p.f<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f18280b;
    public static final Object c;

    /* renamed from: d  reason: collision with root package name */
    public static final p.h<String, ArrayList<z2.a<a>>> f18281d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f18282a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18283b;

        public a(int i10) {
            this.f18282a = null;
            this.f18283b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f18282a = typeface;
            this.f18283b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new m());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f18280b = threadPoolExecutor;
        c = new Object();
        f18281d = new p.h<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a a(String str, Context context, e eVar, int i10) {
        int i11;
        p.f<String, Typeface> fVar = f18279a;
        Typeface a10 = fVar.a(str);
        if (a10 != null) {
            return new a(a10);
        }
        try {
            k a11 = d.a(context, eVar);
            int i12 = 1;
            l[] lVarArr = a11.f18285b;
            int i13 = a11.f18284a;
            if (i13 != 0) {
                if (i13 == 1) {
                    i11 = -2;
                    if (i11 != 0) {
                    }
                } else {
                    i11 = -3;
                    if (i11 != 0) {
                        return new a(i11);
                    }
                    Typeface b5 = q2.e.f16877a.b(context, lVarArr, i10);
                    if (b5 != null) {
                        fVar.b(str, b5);
                        return new a(b5);
                    }
                    return new a(-3);
                }
            } else {
                if (lVarArr != null && lVarArr.length != 0) {
                    i12 = 0;
                    for (l lVar : lVarArr) {
                        int i14 = lVar.f18289e;
                        if (i14 != 0) {
                            if (i14 >= 0) {
                                i11 = i14;
                                if (i11 != 0) {
                                }
                            }
                            i11 = -3;
                            if (i11 != 0) {
                            }
                        }
                    }
                }
                i11 = i12;
                if (i11 != 0) {
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }
}
