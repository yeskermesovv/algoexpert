package com.company;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        String houseFields = "KATO,C,254,0|HOUSE_ID,N,20,0|HOUSE_NUMB,C,254,0|KATO_FN_RU,C,254,0|" +
                "KATO_FN_KK,C,254,0|ADDRESS_RU,C,254,0|ADDRESS_KK,C,254,0|STREET2_ID,N,20,0|STREET2_TY,N,20,0|" +
                "HOUSE_TYPE,N,20,0|HOUSE_SITU,N,20,0|HOUSE_BUIL,N,20,0|HOUSE_INPU,N,20,0|HOUSE_LEAV,N,20,0|" +
                "HOUSE_CATE,N,20,0|HOUSE_WALL,N,20,0|ACTUAL_SOU,N,20,0|FULL_SQUAR,N,20,0|ACCO_1,C,1,0|ACCO_2,C,1,0|" +
                "ACCO_3,C,1,0|ACCO_4,C,1,0|ACCO_5,C,1,0|ACCO_6,C,1,0|ACCO_7,C,1,0|ACCO_8,C,1,0|ACCO_9,C,1,0|" +
                "ACCO_10,C,1,0|ACCO_11,C,1,0|ACCO_12,C,1,0|ACCO_13,C,1,0|ACCO_14,C,1,0|ACCO_15,C,1,0|ACCO_16,C,1,0|" +
                "ACCO_17,C,1,0|ACCO_18,C,1,0|ACCO_19,C,1,0|ACCO_20,C,1,0|ACCO_21,C,1,0|ACCO_22,C,1,0|ACCO_23,C,1,0|" +
                "ACCO_24,C,1,0|ACCO_25,C,1,0|ACCO_26,C,1,0|ACCO_27,C,1,0|ACCO_28,C,1,0|KADASTR_NU,C,254,0|" +
                "INFABITED_,N,20,0|UNINHABITE,N,20,0|RESIDENT_N,N,20,0|HOUSEHOLD,N,20,0|FLOOR_NUMB,N,20,0|" +
                "LIFT_NUMBE,N,20,0|FLATS,N,20,0|KR_DATE,D,8,0|LEAVE_DATE,D,8,0|COST,N,20,0|COST_DATE,D,8,0|" +
                "INPUT_DATE,D,8,0|REFRESH_DA,D,8,0|ACTUA_DATE,D,8,0|ACTUA_BASI,C,254,0|CEILING_HE,N,20,0|" +
                "USERNAME,C,254,0|AR,C,25,0|FULL_SQ_GB,N,20,0|LIV_SQ_GB,N,20,0|IDON,C,254,0";

        String flatFields = "KATO,C,120,0|HOUSE_ID,N,20,0|CADASTRALN,C,254,0|NUM,C,254,0|" +
                "FULL_SQUAR,N,20,0|LIVING_SQU,N,20,0|QUAN_ROOM,N,20,0|QUAN_HHOL,N,20,0|QUAN_HABI,N,20,0|DATEOFRETI,D,8,0|" +
                "ACTUL_DATE,D,8,0|ACTUAL_BAS,C,254,0|ACTUAL_ID,N,20,0|FLAT_CAUSE,N,20,0|FLAT_OWNER,N,20,0|" +
                "FLAT_SITUA,N,20,0|FLAT_TYPE,N,20,0|FLAT_INPUT,N,20,0|FLAT_ID,N,20,0|LEVEL_NUMB,N,20,0|TRANSA_SUM,N,20,0|" +
                "TRANSA_DAT,D,8,0|TAX_COST,N,20,0|TAX_ESTIMA,D,8,0|USERNAME,C,254,0|PRAVOOBLAD,C,254,0|AR,C,25,0|CODE,C,254,0|SEX,C,254,0|IDON,C,20,0|" +
                "FULL_SQ_GB,N,20,0|LIV_SQ_GB,N,20,0|OWNER_TYPE,C,254,0";

        String[] arr = houseFields.split("\\|");
        System.out.println("arr.length = " + arr.length);

        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            String[] temp = s.split(",");

            //list.add("\"" + temp[0].toLowerCase() + "\"");
            list.add("\"" + temp[0].toLowerCase() + "\"");
        }

        System.out.println(list);

        //print(list);
    }

    public static void print(List<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            /*
            * {
                    name: 'KATO',
                    code: 'VA'
                },
            * */
            System.out.printf("{                \n");
            System.out.printf("     name: '%s',\n", arr.get(i).toUpperCase());
            System.out.printf("     code: '%s'   \n", arr.get(i));
            System.out.printf("},                \n");
        }
    }

    //{ boxLabel: 'HOUSE_ID', name: 'house_id', inputValue: 'house_id' },
}