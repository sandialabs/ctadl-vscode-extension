package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x6.h0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderViewModel$moveSelectedNotes$1", f = "FolderViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderViewModel$moveSelectedNotes$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8514m;
    public final /* synthetic */ FolderViewModel n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ long f8515o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$moveSelectedNotes$1(FolderViewModel folderViewModel, long j2, p7.c<? super FolderViewModel$moveSelectedNotes$1> cVar) {
        super(2, cVar);
        this.n = folderViewModel;
        this.f8515o = j2;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((FolderViewModel$moveSelectedNotes$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        FolderViewModel$moveSelectedNotes$1 folderViewModel$moveSelectedNotes$1 = new FolderViewModel$moveSelectedNotes$1(this.n, this.f8515o, cVar);
        folderViewModel$moveSelectedNotes$1.f8514m = obj;
        return folderViewModel$moveSelectedNotes$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        x xVar = (x) this.f8514m;
        List<h0> n = this.n.n();
        FolderViewModel folderViewModel = this.n;
        long j2 = this.f8515o;
        for (h0 h0Var : n) {
            m0.b.M0(xVar, null, null, new FolderViewModel$moveSelectedNotes$1$1$1(folderViewModel, h0Var, j2, null), 3);
        }
        return m7.n.f16010a;
    }
}
