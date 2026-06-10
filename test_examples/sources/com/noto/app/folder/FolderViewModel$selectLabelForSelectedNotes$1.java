package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x6.h0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderViewModel$selectLabelForSelectedNotes$1", f = "FolderViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderViewModel$selectLabelForSelectedNotes$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8527m;
    public final /* synthetic */ FolderViewModel n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ long f8528o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$selectLabelForSelectedNotes$1(FolderViewModel folderViewModel, long j2, p7.c<? super FolderViewModel$selectLabelForSelectedNotes$1> cVar) {
        super(2, cVar);
        this.n = folderViewModel;
        this.f8528o = j2;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((FolderViewModel$selectLabelForSelectedNotes$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        FolderViewModel$selectLabelForSelectedNotes$1 folderViewModel$selectLabelForSelectedNotes$1 = new FolderViewModel$selectLabelForSelectedNotes$1(this.n, this.f8528o, cVar);
        folderViewModel$selectLabelForSelectedNotes$1.f8527m = obj;
        return folderViewModel$selectLabelForSelectedNotes$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        x xVar = (x) this.f8527m;
        FolderViewModel folderViewModel = this.n;
        for (h0 h0Var : folderViewModel.n()) {
            m0.b.M0(xVar, null, null, new FolderViewModel$selectLabelForSelectedNotes$1$1$1(folderViewModel, new t6.e(h0Var.f18683a.f17621a, this.f8528o), null), 3);
        }
        return m7.n.f16010a;
    }
}
