package org.koin.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;

@Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
/* loaded from: classes.dex */
final class KoinApplication$modules$duration$1 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b f16500j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ List<ib.a> f16501k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinApplication$modules$duration$1(b bVar, List<ib.a> list) {
        super(0);
        this.f16500j = bVar;
        this.f16501k = list;
    }

    @Override // u7.a
    public final n k0() {
        b bVar = this.f16500j;
        bVar.f16504a.a(this.f16501k, bVar.f16505b);
        return n.f16010a;
    }
}
