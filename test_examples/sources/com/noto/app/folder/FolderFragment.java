package com.noto.app.folder;

import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.lifecycle.d0;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.domain.model.FilteringType;
import com.noto.app.domain.model.Font;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.folder.FolderFragment;
import com.noto.app.folder.FolderViewModel;
import com.noto.app.util.EpoxyUtilsKt;
import com.noto.app.util.ModelUtilsKt;
import com.noto.app.util.ModelUtilsKt$asSearchFlow$$inlined$map$1;
import com.noto.app.util.ViewUtilsKt;
import com.robinhood.ticker.TickerView;
import f7.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.DistinctFlowImpl;
import kotlinx.coroutines.flow.FlowKt__DistinctKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import n6.c;
import x6.h0;
import x6.i0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/folder/FolderFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FolderFragment extends Fragment {

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ int f8358k0 = 0;

    /* renamed from: f0  reason: collision with root package name */
    public com.airbnb.epoxy.m f8361f0;

    /* renamed from: g0  reason: collision with root package name */
    public androidx.recyclerview.widget.n f8362g0;

    /* renamed from: h0  reason: collision with root package name */
    public StaggeredGridLayoutManager f8363h0;

    /* renamed from: d0  reason: collision with root package name */
    public final m7.e f8359d0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new FolderFragment$special$$inlined$viewModel$default$1(this, new FolderFragment$viewModel$2(this)));

    /* renamed from: e0  reason: collision with root package name */
    public final androidx.navigation.f f8360e0 = new androidx.navigation.f(v7.i.a(x6.r.class), new FolderFragment$special$$inlined$navArgs$1(this));

    /* renamed from: i0  reason: collision with root package name */
    public final m7.e f8364i0 = kotlin.a.b(FolderFragment$anchorViewId$2.f8386j);

    /* renamed from: j0  reason: collision with root package name */
    public final m7.e f8365j0 = kotlin.a.b(new FolderFragment$folderColor$2(this));

    /* loaded from: classes.dex */
    public static final class a implements w, v7.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u7.l f8385a;

        public a(u7.l lVar) {
            this.f8385a = lVar;
        }

        @Override // v7.e
        public final u7.l a() {
            return this.f8385a;
        }

        @Override // androidx.lifecycle.w
        public final /* synthetic */ void b(Object obj) {
            this.f8385a.U(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof w) && (obj instanceof v7.e)) {
                return v7.g.a(this.f8385a, ((v7.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f8385a.hashCode();
        }
    }

    public final x6.r Z() {
        return (x6.r) this.f8360e0.getValue();
    }

    public final FolderViewModel a0() {
        return (FolderViewModel) this.f8359d0.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02be  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        d0 d0Var;
        s c;
        OnBackPressedDispatcher onBackPressedDispatcher;
        androidx.navigation.i d5;
        v7.g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.folder_fragment, viewGroup, false);
        int i10 = R.id.abl;
        if (((AppBarLayout) a1.b.O(inflate, R.id.abl)) != null) {
            i10 = R.id.bab;
            BottomAppBar bottomAppBar = (BottomAppBar) a1.b.O(inflate, R.id.bab);
            if (bottomAppBar != null) {
                i10 = R.id.bab_selection;
                BottomAppBar bottomAppBar2 = (BottomAppBar) a1.b.O(inflate, R.id.bab_selection);
                if (bottomAppBar2 != null) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                    TextInputEditText textInputEditText = (TextInputEditText) a1.b.O(inflate, R.id.et_search);
                    if (textInputEditText != null) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) a1.b.O(inflate, R.id.fab);
                        if (floatingActionButton != null) {
                            FloatingActionButton floatingActionButton2 = (FloatingActionButton) a1.b.O(inflate, R.id.fab_selection);
                            if (floatingActionButton2 != null) {
                                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) a1.b.O(inflate, R.id.rv);
                                if (epoxyRecyclerView != null) {
                                    MaterialToolbar materialToolbar = (MaterialToolbar) a1.b.O(inflate, R.id.tb);
                                    if (materialToolbar != null) {
                                        TextInputLayout textInputLayout = (TextInputLayout) a1.b.O(inflate, R.id.til_search);
                                        if (textInputLayout != null) {
                                            TickerView tickerView = (TickerView) a1.b.O(inflate, R.id.tv_folder_notes_count);
                                            if (tickerView != null) {
                                                MaterialTextView materialTextView = (MaterialTextView) a1.b.O(inflate, R.id.tv_folder_notes_count_rtl);
                                                if (materialTextView != null) {
                                                    MaterialTextView materialTextView2 = (MaterialTextView) a1.b.O(inflate, R.id.tv_folder_title);
                                                    if (materialTextView2 != null) {
                                                        final s6.i iVar = new s6.i(coordinatorLayout, bottomAppBar, bottomAppBar2, textInputEditText, floatingActionButton, floatingActionButton2, epoxyRecyclerView, materialToolbar, textInputLayout, tickerView, materialTextView, materialTextView2);
                                                        f7.c.f(this);
                                                        MenuItem findItem = bottomAppBar.getMenu().findItem(R.id.archive);
                                                        epoxyRecyclerView.setEdgeEffectFactory(new f7.e());
                                                        epoxyRecyclerView.setItemAnimator(f7.c.a());
                                                        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager();
                                                        epoxyRecyclerView.setLayoutManager(staggeredGridLayoutManager);
                                                        this.f8363h0 = staggeredGridLayoutManager;
                                                        NavController g10 = ViewUtilsKt.g(this);
                                                        if (g10 != null && (d5 = g10.d()) != null) {
                                                            d0Var = d5.a();
                                                        } else {
                                                            d0Var = null;
                                                        }
                                                        final kotlinx.coroutines.flow.m mVar = (kotlinx.coroutines.flow.m) a0().k();
                                                        kotlinx.coroutines.flow.f.b(a1.b.A(a1.b.K(new kotlinx.coroutines.flow.b<FilteringType>() { // from class: com.noto.app.folder.FolderFragment$setupState$$inlined$map$1

                                                            /* renamed from: com.noto.app.folder.FolderFragment$setupState$$inlined$map$1$2  reason: invalid class name */
                                                            /* loaded from: classes.dex */
                                                            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                /* renamed from: i  reason: collision with root package name */
                                                                public final /* synthetic */ kotlinx.coroutines.flow.c f8375i;

                                                                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                @q7.c(c = "com.noto.app.folder.FolderFragment$setupState$$inlined$map$1$2", f = "FolderFragment.kt", l = {223}, m = "emit")
                                                                /* renamed from: com.noto.app.folder.FolderFragment$setupState$$inlined$map$1$2$1  reason: invalid class name */
                                                                /* loaded from: classes.dex */
                                                                public static final class AnonymousClass1 extends ContinuationImpl {

                                                                    /* renamed from: l  reason: collision with root package name */
                                                                    public /* synthetic */ Object f8376l;

                                                                    /* renamed from: m  reason: collision with root package name */
                                                                    public int f8377m;

                                                                    public AnonymousClass1(p7.c cVar) {
                                                                        super(cVar);
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Object k(Object obj) {
                                                                        this.f8376l = obj;
                                                                        this.f8377m |= Integer.MIN_VALUE;
                                                                        return AnonymousClass2.this.c(null, this);
                                                                    }
                                                                }

                                                                public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                    this.f8375i = cVar;
                                                                }

                                                                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                                                                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                                                                @Override // kotlinx.coroutines.flow.c
                                                                /*
                                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                                */
                                                                public final Object c(Object obj, p7.c cVar) {
                                                                    AnonymousClass1 anonymousClass1;
                                                                    int i10;
                                                                    if (cVar instanceof AnonymousClass1) {
                                                                        anonymousClass1 = (AnonymousClass1) cVar;
                                                                        int i11 = anonymousClass1.f8377m;
                                                                        if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                            anonymousClass1.f8377m = i11 - Integer.MIN_VALUE;
                                                                            Object obj2 = anonymousClass1.f8376l;
                                                                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                            i10 = anonymousClass1.f8377m;
                                                                            if (i10 == 0) {
                                                                                if (i10 == 1) {
                                                                                    m0.b.n1(obj2);
                                                                                } else {
                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                }
                                                                            } else {
                                                                                m0.b.n1(obj2);
                                                                                FilteringType filteringType = ((t6.a) obj).f17608s;
                                                                                anonymousClass1.f8377m = 1;
                                                                                if (this.f8375i.c(filteringType, anonymousClass1) == coroutineSingletons) {
                                                                                    return coroutineSingletons;
                                                                                }
                                                                            }
                                                                            return m7.n.f16010a;
                                                                        }
                                                                    }
                                                                    anonymousClass1 = new AnonymousClass1(cVar);
                                                                    Object obj22 = anonymousClass1.f8376l;
                                                                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                    i10 = anonymousClass1.f8377m;
                                                                    if (i10 == 0) {
                                                                    }
                                                                    return m7.n.f16010a;
                                                                }
                                                            }

                                                            @Override // kotlinx.coroutines.flow.b
                                                            public final Object a(kotlinx.coroutines.flow.c<? super FilteringType> cVar, p7.c cVar2) {
                                                                Object a10 = mVar.a(new AnonymousClass2(cVar), cVar2);
                                                                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                            }
                                                        }), a0().m(), a0().l(), a1.b.m(a0().f8439s), new FolderFragment$setupState$3(iVar, this, null)), ma.i.z(this));
                                                        kotlinx.coroutines.flow.b iVar2 = new kotlinx.coroutines.flow.i(a0().k(), a0().f8440t, new FolderFragment$setupState$4(this, iVar, findItem, null));
                                                        FolderFragment$setupState$5 folderFragment$setupState$5 = FolderFragment$setupState$5.f8418j;
                                                        u7.p<Object, Object, Boolean> pVar = FlowKt__DistinctKt.f15243b;
                                                        if (iVar2 instanceof DistinctFlowImpl) {
                                                            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) iVar2;
                                                            if (distinctFlowImpl.f15212j == folderFragment$setupState$5 && distinctFlowImpl.f15213k == pVar) {
                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderFragment$setupState$6(iVar, this, null), iVar2), ma.i.z(this));
                                                                final kotlinx.coroutines.flow.b[] bVarArr = {a0().m(), a0().l(), a0().f8436p, a0().k(), a1.b.m(a0().f8439s), a1.b.m(a0().f8441u)};
                                                                kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.b<m7.n>() { // from class: com.noto.app.folder.FolderFragment$setupState$$inlined$combine$1

                                                                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "invoke", "()[Ljava/lang/Object;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
                                                                    /* renamed from: com.noto.app.folder.FolderFragment$setupState$$inlined$combine$1$2  reason: invalid class name */
                                                                    /* loaded from: classes.dex */
                                                                    public static final class AnonymousClass2 extends Lambda implements u7.a<Object[]> {

                                                                        /* renamed from: j  reason: collision with root package name */
                                                                        public final /* synthetic */ kotlinx.coroutines.flow.b[] f8369j;

                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        public AnonymousClass2(kotlinx.coroutines.flow.b[] bVarArr) {
                                                                            super(0);
                                                                            this.f8369j = bVarArr;
                                                                        }

                                                                        @Override // u7.a
                                                                        public final Object[] k0() {
                                                                            return new Object[this.f8369j.length];
                                                                        }
                                                                    }

                                                                    @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/c;", "", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
                                                                    @q7.c(c = "com.noto.app.folder.FolderFragment$setupState$$inlined$combine$1$3", f = "FolderFragment.kt", l = {238}, m = "invokeSuspend")
                                                                    /* renamed from: com.noto.app.folder.FolderFragment$setupState$$inlined$combine$1$3  reason: invalid class name */
                                                                    /* loaded from: classes.dex */
                                                                    public static final class AnonymousClass3 extends SuspendLambda implements u7.q<kotlinx.coroutines.flow.c<? super m7.n>, Object[], p7.c<? super m7.n>, Object> {

                                                                        /* renamed from: m  reason: collision with root package name */
                                                                        public int f8370m;
                                                                        public /* synthetic */ kotlinx.coroutines.flow.c n;

                                                                        /* renamed from: o  reason: collision with root package name */
                                                                        public /* synthetic */ Object[] f8371o;

                                                                        /* renamed from: p  reason: collision with root package name */
                                                                        public final /* synthetic */ FolderFragment f8372p;

                                                                        /* renamed from: q  reason: collision with root package name */
                                                                        public final /* synthetic */ s6.i f8373q;

                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        public AnonymousClass3(s6.i iVar, FolderFragment folderFragment, p7.c cVar) {
                                                                            super(3, cVar);
                                                                            this.f8372p = folderFragment;
                                                                            this.f8373q = iVar;
                                                                        }

                                                                        @Override // u7.q
                                                                        public final Object O(kotlinx.coroutines.flow.c<? super m7.n> cVar, Object[] objArr, p7.c<? super m7.n> cVar2) {
                                                                            FolderFragment folderFragment = this.f8372p;
                                                                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f8373q, folderFragment, cVar2);
                                                                            anonymousClass3.n = cVar;
                                                                            anonymousClass3.f8371o = objArr;
                                                                            return anonymousClass3.k(m7.n.f16010a);
                                                                        }

                                                                        /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
                                                                        /* JADX WARN: Removed duplicated region for block: B:26:0x00e9 A[RETURN] */
                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                        /*
                                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                                        */
                                                                        public final Object k(Object obj) {
                                                                            Object bVar;
                                                                            s6.i iVar;
                                                                            com.airbnb.epoxy.m mVar;
                                                                            m7.n nVar;
                                                                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                            int i10 = this.f8370m;
                                                                            if (i10 != 0) {
                                                                                if (i10 == 1) {
                                                                                    m0.b.n1(obj);
                                                                                } else {
                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                }
                                                                            } else {
                                                                                m0.b.n1(obj);
                                                                                kotlinx.coroutines.flow.c cVar = this.n;
                                                                                Object[] objArr = this.f8371o;
                                                                                Object obj2 = objArr[0];
                                                                                v7.g.d(obj2, "null cannot be cast to non-null type com.noto.app.UiState<kotlin.collections.List<com.noto.app.folder.NoteItemModel>>");
                                                                                n6.c cVar2 = (n6.c) obj2;
                                                                                Object obj3 = objArr[1];
                                                                                v7.g.d(obj3, "null cannot be cast to non-null type kotlin.collections.List<com.noto.app.label.LabelItemModel>");
                                                                                List list = (List) obj3;
                                                                                Object obj4 = objArr[2];
                                                                                v7.g.d(obj4, "null cannot be cast to non-null type com.noto.app.domain.model.Font");
                                                                                Font font = (Font) obj4;
                                                                                Object obj5 = objArr[3];
                                                                                v7.g.d(obj5, "null cannot be cast to non-null type com.noto.app.domain.model.Folder");
                                                                                t6.a aVar = (t6.a) obj5;
                                                                                Object obj6 = objArr[4];
                                                                                v7.g.d(obj6, "null cannot be cast to non-null type kotlin.String");
                                                                                String str = (String) obj6;
                                                                                Object obj7 = objArr[5];
                                                                                v7.g.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                                                                                boolean booleanValue = ((Boolean) obj7).booleanValue();
                                                                                if (cVar2 instanceof c.a) {
                                                                                    bVar = c.a.f16110a;
                                                                                } else if (cVar2 instanceof c.b) {
                                                                                    bVar = new c.b(ModelUtilsKt.d(ModelUtilsKt.i((List) ((c.b) cVar2).f16111a, ModelUtilsKt.g(list), aVar.f17608s), str));
                                                                                } else {
                                                                                    throw new NoWhenBranchMatchedException();
                                                                                }
                                                                                int i11 = FolderFragment.f8358k0;
                                                                                FolderFragment folderFragment = this.f8372p;
                                                                                folderFragment.getClass();
                                                                                boolean z10 = bVar instanceof c.a;
                                                                                s6.i iVar2 = this.f8373q;
                                                                                if (z10) {
                                                                                    EpoxyRecyclerView epoxyRecyclerView = iVar2.f17374g;
                                                                                    v7.g.e(epoxyRecyclerView, "rv");
                                                                                    EpoxyUtilsKt.a(epoxyRecyclerView, aVar.f17595e);
                                                                                } else if (bVar instanceof c.b) {
                                                                                    iVar = iVar2;
                                                                                    iVar2.f17374g.p0(new FolderFragment$setupNotesAndLabels$1(folderFragment, list, aVar, (List) ((c.b) bVar).f16111a, font, str, booleanValue, iVar));
                                                                                    mVar = folderFragment.f8361f0;
                                                                                    if (mVar != null) {
                                                                                        s6.i iVar3 = iVar;
                                                                                        androidx.recyclerview.widget.n nVar2 = new androidx.recyclerview.widget.n(new i0(mVar, aVar.f17597g, new FolderFragment$setupItemTouchHelper$itemTouchHelperCallback$1(iVar3, folderFragment)));
                                                                                        nVar2.i(iVar3.f17374g);
                                                                                        folderFragment.f8362g0 = nVar2;
                                                                                    }
                                                                                    nVar = m7.n.f16010a;
                                                                                    this.f8370m = 1;
                                                                                    if (cVar.c(nVar, this) == coroutineSingletons) {
                                                                                        return coroutineSingletons;
                                                                                    }
                                                                                }
                                                                                iVar = iVar2;
                                                                                mVar = folderFragment.f8361f0;
                                                                                if (mVar != null) {
                                                                                }
                                                                                nVar = m7.n.f16010a;
                                                                                this.f8370m = 1;
                                                                                if (cVar.c(nVar, this) == coroutineSingletons) {
                                                                                }
                                                                            }
                                                                            return m7.n.f16010a;
                                                                        }
                                                                    }

                                                                    @Override // kotlinx.coroutines.flow.b
                                                                    public final Object a(kotlinx.coroutines.flow.c<? super m7.n> cVar, p7.c cVar2) {
                                                                        kotlinx.coroutines.flow.b[] bVarArr2 = bVarArr;
                                                                        Object a10 = kotlinx.coroutines.flow.internal.c.a(cVar2, new AnonymousClass2(bVarArr2), new AnonymousClass3(iVar, this, null), cVar, bVarArr2);
                                                                        return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                    }
                                                                }, ma.i.z(this));
                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderFragment$setupState$8(iVar, this, null), a1.b.m(a0().f8438r)), ma.i.z(this));
                                                                CallbackFlowBuilder x3 = ViewUtilsKt.x(textInputEditText, false);
                                                                int i11 = ModelUtilsKt.f9848a;
                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderFragment$setupState$9(this, null), new ModelUtilsKt$asSearchFlow$$inlined$map$1(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(x3))), ma.i.z(this));
                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderFragment$setupState$10(this, null), kotlinx.coroutines.flow.e.d(ViewUtilsKt.p(epoxyRecyclerView))), ma.i.z(this));
                                                                v7.g.e(coordinatorLayout, "root");
                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderFragment$setupState$11(iVar, null), ViewUtilsKt.m(coordinatorLayout)), ma.i.z(this));
                                                                if (!ViewUtilsKt.i()) {
                                                                    tickerView.setVisibility(8);
                                                                    materialTextView.setVisibility(0);
                                                                } else {
                                                                    tickerView.setVisibility(0);
                                                                    materialTextView.setVisibility(8);
                                                                }
                                                                if (d0Var != null) {
                                                                    v c10 = d0Var.c("IsSelection");
                                                                    c10.d(r(), new a(new FolderFragment$setupState$12$1(this, c10)));
                                                                }
                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderFragment$setupState$13(iVar, null), a1.b.m(a0().f8441u)), ma.i.z(this));
                                                                final kotlinx.coroutines.flow.m mVar2 = (kotlinx.coroutines.flow.m) a0().m();
                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderFragment$setupState$15(iVar, null), new kotlinx.coroutines.flow.b<List<? extends h0>>() { // from class: com.noto.app.folder.FolderFragment$setupState$$inlined$map$2

                                                                    /* renamed from: com.noto.app.folder.FolderFragment$setupState$$inlined$map$2$2  reason: invalid class name */
                                                                    /* loaded from: classes.dex */
                                                                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                        /* renamed from: i  reason: collision with root package name */
                                                                        public final /* synthetic */ kotlinx.coroutines.flow.c f8379i;

                                                                        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                        @q7.c(c = "com.noto.app.folder.FolderFragment$setupState$$inlined$map$2$2", f = "FolderFragment.kt", l = {223}, m = "emit")
                                                                        /* renamed from: com.noto.app.folder.FolderFragment$setupState$$inlined$map$2$2$1  reason: invalid class name */
                                                                        /* loaded from: classes.dex */
                                                                        public static final class AnonymousClass1 extends ContinuationImpl {

                                                                            /* renamed from: l  reason: collision with root package name */
                                                                            public /* synthetic */ Object f8380l;

                                                                            /* renamed from: m  reason: collision with root package name */
                                                                            public int f8381m;

                                                                            public AnonymousClass1(p7.c cVar) {
                                                                                super(cVar);
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Object k(Object obj) {
                                                                                this.f8380l = obj;
                                                                                this.f8381m |= Integer.MIN_VALUE;
                                                                                return AnonymousClass2.this.c(null, this);
                                                                            }
                                                                        }

                                                                        public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                            this.f8379i = cVar;
                                                                        }

                                                                        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                                                                        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                                                                        @Override // kotlinx.coroutines.flow.c
                                                                        /*
                                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                                        */
                                                                        public final Object c(Object obj, p7.c cVar) {
                                                                            AnonymousClass1 anonymousClass1;
                                                                            int i10;
                                                                            if (cVar instanceof AnonymousClass1) {
                                                                                anonymousClass1 = (AnonymousClass1) cVar;
                                                                                int i11 = anonymousClass1.f8381m;
                                                                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                    anonymousClass1.f8381m = i11 - Integer.MIN_VALUE;
                                                                                    Object obj2 = anonymousClass1.f8380l;
                                                                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                    i10 = anonymousClass1.f8381m;
                                                                                    if (i10 == 0) {
                                                                                        if (i10 == 1) {
                                                                                            m0.b.n1(obj2);
                                                                                        } else {
                                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                        }
                                                                                    } else {
                                                                                        m0.b.n1(obj2);
                                                                                        ArrayList arrayList = new ArrayList();
                                                                                        for (T t10 : (Iterable) n6.d.a((n6.c) obj, EmptyList.f12981i)) {
                                                                                            if (((h0) t10).c) {
                                                                                                arrayList.add(t10);
                                                                                            }
                                                                                        }
                                                                                        anonymousClass1.f8381m = 1;
                                                                                        if (this.f8379i.c(arrayList, anonymousClass1) == coroutineSingletons) {
                                                                                            return coroutineSingletons;
                                                                                        }
                                                                                    }
                                                                                    return m7.n.f16010a;
                                                                                }
                                                                            }
                                                                            anonymousClass1 = new AnonymousClass1(cVar);
                                                                            Object obj22 = anonymousClass1.f8380l;
                                                                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                            i10 = anonymousClass1.f8381m;
                                                                            if (i10 == 0) {
                                                                            }
                                                                            return m7.n.f16010a;
                                                                        }
                                                                    }

                                                                    @Override // kotlinx.coroutines.flow.b
                                                                    public final Object a(kotlinx.coroutines.flow.c<? super List<? extends h0>> cVar, p7.c cVar2) {
                                                                        Object a10 = mVar2.a(new AnonymousClass2(cVar), cVar2);
                                                                        return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                    }
                                                                }), ma.i.z(this));
                                                                if (d0Var != null) {
                                                                    v c11 = d0Var.c("SelectAll");
                                                                    c11.d(r(), new a(new FolderFragment$setupState$16$1(this, c11)));
                                                                }
                                                                materialToolbar.setOnMenuItemClickListener(new Toolbar.h() { // from class: x6.i
                                                                    @Override // androidx.appcompat.widget.Toolbar.h
                                                                    public final boolean onMenuItemClick(MenuItem menuItem) {
                                                                        NavController g11;
                                                                        int i12 = FolderFragment.f8358k0;
                                                                        FolderFragment folderFragment = FolderFragment.this;
                                                                        v7.g.f(folderFragment, "this$0");
                                                                        if (menuItem.getItemId() == R.id.notes_view && (g11 = ViewUtilsKt.g(folderFragment)) != null) {
                                                                            ViewUtilsKt.o(g11, new z(folderFragment.Z().f18713a), null);
                                                                            return false;
                                                                        }
                                                                        return false;
                                                                    }
                                                                });
                                                                materialToolbar.setOnClickListener(new x6.n(2, iVar));
                                                                floatingActionButton.setOnClickListener(new View.OnClickListener(this) { // from class: x6.j

                                                                    /* renamed from: j  reason: collision with root package name */
                                                                    public final /* synthetic */ FolderFragment f18690j;

                                                                    {
                                                                        this.f18690j = this;
                                                                    }

                                                                    @Override // android.view.View.OnClickListener
                                                                    public final void onClick(View view) {
                                                                        boolean z10;
                                                                        boolean z11;
                                                                        int i12 = r2;
                                                                        FolderFragment folderFragment = this.f18690j;
                                                                        switch (i12) {
                                                                            case 0:
                                                                                int i13 = FolderFragment.f8358k0;
                                                                                v7.g.f(folderFragment, "this$0");
                                                                                ArrayList g11 = ModelUtilsKt.g((List) ((kotlinx.coroutines.flow.m) folderFragment.a0().l()).getValue());
                                                                                ArrayList arrayList = new ArrayList(n7.l.Z1(g11, 10));
                                                                                Iterator it = g11.iterator();
                                                                                while (it.hasNext()) {
                                                                                    arrayList.add(Long.valueOf(((t6.c) it.next()).f17615a));
                                                                                }
                                                                                long[] M2 = kotlin.collections.c.M2(arrayList);
                                                                                NavController g12 = ViewUtilsKt.g(folderFragment);
                                                                                if (g12 != null) {
                                                                                    ViewUtilsKt.o(g12, ma.i.n(folderFragment.Z().f18713a, 0L, M2, new long[0], 118), null);
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            default:
                                                                                int i14 = FolderFragment.f8358k0;
                                                                                v7.g.f(folderFragment, "this$0");
                                                                                List list = (List) n6.d.a((n6.c) ((kotlinx.coroutines.flow.m) folderFragment.a0().m()).getValue(), EmptyList.f12981i);
                                                                                List<h0> n = folderFragment.a0().n();
                                                                                ArrayList arrayList2 = new ArrayList(n7.l.Z1(n, 10));
                                                                                for (h0 h0Var : n) {
                                                                                    arrayList2.add(Long.valueOf(h0Var.f18683a.f17621a));
                                                                                }
                                                                                long[] M22 = kotlin.collections.c.M2(arrayList2);
                                                                                if (M22.length == 1) {
                                                                                    NavController g13 = ViewUtilsKt.g(folderFragment);
                                                                                    if (g13 != null) {
                                                                                        long j2 = folderFragment.Z().f18713a;
                                                                                        if (M22.length == 0) {
                                                                                            z10 = true;
                                                                                        } else {
                                                                                            z10 = false;
                                                                                        }
                                                                                        if (!z10) {
                                                                                            long j10 = M22[0];
                                                                                            if (list.size() != 1) {
                                                                                                z11 = true;
                                                                                            } else {
                                                                                                z11 = false;
                                                                                            }
                                                                                            ViewUtilsKt.o(g13, ma.i.m(j2, j10, false, z11, M22, 8), null);
                                                                                            return;
                                                                                        }
                                                                                        throw new NoSuchElementException("Array is empty.");
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                NavController g14 = ViewUtilsKt.g(folderFragment);
                                                                                if (g14 != null) {
                                                                                    ViewUtilsKt.o(g14, new c0(folderFragment.Z().f18713a, M22), null);
                                                                                    return;
                                                                                }
                                                                                return;
                                                                        }
                                                                    }
                                                                });
                                                                bottomAppBar.setNavigationOnClickListener(new x6.o(1, this));
                                                                bottomAppBar.setOnMenuItemClickListener(new Toolbar.h() { // from class: x6.k
                                                                    @Override // androidx.appcompat.widget.Toolbar.h
                                                                    public final boolean onMenuItemClick(MenuItem menuItem) {
                                                                        int i12 = FolderFragment.f8358k0;
                                                                        FolderFragment folderFragment = this;
                                                                        v7.g.f(folderFragment, "this$0");
                                                                        v7.g.f(iVar, "$this_setupListeners");
                                                                        int itemId = menuItem.getItemId();
                                                                        if (itemId != R.id.archive) {
                                                                            if (itemId != R.id.more) {
                                                                                if (itemId != R.id.search) {
                                                                                    return false;
                                                                                }
                                                                                boolean booleanValue = ((Boolean) a1.b.m(folderFragment.a0().f8438r).getValue()).booleanValue();
                                                                                FolderViewModel a02 = folderFragment.a0();
                                                                                if (booleanValue) {
                                                                                    a02.f8438r.setValue(Boolean.FALSE);
                                                                                    a02.f8439s.setValue("");
                                                                                } else {
                                                                                    a02.f8438r.setValue(Boolean.TRUE);
                                                                                }
                                                                            } else {
                                                                                NavController g11 = ViewUtilsKt.g(folderFragment);
                                                                                if (g11 != null) {
                                                                                    ViewUtilsKt.o(g11, new t(folderFragment.Z().f18713a), null);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            NavController g12 = ViewUtilsKt.g(folderFragment);
                                                                            if (g12 != null) {
                                                                                ViewUtilsKt.o(g12, new s(folderFragment.Z().f18713a), null);
                                                                            }
                                                                        }
                                                                        return true;
                                                                    }
                                                                });
                                                                bottomAppBar.setOnTouchListener(new y(new GestureDetector(bottomAppBar.getContext(), new x6.m(this))));
                                                                c = c();
                                                                if (c != null && (onBackPressedDispatcher = c.f417p) != null) {
                                                                    a1.b.j(onBackPressedDispatcher, null, new FolderFragment$setupListeners$7(this), 3);
                                                                }
                                                                floatingActionButton2.setOnClickListener(new View.OnClickListener(this) { // from class: x6.j

                                                                    /* renamed from: j  reason: collision with root package name */
                                                                    public final /* synthetic */ FolderFragment f18690j;

                                                                    {
                                                                        this.f18690j = this;
                                                                    }

                                                                    @Override // android.view.View.OnClickListener
                                                                    public final void onClick(View view) {
                                                                        boolean z10;
                                                                        boolean z11;
                                                                        int i12 = r2;
                                                                        FolderFragment folderFragment = this.f18690j;
                                                                        switch (i12) {
                                                                            case 0:
                                                                                int i13 = FolderFragment.f8358k0;
                                                                                v7.g.f(folderFragment, "this$0");
                                                                                ArrayList g11 = ModelUtilsKt.g((List) ((kotlinx.coroutines.flow.m) folderFragment.a0().l()).getValue());
                                                                                ArrayList arrayList = new ArrayList(n7.l.Z1(g11, 10));
                                                                                Iterator it = g11.iterator();
                                                                                while (it.hasNext()) {
                                                                                    arrayList.add(Long.valueOf(((t6.c) it.next()).f17615a));
                                                                                }
                                                                                long[] M2 = kotlin.collections.c.M2(arrayList);
                                                                                NavController g12 = ViewUtilsKt.g(folderFragment);
                                                                                if (g12 != null) {
                                                                                    ViewUtilsKt.o(g12, ma.i.n(folderFragment.Z().f18713a, 0L, M2, new long[0], 118), null);
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            default:
                                                                                int i14 = FolderFragment.f8358k0;
                                                                                v7.g.f(folderFragment, "this$0");
                                                                                List list = (List) n6.d.a((n6.c) ((kotlinx.coroutines.flow.m) folderFragment.a0().m()).getValue(), EmptyList.f12981i);
                                                                                List<h0> n = folderFragment.a0().n();
                                                                                ArrayList arrayList2 = new ArrayList(n7.l.Z1(n, 10));
                                                                                for (h0 h0Var : n) {
                                                                                    arrayList2.add(Long.valueOf(h0Var.f18683a.f17621a));
                                                                                }
                                                                                long[] M22 = kotlin.collections.c.M2(arrayList2);
                                                                                if (M22.length == 1) {
                                                                                    NavController g13 = ViewUtilsKt.g(folderFragment);
                                                                                    if (g13 != null) {
                                                                                        long j2 = folderFragment.Z().f18713a;
                                                                                        if (M22.length == 0) {
                                                                                            z10 = true;
                                                                                        } else {
                                                                                            z10 = false;
                                                                                        }
                                                                                        if (!z10) {
                                                                                            long j10 = M22[0];
                                                                                            if (list.size() != 1) {
                                                                                                z11 = true;
                                                                                            } else {
                                                                                                z11 = false;
                                                                                            }
                                                                                            ViewUtilsKt.o(g13, ma.i.m(j2, j10, false, z11, M22, 8), null);
                                                                                            return;
                                                                                        }
                                                                                        throw new NoSuchElementException("Array is empty.");
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                NavController g14 = ViewUtilsKt.g(folderFragment);
                                                                                if (g14 != null) {
                                                                                    ViewUtilsKt.o(g14, new c0(folderFragment.Z().f18713a, M22), null);
                                                                                    return;
                                                                                }
                                                                                return;
                                                                        }
                                                                    }
                                                                });
                                                                bottomAppBar2.setOnMenuItemClickListener(new Toolbar.h() { // from class: x6.l
                                                                    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
                                                                    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
                                                                    @Override // androidx.appcompat.widget.Toolbar.h
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final boolean onMenuItemClick(MenuItem menuItem) {
                                                                        Context j2;
                                                                        String e10;
                                                                        int i12;
                                                                        boolean z10;
                                                                        Context j10;
                                                                        String e11;
                                                                        int i13;
                                                                        int i14 = FolderFragment.f8358k0;
                                                                        FolderFragment folderFragment = this;
                                                                        v7.g.f(folderFragment, "this$0");
                                                                        s6.i iVar3 = iVar;
                                                                        v7.g.f(iVar3, "$this_setupListeners");
                                                                        List<h0> n = folderFragment.a0().n();
                                                                        ArrayList arrayList = new ArrayList(n7.l.Z1(n, 10));
                                                                        for (h0 h0Var : n) {
                                                                            arrayList.add(h0Var.f18683a);
                                                                        }
                                                                        int size = arrayList.size();
                                                                        int itemId = menuItem.getItemId();
                                                                        CoordinatorLayout coordinatorLayout2 = iVar3.f17369a;
                                                                        m7.e eVar = folderFragment.f8365j0;
                                                                        m7.e eVar2 = folderFragment.f8364i0;
                                                                        switch (itemId) {
                                                                            case R.id.add_reminder /* 2131361948 */:
                                                                                NavController g11 = ViewUtilsKt.g(folderFragment);
                                                                                if (g11 != null) {
                                                                                    ViewUtilsKt.o(g11, new b0(folderFragment.Z().f18713a, ((t6.d) kotlin.collections.c.n2(arrayList)).f17621a), null);
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case R.id.archive /* 2131361962 */:
                                                                                folderFragment.a0().d();
                                                                                j2 = folderFragment.j();
                                                                                if (j2 != null) {
                                                                                    e10 = f7.q.e(j2, R.plurals.note_is_archived, size, Integer.valueOf(size));
                                                                                    v7.g.e(coordinatorLayout2, "root");
                                                                                    i12 = R.drawable.ic_round_archive_24;
                                                                                    ViewUtilsKt.w(coordinatorLayout2, e10, Integer.valueOf(i12), Integer.valueOf(((Number) eVar2.getValue()).intValue()), (NotoColor) eVar.getValue(), 16);
                                                                                    a1.c.W1(j2);
                                                                                    a1.c.Y1(j2);
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case R.id.merge /* 2131362249 */:
                                                                                folderFragment.a0().q();
                                                                                j2 = folderFragment.j();
                                                                                if (j2 != null) {
                                                                                    e10 = f7.q.f(j2, R.string.notes_are_merged, Integer.valueOf(arrayList.size()));
                                                                                    v7.g.e(coordinatorLayout2, "root");
                                                                                    i12 = R.drawable.ic_round_merge_24;
                                                                                    ViewUtilsKt.w(coordinatorLayout2, e10, Integer.valueOf(i12), Integer.valueOf(((Number) eVar2.getValue()).intValue()), (NotoColor) eVar.getValue(), 16);
                                                                                    a1.c.W1(j2);
                                                                                    a1.c.Y1(j2);
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case R.id.pin /* 2131362340 */:
                                                                                if (!arrayList.isEmpty()) {
                                                                                    Iterator it = arrayList.iterator();
                                                                                    while (it.hasNext()) {
                                                                                        if (((t6.d) it.next()).f17626g) {
                                                                                            z10 = false;
                                                                                            if (!z10) {
                                                                                                folderFragment.a0().s();
                                                                                                j10 = folderFragment.j();
                                                                                                if (j10 != null) {
                                                                                                    e11 = f7.q.e(j10, R.plurals.note_is_pinned, size, Integer.valueOf(size));
                                                                                                    v7.g.e(coordinatorLayout2, "root");
                                                                                                    i13 = R.drawable.ic_round_pin_24;
                                                                                                    ViewUtilsKt.w(coordinatorLayout2, e11, Integer.valueOf(i13), Integer.valueOf(((Number) eVar2.getValue()).intValue()), (NotoColor) eVar.getValue(), 16);
                                                                                                    a1.c.W1(j10);
                                                                                                    break;
                                                                                                }
                                                                                            } else {
                                                                                                folderFragment.a0().v();
                                                                                                j10 = folderFragment.j();
                                                                                                if (j10 != null) {
                                                                                                    e11 = f7.q.e(j10, R.plurals.note_is_unpinned, size, Integer.valueOf(size));
                                                                                                    v7.g.e(coordinatorLayout2, "root");
                                                                                                    i13 = R.drawable.ic_round_pin_off_24;
                                                                                                    ViewUtilsKt.w(coordinatorLayout2, e11, Integer.valueOf(i13), Integer.valueOf(((Number) eVar2.getValue()).intValue()), (NotoColor) eVar.getValue(), 16);
                                                                                                    a1.c.W1(j10);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                z10 = true;
                                                                                if (!z10) {
                                                                                }
                                                                                break;
                                                                            case R.id.share /* 2131362439 */:
                                                                                ViewUtilsKt.n(folderFragment, arrayList);
                                                                                break;
                                                                            default:
                                                                                return false;
                                                                        }
                                                                        return true;
                                                                    }
                                                                });
                                                                v7.g.e(coordinatorLayout, "root");
                                                                return coordinatorLayout;
                                                            }
                                                        }
                                                        iVar2 = new DistinctFlowImpl(iVar2, folderFragment$setupState$5, pVar);
                                                        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderFragment$setupState$6(iVar, this, null), iVar2), ma.i.z(this));
                                                        final kotlinx.coroutines.flow.b[] bVarArr2 = {a0().m(), a0().l(), a0().f8436p, a0().k(), a1.b.m(a0().f8439s), a1.b.m(a0().f8441u)};
                                                        kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.b<m7.n>() { // from class: com.noto.app.folder.FolderFragment$setupState$$inlined$combine$1

                                                            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "invoke", "()[Ljava/lang/Object;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
                                                            /* renamed from: com.noto.app.folder.FolderFragment$setupState$$inlined$combine$1$2  reason: invalid class name */
                                                            /* loaded from: classes.dex */
                                                            public static final class AnonymousClass2 extends Lambda implements u7.a<Object[]> {

                                                                /* renamed from: j  reason: collision with root package name */
                                                                public final /* synthetic */ kotlinx.coroutines.flow.b[] f8369j;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                public AnonymousClass2(kotlinx.coroutines.flow.b[] bVarArr) {
                                                                    super(0);
                                                                    this.f8369j = bVarArr;
                                                                }

                                                                @Override // u7.a
                                                                public final Object[] k0() {
                                                                    return new Object[this.f8369j.length];
                                                                }
                                                            }

                                                            @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/c;", "", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
                                                            @q7.c(c = "com.noto.app.folder.FolderFragment$setupState$$inlined$combine$1$3", f = "FolderFragment.kt", l = {238}, m = "invokeSuspend")
                                                            /* renamed from: com.noto.app.folder.FolderFragment$setupState$$inlined$combine$1$3  reason: invalid class name */
                                                            /* loaded from: classes.dex */
                                                            public static final class AnonymousClass3 extends SuspendLambda implements u7.q<kotlinx.coroutines.flow.c<? super m7.n>, Object[], p7.c<? super m7.n>, Object> {

                                                                /* renamed from: m  reason: collision with root package name */
                                                                public int f8370m;
                                                                public /* synthetic */ kotlinx.coroutines.flow.c n;

                                                                /* renamed from: o  reason: collision with root package name */
                                                                public /* synthetic */ Object[] f8371o;

                                                                /* renamed from: p  reason: collision with root package name */
                                                                public final /* synthetic */ FolderFragment f8372p;

                                                                /* renamed from: q  reason: collision with root package name */
                                                                public final /* synthetic */ s6.i f8373q;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                public AnonymousClass3(s6.i iVar, FolderFragment folderFragment, p7.c cVar) {
                                                                    super(3, cVar);
                                                                    this.f8372p = folderFragment;
                                                                    this.f8373q = iVar;
                                                                }

                                                                @Override // u7.q
                                                                public final Object O(kotlinx.coroutines.flow.c<? super m7.n> cVar, Object[] objArr, p7.c<? super m7.n> cVar2) {
                                                                    FolderFragment folderFragment = this.f8372p;
                                                                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f8373q, folderFragment, cVar2);
                                                                    anonymousClass3.n = cVar;
                                                                    anonymousClass3.f8371o = objArr;
                                                                    return anonymousClass3.k(m7.n.f16010a);
                                                                }

                                                                /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
                                                                /* JADX WARN: Removed duplicated region for block: B:26:0x00e9 A[RETURN] */
                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                /*
                                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                                */
                                                                public final Object k(Object obj) {
                                                                    Object bVar;
                                                                    s6.i iVar;
                                                                    com.airbnb.epoxy.m mVar;
                                                                    m7.n nVar;
                                                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                    int i10 = this.f8370m;
                                                                    if (i10 != 0) {
                                                                        if (i10 == 1) {
                                                                            m0.b.n1(obj);
                                                                        } else {
                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                        }
                                                                    } else {
                                                                        m0.b.n1(obj);
                                                                        kotlinx.coroutines.flow.c cVar = this.n;
                                                                        Object[] objArr = this.f8371o;
                                                                        Object obj2 = objArr[0];
                                                                        v7.g.d(obj2, "null cannot be cast to non-null type com.noto.app.UiState<kotlin.collections.List<com.noto.app.folder.NoteItemModel>>");
                                                                        n6.c cVar2 = (n6.c) obj2;
                                                                        Object obj3 = objArr[1];
                                                                        v7.g.d(obj3, "null cannot be cast to non-null type kotlin.collections.List<com.noto.app.label.LabelItemModel>");
                                                                        List list = (List) obj3;
                                                                        Object obj4 = objArr[2];
                                                                        v7.g.d(obj4, "null cannot be cast to non-null type com.noto.app.domain.model.Font");
                                                                        Font font = (Font) obj4;
                                                                        Object obj5 = objArr[3];
                                                                        v7.g.d(obj5, "null cannot be cast to non-null type com.noto.app.domain.model.Folder");
                                                                        t6.a aVar = (t6.a) obj5;
                                                                        Object obj6 = objArr[4];
                                                                        v7.g.d(obj6, "null cannot be cast to non-null type kotlin.String");
                                                                        String str = (String) obj6;
                                                                        Object obj7 = objArr[5];
                                                                        v7.g.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                                                                        boolean booleanValue = ((Boolean) obj7).booleanValue();
                                                                        if (cVar2 instanceof c.a) {
                                                                            bVar = c.a.f16110a;
                                                                        } else if (cVar2 instanceof c.b) {
                                                                            bVar = new c.b(ModelUtilsKt.d(ModelUtilsKt.i((List) ((c.b) cVar2).f16111a, ModelUtilsKt.g(list), aVar.f17608s), str));
                                                                        } else {
                                                                            throw new NoWhenBranchMatchedException();
                                                                        }
                                                                        int i11 = FolderFragment.f8358k0;
                                                                        FolderFragment folderFragment = this.f8372p;
                                                                        folderFragment.getClass();
                                                                        boolean z10 = bVar instanceof c.a;
                                                                        s6.i iVar2 = this.f8373q;
                                                                        if (z10) {
                                                                            EpoxyRecyclerView epoxyRecyclerView = iVar2.f17374g;
                                                                            v7.g.e(epoxyRecyclerView, "rv");
                                                                            EpoxyUtilsKt.a(epoxyRecyclerView, aVar.f17595e);
                                                                        } else if (bVar instanceof c.b) {
                                                                            iVar = iVar2;
                                                                            iVar2.f17374g.p0(new FolderFragment$setupNotesAndLabels$1(folderFragment, list, aVar, (List) ((c.b) bVar).f16111a, font, str, booleanValue, iVar));
                                                                            mVar = folderFragment.f8361f0;
                                                                            if (mVar != null) {
                                                                                s6.i iVar3 = iVar;
                                                                                androidx.recyclerview.widget.n nVar2 = new androidx.recyclerview.widget.n(new i0(mVar, aVar.f17597g, new FolderFragment$setupItemTouchHelper$itemTouchHelperCallback$1(iVar3, folderFragment)));
                                                                                nVar2.i(iVar3.f17374g);
                                                                                folderFragment.f8362g0 = nVar2;
                                                                            }
                                                                            nVar = m7.n.f16010a;
                                                                            this.f8370m = 1;
                                                                            if (cVar.c(nVar, this) == coroutineSingletons) {
                                                                                return coroutineSingletons;
                                                                            }
                                                                        }
                                                                        iVar = iVar2;
                                                                        mVar = folderFragment.f8361f0;
                                                                        if (mVar != null) {
                                                                        }
                                                                        nVar = m7.n.f16010a;
                                                                        this.f8370m = 1;
                                                                        if (cVar.c(nVar, this) == coroutineSingletons) {
                                                                        }
                                                                    }
                                                                    return m7.n.f16010a;
                                                                }
                                                            }

                                                            @Override // kotlinx.coroutines.flow.b
                                                            public final Object a(kotlinx.coroutines.flow.c<? super m7.n> cVar, p7.c cVar2) {
                                                                kotlinx.coroutines.flow.b[] bVarArr22 = bVarArr2;
                                                                Object a10 = kotlinx.coroutines.flow.internal.c.a(cVar2, new AnonymousClass2(bVarArr22), new AnonymousClass3(iVar, this, null), cVar, bVarArr22);
                                                                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                            }
                                                        }, ma.i.z(this));
                                                        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderFragment$setupState$8(iVar, this, null), a1.b.m(a0().f8438r)), ma.i.z(this));
                                                        CallbackFlowBuilder x32 = ViewUtilsKt.x(textInputEditText, false);
                                                        int i112 = ModelUtilsKt.f9848a;
                                                        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderFragment$setupState$9(this, null), new ModelUtilsKt$asSearchFlow$$inlined$map$1(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(x32))), ma.i.z(this));
                                                        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderFragment$setupState$10(this, null), kotlinx.coroutines.flow.e.d(ViewUtilsKt.p(epoxyRecyclerView))), ma.i.z(this));
                                                        v7.g.e(coordinatorLayout, "root");
                                                        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderFragment$setupState$11(iVar, null), ViewUtilsKt.m(coordinatorLayout)), ma.i.z(this));
                                                        if (!ViewUtilsKt.i()) {
                                                        }
                                                        if (d0Var != null) {
                                                        }
                                                        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderFragment$setupState$13(iVar, null), a1.b.m(a0().f8441u)), ma.i.z(this));
                                                        final kotlinx.coroutines.flow.m mVar22 = (kotlinx.coroutines.flow.m) a0().m();
                                                        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderFragment$setupState$15(iVar, null), new kotlinx.coroutines.flow.b<List<? extends h0>>() { // from class: com.noto.app.folder.FolderFragment$setupState$$inlined$map$2

                                                            /* renamed from: com.noto.app.folder.FolderFragment$setupState$$inlined$map$2$2  reason: invalid class name */
                                                            /* loaded from: classes.dex */
                                                            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                /* renamed from: i  reason: collision with root package name */
                                                                public final /* synthetic */ kotlinx.coroutines.flow.c f8379i;

                                                                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                @q7.c(c = "com.noto.app.folder.FolderFragment$setupState$$inlined$map$2$2", f = "FolderFragment.kt", l = {223}, m = "emit")
                                                                /* renamed from: com.noto.app.folder.FolderFragment$setupState$$inlined$map$2$2$1  reason: invalid class name */
                                                                /* loaded from: classes.dex */
                                                                public static final class AnonymousClass1 extends ContinuationImpl {

                                                                    /* renamed from: l  reason: collision with root package name */
                                                                    public /* synthetic */ Object f8380l;

                                                                    /* renamed from: m  reason: collision with root package name */
                                                                    public int f8381m;

                                                                    public AnonymousClass1(p7.c cVar) {
                                                                        super(cVar);
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Object k(Object obj) {
                                                                        this.f8380l = obj;
                                                                        this.f8381m |= Integer.MIN_VALUE;
                                                                        return AnonymousClass2.this.c(null, this);
                                                                    }
                                                                }

                                                                public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                    this.f8379i = cVar;
                                                                }

                                                                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                                                                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                                                                @Override // kotlinx.coroutines.flow.c
                                                                /*
                                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                                */
                                                                public final Object c(Object obj, p7.c cVar) {
                                                                    AnonymousClass1 anonymousClass1;
                                                                    int i10;
                                                                    if (cVar instanceof AnonymousClass1) {
                                                                        anonymousClass1 = (AnonymousClass1) cVar;
                                                                        int i11 = anonymousClass1.f8381m;
                                                                        if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                            anonymousClass1.f8381m = i11 - Integer.MIN_VALUE;
                                                                            Object obj22 = anonymousClass1.f8380l;
                                                                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                            i10 = anonymousClass1.f8381m;
                                                                            if (i10 == 0) {
                                                                                if (i10 == 1) {
                                                                                    m0.b.n1(obj22);
                                                                                } else {
                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                }
                                                                            } else {
                                                                                m0.b.n1(obj22);
                                                                                ArrayList arrayList = new ArrayList();
                                                                                for (T t10 : (Iterable) n6.d.a((n6.c) obj, EmptyList.f12981i)) {
                                                                                    if (((h0) t10).c) {
                                                                                        arrayList.add(t10);
                                                                                    }
                                                                                }
                                                                                anonymousClass1.f8381m = 1;
                                                                                if (this.f8379i.c(arrayList, anonymousClass1) == coroutineSingletons2) {
                                                                                    return coroutineSingletons2;
                                                                                }
                                                                            }
                                                                            return m7.n.f16010a;
                                                                        }
                                                                    }
                                                                    anonymousClass1 = new AnonymousClass1(cVar);
                                                                    Object obj222 = anonymousClass1.f8380l;
                                                                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                    i10 = anonymousClass1.f8381m;
                                                                    if (i10 == 0) {
                                                                    }
                                                                    return m7.n.f16010a;
                                                                }
                                                            }

                                                            @Override // kotlinx.coroutines.flow.b
                                                            public final Object a(kotlinx.coroutines.flow.c<? super List<? extends h0>> cVar, p7.c cVar2) {
                                                                Object a10 = mVar22.a(new AnonymousClass2(cVar), cVar2);
                                                                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                            }
                                                        }), ma.i.z(this));
                                                        if (d0Var != null) {
                                                        }
                                                        materialToolbar.setOnMenuItemClickListener(new Toolbar.h() { // from class: x6.i
                                                            @Override // androidx.appcompat.widget.Toolbar.h
                                                            public final boolean onMenuItemClick(MenuItem menuItem) {
                                                                NavController g11;
                                                                int i12 = FolderFragment.f8358k0;
                                                                FolderFragment folderFragment = FolderFragment.this;
                                                                v7.g.f(folderFragment, "this$0");
                                                                if (menuItem.getItemId() == R.id.notes_view && (g11 = ViewUtilsKt.g(folderFragment)) != null) {
                                                                    ViewUtilsKt.o(g11, new z(folderFragment.Z().f18713a), null);
                                                                    return false;
                                                                }
                                                                return false;
                                                            }
                                                        });
                                                        materialToolbar.setOnClickListener(new x6.n(2, iVar));
                                                        floatingActionButton.setOnClickListener(new View.OnClickListener(this) { // from class: x6.j

                                                            /* renamed from: j  reason: collision with root package name */
                                                            public final /* synthetic */ FolderFragment f18690j;

                                                            {
                                                                this.f18690j = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                boolean z10;
                                                                boolean z11;
                                                                int i12 = r2;
                                                                FolderFragment folderFragment = this.f18690j;
                                                                switch (i12) {
                                                                    case 0:
                                                                        int i13 = FolderFragment.f8358k0;
                                                                        v7.g.f(folderFragment, "this$0");
                                                                        ArrayList g11 = ModelUtilsKt.g((List) ((kotlinx.coroutines.flow.m) folderFragment.a0().l()).getValue());
                                                                        ArrayList arrayList = new ArrayList(n7.l.Z1(g11, 10));
                                                                        Iterator it = g11.iterator();
                                                                        while (it.hasNext()) {
                                                                            arrayList.add(Long.valueOf(((t6.c) it.next()).f17615a));
                                                                        }
                                                                        long[] M2 = kotlin.collections.c.M2(arrayList);
                                                                        NavController g12 = ViewUtilsKt.g(folderFragment);
                                                                        if (g12 != null) {
                                                                            ViewUtilsKt.o(g12, ma.i.n(folderFragment.Z().f18713a, 0L, M2, new long[0], 118), null);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    default:
                                                                        int i14 = FolderFragment.f8358k0;
                                                                        v7.g.f(folderFragment, "this$0");
                                                                        List list = (List) n6.d.a((n6.c) ((kotlinx.coroutines.flow.m) folderFragment.a0().m()).getValue(), EmptyList.f12981i);
                                                                        List<h0> n = folderFragment.a0().n();
                                                                        ArrayList arrayList2 = new ArrayList(n7.l.Z1(n, 10));
                                                                        for (h0 h0Var : n) {
                                                                            arrayList2.add(Long.valueOf(h0Var.f18683a.f17621a));
                                                                        }
                                                                        long[] M22 = kotlin.collections.c.M2(arrayList2);
                                                                        if (M22.length == 1) {
                                                                            NavController g13 = ViewUtilsKt.g(folderFragment);
                                                                            if (g13 != null) {
                                                                                long j2 = folderFragment.Z().f18713a;
                                                                                if (M22.length == 0) {
                                                                                    z10 = true;
                                                                                } else {
                                                                                    z10 = false;
                                                                                }
                                                                                if (!z10) {
                                                                                    long j10 = M22[0];
                                                                                    if (list.size() != 1) {
                                                                                        z11 = true;
                                                                                    } else {
                                                                                        z11 = false;
                                                                                    }
                                                                                    ViewUtilsKt.o(g13, ma.i.m(j2, j10, false, z11, M22, 8), null);
                                                                                    return;
                                                                                }
                                                                                throw new NoSuchElementException("Array is empty.");
                                                                            }
                                                                            return;
                                                                        }
                                                                        NavController g14 = ViewUtilsKt.g(folderFragment);
                                                                        if (g14 != null) {
                                                                            ViewUtilsKt.o(g14, new c0(folderFragment.Z().f18713a, M22), null);
                                                                            return;
                                                                        }
                                                                        return;
                                                                }
                                                            }
                                                        });
                                                        bottomAppBar.setNavigationOnClickListener(new x6.o(1, this));
                                                        bottomAppBar.setOnMenuItemClickListener(new Toolbar.h() { // from class: x6.k
                                                            @Override // androidx.appcompat.widget.Toolbar.h
                                                            public final boolean onMenuItemClick(MenuItem menuItem) {
                                                                int i12 = FolderFragment.f8358k0;
                                                                FolderFragment folderFragment = this;
                                                                v7.g.f(folderFragment, "this$0");
                                                                v7.g.f(iVar, "$this_setupListeners");
                                                                int itemId = menuItem.getItemId();
                                                                if (itemId != R.id.archive) {
                                                                    if (itemId != R.id.more) {
                                                                        if (itemId != R.id.search) {
                                                                            return false;
                                                                        }
                                                                        boolean booleanValue = ((Boolean) a1.b.m(folderFragment.a0().f8438r).getValue()).booleanValue();
                                                                        FolderViewModel a02 = folderFragment.a0();
                                                                        if (booleanValue) {
                                                                            a02.f8438r.setValue(Boolean.FALSE);
                                                                            a02.f8439s.setValue("");
                                                                        } else {
                                                                            a02.f8438r.setValue(Boolean.TRUE);
                                                                        }
                                                                    } else {
                                                                        NavController g11 = ViewUtilsKt.g(folderFragment);
                                                                        if (g11 != null) {
                                                                            ViewUtilsKt.o(g11, new t(folderFragment.Z().f18713a), null);
                                                                        }
                                                                    }
                                                                } else {
                                                                    NavController g12 = ViewUtilsKt.g(folderFragment);
                                                                    if (g12 != null) {
                                                                        ViewUtilsKt.o(g12, new s(folderFragment.Z().f18713a), null);
                                                                    }
                                                                }
                                                                return true;
                                                            }
                                                        });
                                                        bottomAppBar.setOnTouchListener(new y(new GestureDetector(bottomAppBar.getContext(), new x6.m(this))));
                                                        c = c();
                                                        if (c != null) {
                                                            a1.b.j(onBackPressedDispatcher, null, new FolderFragment$setupListeners$7(this), 3);
                                                        }
                                                        floatingActionButton2.setOnClickListener(new View.OnClickListener(this) { // from class: x6.j

                                                            /* renamed from: j  reason: collision with root package name */
                                                            public final /* synthetic */ FolderFragment f18690j;

                                                            {
                                                                this.f18690j = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                boolean z10;
                                                                boolean z11;
                                                                int i12 = r2;
                                                                FolderFragment folderFragment = this.f18690j;
                                                                switch (i12) {
                                                                    case 0:
                                                                        int i13 = FolderFragment.f8358k0;
                                                                        v7.g.f(folderFragment, "this$0");
                                                                        ArrayList g11 = ModelUtilsKt.g((List) ((kotlinx.coroutines.flow.m) folderFragment.a0().l()).getValue());
                                                                        ArrayList arrayList = new ArrayList(n7.l.Z1(g11, 10));
                                                                        Iterator it = g11.iterator();
                                                                        while (it.hasNext()) {
                                                                            arrayList.add(Long.valueOf(((t6.c) it.next()).f17615a));
                                                                        }
                                                                        long[] M2 = kotlin.collections.c.M2(arrayList);
                                                                        NavController g12 = ViewUtilsKt.g(folderFragment);
                                                                        if (g12 != null) {
                                                                            ViewUtilsKt.o(g12, ma.i.n(folderFragment.Z().f18713a, 0L, M2, new long[0], 118), null);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    default:
                                                                        int i14 = FolderFragment.f8358k0;
                                                                        v7.g.f(folderFragment, "this$0");
                                                                        List list = (List) n6.d.a((n6.c) ((kotlinx.coroutines.flow.m) folderFragment.a0().m()).getValue(), EmptyList.f12981i);
                                                                        List<h0> n = folderFragment.a0().n();
                                                                        ArrayList arrayList2 = new ArrayList(n7.l.Z1(n, 10));
                                                                        for (h0 h0Var : n) {
                                                                            arrayList2.add(Long.valueOf(h0Var.f18683a.f17621a));
                                                                        }
                                                                        long[] M22 = kotlin.collections.c.M2(arrayList2);
                                                                        if (M22.length == 1) {
                                                                            NavController g13 = ViewUtilsKt.g(folderFragment);
                                                                            if (g13 != null) {
                                                                                long j2 = folderFragment.Z().f18713a;
                                                                                if (M22.length == 0) {
                                                                                    z10 = true;
                                                                                } else {
                                                                                    z10 = false;
                                                                                }
                                                                                if (!z10) {
                                                                                    long j10 = M22[0];
                                                                                    if (list.size() != 1) {
                                                                                        z11 = true;
                                                                                    } else {
                                                                                        z11 = false;
                                                                                    }
                                                                                    ViewUtilsKt.o(g13, ma.i.m(j2, j10, false, z11, M22, 8), null);
                                                                                    return;
                                                                                }
                                                                                throw new NoSuchElementException("Array is empty.");
                                                                            }
                                                                            return;
                                                                        }
                                                                        NavController g14 = ViewUtilsKt.g(folderFragment);
                                                                        if (g14 != null) {
                                                                            ViewUtilsKt.o(g14, new c0(folderFragment.Z().f18713a, M22), null);
                                                                            return;
                                                                        }
                                                                        return;
                                                                }
                                                            }
                                                        });
                                                        bottomAppBar2.setOnMenuItemClickListener(new Toolbar.h() { // from class: x6.l
                                                            /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
                                                            /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
                                                            @Override // androidx.appcompat.widget.Toolbar.h
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final boolean onMenuItemClick(MenuItem menuItem) {
                                                                Context j2;
                                                                String e10;
                                                                int i12;
                                                                boolean z10;
                                                                Context j10;
                                                                String e11;
                                                                int i13;
                                                                int i14 = FolderFragment.f8358k0;
                                                                FolderFragment folderFragment = this;
                                                                v7.g.f(folderFragment, "this$0");
                                                                s6.i iVar3 = iVar;
                                                                v7.g.f(iVar3, "$this_setupListeners");
                                                                List<h0> n = folderFragment.a0().n();
                                                                ArrayList arrayList = new ArrayList(n7.l.Z1(n, 10));
                                                                for (h0 h0Var : n) {
                                                                    arrayList.add(h0Var.f18683a);
                                                                }
                                                                int size = arrayList.size();
                                                                int itemId = menuItem.getItemId();
                                                                CoordinatorLayout coordinatorLayout2 = iVar3.f17369a;
                                                                m7.e eVar = folderFragment.f8365j0;
                                                                m7.e eVar2 = folderFragment.f8364i0;
                                                                switch (itemId) {
                                                                    case R.id.add_reminder /* 2131361948 */:
                                                                        NavController g11 = ViewUtilsKt.g(folderFragment);
                                                                        if (g11 != null) {
                                                                            ViewUtilsKt.o(g11, new b0(folderFragment.Z().f18713a, ((t6.d) kotlin.collections.c.n2(arrayList)).f17621a), null);
                                                                            break;
                                                                        }
                                                                        break;
                                                                    case R.id.archive /* 2131361962 */:
                                                                        folderFragment.a0().d();
                                                                        j2 = folderFragment.j();
                                                                        if (j2 != null) {
                                                                            e10 = f7.q.e(j2, R.plurals.note_is_archived, size, Integer.valueOf(size));
                                                                            v7.g.e(coordinatorLayout2, "root");
                                                                            i12 = R.drawable.ic_round_archive_24;
                                                                            ViewUtilsKt.w(coordinatorLayout2, e10, Integer.valueOf(i12), Integer.valueOf(((Number) eVar2.getValue()).intValue()), (NotoColor) eVar.getValue(), 16);
                                                                            a1.c.W1(j2);
                                                                            a1.c.Y1(j2);
                                                                            break;
                                                                        }
                                                                        break;
                                                                    case R.id.merge /* 2131362249 */:
                                                                        folderFragment.a0().q();
                                                                        j2 = folderFragment.j();
                                                                        if (j2 != null) {
                                                                            e10 = f7.q.f(j2, R.string.notes_are_merged, Integer.valueOf(arrayList.size()));
                                                                            v7.g.e(coordinatorLayout2, "root");
                                                                            i12 = R.drawable.ic_round_merge_24;
                                                                            ViewUtilsKt.w(coordinatorLayout2, e10, Integer.valueOf(i12), Integer.valueOf(((Number) eVar2.getValue()).intValue()), (NotoColor) eVar.getValue(), 16);
                                                                            a1.c.W1(j2);
                                                                            a1.c.Y1(j2);
                                                                            break;
                                                                        }
                                                                        break;
                                                                    case R.id.pin /* 2131362340 */:
                                                                        if (!arrayList.isEmpty()) {
                                                                            Iterator it = arrayList.iterator();
                                                                            while (it.hasNext()) {
                                                                                if (((t6.d) it.next()).f17626g) {
                                                                                    z10 = false;
                                                                                    if (!z10) {
                                                                                        folderFragment.a0().s();
                                                                                        j10 = folderFragment.j();
                                                                                        if (j10 != null) {
                                                                                            e11 = f7.q.e(j10, R.plurals.note_is_pinned, size, Integer.valueOf(size));
                                                                                            v7.g.e(coordinatorLayout2, "root");
                                                                                            i13 = R.drawable.ic_round_pin_24;
                                                                                            ViewUtilsKt.w(coordinatorLayout2, e11, Integer.valueOf(i13), Integer.valueOf(((Number) eVar2.getValue()).intValue()), (NotoColor) eVar.getValue(), 16);
                                                                                            a1.c.W1(j10);
                                                                                            break;
                                                                                        }
                                                                                    } else {
                                                                                        folderFragment.a0().v();
                                                                                        j10 = folderFragment.j();
                                                                                        if (j10 != null) {
                                                                                            e11 = f7.q.e(j10, R.plurals.note_is_unpinned, size, Integer.valueOf(size));
                                                                                            v7.g.e(coordinatorLayout2, "root");
                                                                                            i13 = R.drawable.ic_round_pin_off_24;
                                                                                            ViewUtilsKt.w(coordinatorLayout2, e11, Integer.valueOf(i13), Integer.valueOf(((Number) eVar2.getValue()).intValue()), (NotoColor) eVar.getValue(), 16);
                                                                                            a1.c.W1(j10);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        z10 = true;
                                                                        if (!z10) {
                                                                        }
                                                                        break;
                                                                    case R.id.share /* 2131362439 */:
                                                                        ViewUtilsKt.n(folderFragment, arrayList);
                                                                        break;
                                                                    default:
                                                                        return false;
                                                                }
                                                                return true;
                                                            }
                                                        });
                                                        v7.g.e(coordinatorLayout, "root");
                                                        return coordinatorLayout;
                                                    }
                                                    i10 = R.id.tv_folder_title;
                                                } else {
                                                    i10 = R.id.tv_folder_notes_count_rtl;
                                                }
                                            } else {
                                                i10 = R.id.tv_folder_notes_count;
                                            }
                                        } else {
                                            i10 = R.id.til_search;
                                        }
                                    } else {
                                        i10 = R.id.tb;
                                    }
                                } else {
                                    i10 = R.id.rv;
                                }
                            } else {
                                i10 = R.id.fab_selection;
                            }
                        } else {
                            i10 = R.id.fab;
                        }
                    } else {
                        i10 = R.id.et_search;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
