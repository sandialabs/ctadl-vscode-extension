package com.noto.app.widget;

import a1.c;
import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.slider.Slider;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.components.BaseActivity;
import com.noto.app.util.ViewUtilsKt;
import com.noto.app.widget.FolderListWidgetConfigActivity;
import f7.q;
import h7.d;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.i;
import m0.b;
import m7.e;
import s6.n;
import s6.o;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/widget/FolderListWidgetConfigActivity;", "Lcom/noto/app/components/BaseActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FolderListWidgetConfigActivity extends BaseActivity {
    public static final /* synthetic */ int J = 0;
    public final e H = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new FolderListWidgetConfigActivity$special$$inlined$viewModel$default$1(this, new FolderListWidgetConfigActivity$viewModel$2(this)));
    public final e I = kotlin.a.b(new FolderListWidgetConfigActivity$appWidgetId$2(this));

    public static void r(FolderListWidgetConfigActivity folderListWidgetConfigActivity) {
        g.f(folderListWidgetConfigActivity, "this$0");
        FolderListWidgetConfigViewModel s10 = folderListWidgetConfigActivity.s();
        s10.getClass();
        b.M0(a1.b.d0(s10), null, null, new FolderListWidgetConfigViewModel$createOrUpdateWidget$1(s10, null), 3);
        e eVar = folderListWidgetConfigActivity.I;
        int intValue = ((Number) eVar.getValue()).intValue();
        AppWidgetManager.getInstance(folderListWidgetConfigActivity).notifyAppWidgetViewDataChanged(intValue, R.id.lv);
        Intent intent = new Intent(folderListWidgetConfigActivity, FolderListWidgetProvider.class);
        intent.putExtra("appWidgetIds", new int[]{intValue});
        intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
        folderListWidgetConfigActivity.sendBroadcast(intent);
        Intent putExtra = new Intent().putExtra("appWidgetId", ((Number) eVar.getValue()).intValue());
        g.e(putExtra, "Intent().putExtra(AppWid…PPWIDGET_ID, appWidgetId)");
        folderListWidgetConfigActivity.setResult(-1, putExtra);
        folderListWidgetConfigActivity.finish();
    }

    @Override // com.noto.app.components.BaseActivity, androidx.fragment.app.s, androidx.activity.ComponentActivity, m2.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.folder_list_widget_config_activity, (ViewGroup) null, false);
        int i10 = R.id.abl;
        if (((AppBarLayout) a1.b.O(inflate, R.id.abl)) != null) {
            i10 = R.id.btn_create;
            MaterialButton materialButton = (MaterialButton) a1.b.O(inflate, R.id.btn_create);
            if (materialButton != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
                    NestedScrollView nestedScrollView = (NestedScrollView) a1.b.O(inflate, R.id.nsv);
                    if (nestedScrollView != null) {
                        Slider slider = (Slider) a1.b.O(inflate, R.id.s_widget_radius);
                        if (slider != null) {
                            MaterialSwitch materialSwitch = (MaterialSwitch) a1.b.O(inflate, R.id.sw_app_icon);
                            if (materialSwitch != null) {
                                MaterialSwitch materialSwitch2 = (MaterialSwitch) a1.b.O(inflate, R.id.sw_edit_widget);
                                if (materialSwitch2 != null) {
                                    MaterialSwitch materialSwitch3 = (MaterialSwitch) a1.b.O(inflate, R.id.sw_new_folder);
                                    if (materialSwitch3 != null) {
                                        MaterialSwitch materialSwitch4 = (MaterialSwitch) a1.b.O(inflate, R.id.sw_notes_count);
                                        if (materialSwitch4 != null) {
                                            MaterialSwitch materialSwitch5 = (MaterialSwitch) a1.b.O(inflate, R.id.sw_widget_header);
                                            if (materialSwitch5 != null) {
                                                MaterialToolbar materialToolbar = (MaterialToolbar) a1.b.O(inflate, R.id.tb);
                                                if (materialToolbar != null) {
                                                    if (((MaterialTextView) a1.b.O(inflate, R.id.tv_widget_radius)) != null) {
                                                        View O = a1.b.O(inflate, R.id.widget);
                                                        if (O != null) {
                                                            int i11 = R.id.fab;
                                                            ImageButton imageButton = (ImageButton) a1.b.O(O, R.id.fab);
                                                            if (imageButton != null) {
                                                                i11 = R.id.fl;
                                                                if (((FrameLayout) a1.b.O(O, R.id.fl)) != null) {
                                                                    i11 = R.id.iv_app_icon;
                                                                    ImageView imageView = (ImageView) a1.b.O(O, R.id.iv_app_icon);
                                                                    if (imageView != null) {
                                                                        i11 = R.id.iv_edit_widget;
                                                                        if (((ImageButton) a1.b.O(O, R.id.iv_edit_widget)) != null) {
                                                                            LinearLayout linearLayout = (LinearLayout) O;
                                                                            LinearLayout linearLayout2 = (LinearLayout) a1.b.O(O, R.id.ll_edit_widget);
                                                                            if (linearLayout2 != null) {
                                                                                LinearLayout linearLayout3 = (LinearLayout) a1.b.O(O, R.id.ll_header);
                                                                                if (linearLayout3 != null) {
                                                                                    ListView listView = (ListView) a1.b.O(O, R.id.lv);
                                                                                    if (listView != null) {
                                                                                        TextView textView = (TextView) a1.b.O(O, R.id.tv_app_name);
                                                                                        if (textView != null) {
                                                                                            TextView textView2 = (TextView) a1.b.O(O, R.id.tv_placeholder);
                                                                                            if (textView2 != null) {
                                                                                                o oVar = new o(coordinatorLayout, materialButton, nestedScrollView, slider, materialSwitch, materialSwitch2, materialSwitch3, materialSwitch4, materialSwitch5, materialToolbar, new n(linearLayout, imageButton, imageView, linearLayout, linearLayout2, linearLayout3, listView, textView, textView2));
                                                                                                setContentView(coordinatorLayout);
                                                                                                setResult(0);
                                                                                                listView.setDividerHeight(q.d(16));
                                                                                                listView.setPaddingRelative(q.d(8), q.d(16), q.d(8), q.d(100));
                                                                                                linearLayout.setClipToOutline(true);
                                                                                                for (MaterialSwitch materialSwitch6 : c.O0(materialSwitch5, materialSwitch2, materialSwitch, materialSwitch3, materialSwitch4)) {
                                                                                                    g.e(materialSwitch6, "it");
                                                                                                    ViewUtilsKt.u(materialSwitch6);
                                                                                                }
                                                                                                f.b(new i(s().f9961h, a1.b.m(s().n), new FolderListWidgetConfigActivity$setupState$2(oVar, this, null)), ma.i.z(this));
                                                                                                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderListWidgetConfigActivity$setupState$3(oVar, this, null), s().f9962i), ma.i.z(this));
                                                                                                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderListWidgetConfigActivity$setupState$4(oVar, null), a1.b.m(s().f9963j)), ma.i.z(this));
                                                                                                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderListWidgetConfigActivity$setupState$5(oVar, null), a1.b.m(s().f9964k)), ma.i.z(this));
                                                                                                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderListWidgetConfigActivity$setupState$6(oVar, null), a1.b.m(s().f9965l)), ma.i.z(this));
                                                                                                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderListWidgetConfigActivity$setupState$7(oVar, null), a1.b.m(s().f9966m)), ma.i.z(this));
                                                                                                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderListWidgetConfigActivity$setupState$8(oVar, this, null), a1.b.m(s().f9967o)), ma.i.z(this));
                                                                                                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderListWidgetConfigActivity$setupState$9(oVar, null), s().f9968p), ma.i.z(this));
                                                                                                oVar.f17442j.setOnClickListener(new o6.c(11, oVar));
                                                                                                oVar.f17441i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: h7.b

                                                                                                    /* renamed from: b  reason: collision with root package name */
                                                                                                    public final /* synthetic */ FolderListWidgetConfigActivity f11542b;

                                                                                                    {
                                                                                                        this.f11542b = this;
                                                                                                    }

                                                                                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                                                                                                        int i12 = r2;
                                                                                                        FolderListWidgetConfigActivity folderListWidgetConfigActivity = this.f11542b;
                                                                                                        switch (i12) {
                                                                                                            case 0:
                                                                                                                int i13 = FolderListWidgetConfigActivity.J;
                                                                                                                v7.g.f(folderListWidgetConfigActivity, "this$0");
                                                                                                                folderListWidgetConfigActivity.s().f9963j.setValue(Boolean.valueOf(z10));
                                                                                                                return;
                                                                                                            default:
                                                                                                                int i14 = FolderListWidgetConfigActivity.J;
                                                                                                                v7.g.f(folderListWidgetConfigActivity, "this$0");
                                                                                                                folderListWidgetConfigActivity.s().f9966m.setValue(Boolean.valueOf(z10));
                                                                                                                return;
                                                                                                        }
                                                                                                    }
                                                                                                });
                                                                                                oVar.f17438f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: h7.c

                                                                                                    /* renamed from: b  reason: collision with root package name */
                                                                                                    public final /* synthetic */ FolderListWidgetConfigActivity f11544b;

                                                                                                    {
                                                                                                        this.f11544b = this;
                                                                                                    }

                                                                                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                                                                                                        int i12 = r2;
                                                                                                        FolderListWidgetConfigActivity folderListWidgetConfigActivity = this.f11544b;
                                                                                                        switch (i12) {
                                                                                                            case 0:
                                                                                                                int i13 = FolderListWidgetConfigActivity.J;
                                                                                                                v7.g.f(folderListWidgetConfigActivity, "this$0");
                                                                                                                folderListWidgetConfigActivity.s().f9964k.setValue(Boolean.valueOf(z10));
                                                                                                                return;
                                                                                                            default:
                                                                                                                int i14 = FolderListWidgetConfigActivity.J;
                                                                                                                v7.g.f(folderListWidgetConfigActivity, "this$0");
                                                                                                                folderListWidgetConfigActivity.s().n.setValue(Boolean.valueOf(z10));
                                                                                                                return;
                                                                                                        }
                                                                                                    }
                                                                                                });
                                                                                                oVar.f17437e.setOnCheckedChangeListener(new d(this, 0));
                                                                                                oVar.f17439g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: h7.b

                                                                                                    /* renamed from: b  reason: collision with root package name */
                                                                                                    public final /* synthetic */ FolderListWidgetConfigActivity f11542b;

                                                                                                    {
                                                                                                        this.f11542b = this;
                                                                                                    }

                                                                                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                                                                                                        int i12 = r2;
                                                                                                        FolderListWidgetConfigActivity folderListWidgetConfigActivity = this.f11542b;
                                                                                                        switch (i12) {
                                                                                                            case 0:
                                                                                                                int i13 = FolderListWidgetConfigActivity.J;
                                                                                                                v7.g.f(folderListWidgetConfigActivity, "this$0");
                                                                                                                folderListWidgetConfigActivity.s().f9963j.setValue(Boolean.valueOf(z10));
                                                                                                                return;
                                                                                                            default:
                                                                                                                int i14 = FolderListWidgetConfigActivity.J;
                                                                                                                v7.g.f(folderListWidgetConfigActivity, "this$0");
                                                                                                                folderListWidgetConfigActivity.s().f9966m.setValue(Boolean.valueOf(z10));
                                                                                                                return;
                                                                                                        }
                                                                                                    }
                                                                                                });
                                                                                                oVar.f17440h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: h7.c

                                                                                                    /* renamed from: b  reason: collision with root package name */
                                                                                                    public final /* synthetic */ FolderListWidgetConfigActivity f11544b;

                                                                                                    {
                                                                                                        this.f11544b = this;
                                                                                                    }

                                                                                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                                                                                                        int i12 = r2;
                                                                                                        FolderListWidgetConfigActivity folderListWidgetConfigActivity = this.f11544b;
                                                                                                        switch (i12) {
                                                                                                            case 0:
                                                                                                                int i13 = FolderListWidgetConfigActivity.J;
                                                                                                                v7.g.f(folderListWidgetConfigActivity, "this$0");
                                                                                                                folderListWidgetConfigActivity.s().f9964k.setValue(Boolean.valueOf(z10));
                                                                                                                return;
                                                                                                            default:
                                                                                                                int i14 = FolderListWidgetConfigActivity.J;
                                                                                                                v7.g.f(folderListWidgetConfigActivity, "this$0");
                                                                                                                folderListWidgetConfigActivity.s().n.setValue(Boolean.valueOf(z10));
                                                                                                                return;
                                                                                                        }
                                                                                                    }
                                                                                                });
                                                                                                oVar.f17436d.f10419t.add(new d6.a() { // from class: h7.e
                                                                                                    @Override // d6.a
                                                                                                    public final void a(Object obj, float f10) {
                                                                                                        int i12 = FolderListWidgetConfigActivity.J;
                                                                                                        FolderListWidgetConfigActivity folderListWidgetConfigActivity = FolderListWidgetConfigActivity.this;
                                                                                                        v7.g.f(folderListWidgetConfigActivity, "this$0");
                                                                                                        v7.g.f((Slider) obj, "<anonymous parameter 0>");
                                                                                                        folderListWidgetConfigActivity.s().f9967o.setValue(Integer.valueOf((int) f10));
                                                                                                    }
                                                                                                });
                                                                                                oVar.f17435b.setOnClickListener(new h6.b(13, this));
                                                                                                g.e(oVar.f17434a, "root");
                                                                                                return;
                                                                                            }
                                                                                            i11 = R.id.tv_placeholder;
                                                                                        } else {
                                                                                            i11 = R.id.tv_app_name;
                                                                                        }
                                                                                    } else {
                                                                                        i11 = R.id.lv;
                                                                                    }
                                                                                } else {
                                                                                    i11 = R.id.ll_header;
                                                                                }
                                                                            } else {
                                                                                i11 = R.id.ll_edit_widget;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            throw new NullPointerException("Missing required view with ID: ".concat(O.getResources().getResourceName(i11)));
                                                        }
                                                        i10 = R.id.widget;
                                                    } else {
                                                        i10 = R.id.tv_widget_radius;
                                                    }
                                                } else {
                                                    i10 = R.id.tb;
                                                }
                                            } else {
                                                i10 = R.id.sw_widget_header;
                                            }
                                        } else {
                                            i10 = R.id.sw_notes_count;
                                        }
                                    } else {
                                        i10 = R.id.sw_new_folder;
                                    }
                                } else {
                                    i10 = R.id.sw_edit_widget;
                                }
                            } else {
                                i10 = R.id.sw_app_icon;
                            }
                        } else {
                            i10 = R.id.s_widget_radius;
                        }
                    } else {
                        i10 = R.id.nsv;
                    }
                } else {
                    i10 = R.id.ll;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    public final FolderListWidgetConfigViewModel s() {
        return (FolderListWidgetConfigViewModel) this.H.getValue();
    }
}
