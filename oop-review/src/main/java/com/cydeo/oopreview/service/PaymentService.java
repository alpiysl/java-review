package com.cydeo.oopreview.service;


import com.cydeo.oopreview.model.payment.AuthRequest;
import com.cydeo.oopreview.model.payment.PaymentResponse;

public interface PaymentService {
    PaymentResponse auth(AuthRequest authRequest);

    PaymentResponse auth3D(AuthRequest auth3DRequest);
}
