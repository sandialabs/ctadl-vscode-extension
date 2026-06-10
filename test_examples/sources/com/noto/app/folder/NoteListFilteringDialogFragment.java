package com.noto.app.folder;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.domain.model.FilteringType;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import s6.e0;
import x6.j0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/folder/NoteListFilteringDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteListFilteringDialogFragment extends o6.b {

    /* renamed from: u0  reason: collision with root package name */
    public final m7.e f8605u0;

    /* renamed from: v0  reason: collision with root package name */
    public final androidx.navigation.f f8606v0;

    public NoteListFilteringDialogFragment() {
        super(false, 1, null);
        this.f8605u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new NoteListFilteringDialogFragment$special$$inlined$viewModel$default$1(this, new NoteListFilteringDialogFragment$viewModel$2(this)));
        this.f8606v0 = new androidx.navigation.f(v7.i.a(j0.class), new NoteListFilteringDialogFragment$special$$inlined$navArgs$1(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        v7.g.f(layoutInflater, "inflater");
        e0 a10 = e0.a(layoutInflater, viewGroup);
        MaterialTextView materialTextView = a10.f17336e.c;
        Context j2 = j();
        if (j2 != null) {
            str = f7.q.f(j2, R.string.filtering, new Object[0]);
        } else {
            str = null;
        }
        materialTextView.setText(str);
        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteListFilteringDialogFragment$onCreateView$1$1(this, a10, null), ((FolderViewModel) this.f8605u0.getValue()).k()), ma.i.z(this));
        a10.c.setOnClickListener(new View.OnClickListener() { // from class: com.noto.app.folder.NoteListFilteringDialogFragment$onCreateView$1$2

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
            /* renamed from: com.noto.app.folder.NoteListFilteringDialogFragment$onCreateView$1$2$1  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass1 extends Lambda implements u7.l<Throwable, m7.n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ NoteListFilteringDialogFragment f8613j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(NoteListFilteringDialogFragment noteListFilteringDialogFragment) {
                    super(1);
                    this.f8613j = noteListFilteringDialogFragment;
                }

                @Override // u7.l
                public final m7.n U(Throwable th) {
                    Throwable th2 = th;
                    this.f8613j.Z();
                    return m7.n.f16010a;
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoteListFilteringDialogFragment noteListFilteringDialogFragment = NoteListFilteringDialogFragment.this;
                ((FolderViewModel) noteListFilteringDialogFragment.f8605u0.getValue()).w(FilteringType.Inclusive).O(new AnonymousClass1(noteListFilteringDialogFragment));
            }
        });
        a10.f17334b.setOnClickListener(new View.OnClickListener() { // from class: com.noto.app.folder.NoteListFilteringDialogFragment$onCreateView$1$3

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
            /* renamed from: com.noto.app.folder.NoteListFilteringDialogFragment$onCreateView$1$3$1  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass1 extends Lambda implements u7.l<Throwable, m7.n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ NoteListFilteringDialogFragment f8615j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(NoteListFilteringDialogFragment noteListFilteringDialogFragment) {
                    super(1);
                    this.f8615j = noteListFilteringDialogFragment;
                }

                @Override // u7.l
                public final m7.n U(Throwable th) {
                    Throwable th2 = th;
                    this.f8615j.Z();
                    return m7.n.f16010a;
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoteListFilteringDialogFragment noteListFilteringDialogFragment = NoteListFilteringDialogFragment.this;
                ((FolderViewModel) noteListFilteringDialogFragment.f8605u0.getValue()).w(FilteringType.Exclusive).O(new AnonymousClass1(noteListFilteringDialogFragment));
            }
        });
        a10.f17335d.setOnClickListener(new View.OnClickListener() { // from class: com.noto.app.folder.NoteListFilteringDialogFragment$onCreateView$1$4

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
            /* renamed from: com.noto.app.folder.NoteListFilteringDialogFragment$onCreateView$1$4$1  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass1 extends Lambda implements u7.l<Throwable, m7.n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ NoteListFilteringDialogFragment f8617j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(NoteListFilteringDialogFragment noteListFilteringDialogFragment) {
                    super(1);
                    this.f8617j = noteListFilteringDialogFragment;
                }

                @Override // u7.l
                public final m7.n U(Throwable th) {
                    Throwable th2 = th;
                    this.f8617j.Z();
                    return m7.n.f16010a;
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoteListFilteringDialogFragment noteListFilteringDialogFragment = NoteListFilteringDialogFragment.this;
                ((FolderViewModel) noteListFilteringDialogFragment.f8605u0.getValue()).w(FilteringType.Strict).O(new AnonymousClass1(noteListFilteringDialogFragment));
            }
        });
        NestedScrollView nestedScrollView = a10.f17333a;
        v7.g.e(nestedScrollView, "root");
        return nestedScrollView;
    }
}
