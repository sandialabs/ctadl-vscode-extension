package m2;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15937a;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f15940e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f15941f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f15942g;

    /* renamed from: h  reason: collision with root package name */
    public int f15943h;

    /* renamed from: j  reason: collision with root package name */
    public p f15945j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f15946k;

    /* renamed from: l  reason: collision with root package name */
    public String f15947l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f15948m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f15949o;

    /* renamed from: p  reason: collision with root package name */
    public String f15950p;

    /* renamed from: q  reason: collision with root package name */
    public Bundle f15951q;

    /* renamed from: s  reason: collision with root package name */
    public final String f15953s;

    /* renamed from: t  reason: collision with root package name */
    public long f15954t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f15955u;

    /* renamed from: v  reason: collision with root package name */
    public final Notification f15956v;
    @Deprecated

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<String> f15957w;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<m> f15938b = new ArrayList<>();
    public final ArrayList<u> c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<m> f15939d = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public final boolean f15944i = true;

    /* renamed from: r  reason: collision with root package name */
    public int f15952r = 0;

    public o(Context context, String str) {
        Notification notification = new Notification();
        this.f15956v = notification;
        this.f15937a = context;
        this.f15953s = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f15943h = 0;
        this.f15957w = new ArrayList<>();
        this.f15955u = true;
    }

    public static CharSequence b(String str) {
        return (str != null && str.length() > 5120) ? str.subSequence(0, 5120) : str;
    }

    public final Notification a() {
        Bundle bundle;
        q qVar = new q(this);
        o oVar = qVar.f15960b;
        p pVar = oVar.f15945j;
        if (pVar != null) {
            pVar.b(qVar);
        }
        int i10 = Build.VERSION.SDK_INT;
        Notification.Builder builder = qVar.f15959a;
        if (i10 < 26 && i10 < 24) {
            builder.setExtras(qVar.c);
        }
        Notification build = builder.build();
        if (pVar != null) {
            oVar.f15945j.getClass();
        }
        if (pVar != null && (bundle = build.extras) != null) {
            pVar.a(bundle);
        }
        return build;
    }

    public final void c(int i10) {
        Notification notification = this.f15956v;
        notification.flags = i10 | notification.flags;
    }

    public final void d(n nVar) {
        if (this.f15945j != nVar) {
            this.f15945j = nVar;
            if (nVar.f15958a != this) {
                nVar.f15958a = this;
                d(nVar);
            }
        }
    }
}
