package f;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.s0;
import f.b;
import f.d;
import org.xmlpull.v1.XmlPullParserException;
import p.i;
import p2.k;

/* loaded from: classes.dex */
public final class a extends f.d implements r2.b {
    public int A;
    public boolean B;

    /* renamed from: x  reason: collision with root package name */
    public b f10684x;

    /* renamed from: y  reason: collision with root package name */
    public f f10685y;

    /* renamed from: z  reason: collision with root package name */
    public int f10686z;

    /* renamed from: f.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0113a extends f {

        /* renamed from: a  reason: collision with root package name */
        public final Animatable f10687a;

        public C0113a(Animatable animatable) {
            this.f10687a = animatable;
        }

        @Override // f.a.f
        public final void c() {
            this.f10687a.start();
        }

        @Override // f.a.f
        public final void d() {
            this.f10687a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends d.a {
        public p.e<Long> I;
        public i<Integer> J;

        public b(b bVar, a aVar, Resources resources) {
            super(bVar, aVar, resources);
            i<Integer> iVar;
            if (bVar != null) {
                this.I = bVar.I;
                iVar = bVar.J;
            } else {
                this.I = new p.e<>();
                iVar = new i<>();
            }
            this.J = iVar;
        }

        @Override // f.d.a, f.b.c
        public final void e() {
            this.I = this.I.clone();
            this.J = this.J.clone();
        }

        @Override // f.d.a, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // f.d.a, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: a  reason: collision with root package name */
        public final i4.d f10688a;

        public c(i4.d dVar) {
            this.f10688a = dVar;
        }

        @Override // f.a.f
        public final void c() {
            this.f10688a.start();
        }

        @Override // f.a.f
        public final void d() {
            this.f10688a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends f {

        /* renamed from: a  reason: collision with root package name */
        public final ObjectAnimator f10689a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f10690b;

        public d(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            int i10;
            int i11;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z10) {
                i10 = numberOfFrames - 1;
            } else {
                i10 = 0;
            }
            if (z10) {
                i11 = 0;
            } else {
                i11 = numberOfFrames - 1;
            }
            e eVar = new e(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
            g.a.a(ofInt, true);
            ofInt.setDuration(eVar.c);
            ofInt.setInterpolator(eVar);
            this.f10690b = z11;
            this.f10689a = ofInt;
        }

        @Override // f.a.f
        public final boolean a() {
            return this.f10690b;
        }

        @Override // f.a.f
        public final void b() {
            this.f10689a.reverse();
        }

        @Override // f.a.f
        public final void c() {
            this.f10689a.start();
        }

        @Override // f.a.f
        public final void d() {
            this.f10689a.cancel();
        }
    }

    /* loaded from: classes.dex */
    public static class e implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public int[] f10691a;

        /* renamed from: b  reason: collision with root package name */
        public int f10692b;
        public int c;

        public e(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f10692b = numberOfFrames;
            int[] iArr = this.f10691a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f10691a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f10691a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.c = i10;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            int i10 = (int) ((f10 * this.c) + 0.5f);
            int i11 = this.f10692b;
            int[] iArr = this.f10691a;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = iArr[i12];
                if (i10 < i13) {
                    break;
                }
                i10 -= i13;
                i12++;
            }
            return (i12 / i11) + (i12 < i11 ? i10 / this.c : 0.0f);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    public a(b bVar, Resources resources) {
        this.f10686z = -1;
        this.A = -1;
        e(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x026d, code lost:
        r4.onStateChange(r4.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0274, code lost:
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a g(Context context, Resources.Theme theme, Resources resources, AttributeSet attributeSet, XmlResourceParser xmlResourceParser) {
        int depth;
        Context context2;
        long j2;
        int next;
        int next2;
        Resources.Theme theme2 = theme;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            TypedArray g10 = k.g(resources2, theme2, attributeSet, a1.b.D0);
            int i10 = 1;
            aVar.setVisible(g10.getBoolean(1, true), true);
            b bVar = aVar.f10684x;
            bVar.f10709d |= g.b.b(g10);
            int i11 = 2;
            bVar.f10714i = g10.getBoolean(2, bVar.f10714i);
            int i12 = 3;
            bVar.f10717l = g10.getBoolean(3, bVar.f10717l);
            bVar.f10729y = g10.getInt(4, bVar.f10729y);
            bVar.f10730z = g10.getInt(5, bVar.f10730z);
            boolean z10 = false;
            aVar.setDither(g10.getBoolean(0, bVar.f10727w));
            b.c cVar = aVar.f10694i;
            if (resources2 != null) {
                cVar.f10708b = resources2;
                int i13 = resources.getDisplayMetrics().densityDpi;
                if (i13 == 0) {
                    i13 = 160;
                }
                int i14 = cVar.c;
                cVar.c = i13;
                if (i14 != i13) {
                    cVar.f10718m = false;
                    cVar.f10715j = false;
                }
            } else {
                cVar.getClass();
            }
            g10.recycle();
            int depth2 = xmlResourceParser.getDepth() + 1;
            Context context3 = context;
            Resources.Theme theme3 = theme2;
            while (true) {
                int next3 = xmlResourceParser.next();
                if (next3 == i10 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i12)) {
                    break;
                } else if (next3 == i11 && depth <= depth2) {
                    Drawable drawable = null;
                    if (xmlResourceParser.getName().equals("item")) {
                        TypedArray g11 = k.g(resources2, theme3, attributeSet, a1.b.E0);
                        int resourceId = g11.getResourceId(z10 ? 1 : 0, z10 ? 1 : 0);
                        int resourceId2 = g11.getResourceId(i10, -1);
                        if (resourceId2 > 0) {
                            drawable = s0.d().f(context3, resourceId2);
                        }
                        g11.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr = new int[attributeCount];
                        int i15 = 0;
                        for (int i16 = 0; i16 < attributeCount; i16++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i16);
                            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                                int i17 = i15 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i16, z10)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr[i15] = attributeNameResource;
                                i15 = i17;
                            }
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr, i15);
                        if (drawable == null) {
                            while (true) {
                                next2 = xmlResourceParser.next();
                                if (next2 != 4) {
                                    break;
                                }
                            }
                            if (next2 == 2) {
                                if (xmlResourceParser.getName().equals("vector")) {
                                    drawable = new i4.i();
                                    drawable.inflate(resources2, xmlResourceParser, attributeSet, theme3);
                                } else {
                                    drawable = g.b.a(resources2, xmlResourceParser, attributeSet, theme3);
                                }
                            } else {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                        }
                        if (drawable != null) {
                            b bVar2 = aVar.f10684x;
                            int a10 = bVar2.a(drawable);
                            bVar2.H[a10] = trimStateSet;
                            bVar2.J.f(a10, Integer.valueOf(resourceId));
                        } else {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                    } else {
                        if (xmlResourceParser.getName().equals("transition")) {
                            TypedArray g12 = k.g(resources2, theme3, attributeSet, a1.b.F0);
                            int resourceId3 = g12.getResourceId(2, -1);
                            int resourceId4 = g12.getResourceId(1, -1);
                            int resourceId5 = g12.getResourceId(z10 ? 1 : 0, -1);
                            if (resourceId5 > 0) {
                                drawable = s0.d().f(context3, resourceId5);
                            }
                            boolean z11 = g12.getBoolean(3, z10);
                            g12.recycle();
                            if (drawable == null) {
                                while (true) {
                                    next = xmlResourceParser.next();
                                    if (next != 4) {
                                        break;
                                    }
                                }
                                if (next == 2) {
                                    if (xmlResourceParser.getName().equals("animated-vector")) {
                                        context2 = context;
                                        drawable = new i4.d(context2);
                                        drawable.inflate(resources2, xmlResourceParser, attributeSet, theme2);
                                    } else {
                                        context2 = context;
                                        drawable = g.b.a(resources2, xmlResourceParser, attributeSet, theme3);
                                    }
                                } else {
                                    throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                                }
                            } else {
                                context2 = context;
                            }
                            if (drawable != null) {
                                if (resourceId3 == -1 || resourceId4 == -1) {
                                    break;
                                }
                                b bVar3 = aVar.f10684x;
                                int a11 = bVar3.a(drawable);
                                long j10 = resourceId3;
                                long j11 = resourceId4;
                                long j12 = j11 | (j10 << 32);
                                if (z11) {
                                    j2 = 8589934592L;
                                } else {
                                    j2 = 0;
                                }
                                long j13 = a11;
                                bVar3.I.c(j12, Long.valueOf(j13 | j2));
                                if (z11) {
                                    bVar3.I.c((j11 << 32) | j10, Long.valueOf(j13 | 4294967296L | j2));
                                }
                            } else {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                        } else {
                            context2 = context;
                        }
                        theme3 = theme;
                        context3 = context2;
                    }
                    theme2 = theme;
                    resources2 = resources;
                    i10 = 1;
                    z10 = false;
                    i11 = 2;
                    i12 = 3;
                }
            }
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override // f.d, f.b
    public final b.c b() {
        return new b(this.f10684x, this, null);
    }

    @Override // f.d, f.b
    public final void e(b.c cVar) {
        super.e(cVar);
        if (cVar instanceof b) {
            this.f10684x = (b) cVar;
        }
    }

    @Override // f.d
    public final d.a f() {
        return new b(this.f10684x, this, null);
    }

    @Override // f.b, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        f fVar = this.f10685y;
        if (fVar != null) {
            fVar.d();
            this.f10685y = null;
            d(this.f10686z);
            this.f10686z = -1;
            this.A = -1;
        }
    }

    @Override // f.d, f.b, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.B) {
            super.mutate();
            this.f10684x.e();
            this.B = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0107  */
    @Override // f.d, f.b, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStateChange(int[] iArr) {
        int intValue;
        int intValue2;
        boolean z10;
        boolean z11;
        f c0113a;
        boolean z12;
        b bVar = this.f10684x;
        int f10 = bVar.f(iArr);
        if (f10 < 0) {
            f10 = bVar.f(StateSet.WILD_CARD);
        }
        int i10 = this.f10699o;
        boolean z13 = false;
        if (f10 != i10) {
            f fVar = this.f10685y;
            if (fVar != null) {
                if (f10 != this.f10686z) {
                    if (f10 == this.A && fVar.a()) {
                        fVar.b();
                        this.f10686z = this.A;
                        this.A = f10;
                    } else {
                        i10 = this.f10686z;
                        fVar.d();
                    }
                }
                z10 = true;
                if (!z10 || d(f10)) {
                    z13 = true;
                }
            }
            this.f10685y = null;
            this.A = -1;
            this.f10686z = -1;
            b bVar2 = this.f10684x;
            if (i10 < 0) {
                bVar2.getClass();
                intValue = 0;
            } else {
                intValue = ((Integer) bVar2.J.e(i10, 0)).intValue();
            }
            if (f10 < 0) {
                intValue2 = 0;
            } else {
                intValue2 = ((Integer) bVar2.J.e(f10, 0)).intValue();
            }
            if (intValue2 != 0 && intValue != 0) {
                long j2 = intValue2 | (intValue << 32);
                int longValue = (int) ((Long) bVar2.I.h(j2, -1L)).longValue();
                if (longValue >= 0) {
                    if ((((Long) bVar2.I.h(j2, -1L)).longValue() & 8589934592L) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    d(longValue);
                    Drawable drawable = this.f10696k;
                    if (drawable instanceof AnimationDrawable) {
                        if ((((Long) bVar2.I.h(j2, -1L)).longValue() & 4294967296L) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        c0113a = new d((AnimationDrawable) drawable, z12, z11);
                    } else if (drawable instanceof i4.d) {
                        c0113a = new c((i4.d) drawable);
                    } else if (drawable instanceof Animatable) {
                        c0113a = new C0113a((Animatable) drawable);
                    }
                    c0113a.c();
                    this.f10685y = c0113a;
                    this.A = i10;
                    this.f10686z = f10;
                    z10 = true;
                    if (!z10) {
                    }
                    z13 = true;
                }
            }
            z10 = false;
            if (!z10) {
            }
            z13 = true;
        }
        Drawable drawable2 = this.f10696k;
        if (drawable2 != null) {
            return z13 | drawable2.setState(iArr);
        }
        return z13;
    }

    @Override // f.b, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        f fVar = this.f10685y;
        if (fVar != null && (visible || z11)) {
            if (z10) {
                fVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
