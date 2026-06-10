package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderViewModel$updateFolderScrollingPosition$1", f = "FolderViewModel.kt", l = {200}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderViewModel$updateFolderScrollingPosition$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f8554m;
    public final /* synthetic */ FolderViewModel n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f8555o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$updateFolderScrollingPosition$1(FolderViewModel folderViewModel, int i10, p7.c<? super FolderViewModel$updateFolderScrollingPosition$1> cVar) {
        super(2, cVar);
        this.n = folderViewModel;
        this.f8555o = i10;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((FolderViewModel$updateFolderScrollingPosition$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new FolderViewModel$updateFolderScrollingPosition$1(this.n, this.f8555o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f8554m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            FolderViewModel folderViewModel = this.n;
            if (((t6.a) ((kotlinx.coroutines.flow.m) folderViewModel.k()).getValue()).f17592a != 0) {
                t6.a a10 = t6.a.a((t6.a) ((kotlinx.coroutines.flow.m) folderViewModel.k()).getValue(), null, null, 0, null, null, 0, false, false, false, null, null, null, null, null, false, this.f8555o, null, null, null, 1966079);
                this.f8554m = 1;
                if (folderViewModel.f8425d.f(a10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return m7.n.f16010a;
    }
}
