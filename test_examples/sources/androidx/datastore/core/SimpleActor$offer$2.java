package androidx.datastore.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import q7.c;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
@c(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {122, 122}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SimpleActor$offer$2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public p f4672m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ SimpleActor<Object> f4673o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(SimpleActor<Object> simpleActor, p7.c<? super SimpleActor$offer$2> cVar) {
        super(2, cVar);
        this.f4673o = simpleActor;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((SimpleActor$offer$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new SimpleActor$offer$2(this.f4673o, cVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:22:0x005b). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object k(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.n
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            m0.b.n1(r7)
            r7 = r6
            goto L5b
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            u7.p r1 = r6.f4672m
            m0.b.n1(r7)
            r4 = r1
            r1 = r7
            r7 = r6
            goto L4f
        L22:
            m0.b.n1(r7)
            androidx.datastore.core.SimpleActor<java.lang.Object> r7 = r6.f4673o
            java.util.concurrent.atomic.AtomicInteger r7 = r7.f4668d
            int r7 = r7.get()
            if (r7 <= 0) goto L31
            r7 = 1
            goto L32
        L31:
            r7 = 0
        L32:
            if (r7 == 0) goto L68
            r7 = r6
        L35:
            androidx.datastore.core.SimpleActor<java.lang.Object> r1 = r7.f4673o
            ja.x r4 = r1.f4666a
            kotlin.coroutines.CoroutineContext r4 = r4.j()
            a1.b.L(r4)
            u7.p<T, p7.c<? super m7.n>, java.lang.Object> r4 = r1.f4667b
            r7.f4672m = r4
            r7.n = r3
            kotlinx.coroutines.channels.AbstractChannel r1 = r1.c
            java.lang.Object r1 = r1.L(r7)
            if (r1 != r0) goto L4f
            return r0
        L4f:
            r5 = 0
            r7.f4672m = r5
            r7.n = r2
            java.lang.Object r1 = r4.R(r1, r7)
            if (r1 != r0) goto L5b
            return r0
        L5b:
            androidx.datastore.core.SimpleActor<java.lang.Object> r1 = r7.f4673o
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f4668d
            int r1 = r1.decrementAndGet()
            if (r1 != 0) goto L35
            m7.n r7 = m7.n.f16010a
            return r7
        L68:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor$offer$2.k(java.lang.Object):java.lang.Object");
    }
}
