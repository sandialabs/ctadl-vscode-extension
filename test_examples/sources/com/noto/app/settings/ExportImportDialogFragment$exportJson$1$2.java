package com.noto.app.settings;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ExportImportDialogFragment$exportJson$1$2 extends Lambda implements l<Throwable, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ExportImportDialogFragment f9433j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Context f9434k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ n3.a f9435l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExportImportDialogFragment$exportJson$1$2(ExportImportDialogFragment exportImportDialogFragment, Context context, n3.b bVar) {
        super(1);
        this.f9433j = exportImportDialogFragment;
        this.f9434k = context;
        this.f9435l = bVar;
    }

    @Override // u7.l
    public final n U(Throwable th) {
        String str;
        Throwable th2 = th;
        int i10 = ExportImportDialogFragment.f9425y0;
        ExportImportDialogFragment exportImportDialogFragment = this.f9433j;
        View j02 = exportImportDialogFragment.j0();
        if (j02 != null) {
            Context context = this.f9434k;
            g.e(context, "context");
            Object[] objArr = new Object[1];
            Uri uri = ((n3.b) this.f9435l).f16072a;
            g.e(uri, "file.uri");
            String path = uri.getPath();
            if (path != null) {
                str = kotlin.text.b.t1(path, ':', path);
            } else {
                str = null;
            }
            objArr[0] = str;
            ViewUtilsKt.w(j02, q.f(context, R.string.data_is_exported, objArr), Integer.valueOf((int) R.drawable.ic_round_file_upload_24), null, null, 28);
        }
        NavController g10 = ViewUtilsKt.g(exportImportDialogFragment);
        if (g10 != null) {
            g10.j();
        }
        exportImportDialogFragment.Z();
        return n.f16010a;
    }
}
