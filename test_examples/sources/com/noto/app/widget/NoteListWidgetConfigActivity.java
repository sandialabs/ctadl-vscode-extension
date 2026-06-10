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
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.slider.Slider;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.components.BaseActivity;
import com.noto.app.domain.model.FilteringType;
import com.noto.app.main.SelectFolderDialogFragment;
import com.noto.app.util.ViewUtilsKt;
import com.noto.app.widget.NoteListWidgetConfigActivity;
import f7.q;
import h7.d;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.f;
import m0.b;
import m7.e;
import ma.i;
import s6.i0;
import s6.j0;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/widget/NoteListWidgetConfigActivity;", "Lcom/noto/app/components/BaseActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteListWidgetConfigActivity extends BaseActivity {
    public static final /* synthetic */ int L = 0;
    public final e H = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new NoteListWidgetConfigActivity$special$$inlined$viewModel$default$1(this, new NoteListWidgetConfigActivity$viewModel$2(this)));
    public final e I = kotlin.a.b(new NoteListWidgetConfigActivity$appWidgetId$2(this));
    public final e J = kotlin.a.b(new NoteListWidgetConfigActivity$folderId$2(this));
    public SelectFolderDialogFragment K;

    public static void r(NoteListWidgetConfigActivity noteListWidgetConfigActivity) {
        g.f(noteListWidgetConfigActivity, "this$0");
        NoteListWidgetConfigViewModel s10 = noteListWidgetConfigActivity.s();
        s10.getClass();
        b.M0(a1.b.d0(s10), null, null, new NoteListWidgetConfigViewModel$createOrUpdateWidget$1(s10, null), 3);
        e eVar = noteListWidgetConfigActivity.I;
        int intValue = ((Number) eVar.getValue()).intValue();
        AppWidgetManager.getInstance(noteListWidgetConfigActivity).notifyAppWidgetViewDataChanged(intValue, R.id.lv);
        Intent intent = new Intent(noteListWidgetConfigActivity, NoteListWidgetProvider.class);
        intent.putExtra("appWidgetIds", new int[]{intValue});
        intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
        noteListWidgetConfigActivity.sendBroadcast(intent);
        Intent putExtra = new Intent().putExtra("appWidgetId", ((Number) eVar.getValue()).intValue());
        g.e(putExtra, "Intent().putExtra(AppWid…PPWIDGET_ID, appWidgetId)");
        noteListWidgetConfigActivity.setResult(-1, putExtra);
        noteListWidgetConfigActivity.finish();
    }

    @Override // com.noto.app.components.BaseActivity, androidx.fragment.app.s, androidx.activity.ComponentActivity, m2.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.note_list_widget_config_activity, (ViewGroup) null, false);
        int i10 = R.id.abl;
        if (((AppBarLayout) a1.b.O(inflate, R.id.abl)) != null) {
            i10 = R.id.btn_create;
            MaterialButton materialButton = (MaterialButton) a1.b.O(inflate, R.id.btn_create);
            if (materialButton != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
                    LinearLayout linearLayout = (LinearLayout) a1.b.O(inflate, R.id.ll_filtering);
                    if (linearLayout != null) {
                        LinearLayout linearLayout2 = (LinearLayout) a1.b.O(inflate, R.id.ll_folder);
                        if (linearLayout2 != null) {
                            NestedScrollView nestedScrollView = (NestedScrollView) a1.b.O(inflate, R.id.nsv);
                            if (nestedScrollView != null) {
                                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) a1.b.O(inflate, R.id.rv);
                                if (epoxyRecyclerView != null) {
                                    Slider slider = (Slider) a1.b.O(inflate, R.id.s_widget_radius);
                                    if (slider != null) {
                                        MaterialSwitch materialSwitch = (MaterialSwitch) a1.b.O(inflate, R.id.sw_app_icon);
                                        if (materialSwitch != null) {
                                            MaterialSwitch materialSwitch2 = (MaterialSwitch) a1.b.O(inflate, R.id.sw_edit_widget);
                                            if (materialSwitch2 != null) {
                                                MaterialSwitch materialSwitch3 = (MaterialSwitch) a1.b.O(inflate, R.id.sw_new_folder);
                                                if (materialSwitch3 != null) {
                                                    MaterialSwitch materialSwitch4 = (MaterialSwitch) a1.b.O(inflate, R.id.sw_widget_header);
                                                    if (materialSwitch4 != null) {
                                                        MaterialToolbar materialToolbar = (MaterialToolbar) a1.b.O(inflate, R.id.tb);
                                                        if (materialToolbar != null) {
                                                            if (((MaterialTextView) a1.b.O(inflate, R.id.tv_filtering)) != null) {
                                                                MaterialTextView materialTextView = (MaterialTextView) a1.b.O(inflate, R.id.tv_filtering_value);
                                                                if (materialTextView != null) {
                                                                    if (((MaterialTextView) a1.b.O(inflate, R.id.tv_folder)) != null) {
                                                                        MaterialTextView materialTextView2 = (MaterialTextView) a1.b.O(inflate, R.id.tv_folder_value);
                                                                        if (materialTextView2 != null) {
                                                                            if (((MaterialTextView) a1.b.O(inflate, R.id.tv_widget_radius)) != null) {
                                                                                View O = a1.b.O(inflate, R.id.widget);
                                                                                if (O != null) {
                                                                                    int i11 = R.id.fab;
                                                                                    FrameLayout frameLayout = (FrameLayout) a1.b.O(O, R.id.fab);
                                                                                    if (frameLayout != null) {
                                                                                        i11 = R.id.fl;
                                                                                        if (((FrameLayout) a1.b.O(O, R.id.fl)) != null) {
                                                                                            i11 = R.id.ib_fab;
                                                                                            if (((ImageButton) a1.b.O(O, R.id.ib_fab)) != null) {
                                                                                                i11 = R.id.iv_app_icon;
                                                                                                ImageView imageView = (ImageView) a1.b.O(O, R.id.iv_app_icon);
                                                                                                if (imageView != null) {
                                                                                                    i11 = R.id.iv_edit_widget;
                                                                                                    if (((ImageButton) a1.b.O(O, R.id.iv_edit_widget)) != null) {
                                                                                                        i11 = R.id.iv_fab;
                                                                                                        ImageView imageView2 = (ImageView) a1.b.O(O, R.id.iv_fab);
                                                                                                        if (imageView2 != null) {
                                                                                                            LinearLayout linearLayout3 = (LinearLayout) O;
                                                                                                            LinearLayout linearLayout4 = (LinearLayout) a1.b.O(O, R.id.ll_edit_widget);
                                                                                                            if (linearLayout4 != null) {
                                                                                                                LinearLayout linearLayout5 = (LinearLayout) a1.b.O(O, R.id.ll_header);
                                                                                                                if (linearLayout5 != null) {
                                                                                                                    ListView listView = (ListView) a1.b.O(O, R.id.lv);
                                                                                                                    if (listView != null) {
                                                                                                                        TextView textView = (TextView) a1.b.O(O, R.id.tv_folder_title);
                                                                                                                        if (textView != null) {
                                                                                                                            TextView textView2 = (TextView) a1.b.O(O, R.id.tv_placeholder);
                                                                                                                            if (textView2 != null) {
                                                                                                                                j0 j0Var = new j0(coordinatorLayout, materialButton, linearLayout, linearLayout2, nestedScrollView, epoxyRecyclerView, slider, materialSwitch, materialSwitch2, materialSwitch3, materialSwitch4, materialToolbar, materialTextView, materialTextView2, new i0(linearLayout3, frameLayout, imageView, imageView2, linearLayout3, linearLayout4, linearLayout5, listView, textView, textView2));
                                                                                                                                setContentView(coordinatorLayout);
                                                                                                                                if (((Number) this.J.getValue()).longValue() == 0) {
                                                                                                                                    t(false);
                                                                                                                                } else {
                                                                                                                                    s().d(((Number) this.J.getValue()).longValue());
                                                                                                                                }
                                                                                                                                setResult(0);
                                                                                                                                listView.setDividerHeight(q.d(16));
                                                                                                                                listView.setPaddingRelative(q.d(8), q.d(16), q.d(8), q.d(100));
                                                                                                                                linearLayout3.setClipToOutline(true);
                                                                                                                                epoxyRecyclerView.setEdgeEffectFactory(new f7.e());
                                                                                                                                for (MaterialSwitch materialSwitch5 : c.O0(materialSwitch4, materialSwitch2, materialSwitch, materialSwitch3)) {
                                                                                                                                    g.e(materialSwitch5, "it");
                                                                                                                                    ViewUtilsKt.u(materialSwitch5);
                                                                                                                                }
                                                                                                                                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteListWidgetConfigActivity$setupState$2(j0Var, this, null), s().f10089m), i.z(this));
                                                                                                                                f.b(a1.b.A(a1.b.m(s().f10086j), a1.b.m(s().f10087k), a1.b.m(s().f10088l), a1.b.m(s().f10094s), new NoteListWidgetConfigActivity$setupState$3(j0Var, this, null)), i.z(this));
                                                                                                                                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteListWidgetConfigActivity$setupState$4(j0Var, null), a1.b.m(s().n)), i.z(this));
                                                                                                                                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteListWidgetConfigActivity$setupState$5(j0Var, null), a1.b.m(s().f10090o)), i.z(this));
                                                                                                                                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteListWidgetConfigActivity$setupState$6(j0Var, null), a1.b.m(s().f10091p)), i.z(this));
                                                                                                                                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteListWidgetConfigActivity$setupState$7(j0Var, null), a1.b.m(s().f10092q)), i.z(this));
                                                                                                                                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteListWidgetConfigActivity$setupState$8(j0Var, this, null), a1.b.m(s().f10093r)), i.z(this));
                                                                                                                                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteListWidgetConfigActivity$setupState$9(j0Var, this, null), a1.b.m(s().f10094s)), i.z(this));
                                                                                                                                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteListWidgetConfigActivity$setupState$10(j0Var, null), s().f10095t), i.z(this));
                                                                                                                                j0Var.f17401l.setOnClickListener(new z5.a(5, j0Var));
                                                                                                                                j0Var.f17393d.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.widget.a

                                                                                                                                    /* renamed from: j  reason: collision with root package name */
                                                                                                                                    public final /* synthetic */ NoteListWidgetConfigActivity f10145j;

                                                                                                                                    {
                                                                                                                                        this.f10145j = this;
                                                                                                                                    }

                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                    public final void onClick(View view) {
                                                                                                                                        int i12 = r2;
                                                                                                                                        NoteListWidgetConfigActivity noteListWidgetConfigActivity = this.f10145j;
                                                                                                                                        switch (i12) {
                                                                                                                                            case 0:
                                                                                                                                                int i13 = NoteListWidgetConfigActivity.L;
                                                                                                                                                g.f(noteListWidgetConfigActivity, "this$0");
                                                                                                                                                noteListWidgetConfigActivity.t(true);
                                                                                                                                                return;
                                                                                                                                            default:
                                                                                                                                                int i14 = NoteListWidgetConfigActivity.L;
                                                                                                                                                g.f(noteListWidgetConfigActivity, "this$0");
                                                                                                                                                new NoteListFilteringWidgetDialogFragment((FilteringType) a1.b.m(noteListWidgetConfigActivity.s().f10094s).getValue(), new NoteListWidgetConfigActivity$setupListeners$8$1(noteListWidgetConfigActivity)).f0(noteListWidgetConfigActivity.f5251z.f5260a.f5265l, null);
                                                                                                                                                return;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                });
                                                                                                                                j0Var.f17400k.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: h7.g

                                                                                                                                    /* renamed from: b  reason: collision with root package name */
                                                                                                                                    public final /* synthetic */ NoteListWidgetConfigActivity f11552b;

                                                                                                                                    {
                                                                                                                                        this.f11552b = this;
                                                                                                                                    }

                                                                                                                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                                                                                                                                        int i12 = r2;
                                                                                                                                        NoteListWidgetConfigActivity noteListWidgetConfigActivity = this.f11552b;
                                                                                                                                        switch (i12) {
                                                                                                                                            case 0:
                                                                                                                                                int i13 = NoteListWidgetConfigActivity.L;
                                                                                                                                                v7.g.f(noteListWidgetConfigActivity, "this$0");
                                                                                                                                                noteListWidgetConfigActivity.s().n.setValue(Boolean.valueOf(z10));
                                                                                                                                                return;
                                                                                                                                            default:
                                                                                                                                                int i14 = NoteListWidgetConfigActivity.L;
                                                                                                                                                v7.g.f(noteListWidgetConfigActivity, "this$0");
                                                                                                                                                noteListWidgetConfigActivity.s().f10092q.setValue(Boolean.valueOf(z10));
                                                                                                                                                return;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                });
                                                                                                                                j0Var.f17398i.setOnCheckedChangeListener(new m5.a(this, 1));
                                                                                                                                j0Var.f17397h.setOnCheckedChangeListener(new d(this, 1));
                                                                                                                                j0Var.f17399j.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: h7.g

                                                                                                                                    /* renamed from: b  reason: collision with root package name */
                                                                                                                                    public final /* synthetic */ NoteListWidgetConfigActivity f11552b;

                                                                                                                                    {
                                                                                                                                        this.f11552b = this;
                                                                                                                                    }

                                                                                                                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                                                                                                                                        int i12 = r2;
                                                                                                                                        NoteListWidgetConfigActivity noteListWidgetConfigActivity = this.f11552b;
                                                                                                                                        switch (i12) {
                                                                                                                                            case 0:
                                                                                                                                                int i13 = NoteListWidgetConfigActivity.L;
                                                                                                                                                v7.g.f(noteListWidgetConfigActivity, "this$0");
                                                                                                                                                noteListWidgetConfigActivity.s().n.setValue(Boolean.valueOf(z10));
                                                                                                                                                return;
                                                                                                                                            default:
                                                                                                                                                int i14 = NoteListWidgetConfigActivity.L;
                                                                                                                                                v7.g.f(noteListWidgetConfigActivity, "this$0");
                                                                                                                                                noteListWidgetConfigActivity.s().f10092q.setValue(Boolean.valueOf(z10));
                                                                                                                                                return;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                });
                                                                                                                                j0Var.f17396g.f10419t.add(new d6.a() { // from class: h7.h
                                                                                                                                    @Override // d6.a
                                                                                                                                    public final void a(Object obj, float f10) {
                                                                                                                                        int i12 = NoteListWidgetConfigActivity.L;
                                                                                                                                        NoteListWidgetConfigActivity noteListWidgetConfigActivity = NoteListWidgetConfigActivity.this;
                                                                                                                                        v7.g.f(noteListWidgetConfigActivity, "this$0");
                                                                                                                                        v7.g.f((Slider) obj, "<anonymous parameter 0>");
                                                                                                                                        noteListWidgetConfigActivity.s().f10093r.setValue(Integer.valueOf((int) f10));
                                                                                                                                    }
                                                                                                                                });
                                                                                                                                j0Var.c.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.widget.a

                                                                                                                                    /* renamed from: j  reason: collision with root package name */
                                                                                                                                    public final /* synthetic */ NoteListWidgetConfigActivity f10145j;

                                                                                                                                    {
                                                                                                                                        this.f10145j = this;
                                                                                                                                    }

                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                    public final void onClick(View view) {
                                                                                                                                        int i12 = r2;
                                                                                                                                        NoteListWidgetConfigActivity noteListWidgetConfigActivity = this.f10145j;
                                                                                                                                        switch (i12) {
                                                                                                                                            case 0:
                                                                                                                                                int i13 = NoteListWidgetConfigActivity.L;
                                                                                                                                                g.f(noteListWidgetConfigActivity, "this$0");
                                                                                                                                                noteListWidgetConfigActivity.t(true);
                                                                                                                                                return;
                                                                                                                                            default:
                                                                                                                                                int i14 = NoteListWidgetConfigActivity.L;
                                                                                                                                                g.f(noteListWidgetConfigActivity, "this$0");
                                                                                                                                                new NoteListFilteringWidgetDialogFragment((FilteringType) a1.b.m(noteListWidgetConfigActivity.s().f10094s).getValue(), new NoteListWidgetConfigActivity$setupListeners$8$1(noteListWidgetConfigActivity)).f0(noteListWidgetConfigActivity.f5251z.f5260a.f5265l, null);
                                                                                                                                                return;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                });
                                                                                                                                j0Var.f17392b.setOnClickListener(new h6.b(14, this));
                                                                                                                                g.e(j0Var.f17391a, "root");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            i11 = R.id.tv_placeholder;
                                                                                                                        } else {
                                                                                                                            i11 = R.id.tv_folder_title;
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
                                                                                        }
                                                                                    }
                                                                                    throw new NullPointerException("Missing required view with ID: ".concat(O.getResources().getResourceName(i11)));
                                                                                }
                                                                                i10 = R.id.widget;
                                                                            } else {
                                                                                i10 = R.id.tv_widget_radius;
                                                                            }
                                                                        } else {
                                                                            i10 = R.id.tv_folder_value;
                                                                        }
                                                                    } else {
                                                                        i10 = R.id.tv_folder;
                                                                    }
                                                                } else {
                                                                    i10 = R.id.tv_filtering_value;
                                                                }
                                                            } else {
                                                                i10 = R.id.tv_filtering;
                                                            }
                                                        } else {
                                                            i10 = R.id.tb;
                                                        }
                                                    } else {
                                                        i10 = R.id.sw_widget_header;
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
                                    i10 = R.id.rv;
                                }
                            } else {
                                i10 = R.id.nsv;
                            }
                        } else {
                            i10 = R.id.ll_folder;
                        }
                    } else {
                        i10 = R.id.ll_filtering;
                    }
                } else {
                    i10 = R.id.ll;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    public final void onPause() {
        super.onPause();
        SelectFolderDialogFragment selectFolderDialogFragment = this.K;
        if (selectFolderDialogFragment != null) {
            selectFolderDialogFragment.Z();
        }
    }

    public final NoteListWidgetConfigViewModel s() {
        return (NoteListWidgetConfigViewModel) this.H.getValue();
    }

    public final void t(boolean z10) {
        Bundle n = a1.b.n(new Pair("filtered_folder_ids", new long[0]), new Pair("is_dismissible", Boolean.valueOf(z10)), new Pair("selected_folder_id", Long.valueOf(((t6.a) a1.b.m(s().f10086j).getValue()).f17592a)));
        SelectFolderDialogFragment selectFolderDialogFragment = new SelectFolderDialogFragment(new NoteListWidgetConfigActivity$showSelectFolderDialog$1(this));
        selectFolderDialogFragment.W(n);
        selectFolderDialogFragment.f0(this.f5251z.f5260a.f5265l, null);
        this.K = selectFolderDialogFragment;
    }
}
