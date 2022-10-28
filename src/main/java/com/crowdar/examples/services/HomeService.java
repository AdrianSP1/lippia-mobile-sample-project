package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;

import java.util.Objects;


public class HomeService {
    public static void clickEntryAdd(){
       MobileActionManager.click(HomeConstants.ADD_TIME);
    }
    public static void clickMenuFechas(){
        MobileActionManager.click(HomeConstants.MENU_FECHAS);
    }

    public static void inputHoraInicio(String S_Hora){
        String Hora = MobileActionManager.getText(HomeConstants.HOUR_START_ENTRY);
        while(!Objects.equals(Hora, S_Hora)){
            MobileActionManager.click(HomeConstants.HOUR_START_NEXT);
            Hora= MobileActionManager.getText(HomeConstants.HOUR_START_NEXT);
        }
    }

    public static void clickHoraFin(){
        MobileActionManager.click(HomeConstants.SELECT_END);
    }

    public static void inputHoraFin(String E_Hora ){
        String HoraF= MobileActionManager.getText(HomeConstants.HOUR_END_ENTRY);
        while(!Objects.equals(HoraF, E_Hora)){
            MobileActionManager.click(HomeConstants.HOUR_END_NEXT);
            HoraF=MobileActionManager.getText(HomeConstants.HOUR_END_NEXT);
        }


    }
}
