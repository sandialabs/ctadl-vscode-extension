package org.koin.core.instance;

import androidx.fragment.app.g0;
import gb.b;
import org.koin.core.definition.BeanDefinition;
import v7.g;

/* loaded from: classes.dex */
public final class SingleInstanceFactory<T> extends b<T> {

    /* renamed from: b  reason: collision with root package name */
    public T f16515b;

    public SingleInstanceFactory(BeanDefinition<T> beanDefinition) {
        super(beanDefinition);
    }

    @Override // gb.b
    public final T a(g0 g0Var) {
        g.f(g0Var, "context");
        T t10 = this.f16515b;
        if (t10 == null) {
            return (T) super.a(g0Var);
        }
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }

    @Override // gb.b
    public final T b(g0 g0Var) {
        SingleInstanceFactory$get$1 singleInstanceFactory$get$1 = new SingleInstanceFactory$get$1(this, g0Var);
        synchronized (this) {
            singleInstanceFactory$get$1.k0();
        }
        T t10 = this.f16515b;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }
}
