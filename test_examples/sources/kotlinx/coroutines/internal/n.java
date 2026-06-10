package kotlinx.coroutines.internal;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final LockFreeLinkedListNode f15492a;

    public n(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f15492a = lockFreeLinkedListNode;
    }

    public final String toString() {
        return "Removed[" + this.f15492a + ']';
    }
}
