package com.noto.app.util;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.AppViewModel;
import com.noto.app.filtered.FilteredItemModel;
import com.noto.app.filtered.FilteredViewModel;
import com.noto.app.folder.FolderViewModel;
import com.noto.app.label.LabelViewModel;
import com.noto.app.main.MainViewModel;
import com.noto.app.note.NotePagerViewModel;
import com.noto.app.note.NoteViewModel;
import com.noto.app.widget.FolderListWidgetConfigViewModel;
import com.noto.app.widget.NoteListWidgetConfigViewModel;
import ib.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import m7.n;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.error.DefinitionParameterException;
import u6.b;
import u6.c;
import u6.d;
import u6.e;
import u7.l;
import u7.p;
import v7.g;
import v7.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lib/a;", "Lm7/n;", "invoke", "(Lib/a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class KoinModulesKt$appModule$1 extends Lambda implements l<a, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final KoinModulesKt$appModule$1 f9825j = new KoinModulesKt$appModule$1();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Lcom/noto/app/main/MainViewModel;", "invoke", "(Lorg/koin/core/scope/a;Ljb/a;)Lcom/noto/app/main/MainViewModel;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.KoinModulesKt$appModule$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements p<org.koin.core.scope.a, jb.a, MainViewModel> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass1 f9826j = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // u7.p
        public final MainViewModel R(org.koin.core.scope.a aVar, jb.a aVar2) {
            org.koin.core.scope.a aVar3 = aVar;
            g.f(aVar3, "$this$viewModel");
            g.f(aVar2, "it");
            return new MainViewModel((u6.a) aVar3.a(null, i.a(u6.a.class), null), (d) aVar3.a(null, i.a(d.class), null), (e) aVar3.a(null, i.a(e.class), null));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Lcom/noto/app/filtered/FilteredViewModel;", "invoke", "(Lorg/koin/core/scope/a;Ljb/a;)Lcom/noto/app/filtered/FilteredViewModel;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.KoinModulesKt$appModule$1$10  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass10 extends Lambda implements p<org.koin.core.scope.a, jb.a, FilteredViewModel> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass10 f9827j = new AnonymousClass10();

        public AnonymousClass10() {
            super(2);
        }

        @Override // u7.p
        public final FilteredViewModel R(org.koin.core.scope.a aVar, jb.a aVar2) {
            org.koin.core.scope.a aVar3 = aVar;
            jb.a aVar4 = aVar2;
            g.f(aVar3, "$this$viewModel");
            g.f(aVar4, "it");
            u6.a aVar5 = (u6.a) aVar3.a(null, i.a(u6.a.class), null);
            d dVar = (d) aVar3.a(null, i.a(d.class), null);
            b bVar = (b) aVar3.a(null, i.a(b.class), null);
            c cVar = (c) aVar3.a(null, i.a(c.class), null);
            e eVar = (e) aVar3.a(null, i.a(e.class), null);
            Object b5 = aVar4.b(i.a(FilteredItemModel.class));
            if (b5 != null) {
                return new FilteredViewModel(aVar5, dVar, bVar, cVar, eVar, (FilteredItemModel) b5);
            }
            throw new DefinitionParameterException("No value found for type '" + mb.a.a(i.a(FilteredItemModel.class)) + '\'');
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Lcom/noto/app/folder/FolderViewModel;", "invoke", "(Lorg/koin/core/scope/a;Ljb/a;)Lcom/noto/app/folder/FolderViewModel;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.KoinModulesKt$appModule$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends Lambda implements p<org.koin.core.scope.a, jb.a, FolderViewModel> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass2 f9828j = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r13v5 */
        /* JADX WARN: Type inference failed for: r13v6 */
        @Override // u7.p
        public final FolderViewModel R(org.koin.core.scope.a aVar, jb.a aVar2) {
            long[] jArr;
            boolean z10;
            org.koin.core.scope.a aVar3 = aVar;
            jb.a aVar4 = aVar2;
            g.f(aVar3, "$this$viewModel");
            g.f(aVar4, "it");
            long[] jArr2 = null;
            u6.a aVar5 = (u6.a) aVar3.a(null, i.a(u6.a.class), null);
            d dVar = (d) aVar3.a(null, i.a(d.class), null);
            b bVar = (b) aVar3.a(null, i.a(b.class), null);
            c cVar = (c) aVar3.a(null, i.a(c.class), null);
            e eVar = (e) aVar3.a(null, i.a(e.class), null);
            Object b5 = aVar4.b(i.a(Long.class));
            if (b5 != null) {
                long longValue = ((Number) b5).longValue();
                Iterator it = aVar4.f12820a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ?? next = it.next();
                    if (next != 0) {
                        z10 = next instanceof long[];
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        continue;
                    } else {
                        next = 0;
                        continue;
                    }
                    if (next != 0) {
                        jArr2 = next;
                        break;
                    }
                }
                long[] jArr3 = jArr2;
                if (jArr3 == null) {
                    jArr = new long[0];
                } else {
                    jArr = jArr3;
                }
                return new FolderViewModel(aVar5, dVar, bVar, cVar, eVar, longValue, jArr);
            }
            throw new DefinitionParameterException("No value found for type '" + mb.a.a(i.a(Long.class)) + '\'');
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Lcom/noto/app/note/NoteViewModel;", "invoke", "(Lorg/koin/core/scope/a;Ljb/a;)Lcom/noto/app/note/NoteViewModel;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.KoinModulesKt$appModule$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass3 extends Lambda implements p<org.koin.core.scope.a, jb.a, NoteViewModel> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass3 f9829j = new AnonymousClass3();

        public AnonymousClass3() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r14v5 */
        /* JADX WARN: Type inference failed for: r14v6 */
        /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v7 */
        @Override // u7.p
        public final NoteViewModel R(org.koin.core.scope.a aVar, jb.a aVar2) {
            String str;
            long[] jArr;
            boolean z10;
            boolean z11;
            org.koin.core.scope.a aVar3 = aVar;
            jb.a aVar4 = aVar2;
            g.f(aVar3, "$this$viewModel");
            g.f(aVar4, "it");
            long[] jArr2 = null;
            u6.a aVar5 = (u6.a) aVar3.a(null, i.a(u6.a.class), null);
            d dVar = (d) aVar3.a(null, i.a(d.class), null);
            b bVar = (b) aVar3.a(null, i.a(b.class), null);
            c cVar = (c) aVar3.a(null, i.a(c.class), null);
            e eVar = (e) aVar3.a(null, i.a(e.class), null);
            long longValue = ((Number) aVar4.a(0)).longValue();
            long longValue2 = ((Number) aVar4.a(1)).longValue();
            List<Object> list = aVar4.f12820a;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    ?? next = it.next();
                    if (next != 0) {
                        z11 = next instanceof String;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        continue;
                    } else {
                        next = 0;
                        continue;
                    }
                    if (next != 0) {
                        str = next;
                        break;
                    }
                } else {
                    str = null;
                    break;
                }
            }
            String str2 = str;
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ?? next2 = it2.next();
                if (next2 != 0) {
                    z10 = next2 instanceof long[];
                } else {
                    z10 = true;
                }
                if (z10) {
                    continue;
                } else {
                    next2 = 0;
                    continue;
                }
                if (next2 != 0) {
                    jArr2 = next2;
                    break;
                }
            }
            long[] jArr3 = jArr2;
            if (jArr3 == null) {
                jArr = new long[0];
            } else {
                jArr = jArr3;
            }
            return new NoteViewModel(aVar5, dVar, bVar, cVar, eVar, longValue, longValue2, str2, jArr);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Lcom/noto/app/AppViewModel;", "invoke", "(Lorg/koin/core/scope/a;Ljb/a;)Lcom/noto/app/AppViewModel;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.KoinModulesKt$appModule$1$4  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass4 extends Lambda implements p<org.koin.core.scope.a, jb.a, AppViewModel> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass4 f9830j = new AnonymousClass4();

        public AnonymousClass4() {
            super(2);
        }

        @Override // u7.p
        public final AppViewModel R(org.koin.core.scope.a aVar, jb.a aVar2) {
            org.koin.core.scope.a aVar3 = aVar;
            g.f(aVar3, "$this$viewModel");
            g.f(aVar2, "it");
            return new AppViewModel((u6.a) aVar3.a(null, i.a(u6.a.class), null), (d) aVar3.a(null, i.a(d.class), null), (e) aVar3.a(null, i.a(e.class), null));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Lcom/noto/app/settings/c;", "invoke", "(Lorg/koin/core/scope/a;Ljb/a;)Lcom/noto/app/settings/c;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.KoinModulesKt$appModule$1$5  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass5 extends Lambda implements p<org.koin.core.scope.a, jb.a, com.noto.app.settings.c> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass5 f9831j = new AnonymousClass5();

        public AnonymousClass5() {
            super(2);
        }

        @Override // u7.p
        public final com.noto.app.settings.c R(org.koin.core.scope.a aVar, jb.a aVar2) {
            org.koin.core.scope.a aVar3 = aVar;
            g.f(aVar3, "$this$viewModel");
            g.f(aVar2, "it");
            return new com.noto.app.settings.c((u6.a) aVar3.a(null, i.a(u6.a.class), null), (d) aVar3.a(null, i.a(d.class), null), (b) aVar3.a(null, i.a(b.class), null), (c) aVar3.a(null, i.a(c.class), null), (e) aVar3.a(null, i.a(e.class), null));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Lcom/noto/app/label/LabelViewModel;", "invoke", "(Lorg/koin/core/scope/a;Ljb/a;)Lcom/noto/app/label/LabelViewModel;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.KoinModulesKt$appModule$1$6  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass6 extends Lambda implements p<org.koin.core.scope.a, jb.a, LabelViewModel> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass6 f9832j = new AnonymousClass6();

        public AnonymousClass6() {
            super(2);
        }

        @Override // u7.p
        public final LabelViewModel R(org.koin.core.scope.a aVar, jb.a aVar2) {
            org.koin.core.scope.a aVar3 = aVar;
            jb.a aVar4 = aVar2;
            g.f(aVar3, "$this$viewModel");
            g.f(aVar4, "it");
            return new LabelViewModel((u6.a) aVar3.a(null, i.a(u6.a.class), null), (b) aVar3.a(null, i.a(b.class), null), ((Number) aVar4.a(0)).longValue(), ((Number) aVar4.a(1)).longValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Lcom/noto/app/widget/FolderListWidgetConfigViewModel;", "invoke", "(Lorg/koin/core/scope/a;Ljb/a;)Lcom/noto/app/widget/FolderListWidgetConfigViewModel;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.KoinModulesKt$appModule$1$7  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass7 extends Lambda implements p<org.koin.core.scope.a, jb.a, FolderListWidgetConfigViewModel> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass7 f9833j = new AnonymousClass7();

        public AnonymousClass7() {
            super(2);
        }

        @Override // u7.p
        public final FolderListWidgetConfigViewModel R(org.koin.core.scope.a aVar, jb.a aVar2) {
            org.koin.core.scope.a aVar3 = aVar;
            jb.a aVar4 = aVar2;
            g.f(aVar3, "$this$viewModel");
            g.f(aVar4, "it");
            Object b5 = aVar4.b(i.a(Integer.class));
            if (b5 != null) {
                return new FolderListWidgetConfigViewModel(((Number) b5).intValue(), (u6.a) aVar3.a(null, i.a(u6.a.class), null), (d) aVar3.a(null, i.a(d.class), null), (e) aVar3.a(null, i.a(e.class), null));
            }
            throw new DefinitionParameterException("No value found for type '" + mb.a.a(i.a(Integer.class)) + '\'');
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Lcom/noto/app/widget/NoteListWidgetConfigViewModel;", "invoke", "(Lorg/koin/core/scope/a;Ljb/a;)Lcom/noto/app/widget/NoteListWidgetConfigViewModel;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.KoinModulesKt$appModule$1$8  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass8 extends Lambda implements p<org.koin.core.scope.a, jb.a, NoteListWidgetConfigViewModel> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass8 f9834j = new AnonymousClass8();

        public AnonymousClass8() {
            super(2);
        }

        @Override // u7.p
        public final NoteListWidgetConfigViewModel R(org.koin.core.scope.a aVar, jb.a aVar2) {
            org.koin.core.scope.a aVar3 = aVar;
            jb.a aVar4 = aVar2;
            g.f(aVar3, "$this$viewModel");
            g.f(aVar4, "it");
            Object b5 = aVar4.b(i.a(Integer.class));
            if (b5 != null) {
                return new NoteListWidgetConfigViewModel(((Number) b5).intValue(), (u6.a) aVar3.a(null, i.a(u6.a.class), null), (d) aVar3.a(null, i.a(d.class), null), (b) aVar3.a(null, i.a(b.class), null), (c) aVar3.a(null, i.a(c.class), null), (e) aVar3.a(null, i.a(e.class), null));
            }
            throw new DefinitionParameterException("No value found for type '" + mb.a.a(i.a(Integer.class)) + '\'');
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/a;", "Ljb/a;", "it", "Lcom/noto/app/note/NotePagerViewModel;", "invoke", "(Lorg/koin/core/scope/a;Ljb/a;)Lcom/noto/app/note/NotePagerViewModel;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.KoinModulesKt$appModule$1$9  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass9 extends Lambda implements p<org.koin.core.scope.a, jb.a, NotePagerViewModel> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass9 f9835j = new AnonymousClass9();

        public AnonymousClass9() {
            super(2);
        }

        @Override // u7.p
        public final NotePagerViewModel R(org.koin.core.scope.a aVar, jb.a aVar2) {
            org.koin.core.scope.a aVar3 = aVar;
            jb.a aVar4 = aVar2;
            g.f(aVar3, "$this$viewModel");
            g.f(aVar4, "it");
            return new NotePagerViewModel((u6.a) aVar3.a(null, i.a(u6.a.class), null), (d) aVar3.a(null, i.a(d.class), null), (e) aVar3.a(null, i.a(e.class), null), ((Number) aVar4.a(0)).longValue(), ((Number) aVar4.a(1)).longValue(), (long[]) aVar4.a(2));
        }
    }

    public KoinModulesKt$appModule$1() {
        super(1);
    }

    @Override // u7.l
    public final n U(a aVar) {
        a aVar2 = aVar;
        g.f(aVar2, "$this$module");
        AnonymousClass1 anonymousClass1 = AnonymousClass1.f9826j;
        kb.b bVar = lb.b.c;
        Kind kind = Kind.Factory;
        EmptyList emptyList = EmptyList.f12981i;
        BeanDefinition beanDefinition = new BeanDefinition(bVar, i.a(MainViewModel.class), anonymousClass1, kind, emptyList);
        aVar2.a(a1.c.K0(beanDefinition.f16507b, null, bVar), new gb.a(beanDefinition), false);
        BeanDefinition beanDefinition2 = new BeanDefinition(bVar, i.a(FolderViewModel.class), AnonymousClass2.f9828j, kind, emptyList);
        aVar2.a(a1.c.K0(beanDefinition2.f16507b, null, bVar), new gb.a(beanDefinition2), false);
        BeanDefinition beanDefinition3 = new BeanDefinition(bVar, i.a(NoteViewModel.class), AnonymousClass3.f9829j, kind, emptyList);
        aVar2.a(a1.c.K0(beanDefinition3.f16507b, null, bVar), new gb.a(beanDefinition3), false);
        BeanDefinition beanDefinition4 = new BeanDefinition(bVar, i.a(AppViewModel.class), AnonymousClass4.f9830j, kind, emptyList);
        aVar2.a(a1.c.K0(beanDefinition4.f16507b, null, bVar), new gb.a(beanDefinition4), false);
        BeanDefinition beanDefinition5 = new BeanDefinition(bVar, i.a(com.noto.app.settings.c.class), AnonymousClass5.f9831j, kind, emptyList);
        aVar2.a(a1.c.K0(beanDefinition5.f16507b, null, bVar), new gb.a(beanDefinition5), false);
        BeanDefinition beanDefinition6 = new BeanDefinition(bVar, i.a(LabelViewModel.class), AnonymousClass6.f9832j, kind, emptyList);
        aVar2.a(a1.c.K0(beanDefinition6.f16507b, null, bVar), new gb.a(beanDefinition6), false);
        BeanDefinition beanDefinition7 = new BeanDefinition(bVar, i.a(FolderListWidgetConfigViewModel.class), AnonymousClass7.f9833j, kind, emptyList);
        aVar2.a(a1.c.K0(beanDefinition7.f16507b, null, bVar), new gb.a(beanDefinition7), false);
        BeanDefinition beanDefinition8 = new BeanDefinition(bVar, i.a(NoteListWidgetConfigViewModel.class), AnonymousClass8.f9834j, kind, emptyList);
        aVar2.a(a1.c.K0(beanDefinition8.f16507b, null, bVar), new gb.a(beanDefinition8), false);
        BeanDefinition beanDefinition9 = new BeanDefinition(bVar, i.a(NotePagerViewModel.class), AnonymousClass9.f9835j, kind, emptyList);
        aVar2.a(a1.c.K0(beanDefinition9.f16507b, null, bVar), new gb.a(beanDefinition9), false);
        BeanDefinition beanDefinition10 = new BeanDefinition(bVar, i.a(FilteredViewModel.class), AnonymousClass10.f9827j, kind, emptyList);
        aVar2.a(a1.c.K0(beanDefinition10.f16507b, null, bVar), new gb.a(beanDefinition10), false);
        return n.f16010a;
    }
}
