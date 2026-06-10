package kotlin.text;

import b8.i;
import ga.p;
import ha.c;
import ha.d;
import java.util.Iterator;
import kotlin.collections.AbstractCollection;

/* loaded from: classes.dex */
public final class MatcherMatchResult$groups$1 extends AbstractCollection<c> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ d f15127i;

    public MatcherMatchResult$groups$1(d dVar) {
        this.f15127i = dVar;
    }

    @Override // kotlin.collections.AbstractCollection
    public final int c() {
        return this.f15127i.f11611a.groupCount() + 1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof c;
        }
        if (!z10) {
            return false;
        }
        return super.contains((c) obj);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<c> iterator() {
        return new p.a(kotlin.sequences.a.W0(kotlin.collections.c.g2(new i(0, size() - 1)), new MatcherMatchResult$groups$1$iterator$1(this)));
    }
}
