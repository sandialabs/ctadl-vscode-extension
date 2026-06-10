package org.koin.core.instance;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {"T", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class SingleInstanceFactory$get$1 extends Lambda implements a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SingleInstanceFactory<T> f16516j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ g0 f16517k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleInstanceFactory$get$1(SingleInstanceFactory<T> singleInstanceFactory, g0 g0Var) {
        super(0);
        this.f16516j = singleInstanceFactory;
        this.f16517k = g0Var;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Object] */
    @Override // u7.a
    public final n k0() {
        boolean z10;
        SingleInstanceFactory<T> singleInstanceFactory = this.f16516j;
        if (singleInstanceFactory.f16515b != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            singleInstanceFactory.f16515b = singleInstanceFactory.a(this.f16517k);
        }
        return n.f16010a;
    }
}
