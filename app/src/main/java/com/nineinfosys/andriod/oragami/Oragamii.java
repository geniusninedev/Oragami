package com.nineinfosys.andriod.oragami;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nineinfosys.andriod.oragami.Box.BoxIndexGrid;
import com.nineinfosys.andriod.oragami.Butterfly.ButterflyIndexGrid;
import com.nineinfosys.andriod.oragami.Clothes.ClothesIndexGrid;
import com.nineinfosys.andriod.oragami.Flower.FlowerIndexGrid;
import com.nineinfosys.andriod.oragami.Heart.HeartIndexGrid;
import com.nineinfosys.andriod.oragami.Origami.PaperIndex;
import com.nineinfosys.andriod.oragami.Origami.TipsIndex;
import com.nineinfosys.andriod.oragami.Plane.PlaneIndexGrid;
import com.nineinfosys.andriod.oragami.Toys.ToysIndexGrid;
import com.nineinfosys.andriod.oragami.Traditional.Animals.SeaAnimalsGrid;
import com.nineinfosys.andriod.oragami.Traditional.Animals.TaditionalAnimalsGrid;
import com.nineinfosys.andriod.oragami.Traditional.TraditionalBirdsGrid;

public class Oragamii extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    public static String[] list = {"Birds","Animals","Sea Animals","Flower","Toys","Box","Clothes","Heart","Plane","Butterfly"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oragamii);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.mylist,R.id.textView1, list);
        ListView categories=(ListView)findViewById(R.id.listview);
        categories.setAdapter(adapter);
        categories.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent intent=new Intent(Oragamii.this,TraditionalBirdsGrid.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent=new Intent(Oragamii.this,TaditionalAnimalsGrid.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent=new Intent(Oragamii.this,SeaAnimalsGrid.class);
                    startActivity(intent);
                }
                if(position==3){
                    Intent intent=new Intent(Oragamii.this,FlowerIndexGrid.class);
                    startActivity(intent);
                }
                if(position==4){
                    Intent intent=new Intent(Oragamii.this,ToysIndexGrid.class);
                    startActivity(intent);
                }
                if(position==5){
                    Intent intent=new Intent(Oragamii.this,BoxIndexGrid.class);
                    startActivity(intent);
                }
                if(position==6) {
                    Intent intent = new Intent(Oragamii.this, ClothesIndexGrid.class);
                    startActivity(intent);
                }
                if(position==7){
                    Intent intent=new Intent(Oragamii.this,HeartIndexGrid.class);
                    startActivity(intent);
                }
                if(position==8){
                    Intent intent=new Intent(Oragamii.this,PlaneIndexGrid.class);
                    startActivity(intent);
                }
                if(position==9){
                    Intent intent=new Intent(Oragamii.this,ButterflyIndexGrid.class);
                    startActivity(intent);
                }


            }
        });



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.oragamii, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

         if (id == R.id.nav_gallery) {
            Intent intent=new Intent(Oragamii.this,PaperIndex.class);
            startActivity(intent);
        } else if (id == R.id.nav_slideshow) {
            Intent intent=new Intent(Oragamii.this,TipsIndex.class);
            startActivity(intent);
        }  else if (id == R.id.nav_share) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
