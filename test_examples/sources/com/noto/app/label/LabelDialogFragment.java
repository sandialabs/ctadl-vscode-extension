package com.noto.app.label;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.d0;
import androidx.lifecycle.w;
import androidx.navigation.NavController;
import androidx.navigation.f;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m7.e;
import s6.t;
import s6.u;
import u7.l;
import v7.g;
import v7.i;
import y6.c;
import y6.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/label/LabelDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LabelDialogFragment extends o6.b {

    /* renamed from: w0  reason: collision with root package name */
    public static final /* synthetic */ int f8728w0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public final e f8729u0;

    /* renamed from: v0  reason: collision with root package name */
    public final f f8730v0;

    /* loaded from: classes.dex */
    public static final class a implements w, v7.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f8734a;

        public a(l lVar) {
            this.f8734a = lVar;
        }

        @Override // v7.e
        public final l a() {
            return this.f8734a;
        }

        @Override // androidx.lifecycle.w
        public final /* synthetic */ void b(Object obj) {
            this.f8734a.U(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof w) && (obj instanceof v7.e)) {
                return g.a(this.f8734a, ((v7.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f8734a.hashCode();
        }
    }

    public LabelDialogFragment() {
        super(false, 1, null);
        this.f8729u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new LabelDialogFragment$special$$inlined$viewModel$default$1(this, new LabelDialogFragment$viewModel$2(this)));
        this.f8730v0 = new f(i.a(c.class), new LabelDialogFragment$special$$inlined$navArgs$1(this));
    }

    public static void g0(LabelDialogFragment labelDialogFragment) {
        androidx.navigation.i d5;
        d0 a10;
        g.f(labelDialogFragment, "this$0");
        Context j2 = labelDialogFragment.j();
        if (j2 != null) {
            a1.c.W1(j2);
            String f10 = q.f(j2, R.string.delete_label_confirmation, new Object[0]);
            String f11 = q.f(j2, R.string.delete_label_description, new Object[0]);
            String f12 = q.f(j2, R.string.delete_label, new Object[0]);
            NavController g10 = ViewUtilsKt.g(labelDialogFragment);
            if (g10 != null && (d5 = g10.d()) != null && (a10 = d5.a()) != null) {
                a10.c("click_listener").d(labelDialogFragment.r(), new a(new LabelDialogFragment$setupListeners$3$1$1(labelDialogFragment, j2)));
            }
            NavController g11 = ViewUtilsKt.g(labelDialogFragment);
            if (g11 != null) {
                ViewUtilsKt.o(g11, new d(f10, f11, f12), null);
            }
        }
    }

    public final c h0() {
        return (c) this.f8730v0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.label_dialog_fragment, viewGroup, false);
        int i10 = R.id.ll;
        if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
            i10 = R.id.tb;
            View O = a1.b.O(inflate, R.id.tb);
            if (O != null) {
                s6.c a10 = s6.c.a(O);
                MaterialTextView materialTextView = (MaterialTextView) a1.b.O(inflate, R.id.tv_delete_label);
                if (materialTextView != null) {
                    MaterialTextView materialTextView2 = (MaterialTextView) a1.b.O(inflate, R.id.tv_edit_label);
                    if (materialTextView2 != null) {
                        MaterialTextView materialTextView3 = (MaterialTextView) a1.b.O(inflate, R.id.tv_reorder_label);
                        if (materialTextView3 != null) {
                            View O2 = a1.b.O(inflate, R.id.v_label);
                            if (O2 != null) {
                                MaterialTextView materialTextView4 = (MaterialTextView) O2;
                                NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                t tVar = new t(nestedScrollView, a10, materialTextView, materialTextView2, materialTextView3, new u(materialTextView4, materialTextView4, 0));
                                Context j2 = j();
                                if (j2 != null) {
                                    str = q.f(j2, R.string.label_options, new Object[0]);
                                } else {
                                    str = null;
                                }
                                a10.c.setText(str);
                                e eVar = this.f8729u0;
                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new LabelDialogFragment$setupState$1(tVar, this, null), ((LabelViewModel) eVar.getValue()).f8753g), ma.i.z(this));
                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new LabelDialogFragment$setupState$2(tVar, this, null), ((LabelViewModel) eVar.getValue()).f8755i), ma.i.z(this));
                                materialTextView2.setOnClickListener(new h6.b(4, this));
                                materialTextView3.setOnClickListener(new z5.a(2, this));
                                materialTextView.setOnClickListener(new o6.c(4, this));
                                g.e(nestedScrollView, "root");
                                return nestedScrollView;
                            }
                            i10 = R.id.v_label;
                        } else {
                            i10 = R.id.tv_reorder_label;
                        }
                    } else {
                        i10 = R.id.tv_edit_label;
                    }
                } else {
                    i10 = R.id.tv_delete_label;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
