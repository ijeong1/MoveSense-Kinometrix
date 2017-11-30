package com.kinometrix.app.api.multi_connection.sensor_usage;


import com.kinometrix.app.api.BasePresenter;
import com.kinometrix.app.api.BaseView;
import com.kinometrix.app.api.model.LinearAcceleration;

import rx.Observable;

public interface MultiSensorUsageContract {

    interface Presenter extends BasePresenter {
        Observable<String> subscribeLinearAcc(String uri);

    }

    interface View extends BaseView<MultiSensorUsageContract.Presenter> {

    }
}
