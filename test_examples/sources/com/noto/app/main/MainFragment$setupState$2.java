package com.noto.app.main;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.noto.app.domain.model.FolderListSortingType;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import s6.x;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/noto/app/domain/model/FolderListSortingType;", "sortingType", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.main.MainFragment$setupState$2", f = "MainFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class MainFragment$setupState$2 extends SuspendLambda implements p<FolderListSortingType, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8887m;
    public final /* synthetic */ x n;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8888a;

        static {
            int[] iArr = new int[FolderListSortingType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f8888a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainFragment$setupState$2(x xVar, p7.c<? super MainFragment$setupState$2> cVar) {
        super(2, cVar);
        this.n = xVar;
    }

    @Override // u7.p
    public final Object R(FolderListSortingType folderListSortingType, p7.c<? super n> cVar) {
        return ((MainFragment$setupState$2) a(folderListSortingType, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        MainFragment$setupState$2 mainFragment$setupState$2 = new MainFragment$setupState$2(this.n, cVar);
        mainFragment$setupState$2.f8887m = obj;
        return mainFragment$setupState$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        RecyclerView.i a10;
        m0.b.n1(obj);
        EpoxyRecyclerView epoxyRecyclerView = this.n.f17482b;
        if (a.f8888a[((FolderListSortingType) this.f8887m).ordinal()] == 1) {
            a10 = new e();
            a10.c = 250L;
            a10.f5688f = 250L;
            a10.f5687e = 250L;
            a10.f5686d = 250L;
        } else {
            a10 = f7.c.a();
        }
        epoxyRecyclerView.setItemAnimator(a10);
        return n.f16010a;
    }
}
