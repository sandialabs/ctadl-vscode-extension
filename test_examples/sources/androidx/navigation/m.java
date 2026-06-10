package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.navigation.p;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5506a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f5507b;
    public p c;

    /* renamed from: d  reason: collision with root package name */
    public int f5508d;

    /* loaded from: classes.dex */
    public static class a extends y {
        public final C0040a c = new C0040a();

        /* renamed from: androidx.navigation.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0040a extends x<n> {
            @Override // androidx.navigation.x
            public final n a() {
                return new n("permissive");
            }

            @Override // androidx.navigation.x
            public final n b(n nVar, Bundle bundle, t tVar) {
                throw new IllegalStateException("navigate is not supported");
            }

            @Override // androidx.navigation.x
            public final boolean e() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        }

        public a() {
            a(new q(this));
        }

        @Override // androidx.navigation.y
        public final x<? extends n> c(String str) {
            try {
                return super.c(str);
            } catch (IllegalStateException unused) {
                return this.c;
            }
        }
    }

    public m(Context context) {
        this.f5506a = context;
        if (context instanceof Activity) {
            this.f5507b = new Intent(context, context.getClass());
        } else {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
            this.f5507b = launchIntentForPackage;
        }
        this.f5507b.addFlags(268468224);
    }

    public final m2.w a() {
        Intent intent = this.f5507b;
        if (intent.getIntArrayExtra("android-support-nav:controller:deepLinkIds") == null) {
            if (this.c == null) {
                throw new IllegalStateException("You must call setGraph() before constructing the deep link");
            }
            throw new IllegalStateException("You must call setDestination() before constructing the deep link");
        }
        m2.w wVar = new m2.w(this.f5506a);
        Intent intent2 = new Intent(intent);
        ComponentName component = intent2.getComponent();
        if (component == null) {
            component = intent2.resolveActivity(wVar.f15974j.getPackageManager());
        }
        if (component != null) {
            wVar.c(component);
        }
        ArrayList<Intent> arrayList = wVar.f15973i;
        arrayList.add(intent2);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10).putExtra("android-support-nav:controller:deepLinkIntent", intent);
        }
        return wVar;
    }

    public final void b() {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(this.c);
        n nVar = null;
        while (!arrayDeque.isEmpty() && nVar == null) {
            n nVar2 = (n) arrayDeque.poll();
            if (nVar2.f5511k == this.f5508d) {
                nVar = nVar2;
            } else if (nVar2 instanceof p) {
                p.a aVar = new p.a();
                while (aVar.hasNext()) {
                    arrayDeque.add((n) aVar.next());
                }
            }
        }
        if (nVar != null) {
            this.f5507b.putExtra("android-support-nav:controller:deepLinkIds", nVar.d());
            return;
        }
        StringBuilder p10 = a4.b.p("Navigation destination ", n.h(this.f5506a, this.f5508d), " cannot be found in the navigation graph ");
        p10.append(this.c);
        throw new IllegalArgumentException(p10.toString());
    }
}
