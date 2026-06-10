package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import ma.i;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f4476d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    public static final SparseIntArray f4477e;

    /* renamed from: f  reason: collision with root package name */
    public static final SparseIntArray f4478f;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, ConstraintAttribute> f4479a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4480b = true;
    public final HashMap<Integer, a> c = new HashMap<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f4481a;

        /* renamed from: b  reason: collision with root package name */
        public final d f4482b = new d();
        public final c c = new c();

        /* renamed from: d  reason: collision with root package name */
        public final C0032b f4483d = new C0032b();

        /* renamed from: e  reason: collision with root package name */
        public final e f4484e = new e();

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, ConstraintAttribute> f4485f = new HashMap<>();

        /* renamed from: androidx.constraintlayout.widget.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0031a {

            /* renamed from: a  reason: collision with root package name */
            public int[] f4486a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            public int[] f4487b = new int[10];
            public int c = 0;

            /* renamed from: d  reason: collision with root package name */
            public int[] f4488d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            public float[] f4489e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            public int f4490f = 0;

            /* renamed from: g  reason: collision with root package name */
            public int[] f4491g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            public String[] f4492h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            public int f4493i = 0;

            /* renamed from: j  reason: collision with root package name */
            public int[] f4494j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            public boolean[] f4495k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            public int f4496l = 0;

            public final void a(int i10, float f10) {
                int i11 = this.f4490f;
                int[] iArr = this.f4488d;
                if (i11 >= iArr.length) {
                    this.f4488d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f4489e;
                    this.f4489e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f4488d;
                int i12 = this.f4490f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f4489e;
                this.f4490f = i12 + 1;
                fArr2[i12] = f10;
            }

            public final void b(int i10, int i11) {
                int i12 = this.c;
                int[] iArr = this.f4486a;
                if (i12 >= iArr.length) {
                    this.f4486a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f4487b;
                    this.f4487b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f4486a;
                int i13 = this.c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f4487b;
                this.c = i13 + 1;
                iArr4[i13] = i11;
            }

            public final void c(int i10, boolean z10) {
                int i11 = this.f4496l;
                int[] iArr = this.f4494j;
                if (i11 >= iArr.length) {
                    this.f4494j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f4495k;
                    this.f4495k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f4494j;
                int i12 = this.f4496l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f4495k;
                this.f4496l = i12 + 1;
                zArr2[i12] = z10;
            }

            public final void d(String str, int i10) {
                int i11 = this.f4493i;
                int[] iArr = this.f4491g;
                if (i11 >= iArr.length) {
                    this.f4491g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f4492h;
                    this.f4492h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f4491g;
                int i12 = this.f4493i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f4492h;
                this.f4493i = i12 + 1;
                strArr2[i12] = str;
            }
        }

        public final void a(ConstraintLayout.a aVar) {
            C0032b c0032b = this.f4483d;
            aVar.f4427e = c0032b.f4510h;
            aVar.f4429f = c0032b.f4512i;
            aVar.f4431g = c0032b.f4514j;
            aVar.f4433h = c0032b.f4516k;
            aVar.f4435i = c0032b.f4518l;
            aVar.f4437j = c0032b.f4520m;
            aVar.f4439k = c0032b.n;
            aVar.f4441l = c0032b.f4523o;
            aVar.f4443m = c0032b.f4525p;
            aVar.n = c0032b.f4526q;
            aVar.f4446o = c0032b.f4527r;
            aVar.f4453s = c0032b.f4528s;
            aVar.f4454t = c0032b.f4529t;
            aVar.f4455u = c0032b.f4530u;
            aVar.f4456v = c0032b.f4531v;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = c0032b.F;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = c0032b.G;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = c0032b.H;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = c0032b.I;
            aVar.A = c0032b.R;
            aVar.B = c0032b.Q;
            aVar.f4458x = c0032b.N;
            aVar.f4460z = c0032b.P;
            aVar.E = c0032b.f4532w;
            aVar.F = c0032b.f4533x;
            aVar.f4448p = c0032b.f4535z;
            aVar.f4450q = c0032b.A;
            aVar.f4452r = c0032b.B;
            aVar.G = c0032b.f4534y;
            aVar.T = c0032b.C;
            aVar.U = c0032b.D;
            aVar.I = c0032b.T;
            aVar.H = c0032b.U;
            aVar.K = c0032b.W;
            aVar.J = c0032b.V;
            aVar.W = c0032b.f4519l0;
            aVar.X = c0032b.f4521m0;
            aVar.L = c0032b.X;
            aVar.M = c0032b.Y;
            aVar.P = c0032b.Z;
            aVar.Q = c0032b.f4499a0;
            aVar.N = c0032b.f4501b0;
            aVar.O = c0032b.c0;
            aVar.R = c0032b.f4503d0;
            aVar.S = c0032b.f4505e0;
            aVar.V = c0032b.E;
            aVar.c = c0032b.f4506f;
            aVar.f4421a = c0032b.f4502d;
            aVar.f4423b = c0032b.f4504e;
            ((ViewGroup.MarginLayoutParams) aVar).width = c0032b.f4500b;
            ((ViewGroup.MarginLayoutParams) aVar).height = c0032b.c;
            String str = c0032b.f4517k0;
            if (str != null) {
                aVar.Y = str;
            }
            aVar.Z = c0032b.f4524o0;
            aVar.setMarginStart(c0032b.K);
            aVar.setMarginEnd(c0032b.J);
            aVar.a();
        }

        public final void b(int i10, ConstraintLayout.a aVar) {
            this.f4481a = i10;
            int i11 = aVar.f4427e;
            C0032b c0032b = this.f4483d;
            c0032b.f4510h = i11;
            c0032b.f4512i = aVar.f4429f;
            c0032b.f4514j = aVar.f4431g;
            c0032b.f4516k = aVar.f4433h;
            c0032b.f4518l = aVar.f4435i;
            c0032b.f4520m = aVar.f4437j;
            c0032b.n = aVar.f4439k;
            c0032b.f4523o = aVar.f4441l;
            c0032b.f4525p = aVar.f4443m;
            c0032b.f4526q = aVar.n;
            c0032b.f4527r = aVar.f4446o;
            c0032b.f4528s = aVar.f4453s;
            c0032b.f4529t = aVar.f4454t;
            c0032b.f4530u = aVar.f4455u;
            c0032b.f4531v = aVar.f4456v;
            c0032b.f4532w = aVar.E;
            c0032b.f4533x = aVar.F;
            c0032b.f4534y = aVar.G;
            c0032b.f4535z = aVar.f4448p;
            c0032b.A = aVar.f4450q;
            c0032b.B = aVar.f4452r;
            c0032b.C = aVar.T;
            c0032b.D = aVar.U;
            c0032b.E = aVar.V;
            c0032b.f4506f = aVar.c;
            c0032b.f4502d = aVar.f4421a;
            c0032b.f4504e = aVar.f4423b;
            c0032b.f4500b = ((ViewGroup.MarginLayoutParams) aVar).width;
            c0032b.c = ((ViewGroup.MarginLayoutParams) aVar).height;
            c0032b.F = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            c0032b.G = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            c0032b.H = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            c0032b.I = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            c0032b.L = aVar.D;
            c0032b.T = aVar.I;
            c0032b.U = aVar.H;
            c0032b.W = aVar.K;
            c0032b.V = aVar.J;
            c0032b.f4519l0 = aVar.W;
            c0032b.f4521m0 = aVar.X;
            c0032b.X = aVar.L;
            c0032b.Y = aVar.M;
            c0032b.Z = aVar.P;
            c0032b.f4499a0 = aVar.Q;
            c0032b.f4501b0 = aVar.N;
            c0032b.c0 = aVar.O;
            c0032b.f4503d0 = aVar.R;
            c0032b.f4505e0 = aVar.S;
            c0032b.f4517k0 = aVar.Y;
            c0032b.N = aVar.f4458x;
            c0032b.P = aVar.f4460z;
            c0032b.M = aVar.f4457w;
            c0032b.O = aVar.f4459y;
            c0032b.R = aVar.A;
            c0032b.Q = aVar.B;
            c0032b.S = aVar.C;
            c0032b.f4524o0 = aVar.Z;
            c0032b.J = aVar.getMarginEnd();
            c0032b.K = aVar.getMarginStart();
        }

        public final void c(int i10, c.a aVar) {
            b(i10, aVar);
            this.f4482b.c = aVar.f4561r0;
            float f10 = aVar.f4564u0;
            e eVar = this.f4484e;
            eVar.f4548a = f10;
            eVar.f4549b = aVar.f4565v0;
            eVar.c = aVar.f4566w0;
            eVar.f4550d = aVar.f4567x0;
            eVar.f4551e = aVar.f4568y0;
            eVar.f4552f = aVar.f4569z0;
            eVar.f4553g = aVar.A0;
            eVar.f4555i = aVar.B0;
            eVar.f4556j = aVar.C0;
            eVar.f4557k = aVar.D0;
            eVar.f4559m = aVar.f4563t0;
            eVar.f4558l = aVar.f4562s0;
        }

        public final Object clone() {
            a aVar = new a();
            C0032b c0032b = aVar.f4483d;
            c0032b.getClass();
            C0032b c0032b2 = this.f4483d;
            c0032b.f4498a = c0032b2.f4498a;
            c0032b.f4500b = c0032b2.f4500b;
            c0032b.c = c0032b2.c;
            c0032b.f4502d = c0032b2.f4502d;
            c0032b.f4504e = c0032b2.f4504e;
            c0032b.f4506f = c0032b2.f4506f;
            c0032b.f4508g = c0032b2.f4508g;
            c0032b.f4510h = c0032b2.f4510h;
            c0032b.f4512i = c0032b2.f4512i;
            c0032b.f4514j = c0032b2.f4514j;
            c0032b.f4516k = c0032b2.f4516k;
            c0032b.f4518l = c0032b2.f4518l;
            c0032b.f4520m = c0032b2.f4520m;
            c0032b.n = c0032b2.n;
            c0032b.f4523o = c0032b2.f4523o;
            c0032b.f4525p = c0032b2.f4525p;
            c0032b.f4526q = c0032b2.f4526q;
            c0032b.f4527r = c0032b2.f4527r;
            c0032b.f4528s = c0032b2.f4528s;
            c0032b.f4529t = c0032b2.f4529t;
            c0032b.f4530u = c0032b2.f4530u;
            c0032b.f4531v = c0032b2.f4531v;
            c0032b.f4532w = c0032b2.f4532w;
            c0032b.f4533x = c0032b2.f4533x;
            c0032b.f4534y = c0032b2.f4534y;
            c0032b.f4535z = c0032b2.f4535z;
            c0032b.A = c0032b2.A;
            c0032b.B = c0032b2.B;
            c0032b.C = c0032b2.C;
            c0032b.D = c0032b2.D;
            c0032b.E = c0032b2.E;
            c0032b.F = c0032b2.F;
            c0032b.G = c0032b2.G;
            c0032b.H = c0032b2.H;
            c0032b.I = c0032b2.I;
            c0032b.J = c0032b2.J;
            c0032b.K = c0032b2.K;
            c0032b.L = c0032b2.L;
            c0032b.M = c0032b2.M;
            c0032b.N = c0032b2.N;
            c0032b.O = c0032b2.O;
            c0032b.P = c0032b2.P;
            c0032b.Q = c0032b2.Q;
            c0032b.R = c0032b2.R;
            c0032b.S = c0032b2.S;
            c0032b.T = c0032b2.T;
            c0032b.U = c0032b2.U;
            c0032b.V = c0032b2.V;
            c0032b.W = c0032b2.W;
            c0032b.X = c0032b2.X;
            c0032b.Y = c0032b2.Y;
            c0032b.Z = c0032b2.Z;
            c0032b.f4499a0 = c0032b2.f4499a0;
            c0032b.f4501b0 = c0032b2.f4501b0;
            c0032b.c0 = c0032b2.c0;
            c0032b.f4503d0 = c0032b2.f4503d0;
            c0032b.f4505e0 = c0032b2.f4505e0;
            c0032b.f4507f0 = c0032b2.f4507f0;
            c0032b.f4509g0 = c0032b2.f4509g0;
            c0032b.f4511h0 = c0032b2.f4511h0;
            c0032b.f4517k0 = c0032b2.f4517k0;
            int[] iArr = c0032b2.f4513i0;
            if (iArr != null && c0032b2.f4515j0 == null) {
                c0032b.f4513i0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                c0032b.f4513i0 = null;
            }
            c0032b.f4515j0 = c0032b2.f4515j0;
            c0032b.f4519l0 = c0032b2.f4519l0;
            c0032b.f4521m0 = c0032b2.f4521m0;
            c0032b.f4522n0 = c0032b2.f4522n0;
            c0032b.f4524o0 = c0032b2.f4524o0;
            c cVar = aVar.c;
            cVar.getClass();
            c cVar2 = this.c;
            cVar2.getClass();
            cVar.f4537a = cVar2.f4537a;
            cVar.c = cVar2.c;
            cVar.f4540e = cVar2.f4540e;
            cVar.f4539d = cVar2.f4539d;
            d dVar = aVar.f4482b;
            dVar.getClass();
            d dVar2 = this.f4482b;
            dVar2.getClass();
            dVar.f4545a = dVar2.f4545a;
            dVar.c = dVar2.c;
            dVar.f4547d = dVar2.f4547d;
            dVar.f4546b = dVar2.f4546b;
            e eVar = aVar.f4484e;
            eVar.getClass();
            e eVar2 = this.f4484e;
            eVar2.getClass();
            eVar.f4548a = eVar2.f4548a;
            eVar.f4549b = eVar2.f4549b;
            eVar.c = eVar2.c;
            eVar.f4550d = eVar2.f4550d;
            eVar.f4551e = eVar2.f4551e;
            eVar.f4552f = eVar2.f4552f;
            eVar.f4553g = eVar2.f4553g;
            eVar.f4554h = eVar2.f4554h;
            eVar.f4555i = eVar2.f4555i;
            eVar.f4556j = eVar2.f4556j;
            eVar.f4557k = eVar2.f4557k;
            eVar.f4558l = eVar2.f4558l;
            eVar.f4559m = eVar2.f4559m;
            aVar.f4481a = this.f4481a;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0032b {

        /* renamed from: p0  reason: collision with root package name */
        public static final SparseIntArray f4497p0;

        /* renamed from: b  reason: collision with root package name */
        public int f4500b;
        public int c;

        /* renamed from: i0  reason: collision with root package name */
        public int[] f4513i0;

        /* renamed from: j0  reason: collision with root package name */
        public String f4515j0;

        /* renamed from: k0  reason: collision with root package name */
        public String f4517k0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f4498a = false;

        /* renamed from: d  reason: collision with root package name */
        public int f4502d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f4504e = -1;

        /* renamed from: f  reason: collision with root package name */
        public float f4506f = -1.0f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f4508g = true;

        /* renamed from: h  reason: collision with root package name */
        public int f4510h = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f4512i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f4514j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f4516k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f4518l = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f4520m = -1;
        public int n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f4523o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f4525p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f4526q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f4527r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f4528s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f4529t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f4530u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f4531v = -1;

        /* renamed from: w  reason: collision with root package name */
        public float f4532w = 0.5f;

        /* renamed from: x  reason: collision with root package name */
        public float f4533x = 0.5f;

        /* renamed from: y  reason: collision with root package name */
        public String f4534y = null;

        /* renamed from: z  reason: collision with root package name */
        public int f4535z = -1;
        public int A = 0;
        public float B = 0.0f;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = 0;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = Integer.MIN_VALUE;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public float T = -1.0f;
        public float U = -1.0f;
        public int V = 0;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a0  reason: collision with root package name */
        public int f4499a0 = 0;

        /* renamed from: b0  reason: collision with root package name */
        public int f4501b0 = 0;
        public int c0 = 0;

        /* renamed from: d0  reason: collision with root package name */
        public float f4503d0 = 1.0f;

        /* renamed from: e0  reason: collision with root package name */
        public float f4505e0 = 1.0f;

        /* renamed from: f0  reason: collision with root package name */
        public int f4507f0 = -1;

        /* renamed from: g0  reason: collision with root package name */
        public int f4509g0 = 0;

        /* renamed from: h0  reason: collision with root package name */
        public int f4511h0 = -1;

        /* renamed from: l0  reason: collision with root package name */
        public boolean f4519l0 = false;

        /* renamed from: m0  reason: collision with root package name */
        public boolean f4521m0 = false;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f4522n0 = true;

        /* renamed from: o0  reason: collision with root package name */
        public int f4524o0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4497p0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 41);
            sparseIntArray.append(16, 42);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.c.f81s);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                SparseIntArray sparseIntArray = f4497p0;
                int i11 = sparseIntArray.get(index);
                switch (i11) {
                    case 1:
                        this.f4525p = b.g(obtainStyledAttributes, index, this.f4525p);
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        this.f4523o = b.g(obtainStyledAttributes, index, this.f4523o);
                        break;
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        this.n = b.g(obtainStyledAttributes, index, this.n);
                        break;
                    case 5:
                        this.f4534y = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 8:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case i.f16046m /* 9 */:
                        this.f4531v = b.g(obtainStyledAttributes, index, this.f4531v);
                        break;
                    case i.f16047o /* 10 */:
                        this.f4530u = b.g(obtainStyledAttributes, index, this.f4530u);
                        break;
                    case 11:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 12:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 13:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 14:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case i.f16049q /* 15 */:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 16:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 17:
                        this.f4502d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4502d);
                        break;
                    case 18:
                        this.f4504e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4504e);
                        break;
                    case 19:
                        this.f4506f = obtainStyledAttributes.getFloat(index, this.f4506f);
                        break;
                    case 20:
                        this.f4532w = obtainStyledAttributes.getFloat(index, this.f4532w);
                        break;
                    case 21:
                        this.c = obtainStyledAttributes.getLayoutDimension(index, this.c);
                        break;
                    case 22:
                        this.f4500b = obtainStyledAttributes.getLayoutDimension(index, this.f4500b);
                        break;
                    case 23:
                        this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                        break;
                    case 24:
                        this.f4510h = b.g(obtainStyledAttributes, index, this.f4510h);
                        break;
                    case 25:
                        this.f4512i = b.g(obtainStyledAttributes, index, this.f4512i);
                        break;
                    case 26:
                        this.E = obtainStyledAttributes.getInt(index, this.E);
                        break;
                    case 27:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 28:
                        this.f4514j = b.g(obtainStyledAttributes, index, this.f4514j);
                        break;
                    case 29:
                        this.f4516k = b.g(obtainStyledAttributes, index, this.f4516k);
                        break;
                    case 30:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 31:
                        this.f4528s = b.g(obtainStyledAttributes, index, this.f4528s);
                        break;
                    case 32:
                        this.f4529t = b.g(obtainStyledAttributes, index, this.f4529t);
                        break;
                    case 33:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 34:
                        this.f4520m = b.g(obtainStyledAttributes, index, this.f4520m);
                        break;
                    case 35:
                        this.f4518l = b.g(obtainStyledAttributes, index, this.f4518l);
                        break;
                    case 36:
                        this.f4533x = obtainStyledAttributes.getFloat(index, this.f4533x);
                        break;
                    case 37:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 38:
                        this.T = obtainStyledAttributes.getFloat(index, this.T);
                        break;
                    case 39:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 40:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 41:
                        b.h(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        b.h(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.f4535z = b.g(obtainStyledAttributes, index, this.f4535z);
                                continue;
                            case 62:
                                this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                                continue;
                            case 63:
                                this.B = obtainStyledAttributes.getFloat(index, this.B);
                                continue;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f4503d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f4505e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f4507f0 = obtainStyledAttributes.getInt(index, this.f4507f0);
                                        break;
                                    case 73:
                                        this.f4509g0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f4509g0);
                                        break;
                                    case 74:
                                        this.f4515j0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f4522n0 = obtainStyledAttributes.getBoolean(index, this.f4522n0);
                                        break;
                                    case 76:
                                        this.f4524o0 = obtainStyledAttributes.getInt(index, this.f4524o0);
                                        break;
                                    case 77:
                                        this.f4526q = b.g(obtainStyledAttributes, index, this.f4526q);
                                        break;
                                    case 78:
                                        this.f4527r = b.g(obtainStyledAttributes, index, this.f4527r);
                                        break;
                                    case 79:
                                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                        break;
                                    case 80:
                                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                        break;
                                    case 81:
                                        this.X = obtainStyledAttributes.getInt(index, this.X);
                                        break;
                                    case 82:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 83:
                                        this.f4499a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f4499a0);
                                        break;
                                    case 84:
                                        this.Z = obtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                        break;
                                    case 85:
                                        this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        break;
                                    case 86:
                                        this.f4501b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f4501b0);
                                        break;
                                    case 87:
                                        this.f4519l0 = obtainStyledAttributes.getBoolean(index, this.f4519l0);
                                        break;
                                    case 88:
                                        this.f4521m0 = obtainStyledAttributes.getBoolean(index, this.f4521m0);
                                        break;
                                    case 89:
                                        this.f4517k0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f4508g = obtainStyledAttributes.getBoolean(index, this.f4508g);
                                        break;
                                    case 91:
                                        sb = new StringBuilder("unused attribute 0x");
                                        sb.append(Integer.toHexString(index));
                                        sb.append("   ");
                                        sb.append(sparseIntArray.get(index));
                                        Log.w("ConstraintSet", sb.toString());
                                        continue;
                                    default:
                                        sb = new StringBuilder("Unknown attribute 0x");
                                        sb.append(Integer.toHexString(index));
                                        sb.append("   ");
                                        sb.append(sparseIntArray.get(index));
                                        Log.w("ConstraintSet", sb.toString());
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: j  reason: collision with root package name */
        public static final SparseIntArray f4536j;

        /* renamed from: a  reason: collision with root package name */
        public int f4537a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f4538b = 0;
        public int c = -1;

        /* renamed from: d  reason: collision with root package name */
        public float f4539d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        public float f4540e = Float.NaN;

        /* renamed from: f  reason: collision with root package name */
        public float f4541f = Float.NaN;

        /* renamed from: g  reason: collision with root package name */
        public int f4542g = -1;

        /* renamed from: h  reason: collision with root package name */
        public String f4543h = null;

        /* renamed from: i  reason: collision with root package name */
        public int f4544i = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4536j = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.c.f82t);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f4536j.get(index)) {
                    case 1:
                        this.f4540e = obtainStyledAttributes.getFloat(index, this.f4540e);
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        this.c = obtainStyledAttributes.getInt(index, this.c);
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            String str = e2.a.f10605b[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f4537a = b.g(obtainStyledAttributes, index, this.f4537a);
                        break;
                    case 6:
                        this.f4538b = obtainStyledAttributes.getInteger(index, this.f4538b);
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        this.f4539d = obtainStyledAttributes.getFloat(index, this.f4539d);
                        break;
                    case 8:
                        this.f4542g = obtainStyledAttributes.getInteger(index, this.f4542g);
                        break;
                    case i.f16046m /* 9 */:
                        this.f4541f = obtainStyledAttributes.getFloat(index, this.f4541f);
                        break;
                    case i.f16047o /* 10 */:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 != 1) {
                            if (i11 == 3) {
                                String string = obtainStyledAttributes.getString(index);
                                this.f4543h = string;
                                if (string.indexOf("/") <= 0) {
                                    break;
                                }
                            } else {
                                obtainStyledAttributes.getInteger(index, this.f4544i);
                                break;
                            }
                        }
                        this.f4544i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f4545a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f4546b = 0;
        public float c = 1.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f4547d = Float.NaN;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.c.f84v);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.c = obtainStyledAttributes.getFloat(index, this.c);
                } else if (index == 0) {
                    int i11 = obtainStyledAttributes.getInt(index, this.f4545a);
                    this.f4545a = i11;
                    this.f4545a = b.f4476d[i11];
                } else if (index == 4) {
                    this.f4546b = obtainStyledAttributes.getInt(index, this.f4546b);
                } else if (index == 3) {
                    this.f4547d = obtainStyledAttributes.getFloat(index, this.f4547d);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static final SparseIntArray n;

        /* renamed from: a  reason: collision with root package name */
        public float f4548a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        public float f4549b = 0.0f;
        public float c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f4550d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f4551e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f4552f = Float.NaN;

        /* renamed from: g  reason: collision with root package name */
        public float f4553g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f4554h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f4555i = 0.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f4556j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f4557k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public boolean f4558l = false;

        /* renamed from: m  reason: collision with root package name */
        public float f4559m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            n = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.c.f86x);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (n.get(index)) {
                    case 1:
                        this.f4548a = obtainStyledAttributes.getFloat(index, this.f4548a);
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        this.f4549b = obtainStyledAttributes.getFloat(index, this.f4549b);
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        this.f4550d = obtainStyledAttributes.getFloat(index, this.f4550d);
                        break;
                    case 5:
                        this.f4551e = obtainStyledAttributes.getFloat(index, this.f4551e);
                        break;
                    case 6:
                        this.f4552f = obtainStyledAttributes.getDimension(index, this.f4552f);
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        this.f4553g = obtainStyledAttributes.getDimension(index, this.f4553g);
                        break;
                    case 8:
                        this.f4555i = obtainStyledAttributes.getDimension(index, this.f4555i);
                        break;
                    case i.f16046m /* 9 */:
                        this.f4556j = obtainStyledAttributes.getDimension(index, this.f4556j);
                        break;
                    case i.f16047o /* 10 */:
                        this.f4557k = obtainStyledAttributes.getDimension(index, this.f4557k);
                        break;
                    case 11:
                        this.f4558l = true;
                        this.f4559m = obtainStyledAttributes.getDimension(index, this.f4559m);
                        break;
                    case 12:
                        this.f4554h = b.g(obtainStyledAttributes, index, this.f4554h);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4477e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4478f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] d(Barrier barrier, String str) {
        int i10;
        HashMap<String, Integer> hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            Integer num = null;
            try {
                i10 = i2.c.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f4418u) != null && hashMap.containsKey(trim)) {
                    num = constraintLayout.f4418u.get(trim);
                }
                if (num != null && (num instanceof Integer)) {
                    i10 = num.intValue();
                }
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        if (i12 != split.length) {
            return Arrays.copyOf(iArr, i12);
        }
        return iArr;
    }

    public static a e(Context context, AttributeSet attributeSet, boolean z10) {
        String str;
        int i10;
        String[] strArr;
        int dimensionPixelSize;
        int i11;
        int i12;
        float f10;
        int i13;
        int i14;
        boolean z11;
        int i15;
        int i16;
        String str2;
        a.C0031a c0031a;
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? a1.c.f78p : a1.c.n);
        String[] strArr2 = e2.a.f10605b;
        int[] iArr = f4476d;
        SparseIntArray sparseIntArray = f4477e;
        d dVar = aVar.f4482b;
        e eVar = aVar.f4484e;
        c cVar = aVar.c;
        C0032b c0032b = aVar.f4483d;
        String str3 = "unused attribute 0x";
        if (z10) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            String str4 = "Unknown attribute 0x";
            a.C0031a c0031a2 = new a.C0031a();
            cVar.getClass();
            c0032b.getClass();
            dVar.getClass();
            eVar.getClass();
            int i17 = 0;
            while (i17 < indexCount) {
                int i18 = indexCount;
                int index = obtainStyledAttributes.getIndex(i17);
                int i19 = i17;
                switch (f4478f.get(index)) {
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0032b.I);
                        i11 = 2;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    case i.f16046m /* 9 */:
                    case i.f16047o /* 10 */:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        strArr = strArr2;
                        str2 = str4;
                        StringBuilder sb = new StringBuilder(str2);
                        c0031a = c0031a2;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        continue;
                        indexCount = i18;
                        c0031a2 = c0031a;
                        str4 = str2;
                        i17 = i19 + 1;
                        strArr2 = strArr;
                    case 5:
                        strArr = strArr2;
                        i12 = 5;
                        c0031a2.d(obtainStyledAttributes.getString(index), i12);
                        break;
                    case 6:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelOffset(index, c0032b.C);
                        i11 = 6;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelOffset(index, c0032b.D);
                        i11 = 7;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 8:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0032b.J);
                        i11 = 8;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 11:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0032b.P);
                        i11 = 11;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 12:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0032b.Q);
                        i11 = 12;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 13:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0032b.M);
                        i11 = 13;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 14:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0032b.O);
                        i11 = 14;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case i.f16049q /* 15 */:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0032b.R);
                        i11 = 15;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 16:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0032b.N);
                        i11 = 16;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 17:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelOffset(index, c0032b.f4502d);
                        i11 = 17;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 18:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelOffset(index, c0032b.f4504e);
                        i11 = 18;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 19:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getFloat(index, c0032b.f4506f);
                        i13 = 19;
                        c0031a2.a(i13, f10);
                        break;
                    case 20:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getFloat(index, c0032b.f4532w);
                        i13 = 20;
                        c0031a2.a(i13, f10);
                        break;
                    case 21:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getLayoutDimension(index, c0032b.c);
                        i11 = 21;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 22:
                        strArr = strArr2;
                        dimensionPixelSize = iArr[obtainStyledAttributes.getInt(index, dVar.f4545a)];
                        i11 = 22;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 23:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getLayoutDimension(index, c0032b.f4500b);
                        i11 = 23;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 24:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0032b.F);
                        i11 = 24;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 27:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0032b.E);
                        i11 = 27;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 28:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0032b.G);
                        i11 = 28;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 31:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0032b.K);
                        i11 = 31;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 34:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0032b.H);
                        i11 = 34;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 37:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getFloat(index, c0032b.f4533x);
                        i13 = 37;
                        c0031a2.a(i13, f10);
                        break;
                    case 38:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getResourceId(index, aVar.f4481a);
                        aVar.f4481a = dimensionPixelSize;
                        i11 = 38;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 39:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getFloat(index, c0032b.U);
                        i13 = 39;
                        c0031a2.a(i13, f10);
                        break;
                    case 40:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getFloat(index, c0032b.T);
                        i13 = 40;
                        c0031a2.a(i13, f10);
                        break;
                    case 41:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0032b.V);
                        i11 = 41;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 42:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0032b.W);
                        i11 = 42;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 43:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getFloat(index, dVar.c);
                        i13 = 43;
                        c0031a2.a(i13, f10);
                        break;
                    case 44:
                        strArr = strArr2;
                        c0031a2.c(44, true);
                        c0031a2.a(44, obtainStyledAttributes.getDimension(index, eVar.f4559m));
                        break;
                    case 45:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getFloat(index, eVar.f4549b);
                        i13 = 45;
                        c0031a2.a(i13, f10);
                        break;
                    case 46:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getFloat(index, eVar.c);
                        i13 = 46;
                        c0031a2.a(i13, f10);
                        break;
                    case 47:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getFloat(index, eVar.f4550d);
                        i13 = 47;
                        c0031a2.a(i13, f10);
                        break;
                    case 48:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getFloat(index, eVar.f4551e);
                        i13 = 48;
                        c0031a2.a(i13, f10);
                        break;
                    case 49:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getDimension(index, eVar.f4552f);
                        i13 = 49;
                        c0031a2.a(i13, f10);
                        break;
                    case 50:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getDimension(index, eVar.f4553g);
                        i13 = 50;
                        c0031a2.a(i13, f10);
                        break;
                    case 51:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getDimension(index, eVar.f4555i);
                        i13 = 51;
                        c0031a2.a(i13, f10);
                        break;
                    case 52:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getDimension(index, eVar.f4556j);
                        i13 = 52;
                        c0031a2.a(i13, f10);
                        break;
                    case 53:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getDimension(index, eVar.f4557k);
                        i13 = 53;
                        c0031a2.a(i13, f10);
                        break;
                    case 54:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0032b.X);
                        i11 = 54;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 55:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0032b.Y);
                        i11 = 55;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 56:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0032b.Z);
                        i11 = 56;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 57:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0032b.f4499a0);
                        i11 = 57;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 58:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0032b.f4501b0);
                        i11 = 58;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 59:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0032b.c0);
                        i11 = 59;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 60:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getFloat(index, eVar.f4548a);
                        i13 = 60;
                        c0031a2.a(i13, f10);
                        break;
                    case 62:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0032b.A);
                        i11 = 62;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 63:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getFloat(index, c0032b.B);
                        i13 = 63;
                        c0031a2.a(i13, f10);
                        break;
                    case 64:
                        strArr = strArr2;
                        dimensionPixelSize = g(obtainStyledAttributes, index, cVar.f4537a);
                        i11 = 64;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 65:
                        strArr = strArr2;
                        c0031a2.d(obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                        break;
                    case 66:
                        strArr = strArr2;
                        c0031a2.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getFloat(index, cVar.f4540e);
                        i13 = 67;
                        c0031a2.a(i13, f10);
                        break;
                    case 68:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getFloat(index, dVar.f4547d);
                        i13 = 68;
                        c0031a2.a(i13, f10);
                        break;
                    case 69:
                        strArr = strArr2;
                        i14 = 69;
                        c0031a2.a(i14, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        strArr = strArr2;
                        i14 = 70;
                        c0031a2.a(i14, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        strArr = strArr2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0032b.f4507f0);
                        i11 = 72;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 73:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0032b.f4509g0);
                        i11 = 73;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 74:
                        strArr = strArr2;
                        i12 = 74;
                        c0031a2.d(obtainStyledAttributes.getString(index), i12);
                        break;
                    case 75:
                        strArr = strArr2;
                        z11 = obtainStyledAttributes.getBoolean(index, c0032b.f4522n0);
                        i15 = 75;
                        c0031a2.c(i15, z11);
                        break;
                    case 76:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, cVar.c);
                        i11 = 76;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 77:
                        strArr = strArr2;
                        i12 = 77;
                        c0031a2.d(obtainStyledAttributes.getString(index), i12);
                        break;
                    case 78:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, dVar.f4546b);
                        i11 = 78;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 79:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getFloat(index, cVar.f4539d);
                        i13 = 79;
                        c0031a2.a(i13, f10);
                        break;
                    case 80:
                        strArr = strArr2;
                        z11 = obtainStyledAttributes.getBoolean(index, c0032b.f4519l0);
                        i15 = 80;
                        c0031a2.c(i15, z11);
                        break;
                    case 81:
                        strArr = strArr2;
                        z11 = obtainStyledAttributes.getBoolean(index, c0032b.f4521m0);
                        i15 = 81;
                        c0031a2.c(i15, z11);
                        break;
                    case 82:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInteger(index, cVar.f4538b);
                        i11 = 82;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 83:
                        strArr = strArr2;
                        dimensionPixelSize = g(obtainStyledAttributes, index, eVar.f4554h);
                        i11 = 83;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 84:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInteger(index, cVar.f4542g);
                        i11 = 84;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 85:
                        strArr = strArr2;
                        f10 = obtainStyledAttributes.getFloat(index, cVar.f4541f);
                        i13 = 85;
                        c0031a2.a(i13, f10);
                        break;
                    case 86:
                        strArr = strArr2;
                        int i20 = obtainStyledAttributes.peekValue(index).type;
                        if (i20 != 1) {
                            if (i20 != 3) {
                                c0031a2.b(88, obtainStyledAttributes.getInteger(index, cVar.f4544i));
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                cVar.f4543h = string;
                                c0031a2.d(string, 90);
                                if (cVar.f4543h.indexOf("/") <= 0) {
                                    c0031a2.b(88, -1);
                                    break;
                                } else {
                                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                    cVar.f4544i = resourceId;
                                    c0031a2.b(89, resourceId);
                                    c0031a2.b(88, -2);
                                }
                            }
                        } else {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            cVar.f4544i = resourceId2;
                            c0031a2.b(89, resourceId2);
                            if (cVar.f4544i != -1) {
                                c0031a2.b(88, -2);
                                break;
                            }
                        }
                        indexCount = i18;
                        c0031a2 = c0031a;
                        str4 = str2;
                        i17 = i19 + 1;
                        strArr2 = strArr;
                        break;
                    case 87:
                        strArr = strArr2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0032b.L);
                        i11 = 93;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 94:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0032b.S);
                        i11 = 94;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 95:
                        strArr = strArr2;
                        i16 = 0;
                        h(c0031a2, obtainStyledAttributes, index, i16);
                        break;
                    case 96:
                        strArr = strArr2;
                        i16 = 1;
                        h(c0031a2, obtainStyledAttributes, index, i16);
                        break;
                    case 97:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0032b.f4524o0);
                        i11 = 97;
                        c0031a2.b(i11, dimensionPixelSize);
                        break;
                    case 98:
                        int i21 = MotionLayout.S;
                        strArr = strArr2;
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            aVar.f4481a = obtainStyledAttributes.getResourceId(index, aVar.f4481a);
                            break;
                        } else {
                            obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 99:
                        z11 = obtainStyledAttributes.getBoolean(index, c0032b.f4508g);
                        i15 = 99;
                        strArr = strArr2;
                        c0031a2.c(i15, z11);
                        break;
                }
                str2 = str4;
                c0031a = c0031a2;
                indexCount = i18;
                c0031a2 = c0031a;
                str4 = str2;
                i17 = i19 + 1;
                strArr2 = strArr;
            }
        } else {
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            int i22 = 0;
            while (i22 < indexCount2) {
                int index2 = obtainStyledAttributes.getIndex(i22);
                int i23 = indexCount2;
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        cVar.getClass();
                        c0032b.getClass();
                        dVar.getClass();
                        eVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        str = str3;
                        c0032b.f4525p = g(obtainStyledAttributes, index2, c0032b.f4525p);
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        str = str3;
                        c0032b.I = obtainStyledAttributes.getDimensionPixelSize(index2, c0032b.I);
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        str = str3;
                        c0032b.f4523o = g(obtainStyledAttributes, index2, c0032b.f4523o);
                        break;
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        str = str3;
                        c0032b.n = g(obtainStyledAttributes, index2, c0032b.n);
                        break;
                    case 5:
                        str = str3;
                        c0032b.f4534y = obtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        str = str3;
                        c0032b.C = obtainStyledAttributes.getDimensionPixelOffset(index2, c0032b.C);
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = str3;
                        c0032b.D = obtainStyledAttributes.getDimensionPixelOffset(index2, c0032b.D);
                        break;
                    case 8:
                        str = str3;
                        c0032b.J = obtainStyledAttributes.getDimensionPixelSize(index2, c0032b.J);
                        break;
                    case i.f16046m /* 9 */:
                        str = str3;
                        c0032b.f4531v = g(obtainStyledAttributes, index2, c0032b.f4531v);
                        break;
                    case i.f16047o /* 10 */:
                        str = str3;
                        c0032b.f4530u = g(obtainStyledAttributes, index2, c0032b.f4530u);
                        break;
                    case 11:
                        str = str3;
                        c0032b.P = obtainStyledAttributes.getDimensionPixelSize(index2, c0032b.P);
                        break;
                    case 12:
                        str = str3;
                        c0032b.Q = obtainStyledAttributes.getDimensionPixelSize(index2, c0032b.Q);
                        break;
                    case 13:
                        str = str3;
                        c0032b.M = obtainStyledAttributes.getDimensionPixelSize(index2, c0032b.M);
                        break;
                    case 14:
                        str = str3;
                        c0032b.O = obtainStyledAttributes.getDimensionPixelSize(index2, c0032b.O);
                        break;
                    case i.f16049q /* 15 */:
                        str = str3;
                        c0032b.R = obtainStyledAttributes.getDimensionPixelSize(index2, c0032b.R);
                        break;
                    case 16:
                        str = str3;
                        c0032b.N = obtainStyledAttributes.getDimensionPixelSize(index2, c0032b.N);
                        break;
                    case 17:
                        str = str3;
                        c0032b.f4502d = obtainStyledAttributes.getDimensionPixelOffset(index2, c0032b.f4502d);
                        break;
                    case 18:
                        str = str3;
                        c0032b.f4504e = obtainStyledAttributes.getDimensionPixelOffset(index2, c0032b.f4504e);
                        break;
                    case 19:
                        str = str3;
                        c0032b.f4506f = obtainStyledAttributes.getFloat(index2, c0032b.f4506f);
                        break;
                    case 20:
                        str = str3;
                        c0032b.f4532w = obtainStyledAttributes.getFloat(index2, c0032b.f4532w);
                        break;
                    case 21:
                        str = str3;
                        c0032b.c = obtainStyledAttributes.getLayoutDimension(index2, c0032b.c);
                        break;
                    case 22:
                        str = str3;
                        dVar.f4545a = iArr[obtainStyledAttributes.getInt(index2, dVar.f4545a)];
                        break;
                    case 23:
                        str = str3;
                        c0032b.f4500b = obtainStyledAttributes.getLayoutDimension(index2, c0032b.f4500b);
                        break;
                    case 24:
                        str = str3;
                        c0032b.F = obtainStyledAttributes.getDimensionPixelSize(index2, c0032b.F);
                        break;
                    case 25:
                        str = str3;
                        c0032b.f4510h = g(obtainStyledAttributes, index2, c0032b.f4510h);
                        break;
                    case 26:
                        str = str3;
                        c0032b.f4512i = g(obtainStyledAttributes, index2, c0032b.f4512i);
                        break;
                    case 27:
                        str = str3;
                        c0032b.E = obtainStyledAttributes.getInt(index2, c0032b.E);
                        break;
                    case 28:
                        str = str3;
                        c0032b.G = obtainStyledAttributes.getDimensionPixelSize(index2, c0032b.G);
                        break;
                    case 29:
                        str = str3;
                        c0032b.f4514j = g(obtainStyledAttributes, index2, c0032b.f4514j);
                        break;
                    case 30:
                        str = str3;
                        c0032b.f4516k = g(obtainStyledAttributes, index2, c0032b.f4516k);
                        break;
                    case 31:
                        str = str3;
                        c0032b.K = obtainStyledAttributes.getDimensionPixelSize(index2, c0032b.K);
                        break;
                    case 32:
                        str = str3;
                        c0032b.f4528s = g(obtainStyledAttributes, index2, c0032b.f4528s);
                        break;
                    case 33:
                        str = str3;
                        c0032b.f4529t = g(obtainStyledAttributes, index2, c0032b.f4529t);
                        break;
                    case 34:
                        str = str3;
                        c0032b.H = obtainStyledAttributes.getDimensionPixelSize(index2, c0032b.H);
                        break;
                    case 35:
                        str = str3;
                        c0032b.f4520m = g(obtainStyledAttributes, index2, c0032b.f4520m);
                        break;
                    case 36:
                        str = str3;
                        c0032b.f4518l = g(obtainStyledAttributes, index2, c0032b.f4518l);
                        break;
                    case 37:
                        str = str3;
                        c0032b.f4533x = obtainStyledAttributes.getFloat(index2, c0032b.f4533x);
                        break;
                    case 38:
                        str = str3;
                        aVar.f4481a = obtainStyledAttributes.getResourceId(index2, aVar.f4481a);
                        break;
                    case 39:
                        str = str3;
                        c0032b.U = obtainStyledAttributes.getFloat(index2, c0032b.U);
                        break;
                    case 40:
                        str = str3;
                        c0032b.T = obtainStyledAttributes.getFloat(index2, c0032b.T);
                        break;
                    case 41:
                        str = str3;
                        c0032b.V = obtainStyledAttributes.getInt(index2, c0032b.V);
                        break;
                    case 42:
                        str = str3;
                        c0032b.W = obtainStyledAttributes.getInt(index2, c0032b.W);
                        break;
                    case 43:
                        str = str3;
                        dVar.c = obtainStyledAttributes.getFloat(index2, dVar.c);
                        break;
                    case 44:
                        str = str3;
                        eVar.f4558l = true;
                        eVar.f4559m = obtainStyledAttributes.getDimension(index2, eVar.f4559m);
                        break;
                    case 45:
                        str = str3;
                        eVar.f4549b = obtainStyledAttributes.getFloat(index2, eVar.f4549b);
                        break;
                    case 46:
                        str = str3;
                        eVar.c = obtainStyledAttributes.getFloat(index2, eVar.c);
                        break;
                    case 47:
                        str = str3;
                        eVar.f4550d = obtainStyledAttributes.getFloat(index2, eVar.f4550d);
                        break;
                    case 48:
                        str = str3;
                        eVar.f4551e = obtainStyledAttributes.getFloat(index2, eVar.f4551e);
                        break;
                    case 49:
                        str = str3;
                        eVar.f4552f = obtainStyledAttributes.getDimension(index2, eVar.f4552f);
                        break;
                    case 50:
                        str = str3;
                        eVar.f4553g = obtainStyledAttributes.getDimension(index2, eVar.f4553g);
                        break;
                    case 51:
                        str = str3;
                        eVar.f4555i = obtainStyledAttributes.getDimension(index2, eVar.f4555i);
                        break;
                    case 52:
                        str = str3;
                        eVar.f4556j = obtainStyledAttributes.getDimension(index2, eVar.f4556j);
                        break;
                    case 53:
                        str = str3;
                        eVar.f4557k = obtainStyledAttributes.getDimension(index2, eVar.f4557k);
                        break;
                    case 54:
                        str = str3;
                        c0032b.X = obtainStyledAttributes.getInt(index2, c0032b.X);
                        break;
                    case 55:
                        str = str3;
                        c0032b.Y = obtainStyledAttributes.getInt(index2, c0032b.Y);
                        break;
                    case 56:
                        str = str3;
                        c0032b.Z = obtainStyledAttributes.getDimensionPixelSize(index2, c0032b.Z);
                        break;
                    case 57:
                        str = str3;
                        c0032b.f4499a0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0032b.f4499a0);
                        break;
                    case 58:
                        str = str3;
                        c0032b.f4501b0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0032b.f4501b0);
                        break;
                    case 59:
                        str = str3;
                        c0032b.c0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0032b.c0);
                        break;
                    case 60:
                        str = str3;
                        eVar.f4548a = obtainStyledAttributes.getFloat(index2, eVar.f4548a);
                        break;
                    case 61:
                        str = str3;
                        c0032b.f4535z = g(obtainStyledAttributes, index2, c0032b.f4535z);
                        break;
                    case 62:
                        str = str3;
                        c0032b.A = obtainStyledAttributes.getDimensionPixelSize(index2, c0032b.A);
                        break;
                    case 63:
                        str = str3;
                        c0032b.B = obtainStyledAttributes.getFloat(index2, c0032b.B);
                        break;
                    case 64:
                        str = str3;
                        cVar.f4537a = g(obtainStyledAttributes, index2, cVar.f4537a);
                        break;
                    case 65:
                        str = str3;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                        } else {
                            String str5 = strArr2[obtainStyledAttributes.getInteger(index2, 0)];
                        }
                        cVar.getClass();
                        break;
                    case 66:
                        str = str3;
                        obtainStyledAttributes.getInt(index2, 0);
                        cVar.getClass();
                        break;
                    case 67:
                        str = str3;
                        cVar.f4540e = obtainStyledAttributes.getFloat(index2, cVar.f4540e);
                        break;
                    case 68:
                        str = str3;
                        dVar.f4547d = obtainStyledAttributes.getFloat(index2, dVar.f4547d);
                        break;
                    case 69:
                        str = str3;
                        c0032b.f4503d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        str = str3;
                        c0032b.f4505e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        str = str3;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        str = str3;
                        c0032b.f4507f0 = obtainStyledAttributes.getInt(index2, c0032b.f4507f0);
                        break;
                    case 73:
                        str = str3;
                        c0032b.f4509g0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0032b.f4509g0);
                        break;
                    case 74:
                        str = str3;
                        c0032b.f4515j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        str = str3;
                        c0032b.f4522n0 = obtainStyledAttributes.getBoolean(index2, c0032b.f4522n0);
                        break;
                    case 76:
                        str = str3;
                        cVar.c = obtainStyledAttributes.getInt(index2, cVar.c);
                        break;
                    case 77:
                        str = str3;
                        c0032b.f4517k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        str = str3;
                        dVar.f4546b = obtainStyledAttributes.getInt(index2, dVar.f4546b);
                        break;
                    case 79:
                        str = str3;
                        cVar.f4539d = obtainStyledAttributes.getFloat(index2, cVar.f4539d);
                        break;
                    case 80:
                        str = str3;
                        c0032b.f4519l0 = obtainStyledAttributes.getBoolean(index2, c0032b.f4519l0);
                        break;
                    case 81:
                        str = str3;
                        c0032b.f4521m0 = obtainStyledAttributes.getBoolean(index2, c0032b.f4521m0);
                        break;
                    case 82:
                        str = str3;
                        cVar.f4538b = obtainStyledAttributes.getInteger(index2, cVar.f4538b);
                        break;
                    case 83:
                        str = str3;
                        eVar.f4554h = g(obtainStyledAttributes, index2, eVar.f4554h);
                        break;
                    case 84:
                        str = str3;
                        cVar.f4542g = obtainStyledAttributes.getInteger(index2, cVar.f4542g);
                        break;
                    case 85:
                        str = str3;
                        cVar.f4541f = obtainStyledAttributes.getFloat(index2, cVar.f4541f);
                        break;
                    case 86:
                        str = str3;
                        int i24 = obtainStyledAttributes.peekValue(index2).type;
                        if (i24 != 1) {
                            if (i24 == 3) {
                                String string2 = obtainStyledAttributes.getString(index2);
                                cVar.f4543h = string2;
                                if (string2.indexOf("/") <= 0) {
                                    break;
                                } else {
                                    cVar.f4544i = obtainStyledAttributes.getResourceId(index2, -1);
                                }
                            } else {
                                obtainStyledAttributes.getInteger(index2, cVar.f4544i);
                            }
                            cVar.getClass();
                            break;
                        } else {
                            cVar.f4544i = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        }
                    case 87:
                        StringBuilder sb2 = new StringBuilder(str3);
                        str = str3;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str = str3;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 91:
                        c0032b.f4526q = g(obtainStyledAttributes, index2, c0032b.f4526q);
                        str = str3;
                        break;
                    case 92:
                        c0032b.f4527r = g(obtainStyledAttributes, index2, c0032b.f4527r);
                        str = str3;
                        break;
                    case 93:
                        c0032b.L = obtainStyledAttributes.getDimensionPixelSize(index2, c0032b.L);
                        str = str3;
                        break;
                    case 94:
                        c0032b.S = obtainStyledAttributes.getDimensionPixelSize(index2, c0032b.S);
                        str = str3;
                        break;
                    case 95:
                        i10 = 0;
                        h(c0032b, obtainStyledAttributes, index2, i10);
                        str = str3;
                        break;
                    case 96:
                        i10 = 1;
                        h(c0032b, obtainStyledAttributes, index2, i10);
                        str = str3;
                        break;
                    case 97:
                        c0032b.f4524o0 = obtainStyledAttributes.getInt(index2, c0032b.f4524o0);
                        str = str3;
                        break;
                }
                i22++;
                indexCount2 = i23;
                str3 = str;
            }
            if (c0032b.f4515j0 != null) {
                c0032b.f4513i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public static int g(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(Object obj, TypedArray typedArray, int i10, int i11) {
        int i12;
        int i13;
        int dimensionPixelSize;
        int i14;
        int i15;
        if (obj == null) {
            return;
        }
        int i16 = typedArray.peekValue(i10).type;
        boolean z10 = false;
        if (i16 != 3) {
            if (i16 != 5) {
                dimensionPixelSize = typedArray.getInt(i10, 0);
                i14 = -2;
                if (dimensionPixelSize != -4) {
                    if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                        i14 = 0;
                    }
                } else {
                    z10 = true;
                }
                if (!(obj instanceof ConstraintLayout.a)) {
                    ConstraintLayout.a aVar = (ConstraintLayout.a) obj;
                    if (i11 == 0) {
                        ((ViewGroup.MarginLayoutParams) aVar).width = i14;
                        aVar.W = z10;
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) aVar).height = i14;
                    aVar.X = z10;
                    return;
                } else if (obj instanceof C0032b) {
                    C0032b c0032b = (C0032b) obj;
                    if (i11 == 0) {
                        c0032b.f4500b = i14;
                        c0032b.f4519l0 = z10;
                        return;
                    }
                    c0032b.c = i14;
                    c0032b.f4521m0 = z10;
                    return;
                } else if (obj instanceof a.C0031a) {
                    a.C0031a c0031a = (a.C0031a) obj;
                    if (i11 == 0) {
                        c0031a.b(23, i14);
                        i15 = 80;
                    } else {
                        c0031a.b(21, i14);
                        i15 = 81;
                    }
                    c0031a.c(i15, z10);
                    return;
                } else {
                    return;
                }
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i10, 0);
            i14 = dimensionPixelSize;
            if (!(obj instanceof ConstraintLayout.a)) {
            }
        } else {
            String string = typedArray.getString(i10);
            if (string != null) {
                int indexOf = string.indexOf(61);
                int length = string.length();
                if (indexOf > 0 && indexOf < length - 1) {
                    String substring = string.substring(0, indexOf);
                    String substring2 = string.substring(indexOf + 1);
                    if (substring2.length() > 0) {
                        String trim = substring.trim();
                        String trim2 = substring2.trim();
                        if ("ratio".equalsIgnoreCase(trim)) {
                            if (obj instanceof ConstraintLayout.a) {
                                ConstraintLayout.a aVar2 = (ConstraintLayout.a) obj;
                                if (i11 == 0) {
                                    ((ViewGroup.MarginLayoutParams) aVar2).width = 0;
                                } else {
                                    ((ViewGroup.MarginLayoutParams) aVar2).height = 0;
                                }
                                i(aVar2, trim2);
                                return;
                            } else if (obj instanceof C0032b) {
                                ((C0032b) obj).f4534y = trim2;
                                return;
                            } else if (obj instanceof a.C0031a) {
                                ((a.C0031a) obj).d(trim2, 5);
                                return;
                            } else {
                                return;
                            }
                        }
                        try {
                            if ("weight".equalsIgnoreCase(trim)) {
                                float parseFloat = Float.parseFloat(trim2);
                                if (obj instanceof ConstraintLayout.a) {
                                    ConstraintLayout.a aVar3 = (ConstraintLayout.a) obj;
                                    if (i11 == 0) {
                                        ((ViewGroup.MarginLayoutParams) aVar3).width = 0;
                                        aVar3.H = parseFloat;
                                        return;
                                    }
                                    ((ViewGroup.MarginLayoutParams) aVar3).height = 0;
                                    aVar3.I = parseFloat;
                                } else if (obj instanceof C0032b) {
                                    C0032b c0032b2 = (C0032b) obj;
                                    if (i11 == 0) {
                                        c0032b2.f4500b = 0;
                                        c0032b2.U = parseFloat;
                                        return;
                                    }
                                    c0032b2.c = 0;
                                    c0032b2.T = parseFloat;
                                } else if (obj instanceof a.C0031a) {
                                    a.C0031a c0031a2 = (a.C0031a) obj;
                                    if (i11 == 0) {
                                        c0031a2.b(23, 0);
                                        i13 = 39;
                                    } else {
                                        c0031a2.b(21, 0);
                                        i13 = 40;
                                    }
                                    c0031a2.a(i13, parseFloat);
                                }
                            } else if ("parent".equalsIgnoreCase(trim)) {
                                float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                                if (obj instanceof ConstraintLayout.a) {
                                    ConstraintLayout.a aVar4 = (ConstraintLayout.a) obj;
                                    if (i11 == 0) {
                                        ((ViewGroup.MarginLayoutParams) aVar4).width = 0;
                                        aVar4.R = max;
                                        aVar4.L = 2;
                                        return;
                                    }
                                    ((ViewGroup.MarginLayoutParams) aVar4).height = 0;
                                    aVar4.S = max;
                                    aVar4.M = 2;
                                } else if (obj instanceof C0032b) {
                                    C0032b c0032b3 = (C0032b) obj;
                                    if (i11 == 0) {
                                        c0032b3.f4500b = 0;
                                        c0032b3.f4503d0 = max;
                                        c0032b3.X = 2;
                                        return;
                                    }
                                    c0032b3.c = 0;
                                    c0032b3.f4505e0 = max;
                                    c0032b3.Y = 2;
                                } else if (obj instanceof a.C0031a) {
                                    a.C0031a c0031a3 = (a.C0031a) obj;
                                    if (i11 == 0) {
                                        c0031a3.b(23, 0);
                                        i12 = 54;
                                    } else {
                                        c0031a3.b(21, 0);
                                        i12 = 55;
                                    }
                                    c0031a3.b(i12, 2);
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
    }

    public static void i(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i10 = 0;
            int i11 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i10 = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i11 = i10;
                i10 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i10);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i10, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i11 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        aVar.G = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        b(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void b(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap = this.c;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + h2.a.b(childAt));
            } else {
                if (this.f4480b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (hashMap.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = hashMap.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            C0032b c0032b = aVar.f4483d;
                            c0032b.f4511h0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(c0032b.f4507f0);
                            barrier.setMargin(c0032b.f4509g0);
                            barrier.setAllowsGoneWidget(c0032b.f4522n0);
                            int[] iArr = c0032b.f4513i0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = c0032b.f4515j0;
                                if (str != null) {
                                    int[] d5 = d(barrier, str);
                                    c0032b.f4513i0 = d5;
                                    barrier.setReferencedIds(d5);
                                }
                            }
                        }
                        ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                        aVar2.a();
                        aVar.a(aVar2);
                        ConstraintAttribute.b(childAt, aVar.f4485f);
                        childAt.setLayoutParams(aVar2);
                        d dVar = aVar.f4482b;
                        if (dVar.f4546b == 0) {
                            childAt.setVisibility(dVar.f4545a);
                        }
                        childAt.setAlpha(dVar.c);
                        e eVar = aVar.f4484e;
                        childAt.setRotation(eVar.f4548a);
                        childAt.setRotationX(eVar.f4549b);
                        childAt.setRotationY(eVar.c);
                        childAt.setScaleX(eVar.f4550d);
                        childAt.setScaleY(eVar.f4551e);
                        if (eVar.f4554h != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(eVar.f4554h);
                            if (findViewById != null) {
                                float bottom = (findViewById.getBottom() + findViewById.getTop()) / 2.0f;
                                float right = (findViewById.getRight() + findViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f4552f)) {
                                childAt.setPivotX(eVar.f4552f);
                            }
                            if (!Float.isNaN(eVar.f4553g)) {
                                childAt.setPivotY(eVar.f4553g);
                            }
                        }
                        childAt.setTranslationX(eVar.f4555i);
                        childAt.setTranslationY(eVar.f4556j);
                        childAt.setTranslationZ(eVar.f4557k);
                        if (eVar.f4558l) {
                            childAt.setElevation(eVar.f4559m);
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = hashMap.get(num);
            if (aVar3 != null) {
                C0032b c0032b2 = aVar3.f4483d;
                if (c0032b2.f4511h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = c0032b2.f4513i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = c0032b2.f4515j0;
                        if (str2 != null) {
                            int[] d10 = d(barrier2, str2);
                            c0032b2.f4513i0 = d10;
                            barrier2.setReferencedIds(d10);
                        }
                    }
                    barrier2.setType(c0032b2.f4507f0);
                    barrier2.setMargin(c0032b2.f4509g0);
                    i2.d dVar2 = ConstraintLayout.f4406x;
                    ConstraintLayout.a aVar4 = new ConstraintLayout.a();
                    barrier2.k();
                    aVar3.a(aVar4);
                    constraintLayout.addView(barrier2, aVar4);
                }
                if (c0032b2.f4498a) {
                    View dVar3 = new androidx.constraintlayout.widget.d(constraintLayout.getContext());
                    dVar3.setId(num.intValue());
                    i2.d dVar4 = ConstraintLayout.f4406x;
                    ConstraintLayout.a aVar5 = new ConstraintLayout.a();
                    aVar3.a(aVar5);
                    constraintLayout.addView(dVar3, aVar5);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof androidx.constraintlayout.widget.a) {
                ((androidx.constraintlayout.widget.a) childAt2).g(constraintLayout);
            }
        }
    }

    public final void c(ConstraintLayout constraintLayout) {
        int i10;
        int i11;
        ConstraintAttribute constraintAttribute;
        b bVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap = bVar.c;
        hashMap.clear();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = constraintLayout.getChildAt(i12);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (bVar.f4480b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new a());
            }
            a aVar2 = hashMap.get(Integer.valueOf(id));
            if (aVar2 == null) {
                i10 = childCount;
            } else {
                HashMap<String, ConstraintAttribute> hashMap2 = bVar.f4479a;
                HashMap<String, ConstraintAttribute> hashMap3 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    ConstraintAttribute constraintAttribute2 = hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            constraintAttribute = new ConstraintAttribute(constraintAttribute2, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                            i11 = childCount;
                        } else {
                            i11 = childCount;
                            try {
                                constraintAttribute = new ConstraintAttribute(constraintAttribute2, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0]));
                            } catch (IllegalAccessException e10) {
                                e = e10;
                                e.printStackTrace();
                                childCount = i11;
                            } catch (NoSuchMethodException e11) {
                                e = e11;
                                e.printStackTrace();
                                childCount = i11;
                            } catch (InvocationTargetException e12) {
                                e = e12;
                                e.printStackTrace();
                                childCount = i11;
                            }
                        }
                        hashMap3.put(str, constraintAttribute);
                    } catch (IllegalAccessException e13) {
                        e = e13;
                        i11 = childCount;
                        e.printStackTrace();
                        childCount = i11;
                    } catch (NoSuchMethodException e14) {
                        e = e14;
                        i11 = childCount;
                        e.printStackTrace();
                        childCount = i11;
                    } catch (InvocationTargetException e15) {
                        e = e15;
                        i11 = childCount;
                        e.printStackTrace();
                        childCount = i11;
                    }
                    childCount = i11;
                }
                i10 = childCount;
                aVar2.f4485f = hashMap3;
                aVar2.b(id, aVar);
                int visibility = childAt.getVisibility();
                d dVar = aVar2.f4482b;
                dVar.f4545a = visibility;
                dVar.c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                e eVar = aVar2.f4484e;
                eVar.f4548a = rotation;
                eVar.f4549b = childAt.getRotationX();
                eVar.c = childAt.getRotationY();
                eVar.f4550d = childAt.getScaleX();
                eVar.f4551e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eVar.f4552f = pivotX;
                    eVar.f4553g = pivotY;
                }
                eVar.f4555i = childAt.getTranslationX();
                eVar.f4556j = childAt.getTranslationY();
                eVar.f4557k = childAt.getTranslationZ();
                if (eVar.f4558l) {
                    eVar.f4559m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
                    C0032b c0032b = aVar2.f4483d;
                    c0032b.f4522n0 = allowsGoneWidget;
                    c0032b.f4513i0 = barrier.getReferencedIds();
                    c0032b.f4507f0 = barrier.getType();
                    c0032b.f4509g0 = barrier.getMargin();
                }
            }
            i12++;
            bVar = this;
            childCount = i10;
        }
    }

    public final void f(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            while (eventType != 1) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a e10 = e(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        e10.f4483d.f4498a = true;
                    }
                    this.c.put(Integer.valueOf(e10.f4481a), e10);
                }
                eventType = xml.next();
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }
}
