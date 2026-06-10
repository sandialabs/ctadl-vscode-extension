package com.noto.app.main;

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
import f7.q;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.f;
import m7.e;
import ma.i;
import s6.m;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/main/FolderListViewDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FolderListViewDialogFragment extends o6.b {

    /* renamed from: u0  reason: collision with root package name */
    public final e f8814u0;

    /* loaded from: classes.dex */
    public static final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NavController g10 = ViewUtilsKt.g(FolderListViewDialogFragment.this);
            if (g10 != null) {
                a4.b.r(R.id.action_folderListViewDialogFragment_to_folderListSortingDialogFragment, g10, null);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NavController g10 = ViewUtilsKt.g(FolderListViewDialogFragment.this);
            if (g10 != null) {
                a4.b.r(R.id.action_folderListViewDialogFragment_to_folderListOrderingDialogFragment, g10, null);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FolderListViewDialogFragment.this.Z();
        }
    }

    public FolderListViewDialogFragment() {
        super(false, 1, null);
        this.f8814u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new FolderListViewDialogFragment$special$$inlined$viewModel$default$1(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.folder_list_view_dialog_fragment, viewGroup, false);
        int i10 = R.id.btn_apply;
        MaterialButton materialButton = (MaterialButton) a1.b.O(inflate, R.id.btn_apply);
        if (materialButton != null) {
            i10 = R.id.ll;
            if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
                i10 = R.id.ll_sorting;
                if (((LinearLayout) a1.b.O(inflate, R.id.ll_sorting)) != null) {
                    i10 = R.id.ll_sorting_order;
                    LinearLayout linearLayout = (LinearLayout) a1.b.O(inflate, R.id.ll_sorting_order);
                    if (linearLayout != null) {
                        i10 = R.id.ll_sorting_type;
                        LinearLayout linearLayout2 = (LinearLayout) a1.b.O(inflate, R.id.ll_sorting_type);
                        if (linearLayout2 != null) {
                            i10 = R.id.tb;
                            View O = a1.b.O(inflate, R.id.tb);
                            if (O != null) {
                                s6.c a10 = s6.c.a(O);
                                if (((MaterialTextView) a1.b.O(inflate, R.id.tv_sorting_order)) != null) {
                                    MaterialTextView materialTextView = (MaterialTextView) a1.b.O(inflate, R.id.tv_sorting_order_value);
                                    if (materialTextView != null) {
                                        if (((MaterialTextView) a1.b.O(inflate, R.id.tv_sorting_type)) != null) {
                                            MaterialTextView materialTextView2 = (MaterialTextView) a1.b.O(inflate, R.id.tv_sorting_type_value);
                                            if (materialTextView2 != null) {
                                                NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                                m mVar = new m(nestedScrollView, materialButton, linearLayout, linearLayout2, a10, materialTextView, materialTextView2);
                                                Context j2 = j();
                                                if (j2 != null) {
                                                    str = q.f(j2, R.string.folders_view, new Object[0]);
                                                } else {
                                                    str = null;
                                                }
                                                a10.c.setText(str);
                                                e eVar = this.f8814u0;
                                                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderListViewDialogFragment$onCreateView$1$1(this, mVar, null), ((MainViewModel) eVar.getValue()).f8908g), i.z(this));
                                                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderListViewDialogFragment$onCreateView$1$2(this, mVar, null), ((MainViewModel) eVar.getValue()).f8909h), i.z(this));
                                                linearLayout2.setOnClickListener(new a());
                                                linearLayout.setOnClickListener(new b());
                                                materialButton.setOnClickListener(new c());
                                                g.e(nestedScrollView, "root");
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
