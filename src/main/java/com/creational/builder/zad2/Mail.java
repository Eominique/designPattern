package com.creational.builder.zad2;

import java.time.LocalDateTime;

public class Mail {
    private String content;
    private String sender;
    private LocalDateTime dateStart;
    private LocalDateTime dateFinish;
    private String ipStart;
    private String ipFinish;
    private String nameServerDirect ;
    private String nameInbox;
    private String record;
    private InfoType infoType;
    private boolean isEncode;
    private boolean isSpam;


    public Mail(String content, String sender, LocalDateTime dateStart, LocalDateTime dateFinish, String ipStart, String ipFinish, String nameServerDirect, String nameInbox, String record, InfoType infoType, boolean isEncode, boolean isSpam) {
        this.content = content;
        this.sender = sender;
        this.dateStart = dateStart;
        this.dateFinish = dateFinish;
        this.ipStart = ipStart;
        this.ipFinish = ipFinish;
        this.nameServerDirect = nameServerDirect;
        this.nameInbox = nameInbox;
        this.record = record;
        this.infoType = infoType;
        this.isEncode = isEncode;
        this.isSpam = isSpam;
    }

    public void setDateFinish(LocalDateTime dateFinish) {
        this.dateFinish = dateFinish;
    }

    static class Builder{
       private String content;
       private String sender;
       private LocalDateTime dateStart;
       private LocalDateTime dateFinish;
       private String ipStart;
       private String ipFinish;
       private String nameServerDirect ;
       private String nameInbox;
       private String record;
       private InfoType infoType;
       private boolean isEncode;
       private boolean isSpam;

       public Builder setContent(String content) {
           this.content = content;
           return this;
       }

       public Builder setSender(String sender) {
           this.sender = sender;
           return this;
       }

       public Builder setDateStart(LocalDateTime dateStart) {
           this.dateStart = dateStart;
           return this;
       }

       public Builder setDateFinish(LocalDateTime dateFinish) {
           this.dateFinish = dateFinish;
           return this;
       }

       public Builder setIpStart(String ipStart) {
           this.ipStart = ipStart;
           return this;
       }

       public Builder setIpFinish(String ipFinish) {
           this.ipFinish = ipFinish;
           return this;
       }

       public Builder setNameServerDirect(String nameServerDirect) {
           this.nameServerDirect = nameServerDirect;
           return this;
       }

       public Builder setNameInbox(String nameInbox) {
           this.nameInbox = nameInbox;
           return this;
       }

       public Builder setRecord(String record) {
           this.record = record;
           return this;
       }

       public Builder setInfoType(InfoType infoType) {
           this.infoType = infoType;
           return this;
       }

       public Builder setEncode(boolean encode) {
           isEncode = encode;
           return this;
       }

       public Builder setSpam(boolean spam) {
           isSpam = spam;
           return this;
       }

       public Mail createMail(){
       return new Mail(content, sender, dateStart, dateFinish, ipStart, ipFinish, nameServerDirect, nameInbox, record, infoType, isEncode, isSpam);
       }

   }

    @Override
    public String toString() {
        return "Mail{" +
                "content='" + content + '\'' +
                ", sender='" + sender + '\'' +
                ", dateStart=" + dateStart +
                ", dateFinish=" + dateFinish +
                ", ipStart='" + ipStart + '\'' +
                ", ipFinish='" + ipFinish + '\'' +
                ", nameServerDirect='" + nameServerDirect + '\'' +
                ", nameInbox='" + nameInbox + '\'' +
                ", record='" + record + '\'' +
                ", infoType=" + infoType +
                ", isEncode=" + isEncode +
                ", isSpam=" + isSpam +
                '}';
    }
}
