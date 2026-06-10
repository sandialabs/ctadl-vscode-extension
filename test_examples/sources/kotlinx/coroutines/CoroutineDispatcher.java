package kotlinx.coroutines;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.y;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.internal.f;
import p7.d;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public abstract class CoroutineDispatcher extends p7.a implements p7.d {

    /* renamed from: j  reason: collision with root package name */
    public static final Key f15147j = new Key();

    /* loaded from: classes.dex */
    public static final class Key extends p7.b<p7.d, CoroutineDispatcher> {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$a;", "it", "Lkotlinx/coroutines/CoroutineDispatcher;", "invoke", "(Lkotlin/coroutines/CoroutineContext$a;)Lkotlinx/coroutines/CoroutineDispatcher;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.CoroutineDispatcher$Key$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends Lambda implements l<CoroutineContext.a, CoroutineDispatcher> {

            /* renamed from: j  reason: collision with root package name */
            public static final AnonymousClass1 f15148j = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // u7.l
            public final CoroutineDispatcher U(CoroutineContext.a aVar) {
                CoroutineContext.a aVar2 = aVar;
                if (aVar2 instanceof CoroutineDispatcher) {
                    return (CoroutineDispatcher) aVar2;
                }
                return null;
            }
        }

        public Key() {
            super(d.a.f16777i, AnonymousClass1.f15148j);
        }
    }

    public CoroutineDispatcher() {
        super(d.a.f16777i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        if (p7.d.a.f16777i == r3) goto L13;
     */
    @Override // p7.a, kotlin.coroutines.CoroutineContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineContext N(CoroutineContext.b<?> bVar) {
        boolean z10;
        g.f(bVar, "key");
        if (bVar instanceof p7.b) {
            p7.b bVar2 = (p7.b) bVar;
            CoroutineContext.b<?> bVar3 = this.f16773i;
            g.f(bVar3, "key");
            if (bVar3 != bVar2 && bVar2.f16775j != bVar3) {
                z10 = false;
                if (z10 && ((CoroutineContext.a) bVar2.f16774i.U(this)) != null) {
                    return EmptyCoroutineContext.f13021i;
                }
                return this;
            }
            z10 = true;
            if (z10) {
                return EmptyCoroutineContext.f13021i;
            }
            return this;
        }
    }

    @Override // p7.d
    public final void S(p7.c<?> cVar) {
        ((f) cVar).m();
    }

    public abstract void T(CoroutineContext coroutineContext, Runnable runnable);

    public void U(CoroutineContext coroutineContext, Runnable runnable) {
        T(coroutineContext, runnable);
    }

    public boolean V(CoroutineContext coroutineContext) {
        return !(this instanceof e);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    @Override // p7.a, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <E extends CoroutineContext.a> E a(CoroutineContext.b<E> bVar) {
        boolean z10;
        g.f(bVar, "key");
        if (bVar instanceof p7.b) {
            p7.b bVar2 = (p7.b) bVar;
            CoroutineContext.b<?> bVar3 = this.f16773i;
            g.f(bVar3, "key");
            if (bVar3 != bVar2 && bVar2.f16775j != bVar3) {
                z10 = false;
                if (z10) {
                    E e10 = (E) bVar2.f16774i.U(this);
                    if (e10 instanceof CoroutineContext.a) {
                        return e10;
                    }
                }
            }
            z10 = true;
            if (z10) {
            }
        } else if (d.a.f16777i == bVar) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + y.a(this);
    }

    @Override // p7.d
    public final f w(ContinuationImpl continuationImpl) {
        return new f(this, continuationImpl);
    }
}
