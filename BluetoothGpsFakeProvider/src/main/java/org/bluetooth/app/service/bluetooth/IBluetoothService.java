package org.bluetooth.app.service.bluetooth;

import org.bluetooth.app.dto.PositionDto;

/**
 * Created on 04.07.13.
 */
public interface IBluetoothService {


    public final static int STATUS_TURNED_OFF = 0;
    public final static int STATUS_WAITING_FOR_CONNECTION = 1;
    public final static int STATUS_CONNECTED_WITH_CLIENT = 2;
    public final static int STATUS_TRANSMITTING = 3;
    public final static int STATUS_DISCONNECTED = -1;

    int getServiceStatus();

    void updatePosition(PositionDto position, int sateliteNumber, double precision);

    void startBluetoothListener();

    void stopBluetoothListener();

    void addErrorListener(IBluetoothServiceErrorListener listener);

}
