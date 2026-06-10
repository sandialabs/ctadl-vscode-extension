package i4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import p2.k;
import q2.d;

/* loaded from: classes.dex */
public final class f {

    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<d.a[]> {

        /* renamed from: a  reason: collision with root package name */
        public d.a[] f11749a;

        @Override // android.animation.TypeEvaluator
        public final d.a[] evaluate(float f10, d.a[] aVarArr, d.a[] aVarArr2) {
            d.a[] aVarArr3 = aVarArr;
            d.a[] aVarArr4 = aVarArr2;
            if (q2.d.a(aVarArr3, aVarArr4)) {
                if (!q2.d.a(this.f11749a, aVarArr3)) {
                    this.f11749a = q2.d.e(aVarArr3);
                }
                for (int i10 = 0; i10 < aVarArr3.length; i10++) {
                    d.a aVar = this.f11749a[i10];
                    d.a aVar2 = aVarArr3[i10];
                    d.a aVar3 = aVarArr4[i10];
                    aVar.getClass();
                    aVar.f16875a = aVar2.f16875a;
                    int i11 = 0;
                    while (true) {
                        float[] fArr = aVar2.f16876b;
                        if (i11 < fArr.length) {
                            aVar.f16876b[i11] = (aVar3.f16876b[i11] * f10) + ((1.0f - f10) * fArr[i11]);
                            i11++;
                        }
                    }
                }
                return this.f11749a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0331, code lost:
        if (r32 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0333, code lost:
        if (r13 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0335, code lost:
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0344, code lost:
        if (r2.hasNext() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0346, code lost:
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0352, code lost:
        if (r33 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0354, code lost:
        r32.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0358, code lost:
        r32.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x035b, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x030a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i10) {
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        String str;
        PropertyValuesHolder propertyValuesHolder;
        int size;
        int i11;
        float f10;
        String str2;
        TypedValue peekValue;
        boolean z10;
        int i12;
        Keyframe ofInt;
        int resourceId;
        TypedValue peekValue2;
        boolean z11;
        ObjectAnimator objectAnimator;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        int depth = xmlResourceParser.getDepth();
        ValueAnimator valueAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlResourceParser.next();
            int i13 = 3;
            boolean z12 = false;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i14 = 1;
            if (next == 1) {
                break;
            }
            int i15 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator2 = new ObjectAnimator();
                    e(context, resources, theme, attributeSet, objectAnimator2, xmlResourceParser);
                    objectAnimator = objectAnimator2;
                } else if (name.equals("animator")) {
                    objectAnimator = e(context, resources, theme, attributeSet, null, xmlResourceParser);
                } else {
                    if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray g10 = k.g(resources2, theme2, attributeSet, i4.a.f11732h);
                        a(context, resources, theme, xmlResourceParser, attributeSet, animatorSet2, k.d(g10, xmlResourceParser, "ordering", 0, 0));
                        g10.recycle();
                        valueAnimator = animatorSet2;
                    } else {
                        String str3 = "propertyValuesHolder";
                        if (name.equals("propertyValuesHolder")) {
                            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                            ArrayList arrayList2 = null;
                            while (true) {
                                int eventType = xmlResourceParser.getEventType();
                                if (eventType == i13 || eventType == i14) {
                                    break;
                                } else if (eventType != i15) {
                                    xmlResourceParser.next();
                                } else {
                                    if (xmlResourceParser.getName().equals(str3)) {
                                        TypedArray g11 = k.g(resources2, theme2, asAttributeSet, i4.a.f11733i);
                                        String e10 = k.e(g11, xmlResourceParser, "propertyName", i13);
                                        int d5 = k.d(g11, xmlResourceParser, "valueType", i15, 4);
                                        int i16 = d5;
                                        ArrayList arrayList3 = null;
                                        while (true) {
                                            int next2 = xmlResourceParser.next();
                                            attributeSet2 = asAttributeSet;
                                            if (next2 == i13 || next2 == 1) {
                                                break;
                                            }
                                            if (xmlResourceParser.getName().equals("keyframe")) {
                                                int[] iArr = i4.a.f11734j;
                                                if (i16 == 4) {
                                                    TypedArray g12 = k.g(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                                    if (!k.f(xmlResourceParser, "value")) {
                                                        peekValue2 = null;
                                                    } else {
                                                        peekValue2 = g12.peekValue(0);
                                                    }
                                                    if (peekValue2 != null) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11 && d(peekValue2.type)) {
                                                        i16 = 3;
                                                    } else {
                                                        i16 = 0;
                                                    }
                                                    g12.recycle();
                                                }
                                                TypedArray g13 = k.g(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                                str2 = str3;
                                                float c = k.c(g13, xmlResourceParser, "fraction", 3, -1.0f);
                                                if (!k.f(xmlResourceParser, "value")) {
                                                    peekValue = null;
                                                } else {
                                                    peekValue = g13.peekValue(0);
                                                }
                                                if (peekValue != null) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (i16 == 4) {
                                                    if (z10 && d(peekValue.type)) {
                                                        i12 = 3;
                                                    } else {
                                                        i12 = 0;
                                                    }
                                                } else {
                                                    i12 = i16;
                                                }
                                                if (z10) {
                                                    if (i12 != 0) {
                                                        if (i12 != 1 && i12 != 3) {
                                                            ofInt = null;
                                                        } else {
                                                            ofInt = Keyframe.ofInt(c, k.d(g13, xmlResourceParser, "value", 0, 0));
                                                        }
                                                    } else {
                                                        ofInt = Keyframe.ofFloat(c, k.c(g13, xmlResourceParser, "value", 0, 0.0f));
                                                    }
                                                } else if (i12 == 0) {
                                                    ofInt = Keyframe.ofFloat(c);
                                                } else {
                                                    ofInt = Keyframe.ofInt(c);
                                                }
                                                if (!k.f(xmlResourceParser, "interpolator")) {
                                                    resourceId = 0;
                                                } else {
                                                    resourceId = g13.getResourceId(1, 0);
                                                }
                                                if (resourceId > 0) {
                                                    ofInt.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                                }
                                                g13.recycle();
                                                ArrayList arrayList4 = arrayList3;
                                                if (ofInt != null) {
                                                    if (arrayList4 == null) {
                                                        arrayList4 = new ArrayList();
                                                    }
                                                    arrayList4.add(ofInt);
                                                    arrayList3 = arrayList4;
                                                }
                                                xmlResourceParser.next();
                                            } else {
                                                str2 = str3;
                                                ArrayList arrayList5 = arrayList3;
                                            }
                                            resources2 = resources;
                                            theme2 = theme;
                                            asAttributeSet = attributeSet2;
                                            str3 = str2;
                                            i13 = 3;
                                        }
                                        str = str3;
                                        ArrayList arrayList6 = arrayList3;
                                        if (arrayList6 != null && (size = arrayList6.size()) > 0) {
                                            Keyframe keyframe = (Keyframe) arrayList6.get(0);
                                            Keyframe keyframe2 = (Keyframe) arrayList6.get(size - 1);
                                            float fraction = keyframe2.getFraction();
                                            if (fraction < 1.0f) {
                                                if (fraction < 0.0f) {
                                                    keyframe2.setFraction(1.0f);
                                                } else {
                                                    arrayList6.add(arrayList6.size(), b(keyframe2, 1.0f));
                                                    size++;
                                                }
                                            }
                                            float fraction2 = keyframe.getFraction();
                                            if (fraction2 != 0.0f) {
                                                if (fraction2 < 0.0f) {
                                                    keyframe.setFraction(0.0f);
                                                } else {
                                                    arrayList6.add(0, b(keyframe, 0.0f));
                                                    size++;
                                                }
                                            }
                                            Keyframe[] keyframeArr = new Keyframe[size];
                                            arrayList6.toArray(keyframeArr);
                                            int i17 = 0;
                                            while (i17 < size) {
                                                Keyframe keyframe3 = keyframeArr[i17];
                                                if (keyframe3.getFraction() < 0.0f) {
                                                    if (i17 == 0) {
                                                        f10 = 0.0f;
                                                    } else {
                                                        int i18 = size - 1;
                                                        if (i17 == i18) {
                                                            f10 = 1.0f;
                                                        } else {
                                                            int i19 = i17 + 1;
                                                            int i20 = i17;
                                                            while (i19 < i18 && keyframeArr[i19].getFraction() < 0.0f) {
                                                                int i21 = i19;
                                                                i19++;
                                                                i20 = i21;
                                                            }
                                                            float fraction3 = (keyframeArr[i20 + 1].getFraction() - keyframeArr[i17 - 1].getFraction()) / ((i20 - i17) + 2);
                                                            int i22 = i17;
                                                            while (true) {
                                                                i11 = size;
                                                                if (i22 <= i20) {
                                                                    keyframeArr[i22].setFraction(keyframeArr[i22 - 1].getFraction() + fraction3);
                                                                    i22++;
                                                                    size = i11;
                                                                    i20 = i20;
                                                                }
                                                            }
                                                            i17++;
                                                            size = i11;
                                                        }
                                                    }
                                                    keyframe3.setFraction(f10);
                                                }
                                                i11 = size;
                                                i17++;
                                                size = i11;
                                            }
                                            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(e10, keyframeArr);
                                            i13 = 3;
                                            if (i16 == 3) {
                                                propertyValuesHolder.setEvaluator(g.f11750a);
                                            }
                                        } else {
                                            i13 = 3;
                                            propertyValuesHolder = null;
                                        }
                                        if (propertyValuesHolder == null) {
                                            propertyValuesHolder = c(g11, d5, 0, 1, e10);
                                        }
                                        if (propertyValuesHolder != null) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(propertyValuesHolder);
                                        }
                                        g11.recycle();
                                    } else {
                                        attributeSet2 = asAttributeSet;
                                        str = str3;
                                    }
                                    xmlResourceParser.next();
                                    resources2 = resources;
                                    theme2 = theme;
                                    asAttributeSet = attributeSet2;
                                    str3 = str;
                                    i14 = 1;
                                    i15 = 2;
                                }
                            }
                            if (arrayList2 != null) {
                                int size2 = arrayList2.size();
                                propertyValuesHolderArr = new PropertyValuesHolder[size2];
                                for (int i23 = 0; i23 < size2; i23++) {
                                    propertyValuesHolderArr[i23] = (PropertyValuesHolder) arrayList2.get(i23);
                                }
                            } else {
                                propertyValuesHolderArr = null;
                            }
                            if (propertyValuesHolderArr != null && (valueAnimator instanceof ValueAnimator)) {
                                valueAnimator.setValues(propertyValuesHolderArr);
                            }
                            z12 = true;
                        } else {
                            throw new RuntimeException("Unknown animator name: " + xmlResourceParser.getName());
                        }
                    }
                    if (animatorSet != null && !z12) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(valueAnimator);
                    }
                    resources2 = resources;
                    theme2 = theme;
                }
                valueAnimator = objectAnimator;
                if (animatorSet != null) {
                    if (arrayList == null) {
                    }
                    arrayList.add(valueAnimator);
                }
                resources2 = resources;
                theme2 = theme;
            }
        }
    }

    public static Keyframe b(Keyframe keyframe, float f10) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f10) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f10) : Keyframe.ofObject(f10);
    }

    public static PropertyValuesHolder c(TypedArray typedArray, int i10, int i11, int i12, String str) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i11);
        boolean z10 = peekValue != null;
        int i13 = z10 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i12);
        boolean z11 = peekValue2 != null;
        int i14 = z11 ? peekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z10 && d(i13)) || (z11 && d(i14))) ? 3 : 0;
        }
        boolean z12 = i10 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i10 != 2) {
            g gVar = i10 == 3 ? g.f11750a : null;
            if (z12) {
                if (z10) {
                    float dimension = i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                    if (z11) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z10) {
                int dimension2 = i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : d(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
                if (z11) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : d(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z11) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : d(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
            }
            if (propertyValuesHolder == null || gVar == null) {
                return propertyValuesHolder;
            }
            propertyValuesHolder.setEvaluator(gVar);
            return propertyValuesHolder;
        }
        String string = typedArray.getString(i11);
        String string2 = typedArray.getString(i12);
        d.a[] c = q2.d.c(string);
        d.a[] c10 = q2.d.c(string2);
        if (c == null && c10 == null) {
            return null;
        }
        if (c == null) {
            if (c10 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), c10);
            }
            return null;
        }
        a aVar = new a();
        if (c10 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, aVar, c);
        } else if (!q2.d.a(c, c10)) {
            throw new InflateException(" Can't morph from " + string + " to " + string2);
        } else {
            ofObject = PropertyValuesHolder.ofObject(str, aVar, c, c10);
        }
        return ofObject;
    }

    public static boolean d(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    public static ValueAnimator e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        TypedArray g10 = k.g(resources, theme, attributeSet, i4.a.f11731g);
        TypedArray g11 = k.g(resources, theme, attributeSet, i4.a.f11735k);
        if (objectAnimator == null) {
            valueAnimator = new ValueAnimator();
        } else {
            valueAnimator = objectAnimator;
        }
        long d5 = k.d(g10, xmlResourceParser, "duration", 1, 300);
        int i12 = 0;
        long d10 = k.d(g10, xmlResourceParser, "startOffset", 2, 0);
        int d11 = k.d(g10, xmlResourceParser, "valueType", 7, 4);
        if (k.f(xmlResourceParser, "valueFrom") && k.f(xmlResourceParser, "valueTo")) {
            if (d11 == 4) {
                TypedValue peekValue = g10.peekValue(5);
                if (peekValue != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10 = peekValue.type;
                } else {
                    i10 = 0;
                }
                TypedValue peekValue2 = g10.peekValue(6);
                if (peekValue2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i11 = peekValue2.type;
                } else {
                    i11 = 0;
                }
                if ((z10 && d(i10)) || (z11 && d(i11))) {
                    d11 = 3;
                } else {
                    d11 = 0;
                }
            }
            PropertyValuesHolder c = c(g10, d11, 5, 6, "");
            if (c != null) {
                valueAnimator.setValues(c);
            }
        }
        valueAnimator.setDuration(d5);
        valueAnimator.setStartDelay(d10);
        valueAnimator.setRepeatCount(k.d(g10, xmlResourceParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(k.d(g10, xmlResourceParser, "repeatMode", 4, 1));
        if (g11 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String e10 = k.e(g11, xmlResourceParser, "pathData", 1);
            if (e10 != null) {
                String e11 = k.e(g11, xmlResourceParser, "propertyXName", 2);
                String e12 = k.e(g11, xmlResourceParser, "propertyYName", 3);
                if (e11 == null && e12 == null) {
                    throw new InflateException(g11.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path d12 = q2.d.d(e10);
                PathMeasure pathMeasure = new PathMeasure(d12, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f10 = 0.0f;
                do {
                    f10 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f10));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(d12, false);
                int min = Math.min(100, ((int) (f10 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f11 = f10 / (min - 1);
                valueAnimator2 = valueAnimator;
                typedArray = g10;
                int i13 = 0;
                float f12 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i12 >= min) {
                        break;
                    }
                    int i14 = min;
                    pathMeasure2.getPosTan(f12 - ((Float) arrayList.get(i13)).floatValue(), fArr3, null);
                    fArr[i12] = fArr3[0];
                    fArr2[i12] = fArr3[1];
                    f12 += f11;
                    int i15 = i13 + 1;
                    if (i15 < arrayList.size() && f12 > ((Float) arrayList.get(i15)).floatValue()) {
                        pathMeasure2.nextContour();
                        i13 = i15;
                    }
                    i12++;
                    min = i14;
                }
                if (e11 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(e11, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (e12 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(e12, fArr2);
                }
                if (propertyValuesHolder2 == null) {
                    i12 = 0;
                    objectAnimator2.setValues(propertyValuesHolder);
                } else {
                    i12 = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator2.setValues(propertyValuesHolder2);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolder2, propertyValuesHolder);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator;
                typedArray = g10;
                objectAnimator2.setPropertyName(k.e(g11, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator;
            typedArray = g10;
        }
        if (!k.f(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            i12 = typedArray2.getResourceId(i12, i12);
        }
        if (i12 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i12));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (g11 != null) {
            g11.recycle();
        }
        return valueAnimator3;
    }
}
