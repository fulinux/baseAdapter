package com.zhy.sample.bean;

import com.zhy.sample.R;

import java.util.ArrayList;
import java.util.List;

public class ChatMessage
{
	private String mHeadLine;
	private String mHint;
	private int icon;
	private String name;
	private String content;
	private String createDate;
	private boolean isComMeg;
	private int mAlign;

	public final static int MSG_LEFT = 0;
	public final static int MSG_RIGHT = 1;
	public final static int MSG_CENTER = 2;

	public ChatMessage(int align, String headLine, String hint)
	{
		this.mAlign = align;
		this.mHeadLine = headLine;
		this.mHint = hint;
	}

	public ChatMessage(int icon, String name, String content,
			String createDate, boolean isComMeg)
	{
		this.icon = icon;
		this.name = name;
		this.content = content;
		this.createDate = createDate;
		this.isComMeg = isComMeg;
	}

	public ChatMessage(int align, int icon, String name, String content,
					   String createDate)
	{
		this.icon = icon;
		this.name = name;
		this.content = content;
		this.createDate = createDate;
		this.mAlign = align;
	}

	public boolean isComMeg()
	{
		return isComMeg;
	}

	public void setComMeg(boolean isComMeg)
	{
		this.isComMeg = isComMeg;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public int getIcon()
	{
		return icon;
	}

	public void setIcon(int icon)
	{
		this.icon = icon;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCreateDate()
	{
		return createDate;
	}

	public void setCreateDate(String createDate)
	{
		this.createDate = createDate;
	}

	public int getAlign() {
		return mAlign;
	}

	public void setAlign(int align) {
		mAlign = align;
	}

	public String getHeadLine() {
		return mHeadLine;
	}

	public void setHeadLine(String headLine) {
		mHeadLine = headLine;
	}

	public String getHint() {
		return mHint;
	}

	public void setHint(String hint) {
		mHint = hint;
	}

	@Override
	public String toString()
	{
		return "ChatMessage [icon=" + icon + ", name=" + name + ", content="
				+ content + ", createDate=" + createDate +", isComing = "+ isComMeg()+ "]";
	}

	public static List<ChatMessage> MOCK_DATAS = new ArrayList<>();

	static {
		ChatMessage msg = null;
		msg = new ChatMessage(MSG_LEFT, R.drawable.xiaohei, "xiaohei", "where are you ",
				null);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(MSG_RIGHT, R.drawable.renma, "renma", "where are you ",
				null);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(MSG_LEFT, R.drawable.xiaohei, "xiaohei", "where are you ",
				null);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(MSG_RIGHT, R.drawable.renma, "renma", "where are you ",
				null);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(MSG_LEFT, R.drawable.xiaohei, "xiaohei", "where are you ",
				null);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(MSG_RIGHT, R.drawable.xiaohei, "xiaohei", "where are you ",
				null);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(MSG_LEFT, R.drawable.renma, "renma", "where are you ",
				null);
		MOCK_DATAS.add(msg);
	}


}
