package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import ja.f0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ma.i;
import u1.d;
import u1.l;
import u1.p;
import u1.s;
import v7.g;

/* loaded from: classes.dex */
public final class AndroidFontLoader implements p {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4080a;

    public AndroidFontLoader(Context context) {
        this.f4080a = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // u1.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(d dVar, p7.c<? super Typeface> cVar) {
        AndroidFontLoader$awaitLoad$1 androidFontLoader$awaitLoad$1;
        int i10;
        AndroidFontLoader androidFontLoader;
        if (cVar instanceof AndroidFontLoader$awaitLoad$1) {
            androidFontLoader$awaitLoad$1 = (AndroidFontLoader$awaitLoad$1) cVar;
            int i11 = androidFontLoader$awaitLoad$1.f4084p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                androidFontLoader$awaitLoad$1.f4084p = i11 - Integer.MIN_VALUE;
                Object obj = androidFontLoader$awaitLoad$1.n;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = androidFontLoader$awaitLoad$1.f4084p;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            dVar = androidFontLoader$awaitLoad$1.f4082m;
                            androidFontLoader = androidFontLoader$awaitLoad$1.f4081l;
                            m0.b.n1(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        m0.b.n1(obj);
                        return obj;
                    }
                } else {
                    m0.b.n1(obj);
                    boolean z10 = dVar instanceof u1.a;
                    Context context = this.f4080a;
                    if (!z10) {
                        if (dVar instanceof s) {
                            g.e(context, "context");
                            androidFontLoader$awaitLoad$1.f4081l = this;
                            androidFontLoader$awaitLoad$1.f4082m = dVar;
                            androidFontLoader$awaitLoad$1.f4084p = 2;
                            obj = m0.b.I1(androidFontLoader$awaitLoad$1, f0.f12767b, new AndroidFontLoader_androidKt$loadAsync$2((s) dVar, context, null));
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            androidFontLoader = this;
                        } else {
                            throw new IllegalArgumentException("Unknown font type: " + dVar);
                        }
                    } else {
                        ((u1.a) dVar).getClass();
                        g.e(context, "context");
                        androidFontLoader$awaitLoad$1.f4084p = 1;
                        throw null;
                    }
                }
                Typeface typeface = (Typeface) obj;
                l lVar = ((s) dVar).f17764d;
                Context context2 = androidFontLoader.f4080a;
                g.e(context2, "context");
                g.f(lVar, "variationSettings");
                if (Build.VERSION.SDK_INT < 26) {
                    return c.a(typeface, lVar, context2);
                }
                return typeface;
            }
        }
        androidFontLoader$awaitLoad$1 = new AndroidFontLoader$awaitLoad$1(this, cVar);
        Object obj2 = androidFontLoader$awaitLoad$1.n;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = androidFontLoader$awaitLoad$1.f4084p;
        if (i10 == 0) {
        }
        Typeface typeface2 = (Typeface) obj2;
        l lVar2 = ((s) dVar).f17764d;
        Context context22 = androidFontLoader.f4080a;
        g.e(context22, "context");
        g.f(lVar2, "variationSettings");
        if (Build.VERSION.SDK_INT < 26) {
        }
    }

    @Override // u1.p
    public final Typeface b(d dVar) {
        boolean z10;
        boolean z11;
        Object obj;
        Typeface typeface;
        boolean z12 = dVar instanceof u1.a;
        Object obj2 = null;
        Context context = this.f4080a;
        if (!z12) {
            if (!(dVar instanceof s)) {
                return null;
            }
            int b5 = dVar.b();
            boolean z13 = false;
            if (b5 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                g.e(context, "context");
                typeface = m0.b.q(context, (s) dVar);
            } else {
                if (b5 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    try {
                        g.e(context, "context");
                        obj = m0.b.q(context, (s) dVar);
                    } catch (Throwable th) {
                        obj = m0.b.Q(th);
                    }
                    if (!(obj instanceof Result.Failure)) {
                        obj2 = obj;
                    }
                    typeface = (Typeface) obj2;
                } else {
                    if (b5 == 2) {
                        z13 = true;
                    }
                    if (z13) {
                        throw new UnsupportedOperationException("Unsupported Async font load path");
                    }
                    throw new IllegalArgumentException("Unknown loading type " + ((Object) i.V(dVar.b())));
                }
            }
            g.e(context, "context");
            l lVar = ((s) dVar).f17764d;
            g.f(lVar, "variationSettings");
            if (Build.VERSION.SDK_INT >= 26) {
                return c.a(typeface, lVar, context);
            }
            return typeface;
        }
        u1.a aVar = (u1.a) dVar;
        g.e(context, "context");
        throw null;
    }

    @Override // u1.p
    public final void c() {
    }
}
