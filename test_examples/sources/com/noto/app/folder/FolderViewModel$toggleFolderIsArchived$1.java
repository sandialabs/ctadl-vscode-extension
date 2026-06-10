package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.util.ModelUtilsKt;
import ja.x;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderViewModel$toggleFolderIsArchived$1", f = "FolderViewModel.kt", l = {212}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderViewModel$toggleFolderIsArchived$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f8536m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ FolderViewModel f8537o;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", "Lt6/a;", "", "entry", "<anonymous parameter 1>", "Lm7/n;", "invoke", "(Lkotlin/Pair;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.folder.FolderViewModel$toggleFolderIsArchived$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements u7.p<Pair<? extends t6.a, ? extends Integer>, Integer, m7.n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ x f8538j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ FolderViewModel f8539k;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
        @q7.c(c = "com.noto.app.folder.FolderViewModel$toggleFolderIsArchived$1$1$1", f = "FolderViewModel.kt", l = {215}, m = "invokeSuspend")
        /* renamed from: com.noto.app.folder.FolderViewModel$toggleFolderIsArchived$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        final class C00701 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

            /* renamed from: m  reason: collision with root package name */
            public int f8540m;
            public final /* synthetic */ FolderViewModel n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ Pair<t6.a, Integer> f8541o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00701(FolderViewModel folderViewModel, Pair<t6.a, Integer> pair, p7.c<? super C00701> cVar) {
                super(2, cVar);
                this.n = folderViewModel;
                this.f8541o = pair;
            }

            @Override // u7.p
            public final Object R(x xVar, p7.c<? super m7.n> cVar) {
                return ((C00701) a(xVar, cVar)).k(m7.n.f16010a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
                return new C00701(this.n, this.f8541o, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object k(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f8540m;
                if (i10 != 0) {
                    if (i10 == 1) {
                        m0.b.n1(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    u6.a aVar = this.n.f8425d;
                    t6.a aVar2 = this.f8541o.f12962i;
                    t6.a a10 = t6.a.a(aVar2, null, null, 0, null, null, 0, !aVar2.f17599i, false, false, null, null, null, null, null, false, 0, null, null, null, 2031359);
                    this.f8540m = 1;
                    if (aVar.f(a10, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return m7.n.f16010a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(x xVar, FolderViewModel folderViewModel) {
            super(2);
            this.f8538j = xVar;
            this.f8539k = folderViewModel;
        }

        @Override // u7.p
        public final m7.n R(Pair<? extends t6.a, ? extends Integer> pair, Integer num) {
            Pair<? extends t6.a, ? extends Integer> pair2 = pair;
            num.intValue();
            v7.g.f(pair2, "entry");
            m0.b.M0(this.f8538j, null, null, new C00701(this.f8539k, pair2, null), 3);
            return m7.n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$toggleFolderIsArchived$1(FolderViewModel folderViewModel, p7.c<? super FolderViewModel$toggleFolderIsArchived$1> cVar) {
        super(2, cVar);
        this.f8537o = folderViewModel;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((FolderViewModel$toggleFolderIsArchived$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        FolderViewModel$toggleFolderIsArchived$1 folderViewModel$toggleFolderIsArchived$1 = new FolderViewModel$toggleFolderIsArchived$1(this.f8537o, cVar);
        folderViewModel$toggleFolderIsArchived$1.n = obj;
        return folderViewModel$toggleFolderIsArchived$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        x xVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f8536m;
        FolderViewModel folderViewModel = this.f8537o;
        if (i10 != 0) {
            if (i10 == 1) {
                xVar = (x) this.n;
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            x xVar2 = (x) this.n;
            u6.a aVar = folderViewModel.f8425d;
            t6.a a10 = t6.a.a((t6.a) ((kotlinx.coroutines.flow.m) folderViewModel.k()).getValue(), null, null, 0, null, null, 0, !((t6.a) ((kotlinx.coroutines.flow.m) folderViewModel.k()).getValue()).f17599i, false, false, null, null, null, null, null, false, 0, null, null, null, 2031357);
            this.n = xVar2;
            this.f8536m = 1;
            if (aVar.f(a10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            xVar = xVar2;
        }
        ModelUtilsKt.l(((t6.a) ((kotlinx.coroutines.flow.m) folderViewModel.k()).getValue()).f17610u, 1, new AnonymousClass1(xVar, folderViewModel));
        return m7.n.f16010a;
    }
}
