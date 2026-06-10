package com.noto.app.main;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.noto.app.domain.model.SortingOrder;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import s6.k;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/noto/app/domain/model/SortingOrder;", "sortingOrder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.main.FolderListOrderingDialogFragment$onCreateView$1$1", f = "FolderListOrderingDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderListOrderingDialogFragment$onCreateView$1$1 extends SuspendLambda implements p<SortingOrder, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8800m;
    public final /* synthetic */ k n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderListOrderingDialogFragment$onCreateView$1$1(k kVar, p7.c<? super FolderListOrderingDialogFragment$onCreateView$1$1> cVar) {
        super(2, cVar);
        this.n = kVar;
    }

    @Override // u7.p
    public final Object R(SortingOrder sortingOrder, p7.c<? super n> cVar) {
        return ((FolderListOrderingDialogFragment$onCreateView$1$1) a(sortingOrder, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        FolderListOrderingDialogFragment$onCreateView$1$1 folderListOrderingDialogFragment$onCreateView$1$1 = new FolderListOrderingDialogFragment$onCreateView$1$1(this.n, cVar);
        folderListOrderingDialogFragment$onCreateView$1$1.f8800m = obj;
        return folderListOrderingDialogFragment$onCreateView$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        MaterialRadioButton materialRadioButton;
        m0.b.n1(obj);
        int ordinal = ((SortingOrder) this.f8800m).ordinal();
        k kVar = this.n;
        if (ordinal == 0) {
            materialRadioButton = kVar.f17404a;
        } else if (ordinal != 1) {
            return n.f16010a;
        } else {
            materialRadioButton = kVar.f17405b;
        }
        materialRadioButton.setChecked(true);
        return n.f16010a;
    }
}
