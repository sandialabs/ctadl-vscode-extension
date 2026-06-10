package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import g9.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.b;
import m7.n;
import n7.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/a;", "Ljava/lang/reflect/Executable;", "invoke", "()Lkotlin/reflect/jvm/internal/calls/a;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class KFunctionImpl$defaultCaller$2 extends Lambda implements u7.a<kotlin.reflect.jvm.internal.calls.a<? extends Executable>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KFunctionImpl f13158j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KFunctionImpl$defaultCaller$2(KFunctionImpl kFunctionImpl) {
        super(0);
        this.f13158j = kFunctionImpl;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.reflect.Member, java.lang.Object] */
    @Override // u7.a
    public final kotlin.reflect.jvm.internal.calls.a<? extends Executable> k0() {
        GenericDeclaration declaredConstructor;
        kotlin.reflect.jvm.internal.calls.b bVar;
        kotlin.reflect.jvm.internal.calls.b fVar;
        h9.b bVar2 = i.f13291a;
        KFunctionImpl kFunctionImpl = this.f13158j;
        JvmFunctionSignature c = i.c(kFunctionImpl.d());
        boolean z10 = c instanceof JvmFunctionSignature.c;
        KDeclarationContainerImpl kDeclarationContainerImpl = kFunctionImpl.f13153j;
        kotlin.reflect.jvm.internal.calls.a<? extends Executable> aVar = null;
        if (z10) {
            d.b bVar3 = ((JvmFunctionSignature.c) c).f13091a;
            String str = bVar3.f11272a;
            ?? m10 = kFunctionImpl.b().m();
            v7.g.c(m10);
            boolean z11 = !Modifier.isStatic(m10.getModifiers());
            kDeclarationContainerImpl.getClass();
            v7.g.f(str, "name");
            String str2 = bVar3.f11273b;
            v7.g.f(str2, "desc");
            if (!v7.g.a(str, "<init>")) {
                ArrayList arrayList = new ArrayList();
                if (z11) {
                    arrayList.add(kDeclarationContainerImpl.e());
                }
                kDeclarationContainerImpl.f(arrayList, str2, false);
                declaredConstructor = KDeclarationContainerImpl.o(kDeclarationContainerImpl.l(), str.concat("$default"), (Class[]) arrayList.toArray(new Class[0]), kDeclarationContainerImpl.p(kotlin.text.b.d1(str2, ')', 0, false, 6) + 1, str2.length(), str2), z11);
            } else {
                declaredConstructor = null;
            }
        } else {
            boolean z12 = c instanceof JvmFunctionSignature.b;
            AnnotationConstructorCaller.CallMode callMode = AnnotationConstructorCaller.CallMode.CALL_BY_NAME;
            if (z12) {
                if (kFunctionImpl.e()) {
                    Class<?> e10 = kDeclarationContainerImpl.e();
                    ArrayList<KParameter> k02 = kFunctionImpl.f13093i.k0();
                    v7.g.e(k02, "_parameters()");
                    ArrayList<KParameter> arrayList2 = k02;
                    ArrayList arrayList3 = new ArrayList(l.Z1(arrayList2, 10));
                    for (KParameter kParameter : arrayList2) {
                        String name = kParameter.getName();
                        v7.g.c(name);
                        arrayList3.add(name);
                    }
                    return new AnnotationConstructorCaller(e10, arrayList3, callMode);
                }
                String str3 = ((JvmFunctionSignature.b) c).f13089a.f11273b;
                kDeclarationContainerImpl.getClass();
                v7.g.f(str3, "desc");
                Class<?> e11 = kDeclarationContainerImpl.e();
                ArrayList arrayList4 = new ArrayList();
                kDeclarationContainerImpl.f(arrayList4, str3, true);
                n nVar = n.f16010a;
                try {
                    Class[] clsArr = (Class[]) arrayList4.toArray(new Class[0]);
                    declaredConstructor = e11.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                } catch (NoSuchMethodException unused) {
                }
            } else if (c instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor) {
                Class<?> e12 = kDeclarationContainerImpl.e();
                List<Method> list = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) c).f13084a;
                ArrayList arrayList5 = new ArrayList(l.Z1(list, 10));
                for (Method method : list) {
                    arrayList5.add(method.getName());
                }
                return new AnnotationConstructorCaller(e12, arrayList5, callMode, AnnotationConstructorCaller.Origin.JAVA, list);
            }
            declaredConstructor = null;
        }
        if (declaredConstructor instanceof Constructor) {
            bVar = KFunctionImpl.g(kFunctionImpl, (Constructor) declaredConstructor, kFunctionImpl.d(), true);
        } else if (declaredConstructor instanceof Method) {
            if (kFunctionImpl.d().getAnnotations().j(f8.i.f10969a) != null) {
                l8.f c10 = kFunctionImpl.d().c();
                v7.g.d(c10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                if (!((l8.b) c10).H()) {
                    Method method2 = (Method) declaredConstructor;
                    if (kFunctionImpl.f()) {
                        fVar = new b.g.C0147b(method2);
                    } else {
                        fVar = new b.g.e(method2);
                    }
                    bVar = fVar;
                }
            }
            Method method3 = (Method) declaredConstructor;
            if (kFunctionImpl.f()) {
                fVar = new b.g.c(method3, a1.c.e0(kFunctionImpl.f13155l, kFunctionImpl.d()));
            } else {
                fVar = new b.g.f(method3);
            }
            bVar = fVar;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            aVar = a1.c.r0(bVar, kFunctionImpl.d(), true);
        }
        return aVar;
    }
}
