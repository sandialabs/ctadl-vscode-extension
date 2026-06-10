package ja;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* loaded from: classes.dex */
public final class g1 extends c {

    /* renamed from: i  reason: collision with root package name */
    public final LockFreeLinkedListNode f12769i;

    public g1(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f12769i = lockFreeLinkedListNode;
    }

    @Override // u7.l
    public final /* bridge */ /* synthetic */ m7.n U(Throwable th) {
        a(th);
        return m7.n.f16010a;
    }

    @Override // ja.h
    public final void a(Throwable th) {
        this.f12769i.I();
    }

    public final String toString() {
        return "RemoveOnCancel[" + this.f12769i + ']';
    }
}
