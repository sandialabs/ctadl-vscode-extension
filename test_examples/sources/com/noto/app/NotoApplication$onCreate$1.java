package com.noto.app;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.util.KoinModulesKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import org.koin.core.b;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/koin/core/b;", "Lm7/n;", "invoke", "(Lorg/koin/core/b;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NotoApplication$onCreate$1 extends Lambda implements l<b, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NotoApplication f7578j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotoApplication$onCreate$1(NotoApplication notoApplication) {
        super(1);
        this.f7578j = notoApplication;
    }

    @Override // u7.l
    public final n U(b bVar) {
        b bVar2 = bVar;
        g.f(bVar2, "$this$startKoin");
        org.koin.android.ext.koin.a.a(bVar2, this.f7578j);
        ya.a aVar = new ya.a();
        org.koin.core.a aVar2 = bVar2.f16504a;
        aVar2.getClass();
        aVar2.c = aVar;
        bVar2.a(KoinModulesKt.c, KoinModulesKt.f9823d, KoinModulesKt.f9824e);
        return n.f16010a;
    }
}
