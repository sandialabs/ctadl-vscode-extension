package com.noto.app.settings;

import android.content.Context;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import u7.p;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lm7/n;", "it", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.settings.ExportImportDialogFragment$setupState$1", f = "ExportImportDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ExportImportDialogFragment$setupState$1 extends SuspendLambda implements p<n, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ ExportImportDialogFragment f9440m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExportImportDialogFragment$setupState$1(ExportImportDialogFragment exportImportDialogFragment, p7.c<? super ExportImportDialogFragment$setupState$1> cVar) {
        super(2, cVar);
        this.f9440m = exportImportDialogFragment;
    }

    @Override // u7.p
    public final Object R(n nVar, p7.c<? super n> cVar) {
        return ((ExportImportDialogFragment$setupState$1) a(nVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new ExportImportDialogFragment$setupState$1(this.f9440m, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        View j02;
        m0.b.n1(obj);
        ExportImportDialogFragment exportImportDialogFragment = this.f9440m;
        Context j2 = exportImportDialogFragment.j();
        if (j2 != null && (j02 = exportImportDialogFragment.j0()) != null) {
            ViewUtilsKt.w(j02, q.f(j2, R.string.data_is_imported, new Object[0]), new Integer((int) R.drawable.ic_round_file_download_24), null, null, 28);
        }
        NavController g10 = ViewUtilsKt.g(exportImportDialogFragment);
        if (g10 != null) {
            g10.j();
        }
        exportImportDialogFragment.Z();
        return n.f16010a;
    }
}
