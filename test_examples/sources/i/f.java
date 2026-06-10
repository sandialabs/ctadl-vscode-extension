package i;

import a3.q;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.j0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class f extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class<?>[] f11633e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f11634f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f11635a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f11636b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public Object f11637d;

    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public final Object f11638a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f11639b;

        public a(Object obj, String str) {
            this.f11638a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f11639b = cls.getMethod(str, c);
            } catch (Exception e10) {
                StringBuilder p10 = a4.b.p("Couldn't resolve menu item onClick handler ", str, " in class ");
                p10.append(cls.getName());
                InflateException inflateException = new InflateException(p10.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f11639b;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f11638a;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public CharSequence A;
        public CharSequence B;

        /* renamed from: a  reason: collision with root package name */
        public final Menu f11640a;

        /* renamed from: h  reason: collision with root package name */
        public boolean f11646h;

        /* renamed from: i  reason: collision with root package name */
        public int f11647i;

        /* renamed from: j  reason: collision with root package name */
        public int f11648j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f11649k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f11650l;

        /* renamed from: m  reason: collision with root package name */
        public int f11651m;
        public char n;

        /* renamed from: o  reason: collision with root package name */
        public int f11652o;

        /* renamed from: p  reason: collision with root package name */
        public char f11653p;

        /* renamed from: q  reason: collision with root package name */
        public int f11654q;

        /* renamed from: r  reason: collision with root package name */
        public int f11655r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f11656s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f11657t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f11658u;

        /* renamed from: v  reason: collision with root package name */
        public int f11659v;

        /* renamed from: w  reason: collision with root package name */
        public int f11660w;

        /* renamed from: x  reason: collision with root package name */
        public String f11661x;

        /* renamed from: y  reason: collision with root package name */
        public String f11662y;

        /* renamed from: z  reason: collision with root package name */
        public a3.b f11663z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: b  reason: collision with root package name */
        public int f11641b = 0;
        public int c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f11642d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f11643e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f11644f = true;

        /* renamed from: g  reason: collision with root package name */
        public boolean f11645g = true;

        public b(Menu menu) {
            this.f11640a = menu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            boolean z10;
            MenuItem enabled = menuItem.setChecked(this.f11656s).setVisible(this.f11657t).setEnabled(this.f11658u);
            boolean z11 = false;
            if (this.f11655r >= 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            enabled.setCheckable(z10).setTitleCondensed(this.f11650l).setIcon(this.f11651m);
            int i10 = this.f11659v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            String str = this.f11662y;
            f fVar = f.this;
            if (str != null) {
                if (!fVar.c.isRestricted()) {
                    if (fVar.f11637d == null) {
                        fVar.f11637d = f.a(fVar.c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(fVar.f11637d, this.f11662y));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f11655r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.h) {
                    androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) menuItem;
                    hVar.f659x = (hVar.f659x & (-5)) | 4;
                } else if (menuItem instanceof j.c) {
                    j.c cVar = (j.c) menuItem;
                    try {
                        Method method = cVar.f12610e;
                        t2.b bVar = cVar.f12609d;
                        if (method == null) {
                            cVar.f12610e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        cVar.f12610e.invoke(bVar, Boolean.TRUE);
                    } catch (Exception e10) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                    }
                }
            }
            String str2 = this.f11661x;
            if (str2 != null) {
                menuItem.setActionView((View) a(str2, f.f11633e, fVar.f11635a));
                z11 = true;
            }
            int i11 = this.f11660w;
            if (i11 > 0) {
                if (!z11) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            a3.b bVar2 = this.f11663z;
            if (bVar2 != null) {
                if (menuItem instanceof t2.b) {
                    ((t2.b) menuItem).a(bVar2);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            q.a(menuItem, this.A);
            CharSequence charSequence = this.B;
            boolean z12 = menuItem instanceof t2.b;
            if (z12) {
                ((t2.b) menuItem).setTooltipText(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                q.a.m(menuItem, charSequence);
            }
            char c = this.n;
            int i12 = this.f11652o;
            if (z12) {
                ((t2.b) menuItem).setAlphabeticShortcut(c, i12);
            } else if (Build.VERSION.SDK_INT >= 26) {
                q.a.g(menuItem, c, i12);
            }
            char c10 = this.f11653p;
            int i13 = this.f11654q;
            if (z12) {
                ((t2.b) menuItem).setNumericShortcut(c10, i13);
            } else if (Build.VERSION.SDK_INT >= 26) {
                q.a.k(menuItem, c10, i13);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z12) {
                    ((t2.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    q.a.j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                if (z12) {
                    ((t2.b) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    q.a.i(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f11633e = clsArr;
        f11634f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.f11635a = objArr;
        this.f11636b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i10;
        char charAt;
        char charAt2;
        int i11;
        boolean z10;
        a3.b bVar;
        ColorStateList colorStateList;
        b bVar2 = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        while (!z11) {
            if (eventType != 1) {
                Menu menu2 = bVar2.f11640a;
                if (eventType != i10) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z12 && name2.equals(str)) {
                            z12 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            bVar2.f11641b = 0;
                            bVar2.c = 0;
                            bVar2.f11642d = 0;
                            bVar2.f11643e = 0;
                            bVar2.f11644f = true;
                            bVar2.f11645g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar2.f11646h) {
                                a3.b bVar3 = bVar2.f11663z;
                                if (bVar3 != null && bVar3.a()) {
                                    bVar2.f11646h = true;
                                    bVar2.b(menu2.addSubMenu(bVar2.f11641b, bVar2.f11647i, bVar2.f11648j, bVar2.f11649k).getItem());
                                } else {
                                    bVar2.f11646h = true;
                                    bVar2.b(menu2.add(bVar2.f11641b, bVar2.f11647i, bVar2.f11648j, bVar2.f11649k));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z11 = true;
                        }
                        eventType = xmlResourceParser.next();
                        i10 = 2;
                    }
                    eventType = xmlResourceParser.next();
                    i10 = 2;
                } else {
                    if (!z12) {
                        String name3 = xmlResourceParser.getName();
                        boolean equals = name3.equals("group");
                        f fVar = f.this;
                        if (equals) {
                            TypedArray obtainStyledAttributes = fVar.c.obtainStyledAttributes(attributeSet, a1.b.f64z);
                            bVar2.f11641b = obtainStyledAttributes.getResourceId(1, 0);
                            bVar2.c = obtainStyledAttributes.getInt(3, 0);
                            bVar2.f11642d = obtainStyledAttributes.getInt(4, 0);
                            bVar2.f11643e = obtainStyledAttributes.getInt(5, 0);
                            bVar2.f11644f = obtainStyledAttributes.getBoolean(2, true);
                            bVar2.f11645g = obtainStyledAttributes.getBoolean(0, true);
                            obtainStyledAttributes.recycle();
                        } else {
                            if (name3.equals("item")) {
                                Context context = fVar.c;
                                d1 d1Var = new d1(context, context.obtainStyledAttributes(attributeSet, a1.b.A));
                                bVar2.f11647i = d1Var.i(2, 0);
                                bVar2.f11648j = (d1Var.h(5, bVar2.c) & (-65536)) | (d1Var.h(6, bVar2.f11642d) & 65535);
                                bVar2.f11649k = d1Var.k(7);
                                bVar2.f11650l = d1Var.k(8);
                                bVar2.f11651m = d1Var.i(0, 0);
                                String j2 = d1Var.j(9);
                                if (j2 == null) {
                                    charAt = 0;
                                } else {
                                    charAt = j2.charAt(0);
                                }
                                bVar2.n = charAt;
                                bVar2.f11652o = d1Var.h(16, 4096);
                                String j10 = d1Var.j(10);
                                if (j10 == null) {
                                    charAt2 = 0;
                                } else {
                                    charAt2 = j10.charAt(0);
                                }
                                bVar2.f11653p = charAt2;
                                bVar2.f11654q = d1Var.h(20, 4096);
                                if (d1Var.l(11)) {
                                    i11 = d1Var.a(11, false);
                                } else {
                                    i11 = bVar2.f11643e;
                                }
                                bVar2.f11655r = i11;
                                bVar2.f11656s = d1Var.a(3, false);
                                bVar2.f11657t = d1Var.a(4, bVar2.f11644f);
                                bVar2.f11658u = d1Var.a(1, bVar2.f11645g);
                                bVar2.f11659v = d1Var.h(21, -1);
                                bVar2.f11662y = d1Var.j(12);
                                bVar2.f11660w = d1Var.i(13, 0);
                                bVar2.f11661x = d1Var.j(15);
                                String j11 = d1Var.j(14);
                                if (j11 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && bVar2.f11660w == 0 && bVar2.f11661x == null) {
                                    bVar = (a3.b) bVar2.a(j11, f11634f, fVar.f11636b);
                                } else {
                                    if (z10) {
                                        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                    }
                                    bVar = null;
                                }
                                bVar2.f11663z = bVar;
                                bVar2.A = d1Var.k(17);
                                bVar2.B = d1Var.k(22);
                                if (d1Var.l(19)) {
                                    bVar2.D = j0.d(d1Var.h(19, -1), bVar2.D);
                                    colorStateList = null;
                                } else {
                                    colorStateList = null;
                                    bVar2.D = null;
                                }
                                if (d1Var.l(18)) {
                                    bVar2.C = d1Var.b(18);
                                } else {
                                    bVar2.C = colorStateList;
                                }
                                d1Var.n();
                                bVar2.f11646h = false;
                            } else if (name3.equals("menu")) {
                                bVar2.f11646h = true;
                                SubMenu addSubMenu = menu2.addSubMenu(bVar2.f11641b, bVar2.f11647i, bVar2.f11648j, bVar2.f11649k);
                                bVar2.b(addSubMenu.getItem());
                                b(xmlResourceParser, attributeSet, addSubMenu);
                            } else {
                                str = name3;
                                z12 = true;
                            }
                            eventType = xmlResourceParser.next();
                            i10 = 2;
                        }
                    }
                    eventType = xmlResourceParser.next();
                    i10 = 2;
                }
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof t2.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.c.getResources().getLayout(i10);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (IOException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
