package androidx.compose.ui;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import q0.c;
import q0.d;
import t0.b;
import t0.i;
import u7.p;
import u7.q;
import v7.g;
import v7.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq0/d;", "acc", "Lq0/d$b;", "element", "invoke", "(Lq0/d;Lq0/d$b;)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposedModifierKt$materialize$result$1 extends Lambda implements p<d, d.b, d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g0.d f2994j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposedModifierKt$materialize$result$1(g0.d dVar) {
        super(2);
        this.f2994j = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u7.p
    public final d R(d dVar, d.b bVar) {
        d dVar2;
        d dVar3;
        d dVar4 = dVar;
        d.b bVar2 = bVar;
        g.f(dVar4, "acc");
        g.f(bVar2, "element");
        boolean z10 = bVar2 instanceof c;
        g0.d dVar5 = this.f2994j;
        if (z10) {
            q<d, g0.d, Integer, d> qVar = ((c) bVar2).f16822j;
            g.d(qVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
            l.d(3, qVar);
            dVar3 = ComposedModifierKt.b(dVar5, qVar.O(d.a.f16824i, dVar5, 0));
        } else {
            if (bVar2 instanceof b) {
                q<b, g0.d, Integer, d> qVar2 = ComposedModifierKt.f2988a;
                g.d(qVar2, "null cannot be cast to non-null type kotlin.Function3<androidx.compose.ui.focus.FocusEventModifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                l.d(3, qVar2);
                dVar2 = bVar2.Z((d) ((ComposedModifierKt$WrapFocusEventModifier$1) qVar2).O(bVar2, dVar5, 0));
            } else {
                dVar2 = bVar2;
            }
            if (bVar2 instanceof i) {
                q<i, g0.d, Integer, d> qVar3 = ComposedModifierKt.f2989b;
                g.d(qVar3, "null cannot be cast to non-null type kotlin.Function3<androidx.compose.ui.focus.FocusRequesterModifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                l.d(3, qVar3);
                dVar3 = dVar2.Z((d) ((ComposedModifierKt$WrapFocusRequesterModifier$1) qVar3).O(bVar2, dVar5, 0));
            } else {
                dVar3 = dVar2;
            }
        }
        return dVar4.Z(dVar3);
    }
}
