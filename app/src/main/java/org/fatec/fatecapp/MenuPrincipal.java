package org.fatec.fatecapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MenuPrincipal extends AppCompatActivity
{
    Button botao_secretaria;
    Button botao_biblioteca;
    Button botao_suporteDTI;

    Button botao_cursos;

    Button botao_vestibular;

    Button botao_calendario;
    Button botao_transferencia;
    Button botao_estagio;
    Button botao_monitoria;

    Button botao_siga;
    Button botao_contato;
    Button botao_suporteMSDNAA;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        botao_secretaria = (Button) findViewById(R.id.botaoSecretaria);
        botao_secretaria.setOnClickListener(new View.OnClickListener()
        {
           @Override
           public void onClick(View v)
           {
               Intent webviewIntent = new Intent(MenuPrincipal.this, WebViewActivity.class);
               webviewIntent.putExtra("URL", "http://www.fateczl.edu.br/secretaria.html");
               startActivity(webviewIntent);
           }
        });

        botao_biblioteca = (Button) findViewById(R.id.botaoBiblioteca);
        botao_biblioteca.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent webviewIntent = new Intent(MenuPrincipal.this, WebViewActivity.class);
                webviewIntent.putExtra("URL", "http://www.fateczl.edu.br/biblioteca.html");
                startActivity(webviewIntent);
            }
        });

        botao_suporteDTI = (Button) findViewById(R.id.botaoSuporteDTI);
        botao_suporteDTI.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent webviewIntent = new Intent(MenuPrincipal.this, WebViewActivity.class);
                webviewIntent.putExtra("URL", "http://www.fateczl.edu.br/suporte.html");
                startActivity(webviewIntent);
            }
        });

        botao_cursos = (Button) findViewById(R.id.botaoCursos);
        botao_cursos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent webviewIntent = new Intent(MenuPrincipal.this, WebViewActivity.class);
                webviewIntent.putExtra("URL", "http://www.fateczl.edu.br/cursos.html");
                startActivity(webviewIntent);
            }
        });

        botao_vestibular = (Button) findViewById(R.id.botaoVestibular);
        botao_vestibular.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent webviewIntent = new Intent(MenuPrincipal.this, WebViewActivity.class);
                webviewIntent.putExtra("URL", "http://www.vestibularfatec.com.br/home/");
                startActivity(webviewIntent);
            }
        });

        botao_calendario = (Button) findViewById(R.id.botaoCalendario);
        botao_calendario.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent webviewIntent = new Intent(MenuPrincipal.this, WebViewActivity.class);
                webviewIntent.putExtra("URL", "http://www.fateczl.edu.br/calendario.html");
                startActivity(webviewIntent);
            }
        });

        botao_transferencia = (Button) findViewById(R.id.botaoTransferencia);
        botao_transferencia.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent webviewIntent = new Intent(MenuPrincipal.this, WebViewActivity.class);
                webviewIntent.putExtra("URL", "http://www.fateczl.edu.br/transferencia.html");
                startActivity(webviewIntent);
            }
        });

        botao_estagio = (Button) findViewById(R.id.botaoEstagio);
        botao_estagio.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent webviewIntent = new Intent(MenuPrincipal.this, WebViewActivity.class);
                webviewIntent.putExtra("URL", "http://www.fateczl.edu.br/estagio.html");
                startActivity(webviewIntent);
            }
        });

        botao_monitoria = (Button) findViewById(R.id.botaoMonitoria);
        botao_monitoria.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent webviewIntent = new Intent(MenuPrincipal.this, WebViewActivity.class);
                webviewIntent.putExtra("URL", "http://www.fateczl.edu.br/monitoria.html");
                startActivity(webviewIntent);
            }
        });

        botao_siga = (Button) findViewById(R.id.botaoSIGA);
        botao_siga.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent webviewIntent = new Intent(MenuPrincipal.this, WebViewActivity.class);
                webviewIntent.putExtra("URL", "https://siga.cps.sp.gov.br/aluno/login.aspx");
                startActivity(webviewIntent);
            }
        });

        botao_contato = (Button) findViewById(R.id.botaoContato);
        botao_contato.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent webviewIntent = new Intent(MenuPrincipal.this, WebViewActivity.class);
                webviewIntent.putExtra("URL", "http://www.fateczl.edu.br/contato.html");
                startActivity(webviewIntent);
            }
        });

        botao_suporteMSDNAA = (Button) findViewById(R.id.botaoSuporteMSDNAA);
        botao_suporteMSDNAA.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent webviewIntent = new Intent(MenuPrincipal.this, WebViewActivity.class);
                webviewIntent.putExtra("URL", "http://www.fateczl.edu.br/suporte_msdnaa.html");
                startActivity(webviewIntent);
            }
        });
    }
}
