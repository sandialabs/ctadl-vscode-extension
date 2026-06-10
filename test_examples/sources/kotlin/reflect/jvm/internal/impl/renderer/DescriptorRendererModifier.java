package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.c;

/* loaded from: classes.dex */
public enum DescriptorRendererModifier {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);
    

    /* renamed from: j  reason: collision with root package name */
    public static final Set<DescriptorRendererModifier> f14615j;

    /* renamed from: k  reason: collision with root package name */
    public static final Set<DescriptorRendererModifier> f14616k;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f14631i;

    static {
        DescriptorRendererModifier[] values = values();
        ArrayList arrayList = new ArrayList();
        for (DescriptorRendererModifier descriptorRendererModifier : values) {
            if (descriptorRendererModifier.f14631i) {
                arrayList.add(descriptorRendererModifier);
            }
        }
        f14615j = c.Q2(arrayList);
        f14616k = kotlin.collections.b.x2(values());
    }

    DescriptorRendererModifier(boolean z10) {
        this.f14631i = z10;
    }
}
