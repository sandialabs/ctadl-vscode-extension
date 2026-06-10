package com.noto.app.main;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.domain.model.FolderListSortingType;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import s6.m;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/noto/app/domain/model/FolderListSortingType;", "sortingType", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.main.FolderListViewDialogFragment$onCreateView$1$1", f = "FolderListViewDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderListViewDialogFragment$onCreateView$1$1 extends SuspendLambda implements p<FolderListSortingType, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8819m;
    public final /* synthetic */ FolderListViewDialogFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ m f8820o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderListViewDialogFragment$onCreateView$1$1(FolderListViewDialogFragment folderListViewDialogFragment, m mVar, p7.c<? super FolderListViewDialogFragment$onCreateView$1$1> cVar) {
        super(2, cVar);
        this.n = folderListViewDialogFragment;
        this.f8820o = mVar;
    }

    @Override // u7.p
    public final Object R(FolderListSortingType folderListSortingType, p7.c<? super n> cVar) {
        return ((FolderListViewDialogFragment$onCreateView$1$1) a(folderListSortingType, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        FolderListViewDialogFragment$onCreateView$1$1 folderListViewDialogFragment$onCreateView$1$1 = new FolderListViewDialogFragment$onCreateView$1$1(this.n, this.f8820o, cVar);
        folderListViewDialogFragment$onCreateView$1$1.f8819m = obj;
        return folderListViewDialogFragment$onCreateView$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        int i10;
        m0.b.n1(obj);
        FolderListSortingType folderListSortingType = (FolderListSortingType) this.f8819m;
        Context j2 = this.n.j();
        m mVar = this.f8820o;
        if (j2 != null) {
            MaterialTextView materialTextView = mVar.c;
            int ordinal = folderListSortingType.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        i10 = R.string.alphabetical;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i10 = R.string.creation_date;
                }
            } else {
                i10 = R.string.manual;
            }
            materialTextView.setText(q.f(j2, i10, new Object[0]));
        }
        if (folderListSortingType == FolderListSortingType.Manual) {
            mVar.f17418a.setClickable(false);
            LinearLayout linearLayout = mVar.f17418a;
            g.e(linearLayout, "llSortingOrder");
            ViewUtilsKt.c(linearLayout);
        } else {
            mVar.f17418a.setClickable(true);
            LinearLayout linearLayout2 = mVar.f17418a;
            g.e(linearLayout2, "llSortingOrder");
            ViewUtilsKt.d(linearLayout2);
        }
        return n.f16010a;
    }
}
