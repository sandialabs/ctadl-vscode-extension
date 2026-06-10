package com.noto.app.main;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.domain.model.SortingOrder;
import f7.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import s6.m;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/noto/app/domain/model/SortingOrder;", "sortingOrder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.main.FolderListViewDialogFragment$onCreateView$1$2", f = "FolderListViewDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderListViewDialogFragment$onCreateView$1$2 extends SuspendLambda implements p<SortingOrder, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8821m;
    public final /* synthetic */ FolderListViewDialogFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ m f8822o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderListViewDialogFragment$onCreateView$1$2(FolderListViewDialogFragment folderListViewDialogFragment, m mVar, p7.c<? super FolderListViewDialogFragment$onCreateView$1$2> cVar) {
        super(2, cVar);
        this.n = folderListViewDialogFragment;
        this.f8822o = mVar;
    }

    @Override // u7.p
    public final Object R(SortingOrder sortingOrder, p7.c<? super n> cVar) {
        return ((FolderListViewDialogFragment$onCreateView$1$2) a(sortingOrder, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        FolderListViewDialogFragment$onCreateView$1$2 folderListViewDialogFragment$onCreateView$1$2 = new FolderListViewDialogFragment$onCreateView$1$2(this.n, this.f8822o, cVar);
        folderListViewDialogFragment$onCreateView$1$2.f8821m = obj;
        return folderListViewDialogFragment$onCreateView$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        int i10;
        m0.b.n1(obj);
        SortingOrder sortingOrder = (SortingOrder) this.f8821m;
        Context j2 = this.n.j();
        if (j2 != null) {
            MaterialTextView materialTextView = this.f8822o.f17419b;
            int ordinal = sortingOrder.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i10 = R.string.descending;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i10 = R.string.ascending;
            }
            materialTextView.setText(q.f(j2, i10, new Object[0]));
        }
        return n.f16010a;
    }
}
