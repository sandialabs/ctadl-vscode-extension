package com.noto.app.settings;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.p;
import androidx.navigation.NavController;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import d3.d;
import f7.q;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.l;
import m7.e;
import ma.i;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/settings/ExportImportDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ExportImportDialogFragment extends o6.b {

    /* renamed from: y0  reason: collision with root package name */
    public static final /* synthetic */ int f9425y0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public final e f9426u0;

    /* renamed from: v0  reason: collision with root package name */
    public final e f9427v0;

    /* renamed from: w0  reason: collision with root package name */
    public final p f9428w0;

    /* renamed from: x0  reason: collision with root package name */
    public final p f9429x0;

    public ExportImportDialogFragment() {
        super(false, 1, null);
        this.f9426u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new ExportImportDialogFragment$special$$inlined$viewModel$default$1(this));
        this.f9427v0 = kotlin.a.b(new ExportImportDialogFragment$parentView$2(this));
        this.f9428w0 = (p) Q(new w6.a(1, this), new b.c());
        this.f9429x0 = (p) Q(new d(2, this), new b.b());
    }

    public static void g0(ExportImportDialogFragment exportImportDialogFragment, Uri uri) {
        View j02;
        InputStream inputStream;
        g.f(exportImportDialogFragment, "this$0");
        if (uri != null) {
            Context j2 = exportImportDialogFragment.j();
            if (j2 != null) {
                NavController g10 = ViewUtilsKt.g(exportImportDialogFragment);
                if (g10 != null) {
                    ViewUtilsKt.o(g10, new b7.a(q.f(j2, R.string.importing_data, new Object[0])), null);
                }
                ContentResolver contentResolver = j2.getContentResolver();
                if (contentResolver != null) {
                    inputStream = contentResolver.openInputStream(uri);
                } else {
                    inputStream = null;
                }
                if (inputStream != null) {
                    i.z(exportImportDialogFragment).c(new ExportImportDialogFragment$importJson$1$1(inputStream, exportImportDialogFragment, null)).O(new ExportImportDialogFragment$importJson$1$2(exportImportDialogFragment));
                    return;
                }
                View j03 = exportImportDialogFragment.j0();
                if (j03 != null) {
                    ViewUtilsKt.w(j03, q.f(j2, R.string.importing_failed, new Object[0]), Integer.valueOf((int) R.drawable.ic_round_error_24), null, null, 28);
                }
                NavController g11 = ViewUtilsKt.g(exportImportDialogFragment);
                if (g11 != null) {
                    g11.j();
                }
                exportImportDialogFragment.Z();
                return;
            }
            return;
        }
        Context j10 = exportImportDialogFragment.j();
        if (j10 != null && (j02 = exportImportDialogFragment.j0()) != null) {
            ViewUtilsKt.w(j02, q.f(j10, R.string.no_file_is_selected, new Object[0]), Integer.valueOf((int) R.drawable.ic_round_warning_24), null, null, 28);
        }
        exportImportDialogFragment.Z();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
        if (r10 != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h0(ExportImportDialogFragment exportImportDialogFragment, Uri uri) {
        View j02;
        Uri uri2;
        n3.b bVar;
        NavController g10;
        OutputStream outputStream;
        g.f(exportImportDialogFragment, "this$0");
        if (uri != null) {
            Context j2 = exportImportDialogFragment.j();
            if (j2 != null) {
                NavController g11 = ViewUtilsKt.g(exportImportDialogFragment);
                if (g11 != null) {
                    ViewUtilsKt.o(g11, new b7.a(q.f(j2, R.string.exporting_data, new Object[0])), null);
                }
                try {
                    uri2 = DocumentsContract.createDocument(j2.getContentResolver(), DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)), "application/json", "Noto.json");
                } catch (Exception unused) {
                    uri2 = null;
                }
                if (uri2 != null) {
                    bVar = new n3.b(j2, uri2);
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    ContentResolver contentResolver = j2.getContentResolver();
                    if (contentResolver != null) {
                        outputStream = contentResolver.openOutputStream(bVar.f16072a);
                    } else {
                        outputStream = null;
                    }
                    if (outputStream != null) {
                        i.z(exportImportDialogFragment).c(new ExportImportDialogFragment$exportJson$1$1(exportImportDialogFragment, outputStream, null)).O(new ExportImportDialogFragment$exportJson$1$2(exportImportDialogFragment, j2, bVar));
                        return;
                    }
                    View j03 = exportImportDialogFragment.j0();
                    if (j03 != null) {
                        ViewUtilsKt.w(j03, q.f(j2, R.string.exporting_failed, new Object[0]), Integer.valueOf((int) R.drawable.ic_round_error_24), null, null, 28);
                    }
                    g10 = ViewUtilsKt.g(exportImportDialogFragment);
                    if (g10 != null) {
                        g10.j();
                    }
                    exportImportDialogFragment.Z();
                    return;
                }
                View j04 = exportImportDialogFragment.j0();
                if (j04 != null) {
                    ViewUtilsKt.w(j04, q.f(j2, R.string.create_file_failed, new Object[0]), Integer.valueOf((int) R.drawable.ic_round_error_24), null, null, 28);
                }
                g10 = ViewUtilsKt.g(exportImportDialogFragment);
            }
        } else {
            Context j10 = exportImportDialogFragment.j();
            if (j10 != null && (j02 = exportImportDialogFragment.j0()) != null) {
                ViewUtilsKt.w(j02, q.f(j10, R.string.no_folder_is_selected, new Object[0]), Integer.valueOf((int) R.drawable.ic_round_warning_24), null, null, 28);
            }
            exportImportDialogFragment.Z();
        }
    }

    public final View j0() {
        return (View) this.f9427v0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.export_import_dialog_fragment, viewGroup, false);
        int i10 = R.id.ll;
        if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
            i10 = R.id.tb;
            View O = a1.b.O(inflate, R.id.tb);
            if (O != null) {
                s6.c a10 = s6.c.a(O);
                MaterialTextView materialTextView = (MaterialTextView) a1.b.O(inflate, R.id.tv_export);
                if (materialTextView != null) {
                    MaterialTextView materialTextView2 = (MaterialTextView) a1.b.O(inflate, R.id.tv_import);
                    if (materialTextView2 != null) {
                        NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                        Context j2 = j();
                        if (j2 != null) {
                            str = q.f(j2, R.string.export_import_data, new Object[0]);
                        } else {
                            str = null;
                        }
                        a10.c.setText(str);
                        f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ExportImportDialogFragment$setupState$1(this, null), new l(((c) this.f9426u0.getValue()).f9677w, null)), i.z(this));
                        materialTextView.setOnClickListener(new o6.c(6, this));
                        materialTextView2.setOnClickListener(new h6.b(10, this));
                        g.e(nestedScrollView, "root");
                        return nestedScrollView;
                    }
                    i10 = R.id.tv_import;
                } else {
                    i10 = R.id.tv_export;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
