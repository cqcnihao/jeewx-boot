package com.jeecg.p3.cms.entity;

import java.util.Date;
import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>网站管理<br>
 * @author junfeng.zhou
 * @since：2018年09月25日 17时53分26秒 星期二 
 * @version:1.0
 */
public class CmsSite implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 微信公众号
	 */
	private String jwid;
	/**
	 * 长链接
	 */
	private String hdurl;
	/**
	 * 短链接
	 */
	private String shortUrl;
	/**
	 * 项目编码
	 */
	private String projectCode;
	// update-begin--Author:gj_duzy Date:20181113 for：新增站点背景图片属性
	/**
	 * 站点背景图片
	 */
	private String siteBackgroundImg;	
    // update-end--Author:gj_duzy Date:20181113 for：新增站点背景图片属性
	
	//update-begin-author:taoyan date:20181015 for:分享配置
	private String shareFriendTitle;
	private String shareFriendDesc;
	private String shareFriendCircle;
	private String appid;
	//update-end-author:taoyan date:20181015 for:分享配置
	public String getJwid() {
		return jwid;
	}
	public void setJwid(String jwid) {
		this.jwid = jwid;
	}
	public String getHdurl() {
		return hdurl;
	}
	public void setHdurl(String hdurl) {
		this.hdurl = hdurl;
	}
	public String getShortUrl() {
		return shortUrl;
	}
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public String getShareFriendTitle() {
		return shareFriendTitle;
	}
	public void setShareFriendTitle(String shareFriendTitle) {
		this.shareFriendTitle = shareFriendTitle;
	}
	public String getShareFriendDesc() {
		return shareFriendDesc;
	}
	public void setShareFriendDesc(String shareFriendDesc) {
		this.shareFriendDesc = shareFriendDesc;
	}
	public String getShareFriendCircle() {
		return shareFriendCircle;
	}
	public void setShareFriendCircle(String shareFriendCircle) {
		this.shareFriendCircle = shareFriendCircle;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getSiteBackgroundImg() {
		return siteBackgroundImg;
	}
	public void setSiteBackgroundImg(String siteBackgroundImg) {
		this.siteBackgroundImg = siteBackgroundImg;
	}
	
	
}
