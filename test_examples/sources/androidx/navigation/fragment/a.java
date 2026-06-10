package androidx.navigation.fragment;

import a1.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.fragment.app.z;
import androidx.navigation.n;
import androidx.navigation.t;
import androidx.navigation.x;
import java.util.ArrayDeque;
import java.util.Iterator;

@x.a("fragment")
/* loaded from: classes.dex */
public final class a extends x<C0039a> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5469a;

    /* renamed from: b  reason: collision with root package name */
    public final z f5470b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<Integer> f5471d = new ArrayDeque<>();

    /* renamed from: androidx.navigation.fragment.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0039a extends n {

        /* renamed from: q  reason: collision with root package name */
        public String f5472q;

        public C0039a(x<? extends C0039a> xVar) {
            super(xVar);
        }

        @Override // androidx.navigation.n
        public final void t(Context context, AttributeSet attributeSet) {
            super.t(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, b.f31i);
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.f5472q = string;
            }
            obtainAttributes.recycle();
        }

        @Override // androidx.navigation.n
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.f5472q;
            if (str == null) {
                str = "null";
            }
            sb.append(str);
            return sb.toString();
        }
    }

    public a(Context context, z zVar, int i10) {
        this.f5469a = context;
        this.f5470b = zVar;
        this.c = i10;
    }

    public static String f(int i10, int i11) {
        return i10 + "-" + i11;
    }

    @Override // androidx.navigation.x
    public final C0039a a() {
        return new C0039a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0106  */
    @Override // androidx.navigation.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n b(n nVar, Bundle bundle, t tVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        C0039a c0039a = (C0039a) nVar;
        z zVar = this.f5470b;
        if (zVar.O()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
        } else {
            String str = c0039a.f5472q;
            if (str != null) {
                char charAt = str.charAt(0);
                Context context = this.f5469a;
                if (charAt == '.') {
                    str = context.getPackageName() + str;
                }
                v H = zVar.H();
                context.getClassLoader();
                Fragment a10 = H.a(str);
                a10.W(bundle);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(zVar);
                if (tVar != null) {
                    i10 = tVar.f5532d;
                } else {
                    i10 = -1;
                }
                if (tVar != null) {
                    i11 = tVar.f5533e;
                } else {
                    i11 = -1;
                }
                if (tVar != null) {
                    i12 = tVar.f5534f;
                } else {
                    i12 = -1;
                }
                if (tVar != null) {
                    i13 = tVar.f5535g;
                } else {
                    i13 = -1;
                }
                if (i10 != -1 || i11 != -1 || i12 != -1 || i13 != -1) {
                    if (i10 == -1) {
                        i10 = 0;
                    }
                    if (i11 == -1) {
                        i11 = 0;
                    }
                    if (i12 == -1) {
                        i12 = 0;
                    }
                    if (i13 == -1) {
                        i13 = 0;
                    }
                    aVar.f5165b = i10;
                    aVar.c = i11;
                    aVar.f5166d = i12;
                    aVar.f5167e = i13;
                }
                int i14 = this.c;
                if (i14 != 0) {
                    aVar.e(i14, a10, null, 2);
                    aVar.k(a10);
                    int i15 = c0039a.f5511k;
                    ArrayDeque<Integer> arrayDeque = this.f5471d;
                    boolean isEmpty = arrayDeque.isEmpty();
                    if (tVar != null && !isEmpty && tVar.f5530a && arrayDeque.peekLast().intValue() == i15) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!isEmpty) {
                        if (z10) {
                            if (arrayDeque.size() > 1) {
                                zVar.w(new z.n(f(arrayDeque.size(), arrayDeque.peekLast().intValue()), -1), false);
                                String f10 = f(arrayDeque.size(), i15);
                                if (aVar.f5170h) {
                                    aVar.f5169g = true;
                                    aVar.f5171i = f10;
                                } else {
                                    throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                                }
                            }
                            z11 = false;
                            aVar.f5177p = true;
                            aVar.d(false);
                            if (z11) {
                                arrayDeque.add(Integer.valueOf(i15));
                                return c0039a;
                            }
                        } else {
                            String f11 = f(arrayDeque.size() + 1, i15);
                            if (aVar.f5170h) {
                                aVar.f5169g = true;
                                aVar.f5171i = f11;
                            } else {
                                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                            }
                        }
                    }
                    z11 = true;
                    aVar.f5177p = true;
                    aVar.d(false);
                    if (z11) {
                    }
                } else {
                    throw new IllegalArgumentException("Must use non-zero containerViewId");
                }
            } else {
                throw new IllegalStateException("Fragment class was not set");
            }
        }
        return null;
    }

    @Override // androidx.navigation.x
    public final void c(Bundle bundle) {
        int[] intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds");
        if (intArray != null) {
            ArrayDeque<Integer> arrayDeque = this.f5471d;
            arrayDeque.clear();
            for (int i10 : intArray) {
                arrayDeque.add(Integer.valueOf(i10));
            }
        }
    }

    @Override // androidx.navigation.x
    public final Bundle d() {
        Bundle bundle = new Bundle();
        ArrayDeque<Integer> arrayDeque = this.f5471d;
        int[] iArr = new int[arrayDeque.size()];
        Iterator<Integer> it = arrayDeque.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    @Override // androidx.navigation.x
    public final boolean e() {
        ArrayDeque<Integer> arrayDeque = this.f5471d;
        if (arrayDeque.isEmpty()) {
            return false;
        }
        z zVar = this.f5470b;
        if (zVar.O()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        zVar.w(new z.n(f(arrayDeque.size(), arrayDeque.peekLast().intValue()), -1), false);
        arrayDeque.removeLast();
        return true;
    }
}
