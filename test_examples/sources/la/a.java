package la;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* loaded from: classes.dex */
public final class a extends LockFreeLinkedListNode.b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.channels.a f15868d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r rVar, kotlinx.coroutines.channels.a aVar) {
        super(rVar);
        this.f15868d = aVar;
    }

    @Override // kotlinx.coroutines.internal.c
    public final Object i(LockFreeLinkedListNode lockFreeLinkedListNode) {
        LockFreeLinkedListNode lockFreeLinkedListNode2 = lockFreeLinkedListNode;
        if (this.f15868d.j()) {
            return null;
        }
        return a1.c.H;
    }
}
