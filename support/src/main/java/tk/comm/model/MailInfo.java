package tk.comm.model;

import java.io.File;
import java.util.Date;

/**
 * @author zhou
 * @version V1.0
 * @Description:
 * @date 2016/8/24 15:52
 * @jdk v1.7
 * @tomcat v7.0
 */
public class MailInfo {
    private String[] to;
    private String[] cc;
    private String[] bcc;
    private String subject;
    private String content;
    private File[] attachments;
    private Date createTime=new Date();

    public File[] getAttachments() {
        return attachments;
    }

    public void setAttachments(File[] attachments) {
        this.attachments = attachments;
    }

    public String[] getTo() {
        return to;
    }

    public void setTo(String[] to) {
        this.to = to;
    }

    public String[] getCc() {
        return cc;
    }

    public void setCc(String[] cc) {
        this.cc = cc;
    }

    public String[] getBcc() {
        return bcc;
    }

    public void setBcc(String[] bcc) {
        this.bcc = bcc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

}
