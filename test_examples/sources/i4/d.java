package i4;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import i4.i;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p2.f;
import p2.k;
import r2.a;

/* loaded from: classes.dex */
public final class d extends h implements Animatable {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f11738o = 0;

    /* renamed from: j  reason: collision with root package name */
    public final b f11739j;

    /* renamed from: k  reason: collision with root package name */
    public final Context f11740k;

    /* renamed from: l  reason: collision with root package name */
    public e f11741l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<i4.c> f11742m;
    public final a n;

    /* loaded from: classes.dex */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            d.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            d.this.scheduleSelf(runnable, j2);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            d.this.unscheduleSelf(runnable);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public i f11744a;

        /* renamed from: b  reason: collision with root package name */
        public AnimatorSet f11745b;
        public ArrayList<Animator> c;

        /* renamed from: d  reason: collision with root package name */
        public p.b<Animator, String> f11746d;

        public b(a aVar) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f11747a;

        public c(Drawable.ConstantState constantState) {
            this.f11747a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f11747a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f11747a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            d dVar = new d();
            Drawable newDrawable = this.f11747a.newDrawable();
            dVar.f11751i = newDrawable;
            newDrawable.setCallback(dVar.n);
            return dVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            d dVar = new d();
            Drawable newDrawable = this.f11747a.newDrawable(resources);
            dVar.f11751i = newDrawable;
            newDrawable.setCallback(dVar.n);
            return dVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            d dVar = new d();
            Drawable newDrawable = this.f11747a.newDrawable(resources, theme);
            dVar.f11751i = newDrawable;
            newDrawable.setCallback(dVar.n);
            return dVar;
        }
    }

    public d() {
        this(null);
    }

    public d(Context context) {
        this.f11741l = null;
        this.f11742m = null;
        a aVar = new a();
        this.n = aVar;
        this.f11740k = context;
        this.f11739j = new b(aVar);
    }

    @Override // i4.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            a.b.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            return a.b.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f11739j;
        bVar.f11744a.draw(canvas);
        if (bVar.f11745b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            return a.C0214a.a(drawable);
        }
        return this.f11739j.f11744a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f11739j.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            return a.b.c(drawable);
        }
        return this.f11739j.f11744a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f11751i == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f11751i.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f11751i;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f11739j.f11744a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f11751i;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f11739j.f11744a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f11751i;
        return drawable != null ? drawable.getOpacity() : this.f11739j.f11744a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x017c, code lost:
        if (r8.f11745b != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017e, code lost:
        r8.f11745b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0185, code lost:
        r8.f11745b.playTogether(r8.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018c, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlResourceParser animation;
        Animator a10;
        i iVar;
        int next;
        i iVar2;
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            a.b.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            b bVar = this.f11739j;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                XmlResourceParser xmlResourceParser = null;
                if ("animated-vector".equals(name)) {
                    TypedArray g10 = k.g(resources, theme, attributeSet, i4.a.f11729e);
                    int resourceId = g10.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = i.f11752r;
                        if (Build.VERSION.SDK_INT >= 24) {
                            iVar = new i();
                            ThreadLocal<TypedValue> threadLocal = p2.f.f16726a;
                            iVar.f11751i = f.a.a(resources, resourceId, theme);
                            new i.h(iVar.f11751i.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                while (true) {
                                    next = xml.next();
                                    if (next == 2 || next == 1) {
                                        break;
                                    }
                                }
                                if (next == 2) {
                                    iVar = new i();
                                    iVar.inflate(resources, xml, asAttributeSet, theme);
                                } else {
                                    throw new XmlPullParserException("No start tag found");
                                    break;
                                }
                            } catch (IOException e10) {
                                e = e10;
                                Log.e("VectorDrawableCompat", "parser error", e);
                                iVar = null;
                                iVar.n = false;
                                iVar.setCallback(this.n);
                                iVar2 = bVar.f11744a;
                                if (iVar2 != null) {
                                }
                                bVar.f11744a = iVar;
                                g10.recycle();
                                eventType = xmlPullParser.next();
                            } catch (XmlPullParserException e11) {
                                e = e11;
                                Log.e("VectorDrawableCompat", "parser error", e);
                                iVar = null;
                                iVar.n = false;
                                iVar.setCallback(this.n);
                                iVar2 = bVar.f11744a;
                                if (iVar2 != null) {
                                }
                                bVar.f11744a = iVar;
                                g10.recycle();
                                eventType = xmlPullParser.next();
                            }
                        }
                        iVar.n = false;
                        iVar.setCallback(this.n);
                        iVar2 = bVar.f11744a;
                        if (iVar2 != null) {
                            iVar2.setCallback(null);
                        }
                        bVar.f11744a = iVar;
                    }
                    g10.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, i4.a.f11730f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f11740k;
                        if (context != null) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                a10 = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                Resources resources2 = context.getResources();
                                Resources.Theme theme2 = context.getTheme();
                                try {
                                    try {
                                        animation = resources2.getAnimation(resourceId2);
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                } catch (IOException e12) {
                                    e = e12;
                                } catch (XmlPullParserException e13) {
                                    e = e13;
                                }
                                try {
                                    a10 = f.a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                    animation.close();
                                } catch (IOException e14) {
                                    e = e14;
                                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException.initCause(e);
                                    throw notFoundException;
                                } catch (XmlPullParserException e15) {
                                    e = e15;
                                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException2.initCause(e);
                                    throw notFoundException2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    xmlResourceParser = animation;
                                    if (xmlResourceParser != null) {
                                        xmlResourceParser.close();
                                    }
                                    throw th;
                                }
                            }
                            a10.setTarget(bVar.f11744a.f11753j.f11799b.f11797o.getOrDefault(string, null));
                            if (bVar.c == null) {
                                bVar.c = new ArrayList<>();
                                bVar.f11746d = new p.b<>();
                            }
                            bVar.c.add(a10);
                            bVar.f11746d.put(a10, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            return a.C0214a.d(drawable);
        }
        return this.f11739j.f11744a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f11751i;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f11739j.f11745b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f11751i;
        return drawable != null ? drawable.isStateful() : this.f11739j.f11744a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f11739j.f11744a.setBounds(rect);
        }
    }

    @Override // i4.h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f11751i;
        return drawable != null ? drawable.setLevel(i10) : this.f11739j.f11744a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f11751i;
        return drawable != null ? drawable.setState(iArr) : this.f11739j.f11744a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f11739j.f11744a.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            a.C0214a.e(drawable, z10);
        } else {
            this.f11739j.f11744a.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f11739j.f11744a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            r2.a.d(drawable, i10);
        } else {
            this.f11739j.f11744a.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            r2.a.e(drawable, colorStateList);
        } else {
            this.f11739j.f11744a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            r2.a.f(drawable, mode);
        } else {
            this.f11739j.f11744a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f11739j.f11744a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f11739j;
        if (bVar.f11745b.isStarted()) {
            return;
        }
        bVar.f11745b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f11739j.f11745b.end();
        }
    }
}
