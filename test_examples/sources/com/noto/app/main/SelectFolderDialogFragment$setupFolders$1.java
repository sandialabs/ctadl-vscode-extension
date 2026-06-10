package com.noto.app.main;

import android.content.Context;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.airbnb.epoxy.e0;
import com.airbnb.epoxy.m;
import com.noto.R;
import com.noto.app.filtered.FilteredItemModel;
import com.noto.app.util.ModelUtilsKt;
import f7.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m7.n;
import o6.i;
import u7.l;
import u7.p;
import v7.g;
import w6.t;
import z6.a0;
import z6.f;
import z6.w;
import z6.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/epoxy/m;", "Lm7/n;", "invoke", "(Lcom/airbnb/epoxy/m;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SelectFolderDialogFragment$setupFolders$1 extends Lambda implements l<m, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SelectFolderDialogFragment f8962j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Pair<t6.a, Integer> f8963k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ List<Pair<t6.a, Integer>> f8964l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ p<Long, String, n> f8965m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectFolderDialogFragment$setupFolders$1(SelectFolderDialogFragment selectFolderDialogFragment, Pair pair, ArrayList arrayList, p pVar, boolean z10) {
        super(1);
        this.f8962j = selectFolderDialogFragment;
        this.f8963k = pair;
        this.f8964l = arrayList;
        this.f8965m = pVar;
        this.n = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v31, types: [z6.x] */
    @Override // u7.l
    public final n U(m mVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        m mVar2 = mVar;
        g.f(mVar2, "$this$withModels");
        SelectFolderDialogFragment selectFolderDialogFragment = this.f8962j;
        final Context j2 = selectFolderDialogFragment.j();
        if (j2 != null) {
            final p<Long, String, n> pVar = this.f8965m;
            boolean z18 = this.n;
            if (selectFolderDialogFragment.g0().f19130d) {
                w wVar = new w();
                wVar.F();
                if (selectFolderDialogFragment.g0().c == 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                wVar.G(z17);
                wVar.H(new z6.g(pVar, 1, j2));
                mVar2.add(wVar);
            }
            if (selectFolderDialogFragment.g0().f19131e) {
                e0 e0Var = new e0(R.layout.vertical_linear_layout_group);
                e0Var.l("header");
                z6.c cVar = new z6.c();
                cVar.F();
                if (selectFolderDialogFragment.g0().c == -4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                cVar.G(z12);
                cVar.H(new View.OnClickListener() { // from class: z6.x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i10 = r3;
                        Context context = j2;
                        u7.p pVar2 = pVar;
                        switch (i10) {
                            case 0:
                                v7.g.f(pVar2, "$callback");
                                v7.g.f(context, "$context");
                                pVar2.R(-4L, f7.q.f(context, R.string.all_folders, new Object[0]));
                                return;
                            case 1:
                                v7.g.f(pVar2, "$callback");
                                v7.g.f(context, "$context");
                                List<Long> list = FilteredItemModel.f8281k;
                                pVar2.R(-3L, f7.q.f(context, R.string.recent, new Object[0]));
                                return;
                            default:
                                v7.g.f(pVar2, "$callback");
                                v7.g.f(context, "$context");
                                List<Long> list2 = FilteredItemModel.f8281k;
                                pVar2.R(-6L, f7.q.f(context, R.string.archived, new Object[0]));
                                return;
                        }
                    }
                });
                e0Var.add(cVar);
                e0 e0Var2 = new e0(R.layout.horizontal_linear_layout_group);
                e0Var2.l("sub_header_1");
                e0Var2.f6688i = new a4.b(2);
                t tVar = new t();
                tVar.l("all");
                tVar.I(FilteredItemModel.All);
                tVar.H(false);
                if (-2 == selectFolderDialogFragment.g0().c) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                tVar.G(z13);
                tVar.J(new y(pVar, 0, j2));
                e0Var2.add(tVar);
                t tVar2 = new t();
                tVar2.l("recent");
                tVar2.I(FilteredItemModel.Recent);
                tVar2.H(false);
                if (-3 == selectFolderDialogFragment.g0().c) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                tVar2.G(z14);
                tVar2.J(new View.OnClickListener() { // from class: z6.x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i10 = r3;
                        Context context = j2;
                        u7.p pVar2 = pVar;
                        switch (i10) {
                            case 0:
                                v7.g.f(pVar2, "$callback");
                                v7.g.f(context, "$context");
                                pVar2.R(-4L, f7.q.f(context, R.string.all_folders, new Object[0]));
                                return;
                            case 1:
                                v7.g.f(pVar2, "$callback");
                                v7.g.f(context, "$context");
                                List<Long> list = FilteredItemModel.f8281k;
                                pVar2.R(-3L, f7.q.f(context, R.string.recent, new Object[0]));
                                return;
                            default:
                                v7.g.f(pVar2, "$callback");
                                v7.g.f(context, "$context");
                                List<Long> list2 = FilteredItemModel.f8281k;
                                pVar2.R(-6L, f7.q.f(context, R.string.archived, new Object[0]));
                                return;
                        }
                    }
                });
                e0Var2.add(tVar2);
                e0Var.add(e0Var2);
                e0 e0Var3 = new e0(R.layout.horizontal_linear_layout_group);
                e0Var3.l("sub_header_2");
                e0Var3.f6688i = new a4.b(3);
                t tVar3 = new t();
                tVar3.l("scheduled");
                tVar3.I(FilteredItemModel.Scheduled);
                tVar3.H(false);
                if (-5 == selectFolderDialogFragment.g0().c) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                tVar3.G(z15);
                tVar3.J(new y(pVar, 1, j2));
                e0Var3.add(tVar3);
                t tVar4 = new t();
                tVar4.l("archived");
                tVar4.I(FilteredItemModel.Archived);
                tVar4.H(false);
                if (-6 == selectFolderDialogFragment.g0().c) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                tVar4.G(z16);
                tVar4.J(new View.OnClickListener() { // from class: z6.x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i10 = r3;
                        Context context = j2;
                        u7.p pVar2 = pVar;
                        switch (i10) {
                            case 0:
                                v7.g.f(pVar2, "$callback");
                                v7.g.f(context, "$context");
                                pVar2.R(-4L, f7.q.f(context, R.string.all_folders, new Object[0]));
                                return;
                            case 1:
                                v7.g.f(pVar2, "$callback");
                                v7.g.f(context, "$context");
                                List<Long> list = FilteredItemModel.f8281k;
                                pVar2.R(-3L, f7.q.f(context, R.string.recent, new Object[0]));
                                return;
                            default:
                                v7.g.f(pVar2, "$callback");
                                v7.g.f(context, "$context");
                                List<Long> list2 = FilteredItemModel.f8281k;
                                pVar2.R(-6L, f7.q.f(context, R.string.archived, new Object[0]));
                                return;
                        }
                    }
                });
                e0Var3.add(tVar4);
                e0Var.add(e0Var3);
                mVar2.add(e0Var);
            }
            final Pair<t6.a, Integer> pair = this.f8963k;
            if (pair != null) {
                f fVar = new f();
                t6.a aVar = pair.f12962i;
                fVar.M(aVar.f17592a);
                fVar.L(aVar);
                fVar.Q(pair.f12963j.intValue());
                if (aVar.f17592a == selectFolderDialogFragment.g0().c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                fVar.O(z10);
                fVar.N(false);
                if (z18 && !selectFolderDialogFragment.g0().f19131e) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                fVar.P(z11);
                fVar.R(new View.OnClickListener() { // from class: z6.z
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        u7.p pVar2 = u7.p.this;
                        v7.g.f(pVar2, "$callback");
                        Context context = j2;
                        v7.g.f(context, "$context");
                        Pair pair2 = pair;
                        pVar2.R(Long.valueOf(((t6.a) pair2.f12962i).f17592a), ModelUtilsKt.o(context, (t6.a) pair2.f12962i));
                    }
                });
                fVar.T(new a0());
                fVar.S(new w6.f(0));
                mVar2.add(fVar);
            }
            List<Pair<t6.a, Integer>> list = this.f8964l;
            if (list.isEmpty() && pair == null && !selectFolderDialogFragment.g0().f19130d) {
                i iVar = new i();
                iVar.E();
                iVar.F(q.f(j2, R.string.no_folders_found, new Object[0]));
                mVar2.add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((t6.a) ((Pair) obj).f12962i).f17600j) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!((t6.a) ((Pair) obj2).f12962i).f17600j) {
                        arrayList2.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    o6.g gVar = new o6.g();
                    gVar.l("pinned");
                    gVar.H(q.f(j2, R.string.pinned, new Object[0]));
                    mVar2.add(gVar);
                    ModelUtilsKt.l(arrayList, 1, new SelectFolderDialogFragment$setupFolders$1$1$5$1(mVar2, z18, selectFolderDialogFragment, pVar, j2));
                    if (!arrayList2.isEmpty()) {
                        o6.g gVar2 = new o6.g();
                        gVar2.l("libraries");
                        gVar2.H(q.f(j2, R.string.folders, new Object[0]));
                        mVar2.add(gVar2);
                    }
                }
                ModelUtilsKt.l(arrayList2, 1, new SelectFolderDialogFragment$setupFolders$1$1$5$1(mVar2, z18, selectFolderDialogFragment, pVar, j2));
            }
        }
        return n.f16010a;
    }
}
