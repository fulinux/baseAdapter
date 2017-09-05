package com.zhy.sample.adapter.rv;

import com.zhy.adapter.recyclerview.base.ItemViewDelegate;
import com.zhy.adapter.recyclerview.base.ViewHolder;
import com.zhy.sample.R;
import com.zhy.sample.bean.ChatMessage;

/**
 * Created by Administrator on 2017/9/4.
 */

public class MsgWeatherItemDelagate implements ItemViewDelegate<ChatMessage> {
    @Override
    public int getItemViewLayoutId()
    {
        return R.layout.main_weathers_msg;
    }

    @Override
    public boolean isForViewType(ChatMessage item, int position)
    {
        return !item.isComMeg();
    }

    @Override
    public int getDelegateAlign() {
        return ChatMessage.MSG_WEATHER;
    }

    @Override
    public int getViewAlign(ChatMessage item, int position) {
        return item.getAlign();
    }

    @Override
    public void convert(ViewHolder holder, ChatMessage chatMessage, int position)
    {
        holder.setImageResource(R.id.id_image_weather, chatMessage.getIcon());
        holder.setText(R.id.id_text_date, chatMessage.getDate());
        holder.setText(R.id.id_text_weather, chatMessage.getWeather());
        holder.setText(R.id.id_text_temp, chatMessage.getTemp());
    }
}
