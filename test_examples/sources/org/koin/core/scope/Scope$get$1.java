package org.koin.core.scope;

import androidx.datastore.preferences.PreferencesProto$Value;
import c8.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {"T", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class Scope$get$1 extends Lambda implements u7.a<Object> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ a f16523j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ kb.a f16524k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ b<?> f16525l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ u7.a<jb.a> f16526m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Scope$get$1(a aVar, kb.a aVar2, b<?> bVar, u7.a<? extends jb.a> aVar3) {
        super(0);
        this.f16523j = aVar;
        this.f16524k = aVar2;
        this.f16525l = bVar;
        this.f16526m = aVar3;
    }

    @Override // u7.a
    public final Object k0() {
        return this.f16523j.b(this.f16526m, this.f16525l, this.f16524k);
    }
}
