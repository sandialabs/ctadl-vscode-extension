package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes.dex */
public final class r<T> {

    /* renamed from: a  reason: collision with root package name */
    public final b<T> f15446a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15447b;
    public final BufferOverflow c;

    /* renamed from: d  reason: collision with root package name */
    public final CoroutineContext f15448d;

    public r(int i10, CoroutineContext coroutineContext, BufferOverflow bufferOverflow, b bVar) {
        this.f15446a = bVar;
        this.f15447b = i10;
        this.c = bufferOverflow;
        this.f15448d = coroutineContext;
    }
}
