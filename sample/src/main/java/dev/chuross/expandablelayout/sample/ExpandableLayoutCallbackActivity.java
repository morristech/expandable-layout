package dev.chuross.expandablelayout.sample;

import android.os.Bundle;
import android.widget.Toast;
import com.github.chuross.library.ExpandableLayout;
import com.github.chuross.library.OnExpandListener;

public class ExpandableLayoutCallbackActivity extends BaseCollapseActivity {

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_basic_expandablelayout;
    }

    @Override
    protected int getExpandableLayoutId() {
        return R.id.layout_expandable;
    }

    @Override
    protected int getButtonId() {
        return R.id.button;
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getExpandableLayout().setOnExpandListener(new OnExpandListener() {
            @Override
            public void onExpanded(final ExpandableLayout view) {
                Toast.makeText(ExpandableLayoutCallbackActivity.this, "expanded", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCollapsed(final ExpandableLayout view) {
                Toast.makeText(ExpandableLayoutCallbackActivity.this, "collapsed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
