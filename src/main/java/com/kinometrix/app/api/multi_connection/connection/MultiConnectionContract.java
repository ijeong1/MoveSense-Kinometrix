package com.kinometrix.app.api.multi_connection.connection;

import com.kinometrix.app.api.BasePresenter;
import com.kinometrix.app.api.BaseView;
import com.polidea.rxandroidble.RxBleDevice;

public interface MultiConnectionContract {

    interface Presenter extends BasePresenter {
        void scanFirstDevice();
        void scanSecondDevice();
        void connect(RxBleDevice rxBleDevice);
        void disconnect(RxBleDevice rxBleDevice);

    }

    interface View extends BaseView<MultiConnectionContract.Presenter> {
        void onFirsDeviceSelectedResult(RxBleDevice rxBleDevice);
        void onSecondDeviceSelectedResult(RxBleDevice rxBleDevice);
        void displayErrorMessage(String message);
    }
}
