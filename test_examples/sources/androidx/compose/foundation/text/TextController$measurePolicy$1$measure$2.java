package androidx.compose.foundation.text;

import androidx.datastore.preferences.PreferencesProto$Value;
import b2.g;
import j1.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj1/b0$a;", "Lm7/n;", "invoke", "(Lj1/b0$a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class TextController$measurePolicy$1$measure$2 extends Lambda implements l<b0.a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ List<Pair<b0, g>> f2115j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextController$measurePolicy$1$measure$2(ArrayList arrayList) {
        super(1);
        this.f2115j = arrayList;
    }

    @Override // u7.l
    public final n U(b0.a aVar) {
        v7.g.f(aVar, "$this$layout");
        List<Pair<b0, g>> list = this.f2115j;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair<b0, g> pair = list.get(i10);
            b0.a.d(pair.f12962i, pair.f12963j.f6345a, 0.0f);
        }
        return n.f16010a;
    }
}
