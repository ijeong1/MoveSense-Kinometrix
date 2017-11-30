package com.kinometrix.app.api.multi_connection.sensor_usage;


import com.kinometrix.app.MdsRx;
import com.kinometrix.app.api.model.LinearAcceleration;

import rx.Observable;

public class MultiSensorUsagePresenter implements MultiSensorUsageContract.Presenter {

    private final MultiSensorUsageContract.View mView;

    public MultiSensorUsagePresenter(MultiSensorUsageContract.View view) {
        mView = view;
        mView.setPresenter(this);
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public Observable<String> subscribeLinearAcc(String uri) {
        return MdsRx.Instance.subscribe(uri);

    }
}
