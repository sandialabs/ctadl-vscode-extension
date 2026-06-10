package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.navigation.b;
import androidx.navigation.v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class s {
    public static final ThreadLocal<TypedValue> c = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final Context f5528a;

    /* renamed from: b  reason: collision with root package name */
    public final y f5529b;

    public s(Context context, y yVar) {
        this.f5528a = context;
        this.f5529b = yVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static v a(TypedValue typedValue, v vVar, v vVar2, String str, String str2) {
        if (vVar != null && vVar != vVar2) {
            throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
        }
        return vVar2;
    }

    public static h d(TypedArray typedArray, Resources resources, int i10) {
        boolean z10;
        v vVar;
        v vVar2;
        v vVar3;
        v vVar4;
        boolean z11;
        Object obj;
        v vVar5;
        v a10;
        float f10;
        Object obj2;
        int dimension;
        boolean z12;
        v vVar6;
        String str;
        boolean z13 = typedArray.getBoolean(3, false);
        ThreadLocal<TypedValue> threadLocal = c;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        v vVar7 = v.c;
        v vVar8 = v.f5546h;
        v vVar9 = v.f5550l;
        v vVar10 = v.f5548j;
        v vVar11 = v.f5544f;
        v vVar12 = v.f5542d;
        v vVar13 = v.f5543e;
        v vVar14 = v.f5549k;
        v vVar15 = v.f5547i;
        v vVar16 = v.f5545g;
        v vVar17 = v.f5541b;
        v vVar18 = null;
        if (string != null) {
            vVar = vVar12;
            String resourcePackageName = resources.getResourcePackageName(i10);
            if ("integer".equals(string)) {
                z10 = z13;
                vVar2 = vVar13;
                vVar3 = vVar17;
            } else {
                z10 = z13;
                if ("integer[]".equals(string)) {
                    vVar2 = vVar13;
                    vVar3 = vVar;
                } else if ("long".equals(string)) {
                    vVar3 = vVar13;
                    vVar2 = vVar3;
                } else if ("long[]".equals(string)) {
                    vVar2 = vVar13;
                    vVar3 = vVar11;
                } else if ("boolean".equals(string)) {
                    vVar2 = vVar13;
                    vVar3 = vVar15;
                } else if ("boolean[]".equals(string)) {
                    vVar2 = vVar13;
                    vVar3 = vVar10;
                } else {
                    if (!"string".equals(string)) {
                        if ("string[]".equals(string)) {
                            vVar2 = vVar13;
                            vVar3 = vVar9;
                        } else if ("float".equals(string)) {
                            vVar2 = vVar13;
                            vVar3 = vVar16;
                        } else if ("float[]".equals(string)) {
                            vVar2 = vVar13;
                            vVar3 = vVar8;
                        } else if ("reference".equals(string)) {
                            vVar3 = vVar7;
                            vVar2 = vVar13;
                        } else if (!string.isEmpty()) {
                            try {
                                if (string.startsWith(".") && resourcePackageName != null) {
                                    str = resourcePackageName.concat(string);
                                } else {
                                    str = string;
                                }
                                if (string.endsWith("[]")) {
                                    vVar2 = vVar13;
                                    str = str.substring(0, str.length() - 2);
                                    Class<?> cls = Class.forName(str);
                                    if (Parcelable.class.isAssignableFrom(cls)) {
                                        vVar3 = new v.m(cls);
                                    } else {
                                        if (Serializable.class.isAssignableFrom(cls)) {
                                            vVar3 = new v.o(cls);
                                        }
                                        throw new IllegalArgumentException(str + " is not Serializable or Parcelable.");
                                    }
                                } else {
                                    vVar2 = vVar13;
                                    Class<?> cls2 = Class.forName(str);
                                    if (Parcelable.class.isAssignableFrom(cls2)) {
                                        vVar3 = new v.n(cls2);
                                    } else if (Enum.class.isAssignableFrom(cls2)) {
                                        vVar3 = new v.l(cls2);
                                    } else {
                                        if (Serializable.class.isAssignableFrom(cls2)) {
                                            vVar3 = new v.p(cls2);
                                        }
                                        throw new IllegalArgumentException(str + " is not Serializable or Parcelable.");
                                    }
                                }
                            } catch (ClassNotFoundException e10) {
                                throw new RuntimeException(e10);
                            }
                        }
                    }
                    vVar2 = vVar13;
                    vVar3 = vVar14;
                }
            }
        } else {
            z10 = z13;
            vVar = vVar12;
            vVar2 = vVar13;
            vVar3 = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            if (vVar3 == vVar7) {
                int i11 = typedValue.resourceId;
                if (i11 != 0) {
                    obj = Integer.valueOf(i11);
                    vVar4 = vVar2;
                    z11 = true;
                } else if (typedValue.type == 16 && typedValue.data == 0) {
                    obj = 0;
                    vVar6 = vVar3;
                    vVar3 = vVar6;
                    vVar4 = vVar2;
                    z11 = true;
                } else {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + vVar3.b() + ". Must be a reference to a resource.");
                }
            } else {
                int i12 = typedValue.resourceId;
                if (i12 != 0) {
                    if (vVar3 == 0) {
                        obj = Integer.valueOf(i12);
                        vVar6 = vVar7;
                        vVar3 = vVar6;
                        vVar4 = vVar2;
                        z11 = true;
                    } else {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + vVar3.b() + ". You must use a \"reference\" type to reference other resources.");
                    }
                } else {
                    z11 = true;
                    if (vVar3 == vVar14) {
                        obj = typedArray.getString(1);
                    } else {
                        int i13 = typedValue.type;
                        if (i13 != 3) {
                            if (i13 != 4) {
                                if (i13 != 5) {
                                    if (i13 != 18) {
                                        if (i13 >= 16 && i13 <= 31) {
                                            if (vVar3 == vVar16) {
                                                a10 = a(typedValue, vVar3, vVar16, string, "float");
                                                f10 = typedValue.data;
                                            } else {
                                                a10 = a(typedValue, vVar3, vVar17, string, "integer");
                                                dimension = typedValue.data;
                                            }
                                        } else {
                                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                                        }
                                    } else {
                                        a10 = a(typedValue, vVar3, vVar15, string, "boolean");
                                        if (typedValue.data != 0) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        obj2 = Boolean.valueOf(z12);
                                        Object obj3 = obj2;
                                        vVar3 = a10;
                                        obj = obj3;
                                    }
                                } else {
                                    a10 = a(typedValue, vVar3, vVar17, string, "dimension");
                                    dimension = (int) typedValue.getDimension(resources.getDisplayMetrics());
                                }
                                obj2 = Integer.valueOf(dimension);
                                Object obj32 = obj2;
                                vVar3 = a10;
                                obj = obj32;
                            } else {
                                a10 = a(typedValue, vVar3, vVar16, string, "float");
                                f10 = typedValue.getFloat();
                            }
                            obj2 = Float.valueOf(f10);
                            Object obj322 = obj2;
                            vVar3 = a10;
                            obj = obj322;
                        } else {
                            String charSequence = typedValue.string.toString();
                            if (vVar3 == null) {
                                try {
                                    vVar17.c(charSequence);
                                    vVar3 = vVar17;
                                } catch (IllegalArgumentException unused) {
                                    vVar4 = vVar2;
                                    try {
                                        try {
                                            try {
                                                vVar4.c(charSequence);
                                                vVar3 = vVar4;
                                            } catch (IllegalArgumentException unused2) {
                                                vVar3 = vVar14;
                                            }
                                        } catch (IllegalArgumentException unused3) {
                                            vVar15.c(charSequence);
                                            vVar3 = vVar15;
                                        }
                                    } catch (IllegalArgumentException unused4) {
                                        vVar16.c(charSequence);
                                        vVar3 = vVar16;
                                    }
                                }
                            }
                            vVar4 = vVar2;
                            obj = vVar3.c(charSequence);
                        }
                    }
                    vVar4 = vVar2;
                }
            }
        } else {
            vVar4 = vVar2;
            z11 = true;
            obj = null;
        }
        if (obj == null) {
            obj = null;
            z11 = false;
        }
        if (vVar3 != null) {
            vVar18 = vVar3;
        }
        if (vVar18 == null) {
            if (!(obj instanceof Integer)) {
                if (obj instanceof int[]) {
                    vVar5 = vVar;
                } else if (obj instanceof Long) {
                    vVar5 = vVar4;
                } else if (obj instanceof long[]) {
                    vVar5 = vVar11;
                } else if (obj instanceof Float) {
                    vVar5 = vVar16;
                } else if (obj instanceof float[]) {
                    vVar5 = vVar8;
                } else if (obj instanceof Boolean) {
                    vVar5 = vVar15;
                } else if (obj instanceof boolean[]) {
                    vVar5 = vVar10;
                } else {
                    if (!(obj instanceof String) && obj != null) {
                        if (obj instanceof String[]) {
                            vVar5 = vVar9;
                        } else if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
                            vVar17 = new v.m(obj.getClass().getComponentType());
                        } else if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
                            vVar17 = new v.o(obj.getClass().getComponentType());
                        } else if (obj instanceof Parcelable) {
                            vVar17 = new v.n(obj.getClass());
                        } else if (obj instanceof Enum) {
                            vVar17 = new v.l(obj.getClass());
                        } else if (obj instanceof Serializable) {
                            vVar17 = new v.p(obj.getClass());
                        } else {
                            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                        }
                    }
                    vVar5 = vVar14;
                }
            }
            vVar5 = vVar17;
        } else {
            vVar5 = vVar18;
        }
        return new h(vVar5, z10, obj, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x022f, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i10) {
        int depth;
        Context context;
        int i11;
        int depth2;
        String str;
        String str2;
        n a10 = this.f5529b.c(xmlResourceParser.getName()).a();
        Context context2 = this.f5528a;
        a10.t(context2, attributeSet);
        int i12 = 1;
        int depth3 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i12 || ((depth = xmlResourceParser.getDepth()) < depth3 && next == 3)) {
                break;
            } else if (next == 2 && depth <= depth3) {
                String name = xmlResourceParser.getName();
                boolean equals = "argument".equals(name);
                int[] iArr = ma.i.f16051s;
                if (equals) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    String string = obtainAttributes.getString(0);
                    if (string != null) {
                        h d5 = d(obtainAttributes, resources, i10);
                        if (a10.f5515p == null) {
                            a10.f5515p = new HashMap<>();
                        }
                        a10.f5515p.put(string, d5);
                        obtainAttributes.recycle();
                    } else {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                } else if ("deepLink".equals(name)) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, ma.i.f16052t);
                    String string2 = obtainAttributes2.getString(3);
                    String string3 = obtainAttributes2.getString(i12);
                    String string4 = obtainAttributes2.getString(2);
                    if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                    }
                    String str3 = null;
                    if (string2 != null) {
                        str = string2.replace("${applicationId}", context2.getPackageName());
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(string3)) {
                        str2 = string3.replace("${applicationId}", context2.getPackageName());
                        if (str2.isEmpty()) {
                            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                        }
                    } else {
                        str2 = null;
                    }
                    if (string4 != null) {
                        str3 = string4.replace("${applicationId}", context2.getPackageName());
                    }
                    l lVar = new l(str, str2, str3);
                    if (a10.n == null) {
                        a10.n = new ArrayList<>();
                    }
                    a10.n.add(lVar);
                    obtainAttributes2.recycle();
                } else {
                    if ("action".equals(name)) {
                        TypedArray obtainAttributes3 = resources.obtainAttributes(attributeSet, ma.i.f16050r);
                        int resourceId = obtainAttributes3.getResourceId(0, 0);
                        d dVar = new d(obtainAttributes3.getResourceId(i12, 0));
                        dVar.f5455b = new t(obtainAttributes3.getBoolean(4, false), obtainAttributes3.getResourceId(7, -1), obtainAttributes3.getBoolean(8, false), obtainAttributes3.getResourceId(2, -1), obtainAttributes3.getResourceId(3, -1), obtainAttributes3.getResourceId(5, -1), obtainAttributes3.getResourceId(6, -1));
                        Bundle bundle = new Bundle();
                        int i13 = 1;
                        int depth4 = xmlResourceParser.getDepth() + 1;
                        context = context2;
                        i11 = depth3;
                        int i14 = i10;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == i13 || ((depth2 = xmlResourceParser.getDepth()) < depth4 && next2 == 3)) {
                                break;
                            }
                            if (next2 == 2 && depth2 <= depth4) {
                                if ("argument".equals(xmlResourceParser.getName())) {
                                    TypedArray obtainAttributes4 = resources.obtainAttributes(attributeSet, iArr);
                                    String string5 = obtainAttributes4.getString(0);
                                    if (string5 != null) {
                                        h d10 = d(obtainAttributes4, resources, i14);
                                        boolean z10 = d10.c;
                                        if (z10 && z10) {
                                            d10.f5475a.d(bundle, string5, d10.f5477d);
                                        }
                                        obtainAttributes4.recycle();
                                    } else {
                                        throw new XmlPullParserException("Arguments must have a name");
                                    }
                                }
                                i14 = i10;
                            }
                            i13 = 1;
                        }
                        if (!bundle.isEmpty()) {
                            dVar.c = bundle;
                        }
                        if (!(a10 instanceof b.a)) {
                            if (resourceId != 0) {
                                if (a10.f5514o == null) {
                                    a10.f5514o = new p.i<>();
                                }
                                a10.f5514o.f(resourceId, dVar);
                                obtainAttributes3.recycle();
                            } else {
                                throw new IllegalArgumentException("Cannot have an action with actionId 0");
                            }
                        } else {
                            throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + a10 + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                        }
                    } else {
                        context = context2;
                        i11 = depth3;
                        if ("include".equals(name) && (a10 instanceof p)) {
                            TypedArray obtainAttributes5 = resources.obtainAttributes(attributeSet, a1.c.f67d);
                            ((p) a10).u(c(obtainAttributes5.getResourceId(0, 0)));
                            obtainAttributes5.recycle();
                        } else if (a10 instanceof p) {
                            ((p) a10).u(b(resources, xmlResourceParser, attributeSet, i10));
                        }
                    }
                    context2 = context;
                    depth3 = i11;
                    i12 = 1;
                }
                context = context2;
                i11 = depth3;
                context2 = context;
                depth3 = i11;
                i12 = 1;
            }
        }
    }

    @SuppressLint({"ResourceType"})
    public final p c(int i10) {
        int next;
        Resources resources = this.f5528a.getResources();
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        while (true) {
            try {
                try {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i10) + " line " + xml.getLineNumber(), e10);
                }
            } finally {
                xml.close();
            }
        }
        if (next == 2) {
            String name = xml.getName();
            n b5 = b(resources, xml, asAttributeSet, i10);
            if (b5 instanceof p) {
                p pVar = (p) b5;
                xml.close();
                return pVar;
            }
            throw new IllegalArgumentException("Root element <" + name + "> did not inflate into a NavGraph");
        }
        throw new XmlPullParserException("No start tag found");
    }
}
