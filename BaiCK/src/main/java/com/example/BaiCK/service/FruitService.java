package com.example.BaiCK.service;


import com.example.BaiCK.rest.request.FruitReq;
import com.example.BaiCK.rest.response.FruitRes;

import java.util.List;

public interface FruitService {

    List<FruitRes> getAllFruit();

    FruitRes getFruit(long id);
    FruitRes createFruit(FruitReq fruitReq);

    FruitRes updateFruit(FruitReq fruitReq);

    void deleteFruit(long id);
}
