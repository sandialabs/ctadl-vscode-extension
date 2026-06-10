package kotlinx.coroutines.internal;

import ja.m1;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineContext f15498a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f15499b;
    public final m1<Object>[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f15500d;

    public v(CoroutineContext coroutineContext, int i10) {
        this.f15498a = coroutineContext;
        this.f15499b = new Object[i10];
        this.c = new m1[i10];
    }
}
