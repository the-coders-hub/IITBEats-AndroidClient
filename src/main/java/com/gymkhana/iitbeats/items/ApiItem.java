package com.gymkhana.iitbeats.items;

import android.content.Context;

import com.gymkhana.iitbeats.api.ServerUrls;
import com.gymkhana.iitbeats.utils.DataType;
import com.gymkhana.iitbeats.utils.Filenames;

import java.io.Serializable;

/**
 * Created by BijoySingh on 9/12/2015.
 */
public class ApiItem implements Serializable {
    public String url, filename;
    public Context context;
    public Integer data_type;

    public ApiItem() {
        ;
    }

    public ApiItem(Context context, String url, String filename, Integer data_type) {
        this.context = context;
        this.url = url;
        this.filename = filename;
        this.data_type = data_type;
    }

    public static final ApiItem getInstance(Context context, Integer data_type, Integer extra) {
        if (data_type == DataType.MENU) {
            return new ApiItem(context,
                    ServerUrls.getMenu(extra),
                    Filenames.getFilename(Filenames.MENU, extra),
                    data_type);
        } else if (data_type == DataType.BILLS) {
            return new ApiItem(context,
                    ServerUrls.getBillings(),
                    Filenames.getFilename(Filenames.BILLS),
                    data_type);
        } else if (data_type == DataType.ORDERS) {
            return new ApiItem(context,
                    ServerUrls.getOrders(),
                    Filenames.getFilename(Filenames.ORDERS),
                    data_type);
        } else if (data_type == DataType.SHOPS) {
            return new ApiItem(context,
                    ServerUrls.getShops(),
                    Filenames.getFilename(Filenames.SHOPS),
                    data_type);
        } else if (data_type == DataType.CATEGORY) {
            return new ApiItem(context,
                    ServerUrls.getMenu(extra),
                    Filenames.getFilename(Filenames.MENU),
                    data_type);
        }
        return null;
    }
}
