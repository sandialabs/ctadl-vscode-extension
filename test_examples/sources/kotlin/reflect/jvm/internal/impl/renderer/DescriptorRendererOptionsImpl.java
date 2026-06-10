package kotlin.reflect.jvm.internal.impl.renderer;

import c8.j;
import h9.c;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.a;
import v7.g;
import v7.i;

/* loaded from: classes.dex */
public final class DescriptorRendererOptionsImpl implements b {
    public static final /* synthetic */ j<Object>[] W = {i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "withDefinedIn", "getWithDefinedIn()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "modifiers", "getModifiers()Ljava/util/Set;")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "startFromName", "getStartFromName()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "debugMode", "getDebugMode()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "verbose", "getVerbose()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "unitReturnType", "getUnitReturnType()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "withoutReturnType", "getWithoutReturnType()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "enhancedTypes", "getEnhancedTypes()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "renderDefaultModality", "getRenderDefaultModality()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "receiverAfterName", "getReceiverAfterName()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), i.b(new MutablePropertyReference1Impl(i.a(DescriptorRendererOptionsImpl.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    public final j9.a A;
    public final j9.a B;
    public final j9.a C;
    public final j9.a D;
    public final j9.a E;
    public final j9.a F;
    public final j9.a G;
    public final j9.a H;
    public final j9.a I;
    public final j9.a J;
    public final j9.a K;
    public final j9.a L;
    public final j9.a M;
    public final j9.a N;
    public final j9.a O;
    public final j9.a P;
    public final j9.a Q;
    public final j9.a R;
    public final j9.a S;
    public final j9.a T;
    public final j9.a U;
    public final j9.a V;

    /* renamed from: a  reason: collision with root package name */
    public boolean f14632a;

    /* renamed from: b  reason: collision with root package name */
    public final j9.a f14633b = new j9.a(a.c.f14673a, this);
    public final j9.a c;

    /* renamed from: d  reason: collision with root package name */
    public final j9.a f14634d;

    /* renamed from: e  reason: collision with root package name */
    public final j9.a f14635e;

    /* renamed from: f  reason: collision with root package name */
    public final j9.a f14636f;

    /* renamed from: g  reason: collision with root package name */
    public final j9.a f14637g;

    /* renamed from: h  reason: collision with root package name */
    public final j9.a f14638h;

    /* renamed from: i  reason: collision with root package name */
    public final j9.a f14639i;

    /* renamed from: j  reason: collision with root package name */
    public final j9.a f14640j;

    /* renamed from: k  reason: collision with root package name */
    public final j9.a f14641k;

    /* renamed from: l  reason: collision with root package name */
    public final j9.a f14642l;

    /* renamed from: m  reason: collision with root package name */
    public final j9.a f14643m;
    public final j9.a n;

    /* renamed from: o  reason: collision with root package name */
    public final j9.a f14644o;

    /* renamed from: p  reason: collision with root package name */
    public final j9.a f14645p;

    /* renamed from: q  reason: collision with root package name */
    public final j9.a f14646q;

    /* renamed from: r  reason: collision with root package name */
    public final j9.a f14647r;

    /* renamed from: s  reason: collision with root package name */
    public final j9.a f14648s;

    /* renamed from: t  reason: collision with root package name */
    public final j9.a f14649t;

    /* renamed from: u  reason: collision with root package name */
    public final j9.a f14650u;

    /* renamed from: v  reason: collision with root package name */
    public final j9.a f14651v;

    /* renamed from: w  reason: collision with root package name */
    public final j9.a f14652w;

    /* renamed from: x  reason: collision with root package name */
    public final j9.a f14653x;

    /* renamed from: y  reason: collision with root package name */
    public final j9.a f14654y;

    /* renamed from: z  reason: collision with root package name */
    public final j9.a f14655z;

    public DescriptorRendererOptionsImpl() {
        Boolean bool = Boolean.TRUE;
        this.c = new j9.a(bool, this);
        this.f14634d = new j9.a(bool, this);
        this.f14635e = new j9.a(DescriptorRendererModifier.f14615j, this);
        Boolean bool2 = Boolean.FALSE;
        this.f14636f = new j9.a(bool2, this);
        this.f14637g = new j9.a(bool2, this);
        this.f14638h = new j9.a(bool2, this);
        this.f14639i = new j9.a(bool2, this);
        this.f14640j = new j9.a(bool2, this);
        this.f14641k = new j9.a(bool, this);
        this.f14642l = new j9.a(bool2, this);
        this.f14643m = new j9.a(bool2, this);
        this.n = new j9.a(bool2, this);
        this.f14644o = new j9.a(bool, this);
        this.f14645p = new j9.a(bool, this);
        this.f14646q = new j9.a(bool2, this);
        this.f14647r = new j9.a(bool2, this);
        this.f14648s = new j9.a(bool2, this);
        this.f14649t = new j9.a(bool2, this);
        this.f14650u = new j9.a(bool2, this);
        this.f14651v = new j9.a(bool2, this);
        this.f14652w = new j9.a(bool2, this);
        this.f14653x = new j9.a(DescriptorRendererOptionsImpl$typeNormalizer$2.f14657j, this);
        this.f14654y = new j9.a(DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2.f14656j, this);
        this.f14655z = new j9.a(bool, this);
        this.A = new j9.a(OverrideRenderingPolicy.RENDER_OPEN, this);
        this.B = new j9.a(DescriptorRenderer.b.a.f14605a, this);
        this.C = new j9.a(RenderingFormat.f14668i, this);
        this.D = new j9.a(ParameterNameRenderingPolicy.ALL, this);
        this.E = new j9.a(bool2, this);
        this.F = new j9.a(bool2, this);
        this.G = new j9.a(PropertyAccessorRenderingPolicy.DEBUG, this);
        this.H = new j9.a(bool2, this);
        this.I = new j9.a(bool2, this);
        this.J = new j9.a(EmptySet.f12983i, this);
        this.K = new j9.a(j9.b.f12753a, this);
        this.L = new j9.a(null, this);
        this.M = new j9.a(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS, this);
        this.N = new j9.a(bool2, this);
        this.O = new j9.a(bool, this);
        this.P = new j9.a(bool, this);
        this.Q = new j9.a(bool2, this);
        this.R = new j9.a(bool, this);
        this.S = new j9.a(bool, this);
        this.T = new j9.a(bool2, this);
        this.U = new j9.a(bool2, this);
        this.V = new j9.a(bool, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void a() {
        j<Object> jVar = W[29];
        this.E.c(Boolean.TRUE, jVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void b() {
        j<Object> jVar = W[6];
        this.f14638h.c(Boolean.TRUE, jVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void c() {
        j<Object> jVar = W[30];
        this.F.c(Boolean.TRUE, jVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void d(Set<? extends DescriptorRendererModifier> set) {
        g.f(set, "<set-?>");
        this.f14635e.c(set, W[3]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void e(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        this.D.c(parameterNameRenderingPolicy, W[28]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void f() {
        j<Object> jVar = W[4];
        this.f14636f.c(Boolean.TRUE, jVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void g() {
        j<Object> jVar = W[1];
        this.c.c(Boolean.FALSE, jVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final boolean h() {
        return ((Boolean) this.f14643m.b(this, W[11])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final Set<c> i() {
        return (Set) this.K.b(this, W[35]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final boolean j() {
        return ((Boolean) this.f14638h.b(this, W[6])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void k(LinkedHashSet linkedHashSet) {
        this.K.c(linkedHashSet, W[35]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void l() {
        j<Object> jVar = W[20];
        this.f14651v.c(Boolean.TRUE, jVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void m() {
        this.C.c(RenderingFormat.f14669j, W[27]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void n() {
        j<Object> jVar = W[21];
        this.f14652w.c(Boolean.TRUE, jVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void o(a aVar) {
        this.f14633b.c(aVar, W[0]);
    }

    public final AnnotationArgumentsRenderingPolicy p() {
        return (AnnotationArgumentsRenderingPolicy) this.M.b(this, W[37]);
    }
}
