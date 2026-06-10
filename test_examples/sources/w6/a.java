package w6;

import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.noto.R;
import com.noto.app.filtered.FilteredFragment;
import com.noto.app.filtered.FilteredViewModel;
import com.noto.app.settings.ExportImportDialogFragment;
import com.noto.app.settings.ReadingModeSettingsFragment;
import com.noto.app.util.ViewUtilsKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Toolbar.h, androidx.activity.result.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18430a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Fragment f18431b;

    public /* synthetic */ a(int i10, Fragment fragment) {
        this.f18430a = i10;
        this.f18431b = fragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    @Override // androidx.activity.result.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        boolean z10;
        View view;
        boolean isNotificationPolicyAccessGranted;
        int i10 = this.f18430a;
        Fragment fragment = this.f18431b;
        switch (i10) {
            case 1:
                ExportImportDialogFragment.h0((ExportImportDialogFragment) fragment, (Uri) obj);
                return;
            default:
                ReadingModeSettingsFragment readingModeSettingsFragment = (ReadingModeSettingsFragment) fragment;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                int i11 = ReadingModeSettingsFragment.f9444h0;
                v7.g.f(readingModeSettingsFragment, "this$0");
                if (readingModeSettingsFragment.f9448g0) {
                    NotificationManager notificationManager = (NotificationManager) readingModeSettingsFragment.f9446e0.getValue();
                    if (notificationManager != null) {
                        isNotificationPolicyAccessGranted = notificationManager.isNotificationPolicyAccessGranted();
                        z10 = true;
                        if (isNotificationPolicyAccessGranted) {
                            if (!z10) {
                                readingModeSettingsFragment.Z().i();
                                return;
                            }
                            Context j2 = readingModeSettingsFragment.j();
                            if (j2 != null && (view = readingModeSettingsFragment.M) != null) {
                                ViewUtilsKt.w(view, f7.q.f(j2, R.string.permission_not_granted, new Object[0]), Integer.valueOf((int) R.drawable.ic_round_warning_24), null, null, 28);
                                return;
                            }
                            return;
                        }
                    }
                    z10 = false;
                    if (!z10) {
                    }
                } else {
                    return;
                }
                break;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public final boolean onMenuItemClick(MenuItem menuItem) {
        boolean z10;
        LinkedHashMap linkedHashMap;
        StateFlowImpl stateFlowImpl;
        LinkedHashMap linkedHashMap2;
        StateFlowImpl stateFlowImpl2;
        FilteredFragment filteredFragment = (FilteredFragment) this.f18431b;
        int i10 = FilteredFragment.f8233f0;
        v7.g.f(filteredFragment, "this$0");
        int itemId = menuItem.getItemId();
        boolean z11 = false;
        if (itemId != R.id.change_visibility) {
            if (itemId != R.id.search) {
                return false;
            }
            boolean booleanValue = ((Boolean) a1.b.m(filteredFragment.Z().f8298o).getValue()).booleanValue();
            FilteredViewModel Z = filteredFragment.Z();
            if (booleanValue) {
                Z.f8298o.setValue(Boolean.FALSE);
                Z.f8299p.setValue("");
            } else {
                Z.f8298o.setValue(Boolean.TRUE);
            }
        } else {
            Map map = (Map) filteredFragment.Z().e().getValue();
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            if (!z10) {
                Map map2 = (Map) filteredFragment.Z().d().getValue();
                if (!map2.isEmpty()) {
                    Iterator it = map2.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                z11 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (!z11) {
                    FilteredViewModel Z2 = filteredFragment.Z();
                    int ordinal = Z2.f8293i.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1 && ordinal != 2) {
                            if (ordinal != 3) {
                            }
                        } else {
                            Map map3 = (Map) Z2.d().getValue();
                            linkedHashMap2 = new LinkedHashMap(m0.b.O0(map3.size()));
                            for (Map.Entry entry2 : map3.entrySet()) {
                                linkedHashMap2.put(entry2.getKey(), Boolean.TRUE);
                            }
                            stateFlowImpl2 = Z2.f8297m;
                            stateFlowImpl2.setValue(linkedHashMap2);
                        }
                    }
                    Map map4 = (Map) Z2.e().getValue();
                    linkedHashMap2 = new LinkedHashMap(m0.b.O0(map4.size()));
                    for (Map.Entry entry3 : map4.entrySet()) {
                        linkedHashMap2.put(entry3.getKey(), Boolean.TRUE);
                    }
                    stateFlowImpl2 = Z2.f8296l;
                    stateFlowImpl2.setValue(linkedHashMap2);
                }
            }
            FilteredViewModel Z3 = filteredFragment.Z();
            int ordinal2 = Z3.f8293i.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1 && ordinal2 != 2) {
                    if (ordinal2 != 3) {
                    }
                } else {
                    Map map5 = (Map) Z3.d().getValue();
                    linkedHashMap = new LinkedHashMap(m0.b.O0(map5.size()));
                    for (Map.Entry entry4 : map5.entrySet()) {
                        linkedHashMap.put(entry4.getKey(), Boolean.FALSE);
                    }
                    stateFlowImpl = Z3.f8297m;
                    stateFlowImpl.setValue(linkedHashMap);
                }
            }
            Map map6 = (Map) Z3.e().getValue();
            linkedHashMap = new LinkedHashMap(m0.b.O0(map6.size()));
            for (Map.Entry entry5 : map6.entrySet()) {
                linkedHashMap.put(entry5.getKey(), Boolean.FALSE);
            }
            stateFlowImpl = Z3.f8296l;
            stateFlowImpl.setValue(linkedHashMap);
        }
        return true;
    }
}
