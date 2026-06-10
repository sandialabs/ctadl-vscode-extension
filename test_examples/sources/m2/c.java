package m2;

import m2.f;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ f.a f15909i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f15910j;

    public c(f.a aVar, Object obj) {
        this.f15909i = aVar;
        this.f15910j = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15909i.f15921a = this.f15910j;
    }
}
