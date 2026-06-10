package com.noto.app.folder;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.d0;
import androidx.lifecycle.w;
import androidx.navigation.NavController;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.folder.FolderDialogFragment;
import com.noto.app.util.ViewUtilsKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import n2.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/folder/FolderDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FolderDialogFragment extends o6.b {
    public static final /* synthetic */ int A0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public final m7.e f8331u0;

    /* renamed from: v0  reason: collision with root package name */
    public final androidx.navigation.f f8332v0;

    /* renamed from: w0  reason: collision with root package name */
    public final m7.e f8333w0;

    /* renamed from: x0  reason: collision with root package name */
    public final m7.e f8334x0;

    /* renamed from: y0  reason: collision with root package name */
    public final m7.e f8335y0;

    /* renamed from: z0  reason: collision with root package name */
    public final m7.e f8336z0;

    /* loaded from: classes.dex */
    public static final class a implements w, v7.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u7.l f8340a;

        public a(u7.l lVar) {
            this.f8340a = lVar;
        }

        @Override // v7.e
        public final u7.l a() {
            return this.f8340a;
        }

        @Override // androidx.lifecycle.w
        public final /* synthetic */ void b(Object obj) {
            this.f8340a.U(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof w) && (obj instanceof v7.e)) {
                return v7.g.a(this.f8340a, ((v7.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f8340a.hashCode();
        }
    }

    public FolderDialogFragment() {
        super(false, 1, null);
        this.f8331u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new FolderDialogFragment$special$$inlined$viewModel$default$1(this, new FolderDialogFragment$viewModel$2(this)));
        this.f8332v0 = new androidx.navigation.f(v7.i.a(x6.f.class), new FolderDialogFragment$special$$inlined$navArgs$1(this));
        this.f8333w0 = kotlin.a.b(new FolderDialogFragment$alarmManager$2(this));
        this.f8334x0 = kotlin.a.b(FolderDialogFragment$anchorViewId$2.f8342j);
        this.f8335y0 = kotlin.a.b(new FolderDialogFragment$parentView$2(this));
        this.f8336z0 = kotlin.a.b(new FolderDialogFragment$folderColor$2(this));
    }

    public static final int g0(FolderDialogFragment folderDialogFragment) {
        return ((Number) folderDialogFragment.f8334x0.getValue()).intValue();
    }

    public final FolderViewModel h0() {
        return (FolderViewModel) this.f8331u0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        v7.g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.folder_dialog_fragment, viewGroup, false);
        int i10 = R.id.divider;
        View O = a1.b.O(inflate, R.id.divider);
        if (O != null) {
            s6.d dVar = new s6.d(O);
            i10 = R.id.ll;
            if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
                i10 = R.id.tb;
                View O2 = a1.b.O(inflate, R.id.tb);
                if (O2 != null) {
                    s6.c a10 = s6.c.a(O2);
                    MaterialTextView materialTextView = (MaterialTextView) a1.b.O(inflate, R.id.tv_archive_folder);
                    if (materialTextView != null) {
                        MaterialTextView materialTextView2 = (MaterialTextView) a1.b.O(inflate, R.id.tv_delete_folder);
                        if (materialTextView2 != null) {
                            MaterialTextView materialTextView3 = (MaterialTextView) a1.b.O(inflate, R.id.tv_edit_folder);
                            if (materialTextView3 != null) {
                                MaterialTextView materialTextView4 = (MaterialTextView) a1.b.O(inflate, R.id.tv_new_note_shortcut);
                                if (materialTextView4 != null) {
                                    MaterialTextView materialTextView5 = (MaterialTextView) a1.b.O(inflate, R.id.tv_pin_folder);
                                    if (materialTextView5 != null) {
                                        MaterialTextView materialTextView6 = (MaterialTextView) a1.b.O(inflate, R.id.tv_vault_folder);
                                        if (materialTextView6 != null) {
                                            View O3 = a1.b.O(inflate, R.id.v_folder);
                                            if (O3 != null) {
                                                NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                                s6.h hVar = new s6.h(nestedScrollView, dVar, a10, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5, materialTextView6, s6.j.a(O3));
                                                materialTextView3.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.folder.e

                                                    /* renamed from: j  reason: collision with root package name */
                                                    public final /* synthetic */ FolderDialogFragment f8690j;

                                                    {
                                                        this.f8690j = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i11 = r2;
                                                        FolderDialogFragment folderDialogFragment = this.f8690j;
                                                        switch (i11) {
                                                            case 0:
                                                                int i12 = FolderDialogFragment.A0;
                                                                v7.g.f(folderDialogFragment, "this$0");
                                                                NavController g10 = ViewUtilsKt.g(folderDialogFragment);
                                                                if (g10 != null) {
                                                                    ViewUtilsKt.o(g10, new x6.h(((x6.f) folderDialogFragment.f8332v0.getValue()).f18676a), null);
                                                                }
                                                                folderDialogFragment.Z();
                                                                return;
                                                            default:
                                                                int i13 = FolderDialogFragment.A0;
                                                                v7.g.f(folderDialogFragment, "this$0");
                                                                FolderViewModel h02 = folderDialogFragment.h0();
                                                                h02.getClass();
                                                                m0.b.M0(a1.b.d0(h02), null, null, new FolderViewModel$toggleFolderIsVaulted$1(h02, null), 3).O(new FolderDialogFragment$setupListeners$4$1(folderDialogFragment));
                                                                return;
                                                        }
                                                    }
                                                });
                                                materialTextView4.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.folder.f

                                                    /* renamed from: j  reason: collision with root package name */
                                                    public final /* synthetic */ FolderDialogFragment f8692j;

                                                    {
                                                        this.f8692j = this;
                                                    }

                                                    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
                                                    @Override // android.view.View.OnClickListener
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                    */
                                                    public final void onClick(View view) {
                                                        Drawable drawable;
                                                        Bitmap bitmap;
                                                        Object obj;
                                                        Resources resources;
                                                        Object systemService;
                                                        boolean z10;
                                                        int i11 = r2;
                                                        FolderDialogFragment folderDialogFragment = this.f8692j;
                                                        switch (i11) {
                                                            case 0:
                                                                int i12 = FolderDialogFragment.A0;
                                                                v7.g.f(folderDialogFragment, "this$0");
                                                                Context j2 = folderDialogFragment.j();
                                                                if (j2 != null && o2.d.e(j2)) {
                                                                    o2.b c = f7.f.c(j2, (t6.a) ((kotlinx.coroutines.flow.m) folderDialogFragment.h0().k()).getValue());
                                                                    int i13 = Build.VERSION.SDK_INT;
                                                                    if (i13 <= 31) {
                                                                        if ((c.f16232p & 1) != 0) {
                                                                            z10 = true;
                                                                        } else {
                                                                            z10 = false;
                                                                        }
                                                                        if (z10) {
                                                                        }
                                                                    }
                                                                    if (i13 >= 26) {
                                                                        systemService = j2.getSystemService(ShortcutManager.class);
                                                                        ((ShortcutManager) systemService).requestPinShortcut(c.b(), null);
                                                                    } else if (o2.d.e(j2)) {
                                                                        Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                                                                        Intent[] intentArr = c.c;
                                                                        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", c.f16222e.toString());
                                                                        if (c.f16225h != null) {
                                                                            if (c.f16226i) {
                                                                                PackageManager packageManager = c.f16219a.getPackageManager();
                                                                                ComponentName componentName = c.f16221d;
                                                                                if (componentName != null) {
                                                                                    try {
                                                                                        drawable = packageManager.getActivityIcon(componentName);
                                                                                    } catch (PackageManager.NameNotFoundException unused) {
                                                                                    }
                                                                                    if (drawable == null) {
                                                                                        drawable = c.f16219a.getApplicationInfo().loadIcon(packageManager);
                                                                                    }
                                                                                }
                                                                                drawable = null;
                                                                                if (drawable == null) {
                                                                                }
                                                                            } else {
                                                                                drawable = null;
                                                                            }
                                                                            IconCompat iconCompat = c.f16225h;
                                                                            Context context = c.f16219a;
                                                                            if (iconCompat.f4616a == 2 && (obj = iconCompat.f4617b) != null) {
                                                                                String str2 = (String) obj;
                                                                                if (str2.contains(":")) {
                                                                                    String str3 = str2.split(":", -1)[1];
                                                                                    String str4 = str3.split("/", -1)[0];
                                                                                    String str5 = str3.split("/", -1)[1];
                                                                                    String str6 = str2.split(":", -1)[0];
                                                                                    if ("0_resource_name_obfuscated".equals(str5)) {
                                                                                        Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                                                                                    } else {
                                                                                        String d5 = iconCompat.d();
                                                                                        if ("android".equals(d5)) {
                                                                                            resources = Resources.getSystem();
                                                                                        } else {
                                                                                            PackageManager packageManager2 = context.getPackageManager();
                                                                                            try {
                                                                                                ApplicationInfo applicationInfo = packageManager2.getApplicationInfo(d5, 8192);
                                                                                                if (applicationInfo != null) {
                                                                                                    resources = packageManager2.getResourcesForApplication(applicationInfo);
                                                                                                }
                                                                                            } catch (PackageManager.NameNotFoundException e10) {
                                                                                                Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", d5), e10);
                                                                                            }
                                                                                            resources = null;
                                                                                        }
                                                                                        int identifier = resources.getIdentifier(str5, str4, str6);
                                                                                        if (iconCompat.f4619e != identifier) {
                                                                                            Log.i("IconCompat", "Id has changed for " + d5 + " " + str2);
                                                                                            iconCompat.f4619e = identifier;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            int i14 = iconCompat.f4616a;
                                                                            if (i14 != 1) {
                                                                                if (i14 != 2) {
                                                                                    if (i14 == 5) {
                                                                                        bitmap = IconCompat.a((Bitmap) iconCompat.f4617b, true);
                                                                                    } else {
                                                                                        throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
                                                                                    }
                                                                                } else {
                                                                                    try {
                                                                                        Context createPackageContext = context.createPackageContext(iconCompat.d(), 0);
                                                                                        if (drawable == null) {
                                                                                            intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(createPackageContext, iconCompat.f4619e));
                                                                                        } else {
                                                                                            int i15 = iconCompat.f4619e;
                                                                                            Object obj2 = n2.a.f16069a;
                                                                                            Drawable b5 = a.b.b(createPackageContext, i15);
                                                                                            if (b5.getIntrinsicWidth() > 0 && b5.getIntrinsicHeight() > 0) {
                                                                                                bitmap = Bitmap.createBitmap(b5.getIntrinsicWidth(), b5.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                                                                                                b5.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                                                                                b5.draw(new Canvas(bitmap));
                                                                                            }
                                                                                            int launcherLargeIconSize = ((ActivityManager) createPackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                                                                                            bitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                                                                                            b5.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                                                                            b5.draw(new Canvas(bitmap));
                                                                                        }
                                                                                    } catch (PackageManager.NameNotFoundException e11) {
                                                                                        throw new IllegalArgumentException("Can't find package " + iconCompat.f4617b, e11);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                bitmap = (Bitmap) iconCompat.f4617b;
                                                                                if (drawable != null) {
                                                                                    bitmap = bitmap.copy(bitmap.getConfig(), true);
                                                                                }
                                                                            }
                                                                            if (drawable != null) {
                                                                                int width = bitmap.getWidth();
                                                                                int height = bitmap.getHeight();
                                                                                drawable.setBounds(width / 2, height / 2, width, height);
                                                                                drawable.draw(new Canvas(bitmap));
                                                                            }
                                                                            intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
                                                                        }
                                                                        j2.sendBroadcast(intent);
                                                                    }
                                                                }
                                                                folderDialogFragment.Z();
                                                                return;
                                                            default:
                                                                int i16 = FolderDialogFragment.A0;
                                                                v7.g.f(folderDialogFragment, "this$0");
                                                                FolderViewModel h02 = folderDialogFragment.h0();
                                                                h02.getClass();
                                                                m0.b.M0(a1.b.d0(h02), null, null, new FolderViewModel$toggleFolderIsPinned$1(h02, null), 3).O(new FolderDialogFragment$setupListeners$5$1(folderDialogFragment));
                                                                return;
                                                        }
                                                    }
                                                });
                                                materialTextView.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.folder.g

                                                    /* renamed from: j  reason: collision with root package name */
                                                    public final /* synthetic */ FolderDialogFragment f8694j;

                                                    {
                                                        this.f8694j = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        androidx.navigation.i d5;
                                                        d0 a11;
                                                        androidx.navigation.i d10;
                                                        d0 a12;
                                                        int i11 = r2;
                                                        FolderDialogFragment folderDialogFragment = this.f8694j;
                                                        switch (i11) {
                                                            case 0:
                                                                int i12 = FolderDialogFragment.A0;
                                                                v7.g.f(folderDialogFragment, "this$0");
                                                                if (((t6.a) ((kotlinx.coroutines.flow.m) folderDialogFragment.h0().k()).getValue()).f17606q) {
                                                                    Context j2 = folderDialogFragment.j();
                                                                    if (j2 != null) {
                                                                        String f10 = f7.q.f(j2, R.string.archive_vaulted_folder_confirmation, new Object[0]);
                                                                        String f11 = f7.q.f(j2, R.string.archive_vaulted_folder_description, new Object[0]);
                                                                        String f12 = f7.q.f(j2, R.string.archive_folder, new Object[0]);
                                                                        NavController g10 = ViewUtilsKt.g(folderDialogFragment);
                                                                        if (g10 != null && (d5 = g10.d()) != null && (a11 = d5.a()) != null) {
                                                                            a11.c("click_listener").d(folderDialogFragment.r(), new FolderDialogFragment.a(new FolderDialogFragment$setupArchiveVaultedFolderConfirmationDialog$1(folderDialogFragment)));
                                                                        }
                                                                        NavController g11 = ViewUtilsKt.g(folderDialogFragment);
                                                                        if (g11 != null) {
                                                                            ViewUtilsKt.o(g11, new x6.g(f10, f11, f12), null);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                FolderViewModel h02 = folderDialogFragment.h0();
                                                                h02.getClass();
                                                                m0.b.M0(a1.b.d0(h02), null, null, new FolderViewModel$toggleFolderIsArchived$1(h02, null), 3).O(new FolderDialogFragment$setupListeners$3$2(folderDialogFragment));
                                                                return;
                                                            default:
                                                                int i13 = FolderDialogFragment.A0;
                                                                v7.g.f(folderDialogFragment, "this$0");
                                                                Context j10 = folderDialogFragment.j();
                                                                if (j10 != null) {
                                                                    String f13 = f7.q.f(j10, R.string.delete_folder_confirmation, new Object[0]);
                                                                    String f14 = f7.q.f(j10, R.string.delete_folder_description, new Object[0]);
                                                                    String f15 = f7.q.f(j10, R.string.delete_folder, new Object[0]);
                                                                    NavController g12 = ViewUtilsKt.g(folderDialogFragment);
                                                                    if (g12 != null && (d10 = g12.d()) != null && (a12 = d10.a()) != null) {
                                                                        a12.c("click_listener").d(folderDialogFragment.r(), new FolderDialogFragment.a(new FolderDialogFragment$setupDeleteFolderConfirmationDialog$1(folderDialogFragment)));
                                                                    }
                                                                    NavController g13 = ViewUtilsKt.g(folderDialogFragment);
                                                                    if (g13 != null) {
                                                                        ViewUtilsKt.o(g13, new x6.g(f13, f14, f15), null);
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                });
                                                materialTextView6.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.folder.e

                                                    /* renamed from: j  reason: collision with root package name */
                                                    public final /* synthetic */ FolderDialogFragment f8690j;

                                                    {
                                                        this.f8690j = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i11 = r2;
                                                        FolderDialogFragment folderDialogFragment = this.f8690j;
                                                        switch (i11) {
                                                            case 0:
                                                                int i12 = FolderDialogFragment.A0;
                                                                v7.g.f(folderDialogFragment, "this$0");
                                                                NavController g10 = ViewUtilsKt.g(folderDialogFragment);
                                                                if (g10 != null) {
                                                                    ViewUtilsKt.o(g10, new x6.h(((x6.f) folderDialogFragment.f8332v0.getValue()).f18676a), null);
                                                                }
                                                                folderDialogFragment.Z();
                                                                return;
                                                            default:
                                                                int i13 = FolderDialogFragment.A0;
                                                                v7.g.f(folderDialogFragment, "this$0");
                                                                FolderViewModel h02 = folderDialogFragment.h0();
                                                                h02.getClass();
                                                                m0.b.M0(a1.b.d0(h02), null, null, new FolderViewModel$toggleFolderIsVaulted$1(h02, null), 3).O(new FolderDialogFragment$setupListeners$4$1(folderDialogFragment));
                                                                return;
                                                        }
                                                    }
                                                });
                                                materialTextView5.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.folder.f

                                                    /* renamed from: j  reason: collision with root package name */
                                                    public final /* synthetic */ FolderDialogFragment f8692j;

                                                    {
                                                        this.f8692j = this;
                                                    }

                                                    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
                                                    @Override // android.view.View.OnClickListener
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                    */
                                                    public final void onClick(View view) {
                                                        Drawable drawable;
                                                        Bitmap bitmap;
                                                        Object obj;
                                                        Resources resources;
                                                        Object systemService;
                                                        boolean z10;
                                                        int i11 = r2;
                                                        FolderDialogFragment folderDialogFragment = this.f8692j;
                                                        switch (i11) {
                                                            case 0:
                                                                int i12 = FolderDialogFragment.A0;
                                                                v7.g.f(folderDialogFragment, "this$0");
                                                                Context j2 = folderDialogFragment.j();
                                                                if (j2 != null && o2.d.e(j2)) {
                                                                    o2.b c = f7.f.c(j2, (t6.a) ((kotlinx.coroutines.flow.m) folderDialogFragment.h0().k()).getValue());
                                                                    int i13 = Build.VERSION.SDK_INT;
                                                                    if (i13 <= 31) {
                                                                        if ((c.f16232p & 1) != 0) {
                                                                            z10 = true;
                                                                        } else {
                                                                            z10 = false;
                                                                        }
                                                                        if (z10) {
                                                                        }
                                                                    }
                                                                    if (i13 >= 26) {
                                                                        systemService = j2.getSystemService(ShortcutManager.class);
                                                                        ((ShortcutManager) systemService).requestPinShortcut(c.b(), null);
                                                                    } else if (o2.d.e(j2)) {
                                                                        Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                                                                        Intent[] intentArr = c.c;
                                                                        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", c.f16222e.toString());
                                                                        if (c.f16225h != null) {
                                                                            if (c.f16226i) {
                                                                                PackageManager packageManager = c.f16219a.getPackageManager();
                                                                                ComponentName componentName = c.f16221d;
                                                                                if (componentName != null) {
                                                                                    try {
                                                                                        drawable = packageManager.getActivityIcon(componentName);
                                                                                    } catch (PackageManager.NameNotFoundException unused) {
                                                                                    }
                                                                                    if (drawable == null) {
                                                                                        drawable = c.f16219a.getApplicationInfo().loadIcon(packageManager);
                                                                                    }
                                                                                }
                                                                                drawable = null;
                                                                                if (drawable == null) {
                                                                                }
                                                                            } else {
                                                                                drawable = null;
                                                                            }
                                                                            IconCompat iconCompat = c.f16225h;
                                                                            Context context = c.f16219a;
                                                                            if (iconCompat.f4616a == 2 && (obj = iconCompat.f4617b) != null) {
                                                                                String str2 = (String) obj;
                                                                                if (str2.contains(":")) {
                                                                                    String str3 = str2.split(":", -1)[1];
                                                                                    String str4 = str3.split("/", -1)[0];
                                                                                    String str5 = str3.split("/", -1)[1];
                                                                                    String str6 = str2.split(":", -1)[0];
                                                                                    if ("0_resource_name_obfuscated".equals(str5)) {
                                                                                        Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                                                                                    } else {
                                                                                        String d5 = iconCompat.d();
                                                                                        if ("android".equals(d5)) {
                                                                                            resources = Resources.getSystem();
                                                                                        } else {
                                                                                            PackageManager packageManager2 = context.getPackageManager();
                                                                                            try {
                                                                                                ApplicationInfo applicationInfo = packageManager2.getApplicationInfo(d5, 8192);
                                                                                                if (applicationInfo != null) {
                                                                                                    resources = packageManager2.getResourcesForApplication(applicationInfo);
                                                                                                }
                                                                                            } catch (PackageManager.NameNotFoundException e10) {
                                                                                                Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", d5), e10);
                                                                                            }
                                                                                            resources = null;
                                                                                        }
                                                                                        int identifier = resources.getIdentifier(str5, str4, str6);
                                                                                        if (iconCompat.f4619e != identifier) {
                                                                                            Log.i("IconCompat", "Id has changed for " + d5 + " " + str2);
                                                                                            iconCompat.f4619e = identifier;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            int i14 = iconCompat.f4616a;
                                                                            if (i14 != 1) {
                                                                                if (i14 != 2) {
                                                                                    if (i14 == 5) {
                                                                                        bitmap = IconCompat.a((Bitmap) iconCompat.f4617b, true);
                                                                                    } else {
                                                                                        throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
                                                                                    }
                                                                                } else {
                                                                                    try {
                                                                                        Context createPackageContext = context.createPackageContext(iconCompat.d(), 0);
                                                                                        if (drawable == null) {
                                                                                            intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(createPackageContext, iconCompat.f4619e));
                                                                                        } else {
                                                                                            int i15 = iconCompat.f4619e;
                                                                                            Object obj2 = n2.a.f16069a;
                                                                                            Drawable b5 = a.b.b(createPackageContext, i15);
                                                                                            if (b5.getIntrinsicWidth() > 0 && b5.getIntrinsicHeight() > 0) {
                                                                                                bitmap = Bitmap.createBitmap(b5.getIntrinsicWidth(), b5.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                                                                                                b5.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                                                                                b5.draw(new Canvas(bitmap));
                                                                                            }
                                                                                            int launcherLargeIconSize = ((ActivityManager) createPackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                                                                                            bitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                                                                                            b5.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                                                                            b5.draw(new Canvas(bitmap));
                                                                                        }
                                                                                    } catch (PackageManager.NameNotFoundException e11) {
                                                                                        throw new IllegalArgumentException("Can't find package " + iconCompat.f4617b, e11);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                bitmap = (Bitmap) iconCompat.f4617b;
                                                                                if (drawable != null) {
                                                                                    bitmap = bitmap.copy(bitmap.getConfig(), true);
                                                                                }
                                                                            }
                                                                            if (drawable != null) {
                                                                                int width = bitmap.getWidth();
                                                                                int height = bitmap.getHeight();
                                                                                drawable.setBounds(width / 2, height / 2, width, height);
                                                                                drawable.draw(new Canvas(bitmap));
                                                                            }
                                                                            intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
                                                                        }
                                                                        j2.sendBroadcast(intent);
                                                                    }
                                                                }
                                                                folderDialogFragment.Z();
                                                                return;
                                                            default:
                                                                int i16 = FolderDialogFragment.A0;
                                                                v7.g.f(folderDialogFragment, "this$0");
                                                                FolderViewModel h02 = folderDialogFragment.h0();
                                                                h02.getClass();
                                                                m0.b.M0(a1.b.d0(h02), null, null, new FolderViewModel$toggleFolderIsPinned$1(h02, null), 3).O(new FolderDialogFragment$setupListeners$5$1(folderDialogFragment));
                                                                return;
                                                        }
                                                    }
                                                });
                                                materialTextView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.folder.g

                                                    /* renamed from: j  reason: collision with root package name */
                                                    public final /* synthetic */ FolderDialogFragment f8694j;

                                                    {
                                                        this.f8694j = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        androidx.navigation.i d5;
                                                        d0 a11;
                                                        androidx.navigation.i d10;
                                                        d0 a12;
                                                        int i11 = r2;
                                                        FolderDialogFragment folderDialogFragment = this.f8694j;
                                                        switch (i11) {
                                                            case 0:
                                                                int i12 = FolderDialogFragment.A0;
                                                                v7.g.f(folderDialogFragment, "this$0");
                                                                if (((t6.a) ((kotlinx.coroutines.flow.m) folderDialogFragment.h0().k()).getValue()).f17606q) {
                                                                    Context j2 = folderDialogFragment.j();
                                                                    if (j2 != null) {
                                                                        String f10 = f7.q.f(j2, R.string.archive_vaulted_folder_confirmation, new Object[0]);
                                                                        String f11 = f7.q.f(j2, R.string.archive_vaulted_folder_description, new Object[0]);
                                                                        String f12 = f7.q.f(j2, R.string.archive_folder, new Object[0]);
                                                                        NavController g10 = ViewUtilsKt.g(folderDialogFragment);
                                                                        if (g10 != null && (d5 = g10.d()) != null && (a11 = d5.a()) != null) {
                                                                            a11.c("click_listener").d(folderDialogFragment.r(), new FolderDialogFragment.a(new FolderDialogFragment$setupArchiveVaultedFolderConfirmationDialog$1(folderDialogFragment)));
                                                                        }
                                                                        NavController g11 = ViewUtilsKt.g(folderDialogFragment);
                                                                        if (g11 != null) {
                                                                            ViewUtilsKt.o(g11, new x6.g(f10, f11, f12), null);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                FolderViewModel h02 = folderDialogFragment.h0();
                                                                h02.getClass();
                                                                m0.b.M0(a1.b.d0(h02), null, null, new FolderViewModel$toggleFolderIsArchived$1(h02, null), 3).O(new FolderDialogFragment$setupListeners$3$2(folderDialogFragment));
                                                                return;
                                                            default:
                                                                int i13 = FolderDialogFragment.A0;
                                                                v7.g.f(folderDialogFragment, "this$0");
                                                                Context j10 = folderDialogFragment.j();
                                                                if (j10 != null) {
                                                                    String f13 = f7.q.f(j10, R.string.delete_folder_confirmation, new Object[0]);
                                                                    String f14 = f7.q.f(j10, R.string.delete_folder_description, new Object[0]);
                                                                    String f15 = f7.q.f(j10, R.string.delete_folder, new Object[0]);
                                                                    NavController g12 = ViewUtilsKt.g(folderDialogFragment);
                                                                    if (g12 != null && (d10 = g12.d()) != null && (a12 = d10.a()) != null) {
                                                                        a12.c("click_listener").d(folderDialogFragment.r(), new FolderDialogFragment.a(new FolderDialogFragment$setupDeleteFolderConfirmationDialog$1(folderDialogFragment)));
                                                                    }
                                                                    NavController g13 = ViewUtilsKt.g(folderDialogFragment);
                                                                    if (g13 != null) {
                                                                        ViewUtilsKt.o(g13, new x6.g(f13, f14, f15), null);
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                });
                                                Context j2 = j();
                                                if (j2 != null) {
                                                    str = f7.q.f(j2, R.string.folder_options, new Object[0]);
                                                } else {
                                                    str = null;
                                                }
                                                a10.c.setText(str);
                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderDialogFragment$setupState$1(this, hVar, null), h0().k()), ma.i.z(this));
                                                v7.g.e(nestedScrollView, "root");
                                                return nestedScrollView;
                                            }
                                            i10 = R.id.v_folder;
                                        } else {
                                            i10 = R.id.tv_vault_folder;
                                        }
                                    } else {
                                        i10 = R.id.tv_pin_folder;
                                    }
                                } else {
                                    i10 = R.id.tv_new_note_shortcut;
                                }
                            } else {
                                i10 = R.id.tv_edit_folder;
                            }
                        } else {
                            i10 = R.id.tv_delete_folder;
                        }
                    } else {
                        i10 = R.id.tv_archive_folder;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
