package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import fa.b;
import k8.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import v7.g;

/* loaded from: classes.dex */
public final class c extends b.a<l8.b, JvmBuiltInsCustomizer.JDKMemberStatus> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f13424a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef<JvmBuiltInsCustomizer.JDKMemberStatus> f13425b;

    public c(String str, Ref$ObjectRef<JvmBuiltInsCustomizer.JDKMemberStatus> ref$ObjectRef) {
        this.f13424a = str;
        this.f13425b = ref$ObjectRef;
    }

    @Override // fa.b.c
    public final Object a() {
        JvmBuiltInsCustomizer.JDKMemberStatus jDKMemberStatus = this.f13425b.f13060i;
        return jDKMemberStatus == null ? JvmBuiltInsCustomizer.JDKMemberStatus.NOT_CONSIDERED : jDKMemberStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[ORIG_RETURN, RETURN] */
    @Override // fa.b.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Object obj) {
        T t10;
        l8.b bVar = (l8.b) obj;
        g.f(bVar, "javaClassDescriptor");
        String y12 = a1.c.y1(bVar, this.f13424a);
        boolean contains = f.f12936b.contains(y12);
        Ref$ObjectRef<JvmBuiltInsCustomizer.JDKMemberStatus> ref$ObjectRef = this.f13425b;
        if (contains) {
            t10 = JvmBuiltInsCustomizer.JDKMemberStatus.HIDDEN;
        } else if (f.c.contains(y12)) {
            t10 = JvmBuiltInsCustomizer.JDKMemberStatus.VISIBLE;
        } else {
            if (f.f12935a.contains(y12)) {
                t10 = JvmBuiltInsCustomizer.JDKMemberStatus.DROP;
            }
            if (ref$ObjectRef.f13060i != null) {
                return true;
            }
            return false;
        }
        ref$ObjectRef.f13060i = t10;
        if (ref$ObjectRef.f13060i != null) {
        }
    }
}
