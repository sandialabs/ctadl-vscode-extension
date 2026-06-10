package com.noto.app.util;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.data.repository.FolderRepositoryImpl;
import com.noto.app.data.repository.LabelRepositoryImpl;
import com.noto.app.data.repository.NoteLabelRepositoryImpl;
import com.noto.app.data.repository.NoteRepositoryImpl;
import com.noto.app.data.repository.SettingsRepositoryImpl;
import ib.a;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import m7.n;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import u6.b;
import u6.d;
import u6.e;
import u7.l;
import u7.p;
import v6.c;
import v7.g;
import v7.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lib/a;", "Lm7/n;", "invoke", "(Lib/a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class KoinModulesKt$repositoryModule$1 extends Lambda implements l<a, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final KoinModulesKt$repositoryModule$1 f9842j = new KoinModulesKt$repositoryModule$1();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Lu6/a;", "invoke", "(Lorg/koin/core/scope/a;Ljb/a;)Lu6/a;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.KoinModulesKt$repositoryModule$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements p<org.koin.core.scope.a, jb.a, u6.a> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass1 f9843j = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // u7.p
        public final u6.a R(org.koin.core.scope.a aVar, jb.a aVar2) {
            org.koin.core.scope.a aVar3 = aVar;
            g.f(aVar3, "$this$single");
            g.f(aVar2, "it");
            return new FolderRepositoryImpl((v6.a) aVar3.a(null, i.a(v6.a.class), null));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Lu6/d;", "invoke", "(Lorg/koin/core/scope/a;Ljb/a;)Lu6/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.KoinModulesKt$repositoryModule$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends Lambda implements p<org.koin.core.scope.a, jb.a, d> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass2 f9844j = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        @Override // u7.p
        public final d R(org.koin.core.scope.a aVar, jb.a aVar2) {
            org.koin.core.scope.a aVar3 = aVar;
            g.f(aVar3, "$this$single");
            g.f(aVar2, "it");
            return new NoteRepositoryImpl((c) aVar3.a(null, i.a(c.class), null));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Lu6/b;", "invoke", "(Lorg/koin/core/scope/a;Ljb/a;)Lu6/b;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.KoinModulesKt$repositoryModule$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass3 extends Lambda implements p<org.koin.core.scope.a, jb.a, b> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass3 f9845j = new AnonymousClass3();

        public AnonymousClass3() {
            super(2);
        }

        @Override // u7.p
        public final b R(org.koin.core.scope.a aVar, jb.a aVar2) {
            org.koin.core.scope.a aVar3 = aVar;
            g.f(aVar3, "$this$single");
            g.f(aVar2, "it");
            return new LabelRepositoryImpl((v6.b) aVar3.a(null, i.a(v6.b.class), null));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Lu6/c;", "invoke", "(Lorg/koin/core/scope/a;Ljb/a;)Lu6/c;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.KoinModulesKt$repositoryModule$1$4  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass4 extends Lambda implements p<org.koin.core.scope.a, jb.a, u6.c> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass4 f9846j = new AnonymousClass4();

        public AnonymousClass4() {
            super(2);
        }

        @Override // u7.p
        public final u6.c R(org.koin.core.scope.a aVar, jb.a aVar2) {
            org.koin.core.scope.a aVar3 = aVar;
            g.f(aVar3, "$this$single");
            g.f(aVar2, "it");
            return new NoteLabelRepositoryImpl((v6.d) aVar3.a(null, i.a(v6.d.class), null));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Lu6/e;", "invoke", "(Lorg/koin/core/scope/a;Ljb/a;)Lu6/e;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.KoinModulesKt$repositoryModule$1$5  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass5 extends Lambda implements p<org.koin.core.scope.a, jb.a, e> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass5 f9847j = new AnonymousClass5();

        public AnonymousClass5() {
            super(2);
        }

        @Override // u7.p
        public final e R(org.koin.core.scope.a aVar, jb.a aVar2) {
            org.koin.core.scope.a aVar3 = aVar;
            g.f(aVar3, "$this$single");
            g.f(aVar2, "it");
            return new SettingsRepositoryImpl((j3.d) aVar3.a(null, i.a(j3.d.class), null));
        }
    }

    public KoinModulesKt$repositoryModule$1() {
        super(1);
    }

    @Override // u7.l
    public final n U(a aVar) {
        a aVar2 = aVar;
        g.f(aVar2, "$this$module");
        AnonymousClass1 anonymousClass1 = AnonymousClass1.f9843j;
        Kind kind = Kind.Singleton;
        kb.b bVar = lb.b.c;
        EmptyList emptyList = EmptyList.f12981i;
        BeanDefinition beanDefinition = new BeanDefinition(bVar, i.a(u6.a.class), anonymousClass1, kind, emptyList);
        String K0 = a1.c.K0(beanDefinition.f16507b, null, bVar);
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
        aVar2.a(K0, singleInstanceFactory, false);
        HashSet<SingleInstanceFactory<?>> hashSet = aVar2.f11871b;
        boolean z10 = aVar2.f11870a;
        if (z10) {
            hashSet.add(singleInstanceFactory);
        }
        BeanDefinition beanDefinition2 = new BeanDefinition(bVar, i.a(d.class), AnonymousClass2.f9844j, kind, emptyList);
        String K02 = a1.c.K0(beanDefinition2.f16507b, null, bVar);
        SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
        aVar2.a(K02, singleInstanceFactory2, false);
        if (z10) {
            hashSet.add(singleInstanceFactory2);
        }
        BeanDefinition beanDefinition3 = new BeanDefinition(bVar, i.a(b.class), AnonymousClass3.f9845j, kind, emptyList);
        String K03 = a1.c.K0(beanDefinition3.f16507b, null, bVar);
        SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
        aVar2.a(K03, singleInstanceFactory3, false);
        if (z10) {
            hashSet.add(singleInstanceFactory3);
        }
        BeanDefinition beanDefinition4 = new BeanDefinition(bVar, i.a(u6.c.class), AnonymousClass4.f9846j, kind, emptyList);
        String K04 = a1.c.K0(beanDefinition4.f16507b, null, bVar);
        SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition4);
        aVar2.a(K04, singleInstanceFactory4, false);
        if (z10) {
            hashSet.add(singleInstanceFactory4);
        }
        BeanDefinition beanDefinition5 = new BeanDefinition(bVar, i.a(e.class), AnonymousClass5.f9847j, kind, emptyList);
        String K05 = a1.c.K0(beanDefinition5.f16507b, null, bVar);
        SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(beanDefinition5);
        aVar2.a(K05, singleInstanceFactory5, false);
        if (z10) {
            hashSet.add(singleInstanceFactory5);
        }
        return n.f16010a;
    }
}
