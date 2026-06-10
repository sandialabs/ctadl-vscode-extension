package androidx.compose.ui.node;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import l1.f;
import m7.n;
import v0.p;

/* JADX WARN: Incorrect field signature: TT; */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll1/b;", "T", "Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class NodeCoordinator$hit$1 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator f3513j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ l1.b f3514k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator.c<T> f3515l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ long f3516m;
    public final /* synthetic */ f<T> n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ boolean f3517o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ boolean f3518p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/node/NodeCoordinator;TT;Landroidx/compose/ui/node/NodeCoordinator$c<TT;>;JLl1/f<TT;>;ZZ)V */
    public NodeCoordinator$hit$1(NodeCoordinator nodeCoordinator, l1.b bVar, NodeCoordinator.c cVar, long j2, f fVar, boolean z10, boolean z11) {
        super(0);
        this.f3513j = nodeCoordinator;
        this.f3514k = bVar;
        this.f3515l = cVar;
        this.f3516m = j2;
        this.n = fVar;
        this.f3517o = z10;
        this.f3518p = z11;
    }

    @Override // u7.a
    public final n k0() {
        this.f3513j.W0(p.c(this.f3514k, this.f3515l.a()), this.f3515l, this.f3516m, this.n, this.f3517o, this.f3518p);
        return n.f16010a;
    }
}
