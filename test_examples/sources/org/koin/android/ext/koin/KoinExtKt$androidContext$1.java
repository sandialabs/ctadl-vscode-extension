package org.koin.android.ext.koin;

import a1.c;
import android.app.Application;
import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.NotoApplication;
import kb.b;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import m7.n;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import u7.l;
import u7.p;
import v7.g;
import v7.i;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lib/a;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class KoinExtKt$androidContext$1 extends Lambda implements l<ib.a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Context f16490j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Landroid/content/Context;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
    /* renamed from: org.koin.android.ext.koin.KoinExtKt$androidContext$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements p<org.koin.core.scope.a, jb.a, Context> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Context f16491j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context) {
            super(2);
            this.f16491j = context;
        }

        @Override // u7.p
        public final Context R(org.koin.core.scope.a aVar, jb.a aVar2) {
            g.f(aVar, "$this$single");
            g.f(aVar2, "it");
            return this.f16491j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinExtKt$androidContext$1(NotoApplication notoApplication) {
        super(1);
        this.f16490j = notoApplication;
    }

    @Override // u7.l
    public final n U(ib.a aVar) {
        ib.a aVar2 = aVar;
        g.f(aVar2, "$this$module");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f16490j);
        Kind kind = Kind.Singleton;
        b bVar = lb.b.c;
        BeanDefinition beanDefinition = new BeanDefinition(bVar, i.a(Context.class), anonymousClass1, kind, EmptyList.f12981i);
        String K0 = c.K0(beanDefinition.f16507b, null, bVar);
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
        aVar2.a(K0, singleInstanceFactory, false);
        if (aVar2.f11870a) {
            aVar2.f11871b.add(singleInstanceFactory);
        }
        c8.b a10 = i.a(Application.class);
        g.f(a10, "clazz");
        beanDefinition.f16510f = kotlin.collections.c.A2(beanDefinition.f16510f, a10);
        aVar2.a(c.K0(a10, null, beanDefinition.f16506a), singleInstanceFactory, true);
        return n.f16010a;
    }
}
