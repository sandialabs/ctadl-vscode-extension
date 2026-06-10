package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import l8.s;
import l8.u;
import u7.l;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class JvmBuiltInClassDescriptorFactory$1 extends Lambda implements l<s, i8.a> {

    /* renamed from: j  reason: collision with root package name */
    public static final JvmBuiltInClassDescriptorFactory$1 f13384j = new JvmBuiltInClassDescriptorFactory$1();

    public JvmBuiltInClassDescriptorFactory$1() {
        super(1);
    }

    @Override // u7.l
    public final i8.a U(s sVar) {
        s sVar2 = sVar;
        g.f(sVar2, "module");
        List<u> d02 = sVar2.t0(a.f13414f).d0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d02) {
            if (obj instanceof i8.a) {
                arrayList.add(obj);
            }
        }
        return (i8.a) kotlin.collections.c.n2(arrayList);
    }
}
