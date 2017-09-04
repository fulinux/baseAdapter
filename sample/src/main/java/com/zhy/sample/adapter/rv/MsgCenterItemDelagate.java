package com.zhy.sample.adapter.rv;

import com.zhy.adapter.recyclerview.base.ItemViewDelegate;
import com.zhy.adapter.recyclerview.base.ViewHolder;
import com.zhy.sample.R;
import com.zhy.sample.bean.ChatMessage;

/**
 * Created by Administrator on 2017/9/2.
 */

public class MsgCenterItemDelagate implements ItemViewDelegate<ChatMessage> {
    @Override
    public int getItemViewLayoutId()
    {
        return R.layout.main_chat_center_msg;
    }

    @Override
    public boolean isForViewType(ChatMessage item, int position)
    {
        return item.isComMeg();
    }

    @Override
    public int getDelegateAlign() {
        return ChatMessage.MSG_CENTER;
    }

    @Override
    public int getViewAlign(ChatMessage item, int position) {
        return item.getAlign();
    }

    @Override
    public void convert(ViewHolder holder, ChatMessage chatMessage, int position)
    {
        holder.setText(R.id.id_headline, chatMessage.getHeadLine());
        holder.setText(R.id.id_hint, chatMessage.getHint());
    }
}
