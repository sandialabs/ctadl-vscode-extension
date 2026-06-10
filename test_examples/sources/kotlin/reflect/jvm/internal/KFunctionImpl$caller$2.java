package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import g9.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.b;
import n7.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001 \u0002*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/a;", "Ljava/lang/reflect/Executable;", "kotlin.jvm.PlatformType", "invoke", "()Lkotlin/reflect/jvm/internal/calls/a;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class KFunctionImpl$caller$2 extends Lambda implements u7.a<kotlin.reflect.jvm.internal.calls.a<? extends Executable>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KFunctionImpl f13157j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KFunctionImpl$caller$2(KFunctionImpl kFunctionImpl) {
        super(0);
        this.f13157j = kFunctionImpl;
    }

    @Override // u7.a
    public final kotlin.reflect.jvm.internal.calls.a<? extends Executable> k0() {
        Object obj;
        kotlin.reflect.jvm.internal.calls.b fVar;
        kotlin.reflect.jvm.internal.calls.b bVar;
        h9.b bVar2 = i.f13291a;
        KFunctionImpl kFunctionImpl = this.f13157j;
        JvmFunctionSignature c = i.c(kFunctionImpl.d());
        boolean z10 = c instanceof JvmFunctionSignature.b;
        AnnotationConstructorCaller.CallMode callMode = AnnotationConstructorCaller.CallMode.POSITIONAL_CALL;
        KDeclarationContainerImpl kDeclarationContainerImpl = kFunctionImpl.f13153j;
        if (z10) {
            if (kFunctionImpl.e()) {
                Class<?> e10 = kDeclarationContainerImpl.e();
                ArrayList<KParameter> k02 = kFunctionImpl.f13093i.k0();
                v7.g.e(k02, "_parameters()");
                ArrayList<KParameter> arrayList = k02;
                ArrayList arrayList2 = new ArrayList(l.Z1(arrayList, 10));
                for (KParameter kParameter : arrayList) {
                    String name = kParameter.getName();
                    v7.g.c(name);
                    arrayList2.add(name);
                }
                return new AnnotationConstructorCaller(e10, arrayList2, callMode);
            }
            String str = ((JvmFunctionSignature.b) c).f13089a.f11273b;
            kDeclarationContainerImpl.getClass();
            v7.g.f(str, "desc");
            Class<?> e11 = kDeclarationContainerImpl.e();
            try {
                Class[] clsArr = (Class[]) kDeclarationContainerImpl.n(str).toArray(new Class[0]);
                obj = e11.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                obj = null;
            }
        } else if (c instanceof JvmFunctionSignature.c) {
            d.b bVar3 = ((JvmFunctionSignature.c) c).f13091a;
            obj = kDeclarationContainerImpl.g(bVar3.f11272a, bVar3.f11273b);
        } else if (c instanceof JvmFunctionSignature.a) {
            obj = ((JvmFunctionSignature.a) c).f13088a;
        } else if (c instanceof JvmFunctionSignature.JavaConstructor) {
            obj = ((JvmFunctionSignature.JavaConstructor) c).f13086a;
        } else if (c instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor) {
            Class<?> e12 = kDeclarationContainerImpl.e();
            List<Method> list = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) c).f13084a;
            ArrayList arrayList3 = new ArrayList(l.Z1(list, 10));
            for (Method method : list) {
                arrayList3.add(method.getName());
            }
            return new AnnotationConstructorCaller(e12, arrayList3, callMode, AnnotationConstructorCaller.Origin.JAVA, list);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (obj instanceof Constructor) {
            bVar = KFunctionImpl.g(kFunctionImpl, (Constructor) obj, kFunctionImpl.d(), false);
        } else if (obj instanceof Method) {
            Method method2 = (Method) obj;
            boolean isStatic = Modifier.isStatic(method2.getModifiers());
            Object obj2 = kFunctionImpl.f13155l;
            if (!isStatic) {
                if (kFunctionImpl.f()) {
                    fVar = new b.g.a(method2, a1.c.e0(obj2, kFunctionImpl.d()));
                } else {
                    fVar = new b.g.d(method2);
                }
            } else if (kFunctionImpl.d().getAnnotations().j(f8.i.f10969a) != null) {
                if (kFunctionImpl.f()) {
                    fVar = new b.g.C0147b(method2);
                } else {
                    fVar = new b.g.e(method2);
                }
            } else if (kFunctionImpl.f()) {
                fVar = new b.g.c(method2, a1.c.e0(obj2, kFunctionImpl.d()));
            } else {
                fVar = new b.g.f(method2);
            }
            bVar = fVar;
        } else {
            throw new KotlinReflectionInternalError("Could not compute caller for function: " + kFunctionImpl.d() + " (member = " + obj + ')');
        }
        return a1.c.r0(bVar, kFunctionImpl.d(), false);
    }
}
