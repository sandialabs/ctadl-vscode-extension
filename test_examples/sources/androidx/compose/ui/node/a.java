package androidx.compose.ui.node;

import kotlin.LazyThreadSafetyMode;
import l1.c;
import v7.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final TreeSet<LayoutNode> f3550a;

    public a() {
        kotlin.a.a(LazyThreadSafetyMode.NONE, DepthSortedSet$mapOfOriginalDepth$2.f3413j);
        this.f3550a = new TreeSet<>(new c());
    }

    public final void a(LayoutNode layoutNode) {
        g.f(layoutNode, "node");
        if (!layoutNode.z()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f3550a.add(layoutNode);
    }

    public final boolean b(LayoutNode layoutNode) {
        g.f(layoutNode, "node");
        if (layoutNode.z()) {
            return this.f3550a.remove(layoutNode);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final String toString() {
        String obj = this.f3550a.toString();
        g.e(obj, "set.toString()");
        return obj;
    }
}
