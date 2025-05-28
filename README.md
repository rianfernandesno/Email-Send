A Simple Project Using the SendGrid API
# 🛠 TOOLS

    Spring

    Spring Boot

    Spring Web

    SendGrid (dependency)


# 📩 Email Controller Endpoint
```bash
POST http://localhost:8080/emails
```
This endpoint handles a POST request to send an email using SendGrid

The DTO:
```text
   "fromEmail":fromEmail;
   "fromName":fromName;
   "replyTo":replyTo;
   "to":to;
   "subject":subject;
   "body":body;
   "contentType":contentType;
```


