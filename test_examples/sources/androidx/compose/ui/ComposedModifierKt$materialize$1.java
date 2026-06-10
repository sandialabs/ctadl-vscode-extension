package androidx.compose.ui;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import q0.c;
import q0.d;
import t0.b;
import t0.i;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq0/d$b;", "it", "", "invoke", "(Lq0/d$b;)Ljava/lang/Boolean;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposedModifierKt$materialize$1 extends Lambda implements l<d.b, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public static final ComposedModifierKt$materialize$1 f2993j = new ComposedModifierKt$materialize$1();

    public ComposedModifierKt$materialize$1() {
        super(1);
    }

    @Override // u7.l
    public final Boolean U(d.b bVar) {
        boolean z10;
        d.b bVar2 = bVar;
        g.f(bVar2, "it");
        if (!(bVar2 instanceof c) && !(bVar2 instanceof b) && !(bVar2 instanceof i)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
