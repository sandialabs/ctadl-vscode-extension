package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import kotlin.reflect.KParameter;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes.dex */
public abstract class KCallableImpl<R> implements c8.a<R>, f8.g {

    /* renamed from: i  reason: collision with root package name */
    public final g.a<ArrayList<KParameter>> f13093i;

    public KCallableImpl() {
        g.c(new KCallableImpl$_annotations$1(this));
        this.f13093i = g.c(new KCallableImpl$_parameters$1(this));
        g.c(new KCallableImpl$_returnType$1(this));
        g.c(new KCallableImpl$_typeParameters$1(this));
    }

    @Override // c8.a
    public final R a(Object... objArr) {
        try {
            return (R) b().a(objArr);
        } catch (IllegalAccessException e10) {
            throw new IllegalCallableAccessException(e10);
        }
    }

    public abstract kotlin.reflect.jvm.internal.calls.a<?> b();

    public abstract KDeclarationContainerImpl c();

    public abstract CallableMemberDescriptor d();

    public final boolean e() {
        return v7.g.a(getName(), "<init>") && c().e().isAnnotation();
    }

    public abstract boolean f();
}
