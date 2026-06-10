package y3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.room.RoomDatabase;
import c4.c;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f18810a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18811b;
    public final c.InterfaceC0055c c;

    /* renamed from: d  reason: collision with root package name */
    public final RoomDatabase.c f18812d;

    /* renamed from: e  reason: collision with root package name */
    public final List<RoomDatabase.b> f18813e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f18814f;

    /* renamed from: g  reason: collision with root package name */
    public final RoomDatabase.JournalMode f18815g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f18816h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f18817i;

    /* renamed from: j  reason: collision with root package name */
    public final Intent f18818j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f18819k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f18820l;

    /* renamed from: m  reason: collision with root package name */
    public final Set<Integer> f18821m;
    public final Callable<InputStream> n;

    /* renamed from: o  reason: collision with root package name */
    public final List<Object> f18822o;

    /* renamed from: p  reason: collision with root package name */
    public final List<z3.a> f18823p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f18824q;

    @SuppressLint({"LambdaLast"})
    public a(Context context, String str, c.InterfaceC0055c interfaceC0055c, RoomDatabase.c cVar, ArrayList arrayList, boolean z10, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z11, boolean z12, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        v7.g.f(context, "context");
        v7.g.f(cVar, "migrationContainer");
        v7.g.f(arrayList2, "typeConverters");
        v7.g.f(arrayList3, "autoMigrationSpecs");
        this.f18810a = context;
        this.f18811b = str;
        this.c = interfaceC0055c;
        this.f18812d = cVar;
        this.f18813e = arrayList;
        this.f18814f = z10;
        this.f18815g = journalMode;
        this.f18816h = executor;
        this.f18817i = executor2;
        this.f18818j = null;
        this.f18819k = z11;
        this.f18820l = z12;
        this.f18821m = linkedHashSet;
        this.n = null;
        this.f18822o = arrayList2;
        this.f18823p = arrayList3;
        this.f18824q = false;
    }

    public final boolean a(int i10, int i11) {
        Set<Integer> set;
        return !((i10 > i11) && this.f18820l) && this.f18819k && ((set = this.f18821m) == null || !set.contains(Integer.valueOf(i10)));
    }
}
