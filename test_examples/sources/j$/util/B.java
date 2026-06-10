package j$.util;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class B extends b0 {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ SortedSet f12068f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(SortedSet sortedSet, java.util.Collection collection) {
        super(21, collection);
        this.f12068f = sortedSet;
    }

    @Override // j$.util.b0, j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f12068f.comparator();
    }
}
