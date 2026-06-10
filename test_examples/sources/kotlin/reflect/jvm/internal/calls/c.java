package kotlin.reflect.jvm.internal.calls;

import b8.i;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.calls.b;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import l8.c0;
import l8.f;
import v7.g;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class c<M extends Member> implements kotlin.reflect.jvm.internal.calls.a<M> {

    /* renamed from: a  reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.calls.a<M> f13274a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13275b;
    public final a c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final i f13276a;

        /* renamed from: b  reason: collision with root package name */
        public final Method[] f13277b;
        public final Method c;

        public a(i iVar, Method[] methodArr, Method method) {
            g.f(iVar, "argumentRange");
            this.f13276a = iVar;
            this.f13277b = methodArr;
            this.c = method;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
        if ((r11 instanceof g8.b) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5 A[LOOP:0: B:48:0x00ef->B:50:0x00f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(kotlin.reflect.jvm.internal.calls.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, boolean z10) {
        Method declaredMethod;
        int i10;
        c0 R;
        r rVar;
        f fVar;
        int i11;
        int i12;
        int size;
        a aVar2;
        boolean z11;
        Method method;
        Class L1;
        v vVar;
        g.f(eVar, "descriptor");
        this.f13274a = aVar;
        this.f13275b = z10;
        r k3 = eVar.k();
        g.c(k3);
        Class L12 = a1.c.L1(k3);
        if (L12 != null) {
            try {
                declaredMethod = L12.getDeclaredMethod("box-impl", a1.c.G0(L12, eVar).getReturnType());
                g.e(declaredMethod, "{\n        getDeclaredMet…riptor).returnType)\n    }");
            } catch (NoSuchMethodException unused) {
                throw new KotlinReflectionInternalError("No box method found in inline class: " + L12 + " (calling " + eVar + ')');
            }
        } else {
            declaredMethod = null;
        }
        if (k9.e.a(eVar)) {
            aVar2 = new a(i.f6504l, new Method[0], declaredMethod);
        } else {
            if (!(aVar instanceof b.g.c)) {
                if (!(eVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.c)) {
                    if (eVar.E() != null && !(aVar instanceof g8.b)) {
                        f c = eVar.c();
                        g.e(c, "descriptor.containingDeclaration");
                        if (!k9.e.b(c)) {
                            i10 = 1;
                            ArrayList arrayList = new ArrayList();
                            R = eVar.R();
                            if (R != null) {
                                rVar = R.b();
                            } else {
                                rVar = null;
                            }
                            if (rVar != null) {
                                vVar = rVar;
                            } else {
                                if (eVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.c) {
                                    l8.b P = ((kotlin.reflect.jvm.internal.impl.descriptors.c) eVar).P();
                                    g.e(P, "descriptor.constructedClass");
                                    if (P.m0()) {
                                        fVar = P.c();
                                        g.d(fVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                        vVar = ((l8.b) fVar).r();
                                    }
                                } else {
                                    f c10 = eVar.c();
                                    g.e(c10, "descriptor.containingDeclaration");
                                    if ((c10 instanceof l8.b) && k9.e.b(c10)) {
                                        fVar = c10;
                                        vVar = ((l8.b) fVar).r();
                                    }
                                }
                                List<h> m10 = eVar.m();
                                g.e(m10, "descriptor.valueParameters");
                                for (h hVar : m10) {
                                    arrayList.add(hVar.b());
                                }
                                if (!this.f13275b) {
                                    i11 = (((arrayList.size() + 32) - 1) / 32) + 1;
                                } else {
                                    i11 = 0;
                                }
                                if (!eVar.r0()) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                size = arrayList.size() + i10 + i11 + i12;
                                if (m0.b.i0(this) != size) {
                                    i V1 = a1.c.V1(Math.max(i10, 0), arrayList.size() + i10);
                                    Method[] methodArr = new Method[size];
                                    for (int i13 = 0; i13 < size; i13++) {
                                        int i14 = V1.f6497i;
                                        if (i13 <= V1.f6498j && i14 <= i13) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11 && (L1 = a1.c.L1((r) arrayList.get(i13 - i10))) != null) {
                                            method = a1.c.G0(L1, eVar);
                                        } else {
                                            method = null;
                                        }
                                        methodArr[i13] = method;
                                    }
                                    aVar2 = new a(V1, methodArr, declaredMethod);
                                } else {
                                    throw new KotlinReflectionInternalError("Inconsistent number of parameters in the descriptor and Java reflection object: " + m0.b.i0(this) + " != " + size + "\nCalling: " + eVar + "\nParameter types: " + l() + ")\nDefault: " + this.f13275b);
                                }
                            }
                            arrayList.add(vVar);
                            List<h> m102 = eVar.m();
                            g.e(m102, "descriptor.valueParameters");
                            while (r4.hasNext()) {
                            }
                            if (!this.f13275b) {
                            }
                            if (!eVar.r0()) {
                            }
                            size = arrayList.size() + i10 + i11 + i12;
                            if (m0.b.i0(this) != size) {
                            }
                        }
                    }
                }
                i10 = 0;
                ArrayList arrayList2 = new ArrayList();
                R = eVar.R();
                if (R != null) {
                }
                if (rVar != null) {
                }
                arrayList2.add(vVar);
                List<h> m1022 = eVar.m();
                g.e(m1022, "descriptor.valueParameters");
                while (r4.hasNext()) {
                }
                if (!this.f13275b) {
                }
                if (!eVar.r0()) {
                }
                size = arrayList2.size() + i10 + i11 + i12;
                if (m0.b.i0(this) != size) {
                }
            }
            i10 = -1;
            ArrayList arrayList22 = new ArrayList();
            R = eVar.R();
            if (R != null) {
            }
            if (rVar != null) {
            }
            arrayList22.add(vVar);
            List<h> m10222 = eVar.m();
            g.e(m10222, "descriptor.valueParameters");
            while (r4.hasNext()) {
            }
            if (!this.f13275b) {
            }
            if (!eVar.r0()) {
            }
            size = arrayList22.size() + i10 + i11 + i12;
            if (m0.b.i0(this) != size) {
            }
        }
        this.c = aVar2;
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    public final Object a(Object[] objArr) {
        Object invoke;
        a aVar = this.c;
        i iVar = aVar.f13276a;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        g.e(copyOf, "copyOf(this, size)");
        int i10 = iVar.f6497i;
        int i11 = iVar.f6498j;
        if (i10 <= i11) {
            while (true) {
                Method method = aVar.f13277b[i10];
                Object obj = objArr[i10];
                if (method != null) {
                    if (obj != null) {
                        obj = method.invoke(obj, new Object[0]);
                    } else {
                        Class<?> returnType = method.getReturnType();
                        g.e(returnType, "method.returnType");
                        obj = f8.i.e(returnType);
                    }
                }
                copyOf[i10] = obj;
                if (i10 == i11) {
                    break;
                }
                i10++;
            }
        }
        Object a10 = this.f13274a.a(copyOf);
        Method method2 = aVar.c;
        if (method2 != null && (invoke = method2.invoke(null, a10)) != null) {
            return invoke;
        }
        return a10;
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    public final Type k() {
        return this.f13274a.k();
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    public final List<Type> l() {
        return this.f13274a.l();
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    public final M m() {
        return this.f13274a.m();
    }
}
