package by.hotelreservation.service.documentservice.impl;

import by.hotelreservation.bean.DocumentObject;
import by.hotelreservation.bean.RoomType;
import by.hotelreservation.documentbuilder.DocumentBuilder;
import by.hotelreservation.documentbuilder.impl.RoomTypeDocumentBuilder;
import by.hotelreservation.service.documentservice.DocumentBuilderService;
import by.hotelreservation.service.exception.ServiceException;
import by.hotelreservation.service.impl.RoomTypeServiceImpl;

import java.util.Map;

public class RoomTypeDocumentBuilderService implements DocumentBuilderService{
    @Override
    public DocumentObject buildDocument(Map<String, String[]> documentInfo) throws ServiceException {
        RoomType roomType = new RoomTypeServiceImpl().getEntity(Integer.parseInt(documentInfo.get("id")[0]));
        if(roomType != null) {
            DocumentBuilder roomTypeDocumentBuilder = RoomTypeDocumentBuilder.getInstance();
            return roomTypeDocumentBuilder.buildDocument(roomType);
        }
        return null;
    }
}