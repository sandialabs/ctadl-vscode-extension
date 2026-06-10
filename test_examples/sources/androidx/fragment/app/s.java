package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.Lifecycle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import m2.b;

/* loaded from: classes.dex */
public class s extends ComponentActivity implements b.c, b.d {
    public boolean B;
    public boolean C;

    /* renamed from: z  reason: collision with root package name */
    public final u f5251z = new u(new a());
    public final androidx.lifecycle.r A = new androidx.lifecycle.r(this);
    public boolean D = true;

    /* loaded from: classes.dex */
    public class a extends w<s> implements androidx.lifecycle.n0, androidx.activity.m, androidx.activity.result.g, d0 {
        public a() {
            super(s.this);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final View C0(int i10) {
            return s.this.findViewById(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final boolean F0() {
            Window window = s.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.d0
        public final void L(Fragment fragment) {
            s.this.getClass();
        }

        @Override // androidx.fragment.app.w
        public final void L0(PrintWriter printWriter, String[] strArr) {
            s.this.dump("  ", null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.w
        public final s M0() {
            return s.this;
        }

        @Override // androidx.fragment.app.w
        public final LayoutInflater N0() {
            s sVar = s.this;
            return sVar.getLayoutInflater().cloneInContext(sVar);
        }

        @Override // androidx.fragment.app.w
        public final void O0() {
            s.this.o();
        }

        @Override // androidx.activity.result.g
        public final androidx.activity.result.f P() {
            return s.this.f419r;
        }

        @Override // androidx.lifecycle.n0
        public final androidx.lifecycle.m0 X() {
            return s.this.X();
        }

        @Override // androidx.activity.m
        public final OnBackPressedDispatcher d() {
            return s.this.f417p;
        }

        @Override // androidx.lifecycle.q
        public final androidx.lifecycle.r i0() {
            return s.this.A;
        }
    }

    public s() {
        this.f415m.f6385b.c("android:support:fragments", new q(this));
        l(new r(this));
    }

    public static boolean n(z zVar) {
        s M0;
        boolean z10;
        boolean z11;
        Lifecycle.State state = Lifecycle.State.CREATED;
        boolean z12 = false;
        for (Fragment fragment : zVar.c.h()) {
            if (fragment != null) {
                w<?> wVar = fragment.A;
                if (wVar == null) {
                    M0 = null;
                } else {
                    M0 = wVar.M0();
                }
                if (M0 != null) {
                    z12 |= n(fragment.h());
                }
                o0 o0Var = fragment.V;
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                if (o0Var != null) {
                    o0Var.b();
                    if (o0Var.f5244l.f5413d.compareTo(state2) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        fragment.V.f5244l.h(state);
                        z12 = true;
                    }
                }
                if (fragment.U.f5413d.compareTo(state2) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    fragment.U.h(state);
                    z12 = true;
                }
            }
        }
        return z12;
    }

    @Override // m2.b.d
    @Deprecated
    public final void c() {
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.B);
        printWriter.print(" mResumed=");
        printWriter.print(this.C);
        printWriter.print(" mStopped=");
        printWriter.print(this.D);
        if (getApplication() != null) {
            new u3.a(this, X()).L0(str2, printWriter);
        }
        this.f5251z.f5260a.f5265l.v(str, fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    public void o() {
        invalidateOptionsMenu();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        this.f5251z.a();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        u uVar = this.f5251z;
        uVar.a();
        super.onConfigurationChanged(configuration);
        uVar.f5260a.f5265l.i(configuration);
    }

    @Override // androidx.activity.ComponentActivity, m2.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A.f(Lifecycle.Event.ON_CREATE);
        a0 a0Var = this.f5251z.f5260a.f5265l;
        a0Var.A = false;
        a0Var.B = false;
        a0Var.H.f5130i = false;
        a0Var.t(1);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        super.onCreatePanelMenu(i10, menu);
        if (i10 != 0) {
            return true;
        }
        getMenuInflater();
        return this.f5251z.f5260a.f5265l.k() | true;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f5251z.f5260a.f5265l.f5277f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f5251z.f5260a.f5265l.l();
        this.A.f(Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        this.f5251z.f5260a.f5265l.m();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        u uVar = this.f5251z;
        if (i10 != 0) {
            if (i10 != 6) {
                return false;
            }
            return uVar.f5260a.f5265l.j();
        }
        return uVar.f5260a.f5265l.o();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        this.f5251z.f5260a.f5265l.n(z10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.f5251z.a();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        if (i10 == 0) {
            this.f5251z.f5260a.f5265l.p();
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.C = false;
        this.f5251z.f5260a.f5265l.t(5);
        this.A.f(Lifecycle.Event.ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10) {
        this.f5251z.f5260a.f5265l.r(z10);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.A.f(Lifecycle.Event.ON_RESUME);
        a0 a0Var = this.f5251z.f5260a.f5265l;
        a0Var.A = false;
        a0Var.B = false;
        a0Var.H.f5130i = false;
        a0Var.t(7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 == 0) {
            super.onPreparePanel(0, view, menu);
            return this.f5251z.f5260a.f5265l.s() | true;
        }
        super.onPreparePanel(i10, view, menu);
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f5251z.a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        u uVar = this.f5251z;
        uVar.a();
        super.onResume();
        this.C = true;
        uVar.f5260a.f5265l.y(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        u uVar = this.f5251z;
        uVar.a();
        super.onStart();
        this.D = false;
        boolean z10 = this.B;
        w<?> wVar = uVar.f5260a;
        if (!z10) {
            this.B = true;
            a0 a0Var = wVar.f5265l;
            a0Var.A = false;
            a0Var.B = false;
            a0Var.H.f5130i = false;
            a0Var.t(4);
        }
        wVar.f5265l.y(true);
        this.A.f(Lifecycle.Event.ON_START);
        a0 a0Var2 = wVar.f5265l;
        a0Var2.A = false;
        a0Var2.B = false;
        a0Var2.H.f5130i = false;
        a0Var2.t(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f5251z.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        u uVar;
        super.onStop();
        this.D = true;
        do {
            uVar = this.f5251z;
        } while (n(uVar.f5260a.f5265l));
        a0 a0Var = uVar.f5260a.f5265l;
        a0Var.B = true;
        a0Var.H.f5130i = true;
        a0Var.t(4);
        this.A.f(Lifecycle.Event.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f5251z.f5260a.f5265l.f5277f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
