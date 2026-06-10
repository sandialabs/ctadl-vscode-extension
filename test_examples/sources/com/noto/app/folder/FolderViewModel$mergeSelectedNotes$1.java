package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x6.h0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderViewModel$mergeSelectedNotes$1", f = "FolderViewModel.kt", l = {333}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderViewModel$mergeSelectedNotes$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f8506m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object f8507o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ FolderViewModel f8508p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$mergeSelectedNotes$1(FolderViewModel folderViewModel, p7.c<? super FolderViewModel$mergeSelectedNotes$1> cVar) {
        super(2, cVar);
        this.f8508p = folderViewModel;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((FolderViewModel$mergeSelectedNotes$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        FolderViewModel$mergeSelectedNotes$1 folderViewModel$mergeSelectedNotes$1 = new FolderViewModel$mergeSelectedNotes$1(this.f8508p, cVar);
        folderViewModel$mergeSelectedNotes$1.f8507o = obj;
        return folderViewModel$mergeSelectedNotes$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        x xVar;
        boolean z10;
        Object g10;
        ArrayList<t6.c> arrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.n;
        if (i10 != 0) {
            if (i10 == 1) {
                arrayList = this.f8506m;
                xVar = (x) this.f8507o;
                m0.b.n1(obj);
                g10 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            xVar = (x) this.f8507o;
            FolderViewModel folderViewModel = this.f8508p;
            String obj2 = kotlin.text.b.w1(kotlin.collections.c.t2(folderViewModel.n(), "\n\n", null, null, FolderViewModel$mergeSelectedNotes$1$title$1.f8513j, 30)).toString();
            String obj3 = kotlin.text.b.w1(kotlin.collections.c.t2(folderViewModel.n(), "\n\n", null, null, FolderViewModel$mergeSelectedNotes$1$body$1.f8512j, 30)).toString();
            List<h0> n = folderViewModel.n();
            if (!(n instanceof Collection) || !n.isEmpty()) {
                for (h0 h0Var : n) {
                    if (h0Var.f18683a.f17626g) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            List<h0> n10 = folderViewModel.n();
            ArrayList arrayList2 = new ArrayList(n7.l.Z1(n10, 10));
            for (h0 h0Var2 : n10) {
                arrayList2.add(h0Var2.f18684b);
            }
            ArrayList a22 = n7.l.a2(arrayList2);
            t6.d dVar = new t6.d(0L, folderViewModel.f8430i, obj2, obj3, z10, 4001);
            this.f8507o = xVar;
            this.f8506m = a22;
            this.n = 1;
            g10 = folderViewModel.f8426e.g(dVar, true, this);
            if (g10 == coroutineSingletons) {
                return coroutineSingletons;
            }
            arrayList = a22;
        }
        long longValue = ((Number) g10).longValue();
        FolderViewModel folderViewModel2 = this.f8508p;
        for (t6.c cVar : arrayList) {
            m0.b.M0(xVar, null, null, new FolderViewModel$mergeSelectedNotes$1$1$1(longValue, cVar, folderViewModel2, null), 3);
        }
        return m7.n.f16010a;
    }
}
