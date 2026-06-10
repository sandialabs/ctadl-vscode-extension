package q2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p2.d;
import p2.f;
import w2.j;
import w2.n;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final l f16877a;

    /* renamed from: b  reason: collision with root package name */
    public static final p.f<String, Typeface> f16878b;

    /* loaded from: classes.dex */
    public static class a extends ma.i {

        /* renamed from: y  reason: collision with root package name */
        public final f.e f16879y;

        public a(f.e eVar) {
            this.f16879y = eVar;
        }
    }

    static {
        l fVar;
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            fVar = new j();
        } else if (i10 >= 28) {
            fVar = new i();
        } else if (i10 >= 26) {
            fVar = new h();
        } else {
            if (i10 >= 24) {
                Method method = g.c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    fVar = new g();
                }
            }
            fVar = new f();
        }
        f16877a = fVar;
        f16878b = new p.f<>(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
        if (r14 == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, d.b bVar, Resources resources, int i10, String str, int i11, int i12, f.e eVar, boolean z10) {
        Typeface a10;
        Typeface typeface;
        int i13;
        Handler handler;
        if (bVar instanceof d.e) {
            d.e eVar2 = (d.e) bVar;
            String str2 = eVar2.f16723d;
            a10 = null;
            boolean z11 = false;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null && !typeface.equals(create)) {
                    if (typeface == null) {
                        if (eVar != null) {
                            eVar.b(typeface);
                        }
                        return typeface;
                    } else if (z10) {
                        if (eVar2.c == 0) {
                            z11 = true;
                        }
                        if (z10) {
                            i13 = eVar2.f16722b;
                        } else {
                            i13 = -1;
                        }
                        Handler handler2 = new Handler(Looper.getMainLooper());
                        a aVar = new a(eVar);
                        w2.e eVar3 = eVar2.f16721a;
                        w2.c cVar = new w2.c(aVar, handler2);
                        if (z11) {
                            p.f<String, Typeface> fVar = w2.j.f18279a;
                            String str3 = eVar3.f18270e + "-" + i12;
                            Typeface a11 = w2.j.f18279a.a(str3);
                            if (a11 != null) {
                                handler2.post(new w2.a(aVar, a11));
                                a10 = a11;
                            } else if (i13 == -1) {
                                j.a a12 = w2.j.a(str3, context, eVar3, i12);
                                cVar.a(a12);
                                a10 = a12.f18282a;
                            } else {
                                try {
                                    try {
                                        try {
                                            j.a aVar2 = (j.a) w2.j.f18280b.submit(new w2.f(str3, context, eVar3, i12)).get(i13, TimeUnit.MILLISECONDS);
                                            cVar.a(aVar2);
                                            a10 = aVar2.f18282a;
                                        } catch (TimeoutException unused) {
                                            throw new InterruptedException("timeout");
                                        }
                                    } catch (InterruptedException e10) {
                                        throw e10;
                                    } catch (ExecutionException e11) {
                                        throw new RuntimeException(e11);
                                    }
                                } catch (InterruptedException unused2) {
                                    cVar.f18265b.post(new w2.b(cVar.f18264a, -3));
                                }
                            }
                        } else {
                            p.f<String, Typeface> fVar2 = w2.j.f18279a;
                            String str4 = eVar3.f18270e + "-" + i12;
                            Typeface a13 = w2.j.f18279a.a(str4);
                            if (a13 != null) {
                                handler2.post(new w2.a(aVar, a13));
                                a10 = a13;
                            } else {
                                w2.g gVar = new w2.g(cVar);
                                synchronized (w2.j.c) {
                                    p.h<String, ArrayList<z2.a<j.a>>> hVar = w2.j.f18281d;
                                    ArrayList<z2.a<j.a>> orDefault = hVar.getOrDefault(str4, null);
                                    if (orDefault != null) {
                                        orDefault.add(gVar);
                                    } else {
                                        ArrayList<z2.a<j.a>> arrayList = new ArrayList<>();
                                        arrayList.add(gVar);
                                        hVar.put(str4, arrayList);
                                        w2.h hVar2 = new w2.h(str4, context, eVar3, i12);
                                        ThreadPoolExecutor threadPoolExecutor = w2.j.f18280b;
                                        w2.i iVar = new w2.i(str4);
                                        if (Looper.myLooper() == null) {
                                            handler = new Handler(Looper.getMainLooper());
                                        } else {
                                            handler = new Handler();
                                        }
                                        threadPoolExecutor.execute(new n(handler, hVar2, iVar));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            typeface = null;
            if (typeface == null) {
            }
        } else {
            a10 = f16877a.a(context, (d.c) bVar, resources, i12);
            if (eVar != null) {
                if (a10 != null) {
                    eVar.b(a10);
                } else {
                    eVar.a(-3);
                }
            }
        }
        if (a10 != null) {
            f16878b.b(b(resources, i10, str, i11, i12), a10);
        }
        return a10;
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
