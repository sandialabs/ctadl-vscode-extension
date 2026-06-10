package y9;

import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;

/* loaded from: classes.dex */
public abstract class v extends m0 implements ba.g, ba.h {
    @Override // y9.m0
    /* renamed from: b1 */
    public abstract v Y0(boolean z10);

    @Override // y9.m0
    /* renamed from: c1 */
    public abstract v a1(kotlin.reflect.jvm.internal.impl.types.l lVar);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<m8.c> it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", DescriptorRenderer.f14594b.p(it.next(), null), "] "};
            for (int i10 = 0; i10 < 3; i10++) {
                sb.append(strArr[i10]);
            }
        }
        sb.append(U0());
        if (!S0().isEmpty()) {
            kotlin.collections.c.s2(S0(), sb, ", ", "<", ">", null, 112);
        }
        if (V0()) {
            sb.append("?");
        }
        String sb2 = sb.toString();
        v7.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
