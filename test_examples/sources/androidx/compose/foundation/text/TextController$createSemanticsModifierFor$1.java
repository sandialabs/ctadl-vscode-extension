package androidx.compose.foundation.text;

import a1.c;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.datastore.preferences.PreferencesProto$Value;
import c8.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import o1.i;
import o1.o;
import p1.a;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo1/o;", "Lm7/n;", "invoke", "(Lo1/o;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class TextController$createSemanticsModifierFor$1 extends Lambda implements l<o, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ a f2110j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ TextController f2111k;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lp1/n;", "it", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
    /* renamed from: androidx.compose.foundation.text.TextController$createSemanticsModifierFor$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements l<List<p1.n>, Boolean> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ TextController f2112j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextController textController) {
            super(1);
            this.f2112j = textController;
        }

        @Override // u7.l
        public final Boolean U(List<p1.n> list) {
            boolean z10;
            List<p1.n> list2 = list;
            g.f(list2, "it");
            p1.n nVar = this.f2112j.f2103a.f2121e;
            if (nVar != null) {
                list2.add(nVar);
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextController$createSemanticsModifierFor$1(a aVar, TextController textController) {
        super(1);
        this.f2110j = aVar;
        this.f2111k = textController;
    }

    @Override // u7.l
    public final n U(o oVar) {
        o oVar2 = oVar;
        g.f(oVar2, "$this$semantics");
        j<Object>[] jVarArr = o1.n.f16212a;
        a aVar = this.f2110j;
        g.f(aVar, "value");
        oVar2.c(SemanticsProperties.f3960q, c.N0(aVar));
        oVar2.c(i.f16193a, new o1.a(null, new AnonymousClass1(this.f2111k)));
        return n.f16010a;
    }
}
