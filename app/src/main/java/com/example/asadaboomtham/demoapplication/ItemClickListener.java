package com.example.asadaboomtham.demoapplication;

import android.view.View;

/**
 * Created by reale on 5/5/2017.
 */

//กำหนดการทำงานของmethod
public interface ItemClickListener {
    void onClick(View view, int position, boolean isLongClick);
}
