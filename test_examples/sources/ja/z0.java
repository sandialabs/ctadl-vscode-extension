package ja;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* loaded from: classes.dex */
public final class z0 extends LockFreeLinkedListNode.b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ y0 f12818d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f12819e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(LockFreeLinkedListNode lockFreeLinkedListNode, y0 y0Var, Object obj) {
        super(lockFreeLinkedListNode);
        this.f12818d = y0Var;
        this.f12819e = obj;
    }

    @Override // kotlinx.coroutines.internal.c
    public final Object i(LockFreeLinkedListNode lockFreeLinkedListNode) {
        boolean z10;
        LockFreeLinkedListNode lockFreeLinkedListNode2 = lockFreeLinkedListNode;
        if (this.f12818d.i0() == this.f12819e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        return a1.c.H;
    }
}
