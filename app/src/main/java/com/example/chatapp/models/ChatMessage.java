package com.example.chatapp.models;

import java.util.Date;

public class ChatMessage {
      String senderId, receiverId, message, dateTime;
      Date dateObject;

     public String getSenderId() {
          return senderId;
     }

     public void setSenderId(String senderId) {
          this.senderId = senderId;
     }

     public String getReceiverId() {
          return receiverId;
     }

     public void setReceiverId(String receiverId) {
          this.receiverId = receiverId;
     }

     public String getMessage() {
          return message;
     }

     public void setMessage(String message) {
          this.message = message;
     }

     public String getDateTime() {
          return dateTime;
     }

     public void setDateTime(String dateTime) {
          this.dateTime = dateTime;
     }

     public Date getDateObject() {
          return dateObject;
     }

     public void setDateObject(Date dateObject) {
          this.dateObject = dateObject;
     }
}
