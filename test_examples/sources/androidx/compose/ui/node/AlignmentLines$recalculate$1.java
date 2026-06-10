package androidx.compose.ui.node;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll1/a;", "childOwner", "Lm7/n;", "invoke", "(Ll1/a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class AlignmentLines$recalculate$1 extends Lambda implements l<l1.a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AlignmentLines f3380j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentLines$recalculate$1(AlignmentLines alignmentLines) {
        super(1);
        this.f3380j = alignmentLines;
    }

    @Override // u7.l
    public final n U(l1.a aVar) {
        AlignmentLines alignmentLines;
        l1.a aVar2 = aVar;
        g.f(aVar2, "childOwner");
        if (aVar2.B()) {
            if (aVar2.f().f3373b) {
                aVar2.x();
            }
            Iterator it = aVar2.f().f3379i.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                alignmentLines = this.f3380j;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                AlignmentLines.a(alignmentLines, (j1.a) entry.getKey(), ((Number) entry.getValue()).intValue(), aVar2.o());
            }
            NodeCoordinator nodeCoordinator = aVar2.o().f3501q;
            while (true) {
                g.c(nodeCoordinator);
                if (g.a(nodeCoordinator, alignmentLines.f3372a.o())) {
                    break;
                }
                for (j1.a aVar3 : alignmentLines.c(nodeCoordinator).keySet()) {
                    AlignmentLines.a(alignmentLines, aVar3, alignmentLines.d(nodeCoordinator, aVar3), nodeCoordinator);
                }
                nodeCoordinator = nodeCoordinator.f3501q;
            }
        }
        return n.f16010a;
    }
}
