// Generated code from Butter Knife. Do not modify!
package com.kinometrix.app.api;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.kinometrix.app.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SelectTestActivity_ViewBinding implements Unbinder {
  private SelectTestActivity target;

  private View view2131230954;

  @UiThread
  public SelectTestActivity_ViewBinding(SelectTestActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SelectTestActivity_ViewBinding(final SelectTestActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.tests_listView, "field 'testsListView' and method 'onItemClick'");
    target.testsListView = Utils.castView(view, R.id.tests_listView, "field 'testsListView'", ListView.class);
    view2131230954 = view;
    ((AdapterView<?>) view).setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> p0, View p1, int p2, long p3) {
        target.onItemClick(p0, p1, p2, p3);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    SelectTestActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.testsListView = null;

    ((AdapterView<?>) view2131230954).setOnItemClickListener(null);
    view2131230954 = null;
  }
}
