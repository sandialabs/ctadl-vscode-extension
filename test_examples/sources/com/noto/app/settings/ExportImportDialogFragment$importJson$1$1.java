package com.noto.app.settings;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.util.FileUtilsKt;
import ja.f0;
import ja.x;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.settings.ExportImportDialogFragment$importJson$1$1", f = "ExportImportDialogFragment.kt", l = {130, 131}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ExportImportDialogFragment$importJson$1$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f9436m;
    public final /* synthetic */ InputStream n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ExportImportDialogFragment f9437o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExportImportDialogFragment$importJson$1$1(InputStream inputStream, ExportImportDialogFragment exportImportDialogFragment, p7.c<? super ExportImportDialogFragment$importJson$1$1> cVar) {
        super(2, cVar);
        this.n = inputStream;
        this.f9437o = exportImportDialogFragment;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((ExportImportDialogFragment$importJson$1$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new ExportImportDialogFragment$importJson$1$1(this.n, this.f9437o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9436m;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    m0.b.n1(obj);
                    return n.f16010a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m0.b.n1(obj);
        } else {
            m0.b.n1(obj);
            this.f9436m = 1;
            obj = FileUtilsKt.a(this.n, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        int i11 = ExportImportDialogFragment.f9425y0;
        c cVar = (c) this.f9437o.f9426u0.getValue();
        this.f9436m = 2;
        cVar.getClass();
        if (m0.b.I1(this, f0.f12767b, new SettingsViewModel$importJson$2(cVar, (String) obj, null)) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return n.f16010a;
    }
}
