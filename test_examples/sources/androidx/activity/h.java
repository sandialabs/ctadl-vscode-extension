package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import androidx.lifecycle.r;

/* loaded from: classes.dex */
public class h extends Dialog implements q, m {

    /* renamed from: i  reason: collision with root package name */
    public r f460i;

    /* renamed from: j  reason: collision with root package name */
    public final OnBackPressedDispatcher f461j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, int i10) {
        super(context, i10);
        v7.g.f(context, "context");
        this.f461j = new OnBackPressedDispatcher(new b(1, this));
    }

    public static void a(h hVar) {
        v7.g.f(hVar, "this$0");
        super.onBackPressed();
    }

    @Override // androidx.activity.m
    public final OnBackPressedDispatcher d() {
        return this.f461j;
    }

    @Override // androidx.lifecycle.q
    public final r i0() {
        r rVar = this.f460i;
        if (rVar == null) {
            r rVar2 = new r(this);
            this.f460i = rVar2;
            return rVar2;
        }
        return rVar;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f461j.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackPressedDispatcher onBackPressedDispatcher = this.f461j;
            onBackPressedDispatcher.f441e = onBackInvokedDispatcher;
            onBackPressedDispatcher.c();
        }
        r rVar = this.f460i;
        if (rVar == null) {
            rVar = new r(this);
            this.f460i = rVar;
        }
        rVar.f(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        r rVar = this.f460i;
        if (rVar == null) {
            rVar = new r(this);
            this.f460i = rVar;
        }
        rVar.f(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        r rVar = this.f460i;
        if (rVar == null) {
            rVar = new r(this);
            this.f460i = rVar;
        }
        rVar.f(Lifecycle.Event.ON_DESTROY);
        this.f460i = null;
        super.onStop();
    }
}
