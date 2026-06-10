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
import com.noto.app.domain.model.Grouping;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import s6.f0;
import x6.k0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/folder/NoteListGroupingDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteListGroupingDialogFragment extends o6.b {

    /* renamed from: u0  reason: collision with root package name */
    public final m7.e f8619u0;

    /* renamed from: v0  reason: collision with root package name */
    public final androidx.navigation.f f8620v0;

    public NoteListGroupingDialogFragment() {
        super(false, 1, null);
        this.f8619u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new NoteListGroupingDialogFragment$special$$inlined$viewModel$default$1(this, new NoteListGroupingDialogFragment$viewModel$2(this)));
        this.f8620v0 = new androidx.navigation.f(v7.i.a(k0.class), new NoteListGroupingDialogFragment$special$$inlined$navArgs$1(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        v7.g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.note_list_grouping_dialog_fragment, viewGroup, false);
        int i10 = R.id.ll;
        if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
            i10 = R.id.rb_access_date;
            MaterialRadioButton materialRadioButton = (MaterialRadioButton) a1.b.O(inflate, R.id.rb_access_date);
            if (materialRadioButton != null) {
                i10 = R.id.rb_creation_date;
                MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) a1.b.O(inflate, R.id.rb_creation_date);
                if (materialRadioButton2 != null) {
                    i10 = R.id.rb_label;
                    MaterialRadioButton materialRadioButton3 = (MaterialRadioButton) a1.b.O(inflate, R.id.rb_label);
                    if (materialRadioButton3 != null) {
                        i10 = R.id.rb_none;
                        MaterialRadioButton materialRadioButton4 = (MaterialRadioButton) a1.b.O(inflate, R.id.rb_none);
                        if (materialRadioButton4 != null) {
                            i10 = R.id.rg_type;
                            if (((RadioGroup) a1.b.O(inflate, R.id.rg_type)) != null) {
                                i10 = R.id.tb;
                                View O = a1.b.O(inflate, R.id.tb);
                                if (O != null) {
                                    s6.c a10 = s6.c.a(O);
                                    NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                    f0 f0Var = new f0(nestedScrollView, materialRadioButton, materialRadioButton2, materialRadioButton3, materialRadioButton4, a10);
                                    Context j2 = j();
                                    if (j2 != null) {
                                        str = f7.q.f(j2, R.string.grouping, new Object[0]);
                                    } else {
                                        str = null;
                                    }
                                    a10.c.setText(str);
                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteListGroupingDialogFragment$onCreateView$1$1(this, f0Var, null), ((FolderViewModel) this.f8619u0.getValue()).k()), ma.i.z(this));
                                    materialRadioButton4.setOnClickListener(new View.OnClickListener() { // from class: com.noto.app.folder.NoteListGroupingDialogFragment$onCreateView$1$2

                                        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
                                        /* renamed from: com.noto.app.folder.NoteListGroupingDialogFragment$onCreateView$1$2$1  reason: invalid class name */
                                        /* loaded from: classes.dex */
                                        public static final class AnonymousClass1 extends Lambda implements u7.l<Throwable, m7.n> {

                                            /* renamed from: j  reason: collision with root package name */
                                            public final /* synthetic */ NoteListGroupingDialogFragment f8627j;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(NoteListGroupingDialogFragment noteListGroupingDialogFragment) {
                                                super(1);
                                                this.f8627j = noteListGroupingDialogFragment;
                                            }

                                            @Override // u7.l
                                            public final m7.n U(Throwable th) {
                                                Throwable th2 = th;
                                                this.f8627j.Z();
                                                return m7.n.f16010a;
                                            }
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            NoteListGroupingDialogFragment noteListGroupingDialogFragment = NoteListGroupingDialogFragment.this;
                                            ((FolderViewModel) noteListGroupingDialogFragment.f8619u0.getValue()).x(Grouping.None).O(new AnonymousClass1(noteListGroupingDialogFragment));
                                        }
                                    });
                                    materialRadioButton2.setOnClickListener(new View.OnClickListener() { // from class: com.noto.app.folder.NoteListGroupingDialogFragment$onCreateView$1$3

                                        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
                                        /* renamed from: com.noto.app.folder.NoteListGroupingDialogFragment$onCreateView$1$3$1  reason: invalid class name */
                                        /* loaded from: classes.dex */
                                        public static final class AnonymousClass1 extends Lambda implements u7.l<Throwable, m7.n> {

                                            /* renamed from: j  reason: collision with root package name */
                                            public final /* synthetic */ NoteListGroupingDialogFragment f8629j;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(NoteListGroupingDialogFragment noteListGroupingDialogFragment) {
                                                super(1);
                                                this.f8629j = noteListGroupingDialogFragment;
                                            }

                                            @Override // u7.l
                                            public final m7.n U(Throwable th) {
                                                Throwable th2 = th;
                                                this.f8629j.Z();
                                                return m7.n.f16010a;
                                            }
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            NoteListGroupingDialogFragment noteListGroupingDialogFragment = NoteListGroupingDialogFragment.this;
                                            ((FolderViewModel) noteListGroupingDialogFragment.f8619u0.getValue()).x(Grouping.CreationDate).O(new AnonymousClass1(noteListGroupingDialogFragment));
                                        }
                                    });
                                    materialRadioButton3.setOnClickListener(new View.OnClickListener() { // from class: com.noto.app.folder.NoteListGroupingDialogFragment$onCreateView$1$4

                                        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
                                        /* renamed from: com.noto.app.folder.NoteListGroupingDialogFragment$onCreateView$1$4$1  reason: invalid class name */
                                        /* loaded from: classes.dex */
                                        public static final class AnonymousClass1 extends Lambda implements u7.l<Throwable, m7.n> {

                                            /* renamed from: j  reason: collision with root package name */
                                            public final /* synthetic */ NoteListGroupingDialogFragment f8631j;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(NoteListGroupingDialogFragment noteListGroupingDialogFragment) {
                                                super(1);
                                                this.f8631j = noteListGroupingDialogFragment;
                                            }

                                            @Override // u7.l
                                            public final m7.n U(Throwable th) {
                                                Throwable th2 = th;
                                                this.f8631j.Z();
                                                return m7.n.f16010a;
                                            }
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            NoteListGroupingDialogFragment noteListGroupingDialogFragment = NoteListGroupingDialogFragment.this;
                                            ((FolderViewModel) noteListGroupingDialogFragment.f8619u0.getValue()).x(Grouping.Label).O(new AnonymousClass1(noteListGroupingDialogFragment));
                                        }
                                    });
                                    materialRadioButton.setOnClickListener(new View.OnClickListener() { // from class: com.noto.app.folder.NoteListGroupingDialogFragment$onCreateView$1$5

                                        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
                                        /* renamed from: com.noto.app.folder.NoteListGroupingDialogFragment$onCreateView$1$5$1  reason: invalid class name */
                                        /* loaded from: classes.dex */
                                        public static final class AnonymousClass1 extends Lambda implements u7.l<Throwable, m7.n> {

                                            /* renamed from: j  reason: collision with root package name */
                                            public final /* synthetic */ NoteListGroupingDialogFragment f8633j;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(NoteListGroupingDialogFragment noteListGroupingDialogFragment) {
                                                super(1);
                                                this.f8633j = noteListGroupingDialogFragment;
                                            }

                                            @Override // u7.l
                                            public final m7.n U(Throwable th) {
                                                Throwable th2 = th;
                                                this.f8633j.Z();
                                                return m7.n.f16010a;
                                            }
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            NoteListGroupingDialogFragment noteListGroupingDialogFragment = NoteListGroupingDialogFragment.this;
                                            ((FolderViewModel) noteListGroupingDialogFragment.f8619u0.getValue()).x(Grouping.AccessDate).O(new AnonymousClass1(noteListGroupingDialogFragment));
                                        }
                                    });
                                    v7.g.e(nestedScrollView, "root");
                                    return nestedScrollView;
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
