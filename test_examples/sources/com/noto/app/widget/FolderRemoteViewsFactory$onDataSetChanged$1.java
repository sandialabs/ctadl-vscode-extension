package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.FolderListSortingType;
import com.noto.app.domain.model.SortingOrder;
import com.noto.app.util.ModelUtilsKt;
import ja.x;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.i;
import m7.n;
import n7.l;
import q7.c;
import u6.d;
import u6.e;
import u7.p;
import u7.q;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.FolderRemoteViewsFactory$onDataSetChanged$1", f = "FolderRemoteViewsFactory.kt", l = {36, 37, 38, 47}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderRemoteViewsFactory$onDataSetChanged$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public FolderListSortingType f10010m;
    public SortingOrder n;

    /* renamed from: o  reason: collision with root package name */
    public FolderRemoteViewsFactory f10011o;

    /* renamed from: p  reason: collision with root package name */
    public int f10012p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ FolderRemoteViewsFactory f10013q;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00050\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@"}, d2 = {"", "Lt6/a;", "folders", "Lt6/b;", "foldersNotesCount", "Lkotlin/Pair;", "", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.FolderRemoteViewsFactory$onDataSetChanged$1$1", f = "FolderRemoteViewsFactory.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.FolderRemoteViewsFactory$onDataSetChanged$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements q<List<? extends t6.a>, List<? extends t6.b>, p7.c<? super List<? extends Pair<? extends t6.a, ? extends Integer>>>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ List f10014m;
        public /* synthetic */ List n;

        public AnonymousClass1(p7.c<? super AnonymousClass1> cVar) {
            super(3, cVar);
        }

        @Override // u7.q
        public final Object O(List<? extends t6.a> list, List<? extends t6.b> list2, p7.c<? super List<? extends Pair<? extends t6.a, ? extends Integer>>> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.f10014m = list;
            anonymousClass1.n = list2;
            return anonymousClass1.k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            int i10;
            Object obj2;
            boolean z10;
            m0.b.n1(obj);
            List<t6.a> list = this.f10014m;
            List list2 = this.n;
            ArrayList arrayList = new ArrayList(l.Z1(list, 10));
            for (t6.a aVar : list) {
                Iterator it = list2.iterator();
                while (true) {
                    i10 = 0;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((t6.b) obj2).f17613a == aVar.f17592a) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (z10) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                t6.b bVar = (t6.b) obj2;
                if (bVar != null) {
                    i10 = bVar.f17614b;
                }
                arrayList.add(new Pair(aVar, new Integer(i10)));
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return a1.c.g0(Boolean.valueOf(((t6.a) ((Pair) t11).f12962i).f17600j), Boolean.valueOf(((t6.a) ((Pair) t10).f12962i).f17600j));
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return a1.c.g0(Boolean.valueOf(ModelUtilsKt.u((t6.a) ((Pair) t11).f12962i)), Boolean.valueOf(ModelUtilsKt.u((t6.a) ((Pair) t10).f12962i)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderRemoteViewsFactory$onDataSetChanged$1(FolderRemoteViewsFactory folderRemoteViewsFactory, p7.c<? super FolderRemoteViewsFactory$onDataSetChanged$1> cVar) {
        super(2, cVar);
        this.f10013q = folderRemoteViewsFactory;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((FolderRemoteViewsFactory$onDataSetChanged$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new FolderRemoteViewsFactory$onDataSetChanged$1(this.f10013q, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        FolderListSortingType folderListSortingType;
        Object a10;
        FolderListSortingType folderListSortingType2;
        FolderRemoteViewsFactory folderRemoteViewsFactory;
        SortingOrder sortingOrder;
        SortingOrder sortingOrder2;
        FolderListSortingType folderListSortingType3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f10012p;
        FolderRemoteViewsFactory folderRemoteViewsFactory2 = this.f10013q;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            folderRemoteViewsFactory2 = this.f10011o;
                            sortingOrder2 = this.n;
                            folderListSortingType3 = this.f10010m;
                            m0.b.n1(obj);
                            folderRemoteViewsFactory2.n = kotlin.collections.c.G2(kotlin.collections.c.G2(ModelUtilsKt.A((List) obj, folderListSortingType3, sortingOrder2), new a()), new b());
                            return n.f16010a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    folderRemoteViewsFactory = this.f10011o;
                    sortingOrder = this.n;
                    folderListSortingType2 = this.f10010m;
                    m0.b.n1(obj);
                    folderRemoteViewsFactory.f10005o = ((Boolean) obj).booleanValue();
                    FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(new i(((u6.a) folderRemoteViewsFactory2.f10001j.getValue()).e(), ((d) folderRemoteViewsFactory2.f10002k.getValue()).h(), new AnonymousClass1(null)));
                    this.f10010m = folderListSortingType2;
                    this.n = sortingOrder;
                    this.f10011o = folderRemoteViewsFactory2;
                    this.f10012p = 4;
                    obj = FlowKt__ReduceKt.a(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, this);
                    if (obj != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    sortingOrder2 = sortingOrder;
                    folderListSortingType3 = folderListSortingType2;
                    folderRemoteViewsFactory2.n = kotlin.collections.c.G2(kotlin.collections.c.G2(ModelUtilsKt.A((List) obj, folderListSortingType3, sortingOrder2), new a()), new b());
                    return n.f16010a;
                }
                folderListSortingType = this.f10010m;
                m0.b.n1(obj);
                SortingOrder sortingOrder3 = (SortingOrder) obj;
                kotlinx.coroutines.flow.b<Boolean> G = ((e) folderRemoteViewsFactory2.f10003l.getValue()).G(folderRemoteViewsFactory2.f10004m);
                this.f10010m = folderListSortingType;
                this.n = sortingOrder3;
                this.f10011o = folderRemoteViewsFactory2;
                this.f10012p = 3;
                a10 = FlowKt__ReduceKt.a(G, this);
                if (a10 != coroutineSingletons) {
                    return coroutineSingletons;
                }
                folderListSortingType2 = folderListSortingType;
                folderRemoteViewsFactory = folderRemoteViewsFactory2;
                sortingOrder = sortingOrder3;
                obj = a10;
                folderRemoteViewsFactory.f10005o = ((Boolean) obj).booleanValue();
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(new i(((u6.a) folderRemoteViewsFactory2.f10001j.getValue()).e(), ((d) folderRemoteViewsFactory2.f10002k.getValue()).h(), new AnonymousClass1(null)));
                this.f10010m = folderListSortingType2;
                this.n = sortingOrder;
                this.f10011o = folderRemoteViewsFactory2;
                this.f10012p = 4;
                obj = FlowKt__ReduceKt.a(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$12, this);
                if (obj != coroutineSingletons) {
                }
            } else {
                m0.b.n1(obj);
            }
        } else {
            m0.b.n1(obj);
            kotlinx.coroutines.flow.b<FolderListSortingType> o10 = ((e) folderRemoteViewsFactory2.f10003l.getValue()).o();
            this.f10012p = 1;
            obj = FlowKt__ReduceKt.a(o10, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        folderListSortingType = (FolderListSortingType) obj;
        kotlinx.coroutines.flow.b<SortingOrder> N = ((e) folderRemoteViewsFactory2.f10003l.getValue()).N();
        this.f10010m = folderListSortingType;
        this.f10012p = 2;
        obj = FlowKt__ReduceKt.a(N, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        SortingOrder sortingOrder32 = (SortingOrder) obj;
        kotlinx.coroutines.flow.b<Boolean> G2 = ((e) folderRemoteViewsFactory2.f10003l.getValue()).G(folderRemoteViewsFactory2.f10004m);
        this.f10010m = folderListSortingType;
        this.n = sortingOrder32;
        this.f10011o = folderRemoteViewsFactory2;
        this.f10012p = 3;
        a10 = FlowKt__ReduceKt.a(G2, this);
        if (a10 != coroutineSingletons) {
        }
    }
}
