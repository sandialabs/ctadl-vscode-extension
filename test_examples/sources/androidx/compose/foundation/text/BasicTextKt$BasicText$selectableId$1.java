package androidx.compose.foundation.text;

import androidx.datastore.preferences.PreferencesProto$Value;
import b0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.a;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTextKt$BasicText$selectableId$1 extends Lambda implements a<Long> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ c f2096j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$BasicText$selectableId$1(c cVar) {
        super(0);
        this.f2096j = cVar;
    }

    @Override // u7.a
    public final Long k0() {
        c cVar = this.f2096j;
        return Long.valueOf(cVar != null ? cVar.e() : 0L);
    }
}
