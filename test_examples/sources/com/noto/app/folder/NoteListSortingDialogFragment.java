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
import com.noto.app.domain.model.NoteListSortingType;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import s6.f0;
import x6.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/folder/NoteListSortingDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteListSortingDialogFragment extends o6.b {

    /* renamed from: u0  reason: collision with root package name */
    public final m7.e f8647u0;

    /* renamed from: v0  reason: collision with root package name */
    public final androidx.navigation.f f8648v0;

    public NoteListSortingDialogFragment() {
        super(false, 1, null);
        this.f8647u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new NoteListSortingDialogFragment$special$$inlined$viewModel$default$1(this, new NoteListSortingDialogFragment$viewModel$2(this)));
        this.f8648v0 = new androidx.navigation.f(v7.i.a(m0.class), new NoteListSortingDialogFragment$special$$inlined$navArgs$1(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        v7.g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.note_list_sorting_dialog_fragment, viewGroup, false);
        int i10 = R.id.ll;
        if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
            i10 = R.id.rb_access_date;
            MaterialRadioButton materialRadioButton = (MaterialRadioButton) a1.b.O(inflate, R.id.rb_access_date);
            if (materialRadioButton != null) {
                i10 = R.id.rb_alphabetical;
                MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) a1.b.O(inflate, R.id.rb_alphabetical);
                if (materialRadioButton2 != null) {
                    i10 = R.id.rb_creation_date;
                    MaterialRadioButton materialRadioButton3 = (MaterialRadioButton) a1.b.O(inflate, R.id.rb_creation_date);
                    if (materialRadioButton3 != null) {
                        i10 = R.id.rb_manual;
                        MaterialRadioButton materialRadioButton4 = (MaterialRadioButton) a1.b.O(inflate, R.id.rb_manual);
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
                                        str = f7.q.f(j2, R.string.sorting, new Object[0]);
                                    } else {
                                        str = null;
                                    }
                                    a10.c.setText(str);
                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteListSortingDialogFragment$onCreateView$1$1(this, f0Var, null), ((FolderViewModel) this.f8647u0.getValue()).k()), ma.i.z(this));
                                    materialRadioButton4.setOnClickListener(new View.OnClickListener() { // from class: com.noto.app.folder.NoteListSortingDialogFragment$onCreateView$1$2

                                        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
                                        /* renamed from: com.noto.app.folder.NoteListSortingDialogFragment$onCreateView$1$2$1  reason: invalid class name */
                                        /* loaded from: classes.dex */
                                        public static final class AnonymousClass1 extends Lambda implements u7.l<Throwable, m7.n> {

                                            /* renamed from: j  reason: collision with root package name */
                                            public final /* synthetic */ NoteListSortingDialogFragment f8655j;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(NoteListSortingDialogFragment noteListSortingDialogFragment) {
                                                super(1);
                                                this.f8655j = noteListSortingDialogFragment;
                                            }

                                            @Override // u7.l
                                            public final m7.n U(Throwable th) {
                                                Throwable th2 = th;
                                                this.f8655j.Z();
                                                return m7.n.f16010a;
                                            }
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            NoteListSortingDialogFragment noteListSortingDialogFragment = NoteListSortingDialogFragment.this;
                                            ((FolderViewModel) noteListSortingDialogFragment.f8647u0.getValue()).y(NoteListSortingType.Manual).O(new AnonymousClass1(noteListSortingDialogFragment));
                                        }
                                    });
                                    materialRadioButton3.setOnClickListener(new View.OnClickListener() { // from class: com.noto.app.folder.NoteListSortingDialogFragment$onCreateView$1$3

                                        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
                                        /* renamed from: com.noto.app.folder.NoteListSortingDialogFragment$onCreateView$1$3$1  reason: invalid class name */
                                        /* loaded from: classes.dex */
                                        public static final class AnonymousClass1 extends Lambda implements u7.l<Throwable, m7.n> {

                                            /* renamed from: j  reason: collision with root package name */
                                            public final /* synthetic */ NoteListSortingDialogFragment f8657j;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(NoteListSortingDialogFragment noteListSortingDialogFragment) {
                                                super(1);
                                                this.f8657j = noteListSortingDialogFragment;
                                            }

                                            @Override // u7.l
                                            public final m7.n U(Throwable th) {
                                                Throwable th2 = th;
                                                this.f8657j.Z();
                                                return m7.n.f16010a;
                                            }
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            NoteListSortingDialogFragment noteListSortingDialogFragment = NoteListSortingDialogFragment.this;
                                            ((FolderViewModel) noteListSortingDialogFragment.f8647u0.getValue()).y(NoteListSortingType.CreationDate).O(new AnonymousClass1(noteListSortingDialogFragment));
                                        }
                                    });
                                    materialRadioButton2.setOnClickListener(new View.OnClickListener() { // from class: com.noto.app.folder.NoteListSortingDialogFragment$onCreateView$1$4

                                        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
                                        /* renamed from: com.noto.app.folder.NoteListSortingDialogFragment$onCreateView$1$4$1  reason: invalid class name */
                                        /* loaded from: classes.dex */
                                        public static final class AnonymousClass1 extends Lambda implements u7.l<Throwable, m7.n> {

                                            /* renamed from: j  reason: collision with root package name */
                                            public final /* synthetic */ NoteListSortingDialogFragment f8659j;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(NoteListSortingDialogFragment noteListSortingDialogFragment) {
                                                super(1);
                                                this.f8659j = noteListSortingDialogFragment;
                                            }

                                            @Override // u7.l
                                            public final m7.n U(Throwable th) {
                                                Throwable th2 = th;
                                                this.f8659j.Z();
                                                return m7.n.f16010a;
                                            }
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            NoteListSortingDialogFragment noteListSortingDialogFragment = NoteListSortingDialogFragment.this;
                                            ((FolderViewModel) noteListSortingDialogFragment.f8647u0.getValue()).y(NoteListSortingType.Alphabetical).O(new AnonymousClass1(noteListSortingDialogFragment));
                                        }
                                    });
                                    materialRadioButton.setOnClickListener(new View.OnClickListener() { // from class: com.noto.app.folder.NoteListSortingDialogFragment$onCreateView$1$5

                                        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
                                        /* renamed from: com.noto.app.folder.NoteListSortingDialogFragment$onCreateView$1$5$1  reason: invalid class name */
                                        /* loaded from: classes.dex */
                                        public static final class AnonymousClass1 extends Lambda implements u7.l<Throwable, m7.n> {

                                            /* renamed from: j  reason: collision with root package name */
                                            public final /* synthetic */ NoteListSortingDialogFragment f8661j;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(NoteListSortingDialogFragment noteListSortingDialogFragment) {
                                                super(1);
                                                this.f8661j = noteListSortingDialogFragment;
                                            }

                                            @Override // u7.l
                                            public final m7.n U(Throwable th) {
                                                Throwable th2 = th;
                                                this.f8661j.Z();
                                                return m7.n.f16010a;
                                            }
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            NoteListSortingDialogFragment noteListSortingDialogFragment = NoteListSortingDialogFragment.this;
                                            ((FolderViewModel) noteListSortingDialogFragment.f8647u0.getValue()).y(NoteListSortingType.AccessDate).O(new AnonymousClass1(noteListSortingDialogFragment));
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
