package a1;

import a3.w0;
import a7.f;
import a7.s0;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.o1;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.PaddingModifier;
import androidx.compose.foundation.layout.SpacerMeasurePolicy;
import androidx.compose.foundation.layout.c;
import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.draw.PainterModifier;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.graphics.SimpleGraphicsLayerModifier;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import c4.c;
import c8.k;
import com.noto.R;
import com.noto.app.note.NoteReminderReceiver;
import com.noto.app.widget.FolderListWidgetProvider;
import com.noto.app.widget.NoteListWidgetProvider;
import fa.b;
import g0.c0;
import g0.c1;
import g0.d;
import g0.d1;
import g0.e1;
import g0.g0;
import g0.j1;
import g0.t0;
import g0.v0;
import g0.z0;
import ha.h;
import j1.c;
import ja.j0;
import ja.p0;
import ja.q0;
import ja.s;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.builtins.e;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.j;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.r;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import l8.d;
import l8.d0;
import l8.z;
import m7.n;
import n7.i;
import org.koin.android.error.MissingAndroidContextException;
import org.koin.androidx.viewmodel.factory.StateViewModelFactory;
import org.koin.core.error.DefinitionOverrideException;
import q0.a;
import r.w;
import r.y;
import u7.p;
import u7.q;
import u8.l;
import ua.m1;
import ua.r0;
import v.t;
import v0.h0;
import v0.l0;
import v0.m;
import v0.v;
import v7.g;

/* loaded from: classes.dex */
public class c implements w0, c.InterfaceC0055c, l, j3.a, b.InterfaceC0118b {

    /* renamed from: g  reason: collision with root package name */
    public static z0.c f70g;

    /* renamed from: i  reason: collision with root package name */
    public static org.koin.core.a f72i;

    /* renamed from: j  reason: collision with root package name */
    public static Method f73j;

    /* renamed from: k  reason: collision with root package name */
    public static boolean f74k;

    /* renamed from: l  reason: collision with root package name */
    public static Field f75l;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f76m;

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f66b = {16842755, R.attr.action, R.attr.data, R.attr.dataPattern, R.attr.targetPackage};
    public static final int[] c = {R.attr.navGraph};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f67d = {R.attr.graph};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f68e = {R.attr.itemSpacing};

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f69f = {"application/json", "application/octet-stream"};

    /* renamed from: h  reason: collision with root package name */
    public static final c f71h = new c();
    public static final int[] n = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transformPivotTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.visibilityMode};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f77o = {16842948, 16842965, 16842966, 16842967, 16842968, 16842969, 16842972, 16842996, 16842997, 16842998, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843699, 16843700, 16843701, 16843702, 16843840, 16844091, 16844092, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.circularflow_angles, R.attr.circularflow_defaultAngle, R.attr.circularflow_defaultRadius, R.attr.circularflow_radiusInDP, R.attr.circularflow_viewCenter, R.attr.constraintSet, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layoutDescription, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_optimizationLevel, R.attr.layout_wrapBehaviorInParent};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f78p = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintRight_creator, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.motionTarget, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transformPivotTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.visibilityMode};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f79q = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843189, 16843190, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraintRotate, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.deriveConstraintsFrom, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionSteps, R.attr.transitionEasing, R.attr.transitionPathRotate};

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f80r = {R.attr.attributeName, R.attr.customBoolean, R.attr.customColorDrawableValue, R.attr.customColorValue, R.attr.customDimension, R.attr.customFloatValue, R.attr.customIntegerValue, R.attr.customPixelDimension, R.attr.customReference, R.attr.customStringValue, R.attr.methodName};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f81s = {16842948, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843701, 16843702, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.maxHeight, R.attr.maxWidth, R.attr.minHeight, R.attr.minWidth};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f82t = {R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.drawPath, R.attr.motionPathRotate, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transitionEasing};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f83u = {R.attr.onHide, R.attr.onShow};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f84v = {16842972, 16843551, R.attr.layout_constraintTag, R.attr.motionProgress, R.attr.visibilityMode};

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f85w = {16842960, R.attr.constraints};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f86x = {16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840, R.attr.transformPivotTarget};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f87y = {R.attr.constraints, R.attr.region_heightLessThan, R.attr.region_heightMoreThan, R.attr.region_widthLessThan, R.attr.region_widthMoreThan};

    /* renamed from: z  reason: collision with root package name */
    public static final r f88z = new r("COMPLETING_ALREADY");
    public static final r A = new r("COMPLETING_WAITING_CHILDREN");
    public static final r B = new r("COMPLETING_RETRY");
    public static final r C = new r("TOO_LATE_TO_CANCEL");
    public static final r D = new r("SEALED");
    public static final j0 E = new j0(false);
    public static final j0 F = new j0(true);
    public static final c G = new c();
    public static final r H = new r("CONDITION_FALSE");
    public static final r I = new r("LIST_EMPTY");
    public static final int[] J = {16843173, 16843551, 16844359, R.attr.alpha, R.attr.lStar};
    public static final int[] K = {R.attr.fontProviderAuthority, R.attr.fontProviderCerts, R.attr.fontProviderFetchStrategy, R.attr.fontProviderFetchTimeout, R.attr.fontProviderPackage, R.attr.fontProviderQuery, R.attr.fontProviderSystemFontFamily};
    public static final int[] L = {16844082, 16844083, 16844095, 16844143, 16844144, R.attr.font, R.attr.fontStyle, R.attr.fontVariationSettings, R.attr.fontWeight, R.attr.ttcIndex};
    public static final int[] M = {16843165, 16843166, 16843169, 16843170, 16843171, 16843172, 16843265, 16843275, 16844048, 16844049, 16844050, 16844051};
    public static final int[] N = {16843173, 16844052};
    public static final r O = new r("EMPTY");
    public static final r P = new r("OFFER_SUCCESS");
    public static final r Q = new r("OFFER_FAILED");
    public static final r R = new r("POLL_FAILED");
    public static final r S = new r("ENQUEUE_FAILED");
    public static final r T = new r("ON_CLOSE_HANDLER_INVOKED");
    public static final c U = new c();

    public /* synthetic */ c() {
    }

    public static final int A(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 3];
    }

    public static final Class A0(c8.b bVar) {
        g.f(bVar, "<this>");
        Class<?> e10 = ((v7.b) bVar).e();
        if (e10.isPrimitive()) {
            return e10;
        }
        String name = e10.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (!name.equals("java.lang.Integer")) {
                    break;
                } else {
                    return Integer.TYPE;
                }
            case -527879800:
                if (!name.equals("java.lang.Float")) {
                    break;
                } else {
                    return Float.TYPE;
                }
            case -515992664:
                if (!name.equals("java.lang.Short")) {
                    break;
                } else {
                    return Short.TYPE;
                }
            case 155276373:
                if (!name.equals("java.lang.Character")) {
                    break;
                } else {
                    return Character.TYPE;
                }
            case 344809556:
                if (!name.equals("java.lang.Boolean")) {
                    break;
                } else {
                    return Boolean.TYPE;
                }
            case 398507100:
                if (!name.equals("java.lang.Byte")) {
                    break;
                } else {
                    return Byte.TYPE;
                }
            case 398795216:
                if (!name.equals("java.lang.Long")) {
                    break;
                } else {
                    return Long.TYPE;
                }
            case 399092968:
                if (!name.equals("java.lang.Void")) {
                    break;
                } else {
                    return Void.TYPE;
                }
            case 761287205:
                if (!name.equals("java.lang.Double")) {
                    break;
                } else {
                    return Double.TYPE;
                }
        }
        return null;
    }

    public static final void A1(Object obj, p7.c cVar, p pVar) {
        Object Q2;
        g.f(cVar, "completion");
        try {
            v7.l.d(2, pVar);
            Q2 = pVar.R(obj, cVar);
        } catch (Throwable th) {
            Q2 = m0.b.Q(th);
        }
        if (Q2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            cVar.t(Q2);
        }
    }

    public static final boolean B(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 268435456) != 0;
    }

    public static final int B0(List list) {
        g.f(list, "<this>");
        return list.size() - 1;
    }

    public static final Object B1(kotlinx.coroutines.internal.p pVar, kotlinx.coroutines.internal.p pVar2, p pVar3) {
        Object sVar;
        Object o02;
        try {
            v7.l.d(2, pVar3);
            sVar = pVar3.R(pVar2, pVar);
        } catch (Throwable th) {
            sVar = new s(th, false);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (sVar != coroutineSingletons && (o02 = pVar.o0(sVar)) != A) {
            if (!(o02 instanceof s)) {
                return T1(o02);
            }
            throw ((s) o02).f12801a;
        }
        return coroutineSingletons;
    }

    public static final Object[] C(Object[] objArr, int i10, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        i.d2(objArr, objArr2, 0, 0, i10, 6);
        i.b2(objArr, objArr2, i10 + 2, i10, objArr.length);
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        return objArr2;
    }

    public static final c0 C0(CoroutineContext coroutineContext) {
        g.f(coroutineContext, "<this>");
        int i10 = c0.f11037b;
        c0 c0Var = (c0) coroutineContext.a(c0.a.f11038i);
        if (c0Var != null) {
            return c0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    public static final b8.g C1(b8.i iVar, int i10) {
        boolean z10;
        g.f(iVar, "<this>");
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Integer valueOf = Integer.valueOf(i10);
        g.f(valueOf, "step");
        if (z10) {
            if (iVar.f6499k <= 0) {
                i10 = -i10;
            }
            return new b8.g(iVar.f6497i, iVar.f6498j, i10);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final boolean D(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 1073741824) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c D0(l8.b bVar) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c cVar;
        l8.b bVar2;
        boolean z10;
        g.f(bVar, "<this>");
        int i10 = DescriptorUtilsKt.f14713a;
        Iterator<y9.r> it = bVar.r().U0().f().iterator();
        while (true) {
            cVar = null;
            if (it.hasNext()) {
                y9.r next = it.next();
                if (!e.y(next)) {
                    d c10 = next.U0().c();
                    if (!k9.d.n(c10, ClassKind.f13431i) && !k9.d.n(c10, ClassKind.f13433k)) {
                        z10 = false;
                        if (!z10) {
                            g.d(c10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            bVar2 = (l8.b) c10;
                            break;
                        }
                    }
                    z10 = true;
                    if (!z10) {
                    }
                }
            } else {
                bVar2 = null;
                break;
            }
        }
        if (bVar2 == null) {
            return null;
        }
        MemberScope B0 = bVar2.B0();
        if (B0 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c) {
            cVar = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c) B0;
        }
        if (cVar == null) {
            return D0(bVar2);
        }
        return cVar;
    }

    public static final long D1(String str, long j2, long j10, long j11) {
        String str2;
        boolean z10;
        int i10 = kotlinx.coroutines.internal.s.f15496a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 != null) {
            Long Q0 = h.Q0(str2);
            if (Q0 != null) {
                long longValue = Q0.longValue();
                if (j10 <= longValue && longValue <= j11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return longValue;
                }
                throw new IllegalStateException(("System property '" + str + "' should be in range " + j10 + ".." + j11 + ", but is '" + longValue + '\'').toString());
            }
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        return j2;
    }

    public static final int E(ArrayList arrayList, int i10, int i11) {
        int o12 = o1(arrayList, i10, i11);
        return o12 >= 0 ? o12 : -(o12 + 1);
    }

    public static final int E0(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                int i13 = i11 % i12;
                if (i13 < 0) {
                    i13 += i12;
                }
                int i14 = i10 % i12;
                if (i14 < 0) {
                    i14 += i12;
                }
                int i15 = (i13 - i14) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
                return i11 - i15;
            }
            return i11;
        } else if (i12 < 0) {
            if (i10 > i11) {
                int i16 = -i12;
                int i17 = i10 % i16;
                if (i17 < 0) {
                    i17 += i16;
                }
                int i18 = i11 % i16;
                if (i18 < 0) {
                    i18 += i16;
                }
                int i19 = (i17 - i18) % i16;
                if (i19 < 0) {
                    i19 += i16;
                }
                return i11 + i19;
            }
            return i11;
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    public static int E1(String str, int i10, int i11, int i12, int i13) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return (int) D1(str, i10, i11, i12);
    }

    public static final int F(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1] & 67108863;
    }

    public static final v.a F0(g0.d dVar) {
        dVar.f(1816710665);
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        dVar.f(-282936756);
        WeakHashMap<View, androidx.compose.foundation.layout.c> weakHashMap = androidx.compose.foundation.layout.c.f2010s;
        androidx.compose.foundation.layout.c c10 = c.a.c(dVar);
        dVar.u();
        dVar.u();
        return c10.f2016g;
    }

    public static final void F1() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final Object[] G(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        i.d2(objArr, objArr2, 0, 0, i10, 6);
        i.b2(objArr, objArr2, i10, i10 + 2, objArr.length);
        return objArr2;
    }

    public static final Method G0(Class cls, CallableMemberDescriptor callableMemberDescriptor) {
        g.f(callableMemberDescriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            g.e(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + callableMemberDescriptor + ')');
        }
    }

    public static final void G1(wa.a aVar, Number number) {
        g.f(aVar, "<this>");
        g.f(number, "result");
        wa.a.p(aVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final int H(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return p0(iArr[i11 + 1] >> 28) + iArr[i11 + 4];
    }

    public static final i0 H0(org.koin.core.scope.a aVar, kb.a aVar2, u7.a aVar3, c8.b bVar, u7.a aVar4) {
        k0.b aVar5;
        g.f(aVar, "<this>");
        g.f(bVar, "clazz");
        ab.a aVar6 = (ab.a) aVar3.k0();
        m1.a aVar7 = new m1.a(bVar, aVar2, aVar4, null, aVar6.f410a, aVar6.f411b);
        m0 m0Var = (m0) aVar7.f15903e;
        if (((b4.d) aVar7.f15904f) != null && ((Bundle) aVar7.f15902d) != null) {
            aVar5 = new StateViewModelFactory(aVar, aVar7);
        } else {
            aVar5 = new bb.a(aVar, aVar7);
        }
        k0 k0Var = new k0(m0Var, aVar5);
        Class y02 = y0((c8.b) aVar7.f15901b);
        kb.a aVar8 = (kb.a) aVar7.c;
        if (aVar8 != null) {
            return k0Var.b(y02, String.valueOf(aVar8));
        }
        return k0Var.a(y02);
    }

    public static final BlendMode H1(int i10) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (i10 == 0) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (i10 == 1) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (i10 == 2) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (i10 == 3) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (i10 == 4) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (i10 == 5) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (i10 == 6) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (i10 == 7) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (i10 == 8) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (i10 == 9) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (i10 == 10) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (i10 == 11) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (i10 == 12) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (i10 == 13) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (i10 == 14) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (i10 == 15) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (i10 == 16) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (i10 == 17) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (i10 == 18) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (i10 == 19) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (i10 == 20) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (i10 == 21) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (i10 == 22) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (i10 == 23) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (i10 == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (i10 == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (i10 == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (i10 == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (i10 == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final void I(int i10, int i11, int[] iArr) {
        ComposerKt.f(i11 >= 0);
        iArr[(i10 * 5) + 3] = i11;
    }

    public static q0.d I0(q0.d dVar, float f10, float f11, float f12, h0 h0Var, boolean z10, int i10) {
        float f13;
        float f14;
        float f15;
        float f16;
        long j2;
        h0 h0Var2;
        boolean z11;
        long j10;
        long j11;
        if ((i10 & 1) != 0) {
            f13 = 1.0f;
        } else {
            f13 = f10;
        }
        if ((i10 & 2) != 0) {
            f14 = 1.0f;
        } else {
            f14 = f11;
        }
        if ((i10 & 4) != 0) {
            f15 = 1.0f;
        } else {
            f15 = f12;
        }
        if ((i10 & 512) != 0) {
            f16 = 8.0f;
        } else {
            f16 = 0.0f;
        }
        if ((i10 & 1024) != 0) {
            j2 = l0.f18123a;
        } else {
            j2 = 0;
        }
        if ((i10 & 2048) != 0) {
            h0Var2 = v0.c0.f18087a;
        } else {
            h0Var2 = h0Var;
        }
        if ((i10 & 4096) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        if ((i10 & 16384) != 0) {
            j10 = v.f18139a;
        } else {
            j10 = 0;
        }
        if ((i10 & 32768) != 0) {
            j11 = v.f18139a;
        } else {
            j11 = 0;
        }
        g.f(dVar, "$this$graphicsLayer");
        g.f(h0Var2, "shape");
        return dVar.Z(new SimpleGraphicsLayerModifier(f13, f14, f15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f16, j2, h0Var2, z11, j10, j11, InspectableValueKt.f3744a));
    }

    public static final int I1(long j2) {
        w0.c f10 = v0.r.f(j2);
        if (f10.d()) {
            return (int) (j2 >>> 32);
        }
        float[] v02 = v0(j2);
        v0.p.j(f10, null, 3).a(v02);
        return ((int) ((v02[2] * 255.0f) + 0.5f)) | (((int) ((v02[3] * 255.0f) + 0.5f)) << 24) | (((int) ((v02[0] * 255.0f) + 0.5f)) << 16) | (((int) ((v02[1] * 255.0f) + 0.5f)) << 8);
    }

    public static final void J(int i10, int i11, int[] iArr) {
        ComposerKt.f(i11 >= 0 && i11 < 67108863);
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & (-67108864));
    }

    public static final int J0(sa.e eVar, sa.e[] eVarArr) {
        boolean z10;
        boolean z11;
        int i10;
        g.f(eVar, "<this>");
        g.f(eVarArr, "typeParams");
        int hashCode = (eVar.b().hashCode() * 31) + Arrays.hashCode(eVarArr);
        int c10 = eVar.c();
        int i11 = 1;
        while (true) {
            int i12 = 0;
            if (c10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            int i13 = c10 - 1;
            int i14 = i11 * 31;
            String b5 = eVar.j(eVar.c() - c10).b();
            if (b5 != null) {
                i12 = b5.hashCode();
            }
            i11 = i14 + i12;
            c10 = i13;
        }
        int c11 = eVar.c();
        int i15 = 1;
        while (true) {
            if (c11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i16 = c11 - 1;
                int i17 = i15 * 31;
                sa.h h10 = eVar.j(eVar.c() - c11).h();
                if (h10 != null) {
                    i10 = h10.hashCode();
                } else {
                    i10 = 0;
                }
                i15 = i17 + i10;
                c11 = i16;
            } else {
                return (((hashCode * 31) + i11) * 31) + i15;
            }
        }
    }

    public static final Bitmap.Config J1(int i10) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (!(i10 == 0)) {
            if (i10 == 1) {
                return Bitmap.Config.ALPHA_8;
            }
            if (i10 == 2) {
                return Bitmap.Config.RGB_565;
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 26) {
                if (i10 == 3) {
                    config2 = Bitmap.Config.RGBA_F16;
                    return config2;
                }
            }
            if (i11 >= 26) {
                if (i10 == 4) {
                    config = Bitmap.Config.HARDWARE;
                    return config;
                }
            }
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static f K(long[] jArr, String str) {
        return new f(jArr, true, 0L, false, false, str);
    }

    public static final String K0(c8.b bVar, kb.a aVar, kb.a aVar2) {
        String value;
        g.f(bVar, "clazz");
        g.f(aVar2, "scopeQualifier");
        String str = "";
        if (aVar != null && (value = aVar.getValue()) != null) {
            str = value;
        }
        return mb.a.a(bVar) + ':' + str + ':' + aVar2;
    }

    public static final Class K1(l8.f fVar) {
        if ((fVar instanceof l8.b) && k9.e.b(fVar)) {
            l8.b bVar = (l8.b) fVar;
            Class<?> j2 = f8.i.j(bVar);
            if (j2 != null) {
                return j2;
            }
            throw new KotlinReflectionInternalError("Class object for the class " + bVar.getName() + " cannot be found (classId=" + DescriptorUtilsKt.f((d) fVar) + ')');
        }
        return null;
    }

    public static s0 L(long[] jArr) {
        return new s0(jArr, true, 0L, false, false, null);
    }

    public static final void L0() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    public static final Class L1(y9.r rVar) {
        g.f(rVar, "<this>");
        Class K1 = K1(rVar.U0().c());
        if (K1 == null) {
            return null;
        }
        if (kotlin.reflect.jvm.internal.impl.types.r.g(rVar)) {
            y9.v e10 = k9.e.e(rVar);
            if (e10 == null || kotlin.reflect.jvm.internal.impl.types.r.g(e10) || e.H(e10)) {
                return null;
            }
            return K1;
        }
        return K1;
    }

    public static final void M(Throwable th, Throwable th2) {
        g.f(th, "<this>");
        g.f(th2, "exception");
        if (th != th2) {
            r7.b.f17134a.a(th, th2);
        }
    }

    public static final boolean M0(u0.e eVar) {
        g.f(eVar, "<this>");
        long j2 = eVar.f17732e;
        if (u0.a.b(j2) == u0.a.c(j2)) {
            float b5 = u0.a.b(j2);
            long j10 = eVar.f17733f;
            if (b5 == u0.a.b(j10)) {
                if (u0.a.b(j2) == u0.a.c(j10)) {
                    float b10 = u0.a.b(j2);
                    long j11 = eVar.f17734g;
                    if (b10 == u0.a.b(j11)) {
                        if (u0.a.b(j2) == u0.a.c(j11)) {
                            float b11 = u0.a.b(j2);
                            long j12 = eVar.f17735h;
                            if (b11 == u0.a.b(j12)) {
                                if (u0.a.b(j2) == u0.a.c(j12)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final v.l M1(q2.b bVar) {
        return new v.l(bVar.f16871a, bVar.f16872b, bVar.c, bVar.f16873d);
    }

    public static final Context N(org.koin.core.scope.a aVar) {
        g.f(aVar, "<this>");
        try {
            return (Context) aVar.a(null, v7.i.a(Context.class), null);
        } catch (Exception unused) {
            throw new MissingAndroidContextException();
        }
    }

    public static final List N0(Object obj) {
        List singletonList = Collections.singletonList(obj);
        g.e(singletonList, "singletonList(element)");
        return singletonList;
    }

    public static final PorterDuff.Mode N1(int i10) {
        if (i10 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i10 == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i10 == 2) {
            return PorterDuff.Mode.DST;
        }
        if (!(i10 == 3)) {
            if (i10 == 4) {
                return PorterDuff.Mode.DST_OVER;
            }
            if (i10 == 5) {
                return PorterDuff.Mode.SRC_IN;
            }
            if (i10 == 6) {
                return PorterDuff.Mode.DST_IN;
            }
            if (i10 == 7) {
                return PorterDuff.Mode.SRC_OUT;
            }
            if (i10 == 8) {
                return PorterDuff.Mode.DST_OUT;
            }
            if (i10 == 9) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            if (i10 == 10) {
                return PorterDuff.Mode.DST_ATOP;
            }
            if (i10 == 11) {
                return PorterDuff.Mode.XOR;
            }
            if (i10 == 12) {
                return PorterDuff.Mode.ADD;
            }
            if (i10 == 14) {
                return PorterDuff.Mode.SCREEN;
            }
            if (i10 == 15) {
                return PorterDuff.Mode.OVERLAY;
            }
            if (i10 == 16) {
                return PorterDuff.Mode.DARKEN;
            }
            if (i10 == 17) {
                return PorterDuff.Mode.LIGHTEN;
            }
            if (i10 == 13) {
                return PorterDuff.Mode.MULTIPLY;
            }
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static final ArrayList O(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new n7.f(objArr, true));
    }

    public static final List O0(Object... objArr) {
        g.f(objArr, "elements");
        if (objArr.length > 0) {
            return i.Z1(objArr);
        }
        return EmptyList.f12981i;
    }

    public static final String O1(float f10) {
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f11 = f10 * pow;
        int i10 = (int) f11;
        if (f11 - i10 >= 0.5f) {
            i10++;
        }
        float f12 = i10 / pow;
        return max > 0 ? String.valueOf(f12) : String.valueOf((int) f12);
    }

    public static final q0.d P(q0.d dVar, long j2, h0 h0Var) {
        g.f(dVar, "$this$background");
        g.f(h0Var, "shape");
        return dVar.Z(new s.b(new v0.r(j2), h0Var, InspectableValueKt.f3744a));
    }

    public static final List P0(Object obj) {
        if (obj != null) {
            return N0(obj);
        }
        return EmptyList.f12981i;
    }

    public static final int P1(int i10) {
        return i10 != 8 ? i10 != 16 ? R.drawable.widget_header_shape_large : R.drawable.widget_header_shape_medium : R.drawable.widget_header_shape_small;
    }

    public static final int Q(int[] iArr, int i10) {
        int length = iArr.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) >>> 1;
            int i13 = iArr[i12];
            if (i10 > i13) {
                i11 = i12 + 1;
            } else if (i10 >= i13) {
                return i12;
            } else {
                length = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final float Q0(long j2) {
        w0.c f10 = v0.r.f(j2);
        long j10 = f10.f18242b;
        int i10 = w0.b.f18240e;
        if (w0.b.a(j10, w0.b.f18237a)) {
            u7.l<Double, Double> lVar = ((Rgb) f10).n;
            double doubleValue = lVar.U(Double.valueOf(v0.r.h(j2))).doubleValue();
            double doubleValue2 = lVar.U(Double.valueOf(v0.r.e(j2))).doubleValue() * 0.0722d;
            float doubleValue3 = (float) (doubleValue2 + (lVar.U(Double.valueOf(v0.r.g(j2))).doubleValue() * 0.7152d) + (doubleValue * 0.2126d));
            if (doubleValue3 <= 0.0f) {
                return 0.0f;
            }
            if (doubleValue3 >= 1.0f) {
                return 1.0f;
            }
            return doubleValue3;
        }
        throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) w0.b.b(f10.f18242b))).toString());
    }

    public static final int Q1(int i10) {
        return i10 != 8 ? i10 != 16 ? R.drawable.widget_shape_large : R.drawable.widget_shape_medium : R.drawable.widget_shape_small;
    }

    public static final int R(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final double R0(u7.a aVar) {
        int i10 = ia.d.f11868b;
        ia.f fVar = new ia.f(System.nanoTime() - ia.d.f11867a);
        aVar.k0();
        return ia.b.toDouble-impl(fVar.elapsedNow-UwyO8pc(), TimeUnit.MILLISECONDS);
    }

    public static y R1(int i10, r.p pVar, int i11) {
        if ((i11 & 1) != 0) {
            i10 = 300;
        }
        if ((i11 & 4) != 0) {
            pVar = r.q.f17012a;
        }
        g.f(pVar, "easing");
        return new y(i10, 0, pVar);
    }

    public static final ListBuilder S(ListBuilder listBuilder) {
        if (listBuilder.f12996m == null) {
            listBuilder.t();
            listBuilder.f12995l = true;
            return listBuilder;
        }
        throw new IllegalStateException();
    }

    public static final Pair S0(u7.a aVar) {
        int i10 = ia.d.f11868b;
        return new Pair(aVar.k0(), Double.valueOf(ia.b.toDouble-impl(new ia.f(System.nanoTime() - ia.d.f11867a).elapsedNow-UwyO8pc(), TimeUnit.MILLISECONDS)));
    }

    public static final double S1(long j2) {
        return ((j2 >>> 11) * 2048) + (j2 & 2047);
    }

    public static final SetBuilder T(SetBuilder setBuilder) {
        MapBuilder<E, ?> mapBuilder = setBuilder.f13016i;
        mapBuilder.b();
        mapBuilder.f13010t = true;
        return setBuilder;
    }

    public static final CharSequence T0(int i10, CharSequence charSequence) {
        int length;
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i10 == -1) {
            if (charSequence.length() - 60 <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i11 = i10 - 30;
        int i12 = i10 + 30;
        String str = i11 <= 0 ? "" : ".....";
        String str2 = i12 >= charSequence.length() ? "" : ".....";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (i11 < 0) {
            i11 = 0;
        }
        int length2 = charSequence.length();
        if (i12 > length2) {
            i12 = length2;
        }
        sb.append(charSequence.subSequence(i11, i12).toString());
        sb.append(str2);
        return sb.toString();
    }

    public static final Object T1(Object obj) {
        p0 p0Var;
        q0 q0Var = obj instanceof q0 ? (q0) obj : null;
        if (q0Var != null && (p0Var = q0Var.f12791a) != null) {
            return p0Var;
        }
        return obj;
    }

    public static final void U(AlarmManager alarmManager, Context context, long j2) {
        alarmManager.cancel(PendingIntent.getBroadcast(context, (int) j2, new Intent(context, NoteReminderReceiver.class), f7.h.f10949a));
    }

    public static final g0.k0 U0(Object obj, c1 c1Var) {
        g.f(c1Var, "policy");
        int i10 = ActualAndroid_androidKt.f2631a;
        return new g0.k0(obj, c1Var);
    }

    public static final t U1(v.v vVar, v.v vVar2) {
        g.f(vVar2, "insets");
        return new t(vVar, vVar2);
    }

    public static final void V(int i10, int i11) {
        if (i10 >= 0 && i10 < i11) {
            return;
        }
        throw new IndexOutOfBoundsException(a4.b.j("index: ", i10, ", size: ", i11));
    }

    public static /* synthetic */ g0.k0 V0(Object obj) {
        return U0(obj, j1.f11059a);
    }

    public static final b8.i V1(int i10, int i11) {
        if (i11 <= Integer.MIN_VALUE) {
            b8.i iVar = b8.i.f6504l;
            return b8.i.f6504l;
        }
        return new b8.i(i10, i11 - 1);
    }

    public static final void W(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException(a4.b.j("index: ", i10, ", size: ", i11));
    }

    public static final r.i W0(r.i iVar) {
        g.f(iVar, "<this>");
        r.i c10 = iVar.c();
        g.d(c10, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return c10;
    }

    public static final void W1(Context context) {
        ComponentName componentName = new ComponentName(context, FolderListWidgetProvider.class);
        ComponentName componentName2 = new ComponentName(context, NoteListWidgetProvider.class);
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
        int[] appWidgetIds2 = appWidgetManager.getAppWidgetIds(componentName2);
        g.e(appWidgetIds, "folderListWidgetIds");
        g.e(appWidgetIds2, "noteListWidgetIds");
        int length = appWidgetIds.length;
        int length2 = appWidgetIds2.length;
        int[] copyOf = Arrays.copyOf(appWidgetIds, length + length2);
        System.arraycopy(appWidgetIds2, 0, copyOf, length, length2);
        g.e(copyOf, "result");
        appWidgetManager.notifyAppWidgetViewDataChanged(copyOf, R.id.lv);
    }

    public static final void X(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException(a4.b.j("fromIndex: ", i10, " > toIndex: ", i11));
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
    }

    public static final void X0(u7.a aVar, u7.l lVar, u7.l lVar2) {
        e1 e1Var = d1.f11040a;
        g.f(lVar, "start");
        g.f(lVar2, "done");
        e1 e1Var2 = d1.f11040a;
        h0.e eVar = (h0.e) e1Var2.d();
        if (eVar == null) {
            eVar = new h0.e(new Pair[16]);
            e1Var2.g(eVar);
        }
        try {
            eVar.b(new Pair(lVar, lVar2));
            aVar.k0();
        } finally {
            eVar.n(eVar.f11334k - 1);
        }
    }

    public static final void X1(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, FolderListWidgetProvider.class));
        Intent intent = new Intent(context, FolderListWidgetProvider.class);
        intent.putExtra("appWidgetIds", appWidgetIds);
        intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
        context.sendBroadcast(intent);
    }

    public static final q0.d Y(q0.d dVar, h0 h0Var) {
        g.f(dVar, "<this>");
        g.f(h0Var, "shape");
        return I0(dVar, 0.0f, 0.0f, 0.0f, h0Var, true, 59391);
    }

    public static final m Y0(p2.c cVar) {
        boolean z10;
        boolean z11 = false;
        Shader shader = cVar.f16713a;
        if (shader != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 || cVar.c != 0) ? true : true) {
            if (shader != null) {
                return new v0.n(shader);
            }
            int i10 = v0.r.f18134h;
            return new v0.i0(cVar.c << 32);
        }
        return null;
    }

    public static final void Y1(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, NoteListWidgetProvider.class));
        Intent intent = new Intent(context, NoteListWidgetProvider.class);
        intent.putExtra("appWidgetIds", appWidgetIds);
        intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
        context.sendBroadcast(intent);
    }

    public static final q0.d Z(q0.d dVar) {
        g.f(dVar, "<this>");
        return I0(dVar, 0.0f, 0.0f, 0.0f, null, true, 61439);
    }

    public static void Z0(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof o1) {
                editorInfo.hintText = ((o1) parent).a();
                return;
            }
        }
    }

    public static final double a0(double d5, double d10, double d11) {
        if (d10 <= d11) {
            return d5 < d10 ? d10 : d5 > d11 ? d11 : d5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d11 + " is less than minimum " + d10 + '.');
    }

    public static final List a1(List list) {
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return N0(list.get(0));
            }
            return list;
        }
        return EmptyList.f12981i;
    }

    public static final float b0(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static final void b1(gb.b bVar, String str) {
        g.f(bVar, "factory");
        g.f(str, "mapping");
        throw new DefinitionOverrideException("Already existing definition for " + bVar.f11319a + " at " + str);
    }

    public static final int c0(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static final q0.d c1(q0.d dVar, float f10) {
        g.f(dVar, "$this$padding");
        return dVar.Z(new PaddingModifier(f10, f10, f10, f10, InspectableValueKt.f3744a));
    }

    public static final long d0(long j2, long j10, long j11) {
        if (j10 <= j11) {
            return j2 < j10 ? j10 : j2 > j11 ? j11 : j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j11 + " is less than minimum " + j10 + '.');
    }

    public static q0.d d1(q0.d dVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        float f12 = f10;
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        float f13 = f11;
        g.f(dVar, "$this$padding");
        return dVar.Z(new PaddingModifier(f12, f13, f12, f13, InspectableValueKt.f3744a));
    }

    public static final Object e0(Object obj, CallableMemberDescriptor callableMemberDescriptor) {
        y9.r w02;
        Class L1;
        return (((callableMemberDescriptor instanceof z) && k9.e.d((l8.l0) callableMemberDescriptor)) || (w02 = w0(callableMemberDescriptor)) == null || (L1 = L1(w02)) == null) ? obj : G0(L1, callableMemberDescriptor).invoke(obj, new Object[0]);
    }

    public static q0.d e1(q0.d dVar, float f10, float f11, float f12, float f13, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        float f14 = f10;
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        float f15 = f11;
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        float f16 = f12;
        if ((i10 & 8) != 0) {
            f13 = 0;
        }
        g.f(dVar, "$this$padding");
        return dVar.Z(new PaddingModifier(f14, f15, f16, f13, InspectableValueKt.f3744a));
    }

    public static final g0 f0(kotlinx.coroutines.flow.m mVar, g0.d dVar) {
        g.f(mVar, "<this>");
        dVar.f(-1439883919);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f13021i;
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        g0 a10 = androidx.compose.runtime.g.a(mVar, mVar.getValue(), emptyCoroutineContext, dVar);
        dVar.u();
        return a10;
    }

    public static q0.d f1(q0.d dVar, y0.b bVar, q0.a aVar, j1.c cVar, float f10, v0.s sVar, int i10) {
        boolean z10;
        float f11;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            aVar = a.C0210a.c;
        }
        q0.a aVar2 = aVar;
        if ((i10 & 8) != 0) {
            cVar = c.a.f12648b;
        }
        j1.c cVar2 = cVar;
        if ((i10 & 16) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        if ((i10 & 32) != 0) {
            sVar = null;
        }
        g.f(dVar, "<this>");
        g.f(bVar, "painter");
        g.f(aVar2, "alignment");
        g.f(cVar2, "contentScale");
        return dVar.Z(new PainterModifier(bVar, z10, aVar2, cVar2, f11, sVar, InspectableValueKt.f3744a));
    }

    public static final int g0(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final qa.b g1(c8.b bVar, List list, ArrayList arrayList) {
        boolean a10;
        boolean a11;
        boolean a12;
        boolean a13;
        boolean a14;
        boolean a15;
        boolean a16;
        qa.b bVar2;
        qa.b m1Var;
        g.f(bVar, "<this>");
        g.f(list, "types");
        if (g.a(bVar, v7.i.a(Collection.class))) {
            a10 = true;
        } else {
            a10 = g.a(bVar, v7.i.a(List.class));
        }
        if (a10) {
            a11 = true;
        } else {
            a11 = g.a(bVar, v7.i.a(List.class));
        }
        if (a11) {
            a12 = true;
        } else {
            a12 = g.a(bVar, v7.i.a(ArrayList.class));
        }
        if (a12) {
            bVar2 = new ua.e((qa.b) arrayList.get(0));
        } else if (g.a(bVar, v7.i.a(HashSet.class))) {
            bVar2 = new ua.i0((qa.b) arrayList.get(0));
        } else {
            if (g.a(bVar, v7.i.a(Set.class))) {
                a13 = true;
            } else {
                a13 = g.a(bVar, v7.i.a(Set.class));
            }
            if (a13) {
                a14 = true;
            } else {
                a14 = g.a(bVar, v7.i.a(LinkedHashSet.class));
            }
            if (a14) {
                bVar2 = new ua.t0((qa.b) arrayList.get(0));
            } else if (g.a(bVar, v7.i.a(HashMap.class))) {
                bVar2 = new ua.h0((qa.b) arrayList.get(0), (qa.b) arrayList.get(1));
            } else {
                if (g.a(bVar, v7.i.a(Map.class))) {
                    a15 = true;
                } else {
                    a15 = g.a(bVar, v7.i.a(Map.class));
                }
                if (a15) {
                    a16 = true;
                } else {
                    a16 = g.a(bVar, v7.i.a(LinkedHashMap.class));
                }
                if (a16) {
                    bVar2 = new r0((qa.b) arrayList.get(0), (qa.b) arrayList.get(1));
                } else {
                    if (g.a(bVar, v7.i.a(Map.Entry.class))) {
                        qa.b bVar3 = (qa.b) arrayList.get(0);
                        qa.b bVar4 = (qa.b) arrayList.get(1);
                        g.f(bVar3, "keySerializer");
                        g.f(bVar4, "valueSerializer");
                        m1Var = new MapEntrySerializer(bVar3, bVar4);
                    } else if (g.a(bVar, v7.i.a(Pair.class))) {
                        qa.b bVar5 = (qa.b) arrayList.get(0);
                        qa.b bVar6 = (qa.b) arrayList.get(1);
                        g.f(bVar5, "keySerializer");
                        g.f(bVar6, "valueSerializer");
                        m1Var = new PairSerializer(bVar5, bVar6);
                    } else if (g.a(bVar, v7.i.a(Triple.class))) {
                        qa.b bVar7 = (qa.b) arrayList.get(0);
                        qa.b bVar8 = (qa.b) arrayList.get(1);
                        qa.b bVar9 = (qa.b) arrayList.get(2);
                        g.f(bVar7, "aSerializer");
                        g.f(bVar8, "bSerializer");
                        g.f(bVar9, "cSerializer");
                        bVar2 = new TripleSerializer(bVar7, bVar8, bVar9);
                    } else if (y0(bVar).isArray()) {
                        c8.c c10 = ((k) list.get(0)).c();
                        g.d(c10, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                        qa.b bVar10 = (qa.b) arrayList.get(0);
                        g.f(bVar10, "elementSerializer");
                        m1Var = new m1((c8.b) c10, bVar10);
                    } else {
                        bVar2 = null;
                    }
                    bVar2 = m1Var;
                }
            }
        }
        if (bVar2 == null) {
            qa.b[] bVarArr = (qa.b[]) arrayList.toArray(new qa.b[0]);
            return b.D(bVar, (qa.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        }
        return bVar2;
    }

    public static androidx.compose.animation.core.a h(float f10) {
        return new androidx.compose.animation.core.a(Float.valueOf(f10), VectorConvertersKt.f1327a, Float.valueOf(0.01f), "Animatable");
    }

    public static final r.k h0(double d5) {
        return d5 < 0.0d ? new r.k(0.0d, Math.sqrt(Math.abs(d5))) : new r.k(Math.sqrt(d5), 0.0d);
    }

    public static final k0.c h1() {
        k0.c cVar = k0.c.f12833k;
        g.d(cVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        return cVar;
    }

    public static r.e i(float f10, float f11, int i10) {
        float f12;
        long j2;
        long j10;
        if ((i10 & 2) != 0) {
            f12 = 0.0f;
        } else {
            f12 = f11;
        }
        if ((i10 & 4) != 0) {
            j2 = Long.MIN_VALUE;
        } else {
            j2 = 0;
        }
        if ((i10 & 8) != 0) {
            j10 = Long.MIN_VALUE;
        } else {
            j10 = 0;
        }
        return new r.e(VectorConvertersKt.f1327a, Float.valueOf(f10), new r.f(f12), j2, j10, false);
    }

    public static final ComposableLambdaImpl i0(g0.d dVar, int i10, Lambda lambda) {
        ComposableLambdaImpl composableLambdaImpl;
        g.f(dVar, "composer");
        dVar.f(i10);
        Object g10 = dVar.g();
        if (g10 == d.a.f11039a) {
            composableLambdaImpl = new ComposableLambdaImpl(i10, true);
            dVar.q(composableLambdaImpl);
        } else {
            g.d(g10, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            composableLambdaImpl = (ComposableLambdaImpl) g10;
        }
        composableLambdaImpl.f(lambda);
        dVar.u();
        return composableLambdaImpl;
    }

    public static void i1(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j2);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long j(float f10, float f11, float f12, float f13, w0.c cVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        g.f(cVar, "colorSpace");
        boolean z16 = false;
        float c10 = cVar.c(0);
        if (f10 <= cVar.b(0) && c10 <= f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float c11 = cVar.c(1);
            if (f11 <= cVar.b(1) && c11 <= f11) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                float c12 = cVar.c(2);
                if (f12 <= cVar.b(2) && c12 <= f12) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    if (0.0f <= f13 && f13 <= 1.0f) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        z11 = true;
                        if (!z11) {
                            if (cVar.d()) {
                                long j2 = (((((((int) ((f10 * 255.0f) + 0.5f)) << 16) | (((int) ((f13 * 255.0f) + 0.5f)) << 24)) | (((int) ((f11 * 255.0f) + 0.5f)) << 8)) | ((int) ((f12 * 255.0f) + 0.5f))) & 4294967295L) << 32;
                                int i10 = v0.r.f18134h;
                                return j2;
                            }
                            int i11 = w0.b.f18240e;
                            if (((int) (cVar.f18242b >> 32)) == 3) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                int i12 = cVar.c;
                                if (i12 != -1) {
                                    z16 = true;
                                }
                                if (z16) {
                                    short a10 = v0.t.a(f10);
                                    short a11 = v0.t.a(f11);
                                    long j10 = (a11 & 65535) << 32;
                                    long a12 = j10 | ((a10 & 65535) << 48) | ((v0.t.a(f12) & 65535) << 16) | ((((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (i12 & 63);
                                    int i13 = v0.r.f18134h;
                                    return a12;
                                }
                                throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces".toString());
                            }
                            throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components".toString());
                        }
                        throw new IllegalArgumentException(("red = " + f10 + ", green = " + f11 + ", blue = " + f12 + ", alpha = " + f13 + " outside the range for " + cVar).toString());
                    }
                }
            }
        }
        z11 = false;
        if (!z11) {
        }
    }

    public static final ComposableLambdaImpl j0(int i10, Lambda lambda, boolean z10) {
        g.f(lambda, "block");
        ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(i10, z10);
        composableLambdaImpl.f(lambda);
        return composableLambdaImpl;
    }

    public static final Object j1(Object obj, LockFreeLinkedListNode lockFreeLinkedListNode) {
        if (obj == null) {
            return lockFreeLinkedListNode;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(lockFreeLinkedListNode);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(lockFreeLinkedListNode);
        return arrayList;
    }

    public static final long k(long j2) {
        long j10 = (j2 & 4294967295L) << 32;
        int i10 = v0.r.f18134h;
        return j10;
    }

    public static final long k0(long j2, long j10) {
        long a10 = v0.r.a(j2, v0.r.f(j10));
        float d5 = v0.r.d(j10);
        float d10 = v0.r.d(a10);
        float f10 = 1.0f - d10;
        float f11 = (d5 * f10) + d10;
        boolean z10 = true;
        float f12 = 0.0f;
        int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        float h10 = i10 == 0 ? 0.0f : (((v0.r.h(j10) * d5) * f10) + (v0.r.h(a10) * d10)) / f11;
        float g10 = i10 == 0 ? 0.0f : (((v0.r.g(j10) * d5) * f10) + (v0.r.g(a10) * d10)) / f11;
        float e10 = v0.r.e(a10);
        float e11 = v0.r.e(j10);
        if (i10 != 0) {
            z10 = false;
        }
        if (!z10) {
            f12 = (((e11 * d5) * f10) + (e10 * d10)) / f11;
        }
        return j(h10, g10, f12, f11, v0.r.f(j10));
    }

    public static final x.a k1(g0.d dVar) {
        dVar.f(-1031410916);
        View view = (View) dVar.w(AndroidCompositionLocals_androidKt.f3659f);
        dVar.f(1157296644);
        boolean z10 = dVar.z(view);
        Object g10 = dVar.g();
        if (z10 || g10 == d.a.f11039a) {
            g10 = new x.a(view);
            dVar.q(g10);
        }
        dVar.u();
        x.a aVar = (x.a) g10;
        dVar.u();
        return aVar;
    }

    public static long l(int i10, int i11, int i12) {
        long j2 = (((((i10 & 255) << 16) | (-16777216)) | ((i11 & 255) << 8)) | (i12 & 255)) << 32;
        int i13 = v0.r.f18134h;
        return j2;
    }

    public static final TypeVariance l0(Variance variance) {
        int ordinal = variance.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return TypeVariance.f15061k;
                }
                throw new NoWhenBranchMatchedException();
            }
            return TypeVariance.f15060j;
        }
        return TypeVariance.f15062l;
    }

    public static final g0 l1(Object obj, g0.d dVar) {
        dVar.f(-1058319986);
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        dVar.f(-492369756);
        Object g10 = dVar.g();
        if (g10 == d.a.f11039a) {
            g10 = V0(obj);
            dVar.q(g10);
        }
        dVar.u();
        g0 g0Var = (g0) g10;
        g0Var.setValue(obj);
        dVar.u();
        return g0Var;
    }

    public static final long m(float f10, float f11) {
        long floatToIntBits = (Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32);
        int i10 = u0.a.f17717b;
        return floatToIntBits;
    }

    public static final r.i m0(r.i iVar) {
        g.f(iVar, "<this>");
        r.i W0 = W0(iVar);
        int b5 = W0.b();
        for (int i10 = 0; i10 < b5; i10++) {
            W0.e(i10, iVar.a(i10));
        }
        return W0;
    }

    public static final boolean m1(g0.q0 q0Var, g0.q0 q0Var2) {
        boolean z10;
        boolean z11;
        if (q0Var == null) {
            return true;
        }
        if ((q0Var instanceof g0.r0) && (q0Var2 instanceof g0.r0)) {
            g0.r0 r0Var = (g0.r0) q0Var;
            if (r0Var.f11072b != null) {
                g0.b bVar = r0Var.c;
                if (bVar != null) {
                    z11 = bVar.a();
                } else {
                    z11 = false;
                }
                if (z11) {
                    z10 = true;
                    if (z10 || g.a(q0Var, q0Var2) || g.a(r0Var.c, ((g0.r0) q0Var2).c)) {
                        return true;
                    }
                }
            }
            z10 = false;
            return z10 ? true : true;
        }
        return false;
    }

    public static final JsonDecodingException n(Number number, String str, String str2) {
        g.f(number, "value");
        g.f(str, "key");
        g.f(str2, "output");
        return r("Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) T0(-1, str2)), -1);
    }

    public static final void n0(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }

    public static final long n1(long j2, long j10) {
        long j11 = j2 + j10;
        if (((j10 ^ j2) < 0) || ((j2 ^ j11) >= 0)) {
            return j11;
        }
        throw new ArithmeticException();
    }

    public static final JsonEncodingException o(Number number, String str) {
        g.f(number, "value");
        g.f(str, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) T0(-1, str)));
    }

    public static final ArrayList o0(ArrayList arrayList, List list, kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        y9.r rVar;
        g.f(list, "oldValueParameters");
        g.f(aVar, "newOwner");
        arrayList.size();
        list.size();
        ArrayList S2 = kotlin.collections.c.S2(arrayList, list);
        ArrayList arrayList2 = new ArrayList(n7.l.Z1(S2, 10));
        Iterator it = S2.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            y9.r rVar2 = (y9.r) pair.f12962i;
            kotlin.reflect.jvm.internal.impl.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.descriptors.h) pair.f12963j;
            int index = hVar.getIndex();
            m8.e annotations = hVar.getAnnotations();
            h9.e name = hVar.getName();
            g.e(name, "oldParameter.name");
            boolean j02 = hVar.j0();
            boolean A2 = hVar.A();
            boolean K0 = hVar.K0();
            if (hVar.N() != null) {
                rVar = DescriptorUtilsKt.j(aVar).u().g(rVar2);
            } else {
                rVar = null;
            }
            d0 j2 = hVar.j();
            g.e(j2, "oldParameter.source");
            arrayList2.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.e(aVar, null, index, annotations, name, rVar2, j02, A2, K0, rVar, j2));
        }
        return arrayList2;
    }

    public static final int o1(ArrayList arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int i14 = ((g0.b) arrayList.get(i13)).f11033a;
            if (i14 < 0) {
                i14 += i11;
            }
            int h10 = g.h(i14, i10);
            if (h10 < 0) {
                i12 = i13 + 1;
            } else if (h10 > 0) {
                size = i13 - 1;
            } else {
                return i13;
            }
        }
        return -(i12 + 1);
    }

    public static final JsonEncodingException p(sa.e eVar) {
        return new JsonEncodingException("Value of type '" + eVar.b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + eVar.h() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final int p0(int i10) {
        switch (i10) {
            case 0:
                return 0;
            case 1:
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                return 1;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static final Object p1(FocusModifier focusModifier, int i10, u7.l lVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        j1.b bVar = focusModifier.f3023q;
        if (bVar != null) {
            boolean z15 = false;
            if (i10 == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (i10 == 6) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    if (i10 == 3) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        if (i10 == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            if (i10 == 1) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (!z14) {
                                if (i10 == 2) {
                                    z15 = true;
                                }
                                if (!z15) {
                                    throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
                                }
                            }
                        }
                    }
                }
            }
            return bVar.a();
        }
        return null;
    }

    public static final JsonDecodingException q(int i10, String str, CharSequence charSequence) {
        g.f(str, "message");
        g.f(charSequence, "input");
        return r(str + "\nJSON input: " + ((Object) T0(i10, charSequence)), i10);
    }

    public static final PendingIntent q0(Context context, int i10) {
        Intent component = new Intent().setComponent(f7.f.d(context));
        g.e(component, "Intent().setComponent(enabledComponentName)");
        return PendingIntent.getActivity(context, i10, component, f7.h.f10949a);
    }

    public static final qa.b q1(xa.b bVar, k kVar) {
        g.f(bVar, "<this>");
        g.f(kVar, "type");
        qa.b a10 = qa.f.a(bVar, kVar, true);
        if (a10 == null) {
            c8.b L0 = m0.b.L0(kVar);
            g.f(L0, "<this>");
            String d5 = L0.d();
            if (d5 == null) {
                d5 = "<local class name not available>";
            }
            throw new SerializationException(a4.b.m("Serializer for class '", d5, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
        }
        return a10;
    }

    public static final JsonDecodingException r(String str, int i10) {
        g.f(str, "message");
        if (i10 >= 0) {
            str = "Unexpected JSON token at offset " + i10 + ": " + str;
        }
        return new JsonDecodingException(str);
    }

    public static final kotlin.reflect.jvm.internal.calls.a r0(kotlin.reflect.jvm.internal.calls.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        g.f(eVar, "descriptor");
        boolean z14 = true;
        if (!k9.e.a(eVar)) {
            List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10 = eVar.m();
            g.e(m10, "descriptor.valueParameters");
            if (!m10.isEmpty()) {
                for (kotlin.reflect.jvm.internal.impl.descriptors.h hVar : m10) {
                    y9.r b5 = hVar.b();
                    g.e(b5, "it.type");
                    if (k9.e.c(b5)) {
                        z11 = true;
                        break;
                    }
                }
            }
            z11 = false;
            if (!z11) {
                y9.r k3 = eVar.k();
                if (k3 != null && k9.e.c(k3)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    if (!(aVar instanceof g8.b)) {
                        y9.r w02 = w0(eVar);
                        if (w02 != null && k9.e.c(w02)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                        }
                    }
                    z14 = false;
                }
            }
        }
        if (z14) {
            return new kotlin.reflect.jvm.internal.calls.c(aVar, eVar, z10);
        }
        return aVar;
    }

    public static final ArrayList r1(xa.b bVar, List list, boolean z10) {
        ArrayList arrayList;
        g.f(bVar, "<this>");
        g.f(list, "typeArguments");
        if (z10) {
            arrayList = new ArrayList(n7.l.Z1(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(q1(bVar, (k) it.next()));
            }
        } else {
            arrayList = new ArrayList(n7.l.Z1(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                k kVar = (k) it2.next();
                g.f(kVar, "type");
                qa.b a10 = qa.f.a(bVar, kVar, false);
                if (a10 == null) {
                    return null;
                }
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    public static final long s(float f10, float f11) {
        long floatToIntBits = (Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32);
        int i10 = u0.c.f17723e;
        return floatToIntBits;
    }

    public static String s0(List list) {
        CharSequence valueOf;
        g.f(list, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            boolean z10 = true;
            i10++;
            if (i10 > 1) {
                sb.append((CharSequence) ",");
            }
            if (obj != null) {
                z10 = obj instanceof CharSequence;
            }
            if (z10) {
                valueOf = (CharSequence) obj;
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb.append(valueOf);
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        g.e(sb2, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb2;
    }

    public static final void s1(g0.d dVar, Object obj, p pVar) {
        g.f(pVar, "block");
        if (dVar.l() || !g.a(dVar.g(), obj)) {
            dVar.q(obj);
            dVar.j(obj, pVar);
        }
    }

    public static final u0.d t(long j2, long j10) {
        return new u0.d(u0.c.b(j2), u0.c.c(j2), u0.f.d(j10) + u0.c.b(j2), u0.f.b(j10) + u0.c.c(j2));
    }

    public static final c8.b t0(Annotation annotation) {
        g.f(annotation, "<this>");
        Class<? extends Annotation> annotationType = annotation.annotationType();
        g.e(annotationType, "this as java.lang.annota…otation).annotationType()");
        c8.b a10 = v7.i.a(annotationType);
        g.d(a10, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return a10;
    }

    public static final void t1(Matrix matrix, float[] fArr) {
        g.f(fArr, "$this$setFrom");
        g.f(matrix, "matrix");
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        fArr[0] = f10;
        fArr[1] = f13;
        fArr[2] = 0.0f;
        fArr[3] = f16;
        fArr[4] = f11;
        fArr[5] = f14;
        fArr[6] = 0.0f;
        fArr[7] = f17;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f12;
        fArr[13] = f15;
        fArr[14] = 0.0f;
        fArr[15] = f18;
    }

    public static final u0.e u(float f10, float f11, float f12, float f13, long j2) {
        long m10 = m(u0.a.b(j2), u0.a.c(j2));
        return new u0.e(f10, f11, f12, f13, m10, m10, m10, m10);
    }

    public static final long u0(long j2) {
        return s(u0.f.d(j2) / 2.0f, u0.f.b(j2) / 2.0f);
    }

    public static final long v(float f10, float f11) {
        long floatToIntBits = (Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32);
        int i10 = u0.f.f17737d;
        return floatToIntBits;
    }

    public static final float[] v0(long j2) {
        return new float[]{v0.r.h(j2), v0.r.g(j2), v0.r.e(j2), v0.r.d(j2)};
    }

    public static final Set v1(Object obj) {
        Set singleton = Collections.singleton(obj);
        g.e(singleton, "singleton(element)");
        return singleton;
    }

    public static final void w(q0.d dVar, g0.d dVar2) {
        g.f(dVar, "modifier");
        dVar2.f(-72882467);
        SpacerMeasurePolicy spacerMeasurePolicy = SpacerMeasurePolicy.f1978a;
        dVar2.f(-1323940314);
        b2.b bVar = (b2.b) dVar2.w(CompositionLocalsKt.f3703e);
        LayoutDirection layoutDirection = (LayoutDirection) dVar2.w(CompositionLocalsKt.f3709k);
        androidx.compose.ui.platform.j1 j1Var = (androidx.compose.ui.platform.j1) dVar2.w(CompositionLocalsKt.f3712o);
        ComposeUiNode.f3400a.getClass();
        u7.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3402b;
        ComposableLambdaImpl a10 = androidx.compose.ui.layout.a.a(dVar);
        if (dVar2.y() instanceof g0.c) {
            dVar2.r();
            if (dVar2.l()) {
                dVar2.m(aVar);
            } else {
                dVar2.n();
            }
            dVar2.x();
            s1(dVar2, spacerMeasurePolicy, ComposeUiNode.Companion.f3404e);
            s1(dVar2, bVar, ComposeUiNode.Companion.f3403d);
            s1(dVar2, layoutDirection, ComposeUiNode.Companion.f3405f);
            s1(dVar2, j1Var, ComposeUiNode.Companion.f3406g);
            dVar2.h();
            a10.O(new v0(dVar2), dVar2, 0);
            dVar2.f(2058660585);
            dVar2.f(1142320198);
            dVar2.u();
            dVar2.u();
            dVar2.v();
            dVar2.u();
            dVar2.u();
            return;
        }
        L0();
        throw null;
    }

    public static final y9.r w0(CallableMemberDescriptor callableMemberDescriptor) {
        l8.c0 R2 = callableMemberDescriptor.R();
        l8.c0 E2 = callableMemberDescriptor.E();
        if (R2 != null) {
            return R2.b();
        }
        if (E2 != null) {
            if (callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.c) {
                return E2.b();
            }
            l8.f c10 = callableMemberDescriptor.c();
            l8.b bVar = c10 instanceof l8.b ? (l8.b) c10 : null;
            if (bVar != null) {
                return bVar.r();
            }
        }
        return null;
    }

    public static final Set w1(Object... objArr) {
        if (objArr.length > 0) {
            return kotlin.collections.b.x2(objArr);
        }
        return EmptySet.f12983i;
    }

    public static final void x(int i10, List list) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            throw new IndexOutOfBoundsException("Index " + i10 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    public static String x0(Context context, int i10) {
        int i11;
        if (context == null) {
            return "";
        }
        if (i10 != 1) {
            if (i10 != 7) {
                switch (i10) {
                    case ma.i.f16046m /* 9 */:
                        break;
                    case ma.i.f16047o /* 10 */:
                        i11 = R.string.fingerprint_error_user_canceled;
                        break;
                    case 11:
                        i11 = R.string.fingerprint_error_no_fingerprints;
                        break;
                    case 12:
                        i11 = R.string.fingerprint_error_hw_not_present;
                        break;
                    default:
                        Log.e("BiometricUtils", "Unknown error code: " + i10);
                        i11 = R.string.default_error_msg;
                        break;
                }
            }
            i11 = R.string.fingerprint_error_lockout;
        } else {
            i11 = R.string.fingerprint_error_hw_not_available;
        }
        return context.getString(i11);
    }

    public static final void y(List list, int i10, int i11) {
        int size = list.size();
        if (i10 <= i11) {
            if (i10 >= 0) {
                if (i11 <= size) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is more than than the list size (" + size + ')');
            }
            throw new IndexOutOfBoundsException(a4.b.i("fromIndex (", i10, ") is less than 0."));
        }
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
    }

    public static final Class y0(c8.b bVar) {
        g.f(bVar, "<this>");
        Class<?> e10 = ((v7.b) bVar).e();
        g.d(e10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return e10;
    }

    public static final String y1(l8.b bVar, String str) {
        String L2;
        g.f(bVar, "classDescriptor");
        g.f(str, "jvmDescriptor");
        String str2 = k8.c.f12921a;
        h9.d i10 = DescriptorUtilsKt.g(bVar).i();
        g.e(i10, "fqNameSafe.toUnsafe()");
        h9.b g10 = k8.c.g(i10);
        if (g10 != null) {
            L2 = p9.b.b(g10).e();
            g.e(L2, "byClassId(it).internalName");
        } else {
            L2 = m0.b.L(bVar, b.C0);
        }
        return j.f(L2, str);
    }

    public static final boolean z(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 67108864) != 0;
    }

    public static final Class z0(c8.b bVar) {
        g.f(bVar, "<this>");
        Class<?> e10 = ((v7.b) bVar).e();
        if (e10.isPrimitive()) {
            String name = e10.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    return !name.equals("double") ? e10 : Double.class;
                case 104431:
                    return !name.equals("int") ? e10 : Integer.class;
                case 3039496:
                    return !name.equals("byte") ? e10 : Byte.class;
                case 3052374:
                    return !name.equals("char") ? e10 : Character.class;
                case 3327612:
                    return !name.equals("long") ? e10 : Long.class;
                case 3625364:
                    return !name.equals("void") ? e10 : Void.class;
                case 64711720:
                    return !name.equals("boolean") ? e10 : Boolean.class;
                case 97526364:
                    return !name.equals("float") ? e10 : Float.class;
                case 109413500:
                    return !name.equals("short") ? e10 : Short.class;
                default:
                    return e10;
            }
        }
        return e10;
    }

    public static w z1(float f10, b2.d dVar, int i10) {
        float f11 = (i10 & 1) != 0 ? 1.0f : 0.0f;
        if ((i10 & 2) != 0) {
            f10 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            dVar = null;
        }
        return new w(f11, f10, dVar);
    }

    @Override // j3.a
    public Object b(CorruptionException corruptionException) {
        throw corruptionException;
    }

    @Override // fa.b.InterfaceC0118b
    public Iterable c(Object obj) {
        c8.j<Object>[] jVarArr = JvmBuiltInsCustomizer.f13392h;
        return ((CallableMemberDescriptor) obj).a().f();
    }

    @Override // a3.w0
    public void d(View view) {
    }

    @Override // u8.l
    public void e(h9.b bVar) {
    }

    @Override // c4.c.InterfaceC0055c
    public c4.c f(c.b bVar) {
        return new FrameworkSQLiteOpenHelper(bVar.f6529a, bVar.f6530b, bVar.c, bVar.f6531d, bVar.f6532e);
    }

    @Override // a3.w0
    public void g() {
    }

    public void u1(View view, int i10, int i11, int i12, int i13) {
        if (!f74k) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f73j = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e10);
            }
            f74k = true;
        }
        Method method = f73j;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
    }

    public void x1(View view, int i10) {
        if (!f76m) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f75l = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f76m = true;
        }
        Field field = f75l;
        if (field != null) {
            try {
                f75l.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public /* synthetic */ c(int i10) {
    }
}
