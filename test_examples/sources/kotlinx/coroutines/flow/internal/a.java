package kotlinx.coroutines.flow.internal;

import androidx.activity.e;
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import la.k;
import m7.n;
import ma.f;
import v7.g;

/* loaded from: classes.dex */
public abstract class a<T> implements f<T> {

    /* renamed from: i  reason: collision with root package name */
    public final CoroutineContext f15423i;

    /* renamed from: j  reason: collision with root package name */
    public final int f15424j;

    /* renamed from: k  reason: collision with root package name */
    public final BufferOverflow f15425k;

    public a(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        this.f15423i = coroutineContext;
        this.f15424j = i10;
        this.f15425k = bufferOverflow;
    }

    @Override // kotlinx.coroutines.flow.b
    public Object a(kotlinx.coroutines.flow.c<? super T> cVar, p7.c<? super n> cVar2) {
        Object H = a1.b.H(new ChannelFlow$collect$2(null, cVar, this), cVar2);
        return H == CoroutineSingletons.COROUTINE_SUSPENDED ? H : n.f16010a;
    }

    public abstract Object c(k<? super T> kVar, p7.c<? super n> cVar);

    @Override // ma.f
    public final kotlinx.coroutines.flow.b<T> f(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        CoroutineContext coroutineContext2 = this.f15423i;
        CoroutineContext m10 = coroutineContext.m(coroutineContext2);
        BufferOverflow bufferOverflow2 = BufferOverflow.SUSPEND;
        BufferOverflow bufferOverflow3 = this.f15425k;
        int i11 = this.f15424j;
        if (bufferOverflow == bufferOverflow2) {
            if (i11 != -3) {
                if (i10 != -3) {
                    if (i11 != -2) {
                        if (i10 != -2) {
                            i10 += i11;
                            if (i10 < 0) {
                                i10 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i10 = i11;
            }
            bufferOverflow = bufferOverflow3;
        }
        return (g.a(m10, coroutineContext2) && i10 == i11 && bufferOverflow == bufferOverflow3) ? this : g(m10, i10, bufferOverflow);
    }

    public abstract a<T> g(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow);

    public kotlinx.coroutines.flow.b<T> i() {
        return null;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f13021i;
        CoroutineContext coroutineContext = this.f15423i;
        if (coroutineContext != emptyCoroutineContext) {
            arrayList.add("context=" + coroutineContext);
        }
        int i10 = this.f15424j;
        if (i10 != -3) {
            arrayList.add("capacity=" + i10);
        }
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        BufferOverflow bufferOverflow2 = this.f15425k;
        if (bufferOverflow2 != bufferOverflow) {
            arrayList.add("onBufferOverflow=" + bufferOverflow2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return e.j(sb, kotlin.collections.c.t2(arrayList, ", ", null, null, null, 62), ']');
    }
}
