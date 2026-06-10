package kotlinx.coroutines.internal;

/* loaded from: classes.dex */
public class h extends LockFreeLinkedListNode {
    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public final boolean H() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public final boolean I() {
        throw new IllegalStateException("head cannot be removed".toString());
    }
}
