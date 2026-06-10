package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b9.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import l8.i0;
import n7.l;

/* loaded from: classes.dex */
public final class LazyJavaClassDescriptor$declaredParameters$1 extends Lambda implements u7.a<List<? extends i0>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaClassDescriptor f13738j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor$declaredParameters$1(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(0);
        this.f13738j = lazyJavaClassDescriptor;
    }

    @Override // u7.a
    public final List<? extends i0> k0() {
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f13738j;
        ArrayList<x> typeParameters = lazyJavaClassDescriptor.f13726q.getTypeParameters();
        ArrayList arrayList = new ArrayList(l.Z1(typeParameters, 10));
        for (x xVar : typeParameters) {
            i0 a10 = lazyJavaClassDescriptor.f13728s.f18763b.a(xVar);
            if (a10 != null) {
                arrayList.add(a10);
            } else {
                throw new AssertionError("Parameter " + xVar + " surely belongs to class " + lazyJavaClassDescriptor.f13726q + ", so it must be resolved");
            }
        }
        return arrayList;
    }
}
