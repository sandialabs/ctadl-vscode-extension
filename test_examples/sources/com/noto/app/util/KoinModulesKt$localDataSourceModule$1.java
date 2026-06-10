package com.noto.app.util;

import a1.c;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.data.database.NotoDatabase;
import ib.a;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import m7.n;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import u7.l;
import u7.p;
import v6.b;
import v6.d;
import v7.g;
import v7.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lib/a;", "Lm7/n;", "invoke", "(Lib/a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class KoinModulesKt$localDataSourceModule$1 extends Lambda implements l<a, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final KoinModulesKt$localDataSourceModule$1 f9836j = new KoinModulesKt$localDataSourceModule$1();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Lv6/a;", "invoke", "(Lorg/koin/core/scope/a;Ljb/a;)Lv6/a;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.KoinModulesKt$localDataSourceModule$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements p<org.koin.core.scope.a, jb.a, v6.a> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass1 f9837j = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // u7.p
        public final v6.a R(org.koin.core.scope.a aVar, jb.a aVar2) {
            org.koin.core.scope.a aVar3 = aVar;
            g.f(aVar3, "$this$single");
            g.f(aVar2, "it");
            return NotoDatabase.f7686m.a(c.N(aVar3)).r();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Lv6/c;", "invoke", "(Lorg/koin/core/scope/a;Ljb/a;)Lv6/c;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.KoinModulesKt$localDataSourceModule$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends Lambda implements p<org.koin.core.scope.a, jb.a, v6.c> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass2 f9838j = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        @Override // u7.p
        public final v6.c R(org.koin.core.scope.a aVar, jb.a aVar2) {
            org.koin.core.scope.a aVar3 = aVar;
            g.f(aVar3, "$this$single");
            g.f(aVar2, "it");
            return NotoDatabase.f7686m.a(c.N(aVar3)).t();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Lv6/b;", "invoke", "(Lorg/koin/core/scope/a;Ljb/a;)Lv6/b;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.KoinModulesKt$localDataSourceModule$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass3 extends Lambda implements p<org.koin.core.scope.a, jb.a, b> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass3 f9839j = new AnonymousClass3();

        public AnonymousClass3() {
            super(2);
        }

        @Override // u7.p
        public final b R(org.koin.core.scope.a aVar, jb.a aVar2) {
            org.koin.core.scope.a aVar3 = aVar;
            g.f(aVar3, "$this$single");
            g.f(aVar2, "it");
            return NotoDatabase.f7686m.a(c.N(aVar3)).s();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Lv6/d;", "invoke", "(Lorg/koin/core/scope/a;Ljb/a;)Lv6/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.KoinModulesKt$localDataSourceModule$1$4  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass4 extends Lambda implements p<org.koin.core.scope.a, jb.a, d> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass4 f9840j = new AnonymousClass4();

        public AnonymousClass4() {
            super(2);
        }

        @Override // u7.p
        public final d R(org.koin.core.scope.a aVar, jb.a aVar2) {
            org.koin.core.scope.a aVar3 = aVar;
            g.f(aVar3, "$this$single");
            g.f(aVar2, "it");
            return NotoDatabase.f7686m.a(c.N(aVar3)).u();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Lj3/d;", "Lm3/a;", "invoke", "(Lorg/koin/core/scope/a;Ljb/a;)Lj3/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.KoinModulesKt$localDataSourceModule$1$5  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass5 extends Lambda implements p<org.koin.core.scope.a, jb.a, j3.d<m3.a>> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass5 f9841j = new AnonymousClass5();

        public AnonymousClass5() {
            super(2);
        }

        @Override // u7.p
        public final j3.d<m3.a> R(org.koin.core.scope.a aVar, jb.a aVar2) {
            org.koin.core.scope.a aVar3 = aVar;
            g.f(aVar3, "$this$single");
            g.f(aVar2, "it");
            return (j3.d) KoinModulesKt.f9822b.a(c.N(aVar3), KoinModulesKt.f9821a[0]);
        }
    }

    public KoinModulesKt$localDataSourceModule$1() {
        super(1);
    }

    @Override // u7.l
    public final n U(a aVar) {
        a aVar2 = aVar;
        g.f(aVar2, "$this$module");
        AnonymousClass1 anonymousClass1 = AnonymousClass1.f9837j;
        Kind kind = Kind.Singleton;
        kb.b bVar = lb.b.c;
        EmptyList emptyList = EmptyList.f12981i;
        BeanDefinition beanDefinition = new BeanDefinition(bVar, i.a(v6.a.class), anonymousClass1, kind, emptyList);
        String K0 = c.K0(beanDefinition.f16507b, null, bVar);
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
        aVar2.a(K0, singleInstanceFactory, false);
        HashSet<SingleInstanceFactory<?>> hashSet = aVar2.f11871b;
        boolean z10 = aVar2.f11870a;
        if (z10) {
            hashSet.add(singleInstanceFactory);
        }
        BeanDefinition beanDefinition2 = new BeanDefinition(bVar, i.a(v6.c.class), AnonymousClass2.f9838j, kind, emptyList);
        String K02 = c.K0(beanDefinition2.f16507b, null, bVar);
        SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
        aVar2.a(K02, singleInstanceFactory2, false);
        if (z10) {
            hashSet.add(singleInstanceFactory2);
        }
        BeanDefinition beanDefinition3 = new BeanDefinition(bVar, i.a(b.class), AnonymousClass3.f9839j, kind, emptyList);
        String K03 = c.K0(beanDefinition3.f16507b, null, bVar);
        SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
        aVar2.a(K03, singleInstanceFactory3, false);
        if (z10) {
            hashSet.add(singleInstanceFactory3);
        }
        BeanDefinition beanDefinition4 = new BeanDefinition(bVar, i.a(d.class), AnonymousClass4.f9840j, kind, emptyList);
        String K04 = c.K0(beanDefinition4.f16507b, null, bVar);
        SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition4);
        aVar2.a(K04, singleInstanceFactory4, false);
        if (z10) {
            hashSet.add(singleInstanceFactory4);
        }
        BeanDefinition beanDefinition5 = new BeanDefinition(bVar, i.a(j3.d.class), AnonymousClass5.f9841j, kind, emptyList);
        String K05 = c.K0(beanDefinition5.f16507b, null, bVar);
        SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(beanDefinition5);
        aVar2.a(K05, singleInstanceFactory5, false);
        if (z10) {
            hashSet.add(singleInstanceFactory5);
        }
        return n.f16010a;
    }
}
