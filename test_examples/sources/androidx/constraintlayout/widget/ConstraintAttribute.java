package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ConstraintAttribute {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4391a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4392b;
    public final AttributeType c;

    /* renamed from: d  reason: collision with root package name */
    public int f4393d;

    /* renamed from: e  reason: collision with root package name */
    public float f4394e;

    /* renamed from: f  reason: collision with root package name */
    public String f4395f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4396g;

    /* renamed from: h  reason: collision with root package name */
    public int f4397h;

    /* loaded from: classes.dex */
    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.f4391a = false;
        this.f4392b = constraintAttribute.f4392b;
        this.c = constraintAttribute.c;
        c(obj);
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj, boolean z10) {
        this.f4391a = false;
        this.f4392b = str;
        this.c = attributeType;
        this.f4391a = z10;
        c(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        AttributeType attributeType;
        int resourceId;
        Object string;
        float dimension;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), a1.c.f80r);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        AttributeType attributeType2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    attributeType = AttributeType.COLOR_TYPE;
                } else if (index == 2) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                } else {
                    AttributeType attributeType3 = AttributeType.DIMENSION_TYPE;
                    if (index == 7) {
                        dimension = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == 4) {
                        dimension = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else {
                        if (index == 5) {
                            attributeType = AttributeType.FLOAT_TYPE;
                            string = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                        } else {
                            if (index == 6) {
                                attributeType = AttributeType.INT_TYPE;
                                resourceId = obtainStyledAttributes.getInteger(index, -1);
                            } else if (index == 9) {
                                attributeType = AttributeType.STRING_TYPE;
                                string = obtainStyledAttributes.getString(index);
                            } else if (index == 8) {
                                attributeType = AttributeType.REFERENCE_TYPE;
                                resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                if (resourceId == -1) {
                                    resourceId = obtainStyledAttributes.getInt(index, -1);
                                }
                            }
                            string = Integer.valueOf(resourceId);
                        }
                        Object obj2 = string;
                        attributeType2 = attributeType;
                        obj = obj2;
                    }
                    obj = Float.valueOf(dimension);
                    attributeType2 = attributeType3;
                }
                resourceId = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(resourceId);
                Object obj22 = string;
                attributeType2 = attributeType;
                obj = obj22;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new ConstraintAttribute(str, attributeType2, obj, z10));
        }
        obtainStyledAttributes.recycle();
    }

    public static void b(View view, HashMap<String, ConstraintAttribute> hashMap) {
        StringBuilder sb;
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(str);
            String str2 = constraintAttribute.f4391a ? str : "set" + str;
            try {
            } catch (IllegalAccessException e10) {
                e = e10;
                sb = new StringBuilder(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", e11.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str2);
            } catch (InvocationTargetException e12) {
                e = e12;
                sb = new StringBuilder(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            }
            switch (constraintAttribute.c.ordinal()) {
                case 0:
                    cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f4393d));
                    continue;
                case 1:
                    cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f4394e));
                    continue;
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f4397h));
                    continue;
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    Method method = cls.getMethod(str2, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(constraintAttribute.f4397h);
                    method.invoke(view, colorDrawable);
                    continue;
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    cls.getMethod(str2, CharSequence.class).invoke(view, constraintAttribute.f4395f);
                    continue;
                case 5:
                    cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f4396g));
                    continue;
                case 6:
                    cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f4394e));
                    continue;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f4393d));
                    continue;
                default:
                    continue;
            }
            Log.e("TransitionLayout", e11.getMessage());
            Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
            Log.e("TransitionLayout", cls.getName() + " must have a method " + str2);
        }
    }

    public final void c(Object obj) {
        switch (this.c.ordinal()) {
            case 0:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f4393d = ((Integer) obj).intValue();
                return;
            case 1:
            case 6:
                this.f4394e = ((Float) obj).floatValue();
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                this.f4397h = ((Integer) obj).intValue();
                return;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                this.f4395f = (String) obj;
                return;
            case 5:
                this.f4396g = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}
