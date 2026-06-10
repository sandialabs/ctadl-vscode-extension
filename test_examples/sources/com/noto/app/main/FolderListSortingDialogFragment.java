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
import com.noto.app.domain.model.FolderListSortingType;
import f7.q;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.f;
import m7.e;
import m7.n;
import ma.i;
import s6.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/main/FolderListSortingDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FolderListSortingDialogFragment extends o6.b {

    /* renamed from: u0  reason: collision with root package name */
    public final e f8805u0;

    public FolderListSortingDialogFragment() {
        super(false, 1, null);
        this.f8805u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new FolderListSortingDialogFragment$special$$inlined$viewModel$default$1(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.folder_list_sorting_dialog_fragment, viewGroup, false);
        int i10 = R.id.ll;
        if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
            i10 = R.id.rb_alphabetical;
            MaterialRadioButton materialRadioButton = (MaterialRadioButton) a1.b.O(inflate, R.id.rb_alphabetical);
            if (materialRadioButton != null) {
                i10 = R.id.rb_creation_date;
                MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) a1.b.O(inflate, R.id.rb_creation_date);
                if (materialRadioButton2 != null) {
                    i10 = R.id.rb_manual;
                    MaterialRadioButton materialRadioButton3 = (MaterialRadioButton) a1.b.O(inflate, R.id.rb_manual);
                    if (materialRadioButton3 != null) {
                        i10 = R.id.rg_type;
                        if (((RadioGroup) a1.b.O(inflate, R.id.rg_type)) != null) {
                            i10 = R.id.tb;
                            View O = a1.b.O(inflate, R.id.tb);
                            if (O != null) {
                                s6.c a10 = s6.c.a(O);
                                NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                l lVar = new l(nestedScrollView, materialRadioButton, materialRadioButton2, materialRadioButton3, a10);
                                Context j2 = j();
                                if (j2 != null) {
                                    str = q.f(j2, R.string.folders_sorting, new Object[0]);
                                } else {
                                    str = null;
                                }
                                a10.c.setText(str);
                                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderListSortingDialogFragment$onCreateView$1$1(lVar, null), ((MainViewModel) this.f8805u0.getValue()).f8908g), i.z(this));
                                materialRadioButton3.setOnClickListener(new View.OnClickListener() { // from class: com.noto.app.main.FolderListSortingDialogFragment$onCreateView$1$2

                                    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
                                    /* renamed from: com.noto.app.main.FolderListSortingDialogFragment$onCreateView$1$2$1  reason: invalid class name */
                                    /* loaded from: classes.dex */
                                    public static final class AnonymousClass1 extends Lambda implements u7.l<Throwable, n> {

                                        /* renamed from: j  reason: collision with root package name */
                                        public final /* synthetic */ FolderListSortingDialogFragment f8809j;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(FolderListSortingDialogFragment folderListSortingDialogFragment) {
                                            super(1);
                                            this.f8809j = folderListSortingDialogFragment;
                                        }

                                        @Override // u7.l
                                        public final n U(Throwable th) {
                                            Throwable th2 = th;
                                            this.f8809j.Z();
                                            return n.f16010a;
                                        }
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        FolderListSortingDialogFragment folderListSortingDialogFragment = FolderListSortingDialogFragment.this;
                                        ((MainViewModel) folderListSortingDialogFragment.f8805u0.getValue()).f(FolderListSortingType.Manual).O(new AnonymousClass1(folderListSortingDialogFragment));
                                    }
                                });
                                materialRadioButton2.setOnClickListener(new View.OnClickListener() { // from class: com.noto.app.main.FolderListSortingDialogFragment$onCreateView$1$3

                                    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
                                    /* renamed from: com.noto.app.main.FolderListSortingDialogFragment$onCreateView$1$3$1  reason: invalid class name */
                                    /* loaded from: classes.dex */
                                    public static final class AnonymousClass1 extends Lambda implements u7.l<Throwable, n> {

                                        /* renamed from: j  reason: collision with root package name */
                                        public final /* synthetic */ FolderListSortingDialogFragment f8811j;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(FolderListSortingDialogFragment folderListSortingDialogFragment) {
                                            super(1);
                                            this.f8811j = folderListSortingDialogFragment;
                                        }

                                        @Override // u7.l
                                        public final n U(Throwable th) {
                                            Throwable th2 = th;
                                            this.f8811j.Z();
                                            return n.f16010a;
                                        }
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        FolderListSortingDialogFragment folderListSortingDialogFragment = FolderListSortingDialogFragment.this;
                                        ((MainViewModel) folderListSortingDialogFragment.f8805u0.getValue()).f(FolderListSortingType.CreationDate).O(new AnonymousClass1(folderListSortingDialogFragment));
                                    }
                                });
                                materialRadioButton.setOnClickListener(new View.OnClickListener() { // from class: com.noto.app.main.FolderListSortingDialogFragment$onCreateView$1$4

                                    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
                                    /* renamed from: com.noto.app.main.FolderListSortingDialogFragment$onCreateView$1$4$1  reason: invalid class name */
                                    /* loaded from: classes.dex */
                                    public static final class AnonymousClass1 extends Lambda implements u7.l<Throwable, n> {

                                        /* renamed from: j  reason: collision with root package name */
                                        public final /* synthetic */ FolderListSortingDialogFragment f8813j;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(FolderListSortingDialogFragment folderListSortingDialogFragment) {
                                            super(1);
                                            this.f8813j = folderListSortingDialogFragment;
                                        }

                                        @Override // u7.l
                                        public final n U(Throwable th) {
                                            Throwable th2 = th;
                                            this.f8813j.Z();
                                            return n.f16010a;
                                        }
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        FolderListSortingDialogFragment folderListSortingDialogFragment = FolderListSortingDialogFragment.this;
                                        ((MainViewModel) folderListSortingDialogFragment.f8805u0.getValue()).f(FolderListSortingType.Alphabetical).O(new AnonymousClass1(folderListSortingDialogFragment));
                                    }
                                });
                                g.e(nestedScrollView, "root");
                                return nestedScrollView;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
