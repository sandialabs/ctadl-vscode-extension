package com.noto.app.folder;

import android.view.Menu;
import android.view.MenuItem;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x6.h0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lx6/h0;", "selectedModels", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderFragment$setupState$15", f = "FolderFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderFragment$setupState$15 extends SuspendLambda implements u7.p<List<? extends h0>, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8406m;
    public final /* synthetic */ s6.i n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderFragment$setupState$15(s6.i iVar, p7.c<? super FolderFragment$setupState$15> cVar) {
        super(2, cVar);
        this.n = iVar;
    }

    @Override // u7.p
    public final Object R(List<? extends h0> list, p7.c<? super m7.n> cVar) {
        return ((FolderFragment$setupState$15) a(list, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        FolderFragment$setupState$15 folderFragment$setupState$15 = new FolderFragment$setupState$15(this.n, cVar);
        folderFragment$setupState$15.f8406m = obj;
        return folderFragment$setupState$15;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        MenuItem menuItem;
        int i10;
        int i11;
        MenuItem findItem;
        m0.b.n1(obj);
        List list = (List) this.f8406m;
        int size = list.size();
        boolean z10 = true;
        s6.i iVar = this.n;
        if (size == 1) {
            iVar.c.F(R.menu.folder_single_selection_menu);
            if (((h0) kotlin.collections.c.n2(list)).f18683a.f17628i == null) {
                i11 = R.drawable.ic_round_notification_add_24;
            } else {
                i11 = R.drawable.ic_round_edit_notifications_24;
            }
            Menu menu = iVar.c.getMenu();
            if (menu != null && (findItem = menu.findItem(R.id.add_reminder)) != null) {
                findItem.setIcon(i11);
            }
        } else {
            iVar.c.F(R.menu.folder_multi_selection_menu);
        }
        Menu menu2 = iVar.c.getMenu();
        if (menu2 != null) {
            menuItem = menu2.findItem(R.id.pin);
        } else {
            menuItem = null;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((h0) it.next()).f18683a.f17626g) {
                    z10 = false;
                    break;
                }
            }
        }
        if (z10) {
            if (menuItem != null) {
                menuItem.setTitle(R.string.pin);
            }
            if (menuItem != null) {
                i10 = R.drawable.ic_round_pin_24;
                menuItem.setIcon(i10);
            }
        } else {
            if (menuItem != null) {
                menuItem.setTitle(R.string.unpin);
            }
            if (menuItem != null) {
                i10 = R.drawable.ic_round_pin_off_24;
                menuItem.setIcon(i10);
            }
        }
        return m7.n.f16010a;
    }
}
