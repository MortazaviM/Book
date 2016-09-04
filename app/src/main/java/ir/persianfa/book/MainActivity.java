package ir.persianfa.book;



import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    // android.app.FragmentManager fragmentManager;
    android.support.v4.app.FragmentTransaction transaction;
    Group_Fragment group_fragment;
    FragmentManager fragmentManager;
    ViewPagerActivity tab1Listview;
    FriendFragment friendFragment;
    HomeFragment homeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_activity);


        // ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawerLayout);


        group_fragment = new Group_Fragment();
        tab1Listview = new ViewPagerActivity();
        friendFragment = new FriendFragment();
        homeFragment=new HomeFragment();
        fragmentManager = getSupportFragmentManager();
//        transaction = fragmentManager.beginTransaction();

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.content_frame, homeFragment, "home");
        transaction.commit();


//        transaction.add(R.id.container,group_fragment);
//        transaction.commit();


//        getSupportActionBar().setTitle("Group");
//        ListView lv = (ListView) findViewById(R.id.group_listview);
//        Adapter da = new Adapter(getApplicationContext(), R.layout.group_item_list_view);
//        lv.setAdapter(da);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);

        } else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        Log.d("MainAct", "onClick");
        if (menuItem.getItemId() == R.id.home) {


            Log.d("MainAct", "R.id.friend");
            transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.content_frame, homeFragment, "home");
            transaction.commit();
            drawerLayout.closeDrawer(GravityCompat.START);
            getSupportActionBar().setTitle("Home");


        } else if (menuItem.getItemId() == R.id.friends) {


            Log.d("MainAct", "R.id.friend");
            transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.content_frame, friendFragment, "friend");
            transaction.commit();
            drawerLayout.closeDrawer(GravityCompat.START);
            getSupportActionBar().setTitle("Friend");


        } else if (menuItem.getItemId() == R.id.bookmark) {

            Log.d("MainAct", "R.id.bookmark");
            transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.content_frame, tab1Listview, "bookmark");
            transaction.commit();
            drawerLayout.closeDrawer(GravityCompat.START);
            getSupportActionBar().setTitle("Bookshelf");

        } else if (menuItem.getItemId() == R.id.groups) {
            Log.d("MainAct", "R.id.groups");
            transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.content_frame, group_fragment, "groups");
            transaction.commit();
            Log.d("MainAct", "change");
            drawerLayout.closeDrawer(GravityCompat.START);
            getSupportActionBar().setTitle("Group");
        }
        return false;

    }
}
