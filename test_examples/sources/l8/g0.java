package l8;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;

/* loaded from: classes.dex */
public interface g0 {

    /* loaded from: classes.dex */
    public static final class a implements g0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f15837a = new a();

        @Override // l8.g0
        public final Collection a(AbstractTypeConstructor abstractTypeConstructor, Collection collection, u7.l lVar, u7.l lVar2) {
            v7.g.f(abstractTypeConstructor, "currentTypeConstructor");
            v7.g.f(collection, "superTypes");
            return collection;
        }
    }

    Collection a(AbstractTypeConstructor abstractTypeConstructor, Collection collection, u7.l lVar, u7.l lVar2);
}
