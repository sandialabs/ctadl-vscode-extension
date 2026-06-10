package androidx.fragment.app;

import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: b  reason: collision with root package name */
    public int f5165b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f5166d;

    /* renamed from: e  reason: collision with root package name */
    public int f5167e;

    /* renamed from: f  reason: collision with root package name */
    public int f5168f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5169g;

    /* renamed from: i  reason: collision with root package name */
    public String f5171i;

    /* renamed from: j  reason: collision with root package name */
    public int f5172j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f5173k;

    /* renamed from: l  reason: collision with root package name */
    public int f5174l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f5175m;
    public ArrayList<String> n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<String> f5176o;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<a> f5164a = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public boolean f5170h = true;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5177p = false;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f5178a;

        /* renamed from: b  reason: collision with root package name */
        public Fragment f5179b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f5180d;

        /* renamed from: e  reason: collision with root package name */
        public int f5181e;

        /* renamed from: f  reason: collision with root package name */
        public int f5182f;

        /* renamed from: g  reason: collision with root package name */
        public Lifecycle.State f5183g;

        /* renamed from: h  reason: collision with root package name */
        public Lifecycle.State f5184h;

        public a() {
        }

        public a(int i10, Fragment fragment) {
            this.f5178a = i10;
            this.f5179b = fragment;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f5183g = state;
            this.f5184h = state;
        }

        public a(Fragment fragment, Lifecycle.State state) {
            this.f5178a = 10;
            this.f5179b = fragment;
            this.f5183g = fragment.T;
            this.f5184h = state;
        }
    }

    public final void b(a aVar) {
        this.f5164a.add(aVar);
        aVar.c = this.f5165b;
        aVar.f5180d = this.c;
        aVar.f5181e = this.f5166d;
        aVar.f5182f = this.f5167e;
    }
}
