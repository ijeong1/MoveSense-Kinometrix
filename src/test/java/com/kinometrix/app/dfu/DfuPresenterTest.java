package com.kinometrix.app.dfu;

import com.movesense.mds.MdsResponseListener;
import com.kinometrix.app.ScannerFragment;
import com.kinometrix.app.api.dfu.DfuContract;
import com.kinometrix.app.api.dfu.DfuPresenter;
import com.polidea.rxandroidble.RxBleDevice;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * TODO: Add a class header comment!
 */

public class DfuPresenterTest {

    @Mock
    DfuPresenter presenter;

    @Mock
    DfuContract.View view;

    @Mock
    ScannerFragment.DeviceSelectionListener deviceSelectionListener;


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);


    }

    @Test
    public void shouldEnableScanView() {


    }

    @Test
    public void shouldGetSelectedDevice() {

    }

    @Test
    public void shouldEnableDfuMode() {

    }

    @Test
    public void shouldGetSelectedFile() {

    }
}
