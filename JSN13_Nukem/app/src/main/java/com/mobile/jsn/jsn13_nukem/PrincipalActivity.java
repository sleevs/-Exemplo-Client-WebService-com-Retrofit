package com.mobile.jsn.jsn13_nukem;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.mobile.jsn.mapa.MapaActivity;

public class PrincipalActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

      RecyclerView reciclerView ;
      RecyclerView.LayoutManager layoutManager ;
      RecyclerView.Adapter adapter ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

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
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.nav_anuncios) {

            Intent i = new Intent(this.getApplicationContext(),AnuncioActivity.class);
            startActivity(i);

            // Handle the camera action
        }



        if (id == R.id.nav_perfil) {

            Intent i = new Intent(this.getApplicationContext(),PerfilActivity.class);
            startActivity(i);

            // Handle the camera action
        }
        else if (id == R.id.nav_redesocial) {
            Intent i = new Intent(this.getApplicationContext(),RedeSocialActivity.class);
            startActivity(i);

        } else if (id == R.id.nav_negociacao) {

        }
        else if (id == R.id.nav_suporte) {
            Intent i = new Intent(this.getApplicationContext(),SuporteActivity.class);
            startActivity(i);

          }

        else if (id == R.id.nav_pagamento) {
            Intent i = new Intent(this.getApplicationContext(),PagamentoActivity.class);
            startActivity(i);

        }
        else if (id == R.id.nav_delivery) {
            Intent i = new Intent(this.getApplicationContext(),EntregaActivity.class);
            startActivity(i);

        }
        else if (id == R.id.nav_mobilidade) {
            Intent i = new Intent(this.getApplicationContext(),CorridaActivity.class);
            startActivity(i);

        }
        else if (id == R.id.nav_cursos) {
            Intent i = new Intent(this.getApplicationContext(),CursoActivity.class);
            startActivity(i);

        }
        else if (id == R.id.nav_outsource) {
            Intent i = new Intent(this.getApplicationContext(),AtividadeActivity.class);
            startActivity(i);

        }
        else if (id == R.id.nav_e_commerce) {
            Intent i = new Intent(this.getApplicationContext(),ProdutoActivity.class);
            startActivity(i);

        }
        else if (id == R.id.nav_imoveis) {
            Intent i = new Intent(this.getApplicationContext(),HospedagemActivity.class);
            startActivity(i);

        }

        else if (id == R.id.nav_teste) {
            Intent i = new Intent(this.getApplicationContext(),TesteFullscreenActivity.class);
            startActivity(i);

        }

        else if (id == R.id.nav_teste2) {
            Intent i = new Intent(this.getApplicationContext(),NovaContaActivity.class);
            startActivity(i);

        }
        else if (id == R.id.nav_teste3) {
            Intent i = new Intent(this.getApplicationContext(),LoginActivity.class);
            startActivity(i);

        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
