package kotlin.reflect.jvm.internal.impl.renderer;

import a1.c;
import ha.i;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import m7.n;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class DescriptorRendererImpl$functionTypeAnnotationsRenderer$2 extends Lambda implements u7.a<DescriptorRendererImpl> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DescriptorRendererImpl f14609j;

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements l<b, n> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass1 f14610j = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // u7.l
        public final n U(b bVar) {
            b bVar2 = bVar;
            g.f(bVar2, "$this$withOptions");
            bVar2.k(n7.l.c2(bVar2.i(), c.O0(g.a.f13373p, g.a.f13374q)));
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorRendererImpl$functionTypeAnnotationsRenderer$2(DescriptorRendererImpl descriptorRendererImpl) {
        super(0);
        this.f14609j = descriptorRendererImpl;
    }

    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // u7.a
    public final DescriptorRendererImpl k0() {
        y7.a aVar;
        boolean z10;
        AnonymousClass1 anonymousClass1 = AnonymousClass1.f14610j;
        DescriptorRendererImpl descriptorRendererImpl = this.f14609j;
        descriptorRendererImpl.getClass();
        v7.g.f(anonymousClass1, "changeOptions");
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.c;
        descriptorRendererOptionsImpl.getClass();
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl2 = new DescriptorRendererOptionsImpl();
        Field[] declaredFields = DescriptorRendererOptionsImpl.class.getDeclaredFields();
        v7.g.e(declaredFields, "this::class.java.declaredFields");
        int length = declaredFields.length;
        ?? r72 = 0;
        int i10 = 0;
        while (i10 < length) {
            Field field = declaredFields[i10];
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(descriptorRendererOptionsImpl);
                if (obj instanceof y7.a) {
                    aVar = (y7.a) obj;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    String name = field.getName();
                    v7.g.e(name, "field.name");
                    i.X0(name, "is", r72);
                    c8.b a10 = v7.i.a(DescriptorRendererOptionsImpl.class);
                    String name2 = field.getName();
                    StringBuilder sb = new StringBuilder("get");
                    String name3 = field.getName();
                    v7.g.e(name3, "field.name");
                    if (name3.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        char upperCase = Character.toUpperCase(name3.charAt(r72));
                        String substring = name3.substring(1);
                        v7.g.e(substring, "this as java.lang.String).substring(startIndex)");
                        name3 = upperCase + substring;
                    }
                    sb.append(name3);
                    new PropertyReference1Impl(a10, name2, sb.toString());
                    field.set(descriptorRendererOptionsImpl2, new j9.a(aVar.f18935a, descriptorRendererOptionsImpl2));
                }
            }
            i10++;
            r72 = 0;
        }
        anonymousClass1.U(descriptorRendererOptionsImpl2);
        descriptorRendererOptionsImpl2.f14632a = true;
        return new DescriptorRendererImpl(descriptorRendererOptionsImpl2);
    }
}
