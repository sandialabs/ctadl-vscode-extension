package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.h;
import androidx.datastore.preferences.PreferencesProto$Value;
import g2.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import ma.i;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: x  reason: collision with root package name */
    public static i2.d f4406x;

    /* renamed from: i  reason: collision with root package name */
    public final SparseArray<View> f4407i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<androidx.constraintlayout.widget.a> f4408j;

    /* renamed from: k  reason: collision with root package name */
    public final androidx.constraintlayout.core.widgets.d f4409k;

    /* renamed from: l  reason: collision with root package name */
    public int f4410l;

    /* renamed from: m  reason: collision with root package name */
    public int f4411m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f4412o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4413p;

    /* renamed from: q  reason: collision with root package name */
    public int f4414q;

    /* renamed from: r  reason: collision with root package name */
    public androidx.constraintlayout.widget.b f4415r;

    /* renamed from: s  reason: collision with root package name */
    public i2.a f4416s;

    /* renamed from: t  reason: collision with root package name */
    public int f4417t;

    /* renamed from: u  reason: collision with root package name */
    public HashMap<String, Integer> f4418u;

    /* renamed from: v  reason: collision with root package name */
    public final SparseArray<ConstraintWidget> f4419v;

    /* renamed from: w  reason: collision with root package name */
    public final b f4420w;

    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public final int C;
        public final int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;

        /* renamed from: a  reason: collision with root package name */
        public int f4421a;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f4422a0;

        /* renamed from: b  reason: collision with root package name */
        public int f4423b;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f4424b0;
        public float c;
        public boolean c0;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f4425d;

        /* renamed from: d0  reason: collision with root package name */
        public boolean f4426d0;

        /* renamed from: e  reason: collision with root package name */
        public int f4427e;

        /* renamed from: e0  reason: collision with root package name */
        public boolean f4428e0;

        /* renamed from: f  reason: collision with root package name */
        public int f4429f;

        /* renamed from: f0  reason: collision with root package name */
        public boolean f4430f0;

        /* renamed from: g  reason: collision with root package name */
        public int f4431g;

        /* renamed from: g0  reason: collision with root package name */
        public int f4432g0;

        /* renamed from: h  reason: collision with root package name */
        public int f4433h;

        /* renamed from: h0  reason: collision with root package name */
        public int f4434h0;

        /* renamed from: i  reason: collision with root package name */
        public int f4435i;

        /* renamed from: i0  reason: collision with root package name */
        public int f4436i0;

        /* renamed from: j  reason: collision with root package name */
        public int f4437j;

        /* renamed from: j0  reason: collision with root package name */
        public int f4438j0;

        /* renamed from: k  reason: collision with root package name */
        public int f4439k;

        /* renamed from: k0  reason: collision with root package name */
        public int f4440k0;

        /* renamed from: l  reason: collision with root package name */
        public int f4441l;

        /* renamed from: l0  reason: collision with root package name */
        public int f4442l0;

        /* renamed from: m  reason: collision with root package name */
        public int f4443m;

        /* renamed from: m0  reason: collision with root package name */
        public float f4444m0;
        public int n;

        /* renamed from: n0  reason: collision with root package name */
        public int f4445n0;

        /* renamed from: o  reason: collision with root package name */
        public int f4446o;

        /* renamed from: o0  reason: collision with root package name */
        public int f4447o0;

        /* renamed from: p  reason: collision with root package name */
        public int f4448p;

        /* renamed from: p0  reason: collision with root package name */
        public float f4449p0;

        /* renamed from: q  reason: collision with root package name */
        public int f4450q;

        /* renamed from: q0  reason: collision with root package name */
        public ConstraintWidget f4451q0;

        /* renamed from: r  reason: collision with root package name */
        public float f4452r;

        /* renamed from: s  reason: collision with root package name */
        public int f4453s;

        /* renamed from: t  reason: collision with root package name */
        public int f4454t;

        /* renamed from: u  reason: collision with root package name */
        public int f4455u;

        /* renamed from: v  reason: collision with root package name */
        public int f4456v;

        /* renamed from: w  reason: collision with root package name */
        public final int f4457w;

        /* renamed from: x  reason: collision with root package name */
        public int f4458x;

        /* renamed from: y  reason: collision with root package name */
        public final int f4459y;

        /* renamed from: z  reason: collision with root package name */
        public int f4460z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0030a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f4461a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f4461a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public a() {
            super(-2, -2);
            this.f4421a = -1;
            this.f4423b = -1;
            this.c = -1.0f;
            this.f4425d = true;
            this.f4427e = -1;
            this.f4429f = -1;
            this.f4431g = -1;
            this.f4433h = -1;
            this.f4435i = -1;
            this.f4437j = -1;
            this.f4439k = -1;
            this.f4441l = -1;
            this.f4443m = -1;
            this.n = -1;
            this.f4446o = -1;
            this.f4448p = -1;
            this.f4450q = 0;
            this.f4452r = 0.0f;
            this.f4453s = -1;
            this.f4454t = -1;
            this.f4455u = -1;
            this.f4456v = -1;
            this.f4457w = Integer.MIN_VALUE;
            this.f4458x = Integer.MIN_VALUE;
            this.f4459y = Integer.MIN_VALUE;
            this.f4460z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f4422a0 = true;
            this.f4424b0 = true;
            this.c0 = false;
            this.f4426d0 = false;
            this.f4428e0 = false;
            this.f4430f0 = false;
            this.f4432g0 = -1;
            this.f4434h0 = -1;
            this.f4436i0 = -1;
            this.f4438j0 = -1;
            this.f4440k0 = Integer.MIN_VALUE;
            this.f4442l0 = Integer.MIN_VALUE;
            this.f4444m0 = 0.5f;
            this.f4451q0 = new ConstraintWidget();
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            this.f4421a = -1;
            this.f4423b = -1;
            this.c = -1.0f;
            this.f4425d = true;
            this.f4427e = -1;
            this.f4429f = -1;
            this.f4431g = -1;
            this.f4433h = -1;
            this.f4435i = -1;
            this.f4437j = -1;
            this.f4439k = -1;
            this.f4441l = -1;
            this.f4443m = -1;
            this.n = -1;
            this.f4446o = -1;
            this.f4448p = -1;
            this.f4450q = 0;
            this.f4452r = 0.0f;
            this.f4453s = -1;
            this.f4454t = -1;
            this.f4455u = -1;
            this.f4456v = -1;
            this.f4457w = Integer.MIN_VALUE;
            this.f4458x = Integer.MIN_VALUE;
            this.f4459y = Integer.MIN_VALUE;
            this.f4460z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f4422a0 = true;
            this.f4424b0 = true;
            this.c0 = false;
            this.f4426d0 = false;
            this.f4428e0 = false;
            this.f4430f0 = false;
            this.f4432g0 = -1;
            this.f4434h0 = -1;
            this.f4436i0 = -1;
            this.f4438j0 = -1;
            this.f4440k0 = Integer.MIN_VALUE;
            this.f4442l0 = Integer.MIN_VALUE;
            this.f4444m0 = 0.5f;
            this.f4451q0 = new ConstraintWidget();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.c.f77o);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = C0030a.f4461a.get(index);
                switch (i11) {
                    case 1:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        continue;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f4448p);
                        this.f4448p = resourceId;
                        if (resourceId == -1) {
                            this.f4448p = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        this.f4450q = obtainStyledAttributes.getDimensionPixelSize(index, this.f4450q);
                        continue;
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f4452r) % 360.0f;
                        this.f4452r = f10;
                        if (f10 < 0.0f) {
                            this.f4452r = (360.0f - f10) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f4421a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4421a);
                        continue;
                    case 6:
                        this.f4423b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4423b);
                        continue;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f4427e);
                        this.f4427e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f4427e = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case i.f16046m /* 9 */:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f4429f);
                        this.f4429f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f4429f = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case i.f16047o /* 10 */:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f4431g);
                        this.f4431g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f4431g = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f4433h);
                        this.f4433h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f4433h = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f4435i);
                        this.f4435i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f4435i = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f4437j);
                        this.f4437j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f4437j = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f4439k);
                        this.f4439k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f4439k = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case i.f16049q /* 15 */:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f4441l);
                        this.f4441l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f4441l = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f4443m);
                        this.f4443m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f4443m = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f4453s);
                        this.f4453s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f4453s = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f4454t);
                        this.f4454t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f4454t = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f4455u);
                        this.f4455u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f4455u = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f4456v);
                        this.f4456v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f4456v = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.f4457w = obtainStyledAttributes.getDimensionPixelSize(index, this.f4457w);
                        continue;
                    case 22:
                        this.f4458x = obtainStyledAttributes.getDimensionPixelSize(index, this.f4458x);
                        continue;
                    case 23:
                        this.f4459y = obtainStyledAttributes.getDimensionPixelSize(index, this.f4459y);
                        continue;
                    case 24:
                        this.f4460z = obtainStyledAttributes.getDimensionPixelSize(index, this.f4460z);
                        continue;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        continue;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        continue;
                    case 27:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        continue;
                    case 28:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        continue;
                    case 29:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        continue;
                    case 30:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        continue;
                    case 31:
                        int i12 = obtainStyledAttributes.getInt(index, 0);
                        this.L = i12;
                        if (i12 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 32:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.M = i13;
                        if (i13 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 33:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                    case 34:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                            }
                        }
                    case 35:
                        this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        continue;
                    case 36:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                            }
                        }
                    case 37:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                            }
                        }
                    case 38:
                        this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        continue;
                    default:
                        switch (i11) {
                            case 44:
                                androidx.constraintlayout.widget.b.i(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.H = obtainStyledAttributes.getFloat(index, this.H);
                                continue;
                            case 46:
                                this.I = obtainStyledAttributes.getFloat(index, this.I);
                                continue;
                            case 47:
                                this.J = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.K = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                continue;
                            case 50:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                continue;
                            case 51:
                                this.Y = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f4446o);
                                this.f4446o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f4446o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                continue;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            default:
                                switch (i11) {
                                    case 64:
                                        androidx.constraintlayout.widget.b.h(this, obtainStyledAttributes, index, 0);
                                        continue;
                                        continue;
                                        continue;
                                    case 65:
                                        androidx.constraintlayout.widget.b.h(this, obtainStyledAttributes, index, 1);
                                        continue;
                                    case 66:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 67:
                                        this.f4425d = obtainStyledAttributes.getBoolean(index, this.f4425d);
                                        continue;
                                    default:
                                        continue;
                                }
                        }
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4421a = -1;
            this.f4423b = -1;
            this.c = -1.0f;
            this.f4425d = true;
            this.f4427e = -1;
            this.f4429f = -1;
            this.f4431g = -1;
            this.f4433h = -1;
            this.f4435i = -1;
            this.f4437j = -1;
            this.f4439k = -1;
            this.f4441l = -1;
            this.f4443m = -1;
            this.n = -1;
            this.f4446o = -1;
            this.f4448p = -1;
            this.f4450q = 0;
            this.f4452r = 0.0f;
            this.f4453s = -1;
            this.f4454t = -1;
            this.f4455u = -1;
            this.f4456v = -1;
            this.f4457w = Integer.MIN_VALUE;
            this.f4458x = Integer.MIN_VALUE;
            this.f4459y = Integer.MIN_VALUE;
            this.f4460z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f4422a0 = true;
            this.f4424b0 = true;
            this.c0 = false;
            this.f4426d0 = false;
            this.f4428e0 = false;
            this.f4430f0 = false;
            this.f4432g0 = -1;
            this.f4434h0 = -1;
            this.f4436i0 = -1;
            this.f4438j0 = -1;
            this.f4440k0 = Integer.MIN_VALUE;
            this.f4442l0 = Integer.MIN_VALUE;
            this.f4444m0 = 0.5f;
            this.f4451q0 = new ConstraintWidget();
        }

        public final void a() {
            this.f4426d0 = false;
            this.f4422a0 = true;
            this.f4424b0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.W) {
                this.f4422a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.X) {
                this.f4424b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f4422a0 = false;
                if (i10 == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f4424b0 = false;
                if (i11 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.c == -1.0f && this.f4421a == -1 && this.f4423b == -1) {
                return;
            }
            this.f4426d0 = true;
            this.f4422a0 = true;
            this.f4424b0 = true;
            if (!(this.f4451q0 instanceof f)) {
                this.f4451q0 = new f();
            }
            ((f) this.f4451q0).Q(this.V);
        }

        /* JADX WARN: Code restructure failed: missing block: B:74:0x00d0, code lost:
            if (r1 > 0) goto L52;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00f1  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void resolveLayoutDirection(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i17 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i10);
            boolean z10 = false;
            boolean z11 = 1 == getLayoutDirection();
            this.f4436i0 = -1;
            this.f4438j0 = -1;
            this.f4432g0 = -1;
            this.f4434h0 = -1;
            this.f4440k0 = this.f4457w;
            this.f4442l0 = this.f4459y;
            float f10 = this.E;
            this.f4444m0 = f10;
            int i18 = this.f4421a;
            this.f4445n0 = i18;
            int i19 = this.f4423b;
            this.f4447o0 = i19;
            float f11 = this.c;
            this.f4449p0 = f11;
            if (z11) {
                int i20 = this.f4453s;
                if (i20 != -1) {
                    this.f4436i0 = i20;
                } else {
                    int i21 = this.f4454t;
                    if (i21 != -1) {
                        this.f4438j0 = i21;
                    }
                    i12 = this.f4455u;
                    if (i12 != -1) {
                        this.f4434h0 = i12;
                        z10 = true;
                    }
                    i13 = this.f4456v;
                    if (i13 != -1) {
                        this.f4432g0 = i13;
                        z10 = true;
                    }
                    i14 = this.A;
                    if (i14 != Integer.MIN_VALUE) {
                        this.f4442l0 = i14;
                    }
                    i15 = this.B;
                    if (i15 != Integer.MIN_VALUE) {
                        this.f4440k0 = i15;
                    }
                    if (z10) {
                        this.f4444m0 = 1.0f - f10;
                    }
                    if (this.f4426d0 && this.V == 1 && this.f4425d) {
                        if (f11 == -1.0f) {
                            this.f4449p0 = 1.0f - f11;
                            this.f4445n0 = -1;
                            this.f4447o0 = -1;
                        } else {
                            if (i18 != -1) {
                                this.f4447o0 = i18;
                                this.f4445n0 = -1;
                            } else if (i19 != -1) {
                                this.f4445n0 = i19;
                                this.f4447o0 = -1;
                            }
                            this.f4449p0 = -1.0f;
                        }
                    }
                }
                z10 = true;
                i12 = this.f4455u;
                if (i12 != -1) {
                }
                i13 = this.f4456v;
                if (i13 != -1) {
                }
                i14 = this.A;
                if (i14 != Integer.MIN_VALUE) {
                }
                i15 = this.B;
                if (i15 != Integer.MIN_VALUE) {
                }
                if (z10) {
                }
                if (this.f4426d0) {
                    if (f11 == -1.0f) {
                    }
                }
            } else {
                int i22 = this.f4453s;
                if (i22 != -1) {
                    this.f4434h0 = i22;
                }
                int i23 = this.f4454t;
                if (i23 != -1) {
                    this.f4432g0 = i23;
                }
                int i24 = this.f4455u;
                if (i24 != -1) {
                    this.f4436i0 = i24;
                }
                int i25 = this.f4456v;
                if (i25 != -1) {
                    this.f4438j0 = i25;
                }
                int i26 = this.A;
                if (i26 != Integer.MIN_VALUE) {
                    this.f4440k0 = i26;
                }
                int i27 = this.B;
                if (i27 != Integer.MIN_VALUE) {
                    this.f4442l0 = i27;
                }
            }
            if (this.f4455u == -1 && this.f4456v == -1 && this.f4454t == -1 && this.f4453s == -1) {
                int i28 = this.f4431g;
                if (i28 == -1) {
                    int i29 = this.f4433h;
                    if (i29 != -1) {
                        this.f4438j0 = i29;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i17 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i17;
                        }
                    }
                    i11 = this.f4427e;
                    if (i11 == -1) {
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i16;
                }
                this.f4436i0 = i28;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0) {
                }
                i11 = this.f4427e;
                if (i11 == -1) {
                    this.f4432g0 = i11;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i16 <= 0) {
                        return;
                    }
                } else {
                    int i30 = this.f4429f;
                    if (i30 == -1) {
                        return;
                    }
                    this.f4434h0 = i30;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i16 <= 0) {
                        return;
                    }
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i16;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements b.InterfaceC0121b {

        /* renamed from: a  reason: collision with root package name */
        public final ConstraintLayout f4462a;

        /* renamed from: b  reason: collision with root package name */
        public int f4463b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f4464d;

        /* renamed from: e  reason: collision with root package name */
        public int f4465e;

        /* renamed from: f  reason: collision with root package name */
        public int f4466f;

        /* renamed from: g  reason: collision with root package name */
        public int f4467g;

        public b(ConstraintLayout constraintLayout) {
            this.f4462a = constraintLayout;
        }

        public static boolean a(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:199:0x027c, code lost:
            r0 = 1073741824;
            r6 = android.view.View.MeasureSpec.makeMeasureSpec(r14, 1073741824);
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01ac  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01b1  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x01b8 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:137:0x01c0 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:143:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x01d4  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x01df A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:154:0x01e0  */
        /* JADX WARN: Removed duplicated region for block: B:207:0x02ad  */
        /* JADX WARN: Removed duplicated region for block: B:208:0x02b0  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x02b6  */
        /* JADX WARN: Removed duplicated region for block: B:218:0x02c4  */
        /* JADX WARN: Removed duplicated region for block: B:219:0x02c6  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x02ca  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x012a  */
        @SuppressLint({"WrongCall"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void b(ConstraintWidget constraintWidget, b.a aVar) {
            int makeMeasureSpec;
            int ordinal;
            int makeMeasureSpec2;
            androidx.constraintlayout.core.widgets.d dVar;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour;
            boolean z10;
            boolean z11;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            int i10;
            int i11;
            int i12;
            int i13;
            int baseline;
            int i14;
            int i15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            boolean z20;
            boolean z21;
            boolean z22;
            int i16;
            int i17;
            int i18;
            boolean z23;
            boolean z24;
            boolean z25;
            int i19;
            if (constraintWidget == null) {
                return;
            }
            if (constraintWidget.f4253j0 == 8 && !constraintWidget.G) {
                aVar.f11198e = 0;
                aVar.f11199f = 0;
                aVar.f11200g = 0;
            } else if (constraintWidget.W == null) {
            } else {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.f11195a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = aVar.f11196b;
                int i20 = aVar.c;
                int i21 = aVar.f11197d;
                int i22 = this.f4463b + this.c;
                int i23 = this.f4464d;
                View view = (View) constraintWidget.f4251i0;
                int ordinal2 = dimensionBehaviour3.ordinal();
                ConstraintAnchor constraintAnchor = constraintWidget.M;
                ConstraintAnchor constraintAnchor2 = constraintWidget.K;
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                makeMeasureSpec = 0;
                            } else {
                                i17 = this.f4466f;
                                if (constraintAnchor2 != null) {
                                    i19 = constraintAnchor2.f4225g + 0;
                                } else {
                                    i19 = 0;
                                }
                                if (constraintAnchor != null) {
                                    i19 += constraintAnchor.f4225g;
                                }
                                i23 += i19;
                                i18 = -1;
                            }
                        } else {
                            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4466f, i23, -2);
                            if (constraintWidget.f4269s == 1) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            int i24 = aVar.f11203j;
                            if (i24 == 1 || i24 == 2) {
                                if (view.getMeasuredHeight() == constraintWidget.l()) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                if (aVar.f11203j != 2 && z23 && ((!z23 || !z24) && !(view instanceof e) && !constraintWidget.A())) {
                                    z25 = false;
                                    if (z25) {
                                        i20 = constraintWidget.q();
                                    }
                                }
                                z25 = true;
                                if (z25) {
                                }
                            }
                        }
                        ordinal = dimensionBehaviour4.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        makeMeasureSpec2 = 0;
                                    } else {
                                        int i25 = this.f4467g;
                                        if (constraintAnchor2 != null) {
                                            i16 = constraintWidget.L.f4225g + 0;
                                        } else {
                                            i16 = 0;
                                        }
                                        if (constraintAnchor != null) {
                                            i16 += constraintWidget.N.f4225g;
                                        }
                                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i25, i22 + i16, -1);
                                    }
                                } else {
                                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4467g, i22, -2);
                                    if (constraintWidget.f4270t == 1) {
                                        z20 = true;
                                    } else {
                                        z20 = false;
                                    }
                                    int i26 = aVar.f11203j;
                                    if (i26 != 1) {
                                        if (i26 == 2) {
                                        }
                                    }
                                    if (view.getMeasuredWidth() == constraintWidget.q()) {
                                        z21 = true;
                                    } else {
                                        z21 = false;
                                    }
                                    if (aVar.f11203j != 2 && z20 && ((!z20 || !z21) && !(view instanceof e) && !constraintWidget.B())) {
                                        z22 = false;
                                        if (z22) {
                                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.l(), 1073741824);
                                        }
                                    }
                                    z22 = true;
                                    if (z22) {
                                    }
                                }
                            } else {
                                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4467g, i22, -2);
                            }
                        } else {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
                        }
                        dVar = (androidx.constraintlayout.core.widgets.d) constraintWidget.W;
                        ConstraintLayout constraintLayout = ConstraintLayout.this;
                        if (dVar != null && g.b(constraintLayout.f4414q, 256) && view.getMeasuredWidth() == constraintWidget.q() && view.getMeasuredWidth() < dVar.q() && view.getMeasuredHeight() == constraintWidget.l() && view.getMeasuredHeight() < dVar.l() && view.getBaseline() == constraintWidget.f4241d0 && !constraintWidget.z()) {
                            if (!a(constraintWidget.I, makeMeasureSpec, constraintWidget.q()) && a(constraintWidget.J, makeMeasureSpec2, constraintWidget.l())) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (z19) {
                                aVar.f11198e = constraintWidget.q();
                                aVar.f11199f = constraintWidget.l();
                                aVar.f11200g = constraintWidget.f4241d0;
                                return;
                            }
                        }
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (dimensionBehaviour3 == dimensionBehaviour) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (dimensionBehaviour4 == dimensionBehaviour) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
                        if (dimensionBehaviour4 != dimensionBehaviour2 && dimensionBehaviour4 != dimensionBehaviour5) {
                            z12 = false;
                            if (dimensionBehaviour3 != dimensionBehaviour2 && dimensionBehaviour3 != dimensionBehaviour5) {
                                z13 = false;
                                if (!z10 && constraintWidget.Z > 0.0f) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (!z11 && constraintWidget.Z > 0.0f) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (view == null) {
                                    return;
                                }
                                a aVar2 = (a) view.getLayoutParams();
                                int i27 = aVar.f11203j;
                                if (i27 != 1 && i27 != 2 && z10 && constraintWidget.f4269s == 0 && z11 && constraintWidget.f4270t == 0) {
                                    i14 = 0;
                                    i15 = -1;
                                    i10 = 0;
                                    i12 = 0;
                                    if (i14 != i15) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (i10 == aVar.c && i12 == aVar.f11197d) {
                                        z17 = false;
                                        aVar.f11202i = z17;
                                        if (aVar2.c0) {
                                            z18 = true;
                                        } else {
                                            z18 = z16;
                                        }
                                        if (z18 && i14 != -1 && constraintWidget.f4241d0 != i14) {
                                            aVar.f11202i = true;
                                        }
                                        aVar.f11198e = i10;
                                        aVar.f11199f = i12;
                                        aVar.f11201h = z18;
                                        aVar.f11200g = i14;
                                        return;
                                    }
                                    z17 = true;
                                    aVar.f11202i = z17;
                                    if (aVar2.c0) {
                                    }
                                    if (z18) {
                                        aVar.f11202i = true;
                                    }
                                    aVar.f11198e = i10;
                                    aVar.f11199f = i12;
                                    aVar.f11201h = z18;
                                    aVar.f11200g = i14;
                                    return;
                                }
                                if ((view instanceof i2.e) && (constraintWidget instanceof h)) {
                                    ((i2.e) view).l((h) constraintWidget, makeMeasureSpec, makeMeasureSpec2);
                                } else {
                                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                                }
                                constraintWidget.I = makeMeasureSpec;
                                constraintWidget.J = makeMeasureSpec2;
                                constraintWidget.f4246g = false;
                                int measuredWidth = view.getMeasuredWidth();
                                int measuredHeight = view.getMeasuredHeight();
                                int baseline2 = view.getBaseline();
                                int i28 = constraintWidget.f4272v;
                                if (i28 > 0) {
                                    i10 = Math.max(i28, measuredWidth);
                                } else {
                                    i10 = measuredWidth;
                                }
                                int i29 = constraintWidget.f4273w;
                                if (i29 > 0) {
                                    i10 = Math.min(i29, i10);
                                }
                                int i30 = constraintWidget.f4275y;
                                if (i30 > 0) {
                                    i12 = Math.max(i30, measuredHeight);
                                    i11 = makeMeasureSpec2;
                                } else {
                                    i11 = makeMeasureSpec2;
                                    i12 = measuredHeight;
                                }
                                int i31 = constraintWidget.f4276z;
                                if (i31 > 0) {
                                    i12 = Math.min(i31, i12);
                                }
                                if (!g.b(constraintLayout.f4414q, 1)) {
                                    if (z14 && z12) {
                                        i10 = (int) ((i12 * constraintWidget.Z) + 0.5f);
                                    } else if (z15 && z13) {
                                        i12 = (int) ((i10 / constraintWidget.Z) + 0.5f);
                                    }
                                }
                                if (measuredWidth == i10 && measuredHeight == i12) {
                                    baseline = baseline2;
                                    i14 = baseline;
                                    i15 = -1;
                                    if (i14 != i15) {
                                    }
                                    if (i10 == aVar.c) {
                                        z17 = false;
                                        aVar.f11202i = z17;
                                        if (aVar2.c0) {
                                        }
                                        if (z18) {
                                        }
                                        aVar.f11198e = i10;
                                        aVar.f11199f = i12;
                                        aVar.f11201h = z18;
                                        aVar.f11200g = i14;
                                        return;
                                    }
                                    z17 = true;
                                    aVar.f11202i = z17;
                                    if (aVar2.c0) {
                                    }
                                    if (z18) {
                                    }
                                    aVar.f11198e = i10;
                                    aVar.f11199f = i12;
                                    aVar.f11201h = z18;
                                    aVar.f11200g = i14;
                                    return;
                                }
                                int i32 = 1073741824;
                                if (measuredHeight != i12) {
                                    i13 = View.MeasureSpec.makeMeasureSpec(i12, i32);
                                } else {
                                    i13 = i11;
                                }
                                view.measure(makeMeasureSpec, i13);
                                constraintWidget.I = makeMeasureSpec;
                                constraintWidget.J = i13;
                                constraintWidget.f4246g = false;
                                int measuredWidth2 = view.getMeasuredWidth();
                                i10 = measuredWidth2;
                                i12 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                                i14 = baseline;
                                i15 = -1;
                                if (i14 != i15) {
                                }
                                if (i10 == aVar.c) {
                                }
                                z17 = true;
                                aVar.f11202i = z17;
                                if (aVar2.c0) {
                                }
                                if (z18) {
                                }
                                aVar.f11198e = i10;
                                aVar.f11199f = i12;
                                aVar.f11201h = z18;
                                aVar.f11200g = i14;
                                return;
                            }
                            z13 = true;
                            if (!z10) {
                            }
                            z14 = false;
                            if (!z11) {
                            }
                            z15 = false;
                            if (view == null) {
                            }
                        }
                        z12 = true;
                        if (dimensionBehaviour3 != dimensionBehaviour2) {
                            z13 = false;
                            if (!z10) {
                            }
                            z14 = false;
                            if (!z11) {
                            }
                            z15 = false;
                            if (view == null) {
                            }
                        }
                        z13 = true;
                        if (!z10) {
                        }
                        z14 = false;
                        if (!z11) {
                        }
                        z15 = false;
                        if (view == null) {
                        }
                    } else {
                        i17 = this.f4466f;
                        i18 = -2;
                    }
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(i17, i23, i18);
                    ordinal = dimensionBehaviour4.ordinal();
                    if (ordinal != 0) {
                    }
                    dVar = (androidx.constraintlayout.core.widgets.d) constraintWidget.W;
                    ConstraintLayout constraintLayout2 = ConstraintLayout.this;
                    if (dVar != null) {
                        if (!a(constraintWidget.I, makeMeasureSpec, constraintWidget.q())) {
                        }
                        z19 = false;
                        if (z19) {
                        }
                    }
                    dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                    }
                    if (dimensionBehaviour4 == dimensionBehaviour) {
                    }
                    dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour52 = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (dimensionBehaviour4 != dimensionBehaviour2) {
                        z12 = false;
                        if (dimensionBehaviour3 != dimensionBehaviour2) {
                        }
                        z13 = true;
                        if (!z10) {
                        }
                        z14 = false;
                        if (!z11) {
                        }
                        z15 = false;
                        if (view == null) {
                        }
                    }
                    z12 = true;
                    if (dimensionBehaviour3 != dimensionBehaviour2) {
                    }
                    z13 = true;
                    if (!z10) {
                    }
                    z14 = false;
                    if (!z11) {
                    }
                    z15 = false;
                    if (view == null) {
                    }
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
                ordinal = dimensionBehaviour4.ordinal();
                if (ordinal != 0) {
                }
                dVar = (androidx.constraintlayout.core.widgets.d) constraintWidget.W;
                ConstraintLayout constraintLayout22 = ConstraintLayout.this;
                if (dVar != null) {
                }
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 == dimensionBehaviour) {
                }
                if (dimensionBehaviour4 == dimensionBehaviour) {
                }
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour522 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour4 != dimensionBehaviour2) {
                }
                z12 = true;
                if (dimensionBehaviour3 != dimensionBehaviour2) {
                }
                z13 = true;
                if (!z10) {
                }
                z14 = false;
                if (!z11) {
                }
                z15 = false;
                if (view == null) {
                }
            }
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4407i = new SparseArray<>();
        this.f4408j = new ArrayList<>(4);
        this.f4409k = new androidx.constraintlayout.core.widgets.d();
        this.f4410l = 0;
        this.f4411m = 0;
        this.n = Integer.MAX_VALUE;
        this.f4412o = Integer.MAX_VALUE;
        this.f4413p = true;
        this.f4414q = 257;
        this.f4415r = null;
        this.f4416s = null;
        this.f4417t = -1;
        this.f4418u = new HashMap<>();
        this.f4419v = new SparseArray<>();
        this.f4420w = new b(this);
        c(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4407i = new SparseArray<>();
        this.f4408j = new ArrayList<>(4);
        this.f4409k = new androidx.constraintlayout.core.widgets.d();
        this.f4410l = 0;
        this.f4411m = 0;
        this.n = Integer.MAX_VALUE;
        this.f4412o = Integer.MAX_VALUE;
        this.f4413p = true;
        this.f4414q = 257;
        this.f4415r = null;
        this.f4416s = null;
        this.f4417t = -1;
        this.f4418u = new HashMap<>();
        this.f4419v = new SparseArray<>();
        this.f4420w = new b(this);
        c(attributeSet, i10);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static i2.d getSharedValues() {
        if (f4406x == null) {
            f4406x = new i2.d();
        }
        return f4406x;
    }

    public final ConstraintWidget b(View view) {
        if (view == this) {
            return this.f4409k;
        }
        if (view != null) {
            if (!(view.getLayoutParams() instanceof a)) {
                view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
                if (!(view.getLayoutParams() instanceof a)) {
                    return null;
                }
            }
            return ((a) view.getLayoutParams()).f4451q0;
        }
        return null;
    }

    public final void c(AttributeSet attributeSet, int i10) {
        androidx.constraintlayout.core.widgets.d dVar = this.f4409k;
        dVar.f4251i0 = this;
        b bVar = this.f4420w;
        dVar.f4339w0 = bVar;
        dVar.f4337u0.f11210f = bVar;
        this.f4407i.put(getId(), this);
        this.f4415r = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a1.c.f77o, i10, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 16) {
                    this.f4410l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4410l);
                } else if (index == 17) {
                    this.f4411m = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4411m);
                } else if (index == 14) {
                    this.n = obtainStyledAttributes.getDimensionPixelOffset(index, this.n);
                } else if (index == 15) {
                    this.f4412o = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4412o);
                } else if (index == 113) {
                    this.f4414q = obtainStyledAttributes.getInt(index, this.f4414q);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            e(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f4416s = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
                        this.f4415r = bVar2;
                        bVar2.f(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f4415r = null;
                    }
                    this.f4417t = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        dVar.F0 = this.f4414q;
        androidx.constraintlayout.core.c.f4199p = dVar.V(512);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final boolean d() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.a> arrayList = this.f4408j;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.get(i10).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i12;
                        float f11 = i13;
                        float f12 = i12 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i13 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    public void e(int i10) {
        this.f4416s = new i2.a(getContext(), this, i10);
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f4413p = true;
        super.forceLayout();
    }

    public final void g(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.f4418u == null) {
                this.f4418u = new HashMap<>();
            }
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f4418u.put(str, Integer.valueOf(num.intValue()));
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f4412o;
    }

    public int getMaxWidth() {
        return this.n;
    }

    public int getMinHeight() {
        return this.f4411m;
    }

    public int getMinWidth() {
        return this.f4410l;
    }

    public int getOptimizationLevel() {
        return this.f4409k.F0;
    }

    public String getSceneString() {
        int id;
        String str;
        StringBuilder sb = new StringBuilder();
        androidx.constraintlayout.core.widgets.d dVar = this.f4409k;
        if (dVar.f4254k == null) {
            int id2 = getId();
            if (id2 != -1) {
                str = getContext().getResources().getResourceEntryName(id2);
            } else {
                str = "parent";
            }
            dVar.f4254k = str;
        }
        if (dVar.f4255k0 == null) {
            dVar.f4255k0 = dVar.f4254k;
            Log.v("ConstraintLayout", " setDebugName " + dVar.f4255k0);
        }
        Iterator<ConstraintWidget> it = dVar.f10897s0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            View view = (View) next.f4251i0;
            if (view != null) {
                if (next.f4254k == null && (id = view.getId()) != -1) {
                    next.f4254k = getContext().getResources().getResourceEntryName(id);
                }
                if (next.f4255k0 == null) {
                    next.f4255k0 = next.f4254k;
                    Log.v("ConstraintLayout", " setDebugName " + next.f4255k0);
                }
            }
        }
        dVar.n(sb);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0552  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h() {
        int i10;
        boolean z10;
        int i11;
        androidx.constraintlayout.core.widgets.d dVar;
        boolean z11;
        int i12;
        boolean z12;
        a aVar;
        int i13;
        ConstraintAnchor.Type type;
        int i14;
        int i15;
        int i16;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        int i17;
        ConstraintAnchor.Type type2;
        int i18;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        int i19;
        ConstraintAnchor.Type type3;
        int i20;
        int i21;
        ConstraintWidget constraintWidget5;
        ConstraintWidget constraintWidget6;
        int i22;
        ConstraintAnchor.Type type4;
        int i23;
        int i24;
        ConstraintAnchor.Type type5;
        ConstraintAnchor.Type type6;
        float f10;
        ConstraintWidget constraintWidget7;
        int i25;
        int i26;
        float f11;
        int i27;
        float f12;
        int i28;
        int i29;
        float parseFloat;
        int i30;
        int i31;
        String resourceName;
        int id;
        ConstraintWidget constraintWidget8;
        ConstraintLayout constraintLayout = this;
        int childCount = getChildCount();
        int i32 = 0;
        int i33 = 0;
        while (true) {
            i10 = 1;
            if (i33 < childCount) {
                if (constraintLayout.getChildAt(i33).isLayoutRequested()) {
                    z10 = true;
                    break;
                }
                i33++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            boolean isInEditMode = isInEditMode();
            int childCount2 = getChildCount();
            for (int i34 = 0; i34 < childCount2; i34++) {
                ConstraintWidget b5 = constraintLayout.b(constraintLayout.getChildAt(i34));
                if (b5 != null) {
                    b5.C();
                }
            }
            Object obj = null;
            SparseArray<View> sparseArray = constraintLayout.f4407i;
            androidx.constraintlayout.core.widgets.d dVar2 = constraintLayout.f4409k;
            if (isInEditMode) {
                for (int i35 = 0; i35 < childCount2; i35++) {
                    View childAt = constraintLayout.getChildAt(i35);
                    try {
                        resourceName = getResources().getResourceName(childAt.getId());
                        constraintLayout.g(resourceName, Integer.valueOf(childAt.getId()));
                        int indexOf = resourceName.indexOf(47);
                        if (indexOf != -1) {
                            resourceName = resourceName.substring(indexOf + 1);
                        }
                        id = childAt.getId();
                    } catch (Resources.NotFoundException unused) {
                    }
                    if (id != 0) {
                        View view = sparseArray.get(id);
                        if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                            constraintLayout.onViewAdded(view);
                        }
                        if (view != constraintLayout) {
                            if (view == null) {
                                constraintWidget8 = null;
                            } else {
                                constraintWidget8 = ((a) view.getLayoutParams()).f4451q0;
                            }
                            constraintWidget8.f4255k0 = resourceName;
                        }
                    }
                    constraintWidget8 = dVar2;
                    constraintWidget8.f4255k0 = resourceName;
                }
            }
            if (constraintLayout.f4417t != -1) {
                for (int i36 = 0; i36 < childCount2; i36++) {
                    View childAt2 = constraintLayout.getChildAt(i36);
                    if (childAt2.getId() == constraintLayout.f4417t && (childAt2 instanceof c)) {
                        constraintLayout.f4415r = ((c) childAt2).getConstraintSet();
                    }
                }
            }
            androidx.constraintlayout.widget.b bVar = constraintLayout.f4415r;
            if (bVar != null) {
                bVar.b(constraintLayout);
            }
            dVar2.f10897s0.clear();
            ArrayList<androidx.constraintlayout.widget.a> arrayList = constraintLayout.f4408j;
            int size = arrayList.size();
            if (size > 0) {
                int i37 = 0;
                while (i37 < size) {
                    androidx.constraintlayout.widget.a aVar2 = arrayList.get(i37);
                    if (aVar2.isInEditMode()) {
                        aVar2.setIds(aVar2.f4473m);
                    }
                    f2.b bVar2 = aVar2.f4472l;
                    if (bVar2 != null) {
                        bVar2.f10896t0 = i32;
                        Arrays.fill(bVar2.f10895s0, obj);
                        int i38 = 0;
                        while (i38 < aVar2.f4470j) {
                            int i39 = aVar2.f4469i[i38];
                            View view2 = sparseArray.get(i39);
                            if (view2 == null) {
                                Integer valueOf = Integer.valueOf(i39);
                                HashMap<Integer, String> hashMap = aVar2.f4475p;
                                String str = hashMap.get(valueOf);
                                int h10 = aVar2.h(constraintLayout, str);
                                if (h10 != 0) {
                                    aVar2.f4469i[i38] = h10;
                                    hashMap.put(Integer.valueOf(h10), str);
                                    view2 = sparseArray.get(h10);
                                }
                            }
                            View view3 = view2;
                            if (view3 != null) {
                                f2.b bVar3 = aVar2.f4472l;
                                ConstraintWidget b10 = constraintLayout.b(view3);
                                bVar3.getClass();
                                if (b10 != bVar3 && b10 != null) {
                                    int i40 = bVar3.f10896t0 + i10;
                                    ConstraintWidget[] constraintWidgetArr = bVar3.f10895s0;
                                    if (i40 > constraintWidgetArr.length) {
                                        bVar3.f10895s0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
                                    }
                                    ConstraintWidget[] constraintWidgetArr2 = bVar3.f10895s0;
                                    int i41 = bVar3.f10896t0;
                                    constraintWidgetArr2[i41] = b10;
                                    bVar3.f10896t0 = i41 + 1;
                                }
                            }
                            i38++;
                            i10 = 1;
                        }
                        aVar2.f4472l.a();
                    }
                    i37++;
                    i32 = 0;
                    i10 = 1;
                    obj = null;
                }
            }
            for (int i42 = 0; i42 < childCount2; i42++) {
                View childAt3 = constraintLayout.getChildAt(i42);
                if (childAt3 instanceof e) {
                    e eVar = (e) childAt3;
                    if (eVar.f4571i == -1 && !eVar.isInEditMode()) {
                        eVar.setVisibility(eVar.f4573k);
                    }
                    View findViewById = constraintLayout.findViewById(eVar.f4571i);
                    eVar.f4572j = findViewById;
                    if (findViewById != null) {
                        ((a) findViewById.getLayoutParams()).f4430f0 = true;
                        eVar.f4572j.setVisibility(0);
                        eVar.setVisibility(0);
                    }
                }
            }
            SparseArray<ConstraintWidget> sparseArray2 = constraintLayout.f4419v;
            sparseArray2.clear();
            sparseArray2.put(0, dVar2);
            sparseArray2.put(getId(), dVar2);
            for (int i43 = 0; i43 < childCount2; i43++) {
                View childAt4 = constraintLayout.getChildAt(i43);
                sparseArray2.put(childAt4.getId(), constraintLayout.b(childAt4));
            }
            int i44 = 0;
            while (i44 < childCount2) {
                View childAt5 = constraintLayout.getChildAt(i44);
                ConstraintWidget b11 = constraintLayout.b(childAt5);
                if (b11 != null) {
                    a aVar3 = (a) childAt5.getLayoutParams();
                    dVar2.f10897s0.add(b11);
                    ConstraintWidget constraintWidget9 = b11.W;
                    if (constraintWidget9 != null) {
                        ((f2.c) constraintWidget9).f10897s0.remove(b11);
                        b11.C();
                    }
                    b11.W = dVar2;
                    aVar3.a();
                    b11.f4253j0 = childAt5.getVisibility();
                    if (aVar3.f4430f0) {
                        b11.G = true;
                        b11.f4253j0 = 8;
                    }
                    b11.f4251i0 = childAt5;
                    if (childAt5 instanceof androidx.constraintlayout.widget.a) {
                        ((androidx.constraintlayout.widget.a) childAt5).j(b11, dVar2.f4340x0);
                    }
                    if (aVar3.f4426d0) {
                        f fVar = (f) b11;
                        int i45 = aVar3.f4445n0;
                        int i46 = aVar3.f4447o0;
                        float f13 = aVar3.f4449p0;
                        int i47 = (f13 > (-1.0f) ? 1 : (f13 == (-1.0f) ? 0 : -1));
                        if (i47 != 0) {
                            if (i47 > 0) {
                                fVar.f4363s0 = f13;
                                fVar.f4364t0 = -1;
                                fVar.f4365u0 = -1;
                            }
                        } else if (i45 != -1) {
                            if (i45 > -1) {
                                fVar.f4363s0 = -1.0f;
                                fVar.f4364t0 = i45;
                                fVar.f4365u0 = -1;
                            }
                        } else if (i46 != -1 && i46 > -1) {
                            fVar.f4363s0 = -1.0f;
                            fVar.f4364t0 = -1;
                            fVar.f4365u0 = i46;
                        }
                    } else {
                        int i48 = aVar3.f4432g0;
                        int i49 = aVar3.f4434h0;
                        int i50 = aVar3.f4436i0;
                        int i51 = aVar3.f4438j0;
                        int i52 = aVar3.f4440k0;
                        int i53 = aVar3.f4442l0;
                        float f14 = aVar3.f4444m0;
                        i11 = childCount2;
                        int i54 = aVar3.f4448p;
                        dVar = dVar2;
                        ConstraintAnchor.Type type7 = ConstraintAnchor.Type.RIGHT;
                        z11 = z10;
                        ConstraintAnchor.Type type8 = ConstraintAnchor.Type.LEFT;
                        i12 = i44;
                        ConstraintAnchor.Type type9 = ConstraintAnchor.Type.BOTTOM;
                        z12 = isInEditMode;
                        ConstraintAnchor.Type type10 = ConstraintAnchor.Type.TOP;
                        if (i54 != -1) {
                            ConstraintWidget constraintWidget10 = sparseArray2.get(i54);
                            if (constraintWidget10 != null) {
                                float f15 = aVar3.f4452r;
                                int i55 = aVar3.f4450q;
                                ConstraintAnchor.Type type11 = ConstraintAnchor.Type.CENTER;
                                aVar = aVar3;
                                b11.v(type11, constraintWidget10, type11, i55, 0);
                                b11.E = f15;
                            } else {
                                aVar = aVar3;
                            }
                        } else {
                            aVar = aVar3;
                            if (i48 != -1) {
                                ConstraintWidget constraintWidget11 = sparseArray2.get(i48);
                                if (constraintWidget11 != null) {
                                    ConstraintWidget constraintWidget12 = constraintWidget11;
                                    i13 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                                    type = type8;
                                    i14 = i53;
                                    ConstraintWidget constraintWidget13 = constraintWidget12;
                                    i15 = i51;
                                    ConstraintAnchor.Type type12 = type;
                                    i16 = i50;
                                    b11.v(type8, constraintWidget13, type12, i13, i52);
                                }
                                i14 = i53;
                                i15 = i51;
                                i16 = i50;
                            } else {
                                if (i49 != -1 && (constraintWidget12 = sparseArray2.get(i49)) != null) {
                                    i13 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                                    type = type7;
                                    i14 = i53;
                                    ConstraintWidget constraintWidget132 = constraintWidget12;
                                    i15 = i51;
                                    ConstraintAnchor.Type type122 = type;
                                    i16 = i50;
                                    b11.v(type8, constraintWidget132, type122, i13, i52);
                                }
                                i14 = i53;
                                i15 = i51;
                                i16 = i50;
                            }
                            if (i16 != -1) {
                                ConstraintWidget constraintWidget14 = sparseArray2.get(i16);
                                if (constraintWidget14 != null) {
                                    constraintWidget2 = constraintWidget14;
                                    type2 = type8;
                                    i17 = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                                    b11.v(type7, constraintWidget2, type2, i17, i14);
                                }
                                i18 = aVar.f4435i;
                                if (i18 == -1) {
                                    ConstraintWidget constraintWidget15 = sparseArray2.get(i18);
                                    if (constraintWidget15 != null) {
                                        constraintWidget4 = constraintWidget15;
                                        type3 = type10;
                                        i19 = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                                        i20 = aVar.f4458x;
                                        b11.v(type10, constraintWidget4, type3, i19, i20);
                                    }
                                    i21 = aVar.f4439k;
                                    if (i21 == -1) {
                                        ConstraintWidget constraintWidget16 = sparseArray2.get(i21);
                                        if (constraintWidget16 != null) {
                                            constraintWidget6 = constraintWidget16;
                                            type4 = type10;
                                            i22 = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                                            i23 = aVar.f4460z;
                                            b11.v(type9, constraintWidget6, type4, i22, i23);
                                        }
                                        i24 = aVar.f4443m;
                                        type5 = ConstraintAnchor.Type.BASELINE;
                                        if (i24 == -1) {
                                            type6 = type5;
                                        } else {
                                            i24 = aVar.n;
                                            if (i24 != -1) {
                                                type6 = type10;
                                            } else {
                                                i24 = aVar.f4446o;
                                                if (i24 != -1) {
                                                    type6 = type9;
                                                }
                                                if (f14 >= 0.0f) {
                                                    b11.f4247g0 = f14;
                                                }
                                                f10 = aVar.F;
                                                if (f10 >= 0.0f) {
                                                    b11.f4249h0 = f10;
                                                }
                                            }
                                        }
                                        View view4 = sparseArray.get(i24);
                                        constraintWidget7 = sparseArray2.get(i24);
                                        if (constraintWidget7 != null && view4 != null && (view4.getLayoutParams() instanceof a)) {
                                            aVar.c0 = true;
                                            if (type6 == type5) {
                                                a aVar4 = (a) view4.getLayoutParams();
                                                aVar4.c0 = true;
                                                aVar4.f4451q0.F = true;
                                            }
                                            b11.j(type5).b(constraintWidget7.j(type6), aVar.D, aVar.C, true);
                                            b11.F = true;
                                            b11.j(type10).j();
                                            b11.j(type9).j();
                                        }
                                        if (f14 >= 0.0f) {
                                        }
                                        f10 = aVar.F;
                                        if (f10 >= 0.0f) {
                                        }
                                    } else {
                                        int i56 = aVar.f4441l;
                                        if (i56 != -1 && (constraintWidget5 = sparseArray2.get(i56)) != null) {
                                            constraintWidget6 = constraintWidget5;
                                            i22 = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                                            type4 = type9;
                                            i23 = aVar.f4460z;
                                            b11.v(type9, constraintWidget6, type4, i22, i23);
                                        }
                                        i24 = aVar.f4443m;
                                        type5 = ConstraintAnchor.Type.BASELINE;
                                        if (i24 == -1) {
                                        }
                                        View view42 = sparseArray.get(i24);
                                        constraintWidget7 = sparseArray2.get(i24);
                                        if (constraintWidget7 != null) {
                                            aVar.c0 = true;
                                            if (type6 == type5) {
                                            }
                                            b11.j(type5).b(constraintWidget7.j(type6), aVar.D, aVar.C, true);
                                            b11.F = true;
                                            b11.j(type10).j();
                                            b11.j(type9).j();
                                        }
                                        if (f14 >= 0.0f) {
                                        }
                                        f10 = aVar.F;
                                        if (f10 >= 0.0f) {
                                        }
                                    }
                                } else {
                                    int i57 = aVar.f4437j;
                                    if (i57 != -1 && (constraintWidget3 = sparseArray2.get(i57)) != null) {
                                        constraintWidget4 = constraintWidget3;
                                        i19 = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                                        type3 = type9;
                                        i20 = aVar.f4458x;
                                        b11.v(type10, constraintWidget4, type3, i19, i20);
                                    }
                                    i21 = aVar.f4439k;
                                    if (i21 == -1) {
                                    }
                                }
                            } else {
                                if (i15 != -1 && (constraintWidget = sparseArray2.get(i15)) != null) {
                                    constraintWidget2 = constraintWidget;
                                    i17 = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                                    type2 = type7;
                                    b11.v(type7, constraintWidget2, type2, i17, i14);
                                }
                                i18 = aVar.f4435i;
                                if (i18 == -1) {
                                }
                            }
                        }
                        if (z12 && ((i31 = aVar.T) != -1 || aVar.U != -1)) {
                            int i58 = aVar.U;
                            b11.f4239b0 = i31;
                            b11.c0 = i58;
                        }
                        boolean z13 = aVar.f4422a0;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (!z13) {
                            if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                                if (aVar.W) {
                                    b11.L(dimensionBehaviour4);
                                } else {
                                    b11.L(dimensionBehaviour);
                                }
                                b11.j(type8).f4225g = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                                b11.j(type7).f4225g = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                            } else {
                                b11.L(dimensionBehaviour4);
                                b11.N(0);
                            }
                        } else {
                            b11.L(dimensionBehaviour3);
                            b11.N(((ViewGroup.MarginLayoutParams) aVar).width);
                            if (((ViewGroup.MarginLayoutParams) aVar).width == -2) {
                                b11.L(dimensionBehaviour2);
                            }
                        }
                        if (!aVar.f4424b0) {
                            if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                                if (aVar.X) {
                                    b11.M(dimensionBehaviour4);
                                } else {
                                    b11.M(dimensionBehaviour);
                                }
                                b11.j(type10).f4225g = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                                b11.j(type9).f4225g = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                            } else {
                                b11.M(dimensionBehaviour4);
                                b11.K(0);
                            }
                        } else {
                            b11.M(dimensionBehaviour3);
                            b11.K(((ViewGroup.MarginLayoutParams) aVar).height);
                            if (((ViewGroup.MarginLayoutParams) aVar).height == -2) {
                                b11.M(dimensionBehaviour2);
                            }
                        }
                        String str2 = aVar.G;
                        if (str2 != null && str2.length() != 0) {
                            int length = str2.length();
                            int indexOf2 = str2.indexOf(44);
                            if (indexOf2 > 0 && indexOf2 < length - 1) {
                                String substring = str2.substring(0, indexOf2);
                                if (substring.equalsIgnoreCase("W")) {
                                    i30 = 0;
                                } else if (substring.equalsIgnoreCase("H")) {
                                    i30 = 1;
                                } else {
                                    i30 = -1;
                                }
                                int i59 = i30;
                                i29 = indexOf2 + 1;
                                i28 = i59;
                            } else {
                                i28 = -1;
                                i29 = 0;
                            }
                            int indexOf3 = str2.indexOf(58);
                            if (indexOf3 >= 0 && indexOf3 < length - 1) {
                                String substring2 = str2.substring(i29, indexOf3);
                                String substring3 = str2.substring(indexOf3 + 1);
                                if (substring2.length() > 0 && substring3.length() > 0) {
                                    try {
                                        float parseFloat2 = Float.parseFloat(substring2);
                                        float parseFloat3 = Float.parseFloat(substring3);
                                        if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                            if (i28 == 1) {
                                                parseFloat = Math.abs(parseFloat3 / parseFloat2);
                                            } else {
                                                parseFloat = Math.abs(parseFloat2 / parseFloat3);
                                            }
                                        }
                                    } catch (NumberFormatException unused2) {
                                    }
                                }
                                parseFloat = 0.0f;
                            } else {
                                String substring4 = str2.substring(i29);
                                if (substring4.length() > 0) {
                                    parseFloat = Float.parseFloat(substring4);
                                }
                                parseFloat = 0.0f;
                            }
                            if (parseFloat > 0.0f) {
                                b11.Z = parseFloat;
                                b11.f4237a0 = i28;
                            }
                            float f16 = aVar.H;
                            float[] fArr = b11.f4260n0;
                            fArr[0] = f16;
                            fArr[1] = aVar.I;
                            b11.f4257l0 = aVar.J;
                            b11.f4259m0 = aVar.K;
                            i25 = aVar.Z;
                            if (i25 >= 0 && i25 <= 3) {
                                b11.f4267r = i25;
                            }
                            int i60 = aVar.L;
                            int i61 = aVar.N;
                            i26 = aVar.P;
                            f11 = aVar.R;
                            b11.f4269s = i60;
                            b11.f4272v = i61;
                            if (i26 == Integer.MAX_VALUE) {
                                i26 = 0;
                            }
                            b11.f4273w = i26;
                            b11.f4274x = f11;
                            if (f11 > 0.0f && f11 < 1.0f && i60 == 0) {
                                b11.f4269s = 2;
                            }
                            int i62 = aVar.M;
                            int i63 = aVar.O;
                            i27 = aVar.Q;
                            f12 = aVar.S;
                            b11.f4270t = i62;
                            b11.f4275y = i63;
                            if (i27 == Integer.MAX_VALUE) {
                                i27 = 0;
                            }
                            b11.f4276z = i27;
                            b11.A = f12;
                            if (f12 <= 0.0f && f12 < 1.0f && i62 == 0) {
                                b11.f4270t = 2;
                            }
                            constraintLayout = this;
                            i44 = i12 + 1;
                            childCount2 = i11;
                            dVar2 = dVar;
                            z10 = z11;
                            isInEditMode = z12;
                        }
                        b11.Z = 0.0f;
                        float f162 = aVar.H;
                        float[] fArr2 = b11.f4260n0;
                        fArr2[0] = f162;
                        fArr2[1] = aVar.I;
                        b11.f4257l0 = aVar.J;
                        b11.f4259m0 = aVar.K;
                        i25 = aVar.Z;
                        if (i25 >= 0) {
                            b11.f4267r = i25;
                        }
                        int i602 = aVar.L;
                        int i612 = aVar.N;
                        i26 = aVar.P;
                        f11 = aVar.R;
                        b11.f4269s = i602;
                        b11.f4272v = i612;
                        if (i26 == Integer.MAX_VALUE) {
                        }
                        b11.f4273w = i26;
                        b11.f4274x = f11;
                        if (f11 > 0.0f) {
                            b11.f4269s = 2;
                        }
                        int i622 = aVar.M;
                        int i632 = aVar.O;
                        i27 = aVar.Q;
                        f12 = aVar.S;
                        b11.f4270t = i622;
                        b11.f4275y = i632;
                        if (i27 == Integer.MAX_VALUE) {
                        }
                        b11.f4276z = i27;
                        b11.A = f12;
                        if (f12 <= 0.0f) {
                        }
                        constraintLayout = this;
                        i44 = i12 + 1;
                        childCount2 = i11;
                        dVar2 = dVar;
                        z10 = z11;
                        isInEditMode = z12;
                    }
                }
                z11 = z10;
                z12 = isInEditMode;
                i11 = childCount2;
                i12 = i44;
                dVar = dVar2;
                constraintLayout = this;
                i44 = i12 + 1;
                childCount2 = i11;
                dVar2 = dVar;
                z10 = z11;
                isInEditMode = z12;
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            a aVar = (a) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = aVar.f4451q0;
            if ((childAt.getVisibility() != 8 || aVar.f4426d0 || aVar.f4428e0 || isInEditMode) && !aVar.f4430f0) {
                int r3 = constraintWidget.r();
                int s10 = constraintWidget.s();
                int q10 = constraintWidget.q() + r3;
                int l2 = constraintWidget.l() + s10;
                childAt.layout(r3, s10, q10, l2);
                if ((childAt instanceof e) && (content = ((e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(r3, s10, q10, l2);
                }
            }
        }
        ArrayList<androidx.constraintlayout.widget.a> arrayList = this.f4408j;
        int size = arrayList.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                arrayList.get(i15).getClass();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x02b8, code lost:
        r18 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02c0, code lost:
        if (r18.hasNext() == false) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02cc, code lost:
        if (r18.next().k() != false) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02ce, code lost:
        r8 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x031d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0342 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0185  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i10, int i11) {
        int i12;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        int i13;
        int i14;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        int q10;
        g2.e eVar;
        int i15;
        int i16;
        int size;
        boolean b5;
        boolean z10;
        boolean z11;
        boolean z12;
        b.InterfaceC0121b interfaceC0121b;
        boolean z13;
        int i17;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        int i18;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        g2.b bVar;
        boolean z14;
        int i19;
        g2.b bVar2;
        int size2;
        int i20;
        int i21;
        char c;
        int i22;
        androidx.constraintlayout.core.widgets.d dVar;
        boolean z15;
        boolean z16;
        ConstraintAnchor.Type type;
        ConstraintAnchor.Type type2;
        ArrayList<ConstraintWidget> arrayList;
        int i23;
        androidx.constraintlayout.core.widgets.d dVar2;
        int i24;
        int i25;
        b.InterfaceC0121b interfaceC0121b2;
        boolean z17;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7;
        boolean z18;
        g2.b bVar3;
        androidx.constraintlayout.core.widgets.analyzer.c cVar;
        androidx.constraintlayout.core.widgets.analyzer.d dVar3;
        boolean z19;
        boolean z20;
        g2.e eVar2;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z21;
        boolean z22;
        int i30;
        ConstraintWidget.DimensionBehaviour k3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour8;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour9;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour10;
        boolean z23;
        Iterator<WidgetRun> it;
        Iterator<WidgetRun> it2;
        boolean z24;
        boolean z25;
        boolean z26;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour12;
        if (!this.f4413p) {
            int childCount = getChildCount();
            int i31 = 0;
            while (true) {
                if (i31 >= childCount) {
                    break;
                } else if (getChildAt(i31).isLayoutRequested()) {
                    this.f4413p = true;
                    break;
                } else {
                    i31++;
                }
            }
        }
        boolean d5 = d();
        androidx.constraintlayout.core.widgets.d dVar4 = this.f4409k;
        dVar4.f4340x0 = d5;
        boolean z27 = this.f4413p;
        g2.b bVar4 = dVar4.f4336t0;
        if (z27) {
            this.f4413p = false;
            if (h()) {
                bVar4.c(dVar4);
            }
        }
        int i32 = this.f4414q;
        int mode = View.MeasureSpec.getMode(i10);
        int size3 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size4 = View.MeasureSpec.getSize(i11);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i33 = max + max2;
        int paddingWidth = getPaddingWidth();
        b bVar5 = this.f4420w;
        bVar5.f4463b = max;
        bVar5.c = max2;
        bVar5.f4464d = paddingWidth;
        bVar5.f4465e = i33;
        bVar5.f4466f = i10;
        bVar5.f4467g = i11;
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            max3 = Math.max(0, getPaddingLeft());
            int i34 = size3 - paddingWidth;
            int i35 = size4 - i33;
            int i36 = bVar5.f4465e;
            int i37 = bVar5.f4464d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = ConstraintWidget.DimensionBehaviour.FIXED;
            int childCount2 = getChildCount();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (mode == Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode != 1073741824) {
                        dimensionBehaviour12 = dimensionBehaviour13;
                    } else {
                        i12 = Math.min(this.n - i37, i34);
                        dimensionBehaviour = dimensionBehaviour13;
                        dimensionBehaviour2 = dimensionBehaviour14;
                        if (mode2 != Integer.MIN_VALUE) {
                            if (mode2 != 0) {
                                if (mode2 != 1073741824) {
                                    dimensionBehaviour11 = dimensionBehaviour13;
                                } else {
                                    i13 = Math.min(this.f4412o - i36, i35);
                                    i14 = i35;
                                    dimensionBehaviour3 = dimensionBehaviour13;
                                    q10 = dVar4.q();
                                    eVar = dVar4.f4337u0;
                                    if (i12 == q10 || i13 != dVar4.l()) {
                                        eVar.c = true;
                                    }
                                    dVar4.f4239b0 = 0;
                                    dVar4.c0 = 0;
                                    int[] iArr = dVar4.D;
                                    iArr[0] = this.n - i37;
                                    iArr[1] = this.f4412o - i36;
                                    dVar4.f4243e0 = 0;
                                    dVar4.f4245f0 = 0;
                                    dVar4.L(dimensionBehaviour);
                                    dVar4.N(i12);
                                    dVar4.M(dimensionBehaviour3);
                                    dVar4.K(i13);
                                    i15 = this.f4410l - i37;
                                    if (i15 < 0) {
                                        i15 = 0;
                                    }
                                    dVar4.f4243e0 = i15;
                                    i16 = this.f4411m - i36;
                                    if (i16 < 0) {
                                        i16 = 0;
                                    }
                                    dVar4.f4245f0 = i16;
                                    dVar4.f4342z0 = max3;
                                    dVar4.A0 = max;
                                    bVar4.getClass();
                                    b.InterfaceC0121b interfaceC0121b3 = dVar4.f4339w0;
                                    size = dVar4.f10897s0.size();
                                    int q11 = dVar4.q();
                                    int l2 = dVar4.l();
                                    b5 = g.b(i32, 128);
                                    if (!b5 && !g.b(i32, 64)) {
                                        z10 = false;
                                        ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                                        if (z10) {
                                            for (int i38 = 0; i38 < size; i38++) {
                                                ConstraintWidget constraintWidget = dVar4.f10897s0.get(i38);
                                                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
                                                if (dimensionBehaviourArr[0] == dimensionBehaviour15) {
                                                    z24 = true;
                                                } else {
                                                    z24 = false;
                                                }
                                                if (dimensionBehaviourArr[1] == dimensionBehaviour15) {
                                                    z25 = true;
                                                } else {
                                                    z25 = false;
                                                }
                                                if (z24 && z25 && constraintWidget.Z > 0.0f) {
                                                    z26 = true;
                                                } else {
                                                    z26 = false;
                                                }
                                                if ((!constraintWidget.x() || !z26) && ((!constraintWidget.y() || !z26) && !(constraintWidget instanceof h) && !constraintWidget.x() && !constraintWidget.y())) {
                                                }
                                                z10 = false;
                                                break;
                                            }
                                        }
                                        if ((mode != 1073741824 && mode2 == 1073741824) || b5) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        z12 = z10 & z11;
                                        if (!z12) {
                                            int min = Math.min(iArr[0], i34);
                                            int min2 = Math.min(iArr[1], i14);
                                            if (mode == 1073741824 && dVar4.q() != min) {
                                                dVar4.N(min);
                                                eVar2 = eVar;
                                                eVar2.f11207b = true;
                                            } else {
                                                eVar2 = eVar;
                                            }
                                            if (mode2 == 1073741824 && dVar4.l() != min2) {
                                                dVar4.K(min2);
                                                eVar2.f11207b = true;
                                            }
                                            if (mode == 1073741824 && mode2 == 1073741824) {
                                                boolean z28 = b5 & true;
                                                boolean z29 = eVar2.f11207b;
                                                androidx.constraintlayout.core.widgets.d dVar5 = eVar2.f11206a;
                                                if (!z29 && !eVar2.c) {
                                                    i30 = 0;
                                                    eVar2.b(eVar2.f11208d);
                                                    dVar5.f4239b0 = i30;
                                                    dVar5.c0 = i30;
                                                    k3 = dVar5.k(i30);
                                                    ConstraintWidget.DimensionBehaviour k10 = dVar5.k(1);
                                                    if (eVar2.f11207b) {
                                                        eVar2.c();
                                                    }
                                                    int r3 = dVar5.r();
                                                    z13 = z12;
                                                    int s10 = dVar5.s();
                                                    interfaceC0121b = interfaceC0121b3;
                                                    dVar5.f4240d.f4311h.d(r3);
                                                    dVar5.f4242e.f4311h.d(s10);
                                                    eVar2.g();
                                                    ArrayList<WidgetRun> arrayList2 = eVar2.f11209e;
                                                    i17 = q11;
                                                    dimensionBehaviour8 = dimensionBehaviour2;
                                                    if (k3 != dimensionBehaviour8 && k10 != dimensionBehaviour8) {
                                                        i18 = l2;
                                                        dimensionBehaviour4 = dimensionBehaviour15;
                                                        dimensionBehaviour6 = dimensionBehaviour13;
                                                        bVar = bVar4;
                                                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = dVar5.V;
                                                        dimensionBehaviour9 = dimensionBehaviourArr2[0];
                                                        ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                                                        if (dimensionBehaviour9 != dimensionBehaviour6 && dimensionBehaviour9 != dimensionBehaviour16) {
                                                            z23 = false;
                                                            dimensionBehaviour5 = dimensionBehaviour8;
                                                            it = arrayList2.iterator();
                                                            while (it.hasNext()) {
                                                                WidgetRun next = it.next();
                                                                if (next.f4306b != dVar5 || next.f4310g) {
                                                                    next.e();
                                                                }
                                                            }
                                                            it2 = arrayList2.iterator();
                                                            while (it2.hasNext()) {
                                                                WidgetRun next2 = it2.next();
                                                                if (z23 || next2.f4306b != dVar5) {
                                                                    if (next2.f4311h.f4294j) {
                                                                        if (!next2.f4312i.f4294j) {
                                                                            if (!(next2 instanceof g2.h)) {
                                                                            }
                                                                        }
                                                                        if (!next2.f4308e.f4294j && !(next2 instanceof g2.c) && !(next2 instanceof g2.h)) {
                                                                        }
                                                                    }
                                                                    z14 = false;
                                                                    break;
                                                                }
                                                            }
                                                            z14 = true;
                                                            dVar5.L(k3);
                                                            dVar5.M(k10);
                                                            i27 = 1073741824;
                                                            i19 = 2;
                                                        }
                                                        int q12 = dVar5.q() + r3;
                                                        dimensionBehaviour5 = dimensionBehaviour8;
                                                        dVar5.f4240d.f4312i.d(q12);
                                                        dVar5.f4240d.f4308e.d(q12 - r3);
                                                        eVar2.g();
                                                        dimensionBehaviour10 = dimensionBehaviourArr2[1];
                                                        if (dimensionBehaviour10 != dimensionBehaviour6 || dimensionBehaviour10 == dimensionBehaviour16) {
                                                            int l4 = dVar5.l() + s10;
                                                            dVar5.f4242e.f4312i.d(l4);
                                                            dVar5.f4242e.f4308e.d(l4 - s10);
                                                        }
                                                        eVar2.g();
                                                        z23 = true;
                                                        it = arrayList2.iterator();
                                                        while (it.hasNext()) {
                                                        }
                                                        it2 = arrayList2.iterator();
                                                        while (it2.hasNext()) {
                                                        }
                                                        z14 = true;
                                                        dVar5.L(k3);
                                                        dVar5.M(k10);
                                                        i27 = 1073741824;
                                                        i19 = 2;
                                                    }
                                                    if (!z28 && k3 == dimensionBehaviour8) {
                                                        i18 = l2;
                                                        dimensionBehaviour6 = dimensionBehaviour13;
                                                        dVar5.L(dimensionBehaviour6);
                                                        bVar = bVar4;
                                                        dVar5.N(eVar2.d(dVar5, 0));
                                                        dimensionBehaviour4 = dimensionBehaviour15;
                                                        dVar5.f4240d.f4308e.d(dVar5.q());
                                                    } else {
                                                        i18 = l2;
                                                        dimensionBehaviour4 = dimensionBehaviour15;
                                                        dimensionBehaviour6 = dimensionBehaviour13;
                                                        bVar = bVar4;
                                                    }
                                                    if (z28 && k10 == dimensionBehaviour8) {
                                                        dVar5.M(dimensionBehaviour6);
                                                        dVar5.K(eVar2.d(dVar5, 1));
                                                        dVar5.f4242e.f4308e.d(dVar5.l());
                                                    }
                                                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr22 = dVar5.V;
                                                    dimensionBehaviour9 = dimensionBehaviourArr22[0];
                                                    ConstraintWidget.DimensionBehaviour dimensionBehaviour162 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                                                    if (dimensionBehaviour9 != dimensionBehaviour6) {
                                                        z23 = false;
                                                        dimensionBehaviour5 = dimensionBehaviour8;
                                                        it = arrayList2.iterator();
                                                        while (it.hasNext()) {
                                                        }
                                                        it2 = arrayList2.iterator();
                                                        while (it2.hasNext()) {
                                                        }
                                                        z14 = true;
                                                        dVar5.L(k3);
                                                        dVar5.M(k10);
                                                        i27 = 1073741824;
                                                        i19 = 2;
                                                    }
                                                    int q122 = dVar5.q() + r3;
                                                    dimensionBehaviour5 = dimensionBehaviour8;
                                                    dVar5.f4240d.f4312i.d(q122);
                                                    dVar5.f4240d.f4308e.d(q122 - r3);
                                                    eVar2.g();
                                                    dimensionBehaviour10 = dimensionBehaviourArr22[1];
                                                    if (dimensionBehaviour10 != dimensionBehaviour6) {
                                                    }
                                                    int l42 = dVar5.l() + s10;
                                                    dVar5.f4242e.f4312i.d(l42);
                                                    dVar5.f4242e.f4308e.d(l42 - s10);
                                                    eVar2.g();
                                                    z23 = true;
                                                    it = arrayList2.iterator();
                                                    while (it.hasNext()) {
                                                    }
                                                    it2 = arrayList2.iterator();
                                                    while (it2.hasNext()) {
                                                    }
                                                    z14 = true;
                                                    dVar5.L(k3);
                                                    dVar5.M(k10);
                                                    i27 = 1073741824;
                                                    i19 = 2;
                                                }
                                                for (Iterator<ConstraintWidget> it3 = dVar5.f10897s0.iterator(); it3.hasNext(); it3 = it3) {
                                                    ConstraintWidget next3 = it3.next();
                                                    next3.i();
                                                    next3.f4236a = false;
                                                    next3.f4240d.n();
                                                    next3.f4242e.m();
                                                }
                                                dVar5.i();
                                                i30 = 0;
                                                dVar5.f4236a = false;
                                                dVar5.f4240d.n();
                                                dVar5.f4242e.m();
                                                eVar2.c = false;
                                                eVar2.b(eVar2.f11208d);
                                                dVar5.f4239b0 = i30;
                                                dVar5.c0 = i30;
                                                k3 = dVar5.k(i30);
                                                ConstraintWidget.DimensionBehaviour k102 = dVar5.k(1);
                                                if (eVar2.f11207b) {
                                                }
                                                int r32 = dVar5.r();
                                                z13 = z12;
                                                int s102 = dVar5.s();
                                                interfaceC0121b = interfaceC0121b3;
                                                dVar5.f4240d.f4311h.d(r32);
                                                dVar5.f4242e.f4311h.d(s102);
                                                eVar2.g();
                                                ArrayList<WidgetRun> arrayList22 = eVar2.f11209e;
                                                i17 = q11;
                                                dimensionBehaviour8 = dimensionBehaviour2;
                                                if (k3 != dimensionBehaviour8) {
                                                    i18 = l2;
                                                    dimensionBehaviour4 = dimensionBehaviour15;
                                                    dimensionBehaviour6 = dimensionBehaviour13;
                                                    bVar = bVar4;
                                                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr222 = dVar5.V;
                                                    dimensionBehaviour9 = dimensionBehaviourArr222[0];
                                                    ConstraintWidget.DimensionBehaviour dimensionBehaviour1622 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                                                    if (dimensionBehaviour9 != dimensionBehaviour6) {
                                                    }
                                                    int q1222 = dVar5.q() + r32;
                                                    dimensionBehaviour5 = dimensionBehaviour8;
                                                    dVar5.f4240d.f4312i.d(q1222);
                                                    dVar5.f4240d.f4308e.d(q1222 - r32);
                                                    eVar2.g();
                                                    dimensionBehaviour10 = dimensionBehaviourArr222[1];
                                                    if (dimensionBehaviour10 != dimensionBehaviour6) {
                                                    }
                                                    int l422 = dVar5.l() + s102;
                                                    dVar5.f4242e.f4312i.d(l422);
                                                    dVar5.f4242e.f4308e.d(l422 - s102);
                                                    eVar2.g();
                                                    z23 = true;
                                                    it = arrayList22.iterator();
                                                    while (it.hasNext()) {
                                                    }
                                                    it2 = arrayList22.iterator();
                                                    while (it2.hasNext()) {
                                                    }
                                                    z14 = true;
                                                    dVar5.L(k3);
                                                    dVar5.M(k102);
                                                    i27 = 1073741824;
                                                    i19 = 2;
                                                }
                                                if (!z28) {
                                                }
                                                i18 = l2;
                                                dimensionBehaviour4 = dimensionBehaviour15;
                                                dimensionBehaviour6 = dimensionBehaviour13;
                                                bVar = bVar4;
                                                if (z28) {
                                                    dVar5.M(dimensionBehaviour6);
                                                    dVar5.K(eVar2.d(dVar5, 1));
                                                    dVar5.f4242e.f4308e.d(dVar5.l());
                                                }
                                                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2222 = dVar5.V;
                                                dimensionBehaviour9 = dimensionBehaviourArr2222[0];
                                                ConstraintWidget.DimensionBehaviour dimensionBehaviour16222 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                                                if (dimensionBehaviour9 != dimensionBehaviour6) {
                                                }
                                                int q12222 = dVar5.q() + r32;
                                                dimensionBehaviour5 = dimensionBehaviour8;
                                                dVar5.f4240d.f4312i.d(q12222);
                                                dVar5.f4240d.f4308e.d(q12222 - r32);
                                                eVar2.g();
                                                dimensionBehaviour10 = dimensionBehaviourArr2222[1];
                                                if (dimensionBehaviour10 != dimensionBehaviour6) {
                                                }
                                                int l4222 = dVar5.l() + s102;
                                                dVar5.f4242e.f4312i.d(l4222);
                                                dVar5.f4242e.f4308e.d(l4222 - s102);
                                                eVar2.g();
                                                z23 = true;
                                                it = arrayList22.iterator();
                                                while (it.hasNext()) {
                                                }
                                                it2 = arrayList22.iterator();
                                                while (it2.hasNext()) {
                                                }
                                                z14 = true;
                                                dVar5.L(k3);
                                                dVar5.M(k102);
                                                i27 = 1073741824;
                                                i19 = 2;
                                            } else {
                                                interfaceC0121b = interfaceC0121b3;
                                                z13 = z12;
                                                i17 = q11;
                                                dimensionBehaviour4 = dimensionBehaviour15;
                                                dimensionBehaviour5 = dimensionBehaviour2;
                                                i18 = l2;
                                                dimensionBehaviour6 = dimensionBehaviour13;
                                                bVar = bVar4;
                                                boolean z30 = eVar2.f11207b;
                                                androidx.constraintlayout.core.widgets.d dVar6 = eVar2.f11206a;
                                                if (z30) {
                                                    Iterator<ConstraintWidget> it4 = dVar6.f10897s0.iterator();
                                                    while (it4.hasNext()) {
                                                        ConstraintWidget next4 = it4.next();
                                                        next4.i();
                                                        next4.f4236a = false;
                                                        androidx.constraintlayout.core.widgets.analyzer.c cVar2 = next4.f4240d;
                                                        cVar2.f4308e.f4294j = false;
                                                        cVar2.f4310g = false;
                                                        cVar2.n();
                                                        androidx.constraintlayout.core.widgets.analyzer.d dVar7 = next4.f4242e;
                                                        dVar7.f4308e.f4294j = false;
                                                        dVar7.f4310g = false;
                                                        dVar7.m();
                                                    }
                                                    i26 = 0;
                                                    dVar6.i();
                                                    dVar6.f4236a = false;
                                                    androidx.constraintlayout.core.widgets.analyzer.c cVar3 = dVar6.f4240d;
                                                    cVar3.f4308e.f4294j = false;
                                                    cVar3.f4310g = false;
                                                    cVar3.n();
                                                    androidx.constraintlayout.core.widgets.analyzer.d dVar8 = dVar6.f4242e;
                                                    dVar8.f4308e.f4294j = false;
                                                    dVar8.f4310g = false;
                                                    dVar8.m();
                                                    eVar2.c();
                                                } else {
                                                    i26 = 0;
                                                }
                                                eVar2.b(eVar2.f11208d);
                                                dVar6.f4239b0 = i26;
                                                dVar6.c0 = i26;
                                                dVar6.f4240d.f4311h.d(i26);
                                                dVar6.f4242e.f4311h.d(i26);
                                                i27 = 1073741824;
                                                if (mode == 1073741824) {
                                                    i28 = 1;
                                                    z14 = dVar4.T(i26, b5) & true;
                                                    i29 = 1;
                                                } else {
                                                    i28 = 1;
                                                    z14 = true;
                                                    i29 = 0;
                                                }
                                                if (mode2 == 1073741824) {
                                                    z14 &= dVar4.T(i28, b5);
                                                    i19 = i29 + 1;
                                                } else {
                                                    i19 = i29;
                                                }
                                            }
                                            if (z14) {
                                                if (mode == i27) {
                                                    z21 = true;
                                                } else {
                                                    z21 = false;
                                                }
                                                if (mode2 == i27) {
                                                    z22 = true;
                                                } else {
                                                    z22 = false;
                                                }
                                                dVar4.O(z21, z22);
                                            }
                                        } else {
                                            interfaceC0121b = interfaceC0121b3;
                                            z13 = z12;
                                            i17 = q11;
                                            dimensionBehaviour4 = dimensionBehaviour15;
                                            dimensionBehaviour5 = dimensionBehaviour2;
                                            i18 = l2;
                                            dimensionBehaviour6 = dimensionBehaviour13;
                                            bVar = bVar4;
                                            z14 = false;
                                            i19 = 0;
                                        }
                                        if (z14 && i19 == 2) {
                                            dVar = dVar4;
                                            int q13 = dVar.q();
                                            int l7 = dVar.l();
                                            z19 = dVar.G0;
                                            z20 = dVar.H0;
                                            int i39 = bVar5.f4465e;
                                            int min3 = Math.min(this.n, View.resolveSizeAndState(q13 + bVar5.f4464d, i10, 0) & 16777215);
                                            int min4 = Math.min(this.f4412o, View.resolveSizeAndState(l7 + i39, i11, 0) & 16777215);
                                            if (z19) {
                                                min3 |= 16777216;
                                            }
                                            if (z20) {
                                                min4 |= 16777216;
                                            }
                                            setMeasuredDimension(min3, min4);
                                        }
                                        int i40 = dVar4.F0;
                                        if (size <= 0) {
                                            int size5 = dVar4.f10897s0.size();
                                            boolean V = dVar4.V(64);
                                            b.InterfaceC0121b interfaceC0121b4 = dVar4.f4339w0;
                                            int i41 = 0;
                                            while (i41 < size5) {
                                                ConstraintWidget constraintWidget2 = dVar4.f10897s0.get(i41);
                                                if (!(constraintWidget2 instanceof f) && !(constraintWidget2 instanceof androidx.constraintlayout.core.widgets.a) && !constraintWidget2.H && (!V || (cVar = constraintWidget2.f4240d) == null || (dVar3 = constraintWidget2.f4242e) == null || !cVar.f4308e.f4294j || !dVar3.f4308e.f4294j)) {
                                                    ConstraintWidget.DimensionBehaviour k11 = constraintWidget2.k(0);
                                                    ConstraintWidget.DimensionBehaviour k12 = constraintWidget2.k(1);
                                                    dimensionBehaviour7 = dimensionBehaviour4;
                                                    if (k11 == dimensionBehaviour7 && constraintWidget2.f4269s != 1 && k12 == dimensionBehaviour7 && constraintWidget2.f4270t != 1) {
                                                        z18 = true;
                                                    } else {
                                                        z18 = false;
                                                    }
                                                    if (!z18 && dVar4.V(1) && !(constraintWidget2 instanceof h)) {
                                                        if (k11 == dimensionBehaviour7 && constraintWidget2.f4269s == 0 && k12 != dimensionBehaviour7 && !constraintWidget2.x()) {
                                                            z18 = true;
                                                        }
                                                        if (k12 == dimensionBehaviour7 && constraintWidget2.f4270t == 0 && k11 != dimensionBehaviour7 && !constraintWidget2.x()) {
                                                            z18 = true;
                                                        }
                                                        if ((k11 == dimensionBehaviour7 || k12 == dimensionBehaviour7) && constraintWidget2.Z > 0.0f) {
                                                            z18 = true;
                                                        }
                                                    }
                                                    if (z18) {
                                                        bVar3 = bVar;
                                                    } else {
                                                        bVar3 = bVar;
                                                        bVar3.a(0, constraintWidget2, interfaceC0121b4);
                                                    }
                                                    i41++;
                                                    bVar = bVar3;
                                                    dimensionBehaviour4 = dimensionBehaviour7;
                                                }
                                                bVar3 = bVar;
                                                dimensionBehaviour7 = dimensionBehaviour4;
                                                i41++;
                                                bVar = bVar3;
                                                dimensionBehaviour4 = dimensionBehaviour7;
                                            }
                                            bVar2 = bVar;
                                            ConstraintLayout constraintLayout = ((b) interfaceC0121b4).f4462a;
                                            int childCount3 = constraintLayout.getChildCount();
                                            for (int i42 = 0; i42 < childCount3; i42++) {
                                                View childAt = constraintLayout.getChildAt(i42);
                                                if (childAt instanceof e) {
                                                    e eVar3 = (e) childAt;
                                                    if (eVar3.f4572j != null) {
                                                        a aVar = (a) eVar3.getLayoutParams();
                                                        a aVar2 = (a) eVar3.f4572j.getLayoutParams();
                                                        ConstraintWidget constraintWidget3 = aVar2.f4451q0;
                                                        constraintWidget3.f4253j0 = 0;
                                                        ConstraintWidget constraintWidget4 = aVar.f4451q0;
                                                        if (constraintWidget4.V[0] != dimensionBehaviour6) {
                                                            constraintWidget4.N(constraintWidget3.q());
                                                        }
                                                        ConstraintWidget constraintWidget5 = aVar.f4451q0;
                                                        if (constraintWidget5.V[1] != dimensionBehaviour6) {
                                                            constraintWidget5.K(aVar2.f4451q0.l());
                                                        }
                                                        aVar2.f4451q0.f4253j0 = 8;
                                                    }
                                                }
                                            }
                                            ArrayList<androidx.constraintlayout.widget.a> arrayList3 = constraintLayout.f4408j;
                                            int size6 = arrayList3.size();
                                            if (size6 > 0) {
                                                for (int i43 = 0; i43 < size6; i43++) {
                                                    arrayList3.get(i43).getClass();
                                                }
                                            }
                                        } else {
                                            bVar2 = bVar;
                                        }
                                        bVar2.c(dVar4);
                                        ArrayList<ConstraintWidget> arrayList4 = bVar2.f11193a;
                                        size2 = arrayList4.size();
                                        if (size <= 0) {
                                            c = 0;
                                            i20 = i18;
                                            i21 = i17;
                                            bVar2.b(dVar4, 0, i21, i20);
                                        } else {
                                            i20 = i18;
                                            i21 = i17;
                                            c = 0;
                                        }
                                        if (size2 <= 0) {
                                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr3 = dVar4.V;
                                            ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = dimensionBehaviour5;
                                            if (dimensionBehaviourArr3[c] == dimensionBehaviour17) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            if (dimensionBehaviourArr3[1] == dimensionBehaviour17) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                            int q14 = dVar4.q();
                                            androidx.constraintlayout.core.widgets.d dVar9 = bVar2.c;
                                            int max5 = Math.max(q14, dVar9.f4243e0);
                                            int max6 = Math.max(dVar4.l(), dVar9.f4245f0);
                                            int i44 = 0;
                                            boolean z31 = false;
                                            while (true) {
                                                type = ConstraintAnchor.Type.BOTTOM;
                                                type2 = ConstraintAnchor.Type.RIGHT;
                                                if (i44 >= size2) {
                                                    break;
                                                }
                                                ConstraintWidget constraintWidget6 = arrayList4.get(i44);
                                                int i45 = i40;
                                                if (!(constraintWidget6 instanceof h)) {
                                                    dVar2 = dVar4;
                                                    i24 = i21;
                                                    i25 = i20;
                                                    interfaceC0121b2 = interfaceC0121b;
                                                } else {
                                                    int q15 = constraintWidget6.q();
                                                    dVar2 = dVar4;
                                                    int l10 = constraintWidget6.l();
                                                    i24 = i21;
                                                    i25 = i20;
                                                    interfaceC0121b2 = interfaceC0121b;
                                                    boolean a10 = bVar2.a(1, constraintWidget6, interfaceC0121b2) | z31;
                                                    int q16 = constraintWidget6.q();
                                                    int l11 = constraintWidget6.l();
                                                    if (q16 != q15) {
                                                        constraintWidget6.N(q16);
                                                        if (z15 && constraintWidget6.r() + constraintWidget6.X > max5) {
                                                            max5 = Math.max(max5, constraintWidget6.j(type2).e() + constraintWidget6.r() + constraintWidget6.X);
                                                        }
                                                        z17 = true;
                                                    } else {
                                                        z17 = a10;
                                                    }
                                                    if (l11 != l10) {
                                                        constraintWidget6.K(l11);
                                                        if (z16 && constraintWidget6.s() + constraintWidget6.Y > max6) {
                                                            max6 = Math.max(max6, constraintWidget6.j(type).e() + constraintWidget6.s() + constraintWidget6.Y);
                                                        }
                                                        z17 = true;
                                                    }
                                                    z31 = z17 | ((h) constraintWidget6).A0;
                                                }
                                                i44++;
                                                interfaceC0121b = interfaceC0121b2;
                                                i40 = i45;
                                                dVar4 = dVar2;
                                                i21 = i24;
                                                i20 = i25;
                                            }
                                            i22 = i40;
                                            androidx.constraintlayout.core.widgets.d dVar10 = dVar4;
                                            int i46 = i21;
                                            int i47 = i20;
                                            b.InterfaceC0121b interfaceC0121b5 = interfaceC0121b;
                                            int i48 = 0;
                                            for (int i49 = 2; i48 < i49; i49 = 2) {
                                                int i50 = 0;
                                                while (i50 < size2) {
                                                    ConstraintWidget constraintWidget7 = arrayList4.get(i50);
                                                    if ((!(constraintWidget7 instanceof f2.a) || (constraintWidget7 instanceof h)) && !(constraintWidget7 instanceof f) && constraintWidget7.f4253j0 != 8 && ((!z13 || !constraintWidget7.f4240d.f4308e.f4294j || !constraintWidget7.f4242e.f4308e.f4294j) && !(constraintWidget7 instanceof h))) {
                                                        int q17 = constraintWidget7.q();
                                                        int l12 = constraintWidget7.l();
                                                        arrayList = arrayList4;
                                                        int i51 = constraintWidget7.f4241d0;
                                                        i23 = size2;
                                                        int i52 = 1;
                                                        if (i48 == 1) {
                                                            i52 = 2;
                                                        }
                                                        boolean a11 = bVar2.a(i52, constraintWidget7, interfaceC0121b5) | z31;
                                                        int q18 = constraintWidget7.q();
                                                        boolean z32 = a11;
                                                        int l13 = constraintWidget7.l();
                                                        if (q18 != q17) {
                                                            constraintWidget7.N(q18);
                                                            if (z15 && constraintWidget7.r() + constraintWidget7.X > max5) {
                                                                max5 = Math.max(max5, constraintWidget7.j(type2).e() + constraintWidget7.r() + constraintWidget7.X);
                                                            }
                                                            z32 = true;
                                                        }
                                                        if (l13 != l12) {
                                                            constraintWidget7.K(l13);
                                                            if (z16 && constraintWidget7.s() + constraintWidget7.Y > max6) {
                                                                max6 = Math.max(max6, constraintWidget7.j(type).e() + constraintWidget7.s() + constraintWidget7.Y);
                                                            }
                                                            z32 = true;
                                                        }
                                                        if (constraintWidget7.F && i51 != constraintWidget7.f4241d0) {
                                                            z31 = true;
                                                        } else {
                                                            z31 = z32;
                                                        }
                                                        i50++;
                                                        arrayList4 = arrayList;
                                                        size2 = i23;
                                                    }
                                                    arrayList = arrayList4;
                                                    i23 = size2;
                                                    i50++;
                                                    arrayList4 = arrayList;
                                                    size2 = i23;
                                                }
                                                ArrayList<ConstraintWidget> arrayList5 = arrayList4;
                                                int i53 = size2;
                                                if (!z31) {
                                                    break;
                                                }
                                                i48++;
                                                bVar2.b(dVar10, i48, i46, i47);
                                                z31 = false;
                                                arrayList4 = arrayList5;
                                                size2 = i53;
                                            }
                                            dVar = dVar10;
                                        } else {
                                            i22 = i40;
                                            dVar = dVar4;
                                        }
                                        dVar.F0 = i22;
                                        androidx.constraintlayout.core.c.f4199p = dVar.V(512);
                                        int q132 = dVar.q();
                                        int l72 = dVar.l();
                                        z19 = dVar.G0;
                                        z20 = dVar.H0;
                                        int i392 = bVar5.f4465e;
                                        int min32 = Math.min(this.n, View.resolveSizeAndState(q132 + bVar5.f4464d, i10, 0) & 16777215);
                                        int min42 = Math.min(this.f4412o, View.resolveSizeAndState(l72 + i392, i11, 0) & 16777215);
                                        if (z19) {
                                        }
                                        if (z20) {
                                        }
                                        setMeasuredDimension(min32, min42);
                                    }
                                    z10 = true;
                                    ConstraintWidget.DimensionBehaviour dimensionBehaviour152 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                                    if (z10) {
                                    }
                                    if (mode != 1073741824) {
                                    }
                                    z11 = false;
                                    z12 = z10 & z11;
                                    if (!z12) {
                                    }
                                    if (z14) {
                                        dVar = dVar4;
                                        int q1322 = dVar.q();
                                        int l722 = dVar.l();
                                        z19 = dVar.G0;
                                        z20 = dVar.H0;
                                        int i3922 = bVar5.f4465e;
                                        int min322 = Math.min(this.n, View.resolveSizeAndState(q1322 + bVar5.f4464d, i10, 0) & 16777215);
                                        int min422 = Math.min(this.f4412o, View.resolveSizeAndState(l722 + i3922, i11, 0) & 16777215);
                                        if (z19) {
                                        }
                                        if (z20) {
                                        }
                                        setMeasuredDimension(min322, min422);
                                    }
                                    int i402 = dVar4.F0;
                                    if (size <= 0) {
                                    }
                                    bVar2.c(dVar4);
                                    ArrayList<ConstraintWidget> arrayList42 = bVar2.f11193a;
                                    size2 = arrayList42.size();
                                    if (size <= 0) {
                                    }
                                    if (size2 <= 0) {
                                    }
                                    dVar.F0 = i22;
                                    androidx.constraintlayout.core.c.f4199p = dVar.V(512);
                                    int q13222 = dVar.q();
                                    int l7222 = dVar.l();
                                    z19 = dVar.G0;
                                    z20 = dVar.H0;
                                    int i39222 = bVar5.f4465e;
                                    int min3222 = Math.min(this.n, View.resolveSizeAndState(q13222 + bVar5.f4464d, i10, 0) & 16777215);
                                    int min4222 = Math.min(this.f4412o, View.resolveSizeAndState(l7222 + i39222, i11, 0) & 16777215);
                                    if (z19) {
                                    }
                                    if (z20) {
                                    }
                                    setMeasuredDimension(min3222, min4222);
                                }
                            } else if (childCount2 != 0) {
                                dimensionBehaviour11 = dimensionBehaviour2;
                            }
                            dimensionBehaviour3 = dimensionBehaviour11;
                            i14 = i35;
                            i13 = 0;
                            q10 = dVar4.q();
                            eVar = dVar4.f4337u0;
                            if (i12 == q10) {
                            }
                            eVar.c = true;
                            dVar4.f4239b0 = 0;
                            dVar4.c0 = 0;
                            int[] iArr2 = dVar4.D;
                            iArr2[0] = this.n - i37;
                            iArr2[1] = this.f4412o - i36;
                            dVar4.f4243e0 = 0;
                            dVar4.f4245f0 = 0;
                            dVar4.L(dimensionBehaviour);
                            dVar4.N(i12);
                            dVar4.M(dimensionBehaviour3);
                            dVar4.K(i13);
                            i15 = this.f4410l - i37;
                            if (i15 < 0) {
                            }
                            dVar4.f4243e0 = i15;
                            i16 = this.f4411m - i36;
                            if (i16 < 0) {
                            }
                            dVar4.f4245f0 = i16;
                            dVar4.f4342z0 = max3;
                            dVar4.A0 = max;
                            bVar4.getClass();
                            b.InterfaceC0121b interfaceC0121b32 = dVar4.f4339w0;
                            size = dVar4.f10897s0.size();
                            int q112 = dVar4.q();
                            int l22 = dVar4.l();
                            b5 = g.b(i32, 128);
                            if (!b5) {
                                z10 = false;
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour1522 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                                if (z10) {
                                }
                                if (mode != 1073741824) {
                                }
                                z11 = false;
                                z12 = z10 & z11;
                                if (!z12) {
                                }
                                if (z14) {
                                }
                                int i4022 = dVar4.F0;
                                if (size <= 0) {
                                }
                                bVar2.c(dVar4);
                                ArrayList<ConstraintWidget> arrayList422 = bVar2.f11193a;
                                size2 = arrayList422.size();
                                if (size <= 0) {
                                }
                                if (size2 <= 0) {
                                }
                                dVar.F0 = i22;
                                androidx.constraintlayout.core.c.f4199p = dVar.V(512);
                                int q132222 = dVar.q();
                                int l72222 = dVar.l();
                                z19 = dVar.G0;
                                z20 = dVar.H0;
                                int i392222 = bVar5.f4465e;
                                int min32222 = Math.min(this.n, View.resolveSizeAndState(q132222 + bVar5.f4464d, i10, 0) & 16777215);
                                int min42222 = Math.min(this.f4412o, View.resolveSizeAndState(l72222 + i392222, i11, 0) & 16777215);
                                if (z19) {
                                }
                                if (z20) {
                                }
                                setMeasuredDimension(min32222, min42222);
                            }
                            z10 = true;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour15222 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                            if (z10) {
                            }
                            if (mode != 1073741824) {
                            }
                            z11 = false;
                            z12 = z10 & z11;
                            if (!z12) {
                            }
                            if (z14) {
                            }
                            int i40222 = dVar4.F0;
                            if (size <= 0) {
                            }
                            bVar2.c(dVar4);
                            ArrayList<ConstraintWidget> arrayList4222 = bVar2.f11193a;
                            size2 = arrayList4222.size();
                            if (size <= 0) {
                            }
                            if (size2 <= 0) {
                            }
                            dVar.F0 = i22;
                            androidx.constraintlayout.core.c.f4199p = dVar.V(512);
                            int q1322222 = dVar.q();
                            int l722222 = dVar.l();
                            z19 = dVar.G0;
                            z20 = dVar.H0;
                            int i3922222 = bVar5.f4465e;
                            int min322222 = Math.min(this.n, View.resolveSizeAndState(q1322222 + bVar5.f4464d, i10, 0) & 16777215);
                            int min422222 = Math.min(this.f4412o, View.resolveSizeAndState(l722222 + i3922222, i11, 0) & 16777215);
                            if (z19) {
                            }
                            if (z20) {
                            }
                            setMeasuredDimension(min322222, min422222);
                        } else if (childCount2 != 0) {
                            i13 = i35;
                            i14 = i35;
                            dimensionBehaviour3 = dimensionBehaviour2;
                            q10 = dVar4.q();
                            eVar = dVar4.f4337u0;
                            if (i12 == q10) {
                            }
                            eVar.c = true;
                            dVar4.f4239b0 = 0;
                            dVar4.c0 = 0;
                            int[] iArr22 = dVar4.D;
                            iArr22[0] = this.n - i37;
                            iArr22[1] = this.f4412o - i36;
                            dVar4.f4243e0 = 0;
                            dVar4.f4245f0 = 0;
                            dVar4.L(dimensionBehaviour);
                            dVar4.N(i12);
                            dVar4.M(dimensionBehaviour3);
                            dVar4.K(i13);
                            i15 = this.f4410l - i37;
                            if (i15 < 0) {
                            }
                            dVar4.f4243e0 = i15;
                            i16 = this.f4411m - i36;
                            if (i16 < 0) {
                            }
                            dVar4.f4245f0 = i16;
                            dVar4.f4342z0 = max3;
                            dVar4.A0 = max;
                            bVar4.getClass();
                            b.InterfaceC0121b interfaceC0121b322 = dVar4.f4339w0;
                            size = dVar4.f10897s0.size();
                            int q1122 = dVar4.q();
                            int l222 = dVar4.l();
                            b5 = g.b(i32, 128);
                            if (!b5) {
                            }
                            z10 = true;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour152222 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                            if (z10) {
                            }
                            if (mode != 1073741824) {
                            }
                            z11 = false;
                            z12 = z10 & z11;
                            if (!z12) {
                            }
                            if (z14) {
                            }
                            int i402222 = dVar4.F0;
                            if (size <= 0) {
                            }
                            bVar2.c(dVar4);
                            ArrayList<ConstraintWidget> arrayList42222 = bVar2.f11193a;
                            size2 = arrayList42222.size();
                            if (size <= 0) {
                            }
                            if (size2 <= 0) {
                            }
                            dVar.F0 = i22;
                            androidx.constraintlayout.core.c.f4199p = dVar.V(512);
                            int q13222222 = dVar.q();
                            int l7222222 = dVar.l();
                            z19 = dVar.G0;
                            z20 = dVar.H0;
                            int i39222222 = bVar5.f4465e;
                            int min3222222 = Math.min(this.n, View.resolveSizeAndState(q13222222 + bVar5.f4464d, i10, 0) & 16777215);
                            int min4222222 = Math.min(this.f4412o, View.resolveSizeAndState(l7222222 + i39222222, i11, 0) & 16777215);
                            if (z19) {
                            }
                            if (z20) {
                            }
                            setMeasuredDimension(min3222222, min4222222);
                        }
                        i13 = Math.max(0, this.f4411m);
                        i14 = i35;
                        dimensionBehaviour3 = dimensionBehaviour2;
                        q10 = dVar4.q();
                        eVar = dVar4.f4337u0;
                        if (i12 == q10) {
                        }
                        eVar.c = true;
                        dVar4.f4239b0 = 0;
                        dVar4.c0 = 0;
                        int[] iArr222 = dVar4.D;
                        iArr222[0] = this.n - i37;
                        iArr222[1] = this.f4412o - i36;
                        dVar4.f4243e0 = 0;
                        dVar4.f4245f0 = 0;
                        dVar4.L(dimensionBehaviour);
                        dVar4.N(i12);
                        dVar4.M(dimensionBehaviour3);
                        dVar4.K(i13);
                        i15 = this.f4410l - i37;
                        if (i15 < 0) {
                        }
                        dVar4.f4243e0 = i15;
                        i16 = this.f4411m - i36;
                        if (i16 < 0) {
                        }
                        dVar4.f4245f0 = i16;
                        dVar4.f4342z0 = max3;
                        dVar4.A0 = max;
                        bVar4.getClass();
                        b.InterfaceC0121b interfaceC0121b3222 = dVar4.f4339w0;
                        size = dVar4.f10897s0.size();
                        int q11222 = dVar4.q();
                        int l2222 = dVar4.l();
                        b5 = g.b(i32, 128);
                        if (!b5) {
                        }
                        z10 = true;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour1522222 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (z10) {
                        }
                        if (mode != 1073741824) {
                        }
                        z11 = false;
                        z12 = z10 & z11;
                        if (!z12) {
                        }
                        if (z14) {
                        }
                        int i4022222 = dVar4.F0;
                        if (size <= 0) {
                        }
                        bVar2.c(dVar4);
                        ArrayList<ConstraintWidget> arrayList422222 = bVar2.f11193a;
                        size2 = arrayList422222.size();
                        if (size <= 0) {
                        }
                        if (size2 <= 0) {
                        }
                        dVar.F0 = i22;
                        androidx.constraintlayout.core.c.f4199p = dVar.V(512);
                        int q132222222 = dVar.q();
                        int l72222222 = dVar.l();
                        z19 = dVar.G0;
                        z20 = dVar.H0;
                        int i392222222 = bVar5.f4465e;
                        int min32222222 = Math.min(this.n, View.resolveSizeAndState(q132222222 + bVar5.f4464d, i10, 0) & 16777215);
                        int min42222222 = Math.min(this.f4412o, View.resolveSizeAndState(l72222222 + i392222222, i11, 0) & 16777215);
                        if (z19) {
                        }
                        if (z20) {
                        }
                        setMeasuredDimension(min32222222, min42222222);
                    }
                } else if (childCount2 != 0) {
                    dimensionBehaviour12 = dimensionBehaviour14;
                }
                dimensionBehaviour = dimensionBehaviour12;
                i12 = 0;
                dimensionBehaviour2 = dimensionBehaviour14;
                if (mode2 != Integer.MIN_VALUE) {
                }
                i13 = Math.max(0, this.f4411m);
                i14 = i35;
                dimensionBehaviour3 = dimensionBehaviour2;
                q10 = dVar4.q();
                eVar = dVar4.f4337u0;
                if (i12 == q10) {
                }
                eVar.c = true;
                dVar4.f4239b0 = 0;
                dVar4.c0 = 0;
                int[] iArr2222 = dVar4.D;
                iArr2222[0] = this.n - i37;
                iArr2222[1] = this.f4412o - i36;
                dVar4.f4243e0 = 0;
                dVar4.f4245f0 = 0;
                dVar4.L(dimensionBehaviour);
                dVar4.N(i12);
                dVar4.M(dimensionBehaviour3);
                dVar4.K(i13);
                i15 = this.f4410l - i37;
                if (i15 < 0) {
                }
                dVar4.f4243e0 = i15;
                i16 = this.f4411m - i36;
                if (i16 < 0) {
                }
                dVar4.f4245f0 = i16;
                dVar4.f4342z0 = max3;
                dVar4.A0 = max;
                bVar4.getClass();
                b.InterfaceC0121b interfaceC0121b32222 = dVar4.f4339w0;
                size = dVar4.f10897s0.size();
                int q112222 = dVar4.q();
                int l22222 = dVar4.l();
                b5 = g.b(i32, 128);
                if (!b5) {
                }
                z10 = true;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour15222222 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (z10) {
                }
                if (mode != 1073741824) {
                }
                z11 = false;
                z12 = z10 & z11;
                if (!z12) {
                }
                if (z14) {
                }
                int i40222222 = dVar4.F0;
                if (size <= 0) {
                }
                bVar2.c(dVar4);
                ArrayList<ConstraintWidget> arrayList4222222 = bVar2.f11193a;
                size2 = arrayList4222222.size();
                if (size <= 0) {
                }
                if (size2 <= 0) {
                }
                dVar.F0 = i22;
                androidx.constraintlayout.core.c.f4199p = dVar.V(512);
                int q1322222222 = dVar.q();
                int l722222222 = dVar.l();
                z19 = dVar.G0;
                z20 = dVar.H0;
                int i3922222222 = bVar5.f4465e;
                int min322222222 = Math.min(this.n, View.resolveSizeAndState(q1322222222 + bVar5.f4464d, i10, 0) & 16777215);
                int min422222222 = Math.min(this.f4412o, View.resolveSizeAndState(l722222222 + i3922222222, i11, 0) & 16777215);
                if (z19) {
                }
                if (z20) {
                }
                setMeasuredDimension(min322222222, min422222222);
            } else if (childCount2 != 0) {
                i12 = i34;
                dimensionBehaviour = dimensionBehaviour14;
                dimensionBehaviour2 = dimensionBehaviour;
                if (mode2 != Integer.MIN_VALUE) {
                }
                i13 = Math.max(0, this.f4411m);
                i14 = i35;
                dimensionBehaviour3 = dimensionBehaviour2;
                q10 = dVar4.q();
                eVar = dVar4.f4337u0;
                if (i12 == q10) {
                }
                eVar.c = true;
                dVar4.f4239b0 = 0;
                dVar4.c0 = 0;
                int[] iArr22222 = dVar4.D;
                iArr22222[0] = this.n - i37;
                iArr22222[1] = this.f4412o - i36;
                dVar4.f4243e0 = 0;
                dVar4.f4245f0 = 0;
                dVar4.L(dimensionBehaviour);
                dVar4.N(i12);
                dVar4.M(dimensionBehaviour3);
                dVar4.K(i13);
                i15 = this.f4410l - i37;
                if (i15 < 0) {
                }
                dVar4.f4243e0 = i15;
                i16 = this.f4411m - i36;
                if (i16 < 0) {
                }
                dVar4.f4245f0 = i16;
                dVar4.f4342z0 = max3;
                dVar4.A0 = max;
                bVar4.getClass();
                b.InterfaceC0121b interfaceC0121b322222 = dVar4.f4339w0;
                size = dVar4.f10897s0.size();
                int q1122222 = dVar4.q();
                int l222222 = dVar4.l();
                b5 = g.b(i32, 128);
                if (!b5) {
                }
                z10 = true;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour152222222 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (z10) {
                }
                if (mode != 1073741824) {
                }
                z11 = false;
                z12 = z10 & z11;
                if (!z12) {
                }
                if (z14) {
                }
                int i402222222 = dVar4.F0;
                if (size <= 0) {
                }
                bVar2.c(dVar4);
                ArrayList<ConstraintWidget> arrayList42222222 = bVar2.f11193a;
                size2 = arrayList42222222.size();
                if (size <= 0) {
                }
                if (size2 <= 0) {
                }
                dVar.F0 = i22;
                androidx.constraintlayout.core.c.f4199p = dVar.V(512);
                int q13222222222 = dVar.q();
                int l7222222222 = dVar.l();
                z19 = dVar.G0;
                z20 = dVar.H0;
                int i39222222222 = bVar5.f4465e;
                int min3222222222 = Math.min(this.n, View.resolveSizeAndState(q13222222222 + bVar5.f4464d, i10, 0) & 16777215);
                int min4222222222 = Math.min(this.f4412o, View.resolveSizeAndState(l7222222222 + i39222222222, i11, 0) & 16777215);
                if (z19) {
                }
                if (z20) {
                }
                setMeasuredDimension(min3222222222, min4222222222);
            }
            i12 = Math.max(0, this.f4410l);
            dimensionBehaviour = dimensionBehaviour14;
            dimensionBehaviour2 = dimensionBehaviour;
            if (mode2 != Integer.MIN_VALUE) {
            }
            i13 = Math.max(0, this.f4411m);
            i14 = i35;
            dimensionBehaviour3 = dimensionBehaviour2;
            q10 = dVar4.q();
            eVar = dVar4.f4337u0;
            if (i12 == q10) {
            }
            eVar.c = true;
            dVar4.f4239b0 = 0;
            dVar4.c0 = 0;
            int[] iArr222222 = dVar4.D;
            iArr222222[0] = this.n - i37;
            iArr222222[1] = this.f4412o - i36;
            dVar4.f4243e0 = 0;
            dVar4.f4245f0 = 0;
            dVar4.L(dimensionBehaviour);
            dVar4.N(i12);
            dVar4.M(dimensionBehaviour3);
            dVar4.K(i13);
            i15 = this.f4410l - i37;
            if (i15 < 0) {
            }
            dVar4.f4243e0 = i15;
            i16 = this.f4411m - i36;
            if (i16 < 0) {
            }
            dVar4.f4245f0 = i16;
            dVar4.f4342z0 = max3;
            dVar4.A0 = max;
            bVar4.getClass();
            b.InterfaceC0121b interfaceC0121b3222222 = dVar4.f4339w0;
            size = dVar4.f10897s0.size();
            int q11222222 = dVar4.q();
            int l2222222 = dVar4.l();
            b5 = g.b(i32, 128);
            if (!b5) {
            }
            z10 = true;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour1522222222 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (z10) {
            }
            if (mode != 1073741824) {
            }
            z11 = false;
            z12 = z10 & z11;
            if (!z12) {
            }
            if (z14) {
            }
            int i4022222222 = dVar4.F0;
            if (size <= 0) {
            }
            bVar2.c(dVar4);
            ArrayList<ConstraintWidget> arrayList422222222 = bVar2.f11193a;
            size2 = arrayList422222222.size();
            if (size <= 0) {
            }
            if (size2 <= 0) {
            }
            dVar.F0 = i22;
            androidx.constraintlayout.core.c.f4199p = dVar.V(512);
            int q132222222222 = dVar.q();
            int l72222222222 = dVar.l();
            z19 = dVar.G0;
            z20 = dVar.H0;
            int i392222222222 = bVar5.f4465e;
            int min32222222222 = Math.min(this.n, View.resolveSizeAndState(q132222222222 + bVar5.f4464d, i10, 0) & 16777215);
            int min42222222222 = Math.min(this.f4412o, View.resolveSizeAndState(l72222222222 + i392222222222, i11, 0) & 16777215);
            if (z19) {
            }
            if (z20) {
            }
            setMeasuredDimension(min32222222222, min42222222222);
        }
        if (d()) {
            max3 = max4;
        }
        int i342 = size3 - paddingWidth;
        int i352 = size4 - i33;
        int i362 = bVar5.f4465e;
        int i372 = bVar5.f4464d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour132 = ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount22 = getChildCount();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour142 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (mode == Integer.MIN_VALUE) {
        }
        i12 = Math.max(0, this.f4410l);
        dimensionBehaviour = dimensionBehaviour142;
        dimensionBehaviour2 = dimensionBehaviour;
        if (mode2 != Integer.MIN_VALUE) {
        }
        i13 = Math.max(0, this.f4411m);
        i14 = i352;
        dimensionBehaviour3 = dimensionBehaviour2;
        q10 = dVar4.q();
        eVar = dVar4.f4337u0;
        if (i12 == q10) {
        }
        eVar.c = true;
        dVar4.f4239b0 = 0;
        dVar4.c0 = 0;
        int[] iArr2222222 = dVar4.D;
        iArr2222222[0] = this.n - i372;
        iArr2222222[1] = this.f4412o - i362;
        dVar4.f4243e0 = 0;
        dVar4.f4245f0 = 0;
        dVar4.L(dimensionBehaviour);
        dVar4.N(i12);
        dVar4.M(dimensionBehaviour3);
        dVar4.K(i13);
        i15 = this.f4410l - i372;
        if (i15 < 0) {
        }
        dVar4.f4243e0 = i15;
        i16 = this.f4411m - i362;
        if (i16 < 0) {
        }
        dVar4.f4245f0 = i16;
        dVar4.f4342z0 = max3;
        dVar4.A0 = max;
        bVar4.getClass();
        b.InterfaceC0121b interfaceC0121b32222222 = dVar4.f4339w0;
        size = dVar4.f10897s0.size();
        int q112222222 = dVar4.q();
        int l22222222 = dVar4.l();
        b5 = g.b(i32, 128);
        if (!b5) {
        }
        z10 = true;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour15222222222 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (z10) {
        }
        if (mode != 1073741824) {
        }
        z11 = false;
        z12 = z10 & z11;
        if (!z12) {
        }
        if (z14) {
        }
        int i40222222222 = dVar4.F0;
        if (size <= 0) {
        }
        bVar2.c(dVar4);
        ArrayList<ConstraintWidget> arrayList4222222222 = bVar2.f11193a;
        size2 = arrayList4222222222.size();
        if (size <= 0) {
        }
        if (size2 <= 0) {
        }
        dVar.F0 = i22;
        androidx.constraintlayout.core.c.f4199p = dVar.V(512);
        int q1322222222222 = dVar.q();
        int l722222222222 = dVar.l();
        z19 = dVar.G0;
        z20 = dVar.H0;
        int i3922222222222 = bVar5.f4465e;
        int min322222222222 = Math.min(this.n, View.resolveSizeAndState(q1322222222222 + bVar5.f4464d, i10, 0) & 16777215);
        int min422222222222 = Math.min(this.f4412o, View.resolveSizeAndState(l722222222222 + i3922222222222, i11, 0) & 16777215);
        if (z19) {
        }
        if (z20) {
        }
        setMeasuredDimension(min322222222222, min422222222222);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget b5 = b(view);
        if ((view instanceof d) && !(b5 instanceof f)) {
            a aVar = (a) view.getLayoutParams();
            f fVar = new f();
            aVar.f4451q0 = fVar;
            aVar.f4426d0 = true;
            fVar.Q(aVar.V);
        }
        if (view instanceof androidx.constraintlayout.widget.a) {
            androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) view;
            aVar2.k();
            ((a) view.getLayoutParams()).f4428e0 = true;
            ArrayList<androidx.constraintlayout.widget.a> arrayList = this.f4408j;
            if (!arrayList.contains(aVar2)) {
                arrayList.add(aVar2);
            }
        }
        this.f4407i.put(view.getId(), view);
        this.f4413p = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f4407i.remove(view.getId());
        ConstraintWidget b5 = b(view);
        this.f4409k.f10897s0.remove(b5);
        b5.C();
        this.f4408j.remove(view);
        this.f4413p = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f4413p = true;
        super.requestLayout();
    }

    public void setConstraintSet(androidx.constraintlayout.widget.b bVar) {
        this.f4415r = bVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        int id = getId();
        SparseArray<View> sparseArray = this.f4407i;
        sparseArray.remove(id);
        super.setId(i10);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f4412o) {
            return;
        }
        this.f4412o = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.n) {
            return;
        }
        this.n = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f4411m) {
            return;
        }
        this.f4411m = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f4410l) {
            return;
        }
        this.f4410l = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(i2.b bVar) {
        i2.a aVar = this.f4416s;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f4414q = i10;
        androidx.constraintlayout.core.widgets.d dVar = this.f4409k;
        dVar.F0 = i10;
        androidx.constraintlayout.core.c.f4199p = dVar.V(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
