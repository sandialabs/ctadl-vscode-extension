package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.kotlin.h;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;

/* loaded from: classes.dex */
public final class LazyJavaPackageFragment$partToFacade$2 extends Lambda implements u7.a<HashMap<p9.b, p9.b>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaPackageFragment f13770j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment$partToFacade$2(LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(0);
        this.f13770j = lazyJavaPackageFragment;
    }

    @Override // u7.a
    public final HashMap<p9.b, p9.b> k0() {
        boolean z10;
        String str;
        HashMap<p9.b, p9.b> hashMap = new HashMap<>();
        LazyJavaPackageFragment lazyJavaPackageFragment = this.f13770j;
        lazyJavaPackageFragment.getClass();
        for (Map.Entry entry : ((Map) m0.b.u0(lazyJavaPackageFragment.f13765q, LazyJavaPackageFragment.f13762u[0])).entrySet()) {
            p9.b d5 = p9.b.d((String) entry.getKey());
            KotlinClassHeader a10 = ((h) entry.getValue()).a();
            int ordinal = a10.f13953a.ordinal();
            if (ordinal != 2) {
                if (ordinal == 5) {
                    if (a10.f13953a == KotlinClassHeader.Kind.f13964p) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        str = a10.f13957f;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        hashMap.put(d5, p9.b.d(str));
                    }
                }
            } else {
                hashMap.put(d5, d5);
            }
        }
        return hashMap;
    }
}
