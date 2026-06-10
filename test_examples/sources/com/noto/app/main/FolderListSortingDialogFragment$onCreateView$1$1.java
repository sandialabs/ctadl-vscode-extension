package com.noto.app.main;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.noto.app.domain.model.FolderListSortingType;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import s6.l;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/noto/app/domain/model/FolderListSortingType;", "sortingType", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.main.FolderListSortingDialogFragment$onCreateView$1$1", f = "FolderListSortingDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderListSortingDialogFragment$onCreateView$1$1 extends SuspendLambda implements p<FolderListSortingType, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8807m;
    public final /* synthetic */ l n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderListSortingDialogFragment$onCreateView$1$1(l lVar, p7.c<? super FolderListSortingDialogFragment$onCreateView$1$1> cVar) {
        super(2, cVar);
        this.n = lVar;
    }

    @Override // u7.p
    public final Object R(FolderListSortingType folderListSortingType, p7.c<? super n> cVar) {
        return ((FolderListSortingDialogFragment$onCreateView$1$1) a(folderListSortingType, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        FolderListSortingDialogFragment$onCreateView$1$1 folderListSortingDialogFragment$onCreateView$1$1 = new FolderListSortingDialogFragment$onCreateView$1$1(this.n, cVar);
        folderListSortingDialogFragment$onCreateView$1$1.f8807m = obj;
        return folderListSortingDialogFragment$onCreateView$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        MaterialRadioButton materialRadioButton;
        m0.b.n1(obj);
        int ordinal = ((FolderListSortingType) this.f8807m).ordinal();
        l lVar = this.n;
        if (ordinal == 0) {
            materialRadioButton = lVar.c;
        } else if (ordinal == 1) {
            materialRadioButton = lVar.f17413b;
        } else if (ordinal != 2) {
            return n.f16010a;
        } else {
            materialRadioButton = lVar.f17412a;
        }
        materialRadioButton.setChecked(true);
        return n.f16010a;
    }
}
