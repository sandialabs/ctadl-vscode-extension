package androidx.compose.runtime;

import android.os.Trace;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.c0;
import g0.f0;
import ja.x;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m7.n;
import p0.w;
import u7.l;
import u7.q;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lja/x;", "Lg0/c0;", "parentFrameClock", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@q7.c(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {485, 503}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements q<x, c0, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public List f2814m;
    public List n;

    /* renamed from: o  reason: collision with root package name */
    public List f2815o;

    /* renamed from: p  reason: collision with root package name */
    public Set f2816p;

    /* renamed from: q  reason: collision with root package name */
    public Set f2817q;

    /* renamed from: r  reason: collision with root package name */
    public int f2818r;

    /* renamed from: s  reason: collision with root package name */
    public /* synthetic */ c0 f2819s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Recomposer f2820t;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTime", "Lm7/n;", "invoke", "(J)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements l<Long, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Recomposer f2821j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ List<g0.l> f2822k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ List<f0> f2823l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ Set<g0.l> f2824m;
        public final /* synthetic */ List<g0.l> n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ Set<g0.l> f2825o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Recomposer recomposer, List<g0.l> list, List<f0> list2, Set<g0.l> set, List<g0.l> list3, Set<g0.l> set2) {
            super(1);
            this.f2821j = recomposer;
            this.f2822k = list;
            this.f2823l = list2;
            this.f2824m = set;
            this.n = list3;
            this.f2825o = set2;
        }

        @Override // u7.l
        public final n U(Long l2) {
            boolean z10;
            boolean z11;
            long longValue = l2.longValue();
            boolean z12 = false;
            if (this.f2821j.f2775a.e()) {
                Recomposer recomposer = this.f2821j;
                Trace.beginSection("Recomposer:animation");
                try {
                    recomposer.f2775a.f(longValue);
                    synchronized (SnapshotKt.c) {
                        Set<w> set = SnapshotKt.f2945i.get().f16588g;
                        if (set != null && (!set.isEmpty())) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    if (z11) {
                        SnapshotKt.a();
                    }
                    n nVar = n.f16010a;
                    Trace.endSection();
                } finally {
                }
            }
            Recomposer recomposer2 = this.f2821j;
            List<g0.l> list = this.f2822k;
            List<f0> list2 = this.f2823l;
            Set<g0.l> set2 = this.f2824m;
            List<g0.l> list3 = this.n;
            Set<g0.l> set3 = this.f2825o;
            Trace.beginSection("Recomposer:recompose");
            try {
                synchronized (recomposer2.f2777d) {
                    Recomposer.t(recomposer2);
                    ArrayList arrayList = recomposer2.f2782i;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.add((g0.l) arrayList.get(i10));
                    }
                    recomposer2.f2782i.clear();
                    n nVar2 = n.f16010a;
                }
                h0.c<Object> cVar = new h0.c<>();
                h0.c cVar2 = new h0.c();
                while (true) {
                    if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
                        break;
                    }
                    try {
                        int size2 = list.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            g0.l lVar = list.get(i11);
                            cVar2.add(lVar);
                            g0.l s10 = Recomposer.s(recomposer2, lVar, cVar);
                            if (s10 != null) {
                                list3.add(s10);
                                n nVar3 = n.f16010a;
                            }
                        }
                        list.clear();
                        if (cVar.f11325i > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            synchronized (recomposer2.f2777d) {
                                ArrayList arrayList2 = recomposer2.f2780g;
                                int size3 = arrayList2.size();
                                for (int i12 = 0; i12 < size3; i12++) {
                                    g0.l lVar2 = (g0.l) arrayList2.get(i12);
                                    if (!cVar2.contains(lVar2) && lVar2.k(cVar)) {
                                        list.add(lVar2);
                                    }
                                }
                                n nVar4 = n.f16010a;
                            }
                        }
                        if (list.isEmpty()) {
                            while (true) {
                                try {
                                    Recomposer$runRecomposeAndApplyChanges$2.q(list2, recomposer2);
                                    if (!list2.isEmpty()) {
                                        n7.n.f2(recomposer2.C(list2, cVar), set2);
                                    }
                                } catch (Exception e10) {
                                    Recomposer.E(recomposer2, e10, true, 2);
                                    Recomposer$runRecomposeAndApplyChanges$2.p(list, list2, list3, set2, set3);
                                }
                            }
                        }
                        z12 = false;
                    } catch (Exception e11) {
                        Recomposer.E(recomposer2, e11, true, 2);
                        Recomposer$runRecomposeAndApplyChanges$2.p(list, list2, list3, set2, set3);
                        list.clear();
                    }
                }
                if (!list3.isEmpty()) {
                    try {
                        n7.n.f2(list3, set3);
                        int size4 = list3.size();
                        for (int i13 = 0; i13 < size4; i13++) {
                            list3.get(i13).c();
                        }
                        list3.clear();
                    } catch (Exception e12) {
                        Recomposer.E(recomposer2, e12, z12, 6);
                        Recomposer$runRecomposeAndApplyChanges$2.p(list, list2, list3, set2, set3);
                        list3.clear();
                    }
                }
                if (!set2.isEmpty()) {
                    try {
                        n7.n.f2(set2, set3);
                        for (g0.l lVar3 : set2) {
                            lVar3.o();
                        }
                        set2.clear();
                    } catch (Exception e13) {
                        Recomposer.E(recomposer2, e13, z12, 6);
                        Recomposer$runRecomposeAndApplyChanges$2.p(list, list2, list3, set2, set3);
                        set2.clear();
                    }
                }
                if (!set3.isEmpty()) {
                    try {
                        for (g0.l lVar4 : set3) {
                            lVar4.p();
                        }
                        set3.clear();
                    } catch (Exception e14) {
                        Recomposer.E(recomposer2, e14, z12, 6);
                        Recomposer$runRecomposeAndApplyChanges$2.p(list, list2, list3, set2, set3);
                        set3.clear();
                    }
                }
                synchronized (recomposer2.f2777d) {
                    recomposer2.x();
                }
                Trace.endSection();
                return n.f16010a;
            } finally {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, p7.c<? super Recomposer$runRecomposeAndApplyChanges$2> cVar) {
        super(3, cVar);
        this.f2820t = recomposer;
    }

    public static final void p(List list, List list2, List list3, Set set, Set set2) {
        list.clear();
        list2.clear();
        list3.clear();
        set.clear();
        set2.clear();
    }

    public static final void q(List list, Recomposer recomposer) {
        list.clear();
        synchronized (recomposer.f2777d) {
            ArrayList arrayList = recomposer.f2784k;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.add((f0) arrayList.get(i10));
            }
            recomposer.f2784k.clear();
            n nVar = n.f16010a;
        }
    }

    @Override // u7.q
    public final Object O(x xVar, c0 c0Var, p7.c<? super n> cVar) {
        x xVar2 = xVar;
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.f2820t, cVar);
        recomposer$runRecomposeAndApplyChanges$2.f2819s = c0Var;
        return recomposer$runRecomposeAndApplyChanges$2.k(n.f16010a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9 A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:17:0x0091, B:19:0x009b, B:25:0x00a9, B:27:0x00b5), top: B:46:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ca -> B:11:0x006a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00fb -> B:43:0x00ff). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        c0 c0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2;
        LinkedHashSet linkedHashSet3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$22;
        LinkedHashSet linkedHashSet4;
        Recomposer recomposer;
        boolean z10;
        boolean z11;
        boolean z12;
        Recomposer recomposer2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2818r;
        int i11 = 1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ?? r22 = this.f2817q;
                    ?? r52 = this.f2816p;
                    ?? r62 = this.f2815o;
                    ?? r72 = this.n;
                    ?? r82 = this.f2814m;
                    c0 c0Var2 = this.f2819s;
                    m0.b.n1(obj);
                    recomposer$runRecomposeAndApplyChanges$2 = this;
                    linkedHashSet3 = r52;
                    linkedHashSet2 = r22;
                    c0Var = c0Var2;
                    arrayList3 = r62;
                    arrayList2 = r72;
                    ArrayList arrayList7 = r82;
                    Recomposer.q(recomposer$runRecomposeAndApplyChanges$2.f2820t);
                    arrayList = arrayList7;
                    linkedHashSet = linkedHashSet3;
                    i11 = 1;
                    Recomposer.r(recomposer$runRecomposeAndApplyChanges$2.f2820t);
                    recomposer2 = recomposer$runRecomposeAndApplyChanges$2.f2820t;
                    recomposer$runRecomposeAndApplyChanges$2.f2819s = c0Var;
                    recomposer$runRecomposeAndApplyChanges$2.f2814m = arrayList;
                    recomposer$runRecomposeAndApplyChanges$2.n = arrayList2;
                    recomposer$runRecomposeAndApplyChanges$2.f2815o = arrayList3;
                    recomposer$runRecomposeAndApplyChanges$2.f2816p = linkedHashSet;
                    recomposer$runRecomposeAndApplyChanges$2.f2817q = linkedHashSet2;
                    recomposer$runRecomposeAndApplyChanges$2.f2818r = i11;
                    if (Recomposer.p(recomposer2, recomposer$runRecomposeAndApplyChanges$2) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    arrayList6 = arrayList;
                    arrayList5 = arrayList2;
                    arrayList4 = arrayList3;
                    linkedHashSet3 = linkedHashSet;
                    recomposer$runRecomposeAndApplyChanges$22 = recomposer$runRecomposeAndApplyChanges$2;
                    linkedHashSet4 = linkedHashSet2;
                    recomposer = recomposer$runRecomposeAndApplyChanges$22.f2820t;
                    synchronized (recomposer.f2777d) {
                        try {
                            z10 = false;
                            if ((recomposer.f2782i.isEmpty() ^ i11) == 0 && !recomposer.f2775a.e()) {
                                z11 = false;
                                if (!z11) {
                                    Recomposer.t(recomposer);
                                    if ((recomposer.f2782i.isEmpty() ^ i11) == 0 && !recomposer.f2775a.e()) {
                                        z12 = false;
                                        if (!z12) {
                                            z10 = true;
                                        }
                                    }
                                    z12 = true;
                                    if (!z12) {
                                    }
                                }
                            }
                            z11 = true;
                            if (!z11) {
                            }
                        } finally {
                        }
                    }
                    if (z10) {
                        linkedHashSet2 = linkedHashSet4;
                        recomposer$runRecomposeAndApplyChanges$2 = recomposer$runRecomposeAndApplyChanges$22;
                        arrayList = arrayList6;
                        arrayList2 = arrayList5;
                        arrayList3 = arrayList4;
                        linkedHashSet = linkedHashSet3;
                        Recomposer.r(recomposer$runRecomposeAndApplyChanges$2.f2820t);
                        recomposer2 = recomposer$runRecomposeAndApplyChanges$2.f2820t;
                        recomposer$runRecomposeAndApplyChanges$2.f2819s = c0Var;
                        recomposer$runRecomposeAndApplyChanges$2.f2814m = arrayList;
                        recomposer$runRecomposeAndApplyChanges$2.n = arrayList2;
                        recomposer$runRecomposeAndApplyChanges$2.f2815o = arrayList3;
                        recomposer$runRecomposeAndApplyChanges$2.f2816p = linkedHashSet;
                        recomposer$runRecomposeAndApplyChanges$2.f2817q = linkedHashSet2;
                        recomposer$runRecomposeAndApplyChanges$2.f2818r = i11;
                        if (Recomposer.p(recomposer2, recomposer$runRecomposeAndApplyChanges$2) != coroutineSingletons) {
                        }
                    } else {
                        LinkedHashSet linkedHashSet5 = linkedHashSet4;
                        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$23 = recomposer$runRecomposeAndApplyChanges$22;
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(recomposer$runRecomposeAndApplyChanges$22.f2820t, arrayList6, arrayList5, linkedHashSet3, arrayList4, linkedHashSet5);
                        recomposer$runRecomposeAndApplyChanges$23.f2819s = c0Var;
                        recomposer$runRecomposeAndApplyChanges$23.f2814m = arrayList6;
                        recomposer$runRecomposeAndApplyChanges$23.n = arrayList5;
                        recomposer$runRecomposeAndApplyChanges$23.f2815o = arrayList4;
                        recomposer$runRecomposeAndApplyChanges$23.f2816p = linkedHashSet3;
                        linkedHashSet2 = linkedHashSet5;
                        recomposer$runRecomposeAndApplyChanges$23.f2817q = linkedHashSet2;
                        recomposer$runRecomposeAndApplyChanges$23.f2818r = 2;
                        if (c0Var.D(recomposer$runRecomposeAndApplyChanges$23, anonymousClass2) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        recomposer$runRecomposeAndApplyChanges$2 = recomposer$runRecomposeAndApplyChanges$23;
                        arrayList7 = arrayList6;
                        arrayList2 = arrayList5;
                        arrayList3 = arrayList4;
                        Recomposer.q(recomposer$runRecomposeAndApplyChanges$2.f2820t);
                        arrayList = arrayList7;
                        linkedHashSet = linkedHashSet3;
                        i11 = 1;
                        Recomposer.r(recomposer$runRecomposeAndApplyChanges$2.f2820t);
                        recomposer2 = recomposer$runRecomposeAndApplyChanges$2.f2820t;
                        recomposer$runRecomposeAndApplyChanges$2.f2819s = c0Var;
                        recomposer$runRecomposeAndApplyChanges$2.f2814m = arrayList;
                        recomposer$runRecomposeAndApplyChanges$2.n = arrayList2;
                        recomposer$runRecomposeAndApplyChanges$2.f2815o = arrayList3;
                        recomposer$runRecomposeAndApplyChanges$2.f2816p = linkedHashSet;
                        recomposer$runRecomposeAndApplyChanges$2.f2817q = linkedHashSet2;
                        recomposer$runRecomposeAndApplyChanges$2.f2818r = i11;
                        if (Recomposer.p(recomposer2, recomposer$runRecomposeAndApplyChanges$2) != coroutineSingletons) {
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ?? r23 = this.f2817q;
                ?? r53 = this.f2816p;
                ?? r63 = this.f2815o;
                ?? r73 = this.n;
                ?? r83 = this.f2814m;
                c0 c0Var3 = this.f2819s;
                m0.b.n1(obj);
                recomposer$runRecomposeAndApplyChanges$22 = this;
                linkedHashSet4 = r23;
                linkedHashSet3 = r53;
                arrayList4 = r63;
                arrayList5 = r73;
                arrayList6 = r83;
                c0Var = c0Var3;
                recomposer = recomposer$runRecomposeAndApplyChanges$22.f2820t;
                synchronized (recomposer.f2777d) {
                }
            }
        } else {
            m0.b.n1(obj);
            c0Var = this.f2819s;
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            arrayList3 = new ArrayList();
            linkedHashSet = new LinkedHashSet();
            linkedHashSet2 = new LinkedHashSet();
            recomposer$runRecomposeAndApplyChanges$2 = this;
            Recomposer.r(recomposer$runRecomposeAndApplyChanges$2.f2820t);
            recomposer2 = recomposer$runRecomposeAndApplyChanges$2.f2820t;
            recomposer$runRecomposeAndApplyChanges$2.f2819s = c0Var;
            recomposer$runRecomposeAndApplyChanges$2.f2814m = arrayList;
            recomposer$runRecomposeAndApplyChanges$2.n = arrayList2;
            recomposer$runRecomposeAndApplyChanges$2.f2815o = arrayList3;
            recomposer$runRecomposeAndApplyChanges$2.f2816p = linkedHashSet;
            recomposer$runRecomposeAndApplyChanges$2.f2817q = linkedHashSet2;
            recomposer$runRecomposeAndApplyChanges$2.f2818r = i11;
            if (Recomposer.p(recomposer2, recomposer$runRecomposeAndApplyChanges$2) != coroutineSingletons) {
            }
        }
    }
}
