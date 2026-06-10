package org.koin.core.scope;

import androidx.datastore.preferences.PreferencesProto$Value;
import c8.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {"T", "", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
/* loaded from: classes.dex */
final class Scope$resolveValue$2$1 extends Lambda implements u7.a<String> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b<?> f16529j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ kb.a f16530k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Scope$resolveValue$2$1(b<?> bVar, kb.a aVar) {
        super(0);
        this.f16529j = bVar;
        this.f16530k = aVar;
    }

    @Override // u7.a
    public final String k0() {
        return "'" + mb.a.a(this.f16529j) + "' - q:'" + this.f16530k + "' look at scope source";
    }
}
