package com.noto.app;

import a1.b;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.d;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.y;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.n;
import androidx.navigation.s;
import com.noto.R;
import com.noto.app.a;
import com.noto.app.components.BaseActivity;
import com.noto.app.domain.model.VaultTimeout;
import com.noto.app.filtered.FilteredItemModel;
import com.noto.app.util.ViewUtilsKt;
import com.noto.app.vault.VaultTimeoutWorker;
import f7.p;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.c;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.l;
import m7.e;
import ma.i;
import n4.h;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/AppActivity;", "Lcom/noto/app/components/BaseActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AppActivity extends BaseActivity {
    public static final /* synthetic */ int N = 0;
    public final e H = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new AppActivity$special$$inlined$viewModel$default$1(this));
    public final e I = kotlin.a.b(new AppActivity$notificationManager$2(this));
    public final e J = kotlin.a.b(new AppActivity$navHostFragment$2(this));
    public final e K = kotlin.a.b(new AppActivity$navController$2(this));
    public final e L = kotlin.a.b(new AppActivity$workManager$2(this));
    public final d M;

    public AppActivity() {
        b.e eVar = new b.e();
        d3.d dVar = new d3.d(1, this);
        this.M = this.f419r.c("activity_rq#" + this.f418q.getAndIncrement(), this, eVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppViewModel q() {
        return (AppViewModel) this.H.getValue();
    }

    public static void r(AppActivity appActivity, Boolean bool) {
        g.f(appActivity, "this$0");
        appActivity.q().f7557r.setValue(bool);
    }

    public static final h s(AppActivity appActivity, long j2, TimeUnit timeUnit) {
        boolean z10;
        appActivity.getClass();
        h.a aVar = new h.a(VaultTimeoutWorker.class);
        g.f(timeUnit, "timeUnit");
        aVar.f16096b.f18339g = timeUnit.toMillis(j2);
        if (Long.MAX_VALUE - System.currentTimeMillis() > aVar.f16096b.f18339g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            aVar.c.add("VaultTimeout");
            return aVar.a();
        }
        throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x02bb, code lost:
        if (r2 == false) goto L37;
     */
    @Override // com.noto.app.components.BaseActivity, androidx.fragment.app.s, androidx.activity.ComponentActivity, m2.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        Bundle n;
        NavController u10;
        int i10;
        Bundle n10;
        int i11;
        boolean z10;
        super.onCreate(bundle);
        if (q().f7556q != null && Build.VERSION.SDK_INT >= 33 && n2.a.a(this, "android.permission.POST_NOTIFICATIONS") == -1) {
            this.M.a("android.permission.POST_NOTIFICATIONS");
        }
        p.a(v(), this);
        boolean z11 = false;
        View inflate = getLayoutInflater().inflate(R.layout.app_activity, (ViewGroup) null, false);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
        if (((FragmentContainerView) b.O(inflate, R.id.nav_host_fragment)) != null) {
            setContentView(coordinatorLayout);
            List<String> list = a.f7593a;
            Intent intent = getIntent();
            if (intent != null) {
                str = intent.getAction();
            } else {
                str = null;
            }
            boolean h22 = c.h2(list, str);
            int i12 = R.id.folderFragment;
            if (!h22) {
                long longValue = ((Number) q().n.getValue()).longValue();
                FilteredItemModel filteredItemModel = FilteredItemModel.All;
                if (longValue == -2) {
                    n10 = b.n(new Pair("model", filteredItemModel));
                } else {
                    FilteredItemModel filteredItemModel2 = FilteredItemModel.Recent;
                    if (longValue == -3) {
                        n10 = b.n(new Pair("model", filteredItemModel2));
                    } else {
                        FilteredItemModel filteredItemModel3 = FilteredItemModel.Scheduled;
                        if (longValue == -5) {
                            n10 = b.n(new Pair("model", filteredItemModel3));
                        } else {
                            FilteredItemModel filteredItemModel4 = FilteredItemModel.Archived;
                            if (longValue == -6) {
                                n10 = b.n(new Pair("model", filteredItemModel4));
                            } else if (longValue == -4) {
                                w(R.id.folderFragment, b.n(new Pair("folder_id", -1L)));
                                n e10 = u().e();
                                if (e10 != null && e10.f5511k == R.id.mainFragment) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10 && q().f7554o) {
                                    u().h(R.id.mainFragment, null, null);
                                    q().f7554o = false;
                                }
                            } else {
                                n10 = b.n(new Pair("folder_id", Long.valueOf(longValue)));
                                i11 = R.id.folderFragment;
                                w(i11, n10);
                            }
                        }
                    }
                }
                i11 = R.id.filteredFragment;
                w(i11, n10);
            } else {
                w(R.id.folderFragment, null);
            }
            f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AppActivity$setupState$1(this, null), q().f7549i), i.z(this));
            l lVar = q().f7553m;
            NavController u11 = u();
            g.e(u11, "navController");
            f.b(new kotlinx.coroutines.flow.i(lVar, ViewUtilsKt.b(u11), new AppActivity$setupState$2(this, null)), i.z(this));
            f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AppActivity$setupState$3(this, null), q().f7552l), i.z(this));
            f.b(b.z(q().f7552l, q().f7550j, q().f7551k, new AppActivity$setupState$4(this, null)), i.z(this));
            ((NavHostFragment) this.J.getValue()).h().f5284m.f5269a.add(new y.a(new n6.a(this)));
            Intent intent2 = getIntent();
            if (intent2 != null) {
                str2 = intent2.getAction();
            } else {
                str2 = null;
            }
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -2000953480:
                        if (!str2.equals("com.noto.intent.action.OPEN_FOLDER")) {
                            break;
                        } else {
                            n = b.n(new Pair("folder_id", Long.valueOf(getIntent().getLongExtra("folder_id", 0L))));
                            u().l(R.id.folderFragment, true);
                            u10 = u();
                            u10.h(i12, n, null);
                            break;
                        }
                    case -1236258610:
                        if (!str2.equals("com.noto.intent.action.SETTINGS")) {
                            break;
                        } else {
                            n e11 = u().e();
                            i10 = R.id.settingsFragment;
                            if (e11 != null && e11.f5511k == R.id.settingsFragment) {
                                z11 = true;
                                break;
                            }
                        }
                        break;
                    case -1173264947:
                        if (!str2.equals("android.intent.action.SEND")) {
                            break;
                        } else {
                            x(getIntent().getStringExtra("android.intent.extra.TEXT"));
                            break;
                        }
                    case -378519350:
                        if (!str2.equals("com.noto.intent.action.CREATE_NOTE")) {
                            break;
                        } else {
                            long longExtra = getIntent().getLongExtra("folder_id", 0L);
                            if (longExtra == 0) {
                                x(null);
                                break;
                            } else {
                                n = b.n(new Pair("folder_id", Long.valueOf(longExtra)), new Pair("selected_note_ids", new long[0]));
                                u().l(R.id.folderFragment, true);
                                u().h(R.id.folderFragment, n, null);
                                u10 = u();
                                i12 = R.id.noteFragment;
                                u10.h(i12, n, null);
                                break;
                            }
                        }
                    case 382513532:
                        if (!str2.equals("com.noto.intent.action.OPEN_NOTE")) {
                            break;
                        } else {
                            n = b.n(new Pair("folder_id", Long.valueOf(getIntent().getLongExtra("folder_id", 0L))), new Pair("note_id", Long.valueOf(getIntent().getLongExtra("note_id", 0L))), new Pair("selected_note_ids", new long[0]));
                            u().l(R.id.folderFragment, true);
                            u().h(R.id.folderFragment, n, null);
                            u10 = u();
                            i12 = R.id.noteFragment;
                            u10.h(i12, n, null);
                            break;
                        }
                    case 1085854534:
                        if (!str2.equals("com.noto.intent.action.CREATE_FOLDER")) {
                            break;
                        } else {
                            n e12 = u().e();
                            i10 = R.id.newFolderFragment;
                            if (e12 != null && e12.f5511k == R.id.newFolderFragment) {
                                z11 = true;
                            }
                            if (!z11) {
                                u().h(i10, null, null);
                                break;
                            }
                        }
                        break;
                }
            }
            setIntent(null);
            g.e(coordinatorLayout, "root");
            return;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.nav_host_fragment)));
    }

    @Override // d.f, androidx.fragment.app.s, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (q().f7550j.getValue() == VaultTimeout.OnAppClose) {
            q().d();
            NotificationManager v3 = v();
            g.f(v3, "<this>");
            v3.cancel(-1);
        }
    }

    public final NavController u() {
        return (NavController) this.K.getValue();
    }

    public final NotificationManager v() {
        return (NotificationManager) this.I.getValue();
    }

    public final void w(int i10, Bundle bundle) {
        NavController u10 = u();
        if (u10.c == null) {
            u10.c = new s(u10.f5434a, u10.f5443k);
        }
        androidx.navigation.p c = u10.c.c(R.navigation.nav_graph);
        c.w(i10);
        u().n(c, bundle);
    }

    public final void x(String str) {
        boolean z10;
        u().c(R.id.folderFragment).a().c("folder_id").d(this, new a.C0067a(new AppActivity$showSelectFolderDialog$1(str, this)));
        n e10 = u().e();
        if (e10 != null && e10.f5511k == R.id.selectFolderDialogFragment) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            u().h(R.id.selectFolderDialogFragment, b.n(new Pair("filtered_folder_ids", new long[0])), null);
        }
    }
}
