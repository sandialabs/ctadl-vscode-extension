package com.noto.app.folder;

import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.epoxy.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import x6.h0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FolderFragment$setupItemTouchHelper$itemTouchHelperCallback$1 extends Lambda implements u7.a<m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ s6.i f8388j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ FolderFragment f8389k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderFragment$setupItemTouchHelper$itemTouchHelperCallback$1(s6.i iVar, FolderFragment folderFragment) {
        super(0);
        this.f8388j = iVar;
        this.f8389k = folderFragment;
    }

    @Override // u7.a
    public final m7.n k0() {
        NoteItem noteItem;
        s6.i iVar = this.f8388j;
        EpoxyRecyclerView epoxyRecyclerView = iVar.f17374g;
        v7.g.e(epoxyRecyclerView, "rv");
        int childCount = epoxyRecyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = epoxyRecyclerView.getChildAt(i10);
            v7.g.e(childAt, "getChildAt(index)");
            RecyclerView.b0 D = iVar.f17374g.D(childAt);
            v7.g.d(D, "null cannot be cast to non-null type com.airbnb.epoxy.EpoxyViewHolder");
            b0 b0Var = (b0) D;
            b0Var.s();
            com.airbnb.epoxy.r rVar = b0Var.f6617u;
            if (rVar instanceof NoteItem) {
                noteItem = (NoteItem) rVar;
            } else {
                noteItem = null;
            }
            if (noteItem != null) {
                int i11 = FolderFragment.f8358k0;
                FolderViewModel a02 = this.f8389k.a0();
                h0 G = noteItem.G();
                int d5 = b0Var.d();
                a02.getClass();
                t6.d dVar = G.f18683a;
                v7.g.f(dVar, "note");
                m0.b.M0(a1.b.d0(a02), null, null, new FolderViewModel$updateNotePosition$1(a02, dVar, d5, null), 3);
            }
        }
        return m7.n.f16010a;
    }
}
