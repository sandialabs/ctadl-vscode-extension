package androidx.appcompat.view.menu;

import a3.q0;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n2.a;

/* loaded from: classes.dex */
public class f implements t2.a {

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f612y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f613a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f614b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f615d;

    /* renamed from: e  reason: collision with root package name */
    public a f616e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<h> f617f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<h> f618g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f619h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<h> f620i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<h> f621j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f622k;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f624m;
    public Drawable n;

    /* renamed from: o  reason: collision with root package name */
    public View f625o;

    /* renamed from: v  reason: collision with root package name */
    public h f632v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f634x;

    /* renamed from: l  reason: collision with root package name */
    public int f623l = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f626p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f627q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f628r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f629s = false;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList<h> f630t = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<j>> f631u = new CopyOnWriteArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public boolean f633w = false;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(f fVar, MenuItem menuItem);

        void b(f fVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(h hVar);
    }

    public f(Context context) {
        boolean z10;
        boolean z11 = false;
        this.f613a = context;
        Resources resources = context.getResources();
        this.f614b = resources;
        this.f617f = new ArrayList<>();
        this.f618g = new ArrayList<>();
        this.f619h = true;
        this.f620i = new ArrayList<>();
        this.f621j = new ArrayList<>();
        this.f622k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = q0.f209a;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = q0.b.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                z11 = true;
            }
        }
        this.f615d = z11;
    }

    public final h a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 >= 0 && i14 < 6) {
            int i15 = (f612y[i14] << 16) | (65535 & i12);
            h hVar = new h(this, i10, i11, i12, i15, charSequence, this.f623l);
            ArrayList<h> arrayList = this.f617f;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (arrayList.get(size).f640d <= i15) {
                        i13 = size + 1;
                        break;
                    }
                } else {
                    i13 = 0;
                    break;
                }
            }
            arrayList.add(i13, hVar);
            p(true);
            return hVar;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f614b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f614b.getString(i13));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        Intent intent2;
        int i15;
        PackageManager packageManager = this.f613a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i14 = queryIntentActivityOptions.size();
        } else {
            i14 = 0;
        }
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i16 = 0; i16 < i14; i16++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i16);
            int i17 = resolveInfo.specificIndex;
            if (i17 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i17];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            h a10 = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            a10.setIcon(resolveInfo.loadIcon(packageManager));
            a10.f643g = intent3;
            if (menuItemArr != null && (i15 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i15] = a10;
            }
        }
        return i14;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f614b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f614b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        h a10 = a(i10, i11, i12, charSequence);
        m mVar = new m(this.f613a, this, a10);
        a10.f650o = mVar;
        mVar.setHeaderTitle(a10.f641e);
        return mVar;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(j jVar, Context context) {
        this.f631u.add(new WeakReference<>(jVar));
        jVar.e(context, this);
        this.f622k = true;
    }

    public final void c(boolean z10) {
        if (this.f629s) {
            return;
        }
        this.f629s = true;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f631u;
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                jVar.b(this, z10);
            }
        }
        this.f629s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        h hVar = this.f632v;
        if (hVar != null) {
            d(hVar);
        }
        this.f617f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.f624m = null;
        this.f625o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(h hVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f631u;
        boolean z10 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f632v == hVar) {
            w();
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    z10 = jVar.d(hVar);
                    if (z10) {
                        break;
                    }
                }
            }
            v();
            if (z10) {
                this.f632v = null;
            }
        }
        return z10;
    }

    public boolean e(f fVar, MenuItem menuItem) {
        a aVar = this.f616e;
        return aVar != null && aVar.a(fVar, menuItem);
    }

    public boolean f(h hVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f631u;
        boolean z10 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                z10 = jVar.k(hVar);
                if (z10) {
                    break;
                }
            }
        }
        v();
        if (z10) {
            this.f632v = hVar;
        }
        return z10;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f617f.get(i11);
            if (hVar.f638a == i10) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (findItem = hVar.f650o.findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final h g(int i10, KeyEvent keyEvent) {
        char c;
        ArrayList<h> arrayList = this.f630t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n = n();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = arrayList.get(i11);
            if (n) {
                c = hVar.f646j;
            } else {
                c = hVar.f644h;
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (n && c == '\b' && i10 == 67))) {
                return hVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return this.f617f.get(i10);
    }

    public final void h(ArrayList arrayList, int i10, KeyEvent keyEvent) {
        char c;
        int i11;
        boolean z10;
        boolean n = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i10 != 67) {
            return;
        }
        ArrayList<h> arrayList2 = this.f617f;
        int size = arrayList2.size();
        for (int i12 = 0; i12 < size; i12++) {
            h hVar = arrayList2.get(i12);
            if (hVar.hasSubMenu()) {
                hVar.f650o.h(arrayList, i10, keyEvent);
            }
            if (n) {
                c = hVar.f646j;
            } else {
                c = hVar.f644h;
            }
            if (n) {
                i11 = hVar.f647k;
            } else {
                i11 = hVar.f645i;
            }
            if ((modifiers & 69647) == (i11 & 69647)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && c != 0) {
                char[] cArr = keyData.meta;
                if (c != cArr[0] && c != cArr[2]) {
                    if (n && c == '\b') {
                        if (i10 != 67) {
                        }
                    }
                }
                if (hVar.isEnabled()) {
                    arrayList.add(hVar);
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f634x) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f617f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        boolean z10;
        ArrayList<h> l2 = l();
        if (!this.f622k) {
            return;
        }
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f631u;
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                z11 |= jVar.i();
            }
        }
        ArrayList<h> arrayList = this.f620i;
        ArrayList<h> arrayList2 = this.f621j;
        arrayList.clear();
        arrayList2.clear();
        if (z11) {
            int size = l2.size();
            for (int i10 = 0; i10 < size; i10++) {
                h hVar = l2.get(i10);
                if ((hVar.f659x & 32) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(hVar);
                } else {
                    arrayList2.add(hVar);
                }
            }
        } else {
            arrayList2.addAll(l());
        }
        this.f622k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public f k() {
        return this;
    }

    public final ArrayList<h> l() {
        boolean z10 = this.f619h;
        ArrayList<h> arrayList = this.f618g;
        if (z10) {
            arrayList.clear();
            ArrayList<h> arrayList2 = this.f617f;
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                h hVar = arrayList2.get(i10);
                if (hVar.isVisible()) {
                    arrayList.add(hVar);
                }
            }
            this.f619h = false;
            this.f622k = true;
            return arrayList;
        }
        return arrayList;
    }

    public boolean m() {
        return this.f633w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.f615d;
    }

    public final void p(boolean z10) {
        if (!this.f626p) {
            if (z10) {
                this.f619h = true;
                this.f622k = true;
            }
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f631u;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference<j> next = it.next();
                    j jVar = next.get();
                    if (jVar == null) {
                        copyOnWriteArrayList.remove(next);
                    } else {
                        jVar.f();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f627q = true;
        if (z10) {
            this.f628r = true;
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        boolean z10;
        h g10 = g(i10, keyEvent);
        if (g10 != null) {
            z10 = q(g10, null, i11);
        } else {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            c(true);
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bf, code lost:
        if (r1 == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, j jVar, int i10) {
        boolean z10;
        a3.b bVar;
        boolean z11;
        h hVar = (h) menuItem;
        boolean z12 = false;
        if (hVar != null && hVar.isEnabled()) {
            MenuItem.OnMenuItemClickListener onMenuItemClickListener = hVar.f651p;
            if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(hVar)) {
                f fVar = hVar.n;
                if (!fVar.e(fVar, hVar)) {
                    Intent intent = hVar.f643g;
                    if (intent != null) {
                        try {
                            fVar.f613a.startActivity(intent);
                        } catch (ActivityNotFoundException e10) {
                            Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                        }
                    }
                    a3.b bVar2 = hVar.A;
                    if (bVar2 == null || !bVar2.e()) {
                        z10 = false;
                        bVar = hVar.A;
                        if (bVar == null && bVar.a()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!hVar.e()) {
                            z10 |= hVar.expandActionView();
                            if (z10) {
                                c(true);
                            }
                            return z10;
                        }
                        if (!hVar.hasSubMenu() && !z11) {
                            if ((i10 & 1) == 0) {
                                c(true);
                            }
                            return z10;
                        }
                        if ((i10 & 4) == 0) {
                            c(false);
                        }
                        if (!hVar.hasSubMenu()) {
                            m mVar = new m(this.f613a, this, hVar);
                            hVar.f650o = mVar;
                            mVar.setHeaderTitle(hVar.f641e);
                        }
                        m mVar2 = hVar.f650o;
                        if (z11) {
                            bVar.f(mVar2);
                        }
                        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f631u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (jVar != null) {
                                z12 = jVar.h(mVar2);
                            }
                            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                WeakReference<j> next = it.next();
                                j jVar2 = next.get();
                                if (jVar2 == null) {
                                    copyOnWriteArrayList.remove(next);
                                } else if (!z12) {
                                    z12 = jVar2.h(mVar2);
                                }
                            }
                        }
                        z10 |= z12;
                    }
                }
            }
            z10 = true;
            bVar = hVar.A;
            if (bVar == null) {
            }
            z11 = false;
            if (!hVar.e()) {
            }
        }
        return false;
    }

    public final void r(j jVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f631u;
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList<h> arrayList;
        int size = size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            arrayList = this.f617f;
            if (i12 < size) {
                if (arrayList.get(i12).f639b == i10) {
                    break;
                }
                i12++;
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || arrayList.get(i12).f639b != i10) {
                    break;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    arrayList.remove(i12);
                }
                i11 = i13;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList<h> arrayList;
        int size = size();
        int i11 = 0;
        while (true) {
            arrayList = this.f617f;
            if (i11 < size) {
                if (arrayList.get(i11).f638a == i10) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0 && i11 < arrayList.size()) {
            arrayList.remove(i11);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).s(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (findItem = findItem(i11)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int i11;
        ArrayList<h> arrayList = this.f617f;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            h hVar = arrayList.get(i12);
            if (hVar.f639b == i10) {
                int i13 = hVar.f659x & (-5);
                if (z11) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                hVar.f659x = i13 | i11;
                hVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f633w = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        ArrayList<h> arrayList = this.f617f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = arrayList.get(i11);
            if (hVar.f639b == i10) {
                hVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        int i11;
        boolean z11;
        ArrayList<h> arrayList = this.f617f;
        int size = arrayList.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            h hVar = arrayList.get(i12);
            if (hVar.f639b == i10) {
                int i13 = hVar.f659x;
                int i14 = i13 & (-9);
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                int i15 = i14 | i11;
                hVar.f659x = i15;
                if (i13 != i15) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    z12 = true;
                }
            }
        }
        if (z12) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.c = z10;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f617f.size();
    }

    public final void t(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.f625o = view;
            this.f624m = null;
            this.n = null;
        } else {
            if (i10 > 0) {
                this.f624m = this.f614b.getText(i10);
            } else if (charSequence != null) {
                this.f624m = charSequence;
            }
            if (i11 > 0) {
                Object obj = n2.a.f16069a;
                this.n = a.b.b(this.f613a, i11);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.f625o = null;
        }
        p(false);
    }

    public final void v() {
        this.f626p = false;
        if (this.f627q) {
            this.f627q = false;
            p(this.f628r);
        }
    }

    public final void w() {
        if (this.f626p) {
            return;
        }
        this.f626p = true;
        this.f627q = false;
        this.f628r = false;
    }
}
