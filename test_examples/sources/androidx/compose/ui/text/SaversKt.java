package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt;
import o0.f;
import o0.g;

/* loaded from: classes.dex */
public final class SaversKt {

    /* renamed from: a  reason: collision with root package name */
    public static final f f4001a = SaverKt.a(SaversKt$AnnotatedStringSaver$1.f4018j, SaversKt$AnnotatedStringSaver$2.f4019j);

    /* renamed from: b  reason: collision with root package name */
    public static final f f4002b = SaverKt.a(SaversKt$AnnotationRangeListSaver$1.f4020j, SaversKt$AnnotationRangeListSaver$2.f4021j);
    public static final f c = SaverKt.a(SaversKt$AnnotationRangeSaver$1.f4022j, SaversKt$AnnotationRangeSaver$2.f4023j);

    /* renamed from: d  reason: collision with root package name */
    public static final f f4003d = SaverKt.a(SaversKt$VerbatimTtsAnnotationSaver$1.f4054j, SaversKt$VerbatimTtsAnnotationSaver$2.f4055j);

    /* renamed from: e  reason: collision with root package name */
    public static final f f4004e = SaverKt.a(SaversKt$UrlAnnotationSaver$1.f4052j, SaversKt$UrlAnnotationSaver$2.f4053j);

    /* renamed from: f  reason: collision with root package name */
    public static final f f4005f = SaverKt.a(SaversKt$ParagraphStyleSaver$1.f4036j, SaversKt$ParagraphStyleSaver$2.f4037j);

    /* renamed from: g  reason: collision with root package name */
    public static final f f4006g = SaverKt.a(SaversKt$SpanStyleSaver$1.f4040j, SaversKt$SpanStyleSaver$2.f4041j);

    /* renamed from: h  reason: collision with root package name */
    public static final f f4007h = SaverKt.a(SaversKt$TextDecorationSaver$1.f4042j, SaversKt$TextDecorationSaver$2.f4043j);

    /* renamed from: i  reason: collision with root package name */
    public static final f f4008i = SaverKt.a(SaversKt$TextGeometricTransformSaver$1.f4044j, SaversKt$TextGeometricTransformSaver$2.f4045j);

    /* renamed from: j  reason: collision with root package name */
    public static final f f4009j = SaverKt.a(SaversKt$TextIndentSaver$1.f4046j, SaversKt$TextIndentSaver$2.f4047j);

    /* renamed from: k  reason: collision with root package name */
    public static final f f4010k = SaverKt.a(SaversKt$FontWeightSaver$1.f4028j, SaversKt$FontWeightSaver$2.f4029j);

    /* renamed from: l  reason: collision with root package name */
    public static final f f4011l = SaverKt.a(SaversKt$BaselineShiftSaver$1.f4024j, SaversKt$BaselineShiftSaver$2.f4025j);

    /* renamed from: m  reason: collision with root package name */
    public static final f f4012m = SaverKt.a(SaversKt$TextRangeSaver$1.f4048j, SaversKt$TextRangeSaver$2.f4049j);
    public static final f n = SaverKt.a(SaversKt$ShadowSaver$1.f4038j, SaversKt$ShadowSaver$2.f4039j);

    /* renamed from: o  reason: collision with root package name */
    public static final f f4013o = SaverKt.a(SaversKt$ColorSaver$1.f4026j, SaversKt$ColorSaver$2.f4027j);

    /* renamed from: p  reason: collision with root package name */
    public static final f f4014p = SaverKt.a(SaversKt$TextUnitSaver$1.f4050j, SaversKt$TextUnitSaver$2.f4051j);

    /* renamed from: q  reason: collision with root package name */
    public static final f f4015q = SaverKt.a(SaversKt$OffsetSaver$1.f4034j, SaversKt$OffsetSaver$2.f4035j);

    /* renamed from: r  reason: collision with root package name */
    public static final f f4016r = SaverKt.a(SaversKt$LocaleListSaver$1.f4030j, SaversKt$LocaleListSaver$2.f4031j);

    /* renamed from: s  reason: collision with root package name */
    public static final f f4017s = SaverKt.a(SaversKt$LocaleSaver$1.f4032j, SaversKt$LocaleSaver$2.f4033j);

    public static final Object a(Object obj, f fVar, g gVar) {
        Object a10;
        v7.g.f(fVar, "saver");
        v7.g.f(gVar, "scope");
        return (obj == null || (a10 = fVar.a(gVar, obj)) == null) ? Boolean.FALSE : a10;
    }
}
