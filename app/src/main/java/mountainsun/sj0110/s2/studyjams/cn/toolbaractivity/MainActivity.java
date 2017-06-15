package mountainsun.sj0110.s2.studyjams.cn.toolbaractivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        // 显示应用的Logo
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);

        // 显示标题和子标题
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        toolbar.setTitle("ToolbarDemo");
        toolbar.setSubtitle("和乐天气");
        // 显示导航按钮
        toolbar.setNavigationIcon(R.drawable.ic_back1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()) {
            case R.id.toolbar_action1:
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);

        }
    }
}
