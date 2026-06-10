package a1;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Process;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.ui.platform.c1;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.fragment.app.o0;
import androidx.room.RoomDatabase;
import b2.j;
import com.noto.R;
import d9.l;
import g0.j1;
import g0.s0;
import j$.time.DateTimeException;
import j$.time.LocalDateTime;
import j1.g0;
import ja.d0;
import ja.e0;
import ja.f0;
import ja.k0;
import ja.l1;
import ja.p1;
import ja.u0;
import ja.w0;
import ja.x;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.n;
import kotlin.reflect.jvm.internal.impl.types.o;
import kotlin.reflect.jvm.internal.impl.types.q;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.DistinctFlowImpl;
import kotlinx.coroutines.flow.FlowKt__DistinctKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.m;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.flow.s;
import kotlinx.coroutines.flow.t;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.internal.r;
import kotlinx.datetime.DateTimeArithmeticException;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import l8.i0;
import la.c;
import la.h;
import ma.f;
import ma.k;
import o8.j0;
import org.koin.core.error.KoinAppAlreadyStartedException;
import u0.d;
import u7.s;
import ua.n1;
import v7.g;
import v7.i;
import y9.h0;
import y9.l0;
import y9.m0;
import y9.v;

/* loaded from: classes.dex */
public class b implements c1, l, g0 {
    public static final r U0;
    public static final r V0;
    public static final kotlinx.coroutines.sync.a W0;
    public static final kotlinx.coroutines.sync.a X0;
    public static final int[] Y0;

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f17a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f19b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};
    public static final int[] c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f21d = {16842755, 16843781};

    /* renamed from: e  reason: collision with root package name */
    public static final b f23e = new b();

    /* renamed from: f  reason: collision with root package name */
    public static final b f25f = new b();

    /* renamed from: g  reason: collision with root package name */
    public static final Class[] f27g = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f29h = {16842755};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f31i = {16842755};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f33j = {R.attr.defaultNavHost};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f35k = {R.attr.background, R.attr.backgroundSplit, R.attr.backgroundStacked, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.customNavigationLayout, R.attr.displayOptions, R.attr.divider, R.attr.elevation, R.attr.height, R.attr.hideOnContentScroll, R.attr.homeAsUpIndicator, R.attr.homeLayout, R.attr.icon, R.attr.indeterminateProgressStyle, R.attr.itemPadding, R.attr.logo, R.attr.navigationMode, R.attr.popupTheme, R.attr.progressBarPadding, R.attr.progressBarStyle, R.attr.subtitle, R.attr.subtitleTextStyle, R.attr.title, R.attr.titleTextStyle};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f37l = {16842931};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f39m = {16843071};
    public static final int[] n = {R.attr.background, R.attr.backgroundSplit, R.attr.closeItemLayout, R.attr.height, R.attr.subtitleTextStyle, R.attr.titleTextStyle};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f42o = {16842994, R.attr.buttonIconDimen, R.attr.buttonPanelSideLayout, R.attr.listItemLayout, R.attr.listLayout, R.attr.multiChoiceItemLayout, R.attr.showTitle, R.attr.singleChoiceItemLayout};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f44p = {16843033, R.attr.srcCompat, R.attr.tint, R.attr.tintMode};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f46q = {16843074, R.attr.tickMark, R.attr.tickMarkTint, R.attr.tickMarkTintMode};

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f48r = {16842804, 16843117, 16843118, 16843119, 16843120, 16843666, 16843667};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f50s = {16842804, R.attr.autoSizeMaxTextSize, R.attr.autoSizeMinTextSize, R.attr.autoSizePresetSizes, R.attr.autoSizeStepGranularity, R.attr.autoSizeTextType, R.attr.drawableBottomCompat, R.attr.drawableEndCompat, R.attr.drawableLeftCompat, R.attr.drawableRightCompat, R.attr.drawableStartCompat, R.attr.drawableTint, R.attr.drawableTintMode, R.attr.drawableTopCompat, R.attr.emojiCompatEnabled, R.attr.firstBaselineToTopHeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.lastBaselineToBottomHeight, R.attr.lineHeight, R.attr.textAllCaps, R.attr.textLocale};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f52t = {16842839, 16842926, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionBarPopupTheme, R.attr.actionBarSize, R.attr.actionBarSplitStyle, R.attr.actionBarStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabStyle, R.attr.actionBarTabTextStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionButtonStyle, R.attr.actionDropDownStyle, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeBackground, R.attr.actionModeCloseButtonStyle, R.attr.actionModeCloseContentDescription, R.attr.actionModeCloseDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeFindDrawable, R.attr.actionModePasteDrawable, R.attr.actionModePopupWindowStyle, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeSplitBackground, R.attr.actionModeStyle, R.attr.actionModeTheme, R.attr.actionModeWebSearchDrawable, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.activityChooserViewStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogStyle, R.attr.alertDialogTheme, R.attr.autoCompleteTextViewStyle, R.attr.borderlessButtonStyle, R.attr.buttonBarButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.colorAccent, R.attr.colorBackgroundFloating, R.attr.colorButtonNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorControlNormal, R.attr.colorError, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.dialogCornerRadius, R.attr.dialogPreferredPadding, R.attr.dialogTheme, R.attr.dividerHorizontal, R.attr.dividerVertical, R.attr.dropDownListViewStyle, R.attr.dropdownListPreferredItemHeight, R.attr.editTextBackground, R.attr.editTextColor, R.attr.editTextStyle, R.attr.homeAsUpIndicator, R.attr.imageButtonStyle, R.attr.listChoiceBackgroundIndicator, R.attr.listChoiceIndicatorMultipleAnimated, R.attr.listChoiceIndicatorSingleAnimated, R.attr.listDividerAlertDialog, R.attr.listMenuViewStyle, R.attr.listPopupWindowStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemPaddingEnd, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.listPreferredItemPaddingStart, R.attr.panelBackground, R.attr.panelMenuListTheme, R.attr.panelMenuListWidth, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.searchViewStyle, R.attr.seekBarStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.spinnerDropDownItemStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.textAppearancePopupMenuHeader, R.attr.textAppearanceSearchResultSubtitle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSmallPopupMenu, R.attr.textColorAlertDialogListItem, R.attr.textColorSearchUrl, R.attr.toolbarNavigationButtonStyle, R.attr.toolbarStyle, R.attr.tooltipForegroundColor, R.attr.tooltipFrameBackground, R.attr.viewInflaterClass, R.attr.windowActionBar, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedHeightMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMajor, R.attr.windowFixedWidthMinor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.windowNoTitle};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f54u = {R.attr.allowStacking};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f56v = {16843016, R.attr.checkMarkCompat, R.attr.checkMarkTint, R.attr.checkMarkTintMode};

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f58w = {16843015, R.attr.buttonCompat, R.attr.buttonTint, R.attr.buttonTintMode};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f60x = {16842927, 16842948, 16843046, 16843047, 16843048, R.attr.divider, R.attr.dividerPadding, R.attr.measureWithLargestChild, R.attr.showDividers};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f62y = {16843436, 16843437};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f64z = {16842766, 16842960, 16843156, 16843230, 16843231, 16843232};
    public static final int[] A = {16842754, 16842766, 16842960, 16843014, 16843156, 16843230, 16843231, 16843233, 16843234, 16843235, 16843236, 16843237, 16843375, R.attr.actionLayout, R.attr.actionProviderClass, R.attr.actionViewClass, R.attr.alphabeticModifiers, R.attr.contentDescription, R.attr.iconTint, R.attr.iconTintMode, R.attr.numericModifiers, R.attr.showAsAction, R.attr.tooltipText};
    public static final int[] B = {16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, R.attr.preserveIconSpacing, R.attr.subMenuArrow};
    public static final int[] C = {16843126, 16843465, R.attr.overlapAnchor};
    public static final int[] D = {R.attr.paddingBottomNoButtons, R.attr.paddingTopNoTitle};
    public static final int[] E = {16842804, 16842970, 16843039, 16843087, 16843088, 16843296, 16843364, R.attr.animateMenuItems, R.attr.animateNavigationIcon, R.attr.autoShowKeyboard, R.attr.closeIcon, R.attr.commitIcon, R.attr.defaultQueryHint, R.attr.goIcon, R.attr.headerLayout, R.attr.hideNavigationIcon, R.attr.iconifiedByDefault, R.attr.layout, R.attr.queryBackground, R.attr.queryHint, R.attr.searchHintIcon, R.attr.searchIcon, R.attr.searchPrefixText, R.attr.submitBackground, R.attr.suggestionRowLayout, R.attr.useDrawerArrowDrawable, R.attr.voiceIcon};
    public static final int[] F = {16842930, 16843126, 16843131, 16843362, R.attr.popupTheme};
    public static final int[] G = {16843044, 16843045, 16843074, R.attr.showText, R.attr.splitTrack, R.attr.switchMinWidth, R.attr.switchPadding, R.attr.switchTextAppearance, R.attr.thumbTextPadding, R.attr.thumbTint, R.attr.thumbTintMode, R.attr.track, R.attr.trackTint, R.attr.trackTintMode};
    public static final int[] H = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] I = {16842927, 16843072, R.attr.buttonGravity, R.attr.collapseContentDescription, R.attr.collapseIcon, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.logo, R.attr.logoDescription, R.attr.maxButtonHeight, R.attr.menu, R.attr.navigationContentDescription, R.attr.navigationIcon, R.attr.popupTheme, R.attr.subtitle, R.attr.subtitleTextAppearance, R.attr.subtitleTextColor, R.attr.title, R.attr.titleMargin, R.attr.titleMarginBottom, R.attr.titleMarginEnd, R.attr.titleMarginStart, R.attr.titleMarginTop, R.attr.titleMargins, R.attr.titleTextAppearance, R.attr.titleTextColor};
    public static final int[] J = {16842752, 16842970, R.attr.paddingEnd, R.attr.paddingStart, R.attr.theme};
    public static final int[] K = {16842964, R.attr.backgroundTint, R.attr.backgroundTintMode};
    public static final int[] L = {16842960, 16842994, 16842995};
    public static final int[] M = {16842964, 16843919, 16844096, R.attr.elevation, R.attr.expanded, R.attr.liftOnScroll, R.attr.liftOnScrollColor, R.attr.liftOnScrollTargetViewId, R.attr.statusBarForeground};
    public static final int[] N = {R.attr.layout_scrollEffect, R.attr.layout_scrollFlags, R.attr.layout_scrollInterpolator};
    public static final int[] O = {R.attr.backgroundColor, R.attr.badgeGravity, R.attr.badgeRadius, R.attr.badgeTextColor, R.attr.badgeWidePadding, R.attr.badgeWithTextRadius, R.attr.horizontalOffset, R.attr.horizontalOffsetWithText, R.attr.maxCharacterCount, R.attr.number, R.attr.verticalOffset, R.attr.verticalOffsetWithText};
    public static final int[] P = {16843065, R.attr.hideAnimationBehavior, R.attr.indicatorColor, R.attr.minHideDelay, R.attr.showAnimationBehavior, R.attr.showDelay, R.attr.trackColor, R.attr.trackCornerRadius, R.attr.trackThickness};
    public static final int[] Q = {R.attr.addElevationShadow, R.attr.backgroundTint, R.attr.elevation, R.attr.fabAlignmentMode, R.attr.fabAlignmentModeEndMargin, R.attr.fabAnchorMode, R.attr.fabAnimationMode, R.attr.fabCradleMargin, R.attr.fabCradleRoundedCornerRadius, R.attr.fabCradleVerticalOffset, R.attr.hideOnScroll, R.attr.menuAlignmentMode, R.attr.navigationIconTint, R.attr.paddingBottomSystemWindowInsets, R.attr.paddingLeftSystemWindowInsets, R.attr.paddingRightSystemWindowInsets, R.attr.removeEmbeddedFabElevation};
    public static final int[] R = {16843039, 16843040, 16843840, R.attr.backgroundTint, R.attr.behavior_draggable, R.attr.behavior_expandedOffset, R.attr.behavior_fitToContents, R.attr.behavior_halfExpandedRatio, R.attr.behavior_hideable, R.attr.behavior_peekHeight, R.attr.behavior_saveFlags, R.attr.behavior_significantVelocityThreshold, R.attr.behavior_skipCollapsed, R.attr.gestureInsetBottomIgnored, R.attr.marginLeftSystemWindowInsets, R.attr.marginRightSystemWindowInsets, R.attr.marginTopSystemWindowInsets, R.attr.paddingBottomSystemWindowInsets, R.attr.paddingLeftSystemWindowInsets, R.attr.paddingRightSystemWindowInsets, R.attr.paddingTopSystemWindowInsets, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.shouldRemoveExpandedCorners};
    public static final int[] S = {16843071, 16843072, R.attr.cardBackgroundColor, R.attr.cardCornerRadius, R.attr.cardElevation, R.attr.cardMaxElevation, R.attr.cardPreventCornerOverlap, R.attr.cardUseCompatPadding, R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingTop};
    public static final int[] T = {16842804, 16842901, 16842904, 16842923, 16843039, 16843087, 16843237, R.attr.checkedIcon, R.attr.checkedIconEnabled, R.attr.checkedIconTint, R.attr.checkedIconVisible, R.attr.chipBackgroundColor, R.attr.chipCornerRadius, R.attr.chipEndPadding, R.attr.chipIcon, R.attr.chipIconEnabled, R.attr.chipIconSize, R.attr.chipIconTint, R.attr.chipIconVisible, R.attr.chipMinHeight, R.attr.chipMinTouchTargetSize, R.attr.chipStartPadding, R.attr.chipStrokeColor, R.attr.chipStrokeWidth, R.attr.chipSurfaceColor, R.attr.closeIcon, R.attr.closeIconEnabled, R.attr.closeIconEndPadding, R.attr.closeIconSize, R.attr.closeIconStartPadding, R.attr.closeIconTint, R.attr.closeIconVisible, R.attr.ensureMinTouchTargetSize, R.attr.hideMotionSpec, R.attr.iconEndPadding, R.attr.iconStartPadding, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.textEndPadding, R.attr.textStartPadding};
    public static final int[] U = {R.attr.indicatorDirectionCircular, R.attr.indicatorInset, R.attr.indicatorSize};
    public static final int[] V = {R.attr.clockFaceBackgroundColor, R.attr.clockNumberTextColor};
    public static final int[] W = {R.attr.clockHandColor, R.attr.materialCircleRadius, R.attr.selectorSize};
    public static final int[] X = {R.attr.behavior_autoHide, R.attr.behavior_autoShrink};
    public static final int[] Y = {16842766, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.borderWidth, R.attr.elevation, R.attr.ensureMinTouchTargetSize, R.attr.fabCustomSize, R.attr.fabSize, R.attr.hideMotionSpec, R.attr.hoveredFocusedTranslationZ, R.attr.maxImageSize, R.attr.pressedTranslationZ, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.useCompatPadding};
    public static final int[] Z = {R.attr.behavior_autoHide};

    /* renamed from: a0  reason: collision with root package name */
    public static final int[] f18a0 = {16843017, 16843264, R.attr.foregroundInsidePadding};

    /* renamed from: b0  reason: collision with root package name */
    public static final int[] f20b0 = {R.attr.marginLeftSystemWindowInsets, R.attr.marginRightSystemWindowInsets, R.attr.marginTopSystemWindowInsets, R.attr.paddingBottomSystemWindowInsets, R.attr.paddingLeftSystemWindowInsets, R.attr.paddingRightSystemWindowInsets, R.attr.paddingTopSystemWindowInsets};
    public static final int[] c0 = {16843296, 16843916, R.attr.simpleItemLayout, R.attr.simpleItemSelectedColor, R.attr.simpleItemSelectedRippleColor, R.attr.simpleItems};

    /* renamed from: d0  reason: collision with root package name */
    public static final int[] f22d0 = {16842964, 16843191, 16843192, 16843193, 16843194, 16843237, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.cornerRadius, R.attr.elevation, R.attr.icon, R.attr.iconGravity, R.attr.iconPadding, R.attr.iconSize, R.attr.iconTint, R.attr.iconTintMode, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.strokeColor, R.attr.strokeWidth, R.attr.toggleCheckedStateOnClick};

    /* renamed from: e0  reason: collision with root package name */
    public static final int[] f24e0 = {16842766, R.attr.checkedButton, R.attr.selectionRequired, R.attr.singleSelection};

    /* renamed from: f0  reason: collision with root package name */
    public static final int[] f26f0 = {16843277, R.attr.dayInvalidStyle, R.attr.daySelectedStyle, R.attr.dayStyle, R.attr.dayTodayStyle, R.attr.nestedScrollable, R.attr.rangeFillColor, R.attr.yearSelectedStyle, R.attr.yearStyle, R.attr.yearTodayStyle};

    /* renamed from: g0  reason: collision with root package name */
    public static final int[] f28g0 = {16843191, 16843192, 16843193, 16843194, R.attr.itemFillColor, R.attr.itemShapeAppearance, R.attr.itemShapeAppearanceOverlay, R.attr.itemStrokeColor, R.attr.itemStrokeWidth, R.attr.itemTextColor};

    /* renamed from: h0  reason: collision with root package name */
    public static final int[] f30h0 = {16843237, R.attr.cardForegroundColor, R.attr.checkedIcon, R.attr.checkedIconGravity, R.attr.checkedIconMargin, R.attr.checkedIconSize, R.attr.checkedIconTint, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.state_dragged, R.attr.strokeColor, R.attr.strokeWidth};

    /* renamed from: i0  reason: collision with root package name */
    public static final int[] f32i0 = {16843015, R.attr.buttonCompat, R.attr.buttonIcon, R.attr.buttonIconTint, R.attr.buttonIconTintMode, R.attr.buttonTint, R.attr.centerIfNoTextEnabled, R.attr.checkedState, R.attr.errorAccessibilityLabel, R.attr.errorShown, R.attr.useMaterialThemeColors};

    /* renamed from: j0  reason: collision with root package name */
    public static final int[] f34j0 = {R.attr.buttonTint, R.attr.useMaterialThemeColors};

    /* renamed from: k0  reason: collision with root package name */
    public static final int[] f36k0 = {R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};

    /* renamed from: l0  reason: collision with root package name */
    public static final int[] f38l0 = {R.attr.thumbIcon, R.attr.thumbIconTint, R.attr.thumbIconTintMode, R.attr.trackDecoration, R.attr.trackDecorationTint, R.attr.trackDecorationTintMode};

    /* renamed from: m0  reason: collision with root package name */
    public static final int[] f40m0 = {16843958, 16844159, R.attr.lineHeight};

    /* renamed from: n0  reason: collision with root package name */
    public static final int[] f41n0 = {16842804, 16844159, R.attr.lineHeight};

    /* renamed from: o0  reason: collision with root package name */
    public static final int[] f43o0 = {R.attr.logoAdjustViewBounds, R.attr.logoScaleType, R.attr.navigationIconTint, R.attr.subtitleCentered, R.attr.titleCentered};

    /* renamed from: p0  reason: collision with root package name */
    public static final int[] f45p0 = {R.attr.materialCircleRadius};

    /* renamed from: q0  reason: collision with root package name */
    public static final int[] f47q0 = {R.attr.behavior_overlapTop};

    /* renamed from: r0  reason: collision with root package name */
    public static final int[] f49r0 = {R.attr.cornerFamily, R.attr.cornerFamilyBottomLeft, R.attr.cornerFamilyBottomRight, R.attr.cornerFamilyTopLeft, R.attr.cornerFamilyTopRight, R.attr.cornerSize, R.attr.cornerSizeBottomLeft, R.attr.cornerSizeBottomRight, R.attr.cornerSizeTopLeft, R.attr.cornerSizeTopRight};

    /* renamed from: s0  reason: collision with root package name */
    public static final int[] f51s0 = {16843039, 16843040, 16843840, R.attr.backgroundTint, R.attr.behavior_draggable, R.attr.coplanarSiblingViewId, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};

    /* renamed from: t0  reason: collision with root package name */
    public static final int[] f53t0 = {16842766, 16842788, 16843078, 16843486, 16843487, R.attr.haloColor, R.attr.haloRadius, R.attr.labelBehavior, R.attr.labelStyle, R.attr.minTouchTargetSize, R.attr.thumbColor, R.attr.thumbElevation, R.attr.thumbRadius, R.attr.thumbStrokeColor, R.attr.thumbStrokeWidth, R.attr.tickColor, R.attr.tickColorActive, R.attr.tickColorInactive, R.attr.tickVisible, R.attr.trackColor, R.attr.trackColorActive, R.attr.trackColorInactive, R.attr.trackHeight};

    /* renamed from: u0  reason: collision with root package name */
    public static final int[] f55u0 = {16843039, R.attr.actionTextColorAlpha, R.attr.animationMode, R.attr.backgroundOverlayColorAlpha, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.elevation, R.attr.maxActionInlineWidth, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};

    /* renamed from: v0  reason: collision with root package name */
    public static final int[] f57v0 = {16842754, 16842994, 16843087};

    /* renamed from: w0  reason: collision with root package name */
    public static final int[] f59w0 = {R.attr.tabBackground, R.attr.tabContentStart, R.attr.tabGravity, R.attr.tabIconTint, R.attr.tabIconTintMode, R.attr.tabIndicator, R.attr.tabIndicatorAnimationDuration, R.attr.tabIndicatorAnimationMode, R.attr.tabIndicatorColor, R.attr.tabIndicatorFullWidth, R.attr.tabIndicatorGravity, R.attr.tabIndicatorHeight, R.attr.tabInlineLabel, R.attr.tabMaxWidth, R.attr.tabMinWidth, R.attr.tabMode, R.attr.tabPadding, R.attr.tabPaddingBottom, R.attr.tabPaddingEnd, R.attr.tabPaddingStart, R.attr.tabPaddingTop, R.attr.tabRippleColor, R.attr.tabSelectedTextAppearance, R.attr.tabSelectedTextColor, R.attr.tabTextAppearance, R.attr.tabTextColor, R.attr.tabUnboundedRipple};

    /* renamed from: x0  reason: collision with root package name */
    public static final int[] f61x0 = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};

    /* renamed from: y0  reason: collision with root package name */
    public static final int[] f63y0 = {R.attr.textInputLayoutFocusedRectEnabled};

    /* renamed from: z0  reason: collision with root package name */
    public static final int[] f65z0 = {16842766, 16842906, 16843039, 16843071, 16843088, 16843095, 16843098, R.attr.boxBackgroundColor, R.attr.boxBackgroundMode, R.attr.boxCollapsedPaddingTop, R.attr.boxCornerRadiusBottomEnd, R.attr.boxCornerRadiusBottomStart, R.attr.boxCornerRadiusTopEnd, R.attr.boxCornerRadiusTopStart, R.attr.boxStrokeColor, R.attr.boxStrokeErrorColor, R.attr.boxStrokeWidth, R.attr.boxStrokeWidthFocused, R.attr.counterEnabled, R.attr.counterMaxLength, R.attr.counterOverflowTextAppearance, R.attr.counterOverflowTextColor, R.attr.counterTextAppearance, R.attr.counterTextColor, R.attr.endIconCheckable, R.attr.endIconContentDescription, R.attr.endIconDrawable, R.attr.endIconMinSize, R.attr.endIconMode, R.attr.endIconScaleType, R.attr.endIconTint, R.attr.endIconTintMode, R.attr.errorAccessibilityLiveRegion, R.attr.errorContentDescription, R.attr.errorEnabled, R.attr.errorIconDrawable, R.attr.errorIconTint, R.attr.errorIconTintMode, R.attr.errorTextAppearance, R.attr.errorTextColor, R.attr.expandedHintEnabled, R.attr.helperText, R.attr.helperTextEnabled, R.attr.helperTextTextAppearance, R.attr.helperTextTextColor, R.attr.hintAnimationEnabled, R.attr.hintEnabled, R.attr.hintTextAppearance, R.attr.hintTextColor, R.attr.passwordToggleContentDescription, R.attr.passwordToggleDrawable, R.attr.passwordToggleEnabled, R.attr.passwordToggleTint, R.attr.passwordToggleTintMode, R.attr.placeholderText, R.attr.placeholderTextAppearance, R.attr.placeholderTextColor, R.attr.prefixText, R.attr.prefixTextAppearance, R.attr.prefixTextColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.startIconCheckable, R.attr.startIconContentDescription, R.attr.startIconDrawable, R.attr.startIconMinSize, R.attr.startIconScaleType, R.attr.startIconTint, R.attr.startIconTintMode, R.attr.suffixText, R.attr.suffixTextAppearance, R.attr.suffixTextColor};
    public static final int[] A0 = {16842804, R.attr.enforceMaterialTheme, R.attr.enforceTextAppearance};
    public static final int[] B0 = {16842804, 16842904, 16842965, 16842998, 16843071, 16843072, 16843087, R.attr.backgroundTint};
    public static final b C0 = new b();
    public static final int[] D0 = {16843036, 16843156, 16843157, 16843158, 16843532, 16843533};
    public static final int[] E0 = {16842960, 16843161};
    public static final int[] F0 = {16843161, 16843849, 16843850, 16843851};
    public static final int[] G0 = {16842804, 16842901, 16842903, 16842904, 16842927, 16843087, 16843105, 16843106, 16843107, 16843108, R.attr.ticker_animateMeasurementChange, R.attr.ticker_animationDuration, R.attr.ticker_defaultCharacterList, R.attr.ticker_defaultPreferredScrollingDirection};
    public static final b H0 = new b();
    public static final int[] I0 = {R.attr.keylines, R.attr.statusBarBackground};
    public static final int[] J0 = {16842931, R.attr.layout_anchor, R.attr.layout_anchorGravity, R.attr.layout_behavior, R.attr.layout_dodgeInsetEdges, R.attr.layout_insetEdge, R.attr.layout_keyline};
    public static final r K0 = new r("RESUME_TOKEN");
    public static final r L0 = new r("REMOVED_TASK");
    public static final r M0 = new r("CLOSED_EMPTY");
    public static final b N0 = new b();
    public static final r O0 = new r("NO_DECISION");
    public static final r P0 = new r("RETRY_ATOMIC");
    public static final r Q0 = new r("UNDEFINED");
    public static final r R0 = new r("REUSABLE_CLAIMED");
    public static final r S0 = new r("REMOVE_PREPARED");
    public static final r T0 = new r("UNLOCK_FAIL");

    static {
        r rVar = new r("LOCKED");
        U0 = rVar;
        r rVar2 = new r("UNLOCKED");
        V0 = rVar2;
        W0 = new kotlinx.coroutines.sync.a(rVar);
        X0 = new kotlinx.coroutines.sync.a(rVar2);
        Y0 = new int[]{16842948};
    }

    public /* synthetic */ b() {
    }

    public /* synthetic */ b(View view) {
        g.f(view, "view");
        g.f(true & true ? d.f17725e : null, "rect");
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2] */
    public static final FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 A(kotlinx.coroutines.flow.b bVar, kotlinx.coroutines.flow.b bVar2, kotlinx.coroutines.flow.b bVar3, kotlinx.coroutines.flow.b bVar4, final s sVar) {
        final kotlinx.coroutines.flow.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        return new kotlinx.coroutines.flow.b<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2

            @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/c;", "", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
            @q7.c(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", l = {333, 333}, m = "invokeSuspend")
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2 extends SuspendLambda implements u7.q<c<Object>, Object[], p7.c<? super m7.n>, Object> {

                /* renamed from: m  reason: collision with root package name */
                public int f15309m;
                public /* synthetic */ c n;

                /* renamed from: o  reason: collision with root package name */
                public /* synthetic */ Object[] f15310o;

                /* renamed from: p  reason: collision with root package name */
                public final /* synthetic */ u7.s f15311p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(p7.c cVar, u7.s sVar) {
                    super(3, cVar);
                    this.f15311p = sVar;
                }

                @Override // u7.q
                public final Object O(c<Object> cVar, Object[] objArr, p7.c<? super m7.n> cVar2) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar2, this.f15311p);
                    anonymousClass2.n = cVar;
                    anonymousClass2.f15310o = objArr;
                    return anonymousClass2.k(m7.n.f16010a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object k(Object obj) {
                    c cVar;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f15309m;
                    if (i10 == 0) {
                        m0.b.n1(obj);
                        cVar = this.n;
                        Object[] objArr = this.f15310o;
                        u7.s sVar = this.f15311p;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        Object obj5 = objArr[3];
                        this.n = cVar;
                        this.f15309m = 1;
                        obj = sVar.V(obj2, obj3, obj4, obj5, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (i10 != 1) {
                        if (i10 == 2) {
                            m0.b.n1(obj);
                            return m7.n.f16010a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        cVar = this.n;
                        m0.b.n1(obj);
                    }
                    this.n = null;
                    this.f15309m = 2;
                    if (cVar.c(obj, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return m7.n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Object> cVar, p7.c cVar2) {
                Object a10 = kotlinx.coroutines.flow.internal.c.a(cVar2, FlowKt__ZipKt$nullArrayFactory$1.f15320j, new AnonymousClass2(null, sVar), cVar, bVarArr);
                if (a10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return a10;
                }
                return m7.n.f16010a;
            }
        };
    }

    public static final kotlinx.coroutines.flow.l A0(kotlinx.coroutines.flow.b bVar, x xVar) {
        t tVar = s.a.f15449a;
        kotlinx.coroutines.flow.r c10 = e.c(bVar);
        p a10 = e.a(1, c10.f15447b, c10.c);
        return new kotlinx.coroutines.flow.l(a10, e.f(xVar, c10.f15448d, c10.f15446a, a10, tVar, e.f15357a));
    }

    public static final void B0(u7.l lVar) {
        synchronized (c.f71h) {
            org.koin.core.b bVar = new org.koin.core.b();
            if (c.f72i == null) {
                c.f72i = bVar.f16504a;
                lVar.U(bVar);
            } else {
                throw new KoinAppAlreadyStartedException();
            }
        }
    }

    public static int C(int i10, int i11) {
        return q2.a.d(i10, (Color.alpha(i10) * i11) / 255);
    }

    public static final m C0(kotlinx.coroutines.flow.b bVar, x xVar, kotlinx.coroutines.flow.s sVar, Object obj) {
        kotlinx.coroutines.flow.r c10 = e.c(bVar);
        StateFlowImpl a10 = f.a(obj);
        return new m(a10, e.f(xVar, c10.f15448d, c10.f15446a, a10, sVar, obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01cb, code lost:
        if (r7 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x020c, code lost:
        if (v7.g.a(v7.i.a(r0.with()), v7.i.a(kotlinx.serialization.PolymorphicSerializer.class)) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0139, code lost:
        if (r12 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0188, code lost:
        if (r12 == false) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e2 A[Catch: NoSuchFieldException -> 0x01e5, TRY_LEAVE, TryCatch #5 {NoSuchFieldException -> 0x01e5, blocks: (B:121:0x01d7, B:123:0x01de, B:125:0x01e2), top: B:152:0x01d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final qa.b D(c8.b bVar, qa.b... bVarArr) {
        Object obj;
        boolean z10;
        Class[] clsArr;
        Object invoke;
        qa.b bVar2;
        boolean z11;
        qa.b bVar3;
        boolean z12;
        boolean z13;
        qa.b bVar4;
        Class<?> cls;
        Object obj2;
        boolean z14;
        PolymorphicSerializer polymorphicSerializer;
        boolean z15;
        g.f(bVar, "<this>");
        g.f(bVarArr, "args");
        Class y02 = c.y0(bVar);
        qa.b[] bVarArr2 = (qa.b[]) Arrays.copyOf(bVarArr, bVarArr.length);
        g.f(bVarArr2, "args");
        if (y02.isEnum()) {
            if (y02.getAnnotation(qa.d.class) == null && y02.getAnnotation(qa.c.class) == null) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                Object[] enumConstants = y02.getEnumConstants();
                String canonicalName = y02.getCanonicalName();
                g.e(canonicalName, "canonicalName");
                g.d(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
                return new EnumSerializer(canonicalName, (Enum[]) enumConstants);
            }
        }
        if (y02.isInterface()) {
            qa.d dVar = (qa.d) y02.getAnnotation(qa.d.class);
            if (dVar != null && !g.a(i.a(dVar.with()), i.a(PolymorphicSerializer.class))) {
                polymorphicSerializer = null;
                if (polymorphicSerializer != null) {
                    return polymorphicSerializer;
                }
            }
            polymorphicSerializer = new PolymorphicSerializer(i.a(y02));
            if (polymorphicSerializer != null) {
            }
        }
        qa.b[] bVarArr3 = (qa.b[]) Arrays.copyOf(bVarArr2, bVarArr2.length);
        try {
            Field declaredField = y02.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        if (obj != null) {
            try {
                if (bVarArr3.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    clsArr = new Class[0];
                } else {
                    int length = bVarArr3.length;
                    Class[] clsArr2 = new Class[length];
                    for (int i10 = 0; i10 < length; i10++) {
                        clsArr2[i10] = qa.b.class;
                    }
                    clsArr = clsArr2;
                }
                invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(bVarArr3, bVarArr3.length));
            } catch (NoSuchMethodException unused2) {
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause != null) {
                    String message = cause.getMessage();
                    if (message == null) {
                        message = e10.getMessage();
                    }
                    throw new InvocationTargetException(cause, message);
                }
                throw e10;
            }
            if (invoke instanceof qa.b) {
                bVar2 = (qa.b) invoke;
                if (bVar2 != null) {
                    Field[] declaredFields = y02.getDeclaredFields();
                    g.e(declaredFields, "declaredFields");
                    int length2 = declaredFields.length;
                    Field field = null;
                    int i11 = 0;
                    boolean z16 = false;
                    while (true) {
                        if (i11 < length2) {
                            Field field2 = declaredFields[i11];
                            if (g.a(field2.getName(), "INSTANCE") && g.a(field2.getType(), y02) && Modifier.isStatic(field2.getModifiers())) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                if (z16) {
                                    break;
                                }
                                field = field2;
                                z16 = true;
                            }
                            i11++;
                        }
                    }
                    field = null;
                    if (field != null) {
                        Object obj3 = field.get(null);
                        Method[] methods = y02.getMethods();
                        g.e(methods, "methods");
                        int length3 = methods.length;
                        Method method = null;
                        int i12 = 0;
                        boolean z17 = false;
                        while (true) {
                            if (i12 < length3) {
                                Method method2 = methods[i12];
                                if (g.a(method2.getName(), "serializer")) {
                                    Class<?>[] parameterTypes = method2.getParameterTypes();
                                    g.e(parameterTypes, "it.parameterTypes");
                                    if (parameterTypes.length == 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13 && g.a(method2.getReturnType(), qa.b.class)) {
                                        z12 = true;
                                        if (z12) {
                                            if (z17) {
                                                break;
                                            }
                                            method = method2;
                                            z17 = true;
                                        }
                                        i12++;
                                    }
                                }
                                z12 = false;
                                if (z12) {
                                }
                                i12++;
                            }
                        }
                        method = null;
                        if (method != null) {
                            z11 = false;
                            Object invoke2 = method.invoke(obj3, new Object[0]);
                            if (invoke2 instanceof qa.b) {
                                bVar3 = (qa.b) invoke2;
                            } else {
                                bVar3 = null;
                            }
                            if (bVar3 == null) {
                                try {
                                    Class<?>[] declaredClasses = y02.getDeclaredClasses();
                                    g.e(declaredClasses, "declaredClasses");
                                    int length4 = declaredClasses.length;
                                    int i13 = 0;
                                    boolean z18 = false;
                                    cls = null;
                                    while (true) {
                                        if (i13 < length4) {
                                            try {
                                                Class<?> cls2 = declaredClasses[i13];
                                                if (g.a(cls2.getSimpleName(), "$serializer")) {
                                                    if (z18) {
                                                        break;
                                                    }
                                                    cls = cls2;
                                                    z18 = true;
                                                }
                                                i13++;
                                            } catch (NoSuchFieldException unused3) {
                                                bVar4 = null;
                                            }
                                        }
                                    }
                                    cls = null;
                                } catch (NoSuchFieldException unused4) {
                                    bVar4 = null;
                                }
                                if (cls != null) {
                                    Field field3 = cls.getField("INSTANCE");
                                    if (field3 != null) {
                                        bVar4 = null;
                                        try {
                                            obj2 = field3.get(null);
                                        } catch (NoSuchFieldException unused5) {
                                            bVar3 = bVar4;
                                            if (bVar3 != null) {
                                            }
                                        }
                                        if (obj2 instanceof qa.b) {
                                            bVar3 = (qa.b) obj2;
                                            if (bVar3 != null) {
                                                if (y02.getAnnotation(qa.c.class) == null) {
                                                    qa.d dVar2 = (qa.d) y02.getAnnotation(qa.d.class);
                                                    if (dVar2 != null) {
                                                    }
                                                    if (!z11) {
                                                        bVar3 = new PolymorphicSerializer(i.a(y02));
                                                        return bVar3;
                                                    }
                                                    return bVar4;
                                                }
                                                z11 = true;
                                                if (!z11) {
                                                }
                                            }
                                        }
                                        bVar3 = bVar4;
                                        if (bVar3 != null) {
                                        }
                                    }
                                }
                                bVar4 = null;
                                obj2 = null;
                                if (obj2 instanceof qa.b) {
                                }
                                bVar3 = bVar4;
                                if (bVar3 != null) {
                                }
                            }
                            return bVar3;
                        }
                    }
                    bVar3 = null;
                    z11 = false;
                    if (bVar3 == null) {
                    }
                    return bVar3;
                }
                return bVar2;
            }
        }
        bVar2 = null;
        if (bVar2 != null) {
        }
    }

    public static TypeSubstitutor D0(List list, q qVar, l8.f fVar, List list2) {
        if (qVar == null) {
            e(1);
            throw null;
        } else if (fVar == null) {
            e(2);
            throw null;
        } else if (list2 == null) {
            e(3);
            throw null;
        } else {
            TypeSubstitutor E02 = E0(list, qVar, fVar, list2, null);
            if (E02 != null) {
                return E02;
            }
            throw new AssertionError("Substitution failed");
        }
    }

    public static final double E(double d5, DurationUnit durationUnit, DurationUnit durationUnit2) {
        g.f(durationUnit2, "targetUnit");
        TimeUnit timeUnit = durationUnit2.f15142i;
        TimeUnit timeUnit2 = durationUnit.f15142i;
        long convert = timeUnit.convert(1L, timeUnit2);
        return convert > 0 ? d5 * convert : d5 / timeUnit2.convert(1L, timeUnit);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TypeSubstitutor E0(List list, q qVar, l8.f fVar, List list2, boolean[] zArr) {
        TypeSubstitutor typeSubstitutor;
        y9.r k3;
        if (qVar != null) {
            if (fVar != null) {
                if (list2 != null) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    Iterator it = list.iterator();
                    int i10 = 0;
                    while (it.hasNext()) {
                        i0 i0Var = (i0) it.next();
                        j0 V02 = j0.V0(fVar, i0Var.getAnnotations(), i0Var.X(), i0Var.t(), i0Var.getName(), i10, i0Var.G());
                        hashMap.put(i0Var.o(), new h0(V02.r()));
                        hashMap2.put(i0Var, V02);
                        list2.add(V02);
                        i10++;
                    }
                    o.a aVar = o.f15066b;
                    n nVar = new n(hashMap, false);
                    TypeSubstitutor f10 = TypeSubstitutor.f(qVar, nVar);
                    TypeSubstitutor f11 = TypeSubstitutor.f(new y9.i0(qVar), nVar);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        i0 i0Var2 = (i0) it2.next();
                        j0 j0Var = (j0) hashMap2.get(i0Var2);
                        for (y9.r rVar : i0Var2.getUpperBounds()) {
                            l8.d c10 = rVar.U0().c();
                            if (c10 instanceof i0) {
                                i0 i0Var3 = (i0) c10;
                                g.f(i0Var3, "typeParameter");
                                if (TypeUtilsKt.i(i0Var3, null, null)) {
                                    typeSubstitutor = f10;
                                    k3 = typeSubstitutor.k(rVar, Variance.OUT_VARIANCE);
                                    if (k3 != null) {
                                        return null;
                                    }
                                    if (k3 != rVar && zArr != null) {
                                        zArr[0] = true;
                                    }
                                    j0Var.U0();
                                    if (!m0.b.D0(k3)) {
                                        j0Var.f16435t.add(k3);
                                    }
                                }
                            }
                            typeSubstitutor = f11;
                            k3 = typeSubstitutor.k(rVar, Variance.OUT_VARIANCE);
                            if (k3 != null) {
                            }
                        }
                        j0Var.U0();
                        j0Var.f16436u = true;
                    }
                    return f10;
                }
                e(8);
                throw null;
            }
            e(7);
            throw null;
        }
        e(6);
        throw null;
    }

    public static final long F(long j2, DurationUnit durationUnit, DurationUnit durationUnit2) {
        g.f(durationUnit, "sourceUnit");
        g.f(durationUnit2, "targetUnit");
        return durationUnit2.f15142i.convert(j2, durationUnit.f15142i);
    }

    public static final void F0(int i10, int i11, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        StringBuilder sb;
        String str;
        g.f(pluginGeneratedSerialDescriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(pluginGeneratedSerialDescriptor.f15638e[i13]);
            }
            i12 >>>= 1;
        }
        String str2 = pluginGeneratedSerialDescriptor.f15635a;
        g.f(str2, "serialName");
        if (arrayList.size() == 1) {
            sb = new StringBuilder("Field '");
            sb.append((String) arrayList.get(0));
            sb.append("' is required for type with serial name '");
            sb.append(str2);
            str = "', but it was missing";
        } else {
            sb = new StringBuilder("Fields ");
            sb.append(arrayList);
            sb.append(" are required for type with serial name '");
            sb.append(str2);
            str = "', but they were missing";
        }
        sb.append(str);
        throw new MissingFieldException(arrayList, sb.toString(), null);
    }

    public static l8.b G(l8.b bVar) {
        h9.d g10 = k9.d.g(bVar);
        String str = k8.c.f12921a;
        h9.c cVar = k8.c.f12930k.get(g10);
        if (cVar != null) {
            return DescriptorUtilsKt.e(bVar).j(cVar);
        }
        throw new IllegalArgumentException("Given class " + bVar + " is not a read-only collection");
    }

    public static final void G0(String str, c8.b bVar) {
        String k3;
        g.f(bVar, "baseClass");
        String str2 = "in the scope of '" + bVar.d() + '\'';
        if (str == null) {
            k3 = "Class discriminator was missing and no default polymorphic serializers were registered " + str2;
        } else {
            StringBuilder sb = new StringBuilder("Class '");
            sb.append(str);
            sb.append("' is not registered for polymorphic serialization ");
            sb.append(str2);
            sb.append(".\nTo be registered automatically, class '");
            sb.append(str);
            sb.append("' has to be '@Serializable', and the base class '");
            sb.append(bVar.d());
            sb.append("' has to be sealed and '@Serializable'.\nAlternatively, register the serializer for '");
            k3 = androidx.activity.e.k(sb, str, "' explicitly in a corresponding SerializersModule.");
        }
        throw new SerializationException(k3);
    }

    public static final Object H(u7.p pVar, p7.c cVar) {
        kotlinx.coroutines.internal.p pVar2 = new kotlinx.coroutines.internal.p(cVar, cVar.f());
        return c.B1(pVar2, pVar2, pVar);
    }

    public static Bitmap H0(Drawable drawable, int i10, int i11) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                if (i10 == bitmapDrawable.getBitmap().getWidth() && i11 == bitmapDrawable.getBitmap().getHeight()) {
                    Bitmap bitmap = bitmapDrawable.getBitmap();
                    g.e(bitmap, "bitmap");
                    return bitmap;
                }
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i10, i11, true);
                g.e(createScaledBitmap, "createScaledBitmap(bitmap, width, height, true)");
                return createScaledBitmap;
            }
            throw new IllegalArgumentException("bitmap is null");
        }
        Rect bounds = drawable.getBounds();
        g.e(bounds, "bounds");
        int i12 = bounds.left;
        int i13 = bounds.top;
        int i14 = bounds.right;
        int i15 = bounds.bottom;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, i10, i11);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i12, i13, i14, i15);
        g.e(createBitmap, "bitmap");
        return createBitmap;
    }

    public static final EnumSerializer I(String str, Enum[] enumArr) {
        g.f(enumArr, "values");
        return new EnumSerializer(str, enumArr);
    }

    public static final na.c I0(na.e eVar, na.g gVar) {
        return new na.c(eVar.f16149i.atZone(gVar.f16151a).toInstant());
    }

    public static final Object J(va.f fVar, qa.a aVar) {
        String str;
        g.f(fVar, "<this>");
        g.f(aVar, "deserializer");
        if ((aVar instanceof ua.b) && !fVar.H().f18191a.f18216i) {
            String x3 = x(aVar.a(), fVar.H());
            kotlinx.serialization.json.b N2 = fVar.N();
            sa.e a10 = aVar.a();
            if (N2 instanceof JsonObject) {
                JsonObject jsonObject = (JsonObject) N2;
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) jsonObject.get(x3);
                String str2 = null;
                kotlinx.serialization.json.c cVar = null;
                if (bVar != null) {
                    ua.j0 j0Var = va.g.f18220a;
                    if (bVar instanceof kotlinx.serialization.json.c) {
                        cVar = (kotlinx.serialization.json.c) bVar;
                    }
                    if (cVar != null) {
                        str2 = cVar.c();
                    } else {
                        throw new IllegalArgumentException("Element " + i.a(bVar.getClass()) + " is not a JsonPrimitive");
                    }
                }
                qa.a f10 = ((ua.b) aVar).f(fVar, str2);
                if (f10 == null) {
                    if (str2 == null) {
                        str = "missing class discriminator ('null')";
                    } else {
                        str = "class discriminator '" + str2 + '\'';
                    }
                    throw c.q(-1, "Polymorphic serializer was not found for " + str, jsonObject.toString());
                }
                va.a H2 = fVar.H();
                g.f(H2, "<this>");
                g.f(x3, "discriminator");
                return new kotlinx.serialization.json.internal.c(H2, jsonObject, x3, f10.a()).J(f10);
            }
            throw c.r("Expected " + i.a(JsonObject.class) + " as the serialized body of " + a10.b() + ", but had " + i.a(N2.getClass()), -1);
        }
        return aVar.e(fVar);
    }

    public static final na.e J0(na.c cVar, na.g gVar) {
        g.f(cVar, "<this>");
        try {
            return new na.e(LocalDateTime.ofInstant(cVar.f16147i, gVar.f16151a));
        } catch (DateTimeException e10) {
            throw new DateTimeArithmeticException(e10);
        }
    }

    public static final kotlinx.coroutines.flow.b K(kotlinx.coroutines.flow.b bVar) {
        u7.l<Object, Object> lVar = FlowKt__DistinctKt.f15242a;
        if (!(bVar instanceof u)) {
            u7.l<Object, Object> lVar2 = FlowKt__DistinctKt.f15242a;
            u7.p<Object, Object, Boolean> pVar = FlowKt__DistinctKt.f15243b;
            if (bVar instanceof DistinctFlowImpl) {
                DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) bVar;
                if (distinctFlowImpl.f15212j == lVar2 && distinctFlowImpl.f15213k == pVar) {
                    return bVar;
                }
            }
            return new DistinctFlowImpl(bVar, lVar2, pVar);
        }
        return bVar;
    }

    public static final v K0(y9.r rVar) {
        g.f(rVar, "<this>");
        m0 X02 = rVar.X0();
        if (X02 instanceof y9.n) {
            return ((y9.n) X02).f18959k;
        }
        if (X02 instanceof v) {
            return (v) X02;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void L(CoroutineContext coroutineContext) {
        u0 u0Var = (u0) coroutineContext.a(u0.b.f12806i);
        if (u0Var != null && !u0Var.b()) {
            throw u0Var.C();
        }
    }

    public static final Object L0(CoroutineContext coroutineContext, Object obj, Object obj2, u7.p pVar, p7.c cVar) {
        Object c10 = ThreadContextKt.c(coroutineContext, obj2);
        try {
            k kVar = new k(cVar, coroutineContext);
            v7.l.d(2, pVar);
            Object R2 = pVar.R(obj, kVar);
            ThreadContextKt.a(coroutineContext, c10);
            if (R2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                g.f(cVar, "frame");
            }
            return R2;
        } catch (Throwable th) {
            ThreadContextKt.a(coroutineContext, c10);
            throw th;
        }
    }

    public static final boolean M(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (z10) {
            char upperCase = Character.toUpperCase(c10);
            char upperCase2 = Character.toUpperCase(c11);
            return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return false;
    }

    public static final m0 M0(m0 m0Var, y9.r rVar) {
        g.f(m0Var, "<this>");
        if (m0Var instanceof l0) {
            return M0(((l0) m0Var).M0(), rVar);
        }
        if (rVar != null && !g.a(rVar, m0Var)) {
            if (m0Var instanceof v) {
                return new y9.x((v) m0Var, rVar);
            }
            if (m0Var instanceof y9.n) {
                return new y9.p((y9.n) m0Var, rVar);
            }
            throw new NoWhenBranchMatchedException();
        }
        return m0Var;
    }

    public static String N(ByteString byteString) {
        String str;
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i10 = 0; i10 < byteString.size(); i10++) {
            int c10 = byteString.c(i10);
            if (c10 != 34) {
                if (c10 != 39) {
                    if (c10 != 92) {
                        switch (c10) {
                            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                str = "\\a";
                                break;
                            case 8:
                                str = "\\b";
                                break;
                            case ma.i.f16046m /* 9 */:
                                str = "\\t";
                                break;
                            case ma.i.f16047o /* 10 */:
                                str = "\\n";
                                break;
                            case 11:
                                str = "\\v";
                                break;
                            case 12:
                                str = "\\f";
                                break;
                            case 13:
                                str = "\\r";
                                break;
                            default:
                                if (c10 < 32 || c10 > 126) {
                                    sb.append('\\');
                                    sb.append((char) (((c10 >>> 6) & 3) + 48));
                                    sb.append((char) (((c10 >>> 3) & 7) + 48));
                                    c10 = (c10 & 7) + 48;
                                }
                                sb.append((char) c10);
                                continue;
                                break;
                        }
                    } else {
                        str = "\\\\";
                    }
                } else {
                    str = "\\'";
                }
            } else {
                str = "\\\"";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static View O(View view, int i10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View findViewById = viewGroup.getChildAt(i11).findViewById(i10);
                if (findViewById != null) {
                    return findViewById;
                }
            }
            return null;
        }
        return null;
    }

    public static final qa.e P(ua.b bVar, ta.d dVar, Object obj) {
        g.f(bVar, "<this>");
        g.f(dVar, "encoder");
        g.f(obj, "value");
        qa.e g10 = bVar.g(dVar, obj);
        if (g10 == null) {
            c8.b a10 = i.a(obj.getClass());
            c8.b h10 = bVar.h();
            g.f(a10, "subClass");
            g.f(h10, "baseClass");
            String d5 = a10.d();
            if (d5 == null) {
                d5 = String.valueOf(a10);
            }
            G0(d5, h10);
            throw null;
        }
        return g10;
    }

    public static final kotlinx.coroutines.flow.b Q(kotlinx.coroutines.flow.b bVar, CoroutineDispatcher coroutineDispatcher) {
        boolean z10;
        if (coroutineDispatcher.a(u0.b.f12806i) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (!g.a(coroutineDispatcher, EmptyCoroutineContext.f13021i)) {
                if (bVar instanceof ma.f) {
                    return f.a.a((ma.f) bVar, coroutineDispatcher, 0, null, 6);
                }
                return new ma.c(bVar, coroutineDispatcher, 0, null, 12);
            }
            return bVar;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineDispatcher).toString());
    }

    public static final c8.b R(sa.e eVar) {
        g.f(eVar, "<this>");
        if (eVar instanceof sa.b) {
            return ((sa.b) eVar).f17515b;
        }
        if (eVar instanceof n1) {
            return R(((n1) eVar).f17995a);
        }
        return null;
    }

    public static int S(Context context, int i10, int i11) {
        TypedValue a10 = x5.b.a(context, i10);
        if (a10 != null) {
            int i12 = a10.resourceId;
            if (i12 != 0) {
                return n2.a.b(context, i12);
            }
            return a10.data;
        }
        return i11;
    }

    public static int T(View view, int i10) {
        Context context = view.getContext();
        TypedValue c10 = x5.b.c(i10, view.getContext(), view.getClass().getCanonicalName());
        int i11 = c10.resourceId;
        if (i11 != 0) {
            return n2.a.b(context, i11);
        }
        return c10.data;
    }

    public static final int U(Cursor cursor, String str) {
        boolean z10;
        String str2;
        g.f(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25) {
                    if (str.length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        String[] columnNames = cursor.getColumnNames();
                        g.e(columnNames, "columnNames");
                        String concat = ".".concat(str);
                        String str3 = "." + str + '`';
                        int length = columnNames.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            String str4 = columnNames[i10];
                            int i12 = i11 + 1;
                            if (str4.length() < str.length() + 2 || (!ha.i.R0(str4, concat) && (str4.charAt(0) != '`' || !ha.i.R0(str4, str3)))) {
                                i10++;
                                i11 = i12;
                            }
                            columnIndex = i11;
                            break;
                        }
                    }
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = cursor.getColumnNames();
            g.e(columnNames2, "c.columnNames");
            str2 = kotlin.collections.b.q2(columnNames2, null, null, null, null, 63);
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static final org.koin.core.scope.a V(ComponentCallbacks componentCallbacks) {
        org.koin.core.a aVar;
        g.f(componentCallbacks, "<this>");
        if (componentCallbacks instanceof za.a) {
            return ((za.a) componentCallbacks).a();
        }
        if (componentCallbacks instanceof db.b) {
            return ((db.b) componentCallbacks).a();
        }
        if (componentCallbacks instanceof db.a) {
            aVar = ((db.a) componentCallbacks).c();
        } else {
            aVar = c.f72i;
            if (aVar == null) {
                throw new IllegalStateException("KoinApplication has not been started".toString());
            }
        }
        return aVar.f16502a.f15888b;
    }

    public static final y9.r W(y9.r rVar) {
        g.f(rVar, "<this>");
        if (rVar instanceof l0) {
            return ((l0) rVar).c0();
        }
        return null;
    }

    public static final u0 X(CoroutineContext coroutineContext) {
        int i10 = u0.c;
        u0 u0Var = (u0) coroutineContext.a(u0.b.f12806i);
        if (u0Var != null) {
            return u0Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static final g3.b Y(View view) {
        g3.b bVar = (g3.b) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (bVar == null) {
            g3.b bVar2 = new g3.b();
            view.setTag(R.id.pooling_container_listener_holder_tag, bVar2);
            return bVar2;
        }
        return bVar;
    }

    public static final CoroutineDispatcher Z(RoomDatabase roomDatabase) {
        g.f(roomDatabase, "<this>");
        Map<String, Object> map = roomDatabase.f6036k;
        Object obj = map.get("QueryDispatcher");
        if (obj == null) {
            Executor executor = roomDatabase.f6028b;
            if (executor != null) {
                if (executor instanceof e0) {
                    e0 e0Var = (e0) executor;
                }
                obj = new ja.m0(executor);
                map.put("QueryDispatcher", obj);
            } else {
                g.l("internalQueryExecutor");
                throw null;
            }
        }
        return (CoroutineDispatcher) obj;
    }

    public static final long a0(double d5) {
        return u0((float) d5, 4294967296L);
    }

    public static final long b0(int i10) {
        return u0(i10, 4294967296L);
    }

    public static final CoroutineDispatcher c0(RoomDatabase roomDatabase) {
        g.f(roomDatabase, "<this>");
        Map<String, Object> map = roomDatabase.f6036k;
        Object obj = map.get("TransactionDispatcher");
        if (obj == null) {
            y3.p pVar = roomDatabase.c;
            if (pVar != null) {
                if (pVar instanceof e0) {
                    e0 e0Var = (e0) pVar;
                }
                obj = new ja.m0(pVar);
                map.put("TransactionDispatcher", obj);
            } else {
                g.l("internalTransactionExecutor");
                throw null;
            }
        }
        return (CoroutineDispatcher) obj;
    }

    public static final x d0(androidx.lifecycle.i0 i0Var) {
        Object obj;
        g.f(i0Var, "<this>");
        HashMap hashMap = i0Var.f5397a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = i0Var.f5397a.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
        }
        x xVar = (x) obj;
        if (xVar != null) {
            return xVar;
        }
        l1 l1Var = new l1(null);
        kotlinx.coroutines.scheduling.b bVar = f0.f12766a;
        return (x) i0Var.c(new androidx.lifecycle.d(l1Var.m(kotlinx.coroutines.internal.l.f15491a.W())), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
    }

    public static /* synthetic */ void e(int i10) {
        String str = i10 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 4 ? 3 : 2];
        switch (i10) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "newContainingDeclaration";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case 8:
                objArr[0] = "result";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i10 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        if (i10 == 4) {
            throw new IllegalStateException(format);
        }
    }

    public static int e0(byte[] bArr, int i10, int i11) {
        byte b5 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b5 > -12) {
                return -1;
            }
            return b5;
        } else if (i12 == 1) {
            byte b10 = bArr[i10];
            if (b5 <= -12 && b10 <= -65) {
                return b5 ^ (b10 << 8);
            }
            return -1;
        } else if (i12 == 2) {
            byte b11 = bArr[i10];
            byte b12 = bArr[i10 + 1];
            if (b5 <= -12 && b11 <= -65 && b12 <= -65) {
                return ((b11 << 8) ^ b5) ^ (b12 << 16);
            }
            return -1;
        } else {
            throw new AssertionError();
        }
    }

    public static AbstractChannel f(int i10, BufferOverflow bufferOverflow, int i11) {
        boolean z10 = false;
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        int i12 = i11 & 2;
        BufferOverflow bufferOverflow2 = BufferOverflow.SUSPEND;
        if (i12 != 0) {
            bufferOverflow = bufferOverflow2;
        }
        int i13 = 1;
        if (i10 != -2) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != Integer.MAX_VALUE) {
                        if (i10 == 1 && bufferOverflow == BufferOverflow.DROP_OLDEST) {
                            return new h(null);
                        }
                        return new la.b(i10, bufferOverflow, null);
                    }
                    return new la.i(null);
                } else if (bufferOverflow == bufferOverflow2) {
                    return new la.o(null);
                } else {
                    return new la.b(1, bufferOverflow, null);
                }
            }
            if (bufferOverflow == bufferOverflow2) {
                z10 = true;
            }
            if (z10) {
                return new h(null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (bufferOverflow == bufferOverflow2) {
            la.c.f15873e.getClass();
            i13 = c.a.f15875b;
        }
        return new la.b(i13, bufferOverflow, null);
    }

    public static final m0 f0(m0 m0Var, y9.r rVar) {
        g.f(m0Var, "<this>");
        g.f(rVar, "origin");
        return M0(m0Var, W(rVar));
    }

    public static final kotlinx.coroutines.internal.e g(CoroutineContext coroutineContext) {
        if (coroutineContext.a(u0.b.f12806i) == null) {
            coroutineContext = coroutineContext.m(new w0(null));
        }
        return new kotlinx.coroutines.internal.e(coroutineContext);
    }

    public static final boolean g0(x xVar) {
        CoroutineContext j2 = xVar.j();
        int i10 = u0.c;
        u0 u0Var = (u0) j2.a(u0.b.f12806i);
        if (u0Var != null) {
            return u0Var.b();
        }
        return true;
    }

    public static final long h(float f10, float f11) {
        long floatToIntBits = (Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32);
        int i10 = b2.k.c;
        return floatToIntBits;
    }

    public static final boolean h0(CoroutineContext coroutineContext) {
        int i10 = u0.c;
        u0 u0Var = (u0) coroutineContext.a(u0.b.f12806i);
        return u0Var != null && u0Var.b();
    }

    public static c7.a i(long[] jArr, long j2, boolean z10, String str, int i10) {
        boolean z11 = (i10 & 2) != 0;
        if ((i10 & 4) != 0) {
            j2 = 0;
        }
        long j10 = j2;
        boolean z12 = (i10 & 16) != 0 ? false : z10;
        if ((i10 & 32) != 0) {
            str = null;
        }
        return new c7.a(jArr, z11, j10, false, z12, str);
    }

    public static final boolean i0(Context context) {
        Context baseContext;
        if (context == null) {
            return true;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing()) {
                return true;
            }
            return activity.isDestroyed();
        }
        ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
        if (contextWrapper == null || (baseContext = contextWrapper.getBaseContext()) == null) {
            return false;
        }
        return i0(baseContext);
    }

    public static androidx.activity.l j(OnBackPressedDispatcher onBackPressedDispatcher, o0 o0Var, u7.l lVar, int i10) {
        boolean z10;
        if ((i10 & 1) != 0) {
            o0Var = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        androidx.activity.l lVar2 = new androidx.activity.l(lVar, z10);
        if (o0Var != null) {
            onBackPressedDispatcher.a(o0Var, lVar2);
        } else {
            onBackPressedDispatcher.f439b.add(lVar2);
            lVar2.f463b.add(new OnBackPressedDispatcher.b(lVar2));
            if (v2.a.a()) {
                onBackPressedDispatcher.c();
                lVar2.c = onBackPressedDispatcher.c;
            }
        }
        return lVar2;
    }

    public static boolean j0(int i10) {
        double pow;
        double pow2;
        double pow3;
        if (i10 != 0) {
            ThreadLocal<double[]> threadLocal = q2.a.f16869a;
            double[] dArr = threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i10);
            int green = Color.green(i10);
            int blue = Color.blue(i10);
            if (dArr.length == 3) {
                double d5 = red / 255.0d;
                if (d5 < 0.04045d) {
                    pow = d5 / 12.92d;
                } else {
                    pow = Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
                }
                double d10 = green / 255.0d;
                if (d10 < 0.04045d) {
                    pow2 = d10 / 12.92d;
                } else {
                    pow2 = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
                }
                double d11 = blue / 255.0d;
                if (d11 < 0.04045d) {
                    pow3 = d11 / 12.92d;
                } else {
                    pow3 = Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
                }
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d12 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d12;
                double d13 = pow3 * 0.9505d;
                dArr[2] = (d13 + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d12 / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        }
        return false;
    }

    public static final void k(Appendable appendable, Object obj, u7.l lVar) {
        CharSequence valueOf;
        g.f(appendable, "<this>");
        if (lVar != null) {
            obj = lVar.U(obj);
        } else {
            if (!(obj == null ? true : obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    appendable.append(((Character) obj).charValue());
                    return;
                }
                valueOf = String.valueOf(obj);
                appendable.append(valueOf);
            }
        }
        valueOf = (CharSequence) obj;
        appendable.append(valueOf);
    }

    public static final boolean k0(y9.r rVar) {
        g.f(rVar, "<this>");
        return rVar.X0() instanceof y9.n;
    }

    public static final y9.n l(y9.r rVar) {
        g.f(rVar, "<this>");
        m0 X02 = rVar.X0();
        g.d(X02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (y9.n) X02;
    }

    public static boolean l0(MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }

    public static final m m(kotlinx.coroutines.flow.k kVar) {
        return new m(kVar, null);
    }

    public static final boolean m0(Throwable th) {
        Class<?> cls = th.getClass();
        while (!g.a(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static final Bundle n(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.f12962i;
            B b5 = pair.f12963j;
            if (b5 == 0) {
                bundle.putString(str, null);
            } else if (b5 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b5).booleanValue());
            } else if (b5 instanceof Byte) {
                bundle.putByte(str, ((Number) b5).byteValue());
            } else if (b5 instanceof Character) {
                bundle.putChar(str, ((Character) b5).charValue());
            } else if (b5 instanceof Double) {
                bundle.putDouble(str, ((Number) b5).doubleValue());
            } else if (b5 instanceof Float) {
                bundle.putFloat(str, ((Number) b5).floatValue());
            } else if (b5 instanceof Integer) {
                bundle.putInt(str, ((Number) b5).intValue());
            } else if (b5 instanceof Long) {
                bundle.putLong(str, ((Number) b5).longValue());
            } else if (b5 instanceof Short) {
                bundle.putShort(str, ((Number) b5).shortValue());
            } else if (b5 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b5);
            } else if (b5 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b5);
            } else if (b5 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b5);
            } else if (b5 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b5);
            } else if (b5 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b5);
            } else if (b5 instanceof char[]) {
                bundle.putCharArray(str, (char[]) b5);
            } else if (b5 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b5);
            } else if (b5 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b5);
            } else if (b5 instanceof int[]) {
                bundle.putIntArray(str, (int[]) b5);
            } else if (b5 instanceof long[]) {
                bundle.putLongArray(str, (long[]) b5);
            } else if (b5 instanceof short[]) {
                bundle.putShortArray(str, (short[]) b5);
            } else if (b5 instanceof Object[]) {
                Class<?> componentType = b5.getClass().getComponentType();
                g.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) b5);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) b5);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) b5);
                } else if (!Serializable.class.isAssignableFrom(componentType)) {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                } else {
                    bundle.putSerializable(str, (Serializable) b5);
                }
            } else {
                if (!(b5 instanceof Serializable)) {
                    if (b5 instanceof IBinder) {
                        v2.b.a(bundle, str, (IBinder) b5);
                    } else if (b5 instanceof Size) {
                        v2.c.a(bundle, str, (Size) b5);
                    } else if (b5 instanceof SizeF) {
                        v2.c.b(bundle, str, (SizeF) b5);
                    } else {
                        throw new IllegalArgumentException("Illegal value type " + b5.getClass().getCanonicalName() + " for key \"" + str + '\"');
                    }
                }
                bundle.putSerializable(str, (Serializable) b5);
            }
        }
        return bundle;
    }

    public static final boolean n0(long j2) {
        j[] jVarArr = b2.i.f6347b;
        return (j2 & 1095216660480L) == 0;
    }

    public static final void o(View view) {
        g.f(view, "<this>");
        Iterator<Object> it = androidx.core.view.a.a(view).iterator();
        while (true) {
            ga.i iVar = (ga.i) it;
            if (iVar.hasNext()) {
                ArrayList<g3.a> arrayList = Y((View) iVar.next()).f11221a;
                for (int B02 = c.B0(arrayList); -1 < B02; B02--) {
                    arrayList.get(B02).a();
                }
            } else {
                return;
            }
        }
    }

    public static final boolean o0(char c10) {
        if (!Character.isWhitespace(c10) && !Character.isSpaceChar(c10)) {
            return false;
        }
        return true;
    }

    public static final CallbackFlowBuilder p(u7.p pVar) {
        return new CallbackFlowBuilder(pVar, EmptyCoroutineContext.f13021i, -2, BufferOverflow.SUSPEND);
    }

    public static int p0(float f10, int i10, int i11) {
        return q2.a.b(q2.a.d(i11, Math.round(Color.alpha(i11) * f10)), i10);
    }

    public static final boolean q(Object obj) {
        if (!(obj instanceof p0.m)) {
            if ((obj instanceof m7.c) && (obj instanceof Serializable)) {
                return false;
            } else {
                Class[] clsArr = f27g;
                for (int i10 = 0; i10 < 7; i10++) {
                    if (clsArr[i10].isInstance(obj)) {
                        return true;
                    }
                }
                return false;
            }
        }
        p0.m mVar = (p0.m) obj;
        if (mVar.c() != g0.h0.f11052a && mVar.c() != j1.f11059a && mVar.c() != s0.f11078a) {
            return false;
        }
        T value = mVar.getValue();
        if (value == 0) {
            return true;
        }
        return q(value);
    }

    public static final v q0(y9.r rVar) {
        g.f(rVar, "<this>");
        m0 X02 = rVar.X0();
        if (X02 instanceof y9.n) {
            return ((y9.n) X02).f18958j;
        }
        if (X02 instanceof v) {
            return (v) X02;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void r(CoroutineContext coroutineContext, CancellationException cancellationException) {
        int i10 = u0.c;
        u0 u0Var = (u0) coroutineContext.a(u0.b.f12806i);
        if (u0Var != null) {
            u0Var.c(cancellationException);
        }
    }

    public static l8.b r0(b bVar, h9.c cVar, kotlin.reflect.jvm.internal.impl.builtins.e eVar) {
        bVar.getClass();
        g.f(eVar, "builtIns");
        String str = k8.c.f12921a;
        h9.b f10 = k8.c.f(cVar);
        if (f10 != null) {
            return eVar.j(f10.b());
        }
        return null;
    }

    public static void s(x xVar) {
        u0 u0Var = (u0) xVar.j().a(u0.b.f12806i);
        if (u0Var != null) {
            u0Var.c(null);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + xVar).toString());
    }

    public static ib.a s0(u7.l lVar) {
        g.f(lVar, "moduleDeclaration");
        ib.a aVar = new ib.a(false);
        lVar.U(aVar);
        return aVar;
    }

    public static final void t(la.m mVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                cancellationException.initCause(th);
            }
        }
        mVar.c(cancellationException);
    }

    public static final long t0(long j2, long j10, long j11) {
        long j12;
        long j13;
        oa.a aVar;
        int i10;
        long j14;
        long j15 = -1;
        int i11 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i11 > 0 && j10 < 0) {
            j12 = j2 - 1;
            j13 = j10 + 1000000000;
        } else if (i11 < 0 && j10 > 0) {
            j12 = j2 + 1;
            j13 = j10 - 1000000000;
        } else {
            j12 = j2;
            j13 = j10;
        }
        int i12 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
        if (i12 == 0) {
            return j13 / j11;
        }
        if (i12 != 0) {
            long j16 = j12 * 1000000000;
            if (j16 / 1000000000 != j12) {
                j16 = 0;
            }
            if (j16 != 0) {
                aVar = new oa.a(j16 / j11, j16 % j11);
            } else if (1000000000 == j11) {
                aVar = new oa.a(j12, 0L);
            } else if (j12 == j11) {
                aVar = new oa.a(1000000000L, 0L);
            } else {
                if (i12 >= 0) {
                    j15 = 0;
                }
                long j17 = j12 & 4294967295L;
                long j18 = (j12 >> 32) & 4294967295L;
                long j19 = (j18 * 0) + (j15 * 0);
                long j20 = (0 * j17) + (j18 * 0) + (j15 * 1000000000);
                long j21 = j18 * 1000000000;
                long j22 = 0 * j17;
                long j23 = j17 * 1000000000;
                long j24 = j23 & 4294967295L;
                long j25 = (j21 & 4294967295L) + (j22 & 4294967295L) + ((j23 >> 32) & 4294967295L);
                long j26 = j25 & 4294967295L;
                long j27 = ((j25 >> 32) & 4294967295L) + (j20 & 4294967295L) + ((j21 >> 32) & 4294967295L) + ((j22 >> 32) & 4294967295L);
                long j28 = j24 | (j26 << 32);
                long j29 = (((((j27 >> 32) & 4294967295L) + ((j20 >> 32) & 4294967295L)) + (j19 & 4294967295L)) << 32) | (j27 & 4294967295L);
                if (((j29 >> 63) & 1) == 1) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                if (i10 == -1) {
                    j28 = (~j28) + 1;
                    j29 = ~j29;
                    if (j28 == 0) {
                        j29++;
                    }
                }
                int i13 = 127;
                long j30 = 0;
                long j31 = 0;
                for (int i14 = -1; i14 < i13; i14 = -1) {
                    if (i13 < 64) {
                        j14 = j28 >> i13;
                    } else {
                        j14 = j29 >> (i13 - 64);
                    }
                    j31 = (j31 << 1) | (j14 & 1);
                    if (j31 >= j11 || j31 < 0) {
                        j31 -= j11;
                        if (i13 < 63) {
                            j30 |= 1 << i13;
                        } else {
                            throw new ArithmeticException("The result of a multiplication followed by division overflows a long");
                        }
                    }
                    i13--;
                }
                long j32 = i10;
                aVar = new oa.a(j30 * j32, j32 * j31);
            }
        } else {
            aVar = new oa.a(0L, 0L);
        }
        return c.n1(aVar.f16488a, c.n1(j13 / j11, c.n1(j13 % j11, aVar.f16489b) / j11));
    }

    public static final byte u(char c10) {
        if (c10 < '~') {
            return wa.e.f18505b[c10];
        }
        return (byte) 0;
    }

    public static final long u0(float f10, long j2) {
        long floatToIntBits = j2 | (Float.floatToIntBits(f10) & 4294967295L);
        j[] jVarArr = b2.i.f6347b;
        return floatToIntBits;
    }

    public static final void v(int i10) {
        if (new b8.i(2, 36).s(i10)) {
            return;
        }
        StringBuilder o10 = a4.b.o("radix ", i10, " was not in valid range ");
        o10.append(new b8.i(2, 36));
        throw new IllegalArgumentException(o10.toString());
    }

    public static final jb.a v0(Object... objArr) {
        return new jb.a(new ArrayList(new n7.f(objArr, false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0089 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int w(Context context, String str) {
        String str2;
        boolean z10;
        int i10;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            str2 = m2.i.d(str);
        } else {
            str2 = null;
        }
        if (str2 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid != null && packagesForUid.length > 0) {
                    packageName = packagesForUid[0];
                }
                return -1;
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            int i12 = 1;
            if (myUid2 == myUid && z2.b.a(packageName2, packageName)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (i11 >= 29) {
                    AppOpsManager c10 = m2.j.c(context);
                    i10 = m2.j.a(c10, str2, Binder.getCallingUid(), packageName);
                    if (i10 == 0) {
                        i10 = m2.j.a(c10, str2, myUid, m2.j.b(context));
                    }
                    if (i10 != 0) {
                        return -2;
                    }
                } else if (i11 >= 23) {
                    i12 = m2.i.c((AppOpsManager) m2.i.a(context, AppOpsManager.class), str2, packageName);
                }
            } else if (i11 >= 23) {
                i12 = m2.i.c((AppOpsManager) m2.i.a(context, AppOpsManager.class), str2, packageName);
            }
            i10 = i12;
            if (i10 != 0) {
            }
        }
        return 0;
    }

    public static int w0(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return 0;
        }
        while (i10 < i11) {
            int i12 = i10 + 1;
            byte b5 = bArr[i10];
            if (b5 < 0) {
                if (b5 < -32) {
                    if (i12 >= i11) {
                        return b5;
                    }
                    if (b5 >= -62) {
                        i10 = i12 + 1;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                } else if (b5 < -16) {
                    if (i12 < i11 - 1) {
                        int i13 = i12 + 1;
                        byte b10 = bArr[i12];
                        if (b10 <= -65 && ((b5 != -32 || b10 >= -96) && (b5 != -19 || b10 < -96))) {
                            i10 = i13 + 1;
                            if (bArr[i13] > -65) {
                            }
                        }
                        return -1;
                    }
                    return e0(bArr, i12, i11);
                } else if (i12 >= i11 - 2) {
                    return e0(bArr, i12, i11);
                } else {
                    int i14 = i12 + 1;
                    byte b11 = bArr[i12];
                    if (b11 <= -65) {
                        if ((((b11 + 112) + (b5 << 28)) >> 30) == 0) {
                            int i15 = i14 + 1;
                            if (bArr[i14] <= -65) {
                                i12 = i15 + 1;
                                if (bArr[i15] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
            }
            i10 = i12;
        }
        return 0;
    }

    public static final String x(sa.e eVar, va.a aVar) {
        g.f(eVar, "<this>");
        g.f(aVar, "json");
        for (Annotation annotation : eVar.getAnnotations()) {
            if (annotation instanceof va.d) {
                return ((va.d) annotation).discriminator();
            }
        }
        return aVar.f18191a.f18217j;
    }

    public static final Object x0(Object obj) {
        return obj instanceof ja.s ? m0.b.Q(((ja.s) obj).f12801a) : obj;
    }

    public static final void y(View view) {
        view.setAlpha(1.0f);
        view.setScaleY(1.0f);
        view.setScaleX(1.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setPivotY(view.getMeasuredHeight() / 2.0f);
        view.setPivotX(view.getMeasuredWidth() / 2.0f);
        ViewPropertyAnimator interpolator = view.animate().setInterpolator(null);
        g.e(interpolator, "animate().setInterpolator(null)");
        interpolator.setStartDelay(0L);
    }

    /* JADX WARN: Finally extract failed */
    public static final void y0(d0 d0Var, p7.c cVar, boolean z10) {
        Object i10 = d0Var.i();
        Throwable d5 = d0Var.d(i10);
        Object Q2 = d5 != null ? m0.b.Q(d5) : d0Var.e(i10);
        if (!z10) {
            cVar.t(Q2);
            return;
        }
        kotlinx.coroutines.internal.f fVar = (kotlinx.coroutines.internal.f) cVar;
        p7.c<T> cVar2 = fVar.f15477m;
        CoroutineContext f10 = cVar2.f();
        Object c10 = ThreadContextKt.c(f10, fVar.f15478o);
        p1<?> d10 = c10 != ThreadContextKt.f15463a ? CoroutineContextKt.d(cVar2, f10, c10) : null;
        try {
            fVar.f15477m.t(Q2);
            m7.n nVar = m7.n.f16010a;
            if (d10 == null || d10.E0()) {
                ThreadContextKt.a(f10, c10);
            }
        } catch (Throwable th) {
            if (d10 == null || d10.E0()) {
                ThreadContextKt.a(f10, c10);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1] */
    public static final FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 z(kotlinx.coroutines.flow.b bVar, kotlinx.coroutines.flow.b bVar2, kotlinx.coroutines.flow.b bVar3, final u7.r rVar) {
        final kotlinx.coroutines.flow.b[] bVarArr = {bVar, bVar2, bVar3};
        return new kotlinx.coroutines.flow.b<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1

            @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/c;", "", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
            @q7.c(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {333, 333}, m = "invokeSuspend")
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2 extends SuspendLambda implements u7.q<c<Object>, Object[], p7.c<? super m7.n>, Object> {

                /* renamed from: m  reason: collision with root package name */
                public int f15304m;
                public /* synthetic */ c n;

                /* renamed from: o  reason: collision with root package name */
                public /* synthetic */ Object[] f15305o;

                /* renamed from: p  reason: collision with root package name */
                public final /* synthetic */ u7.r f15306p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(p7.c cVar, u7.r rVar) {
                    super(3, cVar);
                    this.f15306p = rVar;
                }

                @Override // u7.q
                public final Object O(c<Object> cVar, Object[] objArr, p7.c<? super m7.n> cVar2) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar2, this.f15306p);
                    anonymousClass2.n = cVar;
                    anonymousClass2.f15305o = objArr;
                    return anonymousClass2.k(m7.n.f16010a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object k(Object obj) {
                    c cVar;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f15304m;
                    if (i10 == 0) {
                        m0.b.n1(obj);
                        cVar = this.n;
                        Object[] objArr = this.f15305o;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        this.n = cVar;
                        this.f15304m = 1;
                        obj = this.f15306p.l0(obj2, obj3, obj4, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (i10 != 1) {
                        if (i10 == 2) {
                            m0.b.n1(obj);
                            return m7.n.f16010a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        cVar = this.n;
                        m0.b.n1(obj);
                    }
                    this.n = null;
                    this.f15304m = 2;
                    if (cVar.c(obj, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return m7.n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Object> cVar, p7.c cVar2) {
                Object a10 = kotlinx.coroutines.flow.internal.c.a(cVar2, FlowKt__ZipKt$nullArrayFactory$1.f15320j, new AnonymousClass2(null, rVar), cVar, bVarArr);
                if (a10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return a10;
                }
                return m7.n.f16010a;
            }
        };
    }

    public static final void z0(p7.c cVar, Object obj, u7.l lVar) {
        Object sVar;
        p1<?> p1Var;
        if (cVar instanceof kotlinx.coroutines.internal.f) {
            kotlinx.coroutines.internal.f fVar = (kotlinx.coroutines.internal.f) cVar;
            Throwable a10 = Result.a(obj);
            boolean z10 = false;
            if (a10 == null) {
                if (lVar != null) {
                    sVar = new ja.t(obj, lVar);
                } else {
                    sVar = obj;
                }
            } else {
                sVar = new ja.s(a10, false);
            }
            p7.c<T> cVar2 = fVar.f15477m;
            CoroutineContext f10 = fVar.f();
            CoroutineDispatcher coroutineDispatcher = fVar.f15476l;
            if (coroutineDispatcher.V(f10)) {
                fVar.n = sVar;
                fVar.f12761k = 1;
                coroutineDispatcher.T(fVar.f(), fVar);
                return;
            }
            k0 a11 = ja.n1.a();
            if (a11.Z()) {
                fVar.n = sVar;
                fVar.f12761k = 1;
                a11.X(fVar);
                return;
            }
            a11.Y(true);
            try {
                u0 u0Var = (u0) fVar.f().a(u0.b.f12806i);
                if (u0Var != null && !u0Var.b()) {
                    CancellationException C2 = u0Var.C();
                    fVar.a(sVar, C2);
                    fVar.t(m0.b.Q(C2));
                    z10 = true;
                }
                if (!z10) {
                    Object obj2 = fVar.f15478o;
                    CoroutineContext f11 = cVar2.f();
                    Object c10 = ThreadContextKt.c(f11, obj2);
                    if (c10 != ThreadContextKt.f15463a) {
                        p1Var = CoroutineContextKt.d(cVar2, f11, c10);
                    } else {
                        p1Var = null;
                    }
                    cVar2.t(obj);
                    m7.n nVar = m7.n.f16010a;
                    if (p1Var == null || p1Var.E0()) {
                        ThreadContextKt.a(f11, c10);
                    }
                }
                do {
                } while (a11.b0());
            } finally {
                try {
                    a11.W(true);
                    return;
                } catch (Throwable th) {
                }
            }
            a11.W(true);
            return;
        }
        cVar.t(obj);
    }

    public y9.r B(LinkedHashSet linkedHashSet) {
        g.f(linkedHashSet, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: ".concat(kotlin.collections.c.t2(linkedHashSet, null, null, null, null, 63)));
    }

    @Override // j1.g0
    public void a() {
    }

    @Override // d9.l
    public void b(l8.b bVar) {
        g.f(bVar, "classDescriptor");
    }

    @Override // j1.g0
    public void c(g0.a aVar) {
        g.f(aVar, "slotIds");
        aVar.clear();
    }

    @Override // d9.l
    public void d(l8.b bVar) {
    }
}
