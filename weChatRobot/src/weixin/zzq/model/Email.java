package weixin.zzq.model;

import java.util.Date;

public class Email {
	private Integer id;// ����
	private String youremail;// ���ͷ�email
	private String formemail;// ���շ�eamil
	private String message;// ��������
	private String beizhu;// ��ע
	private String dingshi;// ��ʱ
	private Date   createTime;// ��ʱ
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getYouremail() {
		return youremail;
	}
	public void setYouremail(String youremail) {
		this.youremail = youremail;
	}
	public String getFormemail() {
		return formemail;
	}
	public void setFormemail(String formemail) {
		this.formemail = formemail;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	public String getDingshi() {
		return dingshi;
	}
	public void setDingshi(String dingshi) {
		this.dingshi = dingshi;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}