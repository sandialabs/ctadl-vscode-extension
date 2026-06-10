package com.noto.app.main;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.core.widget.NestedScrollView;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.noto.R;
import com.noto.app.domain.model.SortingOrder;
import f7.q;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.f;
import m7.e;
import m7.n;
import ma.i;
import s6.k;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/main/FolderListOrderingDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FolderListOrderingDialogFragment extends o6.b {

    /* renamed from: u0  reason: collision with root package name */
    public final e f8798u0;

    public FolderListOrderingDialogFragment() {
        super(false, 1, null);
        this.f8798u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new FolderListOrderingDialogFragment$special$$inlined$viewModel$default$1(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.folder_list_ordering_dialog_fragment, viewGroup, false);
        int i10 = R.id.ll;
        if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
            i10 = R.id.rb_ascending;
            MaterialRadioButton materialRadioButton = (MaterialRadioButton) a1.b.O(inflate, R.id.rb_ascending);
            if (materialRadioButton != null) {
                i10 = R.id.rb_descending;
                MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) a1.b.O(inflate, R.id.rb_descending);
                if (materialRadioButton2 != null) {
                    i10 = R.id.rg_order;
                    if (((RadioGroup) a1.b.O(inflate, R.id.rg_order)) != null) {
                        i10 = R.id.tb;
                        View O = a1.b.O(inflate, R.id.tb);
                        if (O != null) {
                            s6.c a10 = s6.c.a(O);
                            NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                            k kVar = new k(nestedScrollView, materialRadioButton, materialRadioButton2, a10);
                            Context j2 = j();
                            if (j2 != null) {
                                str = q.f(j2, R.string.folders_ordering, new Object[0]);
                            } else {
                                str = null;
                            }
                            a10.c.setText(str);
                            f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderListOrderingDialogFragment$onCreateView$1$1(kVar, null), ((MainViewModel) this.f8798u0.getValue()).f8909h), i.z(this));
                            materialRadioButton.setOnClickListener(new View.OnClickListener() { // from class: com.noto.app.main.FolderListOrderingDialogFragment$onCreateView$1$2

                                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
                                /* renamed from: com.noto.app.main.FolderListOrderingDialogFragment$onCreateView$1$2$1  reason: invalid class name */
                                /* loaded from: classes.dex */
                                public static final class AnonymousClass1 extends Lambda implements l<Throwable, n> {

                                    /* renamed from: j  reason: collision with root package name */
                                    public final /* synthetic */ FolderListOrderingDialogFragment f8802j;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(FolderListOrderingDialogFragment folderListOrderingDialogFragment) {
                                        super(1);
                                        this.f8802j = folderListOrderingDialogFragment;
                                    }

                                    @Override // u7.l
                                    public final n U(Throwable th) {
                                        Throwable th2 = th;
                                        this.f8802j.Z();
                                        return n.f16010a;
                                    }
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    FolderListOrderingDialogFragment folderListOrderingDialogFragment = FolderListOrderingDialogFragment.this;
                                    ((MainViewModel) folderListOrderingDialogFragment.f8798u0.getValue()).e(SortingOrder.Ascending).O(new AnonymousClass1(folderListOrderingDialogFragment));
                                }
                            });
                            materialRadioButton2.setOnClickListener(new View.OnClickListener() { // from class: com.noto.app.main.FolderListOrderingDialogFragment$onCreateView$1$3

                                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
                                /* renamed from: com.noto.app.main.FolderListOrderingDialogFragment$onCreateView$1$3$1  reason: invalid class name */
                                /* loaded from: classes.dex */
                                public static final class AnonymousClass1 extends Lambda implements l<Throwable, n> {

                                    /* renamed from: j  reason: collision with root package name */
                                    public final /* synthetic */ FolderListOrderingDialogFragment f8804j;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(FolderListOrderingDialogFragment folderListOrderingDialogFragment) {
                                        super(1);
                                        this.f8804j = folderListOrderingDialogFragment;
                                    }

                                    @Override // u7.l
                                    public final n U(Throwable th) {
                                        Throwable th2 = th;
                                        this.f8804j.Z();
                                        return n.f16010a;
                                    }
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    FolderListOrderingDialogFragment folderListOrderingDialogFragment = FolderListOrderingDialogFragment.this;
                                    ((MainViewModel) folderListOrderingDialogFragment.f8798u0.getValue()).e(SortingOrder.Descending).O(new AnonymousClass1(folderListOrderingDialogFragment));
                                }
                            });
                            g.e(nestedScrollView, "root");
                            return nestedScrollView;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
