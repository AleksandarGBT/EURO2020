package com.example.euro2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RefereeActivity extends AppCompatActivity {

    private RecyclerView refereeRecView;
    RefereeRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referee);

        adapter = new RefereeRecViewAdapter(this);
        refereeRecView = findViewById(R.id.refereeRecView);

        refereeRecView.setAdapter(adapter);
        refereeRecView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Referee> referees = new ArrayList<>();

        referees.add(new Referee(1,"Felix Brych","03.08.1975","45","Germany","https://upload.wikimedia.org/wikipedia/commons/5/5f/Ser-Swi_%2826%29.jpg"));
        referees.add(new Referee(2,"Cüneyt Çakır","23.11.1976","44","Turkey","https://www.thesun.co.uk/wp-content/uploads/2018/07/NINTCHDBPICT000419738784-e1531346874822.jpg"));
        referees.add(new Referee(3,"Carlos Del Cerro Grande","13.03.1976","45","Spain","https://upload.wikimedia.org/wikipedia/commons/e/e9/2020-03-10_Fu%C3%9Fball%2C_M%C3%A4nner%2C_UEFA_Champions_League_Achtelfinale%2C_RB_Leipzig_-_Tottenham_Hotspur_1DX_3658_by_Stepro.jpg"));
        referees.add(new Referee(4,"Andreas Ekberg","02.01.1985","36","Sweden","https://pbs.twimg.com/media/DMQe4_hVAAMCVEA.jpg"));
        referees.add(new Referee(5,"Orel Grinfeeld","21.08.1981","39","Israel","https://pbs.twimg.com/media/Euvdqm4WQAIzteF.jpg"));
        referees.add(new Referee(6,"Ovidiu Alin Hategan","14.07.1980","41","Romania","https://www.frf.ro/wp-content/uploads/2020/10/ovidiu-alin-hategan-17.07.1980-arad.jpg"));
        referees.add(new Referee(7,"Sergei Karasev","12.06.1979","42","Russia","https://cdni.rt.com/files/2018.04/article/5ad5b058fc7e93523d8b45bf.jpg"));
        referees.add(new Referee(8,"Istvan Kovacs","16.09.1984","36","Romania","https://pbs.twimg.com/media/ElLVAI5XUAEMrQi.jpg"));
        referees.add(new Referee(9,"Bjorn Kuipers","28.03.1973","48","Netherlands","https://en.as.com/en/imagenes/2018/05/07/football/1525688717_657843_1525688796_noticia_normal.jpg"));
        referees.add(new Referee(10,"Danny Makkelie","28.01.1983","38","Netherlands","https://www.telegraaf.nl/images/1200x630/filters:format(jpeg):quality(80)/cdn-kiosk-api.telegraaf.nl/83f26baa-4e6f-11eb-aa4a-02d2fb1aa1d7.jpg"));
        referees.add(new Referee(11,"Antonio Miguel Lahoz","12.03.1977","44","Spain","https://i2-prod.manchestereveningnews.co.uk/sport/article20582912.ece/ALTERNATES/s1200b/0_GettyImages-1304559654.jpg"));
        referees.add(new Referee(12,"Michael Oliver","20.02.1985","36","England","https://cdn.footballtransfertavern.com/wp-content/uploads/2020/01/2020-01-05T154530Z_174930989_RC2R9E9T56OT_RTRMADP_3_SOCCER-ENGLAND-CRY-DRB-REPORT.jpg"));
        referees.add(new Referee(13,"Daniele Orsato","23.11.1975","45","Italy","https://static.toiimg.com/thumb/msid-77661663,width-1200,height-900,resizemode-4/.jpg"));
        referees.add(new Referee(14,"Manuel Artur Dias","14.07.1979","42","Portugal","https://1.bp.blogspot.com/-DJAtsWDXGsc/WJTJvI5kh5I/AAAAAAAAXvM/q3k5y7rN66MRxJZOvNZtIPiRJDKsP1xkgCLcB/w1200-h630-p-k-no-nu/Artur%2BSOares%2Bdias.jpg"));
        referees.add(new Referee(15,"Daniel Siebert","04.05.1984","37","Germany","https://pbs.twimg.com/media/DnnNBWaXgAALy_X.jpg"));
        referees.add(new Referee(16,"Anthony Taylor","20.10.1978","42","England","https://cdn.vitalfootball.co.uk/wp-content/uploads/sites/182/2018/11/2018-09-22T142637Z_259365352_RC1B2D2EA560_RTRMADP_3_SOCCER-ENGLAND-BUR-BOU.jpg"));
        referees.add(new Referee(17,"Clément Turpin","16.05.1982","39","France","https://pbs.twimg.com/media/ClUUf8xWYAAn5LV.jpg"));
        referees.add(new Referee(18,"Slavko Vinčić","25.11.1979","41","Slovenia","https://1.bp.blogspot.com/-A0IpDlJV-EE/XtH89-E6vbI/AAAAAAAASKY/g_hgv9M0_94iWMf0w4POhYte6ImydY2-gCLcBGAsYHQ/s1600/vincic.jpg"));
        referees.add(new Referee(19,"Fernando Rapallini","28.04.1978","43","Argentina","https://worldfootballindex.com/wp-content/uploads/2021/06/Fernando-Rapallini-Euros.jpg"));


        adapter.setReferees(referees);
    }
}