package com.noto.app.note;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d0;
import androidx.lifecycle.w;
import androidx.navigation.NavController;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.note.NoteReadingModeFragment;
import com.noto.app.util.ViewUtilsKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import s6.l0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/note/NoteReadingModeFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteReadingModeFragment extends Fragment {

    /* renamed from: g0  reason: collision with root package name */
    public static final /* synthetic */ int f9155g0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final m7.e f9156d0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new NoteReadingModeFragment$special$$inlined$viewModel$default$1(this, new NoteReadingModeFragment$viewModel$2(this)));

    /* renamed from: e0  reason: collision with root package name */
    public final m7.e f9157e0 = kotlin.a.b(new NoteReadingModeFragment$folderId$2(this));

    /* renamed from: f0  reason: collision with root package name */
    public final m7.e f9158f0 = kotlin.a.b(new NoteReadingModeFragment$noteId$2(this));

    /* loaded from: classes.dex */
    public static final class a implements w, v7.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u7.l f9161a;

        public a(u7.l lVar) {
            this.f9161a = lVar;
        }

        @Override // v7.e
        public final u7.l a() {
            return this.f9161a;
        }

        @Override // androidx.lifecycle.w
        public final /* synthetic */ void b(Object obj) {
            this.f9161a.U(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof w) && (obj instanceof v7.e)) {
                return v7.g.a(this.f9161a, ((v7.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f9161a.hashCode();
        }
    }

    public final NoteViewModel Z() {
        return (NoteViewModel) this.f9156d0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        androidx.navigation.i d5;
        d0 a10;
        v7.g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.note_reading_mode_fragment, viewGroup, false);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
        int i10 = R.id.ll;
        if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
            i10 = R.id.nsv;
            NestedScrollView nestedScrollView = (NestedScrollView) a1.b.O(inflate, R.id.nsv);
            if (nestedScrollView != null) {
                i10 = R.id.rv;
                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) a1.b.O(inflate, R.id.rv);
                if (epoxyRecyclerView != null) {
                    i10 = R.id.tv_note_body;
                    MaterialTextView materialTextView = (MaterialTextView) a1.b.O(inflate, R.id.tv_note_body);
                    if (materialTextView != null) {
                        i10 = R.id.tv_note_title;
                        MaterialTextView materialTextView2 = (MaterialTextView) a1.b.O(inflate, R.id.tv_note_title);
                        if (materialTextView2 != null) {
                            final l0 l0Var = new l0(coordinatorLayout, nestedScrollView, epoxyRecyclerView, materialTextView, materialTextView2);
                            f7.c.e(this);
                            epoxyRecyclerView.setEdgeEffectFactory(new f7.e());
                            NoteViewModel Z = Z();
                            Z.getClass();
                            final d0 d0Var = null;
                            m0.b.M0(a1.b.d0(Z), null, null, new NoteViewModel$updateNoteAccessDate$1(Z, null), 3);
                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteReadingModeFragment$setupState$1(this, l0Var, null), Z().f9270q), ma.i.z(this));
                            kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(Z().h(), Z().f9271r, new NoteReadingModeFragment$setupState$2(this, l0Var, null)), ma.i.z(this));
                            kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(Z().f9270q, Z().f(), new NoteReadingModeFragment$setupState$3(l0Var, null)), ma.i.z(this));
                            NavController g10 = ViewUtilsKt.g(this);
                            if (g10 != null && (a10 = g10.c(R.id.notePagerFragment).a()) != null) {
                                a10.c("click_listener").d(r(), new a(new NoteReadingModeFragment$setupState$4(this, l0Var)));
                            }
                            NavController g11 = ViewUtilsKt.g(this);
                            if (g11 != null && (d5 = g11.d()) != null) {
                                d0Var = d5.a();
                            }
                            nestedScrollView.setOnScrollChangeListener(new NestedScrollView.c() { // from class: a7.j0
                                @Override // androidx.core.widget.NestedScrollView.c
                                public final void a(NestedScrollView nestedScrollView2, int i11) {
                                    int i12 = NoteReadingModeFragment.f9155g0;
                                    s6.l0 l0Var2 = l0Var;
                                    v7.g.f(l0Var2, "$this_setupListeners");
                                    v7.g.f(nestedScrollView2, "<anonymous parameter 0>");
                                    androidx.lifecycle.d0 d0Var2 = androidx.lifecycle.d0.this;
                                    if (d0Var2 != null) {
                                        d0Var2.e(Integer.valueOf(i11), "ScrollPosition");
                                    }
                                    CoordinatorLayout coordinatorLayout2 = l0Var2.f17414a;
                                    if (d0Var2 != null) {
                                        MaterialTextView materialTextView3 = l0Var2.f17417e;
                                        v7.g.e(materialTextView3, "tvNoteTitle");
                                        v7.g.e(coordinatorLayout2, "root");
                                        Rect rect = new Rect();
                                        coordinatorLayout2.getHitRect(rect);
                                        d0Var2.e(Boolean.valueOf(materialTextView3.getLocalVisibleRect(rect)), "IsTitleVisible");
                                    }
                                    if (d0Var2 != null) {
                                        MaterialTextView materialTextView4 = l0Var2.f17416d;
                                        v7.g.e(materialTextView4, "tvNoteBody");
                                        v7.g.e(coordinatorLayout2, "root");
                                        Rect rect2 = new Rect();
                                        coordinatorLayout2.getHitRect(rect2);
                                        d0Var2.e(Boolean.valueOf(materialTextView4.getLocalVisibleRect(rect2)), "IsBodyVisible");
                                    }
                                }
                            });
                            v7.g.e(coordinatorLayout, "root");
                            return coordinatorLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
