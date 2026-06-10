package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import h9.e;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m9.g;
import u8.q;

/* loaded from: classes.dex */
public final class LazyJavaAnnotationDescriptor$allValueArguments$2 extends Lambda implements u7.a<Map<e, ? extends g<?>>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaAnnotationDescriptor f13722j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaAnnotationDescriptor$allValueArguments$2(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        super(0);
        this.f13722j = lazyJavaAnnotationDescriptor;
    }

    @Override // u7.a
    public final Map<e, ? extends g<?>> k0() {
        Pair pair;
        LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.f13722j;
        ArrayList<b9.b> a10 = lazyJavaAnnotationDescriptor.f13716b.a();
        ArrayList arrayList = new ArrayList();
        for (b9.b bVar : a10) {
            e name = bVar.getName();
            if (name == null) {
                name = q.f17865b;
            }
            g<?> c = lazyJavaAnnotationDescriptor.c(bVar);
            if (c != null) {
                pair = new Pair(name, c);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return kotlin.collections.d.N1(arrayList);
    }
}
