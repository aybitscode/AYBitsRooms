package com.aybits.hms.func.room.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum RoomStatus {
    
    NOT_AVAILABLE(-1),
    AVAILABLE(1),
    UNDER_MAINTENANCE(-2),
    UNDER_HOUSEKEEPING(-3),
    BOOKED(2),
    OCCUPIED(3);
    
    @JsonProperty("room_status")
    private final Integer roomStatus;


    RoomStatus(int roomStatus){
        this.roomStatus=roomStatus;
    }

    public int getRoomStatusAsInt() {
        return roomStatus;
    }

    public String getRoomStatusAsString() {
        return String.valueOf(roomStatus);
    }

    public static RoomStatus convertIntToRoomStatus(int iRoomStatus) {
        for (RoomStatus roomStatus : RoomStatus.values()) {
            if (roomStatus.getRoomStatusAsInt() == iRoomStatus) {
                return roomStatus;
            }
        }
        return null;
    }

    public static RoomStatus convertStringToRoomStatus(String inputRoomStatus) {
        for (RoomStatus roomStatus : RoomStatus.values()) {
            if (roomStatus.getRoomStatusAsString().equals(inputRoomStatus)) {
                return roomStatus;
            }
        }
        return null;
    }

    public static int convertRoomStatusToInt(RoomStatus inputRoomStatus) {
        for (RoomStatus roomStatus : RoomStatus.values()) {
            if (roomStatus.getRoomStatusAsInt() == inputRoomStatus.getRoomStatusAsInt()) {
                return roomStatus.getRoomStatusAsInt();
            }
        }
        return -1;
    }

    public static String convertRoomStatusToString(RoomStatus inputRoomStatus) {
        for (RoomStatus roomStatus : RoomStatus.values()) {
            if (roomStatus.getRoomStatusAsInt() == inputRoomStatus.getRoomStatusAsInt()) {
                return roomStatus.getRoomStatusAsString();
            }
        }
        return null;
    }
    
}
