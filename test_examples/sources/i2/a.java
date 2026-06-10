package i2;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import ma.i;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f11675a;

    /* renamed from: b  reason: collision with root package name */
    public int f11676b = -1;
    public int c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final SparseArray<C0128a> f11677d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray<androidx.constraintlayout.widget.b> f11678e = new SparseArray<>();

    /* renamed from: i2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0128a {

        /* renamed from: a  reason: collision with root package name */
        public final int f11679a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<b> f11680b = new ArrayList<>();
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final androidx.constraintlayout.widget.b f11681d;

        public C0128a(Context context, XmlResourceParser xmlResourceParser) {
            this.c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), a1.c.f85w);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f11679a = obtainStyledAttributes.getResourceId(index, this.f11679a);
                } else if (index == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.c);
                    this.c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        this.f11681d = bVar;
                        bVar.c((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final float f11682a;

        /* renamed from: b  reason: collision with root package name */
        public final float f11683b;
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f11684d;

        /* renamed from: e  reason: collision with root package name */
        public final int f11685e;

        /* renamed from: f  reason: collision with root package name */
        public final androidx.constraintlayout.widget.b f11686f;

        public b(Context context, XmlResourceParser xmlResourceParser) {
            this.f11682a = Float.NaN;
            this.f11683b = Float.NaN;
            this.c = Float.NaN;
            this.f11684d = Float.NaN;
            this.f11685e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), a1.c.f87y);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f11685e);
                    this.f11685e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        this.f11686f = bVar;
                        bVar.c((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f11684d = obtainStyledAttributes.getDimension(index, this.f11684d);
                } else if (index == 2) {
                    this.f11683b = obtainStyledAttributes.getDimension(index, this.f11683b);
                } else if (index == 3) {
                    this.c = obtainStyledAttributes.getDimension(index, this.c);
                } else if (index == 4) {
                    this.f11682a = obtainStyledAttributes.getDimension(index, this.f11682a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final boolean a(float f10, float f11) {
            float f12 = this.f11682a;
            if (Float.isNaN(f12) || f10 >= f12) {
                float f13 = this.f11683b;
                if (Float.isNaN(f13) || f11 >= f13) {
                    float f14 = this.c;
                    if (Float.isNaN(f14) || f10 <= f14) {
                        float f15 = this.f11684d;
                        return Float.isNaN(f15) || f11 <= f15;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    public a(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f11675a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            C0128a c0128a = null;
            while (true) {
                char c = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType == 2) {
                            String name = xml.getName();
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 80204913:
                                    if (name.equals("State")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1657696882:
                                    if (name.equals("layoutDescription")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1901439077:
                                    if (name.equals("Variant")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c != 2) {
                                if (c != 3) {
                                    if (c == 4) {
                                        a(context, xml);
                                    }
                                } else {
                                    b bVar = new b(context, xml);
                                    if (c0128a != null) {
                                        c0128a.f11680b.add(bVar);
                                    }
                                }
                            } else {
                                C0128a c0128a2 = new C0128a(context, xml);
                                this.f11677d.put(c0128a2.f11679a, c0128a2);
                                c0128a = c0128a2;
                            }
                        }
                    } else {
                        xml.getName();
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public final void a(Context context, XmlResourceParser xmlResourceParser) {
        int i10;
        int eventType;
        b.a aVar;
        b.a e10;
        char c;
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i11 = 0; i11 < attributeCount; i11++) {
            String attributeName = xmlResourceParser.getAttributeName(i11);
            String attributeValue = xmlResourceParser.getAttributeValue(i11);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                if (attributeValue.contains("/")) {
                    i10 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i10 = -1;
                }
                if (i10 == -1) {
                    if (attributeValue.length() > 1) {
                        i10 = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    aVar = null;
                } catch (IOException e11) {
                    e11.printStackTrace();
                } catch (XmlPullParserException e12) {
                    e12.printStackTrace();
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c10 = 2;
                        if (eventType != 2) {
                            if (eventType == 3) {
                                String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                                switch (lowerCase.hashCode()) {
                                    case -2075718416:
                                        if (lowerCase.equals("guideline")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -190376483:
                                        if (lowerCase.equals("constraint")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 426575017:
                                        if (lowerCase.equals("constraintoverride")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2146106725:
                                        if (lowerCase.equals("constraintset")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                if (c != 0) {
                                    if (c == 1 || c == 2 || c == 3) {
                                        bVar.c.put(Integer.valueOf(aVar.f4481a), aVar);
                                        aVar = null;
                                    }
                                } else {
                                    this.f11678e.put(i10, bVar);
                                    return;
                                }
                            }
                        } else {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        c10 = 6;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        c10 = 7;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        c10 = 4;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        c10 = 5;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        c10 = '\t';
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c10 = '\b';
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                default:
                                    c10 = 65535;
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                    e10 = androidx.constraintlayout.widget.b.e(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    aVar = e10;
                                    break;
                                case 1:
                                    e10 = androidx.constraintlayout.widget.b.e(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    aVar = e10;
                                    break;
                                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                                    e10 = androidx.constraintlayout.widget.b.e(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    e10.f4483d.f4498a = true;
                                    aVar = e10;
                                    break;
                                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                                    e10 = androidx.constraintlayout.widget.b.e(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    e10.f4483d.f4511h0 = 1;
                                    aVar = e10;
                                    break;
                                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                                    if (aVar != null) {
                                        aVar.f4482b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                        break;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                case 5:
                                    if (aVar != null) {
                                        aVar.f4484e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                        break;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                case 6:
                                    if (aVar != null) {
                                        aVar.f4483d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                        break;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                    if (aVar != null) {
                                        aVar.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                        break;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                case '\b':
                                case i.f16046m /* 9 */:
                                    if (aVar != null) {
                                        ConstraintAttribute.a(context, xmlResourceParser, aVar.f4485f);
                                        break;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                this.f11678e.put(i10, bVar);
                return;
            }
        }
    }
}
