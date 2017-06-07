package com.mobile.jsn.rest;

import com.mobile.jsn.entidade.SecurityDto;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by ADMINIBM on 01/06/2017.
 */

public interface RequestRetrofitInterface {



    //Call<JSONResponse> getJSON();

    public void getSecurity (Callback<List<SecurityDto>> response );

}
