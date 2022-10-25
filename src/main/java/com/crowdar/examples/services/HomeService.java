package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;


public class HomeService {
    public static void clickEntryAdd(){
       MobileActionManager.click(HomeConstants.ADD_TIME);
    }
    public static void clickMenuFechas(){
        MobileActionManager.click(HomeConstants.MENU_FECHAS);
    }
}
