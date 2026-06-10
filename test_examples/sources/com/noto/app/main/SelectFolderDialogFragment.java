package com.noto.app.main;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.s;
import androidx.navigation.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m7.e;
import m7.n;
import s6.r;
import u7.p;
import v7.d;
import v7.g;
import v7.i;
import z6.c0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B%\b\u0016\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/noto/app/main/SelectFolderDialogFragment;", "Lo6/b;", "<init>", "()V", "Lkotlin/Function2;", "", "", "Lm7/n;", "onClick", "(Lu7/p;)V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SelectFolderDialogFragment extends o6.b {

    /* renamed from: x0  reason: collision with root package name */
    public static final /* synthetic */ int f8953x0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public final p<? super Long, ? super String, n> f8954u0;

    /* renamed from: v0  reason: collision with root package name */
    public final e f8955v0;

    /* renamed from: w0  reason: collision with root package name */
    public final f f8956w0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lm7/n;", "invoke", "(JLjava/lang/String;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.main.SelectFolderDialogFragment$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements p<Long, String, n> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass1 f8959j = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // u7.p
        public final n R(Long l2, String str) {
            l2.longValue();
            g.f(str, "<anonymous parameter 1>");
            return n.f16010a;
        }
    }

    /* loaded from: classes.dex */
    public static final class a implements DialogInterface.OnCancelListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            s c = SelectFolderDialogFragment.this.c();
            if (c != null) {
                c.finish();
            }
        }
    }

    public SelectFolderDialogFragment() {
        super(true);
        this.f8954u0 = SelectFolderDialogFragment$onClick$1.f8961j;
        this.f8955v0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new SelectFolderDialogFragment$special$$inlined$viewModel$default$1(this));
        this.f8956w0 = new f(i.a(c0.class), new SelectFolderDialogFragment$special$$inlined$navArgs$1(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectFolderDialogFragment(p<? super Long, ? super String, n> pVar) {
        this();
        g.f(pVar, "onClick");
        this.f8954u0 = pVar;
    }

    public /* synthetic */ SelectFolderDialogFragment(p pVar, int i10, d dVar) {
        this((i10 & 1) != 0 ? AnonymousClass1.f8959j : pVar);
    }

    public final c0 g0() {
        return (c0) this.f8956w0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.select_folder_dialog_fragment, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate;
        int i10 = R.id.rv;
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) a1.b.O(inflate, R.id.rv);
        if (epoxyRecyclerView != null) {
            i10 = R.id.tb;
            View O = a1.b.O(inflate, R.id.tb);
            if (O != null) {
                s6.c a10 = s6.c.a(O);
                r rVar = new r(linearLayout, epoxyRecyclerView, a10);
                if (!g0().f19129b) {
                    Dialog dialog = this.f5220o0;
                    if (dialog != null) {
                        dialog.setCanceledOnTouchOutside(false);
                    }
                    Dialog dialog2 = this.f5220o0;
                    if (dialog2 != null) {
                        dialog2.setOnCancelListener(new a());
                    }
                }
                epoxyRecyclerView.setEdgeEffectFactory(new f7.e());
                j();
                epoxyRecyclerView.setLayoutManager(new LinearLayoutManager(1));
                epoxyRecyclerView.setItemAnimator(f7.c.a());
                if (g0().f19132f != null) {
                    str = g0().f19132f;
                } else {
                    Context j2 = j();
                    if (j2 != null) {
                        str = q.f(j2, R.string.select_folder, new Object[0]);
                    } else {
                        str = null;
                    }
                }
                a10.c.setText(str);
                e eVar = this.f8955v0;
                kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(((MainViewModel) eVar.getValue()).f8910i, ((MainViewModel) eVar.getValue()).n, new SelectFolderDialogFragment$setupState$1(this, rVar, null)), ma.i.z(this));
                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new SelectFolderDialogFragment$setupState$2(rVar, null), ViewUtilsKt.l(epoxyRecyclerView)), ma.i.z(this));
                g.e(linearLayout, "root");
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
