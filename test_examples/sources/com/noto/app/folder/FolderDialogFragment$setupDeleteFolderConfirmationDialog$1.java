package com.noto.app.folder;

import android.app.AlarmManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import androidx.navigation.t;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.util.ViewUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import n6.c;
import x6.h0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lm7/n;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FolderDialogFragment$setupDeleteFolderConfirmationDialog$1 extends Lambda implements u7.l<Integer, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FolderDialogFragment f8348j;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.folder.FolderDialogFragment$setupDeleteFolderConfirmationDialog$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends Lambda implements u7.l<Throwable, m7.n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ FolderDialogFragment f8349j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FolderDialogFragment folderDialogFragment) {
            super(1);
            this.f8349j = folderDialogFragment;
        }

        @Override // u7.l
        public final m7.n U(Throwable th) {
            Throwable th2 = th;
            this.f8349j.Z();
            return m7.n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderDialogFragment$setupDeleteFolderConfirmationDialog$1(FolderDialogFragment folderDialogFragment) {
        super(1);
        this.f8348j = folderDialogFragment;
    }

    @Override // u7.l
    public final m7.n U(Integer num) {
        Long l2;
        c.b bVar;
        List list;
        boolean z10;
        Bundle bundle;
        Integer num2 = num;
        FolderDialogFragment folderDialogFragment = this.f8348j;
        NavController g10 = ViewUtilsKt.g(folderDialogFragment);
        if (g10 != null && (bundle = g10.c(R.id.folderFragment).f5480k) != null) {
            l2 = Long.valueOf(bundle.getLong("folder_id"));
        } else {
            l2 = null;
        }
        int i10 = FolderDialogFragment.A0;
        long j2 = ((t6.a) ((kotlinx.coroutines.flow.m) folderDialogFragment.h0().k()).getValue()).f17592a;
        if (l2 != null && l2.longValue() == j2) {
            Bundle n = a1.b.n(new Pair("folder_id", -1L));
            t E = ma.i.E(FolderDialogFragment$setupDeleteFolderConfirmationDialog$1$options$1.f8350j);
            NavController g11 = ViewUtilsKt.g(folderDialogFragment);
            if (g11 != null) {
                g11.h(R.id.folderFragment, n, E);
            }
        }
        Object value = ((kotlinx.coroutines.flow.m) folderDialogFragment.h0().m()).getValue();
        if (value instanceof c.b) {
            bVar = (c.b) value;
        } else {
            bVar = null;
        }
        Context j10 = folderDialogFragment.j();
        if (j10 != null) {
            a1.c.W1(j10);
            a1.c.X1(j10);
            View view = (View) folderDialogFragment.f8335y0.getValue();
            if (view != null) {
                ViewUtilsKt.w(view, f7.q.f(j10, R.string.folder_is_deleted, new Object[0]), Integer.valueOf((int) R.drawable.ic_round_delete_sweep_24), Integer.valueOf(FolderDialogFragment.g0(folderDialogFragment)), (NotoColor) folderDialogFragment.f8336z0.getValue(), 16);
            }
            if (bVar != null && (list = (List) bVar.f16111a) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((h0) obj).f18683a.f17628i != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    h0 h0Var = (h0) it.next();
                    AlarmManager alarmManager = (AlarmManager) folderDialogFragment.f8333w0.getValue();
                    if (alarmManager != null) {
                        a1.c.U(alarmManager, j10, h0Var.f18683a.f17621a);
                    }
                }
            }
        }
        FolderViewModel h02 = folderDialogFragment.h0();
        h02.getClass();
        m0.b.M0(a1.b.d0(h02), null, null, new FolderViewModel$deleteFolder$1(h02, null), 3).O(new AnonymousClass2(folderDialogFragment));
        return m7.n.f16010a;
    }
}
