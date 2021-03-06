package com.mobile.av.geotask.helper;

import com.google.android.gms.maps.model.LatLng;
import com.mobile.av.geotask.model.Item;
import com.mobile.av.geotask.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Anand on 4/9/2015.
 */
/*
    DELETE THIS CLASS AND PACKAGE
 */
public class InitialData {

    public static List<Task> initTask() {
        List<Task> taskList = new ArrayList<>();
        Task task;
        ArrayList<LatLng> latLngs;

        for (int i = 0; i < 10; i++) {
            task = new Task();

            task.setTitle("Title " + i);

            ArrayList<Item> items = new ArrayList<>();
            Item item;
            int status = 1;
            for (int j = 0; j < 3; j++) {
                item = new Item();
                item.setName("Item " + i + " : " + j);
                status = status == 0 ? 1 : 0;
                item.setStatus(status);
                items.add(item);
            }
            task.setItems(items);

            task.setRange(1000 + new Random().nextInt(1000));

            latLngs = new ArrayList<>();
            LatLng latLng = new LatLng(33.790938, -118.136762);
            latLngs.add(latLng);
            task.setLocation(latLngs);

            taskList.add(task);
        }

        return taskList;
    }
}
