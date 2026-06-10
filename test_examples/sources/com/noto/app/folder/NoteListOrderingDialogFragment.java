package com.noto.app.folder;

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
import com.noto.app.domain.model.GroupingOrder;
import com.noto.app.domain.model.SortingOrder;
import ja.k1;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import s6.g0;
import x6.l0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/folder/NoteListOrderingDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteListOrderingDialogFragment extends o6.b {

    /* renamed from: u0  reason: collision with root package name */
    public final m7.e f8635u0;

    /* renamed from: v0  reason: collision with root package name */
    public final androidx.navigation.f f8636v0;

    public NoteListOrderingDialogFragment() {
        super(false, 1, null);
        this.f8635u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new NoteListOrderingDialogFragment$special$$inlined$viewModel$default$1(this, new NoteListOrderingDialogFragment$viewModel$2(this)));
        this.f8636v0 = new androidx.navigation.f(v7.i.a(l0.class), new NoteListOrderingDialogFragment$special$$inlined$navArgs$1(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        v7.g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.note_list_ordering_dialog_fragment, viewGroup, false);
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
                            g0 g0Var = new g0(nestedScrollView, materialRadioButton, materialRadioButton2, a10);
                            Context j2 = j();
                            if (j2 != null) {
                                str = f7.q.f(j2, R.string.ordering, new Object[0]);
                            } else {
                                str = null;
                            }
                            a10.c.setText(str);
                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteListOrderingDialogFragment$onCreateView$1$1(this, g0Var, null), ((FolderViewModel) this.f8635u0.getValue()).k()), ma.i.z(this));
                            materialRadioButton.setOnClickListener(new View.OnClickListener() { // from class: com.noto.app.folder.NoteListOrderingDialogFragment$onCreateView$1$2

                                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
                                /* renamed from: com.noto.app.folder.NoteListOrderingDialogFragment$onCreateView$1$2$1  reason: invalid class name */
                                /* loaded from: classes.dex */
                                public static final class AnonymousClass1 extends Lambda implements u7.l<Throwable, m7.n> {

                                    /* renamed from: j  reason: collision with root package name */
                                    public final /* synthetic */ NoteListOrderingDialogFragment f8643j;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(NoteListOrderingDialogFragment noteListOrderingDialogFragment) {
                                        super(1);
                                        this.f8643j = noteListOrderingDialogFragment;
                                    }

                                    @Override // u7.l
                                    public final m7.n U(Throwable th) {
                                        Throwable th2 = th;
                                        this.f8643j.Z();
                                        return m7.n.f16010a;
                                    }
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    k1 M0;
                                    NoteListOrderingDialogFragment noteListOrderingDialogFragment = NoteListOrderingDialogFragment.this;
                                    boolean z10 = ((l0) noteListOrderingDialogFragment.f8636v0.getValue()).f18698b;
                                    m7.e eVar = noteListOrderingDialogFragment.f8635u0;
                                    if (z10) {
                                        FolderViewModel folderViewModel = (FolderViewModel) eVar.getValue();
                                        SortingOrder sortingOrder = SortingOrder.Ascending;
                                        folderViewModel.getClass();
                                        M0 = m0.b.M0(a1.b.d0(folderViewModel), null, null, new FolderViewModel$updateSortingOrder$1(folderViewModel, sortingOrder, null), 3);
                                    } else {
                                        FolderViewModel folderViewModel2 = (FolderViewModel) eVar.getValue();
                                        GroupingOrder groupingOrder = GroupingOrder.Ascending;
                                        folderViewModel2.getClass();
                                        M0 = m0.b.M0(a1.b.d0(folderViewModel2), null, null, new FolderViewModel$updateGroupingOrder$1(folderViewModel2, groupingOrder, null), 3);
                                    }
                                    M0.O(new AnonymousClass1(noteListOrderingDialogFragment));
                                }
                            });
                            materialRadioButton2.setOnClickListener(new View.OnClickListener() { // from class: com.noto.app.folder.NoteListOrderingDialogFragment$onCreateView$1$3

                                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
                                /* renamed from: com.noto.app.folder.NoteListOrderingDialogFragment$onCreateView$1$3$1  reason: invalid class name */
                                /* loaded from: classes.dex */
                                public static final class AnonymousClass1 extends Lambda implements u7.l<Throwable, m7.n> {

                                    /* renamed from: j  reason: collision with root package name */
                                    public final /* synthetic */ NoteListOrderingDialogFragment f8645j;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(NoteListOrderingDialogFragment noteListOrderingDialogFragment) {
                                        super(1);
                                        this.f8645j = noteListOrderingDialogFragment;
                                    }

                                    @Override // u7.l
                                    public final m7.n U(Throwable th) {
                                        Throwable th2 = th;
                                        this.f8645j.Z();
                                        return m7.n.f16010a;
                                    }
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    k1 M0;
                                    NoteListOrderingDialogFragment noteListOrderingDialogFragment = NoteListOrderingDialogFragment.this;
                                    boolean z10 = ((l0) noteListOrderingDialogFragment.f8636v0.getValue()).f18698b;
                                    m7.e eVar = noteListOrderingDialogFragment.f8635u0;
                                    if (z10) {
                                        FolderViewModel folderViewModel = (FolderViewModel) eVar.getValue();
                                        SortingOrder sortingOrder = SortingOrder.Descending;
                                        folderViewModel.getClass();
                                        M0 = m0.b.M0(a1.b.d0(folderViewModel), null, null, new FolderViewModel$updateSortingOrder$1(folderViewModel, sortingOrder, null), 3);
                                    } else {
                                        FolderViewModel folderViewModel2 = (FolderViewModel) eVar.getValue();
                                        GroupingOrder groupingOrder = GroupingOrder.Descending;
                                        folderViewModel2.getClass();
                                        M0 = m0.b.M0(a1.b.d0(folderViewModel2), null, null, new FolderViewModel$updateGroupingOrder$1(folderViewModel2, groupingOrder, null), 3);
                                    }
                                    M0.O(new AnonymousClass1(noteListOrderingDialogFragment));
                                }
                            });
                            v7.g.e(nestedScrollView, "root");
                            return nestedScrollView;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
