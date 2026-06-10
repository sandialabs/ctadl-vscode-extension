package com.noto.app.folder;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.navigation.NavController;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import s6.h0;
import x6.n0;
import x6.o0;
import x6.p0;
import x6.q0;
import x6.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/folder/NoteListViewDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteListViewDialogFragment extends o6.b {

    /* renamed from: u0  reason: collision with root package name */
    public final m7.e f8663u0;

    /* renamed from: v0  reason: collision with root package name */
    public final androidx.navigation.f f8664v0;

    /* loaded from: classes.dex */
    public static final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NoteListViewDialogFragment noteListViewDialogFragment = NoteListViewDialogFragment.this;
            NavController g10 = ViewUtilsKt.g(noteListViewDialogFragment);
            if (g10 != null) {
                ViewUtilsKt.o(g10, new o0(NoteListViewDialogFragment.g0(noteListViewDialogFragment).f18703a), null);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NoteListViewDialogFragment noteListViewDialogFragment = NoteListViewDialogFragment.this;
            NavController g10 = ViewUtilsKt.g(noteListViewDialogFragment);
            if (g10 != null) {
                ViewUtilsKt.o(g10, new r0(NoteListViewDialogFragment.g0(noteListViewDialogFragment).f18703a), null);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NoteListViewDialogFragment noteListViewDialogFragment = NoteListViewDialogFragment.this;
            NavController g10 = ViewUtilsKt.g(noteListViewDialogFragment);
            if (g10 != null) {
                ViewUtilsKt.o(g10, new q0(NoteListViewDialogFragment.g0(noteListViewDialogFragment).f18703a, true), null);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NoteListViewDialogFragment noteListViewDialogFragment = NoteListViewDialogFragment.this;
            NavController g10 = ViewUtilsKt.g(noteListViewDialogFragment);
            if (g10 != null) {
                ViewUtilsKt.o(g10, new p0(NoteListViewDialogFragment.g0(noteListViewDialogFragment).f18703a), null);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NoteListViewDialogFragment noteListViewDialogFragment = NoteListViewDialogFragment.this;
            NavController g10 = ViewUtilsKt.g(noteListViewDialogFragment);
            if (g10 != null) {
                ViewUtilsKt.o(g10, new q0(NoteListViewDialogFragment.g0(noteListViewDialogFragment).f18703a, false), null);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NoteListViewDialogFragment.this.Z();
        }
    }

    public NoteListViewDialogFragment() {
        super(false, 1, null);
        this.f8663u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new NoteListViewDialogFragment$special$$inlined$viewModel$default$1(this, new NoteListViewDialogFragment$viewModel$2(this)));
        this.f8664v0 = new androidx.navigation.f(v7.i.a(n0.class), new NoteListViewDialogFragment$special$$inlined$navArgs$1(this));
    }

    public static final n0 g0(NoteListViewDialogFragment noteListViewDialogFragment) {
        return (n0) noteListViewDialogFragment.f8664v0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        v7.g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.note_list_view_dialog_fragment, viewGroup, false);
        int i10 = R.id.btn_apply;
        MaterialButton materialButton = (MaterialButton) a1.b.O(inflate, R.id.btn_apply);
        if (materialButton != null) {
            i10 = R.id.ll;
            if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
                i10 = R.id.ll_filtering;
                LinearLayout linearLayout = (LinearLayout) a1.b.O(inflate, R.id.ll_filtering);
                if (linearLayout != null) {
                    i10 = R.id.ll_grouping;
                    if (((LinearLayout) a1.b.O(inflate, R.id.ll_grouping)) != null) {
                        i10 = R.id.ll_grouping_order;
                        LinearLayout linearLayout2 = (LinearLayout) a1.b.O(inflate, R.id.ll_grouping_order);
                        if (linearLayout2 != null) {
                            i10 = R.id.ll_grouping_type;
                            LinearLayout linearLayout3 = (LinearLayout) a1.b.O(inflate, R.id.ll_grouping_type);
                            if (linearLayout3 != null) {
                                i10 = R.id.ll_sorting;
                                if (((LinearLayout) a1.b.O(inflate, R.id.ll_sorting)) != null) {
                                    i10 = R.id.ll_sorting_order;
                                    LinearLayout linearLayout4 = (LinearLayout) a1.b.O(inflate, R.id.ll_sorting_order);
                                    if (linearLayout4 != null) {
                                        i10 = R.id.ll_sorting_type;
                                        LinearLayout linearLayout5 = (LinearLayout) a1.b.O(inflate, R.id.ll_sorting_type);
                                        if (linearLayout5 != null) {
                                            i10 = R.id.tb;
                                            View O = a1.b.O(inflate, R.id.tb);
                                            if (O != null) {
                                                s6.c a10 = s6.c.a(O);
                                                if (((MaterialTextView) a1.b.O(inflate, R.id.tv_filtering)) != null) {
                                                    MaterialTextView materialTextView = (MaterialTextView) a1.b.O(inflate, R.id.tv_filtering_value);
                                                    if (materialTextView != null) {
                                                        if (((MaterialTextView) a1.b.O(inflate, R.id.tv_grouping_order)) != null) {
                                                            MaterialTextView materialTextView2 = (MaterialTextView) a1.b.O(inflate, R.id.tv_grouping_order_value);
                                                            if (materialTextView2 != null) {
                                                                if (((MaterialTextView) a1.b.O(inflate, R.id.tv_grouping_type)) != null) {
                                                                    MaterialTextView materialTextView3 = (MaterialTextView) a1.b.O(inflate, R.id.tv_grouping_type_value);
                                                                    if (materialTextView3 != null) {
                                                                        if (((MaterialTextView) a1.b.O(inflate, R.id.tv_sorting_order)) != null) {
                                                                            MaterialTextView materialTextView4 = (MaterialTextView) a1.b.O(inflate, R.id.tv_sorting_order_value);
                                                                            if (materialTextView4 != null) {
                                                                                if (((MaterialTextView) a1.b.O(inflate, R.id.tv_sorting_type)) != null) {
                                                                                    MaterialTextView materialTextView5 = (MaterialTextView) a1.b.O(inflate, R.id.tv_sorting_type_value);
                                                                                    if (materialTextView5 != null) {
                                                                                        NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                                                                        h0 h0Var = new h0(nestedScrollView, materialButton, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, a10, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5);
                                                                                        Context j2 = j();
                                                                                        if (j2 != null) {
                                                                                            str = f7.q.f(j2, R.string.notes_view, new Object[0]);
                                                                                        } else {
                                                                                            str = null;
                                                                                        }
                                                                                        a10.c.setText(str);
                                                                                        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteListViewDialogFragment$onCreateView$1$1(this, h0Var, null), ((FolderViewModel) this.f8663u0.getValue()).k()), ma.i.z(this));
                                                                                        linearLayout.setOnClickListener(new a());
                                                                                        linearLayout5.setOnClickListener(new b());
                                                                                        linearLayout4.setOnClickListener(new c());
                                                                                        linearLayout3.setOnClickListener(new d());
                                                                                        linearLayout2.setOnClickListener(new e());
                                                                                        materialButton.setOnClickListener(new f());
                                                                                        v7.g.e(nestedScrollView, "root");
                                                                                        return nestedScrollView;
                                                                                    }
                                                                                    i10 = R.id.tv_sorting_type_value;
                                                                                } else {
                                                                                    i10 = R.id.tv_sorting_type;
                                                                                }
                                                                            } else {
                                                                                i10 = R.id.tv_sorting_order_value;
                                                                            }
                                                                        } else {
                                                                            i10 = R.id.tv_sorting_order;
                                                                        }
                                                                    } else {
                                                                        i10 = R.id.tv_grouping_type_value;
                                                                    }
                                                                } else {
                                                                    i10 = R.id.tv_grouping_type;
                                                                }
                                                            } else {
                                                                i10 = R.id.tv_grouping_order_value;
                                                            }
                                                        } else {
                                                            i10 = R.id.tv_grouping_order;
                                                        }
                                                    } else {
                                                        i10 = R.id.tv_filtering_value;
                                                    }
                                                } else {
                                                    i10 = R.id.tv_filtering;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
