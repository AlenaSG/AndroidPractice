package com.alena.beginnertutorials;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;


public class GraphActivity extends AppCompatActivity {

    private static final String TAG = "GraphActivity";

    private LineGraphSeries<DataPoint> series1, series2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        double x, y;
        x = 0;

        GraphView graph = (GraphView) findViewById(R.id.graph);
        series1 = new LineGraphSeries<>();
        series2 = new LineGraphSeries<>();

        int numDataPoints = 500;
        for(int i = 0; i < numDataPoints; i++){
            x = x + 0.1;
            y = Math.sin(x);
            double y2 = Math.cos(x);
            series1.appendData(new DataPoint(x,y), true, 60);
            series2.appendData(new DataPoint(x, y2), true, 60);
        }

        series1.setColor(Color.RED);
        series2.setColor(Color.BLUE);
        graph.addSeries(series1);
        graph.addSeries(series2);
    }
}
