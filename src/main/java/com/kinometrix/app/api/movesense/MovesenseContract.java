package com.kinometrix.app.api.movesense;


import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.kinometrix.app.api.BasePresenter;
import com.kinometrix.app.api.BaseView;
import com.polidea.rxandroidble.RxBleDevice;

import java.util.List;

public interface MovesenseContract {

    interface Presenter extends BasePresenter {
        void startScanning();
        void stopScanning();
        void onBluetoothResult(int requestCode, int resultCode, Intent data);
        void connect(RxBleDevice rxBleDevice, Activity context);
    }

    interface View extends BaseView<Presenter> {
        void displayScanResult(RxBleDevice bluetoothDevice, int rssi);
        void displayErrorMessage(String message);
        void registerReceiver(BroadcastReceiver broadcastReceiver);
        void unregisterReceiver(BroadcastReceiver broadcastReceiver);

        boolean checkLocationPermissionIsGranted();
    }
}
