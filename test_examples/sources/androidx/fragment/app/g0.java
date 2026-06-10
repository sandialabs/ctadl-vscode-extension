package androidx.fragment.app;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5158a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5159b;
    public final Object c;

    /* renamed from: d  reason: collision with root package name */
    public Object f5160d;

    public g0() {
        this.f5158a = 0;
        this.f5159b = new ArrayList();
        this.c = new HashMap();
    }

    public final void a(Fragment fragment) {
        if (((ArrayList) this.f5159b).contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (((ArrayList) this.f5159b)) {
            ((ArrayList) this.f5159b).add(fragment);
        }
        fragment.f5045s = true;
    }

    public final void b() {
        ((HashMap) this.c).values().removeAll(Collections.singleton(null));
    }

    public final Fragment c(String str) {
        f0 f0Var = (f0) ((HashMap) this.c).get(str);
        if (f0Var != null) {
            return f0Var.c;
        }
        return null;
    }

    public final Fragment d(String str) {
        for (f0 f0Var : ((HashMap) this.c).values()) {
            if (f0Var != null) {
                Fragment fragment = f0Var.c;
                if (!str.equals(fragment.f5040m)) {
                    fragment = fragment.B.c.d(str);
                }
                if (fragment != null) {
                    return fragment;
                }
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (f0 f0Var : ((HashMap) this.c).values()) {
            if (f0Var != null) {
                arrayList.add(f0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        for (f0 f0Var : ((HashMap) this.c).values()) {
            arrayList.add(f0Var != null ? f0Var.c : null);
        }
        return arrayList;
    }

    public final f0 g(String str) {
        return (f0) ((HashMap) this.c).get(str);
    }

    public final List h() {
        ArrayList arrayList;
        if (((ArrayList) this.f5159b).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f5159b)) {
            arrayList = new ArrayList((ArrayList) this.f5159b);
        }
        return arrayList;
    }

    public final void i(f0 f0Var) {
        boolean z10;
        Fragment fragment = f0Var.c;
        String str = fragment.f5040m;
        Object obj = this.c;
        if (((HashMap) obj).get(str) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        ((HashMap) obj).put(fragment.f5040m, f0Var);
        if (z.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void j(f0 f0Var) {
        Fragment fragment = f0Var.c;
        if (fragment.I) {
            ((c0) this.f5160d).d(fragment);
        }
        if (((f0) ((HashMap) this.c).put(fragment.f5040m, null)) != null && z.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public final String toString() {
        switch (this.f5158a) {
            case 1:
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f5159b;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(uri.toString());
                }
                String str = (String) this.c;
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
                if (((String) this.f5160d) != null) {
                    sb.append(" mimetype=");
                    sb.append((String) this.f5160d);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g0(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        this.f5158a = 1;
    }

    public g0(Uri uri, String str, String str2) {
        this.f5158a = 1;
        this.f5159b = uri;
        this.c = str;
        this.f5160d = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(org.koin.core.a aVar, org.koin.core.scope.a aVar2) {
        this(aVar, aVar2, (jb.a) null);
        this.f5158a = 2;
    }

    public g0(org.koin.core.a aVar, org.koin.core.scope.a aVar2, jb.a aVar3) {
        this.f5158a = 2;
        v7.g.f(aVar, "koin");
        v7.g.f(aVar2, "scope");
        this.f5159b = aVar;
        this.c = aVar2;
        this.f5160d = aVar3;
    }
}
