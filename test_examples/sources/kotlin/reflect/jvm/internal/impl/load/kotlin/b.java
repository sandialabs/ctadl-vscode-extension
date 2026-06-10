package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.h;

/* loaded from: classes.dex */
public final class b implements h.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractBinaryClassAnnotationLoader<Object, AbstractBinaryClassAnnotationLoader.a<Object>> f13929a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList<Object> f13930b;

    public b(AbstractBinaryClassAnnotationLoader<Object, AbstractBinaryClassAnnotationLoader.a<Object>> abstractBinaryClassAnnotationLoader, ArrayList<Object> arrayList) {
        this.f13929a = abstractBinaryClassAnnotationLoader;
        this.f13930b = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.c
    public final void a() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.c
    public final h.a b(h9.b bVar, q8.b bVar2) {
        return this.f13929a.r(bVar, bVar2, this.f13930b);
    }
}
